import { createWriteStream } from 'node:fs'
import { mkdir } from 'node:fs/promises'
import { randomUUID } from 'node:crypto'
import { extname, join, resolve } from 'node:path'
import { pipeline } from 'node:stream/promises'
import type { FastifyRequest } from 'fastify'
import { env } from '../env.js'
import { unprocessable } from '../http/errors.js'
import type { Params } from '../http/params.js'

/**
 * Local-disk storage. Everything the rest of the server needs goes through
 * `saveStream` and `publicUrl`, so swapping in S3 is a change to this file only.
 */

export const MEDIA_ROUTE_PREFIX = '/media'

export interface SavedFile {
  field: string
  filename: string
  mimetype: string
  /** Path relative to STORAGE_DIR, e.g. "recordings/2026/01/<uuid>.m4a". */
  relPath: string
  /** Absolute URL the client can fetch. */
  url: string
  bytes: number
}

export function storageRoot(): string {
  return resolve(process.cwd(), env.storageDir)
}

export function publicUrl(relPath: string): string {
  return `${env.publicUrl}${MEDIA_ROUTE_PREFIX}/${relPath.split('/').map(encodeURIComponent).join('/')}`
}

export async function ensureStorage(): Promise<void> {
  await mkdir(storageRoot(), { recursive: true })
}

function datedSubdir(subdir: string): string {
  const now = new Date()
  const y = now.getUTCFullYear()
  const m = String(now.getUTCMonth() + 1).padStart(2, '0')
  return `${subdir}/${y}/${m}`
}

/** Keep the original extension, discard the original name — it is attacker-controlled. */
function safeName(filename: string): string {
  const ext = extname(filename).toLowerCase().replace(/[^.a-z0-9]/g, '')
  return `${randomUUID()}${ext.length > 1 && ext.length <= 12 ? ext : ''}`
}

export async function saveStream(
  stream: NodeJS.ReadableStream,
  opts: { field: string; filename: string; mimetype: string; subdir: string },
): Promise<SavedFile> {
  const dir = datedSubdir(opts.subdir)
  await mkdir(join(storageRoot(), dir), { recursive: true })

  const relPath = `${dir}/${safeName(opts.filename)}`
  const absPath = join(storageRoot(), relPath)

  let bytes = 0
  stream.on('data', (chunk: Buffer) => {
    bytes += chunk.length
  })

  await pipeline(stream, createWriteStream(absPath))

  return {
    field: opts.field,
    filename: opts.filename,
    mimetype: opts.mimetype,
    relPath,
    url: publicUrl(relPath),
    bytes,
  }
}

export interface MultipartResult {
  files: Record<string, SavedFile>
  fields: Params
}

/**
 * Drain a multipart request, saving only the file parts named in `allow`.
 *
 * The part names are fixed by the client and are not guessable from the API
 * spec alone — they come from the MultipartBody.Part.createFormData call sites:
 * `audio` / `video_resize` / `thumbnail` in C6797g0.java, `image` in
 * ImageViewModel2.java, `file` in C6799h0.java. Scalars arrive as a @PartMap and
 * land in `fields`.
 *
 * Unexpected file parts are drained rather than ignored: an unread part stalls
 * the request until the connection times out.
 */
export async function consumeMultipart(
  req: FastifyRequest,
  opts: { allow: readonly string[]; subdir: string },
): Promise<MultipartResult> {
  if (!req.isMultipart()) throw unprocessable('Expected a multipart/form-data request')

  const files: Record<string, SavedFile> = {}
  const fields: Params = {}

  for await (const part of req.parts()) {
    if (part.type === 'file') {
      if (!opts.allow.includes(part.fieldname) || files[part.fieldname]) {
        await part.toBuffer().catch(() => undefined)
        continue
      }
      files[part.fieldname] = await saveStream(part.file, {
        field: part.fieldname,
        filename: part.filename || part.fieldname,
        mimetype: part.mimetype,
        subdir: opts.subdir,
      })
      if (part.file.truncated) {
        throw unprocessable(
          `Upload '${part.fieldname}' exceeds MAX_UPLOAD_BYTES (${env.maxUploadBytes} bytes)`,
        )
      }
    } else {
      fields[part.fieldname] = part.value
    }
  }

  return { files, fields }
}
