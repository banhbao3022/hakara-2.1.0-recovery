import { unprocessable } from '../http/errors.js'

/**
 * commentable_type / likeable_type / shareable_type.
 *
 * The decompiled client only ever sends "recording" (the single literal found in
 * the repository layer), but likes on comment rows are reachable from the comment
 * sheet, so both are accepted. Anything else is rejected rather than silently
 * creating an orphan row.
 */
export const TARGET_TYPES = ['recording', 'comment'] as const

export type TargetType = (typeof TARGET_TYPES)[number]

export function targetType(value: string | undefined, fallback: TargetType = 'recording'): TargetType {
  if (value === undefined) return fallback
  const normalized = value.trim().toLowerCase()
  if ((TARGET_TYPES as readonly string[]).includes(normalized)) return normalized as TargetType
  throw unprocessable(
    `Unsupported type '${value}'. Expected one of: ${TARGET_TYPES.join(', ')}`,
  )
}
