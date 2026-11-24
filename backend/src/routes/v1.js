const express = require('express');
const path = require('node:path');
const fs = require('node:fs');
const multer = require('multer');
const { db, nowStr, createToken } = require('../db');

const router = express.Router();

const UPLOAD_DIR = path.join(__dirname, '..', '..', 'public', 'uploads');
if (!fs.existsSync(UPLOAD_DIR)) {
  fs.mkdirSync(UPLOAD_DIR, { recursive: true });
}

const storage = multer.diskStorage({
  destination: (_req, _file, cb) => cb(null, UPLOAD_DIR),
  filename: (_req, file, cb) => {
    const ext = path.extname(file.originalname || '') || '.m4a';
    cb(null, `${Date.now()}-${Math.round(Math.random() * 1e6)}${ext}`);
  }
});
const upload = multer({ storage });

// Merge query and body params seamlessly because Retrofit client uses @Query/@QueryMap on many POST/PUT routes
function getParams(req) {
  return { ...(req.body || {}), ...(req.query || {}) };
}

function fullUrl(req, maybeRel) {
  if (!maybeRel) return null;
  if (/^https?:\/\//i.test(maybeRel)) return maybeRel;
  const proto = req.headers['x-forwarded-proto'] || req.protocol || 'http';
  const host = req.headers['x-forwarded-host'] || req.get('host') || 'localhost:3000';
  return `${proto}://${host}${maybeRel.startsWith('/') ? '' : '/'}${maybeRel}`;
}

function formatUser(req, row, viewerId = null, includeToken = false) {
  if (!row) return null;
  let followStatus = false;
  if (viewerId && viewerId !== row.id) {
    const f = db.prepare('SELECT status FROM follows WHERE follower_id = ? AND user_id = ?').get(viewerId, row.id);
    followStatus = !!(f && f.status === 1);
  }
  return {
    id: row.id,
    uid: row.uid || `u_${row.id}`,
    fb_user_id: row.fb_user_id || null,
    gg_user_id: row.gg_user_id || null,
    full_name: row.full_name || 'Singora Singer',
    email: row.email || '',
    address: row.address || '',
    city: row.city || '',
    country: row.country || 'VN',
    language: row.language || 'en',
    region: row.region || 'VN',
    phone: row.phone || '',
    avatar: fullUrl(req, row.avatar || '/media/avatars/avatar-1.png'),
    cover: fullUrl(req, row.cover || '/media/covers/cover-1.png'),
    gender: Number(row.gender || 0),
    birthday: row.birthday || '2000-01-01',
    bio: row.bio || '',
    level: Number(row.level || 1),
    current_level_exps: Number(row.current_level_exps || 0),
    next_level_exps: Number(row.next_level_exps || 100),
    diamonds: Number(row.diamonds || 0),
    coins: Number(row.coins || 0),
    stars: Number(row.stars || 0),
    exps: Number(row.exps || 0),
    access_token: includeToken ? row.access_token : null,
    recording_count: Number(row.recording_count || 0),
    notification_count: Number(row.notification_count || 0),
    following_count: Number(row.following_count || 0),
    follower_count: Number(row.follower_count || 0),
    gift_count: Number(row.gift_count || 0),
    play_count: Number(row.play_count || 0),
    lat: row.lat != null ? Number(row.lat) : 10.7769,
    long: row.long != null ? Number(row.long) : 106.7009,
    distance: 1.2,
    label: row.label || 'Singer',
    follow_status: followStatus,
    created_at: row.created_at,
    updated_at: row.updated_at
  };
}

function formatSong(req, row) {
  if (!row) return null;
  return {
    id: row.id,
    name: row.name,
    artist: row.artist || 'Singora Studio',
    youtubeId: row.youtubeId || `sgr_${row.id}`,
    player_ias_url: fullUrl(req, row.player_ias_url),
    thumbnail: fullUrl(req, row.thumbnail || '/media/covers/song-1.png'),
    cover: fullUrl(req, row.cover || '/media/covers/cover-1.png'),
    link: fullUrl(req, row.link),
    link_video: fullUrl(req, row.link_video || '/media/songs/song-1.mp4'),
    trending: Number(row.trending || 0),
    duet_singer: Number(row.duet_singer || 0),
    recordCount: Number(row.recordCount || 0),
    region: row.region || 'US',
    status: Number(row.status ?? 1)
  };
}

function formatImage(req, row) {
  if (!row) return null;
  return {
    id: row.id,
    user_id: row.user_id,
    image: fullUrl(req, row.image),
    created_at: row.created_at,
    updated_at: row.updated_at
  };
}

function formatDuet(req, row, viewerId = null, includeRecording = false) {
  if (!row) return null;
  const userRow = db.prepare('SELECT * FROM users WHERE id = ?').get(row.user_id);
  let segments = [];
  try {
    segments = JSON.parse(row.segments_json || '[]');
  } catch (_e) {
    segments = [];
  }
  let recObj = null;
  if (includeRecording && row.recording_id) {
    const recRow = db.prepare('SELECT * FROM recordings WHERE id = ?').get(row.recording_id);
    if (recRow) recObj = formatRecording(req, recRow, viewerId, false);
  }
  return {
    id: row.id,
    user_id: row.user_id,
    song_id: row.song_id,
    recording_id: row.recording_id,
    join_count: Number(row.join_count || 0),
    user: formatUser(req, userRow, viewerId),
    recording: recObj,
    segments,
    created_at: row.created_at,
    updated_at: row.updated_at
  };
}

function formatRecording(req, row, viewerId = null, includeDuet = true) {
  if (!row) return null;
  const userRow = db.prepare('SELECT * FROM users WHERE id = ?').get(row.user_id);
  const songRow = db.prepare('SELECT * FROM songs WHERE id = ?').get(row.song_id);
  let likeStatus = false;
  if (viewerId) {
    const lk = db.prepare("SELECT status FROM likes WHERE user_id = ? AND likeable_id = ? AND likeable_type IN ('recording', 'r')").get(viewerId, row.id);
    likeStatus = !!(lk && lk.status === 1);
  }
  let images = [];
  if (row.image_ids) {
    const ids = String(row.image_ids).split(',').map(s => Number(s.trim())).filter(Boolean);
    if (ids.length > 0) {
      images = ids.map(id => db.prepare('SELECT * FROM images WHERE id = ?').get(id)).filter(Boolean).map(img => formatImage(req, img));
    }
  }
  let duetObj = null;
  if (includeDuet && row.duet_id) {
    const duetRow = db.prepare('SELECT * FROM duets WHERE id = ?').get(row.duet_id) ||
                    db.prepare('SELECT * FROM duets WHERE recording_id = ?').get(row.id);
    if (duetRow) duetObj = formatDuet(req, duetRow, viewerId, false);
  }
  return {
    id: row.id,
    name: row.name || (songRow ? songRow.name : 'Karaoke Recording'),
    slug: row.slug || `recording-${row.id}`,
    user_id: row.user_id,
    song_id: row.song_id,
    duet_id: Number(row.duet_id || 0),
    message: row.message || '',
    thumbnail: fullUrl(req, row.thumbnail || (songRow ? songRow.thumbnail : '/media/covers/song-1.png')),
    url: fullUrl(req, row.url),
    url_video_resize: fullUrl(req, row.url_video_resize),
    share_url: fullUrl(req, row.share_url || `/share/recording/${row.id}`),
    type: Number(row.type || 0),
    format: Number(row.format || 0),
    video_ratio: Number(row.video_ratio || 0),
    privacy: Number(row.privacy ?? 1),
    pin: Number(row.pin || 0),
    status: Number(row.status ?? 1),
    duration: Number(row.duration || 20),
    effect: Number(row.effect || 0),
    effect_custom: row.effect_custom || '',
    use_headphone: Boolean(row.use_headphone ?? 1),
    image_ids: row.image_ids || '',
    images,
    play_count: Number(row.play_count || 0),
    like_count: Number(row.like_count || 0),
    like_status: likeStatus,
    comment_count: Number(row.comment_count || 0),
    share_count: Number(row.share_count || 0),
    duet_count: Number(row.duet_count || 0),
    gift_count: Number(row.gift_count || 0),
    star_count: Number(row.star_count || 0),
    user: formatUser(req, userRow, viewerId),
    duet: duetObj,
    song: formatSong(req, songRow),
    created_at: row.created_at,
    updated_at: row.updated_at
  };
}

function formatGift(req, row) {
  if (!row) return null;
  return {
    id: row.id,
    name: row.name,
    image: fullUrl(req, row.image),
    type: Number(row.type || 1),
    amount: Number(row.amount || 10),
    exp: Number(row.exp || 5),
    created_at: row.created_at,
    updated_at: row.updated_at
  };
}

function formatPresent(req, row, viewerId = null) {
  if (!row) return null;
  const u = db.prepare('SELECT * FROM users WHERE id = ?').get(row.user_id);
  const g = db.prepare('SELECT * FROM gifts WHERE id = ?').get(row.gift_id);
  return {
    id: row.id,
    user_id: row.user_id,
    user: formatUser(req, u, viewerId),
    recording_id: Number(row.recording_id || 0),
    gift_id: row.gift_id,
    gift: formatGift(req, g),
    quantity: Number(row.quantity || 1),
    stars: Number(row.stars || 0),
    created_at: row.created_at,
    updated_at: row.updated_at
  };
}

function formatComment(req, row, viewerId = null) {
  if (!row) return null;
  const u = db.prepare('SELECT * FROM users WHERE id = ?').get(row.user_id);
  const q = row.quote_id ? db.prepare('SELECT * FROM users WHERE id = ?').get(row.quote_id) : null;
  let likeStatus = false;
  if (viewerId) {
    const lk = db.prepare("SELECT status FROM likes WHERE user_id = ? AND likeable_id = ? AND likeable_type IN ('comment', 'c')").get(viewerId, row.id);
    likeStatus = !!(lk && lk.status === 1);
  }
  return {
    id: row.id,
    user_id: row.user_id,
    user: formatUser(req, u, viewerId),
    content_id: Number(row.content_id),
    content_type: row.content_type || 'recording',
    parent_id: Number(row.parent_id || 0),
    quote_id: Number(row.quote_id || 0),
    quote: formatUser(req, q, viewerId),
    message: row.message || '',
    like_count: Number(row.like_count || 0),
    like_status: likeStatus,
    reply_count: Number(row.reply_count || 0),
    created_at: row.created_at,
    updated_at: row.updated_at
  };
}

function formatNotification(req, row, viewerId = null) {
  if (!row) return null;
  const sender = row.sender_id ? db.prepare('SELECT * FROM users WHERE id = ?').get(row.sender_id) : null;
  return {
    id: row.id,
    user_id: row.user_id,
    sender: formatUser(req, sender, viewerId),
    title: row.title || 'Singora',
    message: row.message || '',
    content_id: Number(row.content_id || 0),
    sub_content_id: row.sub_content_id != null ? Number(row.sub_content_id) : null,
    type: row.type || 'recording',
    sub_type: row.sub_type || 'like',
    image: fullUrl(req, row.image || (sender ? sender.avatar : '/media/avatars/avatar-1.png')),
    is_read: Number(row.is_read || 0),
    pushed_at: row.pushed_at,
    created_at: row.created_at,
    updated_at: row.updated_at
  };
}

function requireOrFallbackUser(req) {
  if (req.user) return req.user;
  // If unauthenticated in dev/demo mode, fallback or return null
  return null;
}

// ============================================================================
// 4.1 Authentication & Device Registration
// ============================================================================

router.post('/auth/device', (req, res) => {
  const p = getParams(req);
  const uniqueId = p.unique_id || req.headers['unique-id'] || `dev_${Date.now()}`;
  const ts = nowStr();
  db.prepare(`
    INSERT INTO devices (unique_id, os, os_version, app_version, device_name, timezone, screen_width, screen_height, brand, fcm_token, lat, long, updated_at)
    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
    ON CONFLICT(unique_id) DO UPDATE SET
      os = excluded.os,
      os_version = excluded.os_version,
      app_version = excluded.app_version,
      device_name = excluded.device_name,
      fcm_token = COALESCE(excluded.fcm_token, devices.fcm_token),
      lat = COALESCE(excluded.lat, devices.lat),
      long = COALESCE(excluded.long, devices.long),
      updated_at = excluded.updated_at
  `).run(
    String(uniqueId),
    String(p.os || '2'),
    String(p.os_version || ''),
    String(p.app_version || '2.1.0'),
    String(p.device_name || ''),
    String(p.timezone || ''),
    String(p.screen_width || ''),
    String(p.screen_height || ''),
    String(p.brand || ''),
    p.fcm_token ? String(p.fcm_token) : null,
    p.lat != null ? Number(p.lat) : null,
    p.long != null ? Number(p.long) : null,
    ts
  );
  res.json({ data: { registered: true, unique_id: uniqueId } });
});

function handleSocialLogin(req, res, providerField) {
  const p = getParams(req);
  const socialId = p[providerField] || p.unique_id || `guest_${Date.now()}`;
  const fullName = p.full_name && p.full_name !== 'null' ? String(p.full_name) : 'Singora Star';
  const email = p.email && p.email !== 'null' ? String(p.email) : `${socialId}@singora.app`;
  const avatar = p.avatar && p.avatar !== 'null' ? String(p.avatar) : '/media/avatars/avatar-1.png';
  const ts = nowStr();

  let user = db.prepare(`SELECT * FROM users WHERE ${providerField} = ?`).get(String(socialId));
  const token = createToken();

  if (!user) {
    const uid = `u_${Date.now().toString(36)}`;
    const info = db.prepare(`
      INSERT INTO users (uid, ${providerField}, full_name, email, avatar, coins, diamonds, stars, level, exps, access_token, created_at, updated_at)
      VALUES (?, ?, ?, ?, ?, 500, 50, 10, 1, 20, ?, ?, ?)
    `).run(uid, String(socialId), fullName, email, avatar, token, ts, ts);
    user = db.prepare('SELECT * FROM users WHERE id = ?').get(info.lastInsertRowid);
  } else {
    db.prepare('UPDATE users SET access_token = ?, updated_at = ? WHERE id = ?').run(token, ts, user.id);
    user = db.prepare('SELECT * FROM users WHERE id = ?').get(user.id);
  }

  res.json({ data: formatUser(req, user, user.id, true) });
}

router.post('/auth/google/login', (req, res) => handleSocialLogin(req, res, 'gg_user_id'));
router.post('/auth/facebook/login', (req, res) => handleSocialLogin(req, res, 'fb_user_id'));

// ============================================================================
// 4.2 Users, Profiles, Follows & Blocks
// ============================================================================

router.get('/users/search', (req, res) => {
  const q = String(req.query.q || '').trim();
  const page = Math.max(1, Number(req.query.page || 1));
  const limit = 20;
  const offset = (page - 1) * limit;
  const rows = db.prepare('SELECT * FROM users WHERE full_name LIKE ? ORDER BY follower_count DESC LIMIT ? OFFSET ?')
    .all(`%${q}%`, limit, offset);
  const viewerId = req.user ? req.user.id : null;
  res.json({ data: rows.map(r => formatUser(req, r, viewerId)) });
});

router.get('/users/suggestion', (req, res) => {
  const viewerId = req.user ? req.user.id : 0;
  const rows = db.prepare('SELECT * FROM users WHERE id != ? ORDER BY follower_count DESC LIMIT 15').all(viewerId);
  res.json({ data: rows.map(r => formatUser(req, r, viewerId || null)) });
});

// Self-service account deletion endpoint (Google Play Store Policy Compliance)
router.delete('/users/me', (req, res) => {
  if (!req.user) {
    return res.status(401).json({ status: 401, message: 'Unauthorized' });
  }
  const uid = req.user.id;
  db.prepare('DELETE FROM recordings WHERE user_id = ?').run(uid);
  db.prepare('DELETE FROM comments WHERE user_id = ?').run(uid);
  db.prepare('DELETE FROM images WHERE user_id = ?').run(uid);
  db.prepare('DELETE FROM notifications WHERE user_id = ?').run(uid);
  db.prepare('DELETE FROM users WHERE id = ?').run(uid);
  res.json({ status: 1, message: 'Account and associated data permanently deleted' });
});

router.get('/users/:id', (req, res) => {
  const id = Number(req.params.id);
  const row = db.prepare('SELECT * FROM users WHERE id = ?').get(id);
  if (!row) return res.status(404).json({ status: 404, message: 'User not found' });
  const viewerId = req.user ? req.user.id : null;
  res.json({ data: formatUser(req, row, viewerId, viewerId === row.id) });
});

router.post('/users/:id', (req, res) => {
  const id = Number(req.params.id);
  const row = db.prepare('SELECT * FROM users WHERE id = ?').get(id);
  if (!row) return res.status(404).json({ status: 404, message: 'User not found' });
  const p = getParams(req);
  const ts = nowStr();
  db.prepare(`
    UPDATE users SET
      full_name = COALESCE(?, full_name),
      birthday = COALESCE(?, birthday),
      avatar = COALESCE(?, avatar),
      gender = COALESCE(?, gender),
      bio = COALESCE(?, bio),
      updated_at = ?
    WHERE id = ?
  `).run(
    p.full_name || null,
    p.birthday || null,
    p.avatar || null,
    p.gender != null ? Number(p.gender) : null,
    p.bio != null ? String(p.bio) : null,
    ts,
    id
  );
  const updated = db.prepare('SELECT * FROM users WHERE id = ?').get(id);
  res.json({ data: formatUser(req, updated, id, true) });
});

router.get('/follows/followers', (req, res) => {
  const p = getParams(req);
  const targetId = Number(p.user_id || p.follower_id || (req.user && req.user.id) || 1);
  const rows = db.prepare(`
    SELECT u.* FROM follows f
    JOIN users u ON u.id = f.follower_id
    WHERE f.user_id = ? AND f.status = 1
    ORDER BY f.created_at DESC
  `).all(targetId);
  const viewerId = req.user ? req.user.id : null;
  res.json({ data: rows.map(r => formatUser(req, r, viewerId)) });
});

router.get('/follows/following', (req, res) => {
  const p = getParams(req);
  const targetId = Number(p.follower_id || p.user_id || (req.user && req.user.id) || 1);
  const rows = db.prepare(`
    SELECT u.* FROM follows f
    JOIN users u ON u.id = f.user_id
    WHERE f.follower_id = ? AND f.status = 1
    ORDER BY f.created_at DESC
  `).all(targetId);
  const viewerId = req.user ? req.user.id : null;
  res.json({ data: rows.map(r => formatUser(req, r, viewerId)) });
});

router.post('/follows', (req, res) => {
  const viewer = requireOrFallbackUser(req) || db.prepare('SELECT * FROM users ORDER BY id ASC LIMIT 1').get();
  const p = getParams(req);
  const targetId = Number(p.user_id);
  // Note: ExploreFragment sends status=1 for follow and status=2 (or 0) for unfollow
  const rawStatus = Number(p.status ?? 1);
  const active = rawStatus === 1 ? 1 : 0;
  const ts = nowStr();

  if (targetId && viewer && viewer.id !== targetId) {
    db.prepare(`
      INSERT INTO follows (follower_id, user_id, status, created_at)
      VALUES (?, ?, ?, ?)
      ON CONFLICT(follower_id, user_id) DO UPDATE SET status = excluded.status
    `).run(viewer.id, targetId, active, ts);

    const followerCnt = db.prepare('SELECT COUNT(*) AS c FROM follows WHERE user_id = ? AND status = 1').get(targetId).c;
    const followingCnt = db.prepare('SELECT COUNT(*) AS c FROM follows WHERE follower_id = ? AND status = 1').get(viewer.id).c;
    db.prepare('UPDATE users SET follower_count = ? WHERE id = ?').run(followerCnt, targetId);
    db.prepare('UPDATE users SET following_count = ? WHERE id = ?').run(followingCnt, viewer.id);
  }
  res.json({ data: { status: active } });
});

router.get('/blocks', (req, res) => {
  const viewerId = req.user ? req.user.id : 0;
  const rows = db.prepare(`
    SELECT u.* FROM blocks b
    JOIN users u ON u.id = b.blocked_id
    WHERE b.blocker_id = ? AND b.status = 1
  `).all(viewerId);
  res.json({ data: rows.map(r => formatUser(req, r, viewerId)) });
});

router.post('/blocks', (req, res) => {
  const viewer = requireOrFallbackUser(req) || db.prepare('SELECT * FROM users ORDER BY id ASC LIMIT 1').get();
  const p = getParams(req);
  const blockedId = Number(p.blocked_id);
  const active = Number(p.status ?? 1) === 1 ? 1 : 0;
  const ts = nowStr();
  if (viewer && blockedId) {
    db.prepare(`
      INSERT INTO blocks (blocker_id, blocked_id, status, created_at)
      VALUES (?, ?, ?, ?)
      ON CONFLICT(blocker_id, blocked_id) DO UPDATE SET status = excluded.status
    `).run(viewer.id, blockedId, active, ts);
  }
  res.json({ data: { blocked_id: blockedId, status: active } });
});

// ============================================================================
// 4.3 Songs & Keywords
// ============================================================================

router.get('/songs/getLink', (req, res) => {
  const ytId = String(req.query.youtube_id || '');
  const song = db.prepare('SELECT * FROM songs WHERE youtubeId = ?').get(ytId) ||
               db.prepare('SELECT * FROM songs ORDER BY id ASC LIMIT 1').get();
  const link = song ? fullUrl(req, song.link_video || song.link || '/media/songs/song-1.mp4') : fullUrl(req, '/media/songs/song-1.mp4');
  res.json({ status: 1, link });
});

router.get('/songs/search', (req, res) => {
  const name = String(req.query.name || '').trim();
  const page = Math.max(1, Number(req.query.page || 1));
  const limit = 25;
  const offset = (page - 1) * limit;
  const rows = db.prepare('SELECT * FROM songs WHERE name LIKE ? OR artist LIKE ? ORDER BY recordCount DESC LIMIT ? OFFSET ?')
    .all(`%${name}%`, `%${name}%`, limit, offset);
  res.json({ data: rows.map(r => formatSong(req, r)) });
});

router.post('/songs/downloadFromYoutube', upload.single('file'), (req, res) => {
  const p = getParams(req);
  const songId = Number(p.song_id || 1);
  if (req.file) {
    const rel = `/uploads/${req.file.filename}`;
    db.prepare('UPDATE songs SET link_video = ? WHERE id = ?').run(rel, songId);
  }
  res.json({ data: { uploaded: true, song_id: songId } });
});

router.get('/songs/:id', (req, res) => {
  const id = Number(req.params.id);
  const row = db.prepare('SELECT * FROM songs WHERE id = ?').get(id);
  if (!row) return res.status(404).json({ status: 404, message: 'Song not found' });
  res.json({ data: formatSong(req, row) });
});

router.get('/songs', (req, res) => {
  const page = Math.max(1, Number(req.query.page || 1));
  const limit = Math.min(100, Math.max(1, Number(req.query.per_page || 50)));
  const offset = (page - 1) * limit;
  const type = String(req.query.type || '');

  let rows;
  if (type === 'duet') {
    rows = db.prepare('SELECT * FROM songs WHERE duet_singer = 1 ORDER BY recordCount DESC LIMIT ? OFFSET ?').all(limit, offset);
  } else if (type === 'trending') {
    rows = db.prepare('SELECT * FROM songs ORDER BY trending DESC, recordCount DESC LIMIT ? OFFSET ?').all(limit, offset);
  } else {
    rows = db.prepare('SELECT * FROM songs ORDER BY id ASC LIMIT ? OFFSET ?').all(limit, offset);
  }
  res.json({ data: rows.map(r => formatSong(req, r)) });
});

router.get('/keywords', (_req, res) => {
  const rows = db.prepare('SELECT id, name FROM keywords ORDER BY search_count DESC LIMIT 20').all();
  res.json({ data: rows });
});

router.post('/keywords', (req, res) => {
  const p = getParams(req);
  const name = String(p.name || '').trim();
  const ts = nowStr();
  if (!name) return res.json({ data: { id: 0, name: '' } });
  db.prepare(`
    INSERT INTO keywords (name, search_count, created_at) VALUES (?, 1, ?)
    ON CONFLICT(name) DO UPDATE SET search_count = search_count + 1
  `).run(name, ts);
  const row = db.prepare('SELECT id, name FROM keywords WHERE name = ?').get(name);
  res.json({ data: row });
});

// ============================================================================
// 4.4 Recordings, Duets & Explore Feeds
// ============================================================================

router.get('/recordings/background', (req, res) => {
  res.json({
    data: [
      { key: 'Studio Neon', value: fullUrl(req, '/media/covers/cover-1.png') },
      { key: 'Ocean Sunset', value: fullUrl(req, '/media/covers/cover-2.png') },
      { key: 'Starlight Stage', value: fullUrl(req, '/media/covers/cover-3.png') }
    ]
  });
});

router.get('/recordings/following', (req, res) => {
  const viewerId = req.user ? req.user.id : 0;
  let rows = db.prepare(`
    SELECT r.* FROM recordings r
    JOIN follows f ON f.user_id = r.user_id AND f.follower_id = ? AND f.status = 1
    WHERE r.privacy = 1
    ORDER BY r.id DESC LIMIT 20
  `).all(viewerId);
  if (rows.length === 0) {
    rows = db.prepare('SELECT * FROM recordings WHERE privacy = 1 ORDER BY id DESC LIMIT 20').all();
  }
  res.json({ data: rows.map(r => formatRecording(req, r, viewerId || null)) });
});

router.get('/recordings/nearby', (req, res) => {
  const viewerId = req.user ? req.user.id : null;
  const rows = db.prepare('SELECT * FROM recordings WHERE privacy = 1 ORDER BY play_count DESC LIMIT 20').all();
  res.json({ data: rows.map(r => formatRecording(req, r, viewerId)) });
});

router.get('/recordings/detail/:id', (req, res) => {
  const id = Number(req.params.id);
  const row = db.prepare('SELECT * FROM recordings WHERE id = ?').get(id);
  if (!row) return res.status(404).json({ status: 404, message: 'Recording not found' });
  const viewerId = req.user ? req.user.id : null;
  res.json({ data: formatRecording(req, row, viewerId) });
});

router.get('/recordings/ranking/:id', (req, res) => {
  const songId = Number(req.params.id);
  const viewerId = req.user ? req.user.id : null;
  let rows = db.prepare('SELECT * FROM recordings WHERE song_id = ? AND privacy = 1 ORDER BY like_count DESC, play_count DESC LIMIT 20').all(songId);
  if (rows.length === 0) {
    rows = db.prepare('SELECT * FROM recordings WHERE privacy = 1 ORDER BY like_count DESC LIMIT 10').all();
  }
  res.json({ data: rows.map(r => formatRecording(req, r, viewerId)) });
});

router.get('/recordings/duet/:id', (req, res) => {
  const id = Number(req.params.id);
  const viewerId = req.user ? req.user.id : null;
  let rows = db.prepare('SELECT * FROM recordings WHERE (duet_id = ? OR song_id = ?) AND type >= 1 ORDER BY id DESC LIMIT 20').all(id, id);
  if (rows.length === 0) {
    rows = db.prepare('SELECT * FROM recordings WHERE type >= 1 ORDER BY id DESC LIMIT 10').all();
  }
  res.json({ data: rows.map(r => formatRecording(req, r, viewerId)) });
});

router.get('/recordings/singDuetJoin/:id', (req, res) => {
  const id = Number(req.params.id);
  const viewerId = req.user ? req.user.id : null;
  const row = db.prepare('SELECT * FROM recordings WHERE id = ?').get(id) ||
              db.prepare('SELECT * FROM recordings WHERE type >= 1 ORDER BY id ASC LIMIT 1').get();
  res.json({ data: formatRecording(req, row, viewerId) });
});

router.post('/recordings/sendInviteDuet', (req, res) => {
  const viewer = requireOrFallbackUser(req) || db.prepare('SELECT * FROM users ORDER BY id ASC LIMIT 1').get();
  const p = getParams(req);
  const recId = Number(p.recording_id || 1);
  const userIds = String(p.user_ids || '').split(',').map(s => Number(s.trim())).filter(Boolean);
  const ts = nowStr();
  const stmt = db.prepare('INSERT INTO duet_invites (sender_id, recording_id, target_user_id, created_at) VALUES (?, ?, ?, ?)');
  for (const targetId of userIds) {
    stmt.run(viewer.id, recId, targetId, ts);
  }
  res.json({ data: { invited: userIds.length } });
});

router.post('/recordings/pin', (req, res) => {
  const p = getParams(req);
  const id = Number(p.id);
  const status = Number(p.status ?? 1);
  db.prepare('UPDATE recordings SET pin = ?, updated_at = ? WHERE id = ?').run(status, nowStr(), id);
  res.json({ status: 1, message: status ? 'Pinned recording' : 'Unpinned recording' });
});

router.get('/recordings', (req, res) => {
  const page = Math.max(1, Number(req.query.page || 1));
  const limit = 20;
  const offset = (page - 1) * limit;
  const userId = req.query.user_id && req.query.user_id !== 'null' ? Number(req.query.user_id) : null;
  const type = Number(req.query.type || 0);
  const viewerId = req.user ? req.user.id : null;

  let rows;
  if (userId) {
    rows = db.prepare('SELECT * FROM recordings WHERE user_id = ? ORDER BY pin DESC, id DESC LIMIT ? OFFSET ?').all(userId, limit, offset);
  } else if (type === 10) {
    rows = db.prepare('SELECT * FROM recordings WHERE privacy = 1 ORDER BY id DESC LIMIT ? OFFSET ?').all(limit, offset);
  } else {
    rows = db.prepare('SELECT * FROM recordings WHERE privacy = 1 ORDER BY play_count DESC, id DESC LIMIT ? OFFSET ?').all(limit, offset);
  }
  res.json({ data: rows.map(r => formatRecording(req, r, viewerId)) });
});

router.post(
  '/recordings',
  upload.fields([
    { name: 'audio', maxCount: 1 },
    { name: 'video_resize', maxCount: 1 },
    { name: 'thumbnail', maxCount: 1 }
  ]),
  (req, res) => {
    const viewer = requireOrFallbackUser(req) || db.prepare('SELECT * FROM users ORDER BY id ASC LIMIT 1').get();
    const p = getParams(req);
    const ts = nowStr();

    const audioFile = req.files && req.files.audio && req.files.audio[0];
    const videoResizeFile = req.files && req.files.video_resize && req.files.video_resize[0];
    const thumbFile = req.files && req.files.thumbnail && req.files.thumbnail[0];

    const songId = Number(p.song_id && p.song_id !== 'null' ? p.song_id : 1);
    const songRow = db.prepare('SELECT * FROM songs WHERE id = ?').get(songId);

    const mediaRel = audioFile ? `/uploads/${audioFile.filename}` : '/media/songs/rec-1.m4a';
    const videoRel = videoResizeFile ? `/uploads/${videoResizeFile.filename}` : null;
    const thumbRel = thumbFile
      ? `/uploads/${thumbFile.filename}`
      : (p.thumbnail_url && p.thumbnail_url !== 'null' ? String(p.thumbnail_url) : (songRow ? songRow.thumbnail : '/media/covers/song-1.png'));

    const name = p.name && p.name !== 'null' ? String(p.name) : (songRow ? songRow.name : 'My Karaoke Cover');
    const info = db.prepare(`
      INSERT INTO recordings (
        name, slug, user_id, song_id, duet_id, message, thumbnail, url, url_video_resize, share_url,
        type, format, video_ratio, privacy, pin, status, duration, effect, use_headphone, image_ids,
        created_at, updated_at
      ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, '', ?, ?, ?, ?, 0, 1, ?, ?, ?, ?, ?, ?)
    `).run(
      name,
      `rec-${Date.now()}`,
      viewer.id,
      songId,
      Number(p.duet_id && p.duet_id !== 'null' ? p.duet_id : 0),
      p.message && p.message !== 'null' ? String(p.message) : '',
      thumbRel,
      mediaRel,
      videoRel,
      Number(p.type && p.type !== 'null' ? p.type : 0),
      Number(p.format && p.format !== 'null' ? p.format : 0),
      Number(p.video_ratio && p.video_ratio !== 'null' ? p.video_ratio : 0),
      Number(p.privacy && p.privacy !== 'null' ? p.privacy : 1),
      Number(p.duration && p.duration !== 'null' ? p.duration : 20),
      Number(p.effect && p.effect !== 'null' ? p.effect : 0),
      p.use_headphone === 'false' ? 0 : 1,
      p.image_ids && p.image_ids !== 'null' ? String(p.image_ids) : '',
      ts,
      ts
    );

    const recId = info.lastInsertRowid;
    db.prepare('UPDATE recordings SET share_url = ? WHERE id = ?').run(`/share/recording/${recId}`, recId);
    db.prepare('UPDATE users SET recording_count = recording_count + 1 WHERE id = ?').run(viewer.id);
    db.prepare('UPDATE songs SET recordCount = recordCount + 1 WHERE id = ?').run(songId);

    const created = db.prepare('SELECT * FROM recordings WHERE id = ?').get(recId);
    res.json({ data: formatRecording(req, created, viewer.id) });
  }
);

router.put('/recordings/:id', (req, res) => {
  const id = Number(req.params.id);
  const p = getParams(req);
  const row = db.prepare('SELECT * FROM recordings WHERE id = ?').get(id);
  if (!row) return res.status(404).json({ status: 404, message: 'Recording not found' });

  if (p.play_count != null) {
    db.prepare('UPDATE recordings SET play_count = play_count + 1, updated_at = ? WHERE id = ?').run(nowStr(), id);
    db.prepare('UPDATE users SET play_count = play_count + 1 WHERE id = ?').run(row.user_id);
  }
  if (p.privacy != null) {
    db.prepare('UPDATE recordings SET privacy = ?, updated_at = ? WHERE id = ?').run(Number(p.privacy), nowStr(), id);
  }
  const updated = db.prepare('SELECT * FROM recordings WHERE id = ?').get(id);
  const viewerId = req.user ? req.user.id : null;
  res.json({ data: formatRecording(req, updated, viewerId) });
});

router.delete('/recordings/:id', (req, res) => {
  const id = Number(req.params.id);
  db.prepare('DELETE FROM recordings WHERE id = ?').run(id);
  res.status(200).json({});
});

router.post('/duets/:id', (req, res) => {
  const recordingId = Number(req.params.id);
  const viewer = requireOrFallbackUser(req) || db.prepare('SELECT * FROM users ORDER BY id ASC LIMIT 1').get();
  const p = getParams(req);
  const rec = db.prepare('SELECT * FROM recordings WHERE id = ?').get(recordingId);
  const songId = rec ? rec.song_id : 1;
  const segmentsStr = typeof p.segments === 'string' ? p.segments : JSON.stringify(p.segments || []);
  const ts = nowStr();

  const info = db.prepare(`
    INSERT INTO duets (user_id, song_id, recording_id, join_count, segments_json, created_at, updated_at)
    VALUES (?, ?, ?, 1, ?, ?, ?)
  `).run(viewer.id, songId, recordingId, segmentsStr, ts, ts);

  db.prepare('UPDATE recordings SET duet_id = ? WHERE id = ?').run(info.lastInsertRowid, recordingId);
  const duetRow = db.prepare('SELECT * FROM duets WHERE id = ?').get(info.lastInsertRowid);
  res.json({ data: formatDuet(req, duetRow, viewer.id, true) });
});

router.get('/duets/recordings', (req, res) => {
  const viewerId = req.user ? req.user.id : null;
  let rows = db.prepare('SELECT * FROM recordings WHERE type >= 1 AND privacy = 1 ORDER BY duet_count DESC, id DESC LIMIT 20').all();
  if (rows.length === 0) {
    rows = db.prepare('SELECT * FROM recordings WHERE privacy = 1 ORDER BY id DESC LIMIT 10').all();
  }
  res.json({ data: rows.map(r => formatRecording(req, r, viewerId)) });
});

router.get('/explores', (_req, res) => {
  // Matches ExploreAdapter layout_type 1 (horizontal), 2 (suggested users), 3 (2-col grid), 4 (duet trending)
  res.json({
    data: [
      { id: 1, name: 'Trending Performances', type: 1, layout_type: 1 },
      { id: 2, name: 'Featured Singers', type: 2, layout_type: 2 },
      { id: 3, name: 'Top Duet Invites', type: 3, layout_type: 4 },
      { id: 4, name: 'Editor Picks', type: 4, layout_type: 3 }
    ]
  });
});

router.get('/explores/recordings', (req, res) => {
  const type = Number(req.query.type || 1);
  const limit = Math.min(30, Math.max(1, Number(req.query.per_page || 10)));
  const viewerId = req.user ? req.user.id : null;
  let rows;
  if (type === 3) {
    rows = db.prepare('SELECT * FROM recordings WHERE type >= 1 AND privacy = 1 ORDER BY duet_count DESC, id DESC LIMIT ?').all(limit);
  } else {
    rows = db.prepare('SELECT * FROM recordings WHERE privacy = 1 ORDER BY like_count DESC, id DESC LIMIT ?').all(limit);
  }
  if (rows.length === 0) {
    rows = db.prepare('SELECT * FROM recordings ORDER BY id DESC LIMIT ?').all(limit);
  }
  res.json({ data: rows.map(r => formatRecording(req, r, viewerId)) });
});

// ============================================================================
// 4.5 Social Interactions (Comments, Likes, Shares, Images, Notifications)
// ============================================================================

router.get('/comments', (req, res) => {
  const contentId = Number(req.query.commentable_id || 1);
  const viewerId = req.user ? req.user.id : null;
  const rows = db.prepare('SELECT * FROM comments WHERE content_id = ? ORDER BY id DESC LIMIT 50').all(contentId);
  res.json({ data: rows.map(r => formatComment(req, r, viewerId)) });
});

router.post('/comments', (req, res) => {
  const viewer = requireOrFallbackUser(req) || db.prepare('SELECT * FROM users ORDER BY id ASC LIMIT 1').get();
  const p = getParams(req);
  const contentId = Number(p.commentable_id || 1);
  const contentType = String(p.commentable_type || 'recording');
  const message = String(p.message || '').trim();
  const parentId = p.parent_id != null && p.parent_id !== 'null' ? Number(p.parent_id) : 0;
  const quoteId = p.quote_id != null && p.quote_id !== 'null' ? Number(p.quote_id) : 0;
  const ts = nowStr();

  const info = db.prepare(`
    INSERT INTO comments (user_id, content_id, content_type, parent_id, quote_id, message, created_at, updated_at)
    VALUES (?, ?, ?, ?, ?, ?, ?, ?)
  `).run(viewer.id, contentId, contentType, parentId, quoteId, message, ts, ts);

  db.prepare('UPDATE recordings SET comment_count = comment_count + 1 WHERE id = ?').run(contentId);
  const created = db.prepare('SELECT * FROM comments WHERE id = ?').get(info.lastInsertRowid);
  res.json({ data: formatComment(req, created, viewer.id) });
});

router.delete('/comments/:id', (req, res) => {
  const id = Number(req.params.id);
  const row = db.prepare('SELECT * FROM comments WHERE id = ?').get(id);
  if (row) {
    db.prepare('DELETE FROM comments WHERE id = ?').run(id);
    db.prepare('UPDATE recordings SET comment_count = MAX(0, comment_count - 1) WHERE id = ?').run(row.content_id);
  }
  res.status(200).json({});
});

router.post('/likes', (req, res) => {
  const viewer = requireOrFallbackUser(req) || db.prepare('SELECT * FROM users ORDER BY id ASC LIMIT 1').get();
  const p = getParams(req);
  const id = Number(p.likeable_id || 1);
  const rawType = String(p.likeable_type || 'recording').toLowerCase();
  const normType = rawType.startsWith('c') ? 'comment' : 'recording';
  const active = Number(p.status ?? 1) === 1 ? 1 : 0;
  const ts = nowStr();

  db.prepare(`
    INSERT INTO likes (user_id, likeable_id, likeable_type, status, created_at)
    VALUES (?, ?, ?, ?, ?)
    ON CONFLICT(user_id, likeable_id, likeable_type) DO UPDATE SET status = excluded.status
  `).run(viewer.id, id, normType, active, ts);

  const cnt = db.prepare('SELECT COUNT(*) AS c FROM likes WHERE likeable_id = ? AND likeable_type = ? AND status = 1').get(id, normType).c;
  if (normType === 'comment') {
    db.prepare('UPDATE comments SET like_count = ? WHERE id = ?').run(cnt, id);
  } else {
    db.prepare('UPDATE recordings SET like_count = ? WHERE id = ?').run(cnt, id);
  }
  res.json({ data: { like_count: cnt, like_status: Boolean(active) } });
});

router.post('/shares', (req, res) => {
  const viewerId = req.user ? req.user.id : null;
  const p = getParams(req);
  const id = Number(p.shareable_id || 1);
  const type = String(p.shareable_type || 'recording');
  const social = Number(p.social || 1);
  const message = String(p.message || '');
  db.prepare('INSERT INTO shares (user_id, shareable_id, shareable_type, social, message, created_at) VALUES (?, ?, ?, ?, ?, ?)')
    .run(viewerId, id, type, social, message, nowStr());
  db.prepare('UPDATE recordings SET share_count = share_count + 1 WHERE id = ?').run(id);
  res.json({ data: { shared: true } });
});

router.get('/images/list', (req, res) => {
  const userId = req.query.user_id && req.query.user_id !== 'null' ? Number(req.query.user_id) : (req.user ? req.user.id : 1);
  const rows = db.prepare('SELECT * FROM images WHERE user_id = ? ORDER BY id DESC LIMIT 50').all(userId);
  res.json({ data: rows.map(r => formatImage(req, r)) });
});

router.post('/images/add', upload.single('image'), (req, res) => {
  const viewer = requireOrFallbackUser(req) || db.prepare('SELECT * FROM users ORDER BY id ASC LIMIT 1').get();
  const rel = req.file ? `/uploads/${req.file.filename}` : '/media/covers/cover-1.png';
  const ts = nowStr();
  const info = db.prepare('INSERT INTO images (user_id, image, created_at, updated_at) VALUES (?, ?, ?, ?)').run(viewer.id, rel, ts, ts);
  const row = db.prepare('SELECT * FROM images WHERE id = ?').get(info.lastInsertRowid);
  res.json({ data: formatImage(req, row) });
});

router.post('/images/deletes', (req, res) => {
  const ids = Array.isArray(req.body && req.body.ids) ? req.body.ids : [];
  const stmt = db.prepare('DELETE FROM images WHERE id = ?');
  for (const id of ids) {
    stmt.run(Number(id));
  }
  res.status(200).json({});
});

router.get('/notifications', (req, res) => {
  const viewerId = req.user ? req.user.id : 1;
  let rows = db.prepare('SELECT * FROM notifications WHERE user_id = ? ORDER BY id DESC LIMIT 30').all(viewerId);
  if (rows.length === 0) {
    rows = db.prepare('SELECT * FROM notifications ORDER BY id DESC LIMIT 10').all();
  }
  res.json({ data: rows.map(r => formatNotification(req, r, viewerId)) });
});

router.post('/notifications/markAsRead/:id', (req, res) => {
  const id = Number(req.params.id);
  db.prepare('UPDATE notifications SET is_read = 1, updated_at = ? WHERE id = ?').run(nowStr(), id);
  const row = db.prepare('SELECT * FROM notifications WHERE id = ?').get(id);
  res.json({ data: formatNotification(req, row, req.user ? req.user.id : null) });
});

router.delete('/notifications/:id', (req, res) => {
  const id = Number(req.params.id);
  db.prepare('DELETE FROM notifications WHERE id = ?').run(id);
  res.status(200).json({});
});

// ============================================================================
// 4.6 Virtual Economy (Gifts, Wallet, Diamonds, Daily Tasks)
// ============================================================================

router.get('/gifts', (req, res) => {
  const rows = db.prepare('SELECT * FROM gifts ORDER BY amount ASC').all();
  res.json({ data: rows.map(r => formatGift(req, r)) });
});

router.post('/gifts/present', (req, res) => {
  const viewer = requireOrFallbackUser(req) || db.prepare('SELECT * FROM users ORDER BY id ASC LIMIT 1').get();
  const p = getParams(req);
  const recId = Number(p.recording_id || 1);
  const giftId = Number(p.gift_id || 1);
  const qty = Math.max(1, Number(p.quantity || 1));
  const uniqueId = String(p.unique_id || '');
  const ts = nowStr();

  const gift = db.prepare('SELECT * FROM gifts WHERE id = ?').get(giftId) || db.prepare('SELECT * FROM gifts LIMIT 1').get();
  const rec = db.prepare('SELECT * FROM recordings WHERE id = ?').get(recId);
  const receiverId = rec ? rec.user_id : 1;
  const totalCost = (gift ? gift.amount : 10) * qty;
  const starsEarned = totalCost;

  db.prepare('INSERT INTO presents (user_id, receiver_id, recording_id, gift_id, quantity, stars, unique_id, created_at, updated_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)')
    .run(viewer.id, receiverId, recId, gift.id, qty, starsEarned, uniqueId, ts, ts);

  db.prepare('UPDATE users SET coins = MAX(0, coins - ?), exps = exps + ? WHERE id = ?').run(totalCost, (gift.exp || 5) * qty, viewer.id);
  db.prepare('UPDATE users SET stars = stars + ?, gift_count = gift_count + ? WHERE id = ?').run(starsEarned, qty, receiverId);
  if (rec) {
    db.prepare('UPDATE recordings SET gift_count = gift_count + ?, star_count = star_count + ? WHERE id = ?').run(qty, starsEarned, recId);
  }

  res.json({ data: { gifted: true, stars: starsEarned } });
});

router.get('/gifts/recording/top', (req, res) => {
  const recId = Number(req.query.recording_id || 1);
  const viewerId = req.user ? req.user.id : null;
  const rows = db.prepare('SELECT * FROM presents WHERE recording_id = ? ORDER BY stars DESC, id DESC LIMIT 20').all(recId);
  res.json({ data: rows.map(r => formatPresent(req, r, viewerId)) });
});

router.get('/gifts/receiver/top', (req, res) => {
  const receiverId = Number(req.query.receiver_id || 1);
  const viewerId = req.user ? req.user.id : null;
  const rows = db.prepare('SELECT * FROM presents WHERE receiver_id = ? ORDER BY stars DESC, id DESC LIMIT 20').all(receiverId);
  res.json({ data: rows.map(r => formatPresent(req, r, viewerId)) });
});

router.get('/gifts/user', (req, res) => {
  const receiverId = Number(req.query.receiver_id || (req.user && req.user.id) || 1);
  const viewerId = req.user ? req.user.id : null;
  const rows = db.prepare('SELECT * FROM presents WHERE receiver_id = ? OR user_id = ? ORDER BY id DESC LIMIT 30').all(receiverId, receiverId);
  res.json({ data: rows.map(r => formatPresent(req, r, viewerId)) });
});

router.post('/diamonds/apple/exchange', (req, res) => {
  const viewer = requireOrFallbackUser(req) || db.prepare('SELECT * FROM users ORDER BY id ASC LIMIT 1').get();
  const p = getParams(req);
  const productId = String(p.product_id || 'lv1.diamonds');
  const skuMap = { lv1: 60, lv2: 180, lv3: 360, lv4: 680, lv5: 1280, lv6: 2680 };
  let amount = 100;
  for (const [k, val] of Object.entries(skuMap)) {
    if (productId.includes(k)) amount = val;
  }
  db.prepare('INSERT INTO diamond_transactions (user_id, transaction_id, product_id, amount, date, state, unique_id, created_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?)')
    .run(viewer.id, String(p.transaction_id || `tx_${Date.now()}`), productId, amount, String(p.date || ''), String(p.state || 'purchased'), String(p.unique_id || ''), nowStr());
  db.prepare('UPDATE users SET diamonds = diamonds + ? WHERE id = ?').run(amount, viewer.id);
  res.json({ status: 1, amount });
});

router.get('/daily-task', (req, res) => {
  const viewerId = req.user ? req.user.id : 1;
  const tasks = db.prepare('SELECT * FROM daily_tasks ORDER BY id ASC').all();
  const data = tasks.map(t => {
    const log = db.prepare('SELECT * FROM daily_task_logs WHERE user_id = ? AND daily_task_id = ? ORDER BY id DESC LIMIT 1').get(viewerId, t.id);
    return {
      id: t.id,
      name: t.name,
      type: Number(t.type),
      goal: Number(t.goal || 1),
      finished_count: log ? Number(log.finished_count || 1) : 0,
      coin: Number(t.coin || 20),
      diamond: Number(t.diamond || 0),
      exp: Number(t.exp || 10),
      coins: JSON.parse(t.coins_json || '[10,20,30,40,50,60,100]'),
      diamonds: JSON.parse(t.diamonds_json || '[0,0,1,0,0,1,3]'),
      exps: JSON.parse(t.exps_json || '[5,10,15,20,25,30,50]'),
      log: log ? {
        id: log.id,
        user_id: log.user_id,
        daily_task_id: log.daily_task_id,
        day: Number(log.day || 1),
        status: Number(log.status || 1),
        created_at: log.created_at,
        updated_at: log.updated_at
      } : null,
      created_at: t.created_at,
      updated_at: t.updated_at
    };
  });
  res.json({ data });
});

router.post('/daily-task/addLog', (req, res) => {
  const viewer = requireOrFallbackUser(req) || db.prepare('SELECT * FROM users ORDER BY id ASC LIMIT 1').get();
  const p = getParams(req);
  const type = Number(p.type || 1);
  const task = db.prepare('SELECT * FROM daily_tasks WHERE type = ?').get(type) || db.prepare('SELECT * FROM daily_tasks LIMIT 1').get();
  const ts = nowStr();

  let log = db.prepare('SELECT * FROM daily_task_logs WHERE user_id = ? AND daily_task_id = ? ORDER BY id DESC LIMIT 1').get(viewer.id, task.id);
  if (!log) {
    const info = db.prepare('INSERT INTO daily_task_logs (user_id, daily_task_id, day, finished_count, status, created_at, updated_at) VALUES (?, ?, 1, 1, 1, ?, ?)')
      .run(viewer.id, task.id, ts, ts);
    log = db.prepare('SELECT * FROM daily_task_logs WHERE id = ?').get(info.lastInsertRowid);
  }
  res.json({
    data: {
      id: log.id,
      user_id: log.user_id,
      daily_task_id: log.daily_task_id,
      day: Number(log.day || 1),
      status: Number(log.status || 1),
      created_at: log.created_at,
      updated_at: log.updated_at
    }
  });
});

router.post('/daily-task/collect-reward', (req, res) => {
  const viewer = requireOrFallbackUser(req) || db.prepare('SELECT * FROM users ORDER BY id ASC LIMIT 1').get();
  const p = getParams(req);
  const taskId = Number(p.daily_task_id || 1);
  const task = db.prepare('SELECT * FROM daily_tasks WHERE id = ?').get(taskId) || db.prepare('SELECT * FROM daily_tasks LIMIT 1').get();
  const ts = nowStr();

  const coins = Number(task.coin || 20);
  const diamonds = Number(task.diamond || 0);
  const exps = Number(task.exp || 10);

  db.prepare('UPDATE users SET coins = coins + ?, diamonds = diamonds + ?, exps = exps + ? WHERE id = ?')
    .run(coins, diamonds, exps, viewer.id);

  const existing = db.prepare('SELECT * FROM daily_task_logs WHERE user_id = ? AND daily_task_id = ? ORDER BY id DESC LIMIT 1').get(viewer.id, task.id);
  if (existing) {
    db.prepare('UPDATE daily_task_logs SET status = 2, updated_at = ? WHERE id = ?').run(ts, existing.id);
  } else {
    db.prepare('INSERT INTO daily_task_logs (user_id, daily_task_id, day, finished_count, status, created_at, updated_at) VALUES (?, ?, 1, 1, 2, ?, ?)')
      .run(viewer.id, task.id, ts, ts);
  }

  res.json({ status: 1, coins, diamonds, exps });
});

module.exports = router;
