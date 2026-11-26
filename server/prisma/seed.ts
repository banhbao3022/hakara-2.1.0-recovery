import { randomUUID } from 'node:crypto'
import { mkdir, writeFile } from 'node:fs/promises'
import { join } from 'node:path'
import { PrismaClient } from '@prisma/client'
import { env } from '../src/env.js'
import { publicUrl, storageRoot } from '../src/lib/storage.js'

/**
 * Seed data.
 *
 * This is part of the deliverable rather than a convenience: with an empty
 * database the client renders exactly the "Not found song" empty state the
 * emulator test in REVIEW.md already reached, so there is nothing to verify
 * against. Every list the app opens on startup gets content here.
 *
 * Audio is generated locally — a short sine tone per song — so /v1/songs/getLink
 * returns a URL that actually resolves to a playable file. Nothing is downloaded.
 */

const prisma = new PrismaClient({ datasources: { db: { url: env.databaseUrl } } })

const SEED_MEDIA_DIR = 'seed'

/** A 2-second 16-bit mono PCM WAV at 22.05 kHz. No encoder, no dependency. */
function sineWav(frequencyHz: number, seconds = 2, sampleRate = 22_050): Buffer {
  const samples = Math.floor(sampleRate * seconds)
  const data = Buffer.alloc(samples * 2)
  for (let i = 0; i < samples; i++) {
    // Fade the last 10% so the loop point is not a click.
    const fade = i > samples * 0.9 ? (samples - i) / (samples * 0.1) : 1
    const value = Math.sin((2 * Math.PI * frequencyHz * i) / sampleRate) * 0.3 * fade
    data.writeInt16LE(Math.round(value * 32_767), i * 2)
  }

  const header = Buffer.alloc(44)
  header.write('RIFF', 0)
  header.writeUInt32LE(36 + data.length, 4)
  header.write('WAVE', 8)
  header.write('fmt ', 12)
  header.writeUInt32LE(16, 16) // PCM chunk size
  header.writeUInt16LE(1, 20) // format = PCM
  header.writeUInt16LE(1, 22) // channels
  header.writeUInt32LE(sampleRate, 24)
  header.writeUInt32LE(sampleRate * 2, 28) // byte rate
  header.writeUInt16LE(2, 32) // block align
  header.writeUInt16LE(16, 34) // bits per sample
  header.write('data', 36)
  header.writeUInt32LE(data.length, 40)

  return Buffer.concat([header, data])
}

async function writeSeedAudio(name: string, frequencyHz: number): Promise<string> {
  const dir = join(storageRoot(), SEED_MEDIA_DIR)
  await mkdir(dir, { recursive: true })
  const file = `${name}.wav`
  await writeFile(join(dir, file), sineWav(frequencyHz))
  return publicUrl(`${SEED_MEDIA_DIR}/${file}`)
}

/** Song categories — the `type` on GET /v1/songs?type=. */
export const SONG_TYPES = {
  trending: 0,
  vietnamese: 1,
  international: 2,
  duet: 3,
} as const

