import type { FastifyInstance } from 'fastify'
import { prisma } from '../lib/prisma.js'
import { item, list } from '../http/envelope.js'
import { int, pagination, params } from '../http/params.js'
import { forbidden, unprocessable } from '../http/errors.js'
import { requireUser } from '../plugins/auth.js'
import { serializeImage } from '../serializers/index.js'
import { consumeMultipart } from '../lib/storage.js'
import { env } from '../env.js'

export async function imageRoutes(app: FastifyInstance): Promise<void> {
  /** GET /v1/images/list — the gallery behind the recording background picker. */
  app.get('/v1/images/list', async (req) => {
    const p = params(req)
    // The client sends per_page=16 explicitly; the default matches it.
    const { skip, take } = pagination(p, 16)
    const userId = int(p, 'user_id') ?? req.authUser?.id
    if (!userId) throw unprocessable("Missing required parameter 'user_id'")

    const rows = await prisma.image.findMany({
      where: { userId },
      orderBy: { id: 'desc' },
      skip,
      take,
    })

    return list(rows.map(serializeImage))
  })

  /** POST /v1/images/add — multipart, part name `image`. */
  app.post('/v1/images/add', async (req) => {
    const viewer = requireUser(req)
    if (!env.allowMediaUpload) throw forbidden('Media upload is disabled (ALLOW_MEDIA_UPLOAD=false)')

    const { files } = await consumeMultipart(req, { allow: ['image'], subdir: 'images' })
    const upload = files.image
    if (!upload) throw unprocessable("Missing required multipart part 'image'")

    const row = await prisma.image.create({ data: { userId: viewer.id, image: upload.url } })
    return item(serializeImage(row))
  })

  /**
   * POST /v1/images/deletes — the other @Body route: { "ids": [1, 2, 3] }.
   * Returns Response<Unit>.
   */
  app.post('/v1/images/deletes', async (req, reply) => {
    const viewer = requireUser(req)
    const raw = (params(req) as { ids?: unknown }).ids

    const ids = Array.isArray(raw)
      ? raw.map((v) => Number.parseInt(String(v), 10)).filter(Number.isFinite)
      : []
    if (!ids.length) throw unprocessable("Parameter 'ids' must be a non-empty array of image ids")

    // Scoped to the caller: an id belonging to someone else is simply not matched.
    await prisma.image.deleteMany({ where: { id: { in: ids }, userId: viewer.id } })

    return reply.status(204).send()
  })
}
