import type { FastifyRequest } from 'fastify'
import { unprocessable } from './errors.js'

export type Params = Record<string, unknown>

/**
 * Read request parameters from the query string *and* the body, query winning.
 *
 * This exists because of how the client is built: almost every write route in
 * ApiService.java is annotated @Query / @QueryMap rather than @Body, so Retrofit
 * sends e.g. `POST /v1/comments?commentable_id=1&message=hi` with no body at all.
 * Only POST /v1/duets/{id} and POST /v1/images/deletes use @Body. Multipart
 * routes put their scalars in a @PartMap, which lands here as the parsed body.
 *
 * Every handler reads through this helper so neither transport is special-cased.
 */
export function params(req: FastifyRequest): Params {
  const query = (req.query ?? {}) as Params
  const body =
    req.body && typeof req.body === 'object' && !Buffer.isBuffer(req.body) && !Array.isArray(req.body)
      ? (req.body as Params)
      : {}
  return { ...body, ...query }
}

/** Treat empty string as absent — Retrofit omits null @Query values entirely. */
function raw(p: Params, key: string): unknown {
  const v = p[key]
  if (v === undefined || v === null) return undefined
  if (typeof v === 'string' && v.trim() === '') return undefined
  // A repeated query param arrives as an array; the client never sends one, so
  // take the last value rather than failing.
  if (Array.isArray(v)) return v.length ? v[v.length - 1] : undefined
  return v
}

export function str(p: Params, key: string): string | undefined {
  const v = raw(p, key)
  return v === undefined ? undefined : String(v)
}

export function reqStr(p: Params, key: string): string {
  const v = str(p, key)
  if (v === undefined) throw unprocessable(`Missing required parameter '${key}'`)
  return v
}

export function int(p: Params, key: string): number | undefined {
  const v = raw(p, key)
  if (v === undefined) return undefined
  const n = typeof v === 'number' ? v : Number.parseInt(String(v), 10)
  if (!Number.isFinite(n)) throw unprocessable(`Parameter '${key}' is not an integer`)
  return Math.trunc(n)
}

export function reqInt(p: Params, key: string): number {
  const v = int(p, key)
  if (v === undefined) throw unprocessable(`Missing required parameter '${key}'`)
  return v
}

export function intOr(p: Params, key: string, fallback: number): number {
  return int(p, key) ?? fallback
}

export function num(p: Params, key: string): number | undefined {
  const v = raw(p, key)
  if (v === undefined) return undefined
  const n = typeof v === 'number' ? v : Number.parseFloat(String(v))
  if (!Number.isFinite(n)) throw unprocessable(`Parameter '${key}' is not a number`)
  return n
}

/** The client sends booleans as "1"/"0" or "true"/"false" depending on the screen. */
export function bool(p: Params, key: string): boolean | undefined {
  const v = raw(p, key)
  if (v === undefined) return undefined
  if (typeof v === 'boolean') return v
  const s = String(v).toLowerCase()
  if (s === '1' || s === 'true') return true
  if (s === '0' || s === 'false') return false
  throw unprocessable(`Parameter '${key}' is not a boolean`)
}

export function boolOr(p: Params, key: string, fallback: boolean): boolean {
  return bool(p, key) ?? fallback
}

/** `user_ids` / `image_ids` arrive comma-separated: "4,9,12". */
export function intList(p: Params, key: string): number[] {
  const v = raw(p, key)
  if (v === undefined) return []
  const source = Array.isArray(v) ? v : String(v).split(',')
  const out: number[] = []
  for (const part of source) {
    const n = Number.parseInt(String(part).trim(), 10)
    if (Number.isFinite(n)) out.push(n)
  }
  return out
}

export const DEFAULT_PER_PAGE = 20

/** Page is 1-based in the client and never sent as 0. */
export function pagination(
  p: Params,
  defaultPerPage = DEFAULT_PER_PAGE,
): { page: number; perPage: number; skip: number; take: number } {
  const page = Math.max(1, intOr(p, 'page', 1))
  const perPage = Math.min(100, Math.max(1, intOr(p, 'per_page', defaultPerPage)))
  return { page, perPage, skip: (page - 1) * perPage, take: perPage }
}
