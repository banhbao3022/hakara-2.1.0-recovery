import { env } from '../env.js'

const pad = (n: number, width = 2) => String(n).padStart(width, '0')

function shifted(date: Date): Date {
  return new Date(date.getTime() + env.displayTzOffsetMinutes * 60_000)
}

/**
 * Format for the client, which parses with SimpleDateFormat("yyyy-MM-dd HH:mm:ss").
 * An ISO-8601 string yields a null Date there and breaks every relative-time label.
 */
export function fmt(date: Date): string
export function fmt(date: Date | null | undefined): string | null
export function fmt(date: Date | null | undefined): string | null {
  if (!date) return null
  const d = shifted(date)
  return (
    `${d.getUTCFullYear()}-${pad(d.getUTCMonth() + 1)}-${pad(d.getUTCDate())} ` +
    `${pad(d.getUTCHours())}:${pad(d.getUTCMinutes())}:${pad(d.getUTCSeconds())}`
  )
}

/** Calendar day in the display timezone, as yyyy-MM-dd. Keys the daily-task logs. */
export function today(now = new Date()): string {
  const d = shifted(now)
  return `${d.getUTCFullYear()}-${pad(d.getUTCMonth() + 1)}-${pad(d.getUTCDate())}`
}

/** The calendar day before `date` (yyyy-MM-dd in, yyyy-MM-dd out). */
export function previousDay(date: string): string {
  const [y, m, d] = date.split('-').map((p) => Number.parseInt(p, 10))
  const t = Date.UTC(y ?? 1970, (m ?? 1) - 1, d ?? 1) - 86_400_000
  const prev = new Date(t)
  return `${prev.getUTCFullYear()}-${pad(prev.getUTCMonth() + 1)}-${pad(prev.getUTCDate())}`
}
