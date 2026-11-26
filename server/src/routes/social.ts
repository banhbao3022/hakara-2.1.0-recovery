import type { FastifyInstance } from 'fastify'
import { prisma } from '../lib/prisma.js'
import { item, list, ok } from '../http/envelope.js'
import { int, intOr, pagination, params, reqStr, str } from '../http/params.js'
import { forbidden, notFound, unprocessable } from '../http/errors.js'
import { requireUser } from '../plugins/auth.js'
import { serializeComment } from '../serializers/index.js'
import { viewerContext } from '../lib/viewer.js'
import { bumpComment, bumpLikeTarget, bumpRecording } from '../lib/counters.js'
import { targetType, type TargetType } from '../lib/polymorphic.js'
import { NOTIFICATION_TYPES, notify } from '../lib/notifications.js'

interface IdParam {
  id: string
}

/** Resolve the owner of a like/comment target so the right person is notified. */
async function targetOwner(type: TargetType, id: number): Promise<number | null> {
  if (type === 'recording') {
    const row = await prisma.recording.findUnique({ where: { id }, select: { userId: true } })
    return row?.userId ?? null
  }
  const row = await prisma.comment.findUnique({ where: { id }, select: { userId: true } })
  return row?.userId ?? null
}

export async function socialRoutes(app: FastifyInstance): Promise<void> {
  /**
   * GET /v1/comments — top-level comments when parent_id is absent, replies when
   * it is present. The client paginates both through this one route.
   */
  app.get('/v1/comments', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p)
    const contentId = int(p, 'commentable_id')
    if (!contentId) throw unprocessable("Missing required parameter 'commentable_id'")
    const contentType = targetType(str(p, 'commentable_type'))
    const parentId = intOr(p, 'parent_id', 0)

    const rows = await prisma.comment.findMany({
      where: { contentType, contentId, parentId },
      include: { user: true },
      orderBy: { id: parentId ? 'asc' : 'desc' },
      skip,
      take,
    })

    const quoteIds = rows.map((r) => r.quoteId).filter((id) => id > 0)
    const quotes = quoteIds.length
      ? await prisma.user.findMany({ where: { id: { in: [...new Set(quoteIds)] } } })
      : []
    const quoteById = new Map(quotes.map((u) => [u.id, u]))

    const ctx = await viewerContext(req.authUser, {
      commentIds: rows.map((r) => r.id),
      userIds: [...rows.map((r) => r.userId), ...quoteIds],
    })

    return list(
      rows.map((r) => serializeComment({ ...r, quote: quoteById.get(r.quoteId) ?? null }, ctx)),
    )
  })

  app.post('/v1/comments', async (req) => {
    const viewer = requireUser(req)
    const p = params(req)
    const contentId = int(p, 'commentable_id')
    if (!contentId) throw unprocessable("Missing required parameter 'commentable_id'")
    const contentType = targetType(str(p, 'commentable_type'))
    const message = reqStr(p, 'message').trim()
    if (!message) throw unprocessable("Parameter 'message' cannot be empty")

    const parentId = intOr(p, 'parent_id', 0)
    const quoteId = intOr(p, 'quote_id', 0)

    const ownerId = await targetOwner(contentType, contentId)
    if (ownerId === null) throw notFound(`No ${contentType} with id ${contentId}`)

    if (parentId) {
      const parent = await prisma.comment.findUnique({ where: { id: parentId } })
      if (!parent) throw notFound(`No comment with id ${parentId}`)
    }

    const created = await prisma.$transaction(async (tx) => {
      const comment = await tx.comment.create({
        data: { userId: viewer.id, contentType, contentId, parentId, quoteId, message },
        include: { user: true },
      })

      if (contentType === 'recording') await bumpRecording(tx, contentId, { commentCount: 1 })
      if (parentId) await bumpComment(tx, parentId, { replyCount: 1 })

      await notify(tx, {
        userId: ownerId,
        senderId: viewer.id,
        type: parentId ? NOTIFICATION_TYPES.reply : NOTIFICATION_TYPES.comment,
        title: viewer.fullName,
        message: parentId ? `replied: ${message}` : `commented: ${message}`,
        contentId,
        subContentId: comment.id,
        subType: contentType,
      })

      // A reply that quotes someone also pings the quoted author.
      if (quoteId && quoteId !== ownerId) {
        await notify(tx, {
          userId: quoteId,
          senderId: viewer.id,
          type: NOTIFICATION_TYPES.reply,
          title: viewer.fullName,
          message: `mentioned you: ${message}`,
          contentId,
          subContentId: comment.id,
          subType: contentType,
        })
      }

      return comment
    })

    const quote = quoteId ? await prisma.user.findUnique({ where: { id: quoteId } }) : null
    const ctx = await viewerContext(viewer, {
      commentIds: [created.id],
      userIds: [created.userId, ...(quoteId ? [quoteId] : [])],
    })
    return item(serializeComment({ ...created, quote }, ctx))
  })

  /** DELETE returns Response<Unit>. Author or the owner of the commented item. */
  app.delete<{ Params: IdParam }>('/v1/comments/:id', async (req, reply) => {
    const viewer = requireUser(req)
    const id = Number.parseInt(req.params.id, 10)

    const comment = await prisma.comment.findUnique({ where: { id } })
    if (!comment) throw notFound(`No comment with id ${id}`)

    const ownerId = await targetOwner(targetType(comment.contentType), comment.contentId)
    if (comment.userId !== viewer.id && ownerId !== viewer.id) {
      throw forbidden('You can only delete your own comment')
    }

    await prisma.$transaction(async (tx) => {
      // Deleting a parent takes its replies with it, so both counters move by
      // the full amount rather than by one.
      const replies = await tx.comment.findMany({
        where: { contentType: comment.contentType, contentId: comment.contentId, parentId: id },
        select: { id: true },
      })
      const removed = replies.length + 1

      await tx.like.deleteMany({
        where: { targetType: 'comment', targetId: { in: [id, ...replies.map((r) => r.id)] } },
      })
      if (replies.length) await tx.comment.deleteMany({ where: { id: { in: replies.map((r) => r.id) } } })
      await tx.comment.delete({ where: { id } })

      if (comment.contentType === 'recording') {
        await bumpRecording(tx, comment.contentId, { commentCount: -removed })
      }
      if (comment.parentId) await bumpComment(tx, comment.parentId, { replyCount: -1 })
    })

    return reply.status(204).send()
  })

  /** POST /v1/likes — status 1 like, 0 unlike. Idempotent. */
  app.post('/v1/likes', async (req) => {
    const viewer = requireUser(req)
    const p = params(req)
    const id = int(p, 'likeable_id')
    if (!id) throw unprocessable("Missing required parameter 'likeable_id'")
    const type = targetType(str(p, 'likeable_type'))
    const like = intOr(p, 'status', 1) === 1

    const ownerId = await targetOwner(type, id)
    if (ownerId === null) throw notFound(`No ${type} with id ${id}`)

    await prisma.$transaction(async (tx) => {
      const existing = await tx.like.findUnique({
        where: { userId_targetType_targetId: { userId: viewer.id, targetType: type, targetId: id } },
      })

      if (like && !existing) {
        await tx.like.create({ data: { userId: viewer.id, targetType: type, targetId: id } })
        await bumpLikeTarget(tx, type, id, 1)
        await notify(tx, {
          userId: ownerId,
          senderId: viewer.id,
          type: NOTIFICATION_TYPES.like,
          title: viewer.fullName,
          message: `liked your ${type}`,
          contentId: id,
          subType: type,
        })
      } else if (!like && existing) {
        await tx.like.delete({ where: { id: existing.id } })
        await bumpLikeTarget(tx, type, id, -1)
      }
    })

    return ok({ status: 1, like_status: like })
  })

  /** POST /v1/shares — records that a share sheet was completed. */
  app.post('/v1/shares', async (req) => {
    const viewer = requireUser(req)
    const p = params(req)
    const id = int(p, 'shareable_id')
    if (!id) throw unprocessable("Missing required parameter 'shareable_id'")
    const type = targetType(str(p, 'shareable_type'))

    const ownerId = await targetOwner(type, id)
    if (ownerId === null) throw notFound(`No ${type} with id ${id}`)

    await prisma.$transaction(async (tx) => {
      await tx.share.create({
        data: {
          userId: viewer.id,
          targetType: type,
          targetId: id,
          social: intOr(p, 'social', 0),
          message: str(p, 'message') ?? null,
        },
      })
      if (type === 'recording') await bumpRecording(tx, id, { shareCount: 1 })
    })

    return ok({ status: 1 })
  })
}
