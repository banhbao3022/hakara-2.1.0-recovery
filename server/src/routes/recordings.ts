import type { FastifyInstance } from 'fastify'
import { Prisma } from '@prisma/client'
import type { User } from '@prisma/client'
import { prisma } from '../lib/prisma.js'
import { item, list, ok, status2 } from '../http/envelope.js'
import { bool, int, intList, intOr, num, pagination, params, str } from '../http/params.js'
import { forbidden, notFound, unprocessable } from '../http/errors.js'
import { requireUser } from '../plugins/auth.js'
import { serializeBackground, serializeRecording, type RecordingRow } from '../serializers/index.js'
import { blockedUserIds, viewerContext } from '../lib/viewer.js'
import { bumpRecording, bumpUser } from '../lib/counters.js'
import { NOTIFICATION_TYPES, notify, notifyFollowers } from '../lib/notifications.js'
import { consumeMultipart } from '../lib/storage.js'
import { env } from '../env.js'

const PRIVACY_PUBLIC = 1

export const recordingInclude = {
  user: true,
  song: true,
  duet: { include: { user: true } },
} satisfies Prisma.RecordingInclude

interface IdParam {
  id: string
}

/** Resolve image_ids ("1,2,3") into the `images` array the client expects. */
async function attachImages(rows: RecordingRow[]): Promise<void> {
  const ids = new Set<number>()
  for (const r of rows) {
    for (const id of String(r.imageIds ?? '').split(',')) {
      const n = Number.parseInt(id.trim(), 10)
      if (Number.isFinite(n)) ids.add(n)
    }
  }
  if (!ids.size) return

  const images = await prisma.image.findMany({ where: { id: { in: [...ids] } } })
  const byId = new Map(images.map((i) => [i.id, i]))

  for (const r of rows) {
    r.images = String(r.imageIds ?? '')
      .split(',')
      .map((id) => byId.get(Number.parseInt(id.trim(), 10)))
      .filter((i): i is NonNullable<typeof i> => Boolean(i))
  }
}

/** One place to turn a page of rows into the client's envelope. */
async function feed(
  rows: RecordingRow[],
  viewer: User | null,
  distances?: Map<number, number>,
) {
  await attachImages(rows)
  const ctx = await viewerContext(viewer, {
    recordingIds: rows.map((r) => r.id),
    userIds: rows.map((r) => r.userId),
    ...(distances ? { distances } : {}),
  })
  return list(rows.map((r) => serializeRecording(r, ctx)))
}

/** Public rows only, minus anyone in a block relationship with the viewer. */
async function visibilityWhere(viewer: User | null): Promise<Prisma.RecordingWhereInput> {
  const hidden = await blockedUserIds(viewer)
  return {
    status: 1,
    ...(viewer
      ? { OR: [{ privacy: PRIVACY_PUBLIC }, { userId: viewer.id }] }
      : { privacy: PRIVACY_PUBLIC }),
    ...(hidden.length ? { userId: { notIn: hidden } } : {}),
  }
}

