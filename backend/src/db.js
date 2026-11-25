const path = require('node:path');
const fs = require('node:fs');
const crypto = require('node:crypto');
const { DatabaseSync } = require('node:sqlite');

const DATA_DIR = path.join(__dirname, '..', 'data');
if (!fs.existsSync(DATA_DIR)) {
  fs.mkdirSync(DATA_DIR, { recursive: true });
}

const DB_PATH = process.env.DB_PATH || path.join(DATA_DIR, 'singora.db');
const db = new DatabaseSync(DB_PATH);

db.exec('PRAGMA journal_mode = WAL;');
db.exec('PRAGMA synchronous = NORMAL;');
db.exec('PRAGMA foreign_keys = ON;');
db.exec('PRAGMA busy_timeout = 5000;');

function nowStr() {
  return new Date().toISOString().replace('T', ' ').slice(0, 19);
}

function initSchema() {
  db.exec(`
    CREATE TABLE IF NOT EXISTS users (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      uid TEXT NOT NULL,
      fb_user_id TEXT,
      gg_user_id TEXT,
      full_name TEXT NOT NULL,
      email TEXT,
      address TEXT DEFAULT '',
      city TEXT DEFAULT 'Ho Chi Minh City',
      country TEXT DEFAULT 'VN',
      language TEXT DEFAULT 'en',
      region TEXT DEFAULT 'VN',
      phone TEXT DEFAULT '',
      avatar TEXT DEFAULT '/media/avatars/avatar-1.png',
      cover TEXT DEFAULT '/media/covers/cover-1.png',
      gender INTEGER DEFAULT 0,
      birthday TEXT DEFAULT '2000-01-01',
      bio TEXT DEFAULT 'Music & Karaoke Lover on Singora',
      level INTEGER DEFAULT 1,
      current_level_exps INTEGER DEFAULT 20,
      next_level_exps INTEGER DEFAULT 100,
      diamonds INTEGER DEFAULT 50,
      coins INTEGER DEFAULT 500,
      stars INTEGER DEFAULT 10,
      exps INTEGER DEFAULT 20,
      access_token TEXT UNIQUE,
      recording_count INTEGER DEFAULT 0,
      notification_count INTEGER DEFAULT 0,
      following_count INTEGER DEFAULT 0,
      follower_count INTEGER DEFAULT 0,
      gift_count INTEGER DEFAULT 0,
      play_count INTEGER DEFAULT 0,
      lat REAL DEFAULT 10.7769,
      long REAL DEFAULT 106.7009,
      label TEXT DEFAULT 'Rising Singer',
      created_at TEXT NOT NULL,
      updated_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS devices (
      unique_id TEXT PRIMARY KEY,
      os TEXT,
      os_version TEXT,
      app_version TEXT,
      device_name TEXT,
      timezone TEXT,
      screen_width TEXT,
      screen_height TEXT,
      brand TEXT,
      fcm_token TEXT,
      lat REAL,
      long REAL,
      updated_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS songs (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      name TEXT NOT NULL,
      artist TEXT NOT NULL,
      youtubeId TEXT NOT NULL,
      player_ias_url TEXT,
      thumbnail TEXT NOT NULL,
      cover TEXT NOT NULL,
      link TEXT,
      link_video TEXT,
      trending INTEGER DEFAULT 1,
      duet_singer INTEGER DEFAULT 1,
      recordCount INTEGER DEFAULT 0,
      region TEXT DEFAULT 'US',
      status INTEGER DEFAULT 1,
      category TEXT DEFAULT 'recommend'
    );

    CREATE TABLE IF NOT EXISTS recordings (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      name TEXT NOT NULL,
      slug TEXT,
      user_id INTEGER NOT NULL,
      song_id INTEGER NOT NULL,
      duet_id INTEGER DEFAULT 0,
      message TEXT DEFAULT '',
      thumbnail TEXT,
      url TEXT NOT NULL,
      url_video_resize TEXT,
      share_url TEXT,
      type INTEGER DEFAULT 0,
      format INTEGER DEFAULT 0,
      video_ratio INTEGER DEFAULT 0,
      privacy INTEGER DEFAULT 0,
      pin INTEGER DEFAULT 0,
      status INTEGER DEFAULT 1,
      duration INTEGER DEFAULT 24,
      effect INTEGER DEFAULT 1,
      effect_custom TEXT DEFAULT '',
      use_headphone INTEGER DEFAULT 1,
      image_ids TEXT DEFAULT '',
      play_count INTEGER DEFAULT 0,
      like_count INTEGER DEFAULT 0,
      comment_count INTEGER DEFAULT 0,
      share_count INTEGER DEFAULT 0,
      duet_count INTEGER DEFAULT 0,
      gift_count INTEGER DEFAULT 0,
      star_count INTEGER DEFAULT 0,
      lat REAL DEFAULT 10.7769,
      long REAL DEFAULT 106.7009,
      created_at TEXT NOT NULL,
      updated_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS duets (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      user_id INTEGER NOT NULL,
      song_id INTEGER NOT NULL,
      recording_id INTEGER NOT NULL,
      join_count INTEGER DEFAULT 1,
      segments_json TEXT DEFAULT '[]',
      created_at TEXT NOT NULL,
      updated_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS duet_invites (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      sender_id INTEGER NOT NULL,
      recording_id INTEGER NOT NULL,
      target_user_id INTEGER NOT NULL,
      created_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS comments (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      user_id INTEGER NOT NULL,
      content_id INTEGER NOT NULL,
      content_type TEXT DEFAULT 'recording',
      parent_id INTEGER DEFAULT 0,
      quote_id INTEGER DEFAULT 0,
      message TEXT NOT NULL,
      like_count INTEGER DEFAULT 0,
      reply_count INTEGER DEFAULT 0,
      created_at TEXT NOT NULL,
      updated_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS likes (
      user_id INTEGER NOT NULL,
      likeable_id INTEGER NOT NULL,
      likeable_type TEXT NOT NULL,
      status INTEGER NOT NULL DEFAULT 1,
      created_at TEXT NOT NULL,
      PRIMARY KEY (user_id, likeable_id, likeable_type)
    );

    CREATE TABLE IF NOT EXISTS follows (
      follower_id INTEGER NOT NULL,
      user_id INTEGER NOT NULL,
      status INTEGER NOT NULL DEFAULT 1,
      created_at TEXT NOT NULL,
      PRIMARY KEY (follower_id, user_id)
    );

    CREATE TABLE IF NOT EXISTS blocks (
      blocker_id INTEGER NOT NULL,
      blocked_id INTEGER NOT NULL,
      status INTEGER NOT NULL DEFAULT 1,
      created_at TEXT NOT NULL,
      PRIMARY KEY (blocker_id, blocked_id)
    );

    CREATE TABLE IF NOT EXISTS shares (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      user_id INTEGER,
      shareable_id INTEGER NOT NULL,
      shareable_type TEXT NOT NULL,
      social INTEGER DEFAULT 1,
      message TEXT DEFAULT '',
      created_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS images (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      user_id INTEGER NOT NULL,
      image TEXT NOT NULL,
      created_at TEXT NOT NULL,
      updated_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS keywords (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      name TEXT UNIQUE NOT NULL,
      search_count INTEGER DEFAULT 1,
      created_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS gifts (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      name TEXT NOT NULL,
      image TEXT NOT NULL,
      type INTEGER DEFAULT 1,
      amount INTEGER NOT NULL,
      exp INTEGER DEFAULT 10,
      created_at TEXT NOT NULL,
      updated_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS presents (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      user_id INTEGER NOT NULL,
      receiver_id INTEGER NOT NULL,
      recording_id INTEGER NOT NULL,
      gift_id INTEGER NOT NULL,
      quantity INTEGER DEFAULT 1,
      stars INTEGER DEFAULT 10,
      unique_id TEXT,
      created_at TEXT NOT NULL,
      updated_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS notifications (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      user_id INTEGER NOT NULL,
      sender_id INTEGER,
      title TEXT NOT NULL,
      message TEXT NOT NULL,
      content_id INTEGER DEFAULT 0,
      sub_content_id INTEGER,
      type TEXT DEFAULT 'recording',
      sub_type TEXT DEFAULT 'like',
      image TEXT,
      is_read INTEGER DEFAULT 0,
      pushed_at TEXT NOT NULL,
      created_at TEXT NOT NULL,
      updated_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS daily_tasks (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      name TEXT NOT NULL,
      type INTEGER NOT NULL,
      goal INTEGER DEFAULT 1,
      coin INTEGER DEFAULT 20,
      diamond INTEGER DEFAULT 1,
      exp INTEGER DEFAULT 15,
      coins_json TEXT DEFAULT '[10,20,30,40,50,60,100]',
      diamonds_json TEXT DEFAULT '[0,0,1,0,0,1,3]',
      exps_json TEXT DEFAULT '[5,10,15,20,25,30,50]',
      created_at TEXT NOT NULL,
      updated_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS daily_task_logs (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      user_id INTEGER NOT NULL,
      daily_task_id INTEGER NOT NULL,
      day INTEGER DEFAULT 1,
      finished_count INTEGER DEFAULT 1,
      status INTEGER DEFAULT 1,
      created_at TEXT NOT NULL,
      updated_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS diamond_transactions (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      user_id INTEGER NOT NULL,
      transaction_id TEXT,
      product_id TEXT,
      amount INTEGER NOT NULL,
      date TEXT,
      state TEXT,
      unique_id TEXT,
      created_at TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS reports (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      reporter_id INTEGER,
      content_id TEXT,
      content_type TEXT,
      reason TEXT,
      details TEXT,
      lang TEXT,
      region TEXT,
      status TEXT DEFAULT 'open',
      created_at TEXT NOT NULL
    );

    CREATE INDEX IF NOT EXISTS idx_recordings_user ON recordings(user_id, pin DESC, id DESC);
    CREATE INDEX IF NOT EXISTS idx_recordings_song ON recordings(song_id, privacy, like_count DESC);
    CREATE INDEX IF NOT EXISTS idx_recordings_feed ON recordings(privacy, play_count DESC, id DESC);
    CREATE INDEX IF NOT EXISTS idx_comments_content ON comments(content_id, id DESC);
    CREATE INDEX IF NOT EXISTS idx_likes_target ON likes(likeable_id, likeable_type, status);
    CREATE INDEX IF NOT EXISTS idx_notifications_user ON notifications(user_id, id DESC);
    CREATE INDEX IF NOT EXISTS idx_presents_recording ON presents(recording_id, stars DESC);
  `);
}

