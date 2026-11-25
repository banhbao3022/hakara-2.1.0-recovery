const express = require('express');
const cors = require('cors');
const crypto = require('node:crypto');
const path = require('node:path');
const multer = require('multer');
const { db, closeDb } = require('./db');
const v1Routes = require('./routes/v1');
const webRoutes = require('./routes/web');

const app = express();
const PORT = Number(process.env.PORT || 3000);
const ENFORCE_SIG = process.env.ENFORCE_SIG === 'true';
const APP_HMAC_KEY = process.env.APP_HMAC_KEY || '';
const CORS_ORIGINS = process.env.CORS_ORIGINS ? process.env.CORS_ORIGINS.split(',').map(s => s.trim()).filter(Boolean) : '*';
const RATE_LIMIT_WINDOW_MS = Number(process.env.RATE_LIMIT_WINDOW_MS || 60_000);
const RATE_LIMIT_MAX = Number(process.env.RATE_LIMIT_MAX || 600);
const RATE_LIMIT_WRITE_MAX = Number(process.env.RATE_LIMIT_WRITE_MAX || 120);

app.disable('x-powered-by');
app.set('trust proxy', 1);

// Production HTTP security headers
app.use((_req, res, next) => {
  res.setHeader('X-Content-Type-Options', 'nosniff');
  res.setHeader('X-Frame-Options', 'SAMEORIGIN');
  res.setHeader('Referrer-Policy', 'strict-origin-when-cross-origin');
  res.setHeader('Cross-Origin-Resource-Policy', 'cross-origin');
  next();
});

app.use(cors({
  origin: CORS_ORIGINS,
  methods: ['GET', 'POST', 'PUT', 'DELETE', 'OPTIONS'],
  allowedHeaders: ['Authorization', 'Content-Type', 'App-Version', 'Current-Time', 'Os', 'Unique-Id', 'Sig', 'Range'],
  exposedHeaders: ['Content-Range', 'Accept-Ranges', 'Content-Length']
}));

// Lightweight sliding-window IP rate limiter (protects auth, uploads, and public endpoints)
const rateBuckets = new Map();
setInterval(() => {
  const now = Date.now();
  for (const [key, entry] of rateBuckets.entries()) {
    if (now - entry.start >= RATE_LIMIT_WINDOW_MS) {
      rateBuckets.delete(key);
    }
  }
}, RATE_LIMIT_WINDOW_MS).unref();

app.use('/v1', (req, res, next) => {
  const ip = req.ip || req.socket.remoteAddress || 'unknown';
  const isMutation = req.method !== 'GET' && req.method !== 'HEAD' && req.method !== 'OPTIONS';
  const bucketKey = `${ip}:${isMutation ? 'write' : 'read'}`;
  const maxAllowed = isMutation ? RATE_LIMIT_WRITE_MAX : RATE_LIMIT_MAX;
  const now = Date.now();

  let entry = rateBuckets.get(bucketKey);
  if (!entry || now - entry.start >= RATE_LIMIT_WINDOW_MS) {
    entry = { start: now, count: 0 };
    rateBuckets.set(bucketKey, entry);
  }
  entry.count += 1;

  res.setHeader('X-RateLimit-Limit', String(maxAllowed));
  res.setHeader('X-RateLimit-Remaining', String(Math.max(0, maxAllowed - entry.count)));

  if (entry.count > maxAllowed) {
    return res.status(429).json({
      status: 429,
      message: 'Too many requests, please slow down and try again shortly.'
    });
  }
  next();
});

app.use(express.json({ limit: '25mb' }));
app.use(express.urlencoded({ extended: true, limit: '25mb' }));

// Attach authenticated user from Authorization: Bearer <token> if present
app.use((req, _res, next) => {
  const auth = req.headers.authorization || '';
  if (auth.startsWith('Bearer ')) {
    const token = auth.slice(7).trim();
    if (token) {
      const user = db.prepare('SELECT * FROM users WHERE access_token = ?').get(token);
      if (user) {
        req.user = user;
      }
    }
  }
  next();
});