const SONGS: { name: string; artist: string; type: number; trending: number; duetSinger: number }[] = [
  { name: 'Hạ Trắng', artist: 'Trịnh Công Sơn', type: SONG_TYPES.vietnamese, trending: 3, duetSinger: 0 },
  { name: 'Diễm Xưa', artist: 'Trịnh Công Sơn', type: SONG_TYPES.vietnamese, trending: 2, duetSinger: 0 },
  { name: 'Nhật Ký Của Mẹ', artist: 'Nguyễn Văn Chung', type: SONG_TYPES.vietnamese, trending: 1, duetSinger: 0 },
  { name: 'Ông Bà Anh', artist: 'Lê Thiện Hiếu', type: SONG_TYPES.vietnamese, trending: 0, duetSinger: 0 },
  { name: 'Chúng Ta Của Hiện Tại', artist: 'Sơn Tùng M-TP', type: SONG_TYPES.trending, trending: 5, duetSinger: 0 },
  { name: 'Hãy Trao Cho Anh', artist: 'Sơn Tùng M-TP', type: SONG_TYPES.trending, trending: 4, duetSinger: 0 },
  { name: 'Bước Qua Mùa Cô Đơn', artist: 'Vũ.', type: SONG_TYPES.trending, trending: 4, duetSinger: 0 },
  { name: 'Đưa Em Về Nhà', artist: 'GREY D', type: SONG_TYPES.trending, trending: 3, duetSinger: 0 },
  { name: 'Yesterday', artist: 'The Beatles', type: SONG_TYPES.international, trending: 2, duetSinger: 0 },
  { name: 'Imagine', artist: 'John Lennon', type: SONG_TYPES.international, trending: 2, duetSinger: 0 },
  { name: 'Hotel California', artist: 'Eagles', type: SONG_TYPES.international, trending: 1, duetSinger: 0 },
  { name: 'Someone Like You', artist: 'Adele', type: SONG_TYPES.international, trending: 3, duetSinger: 0 },
  { name: 'Rolling in the Deep', artist: 'Adele', type: SONG_TYPES.international, trending: 2, duetSinger: 0 },
  { name: 'Perfect', artist: 'Ed Sheeran', type: SONG_TYPES.international, trending: 3, duetSinger: 0 },
  { name: 'Shallow', artist: 'Lady Gaga & Bradley Cooper', type: SONG_TYPES.duet, trending: 4, duetSinger: 2 },
  { name: 'Endless Love', artist: 'Lionel Richie & Diana Ross', type: SONG_TYPES.duet, trending: 2, duetSinger: 2 },
  { name: 'Mưa Trên Cuộc Tình', artist: 'Đan Nguyên & Hà Thanh Xuân', type: SONG_TYPES.duet, trending: 2, duetSinger: 2 },
  { name: 'Duyên Phận', artist: 'Như Quỳnh', type: SONG_TYPES.vietnamese, trending: 1, duetSinger: 0 },
  { name: 'Vùng Lá Me Bay', artist: 'Thanh Tuyền', type: SONG_TYPES.vietnamese, trending: 0, duetSinger: 0 },
  { name: 'Sầu Tím Thiệp Hồng', artist: 'Giao Linh & Tuấn Vũ', type: SONG_TYPES.duet, trending: 1, duetSinger: 2 },
]

const GIFTS = [
  { name: 'Rose', image: 'gift-rose.png', amount: 1, exp: 1, stars: 1 },
  { name: 'Heart', image: 'gift-heart.png', amount: 5, exp: 5, stars: 5 },
  { name: 'Cake', image: 'gift-cake.png', amount: 10, exp: 10, stars: 10 },
  { name: 'Teddy Bear', image: 'gift-teddy.png', amount: 25, exp: 28, stars: 25 },
  { name: 'Crown', image: 'gift-crown.png', amount: 50, exp: 60, stars: 50 },
  { name: 'Diamond Ring', image: 'gift-ring.png', amount: 100, exp: 125, stars: 100 },
  { name: 'Sports Car', image: 'gift-car.png', amount: 500, exp: 650, stars: 500 },
  { name: 'Private Jet', image: 'gift-jet.png', amount: 1000, exp: 1400, stars: 1000 },
]

/**
 * Daily tasks. type 1 is the seven-day check-in, which is the one that uses the
 * coins/diamonds/exps ladders; the rest are single-reward action tasks whose
 * `coin`/`diamond`/`exp` scalars apply on any day.
 */
const DAILY_TASKS = [
  {
    name: 'Daily Check-in',
    type: 1,
    goal: 1,
    coin: 10,
    diamond: 0,
    exp: 5,
    coins: [10, 20, 30, 40, 50, 60, 100],
    diamonds: [0, 0, 0, 0, 0, 0, 1],
    exps: [5, 10, 15, 20, 25, 30, 50],
  },
  { name: 'Record a song', type: 2, goal: 1, coin: 20, diamond: 0, exp: 15, coins: [], diamonds: [], exps: [] },
  { name: 'Like 5 recordings', type: 3, goal: 5, coin: 10, diamond: 0, exp: 5, coins: [], diamonds: [], exps: [] },
  { name: 'Leave 3 comments', type: 4, goal: 3, coin: 10, diamond: 0, exp: 5, coins: [], diamonds: [], exps: [] },
  { name: 'Share a recording', type: 5, goal: 1, coin: 15, diamond: 0, exp: 8, coins: [], diamonds: [], exps: [] },
  { name: 'Follow a singer', type: 6, goal: 1, coin: 10, diamond: 0, exp: 5, coins: [], diamonds: [], exps: [] },
  { name: 'Send a gift', type: 7, goal: 1, coin: 25, diamond: 1, exp: 20, coins: [], diamonds: [], exps: [] },
]

