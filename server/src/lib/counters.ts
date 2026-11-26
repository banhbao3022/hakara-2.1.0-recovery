import type { Tx } from './prisma.js'
import type { TargetType } from './polymorphic.js'

/**
 * The feed endpoints return like/comment/share counts on every row, so those are
 * denormalized columns rather than per-request aggregates. Each helper runs
 * inside the same transaction as the row that causes the change — never after it.
 */

export async function bumpRecording(
  tx: Tx,
  recordingId: number,
  deltas: Partial<
    Record<
      'likeCount' | 'commentCount' | 'shareCount' | 'duetCount' | 'giftCount' | 'playCount' | 'starCount',
      number
    >
  >,
): Promise<void> {
  const data: Record<string, { increment: number }> = {}
  for (const [key, value] of Object.entries(deltas)) {
    if (value) data[key] = { increment: value }
  }
  if (!Object.keys(data).length) return
  await tx.recording.update({ where: { id: recordingId }, data })
}

export async function bumpComment(
  tx: Tx,
  commentId: number,
  deltas: Partial<Record<'likeCount' | 'replyCount', number>>,
): Promise<void> {
  const data: Record<string, { increment: number }> = {}
  for (const [key, value] of Object.entries(deltas)) {
    if (value) data[key] = { increment: value }
  }
  if (!Object.keys(data).length) return
  await tx.comment.update({ where: { id: commentId }, data })
}

export async function bumpLikeTarget(
  tx: Tx,
  type: TargetType,
  id: number,
  delta: number,
): Promise<void> {
  if (type === 'recording') await bumpRecording(tx, id, { likeCount: delta })
  else await bumpComment(tx, id, { likeCount: delta })
}

export async function bumpUser(
  tx: Tx,
  userId: number,
  deltas: Partial<
    Record<
      | 'recordingCount'
      | 'notificationCount'
      | 'followingCount'
      | 'followerCount'
      | 'giftCount'
      | 'playCount'
      | 'exps'
      | 'coins'
      | 'diamonds'
      | 'stars',
      number
    >
  >,
): Promise<void> {
  const data: Record<string, { increment: number }> = {}
  for (const [key, value] of Object.entries(deltas)) {
    if (value) data[key] = { increment: value }
  }
  if (!Object.keys(data).length) return
  await tx.user.update({ where: { id: userId }, data })
}

/** Counters are clamped at zero on read; a delete race must not show -1 comments. */
export const clamp = (n: number): number => (n > 0 ? n : 0)
