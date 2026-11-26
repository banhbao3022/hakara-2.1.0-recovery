import type { FastifyInstance } from 'fastify'
import { prisma } from '../lib/prisma.js'
import { item, list } from '../http/envelope.js'
import { pagination, params, str } from '../http/params.js'
import { forbidden, notFound } from '../http/errors.js'
import { requireUser } from '../plugins/auth.js'
import { serializeNotification } from '../serializers/index.js'
import { viewerContext } from '../lib/viewer.js'
import { bumpUser } from '../lib/counters.js'

interface IdParam {
  id: string
}

export async function notificationRoutes(app: FastifyInstance): Promise<void> {
  app.get('/v1/notifications', async (req) => {
    const viewer = requireUser(req)
    const { skip, take } = pagination(params(req))

    const rows = await prisma.notification.findMany({
      where: { userId: viewer.id },
      include: { sender: true },
      orderBy: { id: 'desc' },
      skip,
      take,
    })

    const ctx = await viewerContext(viewer, {
      userIds: rows.map((r) => r.senderId).filter((id): id is number => id !== null),
    })

    return list(rows.map((r) => serializeNotification(r, ctx)))
  })

  /** POST /v1/notifications/markAsRead/{id} — read_os / read_section are telemetry. */
  app.post<{ Params: IdParam }>('/v1/notifications/markAsRead/:id', async (req) => {
    const viewer = requireUser(req)
    const id = Number.parseInt(req.params.id, 10)
    const p = params(req)

    const existing = await prisma.notification.findUnique({ where: { id } })
    if (!existing) throw notFound(`No notification with id ${id}`)
    if (existing.userId !== viewer.id) throw forbidden('That notification belongs to another user')

    const row = await prisma.$transaction(async (tx) => {
      const updated = await tx.notification.update({
        where: { id },
        data: {
          isRead: 1,
          readOs: str(p, 'read_os') ?? existing.readOs,
          readSection: str(p, 'read_section') ?? existing.readSection,
        },
        include: { sender: true },
      })

      // The unread badge only moves on the transition, so a repeat call is a no-op.
      if (existing.isRead === 0) await bumpUser(tx, viewer.id, { notificationCount: -1 })

      return updated
    })

    const ctx = await viewerContext(viewer, { userIds: row.senderId ? [row.senderId] : [] })
    return item(serializeNotification(row, ctx))
  })

  app.delete<{ Params: IdParam }>('/v1/notifications/:id', async (req, reply) => {
    const viewer = requireUser(req)
    const id = Number.parseInt(req.params.id, 10)

    const existing = await prisma.notification.findUnique({ where: { id } })
    if (!existing) throw notFound(`No notification with id ${id}`)
    if (existing.userId !== viewer.id) throw forbidden('That notification belongs to another user')

    await prisma.$transaction(async (tx) => {
      await tx.notification.delete({ where: { id } })
      if (existing.isRead === 0) await bumpUser(tx, viewer.id, { notificationCount: -1 })
    })

    return reply.status(204).send()
  })
}
