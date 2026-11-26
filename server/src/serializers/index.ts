import type {
  Background as DbBackground,
  Comment as DbComment,
  DailyTask as DbDailyTask,
  DailyTaskLog as DbDailyTaskLog,
  Duet as DbDuet,
  ExploreSection as DbExploreSection,
  Gift as DbGift,
  Image as DbImage,
  Keyword as DbKeyword,
  Present as DbPresent,
  Recording as DbRecording,
  Song as DbSong,
  User as DbUser,
} from '@prisma/client'
import { fmt } from '../lib/datetime.js'
import { levelFor } from '../lib/leveling.js'
import { clamp } from '../lib/counters.js'

/**
 * Every client-facing field name is written exactly once, here.
 *
 * Two rules the client enforces and a "looks right" response violates:
 *
 *  - Fields whose Kotlin type is non-null have constructors that call
 *    Intrinsics.checkNotNullParameter — `Simple3.name`, `Duet2.n`. Emitting
 *    null there is a crash on the device, not a blank label, so those default
 *    to "" instead of passing null through.
 *  - Song.youtubeId and Song.recordCount carry no @SerializedName in Song.kt,
 *    so Gson binds them by field name. They are camelCase while every
 *    neighbouring field is snake_case. That asymmetry is deliberate.
 */

export interface ViewerContext {
  userId?: number | undefined
  likedRecordingIds?: Set<number> | undefined
  likedCommentIds?: Set<number> | undefined
  followedUserIds?: Set<number> | undefined
  /** userId → distance in kilometres, populated by the nearby feed only. */
  distances?: Map<number, number> | undefined
}

const EMPTY: ViewerContext = {}

// ---------------------------------------------------------------- User

export type UserRow = DbUser

export function serializeUser(
  u: UserRow,
  ctx: ViewerContext = EMPTY,
  opts: { accessToken?: string } = {},
) {
  const { level, currentLevelExps, nextLevelExps } = levelFor(u.exps)
  return {
    id: u.id,
    uid: u.uid,
    fb_user_id: u.fbUserId,
    gg_user_id: u.ggUserId,
    full_name: u.fullName,
    email: u.email,
    address: u.address,
    city: u.city,
    country: u.country,
    language: u.language,
    region: u.region,
    phone: u.phone,
    avatar: u.avatar,
    cover: u.cover,
    gender: u.gender,
    birthday: u.birthday,
    bio: u.bio,
    level,
    current_level_exps: currentLevelExps,
    next_level_exps: nextLevelExps,
    diamonds: u.diamonds,
    coins: u.coins,
    stars: u.stars,
    exps: u.exps,
    // Only ever non-null on the two login routes.
    access_token: opts.accessToken ?? null,
    recording_count: clamp(u.recordingCount),
    notification_count: clamp(u.notificationCount),
    following_count: clamp(u.followingCount),
    follower_count: clamp(u.followerCount),
    gift_count: clamp(u.giftCount),
    play_count: clamp(u.playCount),
    lat: u.lat,
    long: u.long,
    distance: ctx.distances?.get(u.id) ?? null,
    label: u.label,
    follow_status: ctx.followedUserIds?.has(u.id) ?? false,
    created_at: fmt(u.createdAt),
    updated_at: fmt(u.updatedAt),
  }
}

// ---------------------------------------------------------------- Song

export function serializeSong(s: DbSong) {
  return {
    id: s.id,
    name: s.name,
    artist: s.artist,
    // camelCase on purpose — see the file header.
    youtubeId: s.youtubeId,
    player_ias_url: s.playerIasUrl,
    thumbnail: s.thumbnail,
    cover: s.cover,
    link: s.link,
    link_video: s.linkVideo,
    trending: s.trending,
    duet_singer: s.duetSinger,
    recordCount: clamp(s.recordCount),
    region: s.region,
    status: s.status,
  }
}

// ---------------------------------------------------------------- Duet

export interface DuetSegment {
  n: string
  s: number
  e: number
}

/** Duet2.n is non-null in Kotlin; a null here crashes the duet screen. */
export function serializeSegments(raw: unknown): DuetSegment[] {
  if (!Array.isArray(raw)) return []
  const out: DuetSegment[] = []
  for (const entry of raw) {
    if (!entry || typeof entry !== 'object') continue
    const e = entry as Record<string, unknown>
    out.push({
      n: typeof e.n === 'string' ? e.n : '',
      s: Number.isFinite(Number(e.s)) ? Number(e.s) : 0,
      e: Number.isFinite(Number(e.e)) ? Number(e.e) : 0,
    })
  }
  return out
}