export async function recordingRoutes(app: FastifyInstance): Promise<void> {
  /** GET /v1/recordings — a user's profile list, or the global feed. */
  app.get('/v1/recordings', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p)
    const userId = int(p, 'user_id')
    const type = int(p, 'type')

    const base = await visibilityWhere(req.authUser)
    const where: Prisma.RecordingWhereInput = {
      ...base,
      ...(userId ? { userId } : {}),
      ...(type === undefined ? {} : { type }),
    }

    const rows = await prisma.recording.findMany({
      where,
      include: recordingInclude,
      // Pinned first on a profile; newest first everywhere.
      orderBy: userId ? [{ pin: 'desc' }, { createdAt: 'desc' }] : [{ createdAt: 'desc' }],
      skip,
      take,
    })

    return feed(rows, req.authUser)
  })

  /** Feed of recordings by the people the viewer follows. */
  app.get('/v1/recordings/following', async (req) => {
    const viewer = requireUser(req)
    const p = params(req)
    const { skip, take } = pagination(p)
    const type = int(p, 'type')

    const following = await prisma.follow.findMany({
      where: { followerId: viewer.id },
      select: { followedId: true },
    })
    const authorIds = following.map((f) => f.followedId)
    if (!authorIds.length) return list([])

    const base = await visibilityWhere(viewer)
    const rows = await prisma.recording.findMany({
      where: { ...base, userId: { in: authorIds }, ...(type === undefined ? {} : { type }) },
      include: recordingInclude,
      orderBy: { createdAt: 'desc' },
      skip,
      take,
    })

    return feed(rows, viewer)
  })

  /**
   * GET /v1/recordings/nearby — ordered by great-circle distance from the
   * client's reported position.
   *
   * Haversine in plain SQL rather than cube/earthdistance: those extensions need
   * CREATE EXTENSION, which a managed Postgres role often cannot run, and this
   * query is index-assisted by the (lat, long) bounding-box filter anyway.
   */
  app.get('/v1/recordings/nearby', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p)
    const lat = num(p, 'lat')
    const long = num(p, 'long')
    if (lat === undefined || long === undefined) {
      throw unprocessable("Both 'lat' and 'long' are required for the nearby feed")
    }

    const hidden = await blockedUserIds(req.authUser)
    const viewerId = req.authUser?.id ?? -1

    const ranked = await prisma.$queryRaw<{ id: number; distance_km: number }[]>`
      SELECT r.id,
             6371 * acos(LEAST(1, GREATEST(-1,
               cos(radians(${lat}::float8)) * cos(radians(r.lat)) *
               cos(radians(r.long) - radians(${long}::float8)) +
               sin(radians(${lat}::float8)) * sin(radians(r.lat))
             ))) AS distance_km
      FROM recordings r
      WHERE r.status = 1
        AND (r.privacy = ${PRIVACY_PUBLIC} OR r.user_id = ${viewerId})
        AND r.lat IS NOT NULL
        AND r.long IS NOT NULL
        AND NOT (r.user_id = ANY(${hidden}::int[]))
      ORDER BY distance_km ASC, r.created_at DESC
      LIMIT ${take} OFFSET ${skip}
    `

    if (!ranked.length) return list([])

    const rows = await prisma.recording.findMany({
      where: { id: { in: ranked.map((r) => r.id) } },
      include: recordingInclude,
    })

    // Restore the distance ordering the raw query produced.
    const order = new Map(ranked.map((r, i) => [r.id, i]))
    rows.sort((a, b) => (order.get(a.id) ?? 0) - (order.get(b.id) ?? 0))

    // User.distance is per-author; the nearest of their ranked recordings wins.
    const distances = new Map<number, number>()
    for (const r of ranked) {
      const row = rows.find((x) => x.id === r.id)
      if (row && !distances.has(row.userId)) distances.set(row.userId, round2(r.distance_km))
    }

    return feed(rows, req.authUser, distances)
  })

  /** GET /v1/recordings/ranking/{songId} — leaderboard for one song. */
  app.get<{ Params: IdParam }>('/v1/recordings/ranking/:id', async (req) => {
    const songId = Number.parseInt(req.params.id, 10)
    const p = params(req)
    const { skip, take } = pagination(p)
    const window = str(p, 'type') ?? 'monthly'

    const since = windowStart(window)
    const base = await visibilityWhere(req.authUser)

    const rows = await prisma.recording.findMany({
      where: { ...base, songId, ...(since ? { createdAt: { gte: since } } : {}) },
      include: recordingInclude,
      orderBy: [{ starCount: 'desc' }, { likeCount: 'desc' }, { playCount: 'desc' }, { id: 'asc' }],
      skip,
      take,
    })

    return feed(rows, req.authUser)
  })

  /** GET /v1/recordings/background → Simple2 { key, value } */
  app.get('/v1/recordings/background', async () => {
    const rows = await prisma.background.findMany({ orderBy: [{ position: 'asc' }, { id: 'asc' }] })
    return list(rows.map(serializeBackground))
  })

  /** GET /v1/recordings/duet/{id} — the joins recorded against one duet parent. */
  app.get<{ Params: IdParam }>('/v1/recordings/duet/:id', async (req) => {
    const parentId = Number.parseInt(req.params.id, 10)
    const { skip, take } = pagination(params(req))

    const duet = await prisma.duet.findFirst({
      where: { OR: [{ id: parentId }, { recordingId: parentId }] },
      select: { id: true },
    })
    if (!duet) return list([])

    const base = await visibilityWhere(req.authUser)
    const rows = await prisma.recording.findMany({
      where: { ...base, duetId: duet.id },
      include: recordingInclude,
      orderBy: { createdAt: 'desc' },
      skip,
      take,
    })

    return feed(rows, req.authUser)
  })

  /** GET /v1/recordings/singDuetJoin/{id} — the parent recording to sing against. */
  app.get<{ Params: IdParam }>('/v1/recordings/singDuetJoin/:id', async (req) => {
    const id = Number.parseInt(req.params.id, 10)
    const row = await prisma.recording.findUnique({
      where: { id },
      include: { ...recordingInclude, ownedDuet: { include: { user: true } } },
    })
    if (!row) throw notFound(`No recording with id ${id}`)

    // The duet the client needs is the one this recording *owns*, not one it joined.
    const withDuet: RecordingRow = { ...row, duet: row.ownedDuet ?? row.duet }
    await attachImages([withDuet])
    const ctx = await viewerContext(req.authUser, {
      recordingIds: [withDuet.id],
      userIds: [withDuet.userId],
    })
    return item(serializeRecording(withDuet, ctx))
  })

  /** POST /v1/recordings/sendInviteDuet — user_ids is comma-separated. */
  app.post('/v1/recordings/sendInviteDuet', async (req) => {
    const viewer = requireUser(req)
    const p = params(req)
    const recordingId = int(p, 'recording_id')
    if (!recordingId) throw unprocessable("Missing required parameter 'recording_id'")

    const recording = await prisma.recording.findUnique({ where: { id: recordingId } })
    if (!recording) throw notFound(`No recording with id ${recordingId}`)
    if (recording.userId !== viewer.id) throw forbidden('You can only invite to your own recording')

    const userIds = intList(p, 'user_ids').filter((id) => id !== viewer.id)
    if (!userIds.length) throw unprocessable("Parameter 'user_ids' resolved to no recipients")

    const recipients = await prisma.user.findMany({
      where: { id: { in: userIds } },
      select: { id: true },
    })

    await prisma.$transaction(async (tx) => {
      for (const r of recipients) {
        await notify(tx, {
          userId: r.id,
          senderId: viewer.id,
          type: NOTIFICATION_TYPES.duetInvite,
          title: viewer.fullName,
          message: `invited you to duet "${recording.name}"`,
          contentId: recording.id,
        })
      }
    })

    return ok({ status: 1, invited: recipients.length })
  })

  /** POST /v1/recordings/pin → GetAnyResponse2 { status, message } */
  app.post('/v1/recordings/pin', async (req) => {
    const viewer = requireUser(req)
    const p = params(req)
    const id = int(p, 'id')
    if (!id) throw unprocessable("Missing required parameter 'id'")

    const recording = await prisma.recording.findUnique({ where: { id } })
    if (!recording) throw notFound(`No recording with id ${id}`)
    if (recording.userId !== viewer.id) throw forbidden('You can only pin your own recording')

    const pin = intOr(p, 'status', 1) === 1

    await prisma.$transaction(async (tx) => {
      // One pinned recording per profile, matching the single pinned slot in the UI.
      if (pin) await tx.recording.updateMany({ where: { userId: viewer.id }, data: { pin: 0 } })
      await tx.recording.update({ where: { id }, data: { pin: pin ? 1 : 0 } })
    })

    return status2(1, pin ? 'Pinned' : 'Unpinned')
  })

  app.get<{ Params: IdParam }>('/v1/recordings/detail/:id', async (req) => {
    const id = Number.parseInt(req.params.id, 10)
    const row = await prisma.recording.findUnique({ where: { id }, include: recordingInclude })
    if (!row) throw notFound(`No recording with id ${id}`)

    if (row.privacy !== PRIVACY_PUBLIC && row.userId !== req.authUser?.id) {
      throw forbidden('This recording is private')
    }

    await attachImages([row])
    const ctx = await viewerContext(req.authUser, {
      recordingIds: [row.id],
      userIds: [row.userId],
    })
    return item(serializeRecording(row, ctx))
  })

  /**
   * POST /v1/recordings — multipart upload and publish.
   *
   * Part names come from the client, not from the API shape: `audio` (required,
   * audio/* or video/*), `video_resize` and `thumbnail` optional. All scalars
   * arrive in the PartMap.
   */
  app.post('/v1/recordings', async (req) => {
    const viewer = requireUser(req)
    if (!env.allowMediaUpload) throw forbidden('Media upload is disabled (ALLOW_MEDIA_UPLOAD=false)')

    const { files, fields } = await consumeMultipart(req, {
      allow: ['audio', 'video_resize', 'thumbnail'],
      subdir: 'recordings',
    })

    const audio = files.audio
    if (!audio) throw unprocessable("Missing required multipart part 'audio'")

    const songId = int(fields, 'song_id')
    if (!songId) throw unprocessable("Missing required parameter 'song_id'")

    const song = await prisma.song.findUnique({ where: { id: songId } })
    if (!song) throw notFound(`No song with id ${songId}`)

    // duet_id 0 means "not a duet join" in the client; store it as NULL.
    const rawDuetId = int(fields, 'duet_id')
    const duetId = rawDuetId && rawDuetId > 0 ? rawDuetId : null
    if (duetId) {
      const parent = await prisma.duet.findUnique({ where: { id: duetId } })
      if (!parent) throw notFound(`No duet with id ${duetId}`)
    }

    const created = await prisma.$transaction(async (tx) => {
      const recording = await tx.recording.create({
        data: {
          userId: viewer.id,
          songId,
          duetId,
          name: str(fields, 'name') ?? song.name,
          message: str(fields, 'message') ?? null,
          url: audio.url,
          urlVideoResize: files.video_resize?.url ?? null,
          thumbnail: files.thumbnail?.url ?? str(fields, 'thumbnail_url') ?? song.thumbnail,
          type: intOr(fields, 'type', 0),
          format: intOr(fields, 'format', 0),
          videoRatio: intOr(fields, 'video_ratio', 0),
          privacy: intOr(fields, 'privacy', PRIVACY_PUBLIC),
          duration: intOr(fields, 'duration', 0),
          effect: intOr(fields, 'effect', 0),
          useHeadphone: bool(fields, 'use_headphone') ?? false,
          imageIds: str(fields, 'image_ids') ?? null,
          lat: viewer.lat,
          long: viewer.long,
        },
        include: recordingInclude,
      })

      await tx.recording.update({
        where: { id: recording.id },
        data: { shareUrl: `${env.publicUrl}/r/${recording.id}`, slug: slugify(recording.name, recording.id) },
      })

      await bumpUser(tx, viewer.id, { recordingCount: 1 })
      await tx.song.update({ where: { id: songId }, data: { recordCount: { increment: 1 } } })

      if (duetId) {
        const parent = await tx.duet.update({
          where: { id: duetId },
          data: { joinCount: { increment: 1 } },
        })
        await bumpRecording(tx, parent.recordingId, { duetCount: 1 })
        await notify(tx, {
          userId: parent.userId,
          senderId: viewer.id,
          type: NOTIFICATION_TYPES.duetJoin,
          title: viewer.fullName,
          message: `joined your duet "${recording.name}"`,
          contentId: recording.id,
        })
      }

      if (recording.privacy === PRIVACY_PUBLIC) {
        const fanout = await notifyFollowers(tx, {
          senderId: viewer.id,
          type: NOTIFICATION_TYPES.system,
          title: viewer.fullName,
          message: `posted "${recording.name}"`,
          contentId: recording.id,
        })
        if (fanout.truncated) {
          req.log.warn(
            { userId: viewer.id, recordingId: recording.id, notified: fanout.notified },
            'follower fan-out truncated; remaining followers were not notified',
          )
        }
      }

      return recording
    })

    const row = await prisma.recording.findUniqueOrThrow({
      where: { id: created.id },
      include: recordingInclude,
    })
    await attachImages([row])
    const ctx = await viewerContext(viewer, { recordingIds: [row.id], userIds: [row.userId] })
    return item(serializeRecording(row, ctx))
  })

  /**
   * PUT /v1/recordings/{id} carries two unrelated meanings:
   *   privacy=<n>     → the owner changing visibility
   *   play_count=1    → any viewer registering a play
   */
  app.put<{ Params: IdParam }>('/v1/recordings/:id', async (req) => {
    const id = Number.parseInt(req.params.id, 10)
    const p = params(req)

    const existing = await prisma.recording.findUnique({ where: { id } })
    if (!existing) throw notFound(`No recording with id ${id}`)

    const privacy = int(p, 'privacy')
    const playCount = int(p, 'play_count')

    if (privacy !== undefined) {
      const viewer = requireUser(req)
      if (existing.userId !== viewer.id) throw forbidden('You can only edit your own recording')
      await prisma.recording.update({ where: { id }, data: { privacy } })
    }

    if (playCount !== undefined && playCount > 0) {
      await prisma.$transaction(async (tx) => {
        await bumpRecording(tx, id, { playCount })
        await bumpUser(tx, existing.userId, { playCount })
      })
    }

    const row = await prisma.recording.findUniqueOrThrow({ where: { id }, include: recordingInclude })
    await attachImages([row])
    const ctx = await viewerContext(req.authUser, { recordingIds: [row.id], userIds: [row.userId] })
    return item(serializeRecording(row, ctx))
  })

  /** DELETE returns Response<Unit>: the client checks isSuccessful and reads no body. */
  app.delete<{ Params: IdParam }>('/v1/recordings/:id', async (req, reply) => {
    const viewer = requireUser(req)
    const id = Number.parseInt(req.params.id, 10)

    const existing = await prisma.recording.findUnique({ where: { id } })
    if (!existing) throw notFound(`No recording with id ${id}`)
    if (existing.userId !== viewer.id) throw forbidden('You can only delete your own recording')

    await prisma.$transaction(async (tx) => {
      await tx.comment.deleteMany({ where: { contentType: 'recording', contentId: id } })
      await tx.like.deleteMany({ where: { targetType: 'recording', targetId: id } })
      await tx.share.deleteMany({ where: { targetType: 'recording', targetId: id } })
      await tx.recording.delete({ where: { id } })
      await bumpUser(tx, viewer.id, { recordingCount: -1 })
      await tx.song.update({
        where: { id: existing.songId },
        data: { recordCount: { decrement: 1 } },
      })
    })

    return reply.status(204).send()
  })
}

function round2(n: number): number {
  return Math.round(n * 100) / 100
}

function slugify(name: string, id: number): string {
  const base = name
    .toLowerCase()
    .normalize('NFD')
    .replace(/[\u0300-\u036f]/g, '')
    .replace(/[^a-z0-9]+/g, '-')
    .replace(/^-+|-+$/g, '')
  return `${base || 'recording'}-${id}`
}

/** `type` on the ranking route: "weekly" | "monthly" | "all". */
function windowStart(window: string): Date | null {
  const now = Date.now()
  switch (window) {
    case 'daily':
      return new Date(now - 24 * 60 * 60 * 1000)
    case 'weekly':
      return new Date(now - 7 * 24 * 60 * 60 * 1000)
    case 'monthly':
      return new Date(now - 30 * 24 * 60 * 60 * 1000)
    default:
      return null
  }
}
