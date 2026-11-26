/**
 * Response envelopes, matching the client's wrapper classes in
 * mtp/media/karaoke/data/remote/response/.
 *
 * GetItemResponse / BaseItemResponse  → { data: {...} }
 * GetListResponse / BaseListResponse  → { data: [...] }
 *
 * The four flat shapes below are separate Kotlin classes, not envelopes, and
 * two of them have non-null String fields whose constructors call
 * Intrinsics.checkNotNullParameter — so `message` and `link` are never omitted
 * and never null.
 */

export const item = <T>(data: T) => ({ data })

export const list = <T>(data: readonly T[]) => ({ data })

/** GetAnyResponse extends BaseItemResponse<Object>: still the { data } envelope. */
export const ok = (data: unknown = { status: 1 }) => ({ data })

/** GetAnyResponse2 (GetCommonResponse) — POST /v1/recordings/pin */
export const status2 = (status: number, message: string) => ({ status, message: message ?? '' })

/** GetAnyResponse3 (GetExchangeDiamondsResponse) — POST /v1/diamonds/apple/exchange */
export const status3 = (status: number, amount: number) => ({ status, amount })

/** GetAnyResponse4 (GetSongLinkResponse) — GET /v1/songs/getLink */
export const status4 = (status: number, link: string | null | undefined) => ({
  status,
  link: link ?? '',
})

/** GetCollectedRewardResponse — POST /v1/daily-task/collect-reward */
export const reward = (status: number, coins: number, diamonds: number, exps: number) => ({
  status,
  coins,
  diamonds,
  exps,
})
