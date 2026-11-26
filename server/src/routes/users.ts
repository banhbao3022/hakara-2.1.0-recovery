import type { FastifyInstance } from 'fastify'
import { Prisma } from '@prisma/client'
import { prisma } from '../lib/prisma.js'
import { item, list, ok } from '../http/envelope.js'
import { int, intOr, pagination, params, str } from '../http/params.js'
import { forbidden, notFound, unprocessable } from '../http/errors.js'
import { requireUser } from '../plugins/auth.js'
import { serializeUser } from '../serializers/index.js'
import { blockedUserIds, viewerContext } from '../lib/viewer.js'
import { bumpUser } from '../lib/counters.js'
import { NOTIFICATION_TYPES, notify } from '../lib/notifications.js'

interface IdParam {
  id: string
}

export async function userRoutes(app: FastifyInstance): Promise<void> {
  app.get<{ Params: IdParam }>('/v1/users/:id', async (req) => {
    const id = Number.parseInt(req.params.id, 10)
    const user = await prisma.user.findUnique({ where: { id } })
    if (!user) throw notFound(`No user with id ${id}`)

    const ctx = await viewerContext(req.authUser, { userIds: [user.id] })
    return item(serializeUser(user, ctx))
  })

  /** Profile edit (ProfileEditActivity). Self only. */
  app.post<{ Params: IdParam }>('/v1/users/:id', async (req) => {
    const viewer = requireUser(req)
    const id = Number.parseInt(req.params.id, 10)
    if (id !== viewer.id) throw forbidden('You can only edit your own profile')

    const p = params(req)
    const gender = int(p, 'gender')

    const user = await prisma.user.update({
      where: { id },
      data: {
        ...definedOnly({
          fullName: str(p, 'full_name'),
          birthday: str(p, 'birthday'),
          avatar: str(p, 'avatar'),
          bio: str(p, 'bio'),
          city: str(p, 'city'),
          country: str(p, 'country'),
          cover: str(p, 'cover'),
        }),
        ...(gender === undefined ? {} : { gender }),
      },
    })

    return item(serializeUser(user))
  })

  app.get('/v1/users/search', async (req) => {
    const p = params(req)
    const q = str(p, 'q')?.trim()
    const { skip, take } = pagination(p)
    if (!q) return list([])

    const hidden = await blockedUserIds(req.authUser)
    const users = await prisma.user.findMany({
      where: {
        fullName: { contains: q, mode: 'insensitive' },
        ...(hidden.length ? { id: { notIn: hidden } } : {}),
      },
      orderBy: [{ followerCount: 'desc' }, { id: 'asc' }],
      skip,
      take,
    })

    const ctx = await viewerContext(req.authUser, { userIds: users.map((u) => u.id) })
    return list(users.map((u) => serializeUser(u, ctx)))
  })

  /**
   * GET /v1/users/suggestion
   * Two callers with one route: the duet-invite sheet passes song_id and wants
   * people who have sung that song; the Explore "people to follow" rail passes
   * neither and wants accounts the viewer does not already follow.
   */
  app.get('/v1/users/suggestion', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p)
    const songId = int(p, 'song_id')
    const forUserId = int(p, 'user_id') ?? req.authUser?.id

    const hidden = await blockedUserIds(req.authUser)
    const excluded = new Set(hidden)
    if (forUserId) excluded.add(forUserId)

    if (forUserId) {
      const following = await prisma.follow.findMany({
        where: { followerId: forUserId },
        select: { followedId: true },
      })
      for (const f of following) excluded.add(f.followedId)
    }

    const where: Prisma.UserWhereInput = {
      ...(excluded.size ? { id: { notIn: [...excluded] } } : {}),
      ...(songId ? { recordings: { some: { songId, privacy: 1, status: 1 } } } : {}),
    }

    const users = await prisma.user.findMany({
      where,
      orderBy: [{ recordingCount: 'desc' }, { followerCount: 'desc' }, { id: 'asc' }],
      skip,
      take,
    })

    const ctx = await viewerContext(req.authUser, { userIds: users.map((u) => u.id) })
    return list(users.map((u) => serializeUser(u, ctx)))
  })

  app.get('/v1/follows/followers', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p)
    const userId = int(p, 'user_id') ?? int(p, 'follower_id') ?? req.authUser?.id
    if (!userId) throw unprocessable("Missing required parameter 'user_id'")

    const rows = await prisma.follow.findMany({
      where: { followedId: userId },
      include: { follower: true },
      orderBy: { id: 'desc' },
      skip,
      take,
    })

    const users = rows.map((r) => r.follower)
    const ctx = await viewerContext(req.authUser, { userIds: users.map((u) => u.id) })
    return list(users.map((u) => serializeUser(u, ctx)))
  })

  app.get('/v1/follows/following', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p)
    const userId = int(p, 'user_id') ?? int(p, 'follower_id') ?? req.authUser?.id
    if (!userId) throw unprocessable("Missing required parameter 'user_id'")

    const rows = await prisma.follow.findMany({
      where: { followerId: userId },
      include: { followed: true },
      orderBy: { id: 'desc' },
      skip,
      take,
    })

    const users = rows.map((r) => r.followed)
    const ctx = await viewerContext(req.authUser, { userIds: users.map((u) => u.id) })
    return list(users.map((u) => serializeUser(u, ctx)))
  })

  /** POST /v1/follows — status "1" follow, "0" unfollow. Idempotent either way. */
  app.post('/v1/follows', async (req) => {
    const viewer = requireUser(req)
    const p = params(req)
    const targetId = int(p, 'user_id')
    if (!targetId) throw unprocessable("Missing required parameter 'user_id'")
    if (targetId === viewer.id) throw unprocessable('You cannot follow yourself')

    const target = await prisma.user.findUnique({ where: { id: targetId } })
    if (!target) throw notFound(`No user with id ${targetId}`)

    const follow = intOr(p, 'status', 1) === 1

    await prisma.$transaction(async (tx) => {
      const existing = await tx.follow.findUnique({
        where: { followerId_followedId: { followerId: viewer.id, followedId: targetId } },
      })

      if (follow && !existing) {
        await tx.follow.create({ data: { followerId: viewer.id, followedId: targetId } })
        await bumpUser(tx, viewer.id, { followingCount: 1 })
        await bumpUser(tx, targetId, { followerCount: 1 })
        await notify(tx, {
          userId: targetId,
          senderId: viewer.id,
          type: NOTIFICATION_TYPES.follow,
          title: viewer.fullName,
          message: 'started following you',
          contentId: viewer.id,
        })
      } else if (!follow && existing) {
        await tx.follow.delete({ where: { id: existing.id } })
        await bumpUser(tx, viewer.id, { followingCount: -1 })
        await bumpUser(tx, targetId, { followerCount: -1 })
      }
    })

    return ok({ status: 1, follow_status: follow })
  })

  app.get('/v1/blocks', async (req) => {
    const viewer = requireUser(req)
    const { skip, take } = pagination(params(req))

    const rows = await prisma.block.findMany({
      where: { blockerId: viewer.id },
      include: { blocked: true },
      orderBy: { id: 'desc' },
      skip,
      take,
    })

    return list(rows.map((r) => serializeUser(r.blocked)))
  })

  /** POST /v1/blocks — status 1 block, 0 unblock. Blocking also drops any follow. */
  app.post('/v1/blocks', async (req) => {
    const viewer = requireUser(req)
    const p = params(req)
    const blockedId = int(p, 'blocked_id')
    if (!blockedId) throw unprocessable("Missing required parameter 'blocked_id'")
    if (blockedId === viewer.id) throw unprocessable('You cannot block yourself')

    const target = await prisma.user.findUnique({ where: { id: blockedId } })
    if (!target) throw notFound(`No user with id ${blockedId}`)

    const block = intOr(p, 'status', 1) === 1

    await prisma.$transaction(async (tx) => {
      const existing = await tx.block.findUnique({
        where: { blockerId_blockedId: { blockerId: viewer.id, blockedId } },
      })

      if (block && !existing) {
        await tx.block.create({ data: { blockerId: viewer.id, blockedId } })

        // A block that leaves the follow edge in place would keep the blocked
        // account in both users' feeds.
        for (const pair of [
          { followerId: viewer.id, followedId: blockedId },
          { followerId: blockedId, followedId: viewer.id },
        ]) {
          const follow = await tx.follow.findUnique({
            where: { followerId_followedId: pair },
          })
          if (!follow) continue
          await tx.follow.delete({ where: { id: follow.id } })
          await bumpUser(tx, pair.followerId, { followingCount: -1 })
          await bumpUser(tx, pair.followedId, { followerCount: -1 })
        }
      } else if (!block && existing) {
        await tx.block.delete({ where: { id: existing.id } })
      }
    })

    return ok({ status: 1, block_status: block })
  })
}

/** Drop undefined keys so an omitted field is left alone rather than nulled. */
function definedOnly<T extends Record<string, unknown>>(input: T): Partial<T> {
  const out: Record<string, unknown> = {}
  for (const [k, v] of Object.entries(input)) {
    if (v !== undefined) out[k] = v
  }
  return out as Partial<T>
}
