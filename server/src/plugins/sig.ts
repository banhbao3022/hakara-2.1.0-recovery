import { createHmac, timingSafeEqual } from 'node:crypto'
import type { FastifyInstance } from 'fastify'
import { env } from '../env.js'
import { unauthorized } from '../http/errors.js'

/**
 * HMAC-SHA256 request signature, matching Interceptor.kt.
 *
 * The client builds a canonical string from four header values in a fixed order
 * and signs it with a key returned by NativeUtils.getAppKey(), which lives in
 * libAudioEngine.so. That key is not shipped with this server and is not
 * extracted from the binary here, so verification is off unless the operator
 * supplies APP_KEY and sets REQUIRE_SIG=true.
 */

export function canonicalString(headers: {
  appVersion: string
  currentTime: string
  os: string
  uniqueId: string
}): string {
  return (
    `App-Version=${headers.appVersion}` +
    `&Current-Time=${headers.currentTime}` +
    `&Os=${headers.os}` +
    `&Unique-Id=${headers.uniqueId}`
  )
}

export function computeSig(key: string, data: string): string {
  return createHmac('sha256', key).update(data, 'utf8').digest('hex')
}

function equal(a: string, b: string): boolean {
  const left = Buffer.from(a, 'utf8')
  const right = Buffer.from(b, 'utf8')
  if (left.length !== right.length) return false
  return timingSafeEqual(left, right)
}

export function registerSig(app: FastifyInstance): void {
  if (!env.requireSig) {
    app.log.warn(
      'Request signature verification is disabled (REQUIRE_SIG=false). ' +
        'Set APP_KEY and REQUIRE_SIG=true to enforce the client Sig header.',
    )
    return
  }

  app.addHook('onRequest', async (req) => {
    // Media is fetched by the player and by Glide, neither of which goes through
    // the signing interceptor.
    if (req.url.startsWith('/media/') || req.url === '/health') return

    const h = req.headers
    const sig = h['sig']
    const appVersion = h['app-version']
    const currentTime = h['current-time']
    const os = h['os']
    const uniqueId = h['unique-id']

    if (
      typeof sig !== 'string' ||
      typeof appVersion !== 'string' ||
      typeof currentTime !== 'string' ||
      typeof os !== 'string' ||
      typeof uniqueId !== 'string'
    ) {
      throw unauthorized('Missing request signature headers')
    }

    if (env.sigMaxSkewSeconds > 0) {
      const sent = Number.parseInt(currentTime, 10)
      if (!Number.isFinite(sent)) throw unauthorized('Malformed Current-Time header')
      const skew = Math.abs(Math.floor(Date.now() / 1000) - sent)
      if (skew > env.sigMaxSkewSeconds) throw unauthorized('Request signature has expired')
    }

    const expected = computeSig(env.appKey, canonicalString({ appVersion, currentTime, os, uniqueId }))
    if (!equal(expected, sig.toLowerCase())) throw unauthorized('Invalid request signature')
  })
}