// Optional HMAC-SHA256 request signature verification matching Interceptor2.java
app.use('/v1', (req, res, next) => {
  if (ENFORCE_SIG && APP_HMAC_KEY) {
    const appVer = req.headers['app-version'] || '2.1.0';
    const curTime = req.headers['current-time'] || '';
    const os = req.headers['os'] || '';
    const uniqueId = req.headers['unique-id'] || '';
    const clientSig = (req.headers['sig'] || '').toLowerCase();

    const data = `App-Version=${appVer}&Current-Time=${curTime}&Os=${os}&Unique-Id=${uniqueId}`;
    const expected = crypto.createHmac('sha256', APP_HMAC_KEY).update(data, 'utf8').digest('hex').toLowerCase();
    if (!clientSig || clientSig.length !== expected.length || !crypto.timingSafeEqual(Buffer.from(clientSig), Buffer.from(expected))) {
      return res.status(401).json({ status: 401, message: 'Invalid request signature' });
    }
  }
  next();
});

// Static & HTTP Range streaming for audio/video files (essential for ExoPlayer & DownloadRequest)
const PUBLIC_DIR = path.join(__dirname, '..', 'public');
app.use(express.static(PUBLIC_DIR, {
  acceptRanges: true,
  maxAge: '1h',
  setHeaders: (res, filePath) => {
    res.setHeader('X-Content-Type-Options', 'nosniff');
    if (filePath.includes(`${path.sep}uploads${path.sep}`)) {
      res.setHeader('Content-Security-Policy', "default-src 'none'; media-src 'self'; img-src 'self'; sandbox");
    }
    if (filePath.endsWith('.m4a')) res.setHeader('Content-Type', 'audio/mp4');
    if (filePath.endsWith('.mp4')) res.setHeader('Content-Type', 'video/mp4');
    if (filePath.endsWith('.mp3')) res.setHeader('Content-Type', 'audio/mpeg');
  }
}));

app.get('/health', (_req, res) => {
  const users = db.prepare('SELECT COUNT(*) AS c FROM users').get().c;
  const songs = db.prepare('SELECT COUNT(*) AS c FROM songs').get().c;
  const recordings = db.prepare('SELECT COUNT(*) AS c FROM recordings').get().c;
  res.json({
    ok: true,
    service: 'singora-karaoke-backend',
    version: '1.0.0',
    uptime_s: Math.round(process.uptime()),
    users,
    songs,
    recordings
  });
});

app.use('/v1', v1Routes);
app.use('/', webRoutes);

// JSON 404 handler matching ServerErrorResponse
app.use((req, res) => {
  res.status(404).json({ status: 404, message: `Route not found: ${req.method} ${req.originalUrl}` });
});

// Global JSON error handler (prevents HTML stack trace leaks & normalizes Multer/JSON errors)
app.use((err, _req, res, _next) => {
  if (err instanceof multer.MulterError) {
    const status = err.code === 'LIMIT_FILE_SIZE' ? 413 : 400;
    return res.status(status).json({
      status,
      message: err.code === 'LIMIT_FILE_SIZE'
        ? 'Uploaded file exceeds maximum allowed size (50 MB).'
        : `Upload error: ${err.message}`
    });
  }
  const status = Number(err.statusCode || err.status || 500);
  const safeMessage = status < 500
    ? (err.message || 'Bad request')
    : 'Internal server error';
  if (status >= 500) {
    console.error('[Backend Error]', err);
  }
  res.status(status).json({ status, message: safeMessage });
});

const server = app.listen(PORT, '0.0.0.0', () => {
  console.log(`Singora Karaoke Backend listening on http://0.0.0.0:${PORT} (Emulator URL: http://10.0.2.2:${PORT}/)`);
});

function gracefulShutdown(signal) {
  console.log(`[Singora Backend] Received ${signal}, shutting down gracefully...`);
  server.close(() => {
    closeDb();
    process.exit(0);
  });
  setTimeout(() => {
    closeDb();
    process.exit(0);
  }, 5000).unref();
}

process.on('SIGINT', () => gracefulShutdown('SIGINT'));
process.on('SIGTERM', () => gracefulShutdown('SIGTERM'));
