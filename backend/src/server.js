const express = require('express');
const cors = require('cors');
const crypto = require('node:crypto');
const path = require('node:path');
const fs = require('node:fs');
const { db } = require('./db');
const v1Routes = require('./routes/v1');
const webRoutes = require('./routes/web');

const app = express();
const PORT = Number(process.env.PORT || 3000);
const ENFORCE_SIG = process.env.ENFORCE_SIG === 'true';
const APP_HMAC_KEY = process.env.APP_HMAC_KEY || '';

app.use(cors());
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
    if (clientSig !== expected) {
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
    if (filePath.endsWith('.m4a')) res.setHeader('Content-Type', 'audio/mp4');
    if (filePath.endsWith('.mp4')) res.setHeader('Content-Type', 'video/mp4');
    if (filePath.endsWith('.mp3')) res.setHeader('Content-Type', 'audio/mpeg');
  }
}));

app.get('/health', (_req, res) => {
  const users = db.prepare('SELECT COUNT(*) AS c FROM users').get().c;
  const songs = db.prepare('SELECT COUNT(*) AS c FROM songs').get().c;
  const recordings = db.prepare('SELECT COUNT(*) AS c FROM recordings').get().c;
  res.json({ ok: true, service: 'singora-karaoke-backend', users, songs, recordings });
});

app.use('/v1', v1Routes);
app.use('/', webRoutes);

// JSON 404 handler matching ServerErrorResponse
app.use((req, res) => {
  res.status(404).json({ status: 404, message: `Route not found: ${req.method} ${req.originalUrl}` });
});

app.listen(PORT, '0.0.0.0', () => {
  console.log(`Singora Karaoke Backend listening on http://0.0.0.0:${PORT} (Emulator URL: http://10.0.2.2:${PORT}/)`);
});