const EXPLORE_SECTIONS = [
  { name: 'Trending now', type: 1, layoutType: 1, feed: 'trending', position: 0 },
  { name: 'Fresh recordings', type: 2, layoutType: 0, feed: 'latest', position: 1 },
  { name: 'Most loved', type: 3, layoutType: 1, feed: 'most_liked', position: 2 },
  { name: 'Open duets', type: 4, layoutType: 0, feed: 'duets', position: 3 },
]

const BACKGROUNDS = [
  { key: 'stage_lights', value: 'bg-stage-lights.jpg' },
  { key: 'neon_city', value: 'bg-neon-city.jpg' },
  { key: 'sunset_beach', value: 'bg-sunset-beach.jpg' },
  { key: 'studio_dark', value: 'bg-studio-dark.jpg' },
  { key: 'confetti', value: 'bg-confetti.jpg' },
  { key: 'rain_window', value: 'bg-rain-window.jpg' },
]

async function main(): Promise<void> {
  console.log('Seeding…')

  // Songs ---------------------------------------------------------------
  const songIds: number[] = []
  for (const [index, s] of SONGS.entries()) {
    // A distinct pitch per song makes it obvious in testing which track played.
    const link = await writeSeedAudio(`song-${index + 1}`, 220 + index * 20)
    const youtubeId = `seed${String(index + 1).padStart(7, '0')}`

    const existing = await prisma.song.findFirst({ where: { youtubeId } })
    const song = existing
      ? await prisma.song.update({
          where: { id: existing.id },
          data: { ...s, link, youtubeId, status: 1 },
        })
      : await prisma.song.create({ data: { ...s, link, youtubeId, status: 1 } })

    songIds.push(song.id)
  }
  console.log(`  songs: ${songIds.length}`)

  // Gifts ---------------------------------------------------------------
  for (const g of GIFTS) {
    const existing = await prisma.gift.findFirst({ where: { name: g.name } })
    if (existing) await prisma.gift.update({ where: { id: existing.id }, data: { ...g, type: 1 } })
    else await prisma.gift.create({ data: { ...g, type: 1 } })
  }
  console.log(`  gifts: ${GIFTS.length}`)

  // Daily tasks ---------------------------------------------------------
  for (const t of DAILY_TASKS) {
    const existing = await prisma.dailyTask.findFirst({ where: { type: t.type } })
    if (existing) await prisma.dailyTask.update({ where: { id: existing.id }, data: t })
    else await prisma.dailyTask.create({ data: t })
  }
  console.log(`  daily tasks: ${DAILY_TASKS.length}`)

  // Explore + backgrounds -----------------------------------------------
  for (const s of EXPLORE_SECTIONS) {
    const existing = await prisma.exploreSection.findFirst({ where: { type: s.type } })
    if (existing) await prisma.exploreSection.update({ where: { id: existing.id }, data: s })
    else await prisma.exploreSection.create({ data: s })
  }
  for (const b of BACKGROUNDS) {
    await prisma.background.upsert({ where: { key: b.key }, create: b, update: b })
  }
  console.log(`  explore sections: ${EXPLORE_SECTIONS.length}, backgrounds: ${BACKGROUNDS.length}`)

  // Keywords ------------------------------------------------------------
  const keywords = ['sơn tùng', 'bolero', 'nhạc trẻ', 'adele', 'karaoke tủ', 'song ca', 'remix']
  for (const [i, name] of keywords.entries()) {
    await prisma.keyword.upsert({
      where: { name },
      create: { name, searchCount: (keywords.length - i) * 17 },
      update: {},
    })
  }
  console.log(`  keywords: ${keywords.length}`)

  // Demo users ----------------------------------------------------------
  const demoUsers = [
    { ggUserId: 'seed-google-1', fullName: 'Mai Anh', bio: 'Bolero mỗi tối', lat: 10.7769, long: 106.7009 },
    { ggUserId: 'seed-google-2', fullName: 'Quang Huy', bio: 'Sing for fun 🎤', lat: 21.0278, long: 105.8342 },
    { fbUserId: 'seed-facebook-1', fullName: 'Lan Phương', bio: 'Duet partner wanted', lat: 16.0544, long: 108.2022 },
  ]

  const users = []
  for (const u of demoUsers) {
    const key = u.ggUserId ? { ggUserId: u.ggUserId } : { fbUserId: u.fbUserId }
    const existing = await prisma.user.findFirst({ where: key })
    users.push(
      existing
        ? await prisma.user.update({ where: { id: existing.id }, data: u })
        : await prisma.user.create({
            data: { ...u, uid: randomUUID(), diamonds: 500, coins: 250, exps: 180 },
          }),
    )
  }
  console.log(`  users: ${users.length}`)

  // Recordings, follows, comments, likes ---------------------------------
  // Only seeded once: re-running must not duplicate the feed.
  const alreadySeeded = await prisma.recording.count({ where: { userId: { in: users.map((u) => u.id) } } })
  if (alreadySeeded > 0) {
    console.log(`  recordings: ${alreadySeeded} already present, skipping social seed`)
  } else {
    const recordings = []
    for (const [i, user] of users.entries()) {
      for (let n = 0; n < 3; n++) {
        const songId = songIds[(i * 3 + n) % songIds.length]!
        const song = await prisma.song.findUniqueOrThrow({ where: { id: songId } })
        const rec = await prisma.recording.create({
          data: {
            userId: user.id,
            songId,
            name: song.name,
            message: n === 0 ? 'Bản thu đầu tiên của mình 🎶' : null,
            url: song.link ?? '',
            thumbnail: song.thumbnail,
            privacy: 1,
            status: 1,
            duration: 120 + n * 15,
            lat: user.lat,
            long: user.long,
            playCount: 40 - n * 7,
            pin: n === 0 ? 1 : 0,
          },
        })
        await prisma.recording.update({
          where: { id: rec.id },
          data: { shareUrl: `${env.publicUrl}/r/${rec.id}`, slug: `${song.id}-${rec.id}` },
        })
        recordings.push(rec)
      }
      await prisma.user.update({ where: { id: user.id }, data: { recordingCount: 3 } })
      await prisma.song.updateMany({
        where: { id: { in: songIds.slice(i * 3, i * 3 + 3) } },
        data: { recordCount: { increment: 1 } },
      })
    }

    // Open the first recording of each user for duets.
    for (const [i, user] of users.entries()) {
      const rec = recordings[i * 3]
      if (!rec) continue
      await prisma.duet.create({
        data: {
          userId: user.id,
          songId: rec.songId,
          recordingId: rec.id,
          segments: [
            { n: 'Part 1', s: 0, e: 30.5 },
            { n: 'Part 2', s: 30.5, e: 62 },
          ],
        },
      })
    }

    // Everyone follows everyone else.
    for (const a of users) {
      for (const b of users) {
        if (a.id === b.id) continue
        await prisma.follow.create({ data: { followerId: a.id, followedId: b.id } })
      }
    }
    for (const u of users) {
      await prisma.user.update({
        where: { id: u.id },
        data: { followingCount: users.length - 1, followerCount: users.length - 1 },
      })
    }

    // A comment and a like on each recording, from the next user along.
    for (const [i, rec] of recordings.entries()) {
      const commenter = users[(i + 1) % users.length]!
      if (commenter.id === rec.userId) continue
      await prisma.comment.create({
        data: {
          userId: commenter.id,
          contentType: 'recording',
          contentId: rec.id,
          message: 'Hay quá! 👏',
        },
      })
      await prisma.like.create({
        data: { userId: commenter.id, targetType: 'recording', targetId: rec.id },
      })
      await prisma.recording.update({
        where: { id: rec.id },
        data: { commentCount: 1, likeCount: 1 },
      })
    }

    console.log(`  recordings: ${recordings.length}, duets: ${users.length}, follows + comments + likes seeded`)
  }

  console.log('Seed complete.')
}

main()
  .catch((err) => {
    console.error(err)
    process.exitCode = 1
  })
  .finally(() => prisma.$disconnect())
