import type { FastifyInstance } from 'fastify'
import { prisma } from '../lib/prisma.js'
import { item, list, ok, status3 } from '../http/envelope.js'
import { int, intOr, pagination, params, reqStr, str } from '../http/params.js'
import { notFound, unprocessable } from '../http/errors.js'
import { requireUser } from '../plugins/auth.js'
import { serializeGift, serializePresent } from '../serializers/index.js'
import { viewerContext } from '../lib/viewer.js'
import { bumpRecording, bumpUser } from '../lib/counters.js'
import { NOTIFICATION_TYPES, notify } from '../lib/notifications.js'

/**
 * Diamond packs. The client's SKUs are `<package>lv1.diamonds` … `lv6.diamonds`
 * (WalletViewModel.java), so the level is parsed out of the SKU rather than
 * trusted from a separate parameter.
 */
export const DIAMOND_PACKS: Record<number, number> = {
  1: 100,
  2: 300,
  3: 700,
  4: 1500,
  5: 4000,
  6: 10000,
}

export function diamondsForSku(productId: string): number | null {
  const match = /lv([1-6])\.diamonds$/i.exec(productId)
  if (!match?.[1]) return null
  return DIAMOND_PACKS[Number.parseInt(match[1], 10)] ?? null
}

/**
 * Receipt validation seam.
 *
 * The client sends transaction_id, product_id, date and state — but no Play
 * Billing purchase token (ApiService.java, @QueryMap), so there is nothing to
 * verify against Google's API. Replay is blocked by the unique transaction_id
 * alone. Wire a real check here once the client sends a token; see README.md.
 */
async function verifyPurchase(_productId: string, _transactionId: string): Promise<void> {
  return
}

