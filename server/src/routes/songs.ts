import type { FastifyInstance } from 'fastify'
import { Prisma } from '@prisma/client'
import { prisma } from '../lib/prisma.js'
import { item, list, ok, status4 } from '../http/envelope.js'
import { int, intOr, pagination, params, str } from '../http/params.js'
import { forbidden, notFound, unprocessable } from '../http/errors.js'
import { serializeSong } from '../serializers/index.js'
import { consumeMultipart } from '../lib/storage.js'
import { env } from '../env.js'

/** The `type` on GET /v1/songs?type= and on getLink. */
export const SONG_MEDIA_AUDIO = 1
export const SONG_MEDIA_VIDEO = 2

interface IdParam {
  id: string
}

export async function songRoutes(app: FastifyInstance): Promise<void> {
  /** GET /v1/songs — the Sing tab's category lists. per_page defaults to 100 here. */
  app.get('/v1/songs', async (req) => {
    const p = params(req)
    const { skip, take } = pagination(p, 100)
    const type = int(p, 'type')

    const where: Prisma.SongWhereInput = {
      status: 1,
      ...(type === undefined ? {} : { type }),
    }

    const songs = await prisma.song.findMany({
      where,
      orderBy: [{ trending: 'desc' }, { recordCount: 'desc' }, { id: 'asc' }],
      skip,
      take,
    })

    return list(songs.map(serializeSong))
  })

  app.get('/v1/songs/search', async (req) => {
    const p = params(req)
    const name = str(p, 'name')?.trim()
    const { skip, take } = pagination(p)
    if (!name) return list([])

    const songs = await prisma.song.findMany({
      where: {
        status: 1,
        OR: [
          { name: { contains: name, mode: 'insensitive' } },
          { artist: { contains: name, mode: 'insensitive' } },
        ],
      },
      orderBy: [{ recordCount: 'desc' }, { id: 'asc' }],
      skip,
      take,
    })

    return list(songs.map(serializeSong))
  })

  /**
   * GET /v1/songs/getLink → GetAnyResponse4 { status, link }
   *
   * Resolves the playable track for a song. This server answers from its own
   * `link` / `link_video` columns and never contacts YouTube: the client passes a
   * youtube_id because that is the key the original service used, not because a
   * stream has to be fetched from there. A song with no uploaded media returns
   * status 0 and an empty link, which the client renders as its not-found state.
   *
   * `link` is non-null in GetSongLinkResponse's Kotlin constructor, so the
   * failure case must still send "" rather than null — see http/envelope.ts.
   */
  app.get('/v1/songs/getLink', async (req) => {
    const p = params(req)
    const youtubeId = str(p, 'youtube_id')
    if (!youtubeId) throw unprocessable("Missing required parameter 'youtube_id'")

    const type = intOr(p, 'type', SONG_MEDIA_AUDIO)
    const song = await prisma.song.findFirst({ where: { youtubeId, status: 1 } })
    if (!song) return status4(0, '')

    const link = type === SONG_MEDIA_VIDEO ? (song.linkVideo ?? song.link) : (song.link ?? song.linkVideo)
    return link ? status4(1, link) : status4(0, '')
  })

  /**
   * POST /v1/songs/downloadFromYoutube — multipart.
   * The client extracts a track locally and uploads it so the next listener does
   * not have to. Part name is `file`; `type` and `song_id` arrive in the PartMap.
   */
  app.post('/v1/songs/downloadFromYoutube', async (req) => {
    if (!env.allowMediaUpload) throw forbidden('Media upload is disabled (ALLOW_MEDIA_UPLOAD=false)')

    const { files, fields } = await consumeMultipart(req, { allow: ['file'], subdir: 'songs' })
    const upload = files.file
    if (!upload) throw unprocessable("Missing required multipart part 'file'")

    const songId = int(fields, 'song_id')
    if (!songId) throw unprocessable("Missing required parameter 'song_id'")

    const song = await prisma.song.findUnique({ where: { id: songId } })
    if (!song) throw notFound(`No song with id ${songId}`)

    const type = intOr(fields, 'type', SONG_MEDIA_AUDIO)
    await prisma.song.update({
      where: { id: songId },
      data: type === SONG_MEDIA_VIDEO ? { linkVideo: upload.url } : { link: upload.url },
    })

    return ok({ status: 1, link: upload.url })
  })

  // Registered last so the static paths above are not shadowed by :id in any
  // router that resolves in declaration order.
  app.get<{ Params: IdParam }>('/v1/songs/:id', async (req) => {
    const id = Number.parseInt(req.params.id, 10)
    const song = await prisma.song.findUnique({ where: { id } })
    if (!song) throw notFound(`No song with id ${id}`)
    return item(serializeSong(song))
  })
}
