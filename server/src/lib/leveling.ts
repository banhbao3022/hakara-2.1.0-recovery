/**
 * The client renders a level bar from User.level, current_level_exps and
 * next_level_exps, but only `exps` is a stored quantity — the other three are
 * derived here so the bar is always internally consistent.
 *
 * Level n is reached at 100 * n * (n - 1) / 2 total exps: 0, 100, 300, 600, …
 */

const STEP = 100

export function totalExpsForLevel(level: number): number {
  const n = Math.max(1, level)
  return (STEP * n * (n - 1)) / 2
}

export interface LevelInfo {
  level: number
  currentLevelExps: number
  nextLevelExps: number
}

export function levelFor(exps: number): LevelInfo {
  // NaN propagates silently through every Math call below and serializes as
  // JSON null, which is a crash in the client — User.level is a non-null Int.
  const total = Number.isFinite(exps) ? Math.max(0, Math.trunc(exps)) : 0
  // Invert total = 100 * n * (n - 1) / 2 for the largest n with threshold <= total.
  const level = Math.max(1, Math.floor((1 + Math.sqrt(1 + (8 * total) / STEP)) / 2))
  const floor = totalExpsForLevel(level)
  const ceiling = totalExpsForLevel(level + 1)
  return {
    level,
    currentLevelExps: total - floor,
    nextLevelExps: ceiling - floor,
  }
}
