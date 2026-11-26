import Fastify, { type FastifyInstance } from 'fastify'
import cors from '@fastify/cors'
import multipart from '@fastify/multipart'
import fastifyStatic from '@fastify/static'
import { env } from './env.js'
import { registerErrorHandler } from './http/errors.js'
import { registerAuth } from './plugins/auth.js'
import { registerSig } from './plugins/sig.js'
import { MEDIA_ROUTE_PREFIX, ensureStorage, storageRoot } from './lib/storage.js'

import { authRoutes } from './routes/auth.js'
import { userRoutes } from './routes/users.js'
import { songRoutes } from './routes/songs.js'
import { recordingRoutes } from './routes/recordings.js'
import { duetRoutes } from './routes/duets.js'
import { socialRoutes } from './routes/social.js'
import { imageRoutes } from './routes/images.js'
import { notificationRoutes } from './routes/notifications.js'
import { economyRoutes } from './routes/economy.js'
import { taskRoutes } from './routes/tasks.js'
import { exploreRoutes } from './routes/explore.js'
import { keywordRoutes } from './routes/keywords.js'

export interface BuildOptions {
  /**
   * Called once per registered route. Used by scripts/check-routes.ts to assert
   * that every route the decompiled client calls is actually served.
   */
  onRoute?: (route: { method: string | string[]; url: string }) => void
}

export async function buildApp(opts: BuildOptions = {}): Promise<FastifyInstance> {
  await ensureStorage()

  const app = Fastify({
    logger: { level: env.logLevel },
    bodyLimit: env.maxUploadBytes,
  })

  // Must be added before any route registers; onRoute propagates into the
  // child contexts each route plugin creates.
  if (opts.onRoute) app.addHook('onRoute', opts.onRoute)

  registerErrorHandler(app)

  /**
   * Retrofit sends POST and PUT requests whose parameters are all @Query with no
   * body at all. OkHttp still sets Content-Length: 0, and some paths set
   * Content-Type: application/json with an empty payload — which Fastify's JSON
   * parser rejects as "Body cannot be empty". Treat an empty payload as {}.
   */
  app.addContentTypeParser(
    'application/json',
    { parseAs: 'string' },
    (_req, body: string, done) => {
      if (!body || !body.trim()) return done(null, {})
      try {
        done(null, JSON.parse(body))
      } catch (err) {
        done(err as Error, undefined)
      }
    },
  )

  app.addContentTypeParser(
    'application/x-www-form-urlencoded',
    { parseAs: 'string' },
    (_req, body: string, done) => {
      done(null, Object.fromEntries(new URLSearchParams(body)))
    },
  )

  // A POST with Content-Length: 0 and no Content-Type at all.
  app.addContentTypeParser('*', { parseAs: 'buffer' }, (req, body: Buffer, done) => {
    if (!body || body.length === 0) return done(null, {})
    if (req.headers['content-type']?.startsWith('multipart/')) return done(null, undefined)
    done(null, {})
  })

  await app.register(cors, { origin: true })

  await app.register(multipart, {
    limits: {
      fileSize: env.maxUploadBytes,
      files: 4,
      fields: 40,
    },
  })

  registerSig(app)
  await registerAuth(app)

  await app.register(fastifyStatic, {
    root: storageRoot(),
    prefix: `${MEDIA_ROUTE_PREFIX}/`,
    // Directory listing is the subject of a path-traversal advisory in this
    // plugin and nothing here needs it.
    index: false,
    list: false,
    decorateReply: false,
  })

  app.get('/health', async () => ({ status: 1, message: 'ok' }))

  await app.register(authRoutes)
  await app.register(userRoutes)
  await app.register(songRoutes)
  await app.register(recordingRoutes)
  await app.register(duetRoutes)
  await app.register(socialRoutes)
  await app.register(imageRoutes)
  await app.register(notificationRoutes)
  await app.register(economyRoutes)
  await app.register(taskRoutes)
  await app.register(exploreRoutes)
  await app.register(keywordRoutes)

  return app
}
