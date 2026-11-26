import fastifyJwt from '@fastify/jwt'
import type { FastifyInstance, FastifyRequest } from 'fastify'
import type { User } from '@prisma/client'
import { env } from '../env.js'
import { prisma } from '../lib/prisma.js'
import { unauthorized } from '../http/errors.js'

declare module 'fastify' {
  interface FastifyRequest {
    /** The authenticated user, or null when no usable Bearer token was sent. */
    authUser: User | null
  }
  interface FastifyInstance {
    signAccessToken(user: Pick<User, 'id' | 'uid'>): string
  }
}

export interface AccessTokenPayload {
  sub: number
  uid: string
}

/**
 * Bearer authentication.
 *
 * The client attaches `Authorization: Bearer <access_token>` only when it has
 * one in SharedPreferences (Interceptor.kt), so most feed routes must work
 * unauthenticated and simply omit the viewer-specific fields. Authentication is
 * therefore resolved for every request and *enforced* per route via requireUser.
 */
export async function registerAuth(app: FastifyInstance): Promise<void> {
  await app.register(fastifyJwt, {
    secret: env.jwtSecret,
    sign: { expiresIn: env.jwtExpiresIn },
  })

  app.decorate('signAccessToken', (user: Pick<User, 'id' | 'uid'>) =>
    app.jwt.sign({ sub: user.id, uid: user.uid } satisfies AccessTokenPayload),
  )

  app.decorateRequest('authUser', null)

  app.addHook('onRequest', async (req) => {
    const header = req.headers.authorization
    if (!header?.startsWith('Bearer ')) return

    const token = header.slice('Bearer '.length).trim()
    if (!token) return

    let payload: AccessTokenPayload
    try {
      payload = app.jwt.verify<AccessTokenPayload>(token)
    } catch {
      // An expired or forged token is treated as anonymous rather than fatal:
      // the client keeps a stale token after a reinstall and would otherwise be
      // locked out of the public feeds it is allowed to read.
      return
    }

    const user = await prisma.user.findUnique({ where: { id: payload.sub } })
    if (user) req.authUser = user
  })
}

/** Use in any handler that cannot serve an anonymous caller. */
export function requireUser(req: FastifyRequest): User {
  if (!req.authUser) throw unauthorized('A valid access token is required for this request')
  return req.authUser
}
