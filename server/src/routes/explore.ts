import type { FastifyInstance } from 'fastify'
import { Prisma } from '@prisma/client'
import { prisma } from '../lib/prisma.js'
import { list } from '../http/envelope.js'
import { int, pagination, params } from '../http/params.js'
import { serializeExploreSection, serializeRecording } from '../serializers/index.js'
import { blockedUserIds, viewerContext } from '../lib/viewer.js'
import { recordingInclude } from './recordings.js'

/**
 * Explore is server-driven: GET /v1/explores returns the rail definitions
 * (Simple3 { id, name, type, layout_type }) and the client then calls
 * /v1/explores/recordings?type=<section type> for each rail's contents. Adding a
 * rail is a row in explore_sections, not a client release.
 *
 * `feed` selects the ordering; `layout_type` selects the client's cell template.
 */
const FEEDS = ['latest', 'trending', 'most_liked', 'most_gifted', 'duets'] as const
type Feed = (typeof FEEDS)[number]

function orderFor(feed: string): Prisma.RecordingOrderByWithRelationInput[] {
  switch (feed as Feed) {
    case 'trending':
      return [{ playCount: 'desc' }, { likeCount: 'desc' }, { id: 'desc' }]
    case 'most_liked':
      return [{ likeCount: 'desc' }, { id: 'desc' }]
    case 'most_gifted':
      return [{ starCount: 'desc' }, { giftCount: 'desc' }, { id: 'desc' }]
    case 'duets':
      return [{ duetCount: 'desc' }, { id: 'desc' }]
    default:
      return [{ createdAt: 'desc' }]
  }
}

export async function exploreRoutes(app: FastifyInstance): Promise<void> {
  app.get('/v1/explores', async (req) => {
    const p = params(req)
    const type = int(p, 'type')
    const { take } = pagination(p, 20)

    const sections = await prisma.exploreSection.findMany({
      where: { status: 1, ...(type === undefined ? {} : { type }) },
      orderBy: [{ position: 'asc' }, { id: 'asc' }],
      take,
    })

    return list(sections.map(serializeExploreSection))
  })

  app.get('/v1/explores/recordings', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p)
    const type = int(p, 'type')

    const section =
      type === undefined
        ? null
        : await prisma.exploreSection.findFirst({ where: { type, status: 1 } })

    const hidden = await blockedUserIds(req.authUser)

    const rows = await prisma.recording.findMany({
      where: {
        status: 1,
        privacy: 1,
        ...(hidden.length ? { userId: { notIn: hidden } } : {}),
        ...(section?.feed === 'duets' ? { ownedDuet: { isNot: null } } : {}),
      },
      include: recordingInclude,
      orderBy: orderFor(section?.feed ?? 'latest'),
      skip,
      take,
    })

    const ctx = await viewerContext(req.authUser, {
      recordingIds: rows.map((r) => r.id),
      userIds: rows.map((r) => r.userId),
    })

    return list(rows.map((r) => serializeRecording(r, ctx)))
  })
}
