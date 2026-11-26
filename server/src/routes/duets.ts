import type { FastifyInstance } from 'fastify'
import { Prisma } from '@prisma/client'
import { prisma } from '../lib/prisma.js'
import { item, list } from '../http/envelope.js'
import { int, pagination, params } from '../http/params.js'
import { forbidden, notFound, unprocessable } from '../http/errors.js'
import { requireUser } from '../plugins/auth.js'
import { serializeDuet, serializeRecording, serializeSegments } from '../serializers/index.js'
import { viewerContext } from '../lib/viewer.js'
import { recordingInclude } from './recordings.js'

interface IdParam {
  id: string
}

/**
 * `segments` arrives as a JSON *string* inside a JSON body — the client builds
 * `HashMap<String, String>` and puts `Gson().toJson(segments)` in it
 * (PostActivity.java). It is parsed and re-validated here rather than stored
 * opaquely, so a malformed payload fails at write time instead of crashing the
 * duet screen of whoever opens it next.
 */
function parseSegments(raw: unknown): ReturnType<typeof serializeSegments> {
  if (raw === undefined || raw === null) return []

  let value: unknown = raw
  if (typeof raw === 'string') {
    try {
      value = JSON.parse(raw)
    } catch {
      throw unprocessable("Parameter 'segments' is not valid JSON")
    }
  }

  if (!Array.isArray(value)) throw unprocessable("Parameter 'segments' must be a JSON array")

  const parsed = serializeSegments(value)
  if (parsed.length !== value.length) {
    throw unprocessable("Parameter 'segments' contains entries that are not objects")
  }
  for (const s of parsed) {
    if (s.e < s.s) throw unprocessable(`Segment "${s.n}" ends (${s.e}) before it starts (${s.s})`)
  }
  return parsed
}

export async function duetRoutes(app: FastifyInstance): Promise<void> {
  /**
   * POST /v1/duets/{recordingId} — one of only two @Body routes in the client.
   * Opens a recording for duets by recording its lyric/timing segments.
   */
  app.post<{ Params: IdParam }>('/v1/duets/:id', async (req) => {
    const viewer = requireUser(req)
    const recordingId = Number.parseInt(req.params.id, 10)

    const recording = await prisma.recording.findUnique({ where: { id: recordingId } })
    if (!recording) throw notFound(`No recording with id ${recordingId}`)
    if (recording.userId !== viewer.id) {
      throw forbidden('You can only open your own recording for duets')
    }

    const segments = parseSegments(params(req).segments)

    const duet = await prisma.duet.upsert({
      where: { recordingId },
      create: {
        userId: viewer.id,
        songId: recording.songId,
        recordingId,
        segments: segments as unknown as Prisma.InputJsonValue,
      },
      update: { segments: segments as unknown as Prisma.InputJsonValue },
      include: { user: true, recording: { include: recordingInclude } },
    })

    const ctx = await viewerContext(viewer, {
      recordingIds: [recordingId],
      userIds: [duet.userId],
    })
    return item(serializeDuet(duet, ctx))
  })

  /** GET /v1/duets/recordings — recordings that are open for duets. */
  app.get('/v1/duets/recordings', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p)
    const type = int(p, 'type')

    const duets = await prisma.duet.findMany({
      where: {
        recording: {
          status: 1,
          privacy: 1,
          ...(type === undefined ? {} : { type }),
        },
      },
      select: { recordingId: true },
      orderBy: [{ joinCount: 'desc' }, { id: 'desc' }],
      skip,
      take,
    })
    if (!duets.length) return list([])

    const ids = duets.map((d) => d.recordingId)
    const rows = await prisma.recording.findMany({
      where: { id: { in: ids } },
      include: { ...recordingInclude, ownedDuet: { include: { user: true } } },
    })

    const order = new Map(ids.map((id, i) => [id, i]))
    rows.sort((a, b) => (order.get(a.id) ?? 0) - (order.get(b.id) ?? 0))

    const ctx = await viewerContext(req.authUser, {
      recordingIds: rows.map((r) => r.id),
      userIds: rows.map((r) => r.userId),
    })

    // These rows ARE the duet parents, so the duet to expand is the owned one.
    return list(
      rows.map((r) => serializeRecording({ ...r, duet: r.ownedDuet ?? r.duet }, ctx)),
    )
  })
}
