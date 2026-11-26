import { readFileSync } from 'node:fs'
import { resolve } from 'node:path'

// Minimal .env loader — avoids a dependency for the five lines it would save.
// Values already present in process.env win, so docker-compose overrides work.
function loadDotEnv(file = '.env'): void {
  let raw: string
  try {
    raw = readFileSync(resolve(process.cwd(), file), 'utf8')
  } catch {
    return
  }
  for (const line of raw.split('\n')) {
    const trimmed = line.trim()
    if (!trimmed || trimmed.startsWith('#')) continue
    const eq = trimmed.indexOf('=')
    if (eq < 1) continue
    const key = trimmed.slice(0, eq).trim()
    if (process.env[key] !== undefined) continue
    let value = trimmed.slice(eq + 1).trim()
    if (
      (value.startsWith('"') && value.endsWith('"')) ||
      (value.startsWith("'") && value.endsWith("'"))
    ) {
      value = value.slice(1, -1)
    }
    process.env[key] = value
  }
}

loadDotEnv()

function str(key: string, fallback?: string): string {
  const v = process.env[key]
  if (v === undefined || v === '') {
    if (fallback !== undefined) return fallback
    throw new Error(`Missing required environment variable ${key}`)
  }
  return v
}

function int(key: string, fallback: number): number {
  const v = process.env[key]
  if (v === undefined || v === '') return fallback
  const n = Number.parseInt(v, 10)
  if (!Number.isFinite(n)) throw new Error(`Environment variable ${key} is not an integer: ${v}`)
  return n
}

function bool(key: string, fallback: boolean): boolean {
  const v = process.env[key]
  if (v === undefined || v === '') return fallback
  return v === '1' || v.toLowerCase() === 'true'
}

const requireSig = bool('REQUIRE_SIG', false)
const appKey = process.env.APP_KEY ?? ''

if (requireSig && !appKey) {
  throw new Error(
    'REQUIRE_SIG=true but APP_KEY is empty. The client signs every request with ' +
      'HMAC-SHA256 using a key held in libAudioEngine.so; supply that key as APP_KEY ' +
      'or set REQUIRE_SIG=false.',
  )
}

export const env = {
  port: int('PORT', 8080),
  host: str('HOST', '0.0.0.0'),
  logLevel: str('LOG_LEVEL', 'info'),

  databaseUrl: str('DATABASE_URL'),

  jwtSecret: str('JWT_SECRET', 'change-me-to-a-long-random-string'),
  jwtExpiresIn: str('JWT_EXPIRES_IN', '365d'),

  requireSig,
  appKey,
  sigMaxSkewSeconds: int('SIG_MAX_SKEW_SECONDS', 300),

  storageDir: str('STORAGE_DIR', './storage'),
  publicUrl: str('PUBLIC_URL', 'http://localhost:8080').replace(/\/+$/, ''),
  allowMediaUpload: bool('ALLOW_MEDIA_UPLOAD', true),
  maxUploadBytes: int('MAX_UPLOAD_BYTES', 256 * 1024 * 1024),

  // The client parses timestamps with SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
  // in the *device's* timezone, so a UTC timestamp reads as local time and every
  // "x minutes ago" label is wrong by the device's offset. Set this to the
  // offset the fleet runs in — 420 for Asia/Ho_Chi_Minh.
  displayTzOffsetMinutes: int('DISPLAY_TZ_OFFSET_MINUTES', 0),
} as const

export type Env = typeof env
