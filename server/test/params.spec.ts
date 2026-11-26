import { describe, expect, it } from 'vitest'
import type { FastifyRequest } from 'fastify'
import {
  bool,
  int,
  intList,
  pagination,
  params,
  reqInt,
  reqStr,
  str,
} from '../src/http/params.js'

const req = (query: unknown, body?: unknown) =>
  ({ query, body }) as unknown as FastifyRequest

describe('params() — query wins over body', () => {
  /**
   * The rule this whole helper exists for. Retrofit annotates nearly every
   * write route in ApiService.java with @Query / @QueryMap, so a handler that
   * reads only req.body sees nothing on POST /v1/comments and friends.
   */
  it('reads parameters sent only in the query string', () => {
    const p = params(req({ commentable_id: '42', message: 'hi' }))
    expect(int(p, 'commentable_id')).toBe(42)
    expect(str(p, 'message')).toBe('hi')
  })

  it('reads parameters sent only in the body', () => {
    const p = params(req({}, { ids: [1, 2, 3] }))
    expect(p.ids).toEqual([1, 2, 3])
  })

  it('prefers the query value when a key appears in both', () => {
    const p = params(req({ privacy: '0' }, { privacy: '1' }))
    expect(int(p, 'privacy')).toBe(0)
  })

  it('ignores a non-object body rather than throwing', () => {
    expect(() => params(req({ a: '1' }, 'not json'))).not.toThrow()
    expect(params(req({ a: '1' }, Buffer.from('x')))).toEqual({ a: '1' })
    expect(params(req({ a: '1' }, [1, 2]))).toEqual({ a: '1' })
  })

  it('treats a missing query and body as an empty bag', () => {
    expect(params(req(undefined, undefined))).toEqual({})
  })
})

describe('coercion', () => {
  it('treats an empty string as absent, because Retrofit omits null params', () => {
    const p = params(req({ q: '', page: '  ' }))
    expect(str(p, 'q')).toBeUndefined()
    expect(int(p, 'page')).toBeUndefined()
  })

  it('takes the last value of a repeated query parameter', () => {
    expect(int(params(req({ page: ['1', '3'] })), 'page')).toBe(3)
  })

  it('rejects a non-numeric value with a 422', () => {
    expect(() => int(params(req({ page: 'abc' })), 'page')).toThrowError(/not an integer/)
  })

  it('raises a 422 naming the missing parameter', () => {
    expect(() => reqStr(params(req({})), 'message')).toThrowError(/'message'/)
    expect(() => reqInt(params(req({})), 'song_id')).toThrowError(/'song_id'/)
  })

  it('accepts both "1"/"0" and "true"/"false" for booleans', () => {
    const p = params(req({ a: '1', b: '0', c: 'true', d: 'false', e: true }))
    expect(bool(p, 'a')).toBe(true)
    expect(bool(p, 'b')).toBe(false)
    expect(bool(p, 'c')).toBe(true)
    expect(bool(p, 'd')).toBe(false)
    expect(bool(p, 'e')).toBe(true)
    expect(bool(p, 'missing')).toBeUndefined()
  })

  it('splits comma-separated id lists, as sent by sendInviteDuet', () => {
    expect(intList(params(req({ user_ids: '4,9, 12' })), 'user_ids')).toEqual([4, 9, 12])
    expect(intList(params(req({ user_ids: '' })), 'user_ids')).toEqual([])
    expect(intList(params(req({})), 'user_ids')).toEqual([])
  })

  it('drops unparseable entries from an id list rather than failing the request', () => {
    expect(intList(params(req({ image_ids: '1,,x,4' })), 'image_ids')).toEqual([1, 4])
  })
})

describe('pagination', () => {
  it('is 1-based and clamps a nonsense page', () => {
    expect(pagination(params(req({ page: '1' })))).toMatchObject({ page: 1, skip: 0 })
    expect(pagination(params(req({ page: '3' })))).toMatchObject({ page: 3, skip: 40 })
    expect(pagination(params(req({ page: '0' })))).toMatchObject({ page: 1, skip: 0 })
    expect(pagination(params(req({ page: '-5' })))).toMatchObject({ page: 1, skip: 0 })
  })

  it('honours the per-route default the client sends', () => {
    // GET /v1/songs sends per_page=100; GET /v1/images/list sends 16.
    expect(pagination(params(req({})), 100).take).toBe(100)
    expect(pagination(params(req({})), 16).take).toBe(16)
    expect(pagination(params(req({ per_page: '16' })), 100).take).toBe(16)
  })

  it('caps per_page so a client cannot ask for the whole table', () => {
    expect(pagination(params(req({ per_page: '100000' }))).take).toBe(100)
  })
})
