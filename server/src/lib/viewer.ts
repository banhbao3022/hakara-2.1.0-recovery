import type { User } from '@prisma/client'
import { prisma } from './prisma.js'
import type { ViewerContext } from '../serializers/index.js'

/**
 * Build the per-request view state the serializers need (`like_status`,
 * `follow_status`) in a fixed number of queries, rather than one lookup per row.
 */
export async function viewerContext(
  viewer: User | null,
  subjects: {
    recordingIds?: readonly number[]
    commentIds?: readonly number[]
    userIds?: readonly number[]
    distances?: Map<number, number>
  } = {},
): Promise<ViewerContext> {
  if (!viewer) return { distances: subjects.distances }

  const recordingIds = unique(subjects.recordingIds)
  const commentIds = unique(subjects.commentIds)
  const userIds = unique(subjects.userIds).filter((id) => id !== viewer.id)

  const [likes, follows] = await Promise.all([
    recordingIds.length || commentIds.length
      ? prisma.like.findMany({
          where: {
            userId: viewer.id,
            OR: [
              ...(recordingIds.length
                ? [{ targetType: 'recording', targetId: { in: recordingIds } }]
                : []),
              ...(commentIds.length ? [{ targetType: 'comment', targetId: { in: commentIds } }] : []),
            ],
          },
          select: { targetType: true, targetId: true },
        })
      : Promise.resolve([]),
    userIds.length
      ? prisma.follow.findMany({
          where: { followerId: viewer.id, followedId: { in: userIds } },
          select: { followedId: true },
        })
      : Promise.resolve([]),
  ])

  const likedRecordingIds = new Set<number>()
  const likedCommentIds = new Set<number>()
  for (const like of likes) {
    if (like.targetType === 'recording') likedRecordingIds.add(like.targetId)
    else likedCommentIds.add(like.targetId)
  }

  return {
    userId: viewer.id,
    likedRecordingIds,
    likedCommentIds,
    followedUserIds: new Set(follows.map((f) => f.followedId)),
    distances: subjects.distances,
  }
}

function unique(values: readonly number[] | undefined): number[] {
  return values?.length ? [...new Set(values)] : []
}

/** Ids of users who blocked the viewer, or whom the viewer blocked — hidden from feeds. */
export async function blockedUserIds(viewer: User | null): Promise<number[]> {
  if (!viewer) return []
  const rows = await prisma.block.findMany({
    where: { OR: [{ blockerId: viewer.id }, { blockedId: viewer.id }] },
    select: { blockerId: true, blockedId: true },
  })
  const ids = new Set<number>()
  for (const r of rows) {
    ids.add(r.blockerId === viewer.id ? r.blockedId : r.blockerId)
  }
  return [...ids]
}