export type DuetRow = DbDuet & {
  user?: UserRow | null
  recording?: RecordingRow | null
}

export type SerializedUser = ReturnType<typeof serializeUser>
export type SerializedSong = ReturnType<typeof serializeSong>
export type SerializedImage = ReturnType<typeof serializeImage>

// Recording embeds Duet and Duet embeds Recording, so at least one of the pair
// needs an explicit return type or the inference is circular.
export interface SerializedDuet {
  id: number
  user_id: number
  song_id: number
  recording_id: number
  join_count: number
  user: SerializedUser | null
  recording: SerializedRecording | null
  segments: DuetSegment[]
  created_at: string | null
  updated_at: string | null
}

export interface SerializedRecording {
  id: number
  name: string
  slug: string | null
  user_id: number
  song_id: number
  duet_id: number
  message: string | null
  thumbnail: string | null
  url: string
  url_video_resize: string | null
  share_url: string | null
  type: number
  format: number
  video_ratio: number
  privacy: number
  pin: number
  status: number
  duration: number
  effect: number
  effect_custom: string | null
  use_headphone: boolean
  image_ids: string | null
  images: SerializedImage[]
  play_count: number
  like_count: number
  like_status: boolean
  comment_count: number
  share_count: number
  duet_count: number
  gift_count: number
  star_count: number
  user: SerializedUser | null
  duet: SerializedDuet | null
  song: SerializedSong | null
  created_at: string | null
  updated_at: string | null
}

export function serializeDuet(d: DuetRow, ctx: ViewerContext = EMPTY): SerializedDuet {
  return {
    id: d.id,
    user_id: d.userId,
    song_id: d.songId,
    recording_id: d.recordingId,
    join_count: clamp(d.joinCount),
    user: d.user ? serializeUser(d.user, ctx) : null,
    // Not expanded here: Duet.recording → Recording.duet would recurse.
    recording: d.recording ? serializeRecording(d.recording, ctx, { withDuet: false }) : null,
    segments: serializeSegments(d.segments),
    created_at: fmt(d.createdAt),
    updated_at: fmt(d.updatedAt),
  }
}

// ---------------------------------------------------------------- Recording

export type RecordingRow = DbRecording & {
  user?: UserRow | null
  song?: DbSong | null
  duet?: DuetRow | null
  images?: DbImage[] | null
}

export function serializeRecording(
  r: RecordingRow,
  ctx: ViewerContext = EMPTY,
  opts: { withDuet?: boolean } = {},
): SerializedRecording {
  const withDuet = opts.withDuet !== false
  return {
    id: r.id,
    name: r.name,
    slug: r.slug,
    user_id: r.userId,
    song_id: r.songId,
    // Nullable in the database so the foreign key holds; the client's field is a
    // non-null int where 0 means "not a duet join".
    duet_id: r.duetId ?? 0,
    message: r.message,
    thumbnail: r.thumbnail,
    url: r.url,
    url_video_resize: r.urlVideoResize,
    share_url: r.shareUrl,
    type: r.type,
    format: r.format,
    video_ratio: r.videoRatio,
    privacy: r.privacy,
    pin: r.pin,
    status: r.status,
    duration: r.duration,
    effect: r.effect,
    effect_custom: r.effectCustom,
    use_headphone: r.useHeadphone,
    image_ids: r.imageIds,
    images: (r.images ?? []).map(serializeImage),
    play_count: clamp(r.playCount),
    like_count: clamp(r.likeCount),
    like_status: ctx.likedRecordingIds?.has(r.id) ?? false,
    comment_count: clamp(r.commentCount),
    share_count: clamp(r.shareCount),
    duet_count: clamp(r.duetCount),
    gift_count: clamp(r.giftCount),
    star_count: clamp(r.starCount),
    user: r.user ? serializeUser(r.user, ctx) : null,
    duet: withDuet && r.duet ? serializeDuet(r.duet, ctx) : null,
    song: r.song ? serializeSong(r.song) : null,
    created_at: fmt(r.createdAt),
    updated_at: fmt(r.updatedAt),
  }
}

// ---------------------------------------------------------------- Comment

export type CommentRow = DbComment & {
  user?: UserRow | null
  quote?: UserRow | null
}

