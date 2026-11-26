import { existsSync, readFileSync } from 'node:fs'
import { resolve } from 'node:path'
import { describe, expect, it } from 'vitest'
import {
  serializeComment,
  serializeDuet,
  serializeExploreSection,
  serializeGift,
  serializeImage,
  serializeNotification,
  serializePresent,
  serializeRecording,
  serializeSong,
  serializeTask,
  serializeUser,
  type ViewerContext,
} from '../src/serializers/index.js'

/**
 * These assert the serializers against the decompiled client's own model
 * classes rather than against a hand-copied list of field names. A rename in
 * either place is then a test failure, not a blank row on a phone.
 */

const MODEL_DIR = resolve(
  process.cwd(),
  process.env.MODEL_DIR_PATH ??
    '../extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model',
)

const haveModels = existsSync(MODEL_DIR)

/**
 * Extract the JSON keys Gson will bind for one model class:
 *  - an @SerializedName("x") annotation names the next field explicitly;
 *  - otherwise Gson uses the Java field name;
 *  - JADX rewrites a field called `id` to `f33501id` and leaves a
 *    "renamed from: id" comment, so `f<digits><name>` unwraps back to <name>.
 */
function jsonKeysOf(className: string): string[] {
  const source = readFileSync(resolve(MODEL_DIR, `${className}.java`), 'utf8')
  const keys: string[] = []
  let pending: string | null = null

  for (const line of source.split('\n')) {
    const trimmed = line.trim()

    const annotated = /^@SerializedName\("([^"]+)"\)$/.exec(trimmed)
    if (annotated?.[1]) {
      pending = annotated[1]
      continue
    }

    const field = /^private\s+(?:final\s+)?[\w.<>,\s[\]]+?\s+(\w+);$/.exec(trimmed)
    if (!field?.[1]) continue

    if (pending) {
      keys.push(pending)
      pending = null
      continue
    }

    const name = field[1]
    const unwrapped = /^f\d+(\w+)$/.exec(name)
    keys.push(unwrapped?.[1] ?? name)
  }

  return keys
}

const at = new Date(Date.UTC(2026, 10, 24, 4, 22, 7))
const base = { createdAt: at, updatedAt: at }

const user = {
  id: 7,
  uid: 'uid-7',
  fbUserId: null,
  ggUserId: 'g-7',
  fullName: 'Mai Anh',
  email: null,
  address: null,
  city: null,
  country: null,
  language: null,
  region: null,
  phone: null,
  avatar: null,
  cover: null,
  gender: 0,
  birthday: null,
  bio: null,
  exps: 150,
  diamonds: 10,
  coins: 20,
  stars: 30,
  label: null,
  lat: 10.7,
  long: 106.7,
  recordingCount: 3,
  notificationCount: 0,
  followingCount: 2,
  followerCount: 2,
  giftCount: 1,
  playCount: 40,
  ...base,
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
} as any

const song = {
  id: 1,
  name: 'Hạ Trắng',
  artist: 'Trịnh Công Sơn',
  youtubeId: 'seed0000001',
  playerIasUrl: null,
  thumbnail: null,
  cover: null,
  link: 'http://host/media/seed/song-1.wav',
  linkVideo: null,
  trending: 3,
  duetSinger: 0,
  recordCount: 2,
  region: null,
  status: 1,
  type: 1,
  ...base,
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
} as any

const recording = {
  id: 11,
  name: 'Hạ Trắng',
  slug: 'ha-trang-11',
  userId: 7,
  songId: 1,
  duetId: null,
  message: null,
  thumbnail: null,
  url: 'http://host/media/recordings/a.m4a',
  urlVideoResize: null,
  shareUrl: 'http://host/r/11',
  type: 0,
  format: 0,
  videoRatio: 0,
  privacy: 1,
  pin: 0,
  status: 1,
  duration: 96,
  effect: 0,
  effectCustom: null,
  useHeadphone: true,
  imageIds: null,
  lat: 10.7,
  long: 106.7,
  playCount: 1,
  likeCount: 0,
  commentCount: 0,
  shareCount: 0,
  duetCount: 0,
  giftCount: 0,
  starCount: 0,
  user,
  song,
  ...base,
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
} as any

const ctx: ViewerContext = {}

