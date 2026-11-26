import { randomUUID } from 'node:crypto'
import type { FastifyInstance } from 'fastify'
import type { User } from '@prisma/client'
import { prisma } from '../lib/prisma.js'
import { ok, item } from '../http/envelope.js'
import { params, str, num, int, reqStr } from '../http/params.js'
import { serializeUser } from '../serializers/index.js'
import { unprocessable } from '../http/errors.js'

/**
 * Social login, as the client performs it.
 *
 * Known weakness, stated plainly because it is inherited from the client and not
 * introduced here: the login routes receive only the provider's *user id*
 * (`fb_user_id` / `gg_user_id`) and a display name — never an OAuth access token
 * or ID token (ApiService.java, @QueryMap on both login routes). A server cannot
 * verify an unverifiable claim, so anyone who knows a user's Facebook or Google
 * numeric id can obtain that user's session.
 *
 * Closing this requires a client change: send the provider ID token and verify
 * it in `verifyProviderToken` below. The seam is here so that change is a small
 * one; see README.md § Known weaknesses.
 */
async function verifyProviderToken(
  _provider: 'facebook' | 'google',
  idToken: string | undefined,
): Promise<void> {
  if (!idToken) return // Current client sends none.
  // Intentionally unimplemented: wire the provider's tokeninfo endpoint here and
  // make the absence of a token fatal once the client is updated to send one.
}

type Provider = 'facebook' | 'google'

async function upsertSocialUser(
  provider: Provider,
  input: {
    providerUserId: string
    fullName: string
    email?: string | undefined
    avatar?: string | undefined
  },
): Promise<User> {
  const key = provider === 'facebook' ? 'fbUserId' : 'ggUserId'
  const existing = await prisma.user.findFirst({ where: { [key]: input.providerUserId } })

  if (existing) {
    return prisma.user.update({
      where: { id: existing.id },
      data: {
        fullName: input.fullName || existing.fullName,
        // Do not blank an existing avatar/email when the provider omits them.
        ...(input.email ? { email: input.email } : {}),
        ...(input.avatar ? { avatar: input.avatar } : {}),
      },
    })
  }

  return prisma.user.create({
    data: {
      uid: randomUUID(),
      [key]: input.providerUserId,
      fullName: input.fullName || 'Singer',
      email: input.email ?? null,
      avatar: input.avatar ?? null,
    },
  })
}

export async function authRoutes(app: FastifyInstance): Promise<void> {
  /**
   * POST /v1/auth/device
   * Called from MainActivity on every start, before any login, to register the
   * device and refresh the FCM token. Anonymous by design.
   */
  app.post('/v1/auth/device', async (req) => {
    const p = params(req)
    const uniqueId = reqStr(p, 'unique_id')

    const data = {
      os: str(p, 'os') ?? null,
      osVersion: str(p, 'os_version') ?? null,
      appVersion: str(p, 'app_version') ?? null,
      deviceName: str(p, 'device_name') ?? null,
      brand: str(p, 'brand') ?? null,
      timezone: str(p, 'timezone') ?? null,
      screenWidth: int(p, 'screen_width') ?? null,
      screenHeight: int(p, 'screen_height') ?? null,
      fcmToken: str(p, 'fcm_token') ?? null,
      lat: num(p, 'lat') ?? null,
      long: num(p, 'long') ?? null,
      userId: req.authUser?.id ?? null,
    }

    await prisma.device.upsert({
      where: { uniqueId },
      create: { uniqueId, ...data },
      update: data,
    })

    // The device's last known position doubles as the user's, for the nearby feed.
    if (req.authUser && data.lat !== null && data.long !== null) {
      await prisma.user.update({
        where: { id: req.authUser.id },
        data: { lat: data.lat, long: data.long },
      })
    }

    return ok({ status: 1, message: 'Device registered' })
  })

  for (const provider of ['facebook', 'google'] as const) {
    const idField = provider === 'facebook' ? 'fb_user_id' : 'gg_user_id'

    app.post(`/v1/auth/${provider}/login`, async (req) => {
      const p = params(req)
      const providerUserId = str(p, idField)
      if (!providerUserId) throw unprocessable(`Missing required parameter '${idField}'`)

      await verifyProviderToken(provider, str(p, 'id_token'))

      const user = await upsertSocialUser(provider, {
        providerUserId,
        fullName: str(p, 'full_name') ?? '',
        email: str(p, 'email'),
        avatar: str(p, 'avatar'),
      })

      // Bind the calling device to the account so push can target it.
      const uniqueId = str(p, 'unique_id')
      if (uniqueId) {
        await prisma.device.upsert({
          where: { uniqueId },
          create: { uniqueId, userId: user.id },
          update: { userId: user.id },
        })
      }

      return item(serializeUser(user, {}, { accessToken: app.signAccessToken(user) }))
    })
  }
}
