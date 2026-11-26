import { describe, expect, it } from 'vitest'
import { fmt, previousDay, today } from '../src/lib/datetime.js'

describe('timestamp format', () => {
  /**
   * The client parses with SimpleDateFormat("yyyy-MM-dd HH:mm:ss"). An ISO-8601
   * string produces a null Date there, so every "x minutes ago" label silently
   * breaks. This is the single most load-bearing format in the response.
   */
  it('emits yyyy-MM-dd HH:mm:ss, never ISO-8601', () => {
    const value = fmt(new Date(Date.UTC(2026, 10, 24, 4, 22, 7)))
    expect(value).toBe('2026-11-24 04:22:07')
    expect(value).not.toContain('T')
    expect(value).not.toContain('Z')
    expect(value).toMatch(/^\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2}$/)
  })

  it('zero-pads every component', () => {
    expect(fmt(new Date(Date.UTC(2026, 0, 2, 3, 4, 5)))).toBe('2026-01-02 03:04:05')
  })

  it('passes null through, for nullable columns like pushed_at', () => {
    expect(fmt(null)).toBeNull()
    expect(fmt(undefined)).toBeNull()
  })
})

describe('calendar day helpers', () => {
  it('derives a yyyy-MM-dd key for the daily-task log', () => {
    expect(today(new Date(Date.UTC(2026, 10, 24, 23, 59, 59)))).toBe('2026-11-24')
  })

  it('steps back across a month boundary', () => {
    expect(previousDay('2026-11-01')).toBe('2026-10-31')
  })

  it('steps back across a year boundary', () => {
    expect(previousDay('2026-01-01')).toBe('2025-12-31')
  })

  it('steps back across a leap day', () => {
    expect(previousDay('2028-03-01')).toBe('2028-02-29')
  })
})