describe.skipIf(!haveModels)('field names match the decompiled client models', () => {
  const cases: [label: string, file: string, output: object][] = [
    ['User', 'User.java', serializeUser(user, ctx)],
    ['Song', 'Song.java', serializeSong(song)],
    ['Recording', 'Recording.java', serializeRecording(recording, ctx)],
    [
      'Comment',
      'Comment.java',
      serializeComment(
        {
          id: 1,
          userId: 7,
          contentType: 'recording',
          contentId: 11,
          parentId: 0,
          quoteId: 0,
          message: 'hi',
          likeCount: 0,
          replyCount: 0,
          user,
          ...base,
          // eslint-disable-next-line @typescript-eslint/no-explicit-any
        } as any,
        ctx,
      ),
    ],
    [
      'Gift',
      'Gift.java',
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
      serializeGift({ id: 1, name: 'Rose', image: 'r.png', type: 1, amount: 1, exp: 1, stars: 1, status: 1, ...base } as any),
    ],
    [
      'Image',
      'Image.java',
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
      serializeImage({ id: 1, userId: 7, image: 'i.png', ...base } as any),
    ],
    [
      'Simple3',
      'Simple3.java',
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
      serializeExploreSection({ id: 1, name: 'Trending', type: 1, layoutType: 1, feed: 'trending', position: 0, status: 1, ...base } as any),
    ],
  ]

  for (const [label, file, output] of cases) {
    it(`${label} emits every key ${file} declares`, () => {
      const expected = jsonKeysOf(file.replace('.java', ''))
      expect(expected.length).toBeGreaterThan(0)
      for (const key of expected) {
        expect(Object.keys(output), `${label}.${key} is missing`).toContain(key)
      }
    })
  }
})

