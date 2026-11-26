import type { FastifyInstance } from 'fastify'
import { Prisma } from '@prisma/client'
import { prisma } from '../lib/prisma.js'
import { item, list } from '../http/envelope.js'
import { pagination, params, reqStr, str } from '../http/params.js'
import { unprocessable } from '../http/errors.js'
import { serializeKeyword } from '../serializers/index.js'

const MAX_KEYWORD_LENGTH = 100

export async function keywordRoutes(app: FastifyInstance): Promise<void> {
  /** GET /v1/keywords — the trending-search chips. orderBy picks the ranking. */
  app.get('/v1/keywords', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p)
    const orderBy = str(p, 'orderBy') ?? 'hot'

    const order: Prisma.KeywordOrderByWithRelationInput[] =
      orderBy === 'new' ? [{ id: 'desc' }] : [{ searchCount: 'desc' }, { id: 'desc' }]

    const rows = await prisma.keyword.findMany({ orderBy: order, skip, take })
    return list(rows.map(serializeKeyword))
  })

  /**
   * POST /v1/keywords — logs a search. The client calls this on every submitted
   * query, so it both creates the row and bumps the counter that GET ranks by.
   */
  app.post('/v1/keywords', async (req) => {
    const name = reqStr(params(req), 'name').trim()
    if (!name) throw unprocessable("Parameter 'name' cannot be empty")
    if (name.length > MAX_KEYWORD_LENGTH) {
      throw unprocessable(`Parameter 'name' exceeds ${MAX_KEYWORD_LENGTH} characters`)
    }

    const row = await prisma.keyword.upsert({
      where: { name },
      create: { name, searchCount: 1 },
      update: { searchCount: { increment: 1 } },
    })

    return item(serializeKeyword(row))
  })
}
