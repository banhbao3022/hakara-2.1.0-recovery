import type { Tx } from './prisma.js'
import { bumpUser } from './counters.js'

/**
 * Notification types. The client switches on Notification.type to decide which
 * screen to open from the list, using content_id as the target id.
 */
export const NOTIFICATION_TYPES = {
  follow: 'follow',
  like: 'like',
  comment: 'comment',
  reply: 'reply',
  gift: 'gift',
  duetInvite: 'duet_invite',
  duetJoin: 'duet_join',
  system: 'system',
} as const

export type NotificationType = (typeof NOTIFICATION_TYPES)[keyof typeof NOTIFICATION_TYPES]

export interface NotifyInput {
  userId: number
  senderId?: number | null
  type: NotificationType
  title: string
  message: string
  contentId?: number
  subContentId?: number | null
  subType?: string | null
  image?: string | null
}

/**
 * Create a notification and keep User.notification_count in step. Never notifies
 * a user about their own action — the client renders that as a self-mention.
 */
export async function notify(tx: Tx, input: NotifyInput): Promise<void> {
  if (input.senderId && input.senderId === input.userId) return

  await tx.notification.create({
    data: {
      userId: input.userId,
      senderId: input.senderId ?? null,
      type: input.type,
      title: input.title,
      message: input.message,
      contentId: input.contentId ?? 0,
      subContentId: input.subContentId ?? null,
      subType: input.subType ?? null,
      image: input.image ?? null,
      pushedAt: new Date(),
    },
  })

  await bumpUser(tx, input.userId, { notificationCount: 1 })
}

/**
 * Fan out to a user's followers — used when a recording is published.
 *
 * Capped at FANOUT_LIMIT recipients. An account with more followers than that
 * does not notify the remainder: a write-time fan-out is the wrong shape for it,
 * and silently truncating is better surfaced here than discovered in production.
 */
export const FANOUT_LIMIT = 500

export async function notifyFollowers(
  tx: Tx,
  input: Omit<NotifyInput, 'userId'> & { senderId: number },
): Promise<{ notified: number; truncated: boolean }> {
  const followers = await tx.follow.findMany({
    where: { followedId: input.senderId },
    select: { followerId: true },
    orderBy: { id: 'desc' },
    take: FANOUT_LIMIT + 1,
  })

  const truncated = followers.length > FANOUT_LIMIT
  const recipients = truncated ? followers.slice(0, FANOUT_LIMIT) : followers

  for (const f of recipients) {
    await notify(tx, { ...input, userId: f.followerId })
  }

  return { notified: recipients.length, truncated }
}
