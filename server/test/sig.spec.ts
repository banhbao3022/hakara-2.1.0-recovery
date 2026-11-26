import { createHmac } from 'node:crypto'
import { describe, expect, it } from 'vitest'
import { canonicalString, computeSig } from '../src/plugins/sig.js'

describe('request signature', () => {
  /**
   * The canonical string is built in Interceptor.kt from four header values in
   * this exact order and with these exact separators. Any difference — a
   * reordered key, a trailing &, a different case — produces a valid-looking
   * signature that never matches the client's.
   */
  it('matches the client string byte for byte', () => {
    expect(
      canonicalString({
        appVersion: '2.1.0',
        currentTime: '1700000000',
        os: '11',
        uniqueId: 'abc123',
      }),
    ).toBe('App-Version=2.1.0&Current-Time=1700000000&Os=11&Unique-Id=abc123')
  })

  it('produces lowercase hex HMAC-SHA256, as the client does', () => {
    const data = canonicalString({
      appVersion: '2.1.0',
      currentTime: '1700000000',
      os: '14',
      uniqueId: 'device-xyz',
    })
    const sig = computeSig('secret-app-key', data)

    expect(sig).toMatch(/^[0-9a-f]{64}$/)
    expect(sig).toBe(createHmac('sha256', 'secret-app-key').update(data, 'utf8').digest('hex'))
  })

  it('changes when any single input changes', () => {
    const base = { appVersion: '2.1.0', currentTime: '1700000000', os: '11', uniqueId: 'a' }
    const sig = computeSig('k', canonicalString(base))

    expect(computeSig('k', canonicalString({ ...base, os: '14' }))).not.toBe(sig)
    expect(computeSig('k', canonicalString({ ...base, uniqueId: 'b' }))).not.toBe(sig)
    expect(computeSig('k', canonicalString({ ...base, currentTime: '1700000001' }))).not.toBe(sig)
    expect(computeSig('other-key', canonicalString(base))).not.toBe(sig)
  })

  it('handles non-ASCII in the device id without throwing', () => {
    const data = canonicalString({
      appVersion: '2.1.0',
      currentTime: '1700000000',
      os: '11',
      uniqueId: 'thiết-bị-🎤',
    })
    expect(computeSig('k', data)).toMatch(/^[0-9a-f]{64}$/)
  })
})