describe('the field names that are easy to get wrong', () => {
  it('keeps Song.youtubeId and Song.recordCount camelCase', () => {
    // Song.kt gives these two no @SerializedName, so Gson binds them by field
    // name while every neighbouring key is snake_case.
    const out = serializeSong(song)
    expect(out).toHaveProperty('youtubeId')
    expect(out).toHaveProperty('recordCount')
    expect(out).not.toHaveProperty('youtube_id')
    expect(out).not.toHaveProperty('record_count')
  })

  it('emits duet_id as 0, never null, when a recording is not a duet join', () => {
    // Recording.duet_id is a non-null Int in Kotlin; the column is nullable so
    // the foreign key holds.
    expect(serializeRecording(recording, ctx).duet_id).toBe(0)
    expect(serializeRecording({ ...recording, duetId: 4 }, ctx).duet_id).toBe(4)
  })

  it('emits Simple3.name as "" rather than null', () => {
    // Intrinsics.checkNotNullParameter(name) — a null crashes the Explore screen.
    const out = serializeExploreSection({
      id: 1,
      name: null,
      type: 1,
      layoutType: 0,
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
    } as any)
    expect(out.name).toBe('')
  })

  it('emits duet segments as { n, s, e } with a non-null n', () => {
    const out = serializeDuet({
      id: 1,
      userId: 7,
      songId: 1,
      recordingId: 11,
      joinCount: 0,
      segments: [{ n: 'Part 1', s: 0, e: 30.5 }, { s: 30.5, e: 62 }],
      ...base,
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
    } as any)
    expect(out.segments).toEqual([
      { n: 'Part 1', s: 0, e: 30.5 },
      { n: '', s: 30.5, e: 62 },
    ])
  })

  it('tolerates a segments column that is not an array', () => {
    for (const bad of [null, 'oops', 42, {}]) {
      const out = serializeDuet({
        id: 1,
        userId: 7,
        songId: 1,
        recordingId: 11,
        joinCount: 0,
        segments: bad,
        ...base,
        // eslint-disable-next-line @typescript-eslint/no-explicit-any
      } as any)
      expect(out.segments).toEqual([])
    }
  })

  it('only ever sets access_token on the login routes', () => {
    expect(serializeUser(user, ctx).access_token).toBeNull()
    expect(serializeUser(user, ctx, { accessToken: 'jwt' }).access_token).toBe('jwt')
  })

  it('derives level, current_level_exps and next_level_exps from exps', () => {
    const out = serializeUser({ ...user, exps: 150 }, ctx)
    expect(out.level).toBe(2)
    expect(out.current_level_exps).toBe(50)
    expect(out.next_level_exps).toBe(200)
  })

  it('reports like_status and follow_status from the viewer context', () => {
    const viewer: ViewerContext = {
      userId: 1,
      likedRecordingIds: new Set([11]),
      followedUserIds: new Set([7]),
      distances: new Map([[7, 4.2]]),
    }
    const out = serializeRecording(recording, viewer)
    expect(out.like_status).toBe(true)
    expect(out.user?.follow_status).toBe(true)
    expect(out.user?.distance).toBe(4.2)
  })

  it('defaults both status flags to false for an anonymous viewer', () => {
    const out = serializeRecording(recording, {})
    expect(out.like_status).toBe(false)
    expect(out.user?.follow_status).toBe(false)
    expect(out.user?.distance).toBeNull()
  })

  it('clamps a negative counter to zero', () => {
    // A delete race must not render "-1 comments".
    const out = serializeRecording({ ...recording, commentCount: -1, likeCount: -3 }, ctx)
    expect(out.comment_count).toBe(0)
    expect(out.like_count).toBe(0)
  })

  it('formats every timestamp it emits', () => {
    const pattern = /^\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2}$/
    expect(serializeRecording(recording, ctx).created_at).toMatch(pattern)
    expect(serializeUser(user, ctx).updated_at).toMatch(pattern)
    expect(
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
      serializeImage({ id: 1, userId: 7, image: 'i.png', ...base } as any).created_at,
    ).toMatch(pattern)
  })

  it('does not recurse when a duet embeds its own recording', () => {
    const duet = {
      id: 1,
      userId: 7,
      songId: 1,
      recordingId: 11,
      joinCount: 0,
      segments: [],
      user,
      recording,
      ...base,
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
    } as any
    const out = serializeDuet(duet, ctx)
    expect(out.recording?.id).toBe(11)
    // Recording inside a Duet is serialized with withDuet: false.
    expect(out.recording?.duet).toBeNull()
  })

  it('reports daily-task progress and the streak ladders', () => {
    const out = serializeTask({
      id: 1,
      name: 'Daily Check-in',
      type: 1,
      goal: 1,
      coin: 10,
      diamond: 0,
      exp: 5,
      coins: [10, 20, 30],
      diamonds: [0, 0, 1],
      exps: [5, 10, 15],
      status: 1,
      logs: [
        { id: 1, userId: 7, dailyTaskId: 1, day: 2, progress: 1, status: 0, date: '2026-11-24', ...base },
      ],
      ...base,
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
    } as any)
    expect(out.finished_count).toBe(1)
    expect(out.coins).toEqual([10, 20, 30])
    expect(out.log?.day).toBe(2)
  })

  it('emits a null log when the user has no progress today', () => {
    const out = serializeTask({
      id: 1,
      name: 'Daily Check-in',
      type: 1,
      goal: 1,
      coin: 10,
      diamond: 0,
      exp: 5,
      coins: [],
      diamonds: [],
      exps: [],
      logs: [],
      ...base,
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
    } as any)
    expect(out.log).toBeNull()
    expect(out.finished_count).toBe(0)
  })

  it('serializes a notification sender and a present gift', () => {
    const notif = serializeNotification({
      id: 1,
      userId: 7,
      sender: user,
      title: 'Mai Anh',
      message: 'liked your recording',
      contentId: 11,
      subContentId: null,
      type: 'like',
      subType: 'recording',
      image: null,
      isRead: 0,
      pushedAt: at,
      ...base,
    })
    expect(notif.sender?.id).toBe(7)
    expect(notif.is_read).toBe(0)
    expect(notif.pushed_at).toMatch(/^\d{4}-\d{2}-\d{2} /)

    const present = serializePresent({
      id: 1,
      userId: 7,
      receiverId: 8,
      recordingId: 11,
      giftId: 1,
      quantity: 2,
      stars: 2,
      user,
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
      gift: { id: 1, name: 'Rose', image: 'r.png', type: 1, amount: 1, exp: 1, stars: 1, status: 1, ...base } as any,
      ...base,
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
    } as any)
    expect(present.gift?.name).toBe('Rose')
    expect(present.quantity).toBe(2)
  })
})