export function serializeComment(c: CommentRow, ctx: ViewerContext = EMPTY) {
  return {
    id: c.id,
    user_id: c.userId,
    user: c.user ? serializeUser(c.user, ctx) : null,
    content_id: c.contentId,
    content_type: c.contentType,
    parent_id: c.parentId,
    quote_id: c.quoteId,
    // Comment.quote is a User in the client, not a Comment — it is the author
    // being replied to, rendered as the "@name" prefix.
    quote: c.quote ? serializeUser(c.quote, ctx) : null,
    message: c.message,
    like_count: clamp(c.likeCount),
    like_status: ctx.likedCommentIds?.has(c.id) ?? false,
    reply_count: clamp(c.replyCount),
    created_at: fmt(c.createdAt),
    updated_at: fmt(c.updatedAt),
  }
}

// ---------------------------------------------------------------- Economy

export function serializeGift(g: DbGift) {
  return {
    id: g.id,
    name: g.name,
    image: g.image,
    type: g.type,
    amount: g.amount,
    exp: g.exp,
    created_at: fmt(g.createdAt),
    updated_at: fmt(g.updatedAt),
  }
}

export type PresentRow = DbPresent & {
  user?: UserRow | null
  gift?: DbGift | null
}

export function serializePresent(p: PresentRow, ctx: ViewerContext = EMPTY) {
  return {
    id: p.id,
    user_id: p.userId,
    user: p.user ? serializeUser(p.user, ctx) : null,
    recording_id: p.recordingId,
    gift_id: p.giftId,
    gift: p.gift ? serializeGift(p.gift) : null,
    quantity: p.quantity,
    stars: p.stars,
    created_at: fmt(p.createdAt),
    updated_at: fmt(p.updatedAt),
  }
}

// ---------------------------------------------------------------- Daily tasks

export function serializeTaskLog(l: DbDailyTaskLog) {
  return {
    id: l.id,
    user_id: l.userId,
    daily_task_id: l.dailyTaskId,
    day: l.day,
    status: l.status,
    created_at: fmt(l.createdAt),
    updated_at: fmt(l.updatedAt),
  }
}

export type TaskRow = DbDailyTask & { logs?: DbDailyTaskLog[] | null }

export function serializeTask(t: TaskRow) {
  const log = t.logs?.[0] ?? null
  return {
    id: t.id,
    name: t.name,
    type: t.type,
    goal: t.goal,
    finished_count: log?.progress ?? 0,
    coin: t.coin,
    diamond: t.diamond,
    exp: t.exp,
    coins: t.coins,
    diamonds: t.diamonds,
    exps: t.exps,
    log: log ? serializeTaskLog(log) : null,
    created_at: fmt(t.createdAt),
    updated_at: fmt(t.updatedAt),
  }
}

// ---------------------------------------------------------------- Misc

export function serializeImage(i: DbImage) {
  return {
    id: i.id,
    user_id: i.userId,
    image: i.image,
    created_at: fmt(i.createdAt),
    updated_at: fmt(i.updatedAt),
  }
}

export function serializeKeyword(k: DbKeyword) {
  return { id: k.id, name: k.name }
}

/** Simple2 — GET /v1/recordings/background */
export function serializeBackground(b: DbBackground) {
  return { key: b.key, value: b.value }
}

/** Simple3 (Explore) — `name` is non-null in Kotlin. */
export function serializeExploreSection(s: DbExploreSection) {
  return {
    id: s.id,
    name: s.name ?? '',
    type: s.type,
    layout_type: s.layoutType,
  }
}

export type NotificationRow = {
  id: number
  userId: number
  sender?: UserRow | null
  title: string
  message: string
  contentId: number
  subContentId: number | null
  type: string
  subType: string | null
  image: string | null
  isRead: number
  pushedAt: Date | null
  createdAt: Date
  updatedAt: Date
}

export function serializeNotification(n: NotificationRow, ctx: ViewerContext = EMPTY) {
  return {
    id: n.id,
    user_id: n.userId,
    sender: n.sender ? serializeUser(n.sender, ctx) : null,
    title: n.title,
    message: n.message,
    content_id: n.contentId,
    sub_content_id: n.subContentId,
    type: n.type,
    sub_type: n.subType,
    image: n.image,
    is_read: n.isRead,
    pushed_at: fmt(n.pushedAt),
    created_at: fmt(n.createdAt),
    updated_at: fmt(n.updatedAt),
  }
}
