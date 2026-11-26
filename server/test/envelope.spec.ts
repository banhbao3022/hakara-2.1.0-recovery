import { describe, expect, it } from 'vitest'
import { item, list, ok, reward, status2, status3, status4 } from '../src/http/envelope.js'
import { levelFor, totalExpsForLevel } from '../src/lib/leveling.js'

describe('response envelopes', () => {
  it('wraps a single item as { data: {...} }', () => {
    expect(item({ id: 1 })).toEqual({ data: { id: 1 } })
  })

  it('wraps a list as { data: [...] }, never a bare array', () => {
    expect(list([{ id: 1 }])).toEqual({ data: [{ id: 1 }] })
    expect(list([])).toEqual({ data: [] })
  })

  it('wraps GetAnyResponse in the item envelope too', () => {
    // GetAnyResponse extends BaseItemResponse<Object>, so it is { data }, not flat.
    expect(ok()).toEqual({ data: { status: 1 } })
  })
})

describe('flat response shapes with non-null Kotlin fields', () => {
  /**
   * GetAnyResponse2.message and GetAnyResponse4.link are non-null String in
   * Kotlin — their constructors call Intrinsics.checkNotNullParameter. A JSON
   * null there is a crash on the device, not an empty label.
   */
  it('never emits a null link, even on the not-found path', () => {
    expect(status4(0, null)).toEqual({ status: 0, link: '' })
    expect(status4(0, undefined)).toEqual({ status: 0, link: '' })
    expect(status4(1, 'http://host/media/a.wav')).toEqual({
      status: 1,
      link: 'http://host/media/a.wav',
    })
  })

  it('never emits a null message', () => {
    expect(status2(1, 'Pinned')).toEqual({ status: 1, message: 'Pinned' })
    expect(status2(1, undefined as unknown as string)).toEqual({ status: 1, message: '' })
  })

  it('emits the exchange and reward shapes flat, not enveloped', () => {
    expect(status3(1, 700)).toEqual({ status: 1, amount: 700 })
    expect(reward(1, 10, 0, 5)).toEqual({ status: 1, coins: 10, diamonds: 0, exps: 5 })
  })
})

describe('levelling', () => {
  it('starts every account at level 1 with a non-zero bar', () => {
    const l = levelFor(0)
    expect(l.level).toBe(1)
    expect(l.currentLevelExps).toBe(0)
    expect(l.nextLevelExps).toBeGreaterThan(0)
  })

  it('advances exactly on the threshold', () => {
    expect(levelFor(99).level).toBe(1)
    expect(levelFor(100).level).toBe(2)
    expect(levelFor(299).level).toBe(2)
    expect(levelFor(300).level).toBe(3)
  })

  it('keeps current_level_exps inside [0, next_level_exps)', () => {
    for (const exps of [0, 1, 99, 100, 250, 1000, 54_321]) {
      const l = levelFor(exps)
      expect(l.currentLevelExps).toBeGreaterThanOrEqual(0)
      expect(l.currentLevelExps).toBeLessThan(l.nextLevelExps)
      expect(totalExpsForLevel(l.level)).toBeLessThanOrEqual(exps)
      expect(totalExpsForLevel(l.level + 1)).toBeGreaterThan(exps)
    }
  })

  it('never returns level 0 or NaN for junk input', () => {
    expect(levelFor(-50).level).toBe(1)
    expect(levelFor(Number.NaN).level).toBe(1)
  })
})