function seedIfNeeded() {
  const countRow = db.prepare('SELECT COUNT(*) AS cnt FROM users').get();
  if (countRow && countRow.cnt > 0) {
    return;
  }

  const ts = nowStr();

  // 1. Seed Users
  const insertUser = db.prepare(`
    INSERT INTO users (
      uid, fb_user_id, gg_user_id, full_name, email, city, country, language, region,
      avatar, cover, gender, bio, level, current_level_exps, next_level_exps,
      diamonds, coins, stars, exps, access_token, recording_count, follower_count,
      following_count, gift_count, play_count, lat, long, label, created_at, updated_at
    ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
  `);

  const seedUsers = [
    ['u_luna_01', null, 'gg_luna_01', 'Luna Melody', 'luna@singora.app', 'Ho Chi Minh City', 'VN', 'en', 'VN', '/media/avatars/avatar-1.png', '/media/covers/cover-1.png', 2, 'Pop & Ballad vocalist | Duets open!', 12, 450, 1000, 120, 1500, 340, 2450, 'tok_seed_luna_01', 3, 128, 42, 65, 1890, 10.7769, 106.7009, 'Star Vocalist', ts, ts],
    ['u_kai_02', null, 'gg_kai_02', 'Kai Acoustic', 'kai@singora.app', 'Hanoi', 'VN', 'en', 'VN', '/media/avatars/avatar-2.png', '/media/covers/cover-2.png', 1, 'Acoustic guitar & R&B covers', 9, 320, 800, 80, 920, 210, 1620, 'tok_seed_kai_02', 2, 95, 31, 40, 1240, 21.0285, 105.8542, 'Top Duet Partner', ts, ts],
    ['u_mia_03', null, 'gg_mia_03', 'Mia Starlight', 'mia@singora.app', 'Da Nang', 'VN', 'en', 'VN', '/media/avatars/avatar-3.png', '/media/covers/cover-3.png', 2, 'Singing every night on Singora!', 7, 180, 500, 45, 650, 150, 980, 'tok_seed_mia_03', 1, 64, 28, 22, 830, 16.0544, 108.2022, 'Rising Star', ts, ts],
    ['u_leo_04', null, 'gg_leo_04', 'Leo Rhythm', 'leo@singora.app', 'Singapore', 'SG', 'en', 'SG', '/media/avatars/avatar-4.png', '/media/covers/cover-1.png', 1, 'Indie & Soul karaoke', 5, 90, 300, 30, 400, 80, 490, 'tok_seed_leo_04', 0, 39, 19, 12, 410, 1.3521, 103.8198, 'Featured', ts, ts]
  ];
  for (const u of seedUsers) {
    insertUser.run(...u);
  }

  // 2. Seed Songs (with both MP3 audio link and MP4 karaoke video link)
  const insertSong = db.prepare(`
    INSERT INTO songs (
      name, artist, youtubeId, player_ias_url, thumbnail, cover,
      link, link_video, trending, duet_singer, recordCount, region, status, category
    ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
  `);

  const seedSongs = [
    ['Midnight Starlight (Karaoke)', 'Singora Studio Band', 'singora_yt_01', null, '/media/covers/song-1.png', '/media/covers/cover-1.png', null, '/media/songs/song-1.mp4', 1, 1, 142, 'US', 1, 'recommend'],
    ['Ocean Breeze Ballad (Karaoke)', 'Luna & Acoustic Crew', 'singora_yt_02', null, '/media/covers/song-2.png', '/media/covers/cover-2.png', null, '/media/songs/song-2.mp4', 1, 1, 98, 'VN', 1, 'hot'],
    ['Neon City Dreams (Duet Version)', 'Synthwave Collective', 'singora_yt_03', null, '/media/covers/song-3.png', '/media/covers/cover-3.png', null, '/media/songs/song-3.mp4', 1, 1, 215, 'US', 1, 'duet'],
    ['Sunset Boulevard Acoustic', 'Kai Sessions', 'singora_yt_04', null, '/media/covers/song-4.png', '/media/covers/cover-1.png', null, '/media/songs/song-1.mp4', 1, 0, 76, 'US', 1, 'trending'],
    ['Golden Hour Serenade (Karaoke)', 'Velvet Strings', 'singora_yt_05', null, '/media/covers/song-5.png', '/media/covers/cover-2.png', null, '/media/songs/song-2.mp4', 1, 1, 164, 'VN', 1, 'recommend'],
    ['Electric Heartbeat (Pop Backing)', 'Nova Pulse', 'singora_yt_06', null, '/media/covers/song-6.png', '/media/covers/cover-3.png', null, '/media/songs/song-3.mp4', 1, 1, 119, 'US', 1, 'hot']
  ];
  for (const s of seedSongs) {
    insertSong.run(...s);
  }

  // 3. Seed Recordings & Duets
  const insertRec = db.prepare(`
    INSERT INTO recordings (
      name, slug, user_id, song_id, duet_id, message, thumbnail, url, url_video_resize, share_url,
      type, format, video_ratio, privacy, pin, status, duration, effect, use_headphone,
      play_count, like_count, comment_count, share_count, duet_count, gift_count, star_count,
      lat, long, created_at, updated_at
    ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
  `);

  const seedRecordings = [
    ['Midnight Starlight - Cover', 'midnight-starlight-luna', 1, 1, 0, 'Late night studio reverb take! Sing with me!', '/media/covers/song-1.png', '/media/songs/rec-1.m4a', null, '/share/recording/1', 0, 0, 0, 0, 1, 1, 20, 1, 1, 342, 48, 2, 12, 3, 5, 50, 10.7769, 106.7009, ts, ts],
    ['Neon City Dreams (Open Duet)', 'neon-city-duet-kai', 2, 3, 1, 'Join my duet part B! Headphones recommended.', '/media/covers/song-3.png', '/media/songs/song-3.mp4', '/media/songs/song-3.mp4', '/share/recording/2', 1, 1, 0, 0, 0, 1, 20, 2, 1, 518, 79, 1, 19, 8, 9, 90, 21.0285, 105.8542, ts, ts],
    ['Ocean Breeze Ballad - Live', 'ocean-breeze-mia', 3, 2, 0, 'First ballad recording of the week!', '/media/covers/song-2.png', '/media/songs/rec-2.m4a', null, '/share/recording/3', 0, 0, 0, 0, 0, 1, 20, 1, 1, 215, 33, 1, 7, 1, 3, 30, 16.0544, 108.2022, ts, ts],
    ['Golden Hour Serenade', 'golden-hour-luna', 1, 5, 0, 'Warm hall echo preset test', '/media/covers/song-5.png', '/media/songs/rec-1.m4a', null, '/share/recording/4', 0, 0, 0, 0, 0, 1, 20, 3, 1, 189, 27, 0, 4, 2, 2, 20, 10.7800, 106.7050, ts, ts],
    ['Electric Heartbeat (Open Duet)', 'electric-heartbeat-luna', 1, 6, 2, 'Who wants to harmonize the chorus?', '/media/covers/song-6.png', '/media/songs/rec-2.m4a', null, '/share/recording/5', 1, 0, 0, 0, 0, 1, 20, 1, 1, 276, 41, 0, 9, 5, 4, 40, 10.7750, 106.6980, ts, ts],
    ['Sunset Boulevard Acoustic', 'sunset-boulevard-kai', 2, 4, 0, 'Unplugged acoustic vibe', '/media/covers/song-4.png', '/media/songs/rec-1.m4a', null, '/share/recording/6', 0, 0, 0, 0, 0, 1, 20, 0, 1, 164, 22, 0, 3, 0, 1, 10, 21.0300, 105.8500, ts, ts]
  ];
  for (const r of seedRecordings) {
    insertRec.run(...r);
  }

  // Seed Duet definitions
  const insertDuet = db.prepare(`
    INSERT INTO duets (user_id, song_id, recording_id, join_count, segments_json, created_at, updated_at)
    VALUES (?, ?, ?, ?, ?, ?, ?)
  `);
  const defaultSegments = JSON.stringify([
    { n: 'Part A (Starter)', s: 0.0, e: 12.0 },
    { n: 'Part B (Joiner)', s: 12.0, e: 24.0 }
  ]);
  insertDuet.run(2, 3, 2, 8, defaultSegments, ts, ts);
  insertDuet.run(1, 6, 5, 5, defaultSegments, ts, ts);

  // 4. Seed Comments
  const insertComment = db.prepare(`
    INSERT INTO comments (user_id, content_id, content_type, parent_id, quote_id, message, like_count, reply_count, created_at, updated_at)
    VALUES (?, ?, 'recording', 0, 0, ?, ?, 0, ?, ?)
  `);
  insertComment.run(2, 1, 'Amazing vocal control and reverb mix!', 5, ts, ts);
  insertComment.run(3, 1, 'Love this song! Let us do a duet next!', 3, ts, ts);
  insertComment.run(1, 2, 'Joining this duet tonight!', 4, ts, ts);
  insertComment.run(4, 3, 'So soothing and clear!', 2, ts, ts);

  // 5. Seed Keywords
  const insertKw = db.prepare('INSERT INTO keywords (name, search_count, created_at) VALUES (?, ?, ?)');
  for (const [kw, cnt] of [['Midnight Starlight', 95], ['Ballad', 82], ['Neon City', 74], ['Acoustic', 68], ['Luna', 55], ['Duet', 50]]) {
    insertKw.run(kw, cnt, ts);
  }

  // 6. Seed Gifts
  const insertGift = db.prepare(`
    INSERT INTO gifts (name, image, type, amount, exp, created_at, updated_at)
    VALUES (?, ?, ?, ?, ?, ?, ?)
  `);
  const seedGifts = [
    ['Rose', '/media/gifts/gift-1.png', 1, 10, 5, ts, ts],
    ['Golden Mic', '/media/gifts/gift-2.png', 1, 50, 25, ts, ts],
    ['Heart Glow', '/media/gifts/gift-3.png', 1, 20, 10, ts, ts],
    ['Diamond Crown', '/media/gifts/gift-4.png', 2, 100, 60, ts, ts],
    ['Super Rocket', '/media/gifts/gift-5.png', 2, 200, 150, ts, ts]
  ];
  for (const g of seedGifts) {
    insertGift.run(...g);
  }

  // Seed Presents
  const insertPresent = db.prepare(`
    INSERT INTO presents (user_id, receiver_id, recording_id, gift_id, quantity, stars, unique_id, created_at, updated_at)
    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
  `);
  insertPresent.run(2, 1, 1, 1, 3, 30, 'seed_dev_1', ts, ts);
  insertPresent.run(3, 1, 1, 2, 1, 50, 'seed_dev_2', ts, ts);
  insertPresent.run(1, 2, 2, 4, 1, 100, 'seed_dev_3', ts, ts);

  // 7. Seed Daily Tasks
  const insertTask = db.prepare(`
    INSERT INTO daily_tasks (name, type, goal, coin, diamond, exp, created_at, updated_at)
    VALUES (?, ?, ?, ?, ?, ?, ?, ?)
  `);
  insertTask.run('Daily Check-In', 1, 1, 20, 0, 10, ts, ts);
  insertTask.run('Record 1 Karaoke Song', 2, 1, 50, 1, 30, ts, ts);
  insertTask.run('Watch Reward Video', 3, 1, 30, 0, 15, ts, ts);
  insertTask.run('Send a Gift to a Friend', 4, 1, 40, 1, 25, ts, ts);

  // 8. Seed Gallery Images
  const insertImg = db.prepare('INSERT INTO images (user_id, image, created_at, updated_at) VALUES (?, ?, ?, ?)');
  insertImg.run(1, '/media/covers/cover-1.png', ts, ts);
  insertImg.run(1, '/media/covers/cover-2.png', ts, ts);
  insertImg.run(2, '/media/covers/cover-3.png', ts, ts);

  // 9. Seed Welcome Notification
  const insertNotif = db.prepare(`
    INSERT INTO notifications (user_id, sender_id, title, message, content_id, type, sub_type, image, is_read, pushed_at, created_at, updated_at)
    VALUES (?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?, ?)
  `);
  insertNotif.run(1, 2, 'Welcome to Singora!', 'Kai Acoustic liked your Midnight Starlight cover.', 1, 'recording', 'like', '/media/avatars/avatar-2.png', ts, ts, ts);
}

initSchema();
seedIfNeeded();

function createToken() {
  return 'sgr_' + crypto.randomBytes(24).toString('hex');
}

let dbClosed = false;
function closeDb() {
  if (dbClosed) return;
  dbClosed = true;
  try {
    db.exec('PRAGMA wal_checkpoint(TRUNCATE);');
  } catch (_e) {
    // Ignore checkpoint errors during shutdown
  }
  try {
    db.close();
  } catch (_e) {
    // Ignore close errors if already closed
  }
}

module.exports = {
  db,
  nowStr,
  createToken,
  closeDb
};