export async function economyRoutes(app: FastifyInstance): Promise<void> {
  app.get('/v1/gifts', async () => {
    const gifts = await prisma.gift.findMany({
      where: { status: 1 },
      orderBy: [{ amount: 'asc' }, { id: 'asc' }],
    })
    return list(gifts.map(serializeGift))
  })

  /**
   * POST /v1/gifts/present — debit sender, credit receiver, write the Present,
   * in one transaction. A partial apply here is a user losing diamonds for
   * nothing, so nothing is written outside it.
   */
  app.post('/v1/gifts/present', async (req) => {
    const viewer = requireUser(req)
    const p = params(req)
    const recordingId = int(p, 'recording_id')
    const giftId = int(p, 'gift_id')
    if (!recordingId) throw unprocessable("Missing required parameter 'recording_id'")
    if (!giftId) throw unprocessable("Missing required parameter 'gift_id'")

    const quantity = intOr(p, 'quantity', 1)
    if (quantity < 1) throw unprocessable("Parameter 'quantity' must be at least 1")

    const [recording, gift] = await Promise.all([
      prisma.recording.findUnique({ where: { id: recordingId }, select: { id: true, userId: true, name: true } }),
      prisma.gift.findUnique({ where: { id: giftId } }),
    ])
    if (!recording) throw notFound(`No recording with id ${recordingId}`)
    if (!gift || gift.status !== 1) throw notFound(`No gift with id ${giftId}`)

    const cost = gift.amount * quantity
    const stars = gift.stars * quantity
    const exps = gift.exp * quantity

    const present = await prisma.$transaction(async (tx) => {
      // Re-read inside the transaction: the balance checked outside it is stale.
      const sender = await tx.user.findUniqueOrThrow({ where: { id: viewer.id } })
      if (sender.diamonds < cost) {
        throw unprocessable(
          `Not enough diamonds: ${gift.name} x${quantity} costs ${cost}, balance is ${sender.diamonds}`,
        )
      }

      await bumpUser(tx, viewer.id, { diamonds: -cost })
      await bumpUser(tx, recording.userId, { stars, exps, giftCount: quantity })
      await bumpRecording(tx, recordingId, { giftCount: quantity, starCount: stars })

      const row = await tx.present.create({
        data: {
          userId: viewer.id,
          receiverId: recording.userId,
          recordingId,
          giftId,
          quantity,
          stars,
        },
        include: { user: true, gift: true },
      })

      await notify(tx, {
        userId: recording.userId,
        senderId: viewer.id,
        type: NOTIFICATION_TYPES.gift,
        title: viewer.fullName,
        message: `sent you ${quantity} × ${gift.name}`,
        contentId: recordingId,
        image: gift.image,
      })

      return row
    })

    const ctx = await viewerContext(viewer, { userIds: [present.userId] })
    return ok({ status: 1, present: serializePresent(present, ctx) })
  })

  /** Top gifters on one recording. */
  app.get('/v1/gifts/recording/top', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p)
    const recordingId = int(p, 'recording_id')
    if (!recordingId) throw unprocessable("Missing required parameter 'recording_id'")

    const rows = await prisma.present.findMany({
      where: { recordingId },
      include: { user: true, gift: true },
      orderBy: [{ stars: 'desc' }, { id: 'desc' }],
      skip,
      take,
    })

    const ctx = await viewerContext(req.authUser, { userIds: rows.map((r) => r.userId) })
    return list(rows.map((r) => serializePresent(r, ctx)))
  })

  /** Leaderboard of who has gifted a given receiver the most. */
  app.get('/v1/gifts/receiver/top', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p)
    const receiverId = int(p, 'receiver_id')
    if (!receiverId) throw unprocessable("Missing required parameter 'receiver_id'")

    const totals = await prisma.present.groupBy({
      by: ['userId'],
      where: { receiverId },
      _sum: { stars: true, quantity: true },
      orderBy: { _sum: { stars: 'desc' } },
      skip,
      take,
    })
    if (!totals.length) return list([])

    const senderIds = totals.map((t) => t.userId)
    const [senders, latest] = await Promise.all([
      prisma.user.findMany({ where: { id: { in: senderIds } } }),
      prisma.present.findMany({
        where: { receiverId, userId: { in: senderIds } },
        include: { gift: true },
        orderBy: { id: 'desc' },
      }),
    ])

    const userById = new Map(senders.map((u) => [u.id, u]))
    // One row per sender, carrying their aggregate rather than a single gift.
    const mostRecentBySender = new Map<number, (typeof latest)[number]>()
    for (const row of latest) {
      if (!mostRecentBySender.has(row.userId)) mostRecentBySender.set(row.userId, row)
    }

    const ctx = await viewerContext(req.authUser, { userIds: senderIds })

    return list(
      totals.flatMap((t) => {
        const row = mostRecentBySender.get(t.userId)
        const user = userById.get(t.userId)
        if (!row || !user) return []
        return [
          serializePresent(
            {
              ...row,
              user,
              quantity: t._sum.quantity ?? row.quantity,
              stars: t._sum.stars ?? row.stars,
            },
            ctx,
          ),
        ]
      }),
    )
  })

  /** Gift history for a user: what they received. */
  app.get('/v1/gifts/user', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p)
    const receiverId = int(p, 'receiver_id') ?? req.authUser?.id
    if (!receiverId) throw unprocessable("Missing required parameter 'receiver_id'")

    const rows = await prisma.present.findMany({
      where: { receiverId },
      include: { user: true, gift: true },
      orderBy: { id: 'desc' },
      skip,
      take,
    })

    const ctx = await viewerContext(req.authUser, { userIds: rows.map((r) => r.userId) })
    return list(rows.map((r) => serializePresent(r, ctx)))
  })

  /**
   * POST /v1/diamonds/apple/exchange → GetAnyResponse3 { status, amount }
   *
   * Named "apple" in the client but driven by Google Play Billing. `amount` in
   * the response is the user's new balance, which is what the wallet screen
   * renders after a purchase.
   */
  app.post('/v1/diamonds/apple/exchange', async (req) => {
    const viewer = requireUser(req)
    const p = params(req)
    const transactionId = reqStr(p, 'transaction_id')
    const productId = reqStr(p, 'product_id')

    const credit = diamondsForSku(productId)
    if (credit === null) throw unprocessable(`Unrecognised product id '${productId}'`)

    await verifyPurchase(productId, transactionId)

    const balance = await prisma.$transaction(async (tx) => {
      // The unique constraint makes a replayed receipt a no-op rather than a
      // second credit, which is the whole defence available without a token.
      const seen = await tx.diamondTransaction.findUnique({ where: { transactionId } })
      if (seen) {
        const current = await tx.user.findUniqueOrThrow({ where: { id: viewer.id } })
        return current.diamonds
      }

      await tx.diamondTransaction.create({
        data: {
          userId: viewer.id,
          transactionId,
          productId,
          state: str(p, 'state') ?? null,
          uniqueId: str(p, 'unique_id') ?? null,
          purchasedAt: str(p, 'date') ?? null,
          amount: credit,
        },
      })

      const updated = await tx.user.update({
        where: { id: viewer.id },
        data: { diamonds: { increment: credit } },
      })
      return updated.diamonds
    })

    return status3(1, balance)
  })
}
