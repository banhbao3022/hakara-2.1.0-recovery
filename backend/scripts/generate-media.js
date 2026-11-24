const path = require('node:path');
const fs = require('node:fs');
const { execFileSync } = require('node:child_process');
const ffmpegPath = require('ffmpeg-static');

const PUBLIC_MEDIA = path.join(__dirname, '..', 'public', 'media');
for (const sub of ['songs', 'avatars', 'covers', 'gifts']) {
  fs.mkdirSync(path.join(PUBLIC_MEDIA, sub), { recursive: true });
}

function runFfmpeg(args) {
  execFileSync(ffmpegPath, ['-y', '-loglevel', 'error', ...args], { stdio: 'inherit' });
}

function generateSolidGradientPng(outPath, width, height, hex1, hex2) {
  if (fs.existsSync(outPath)) return;
  runFfmpeg([
    '-f', 'lavfi',
    '-i', `gradients=s=${width}x${height}:c0=${hex1}:c1=${hex2}:x0=0:y0=0:x1=${width}:y1=${height}:n=2`,
    '-frames:v', '1',
    outPath
  ]);
}

function generatePngFallback(outPath, width, height, hex) {
  if (fs.existsSync(outPath)) return;
  try {
    generateSolidGradientPng(outPath, width, height, hex, '#1e1b4b');
  } catch (_e) {
    runFfmpeg([
      '-f', 'lavfi',
      '-i', `color=c=${hex}:s=${width}x${height}`,
      '-frames:v', '1',
      outPath
    ]);
  }
}

console.log('Generating avatars, covers, and gift PNGs...');
const avatarColors = ['#ec4899', '#8b5cf6', '#06b6d4', '#f59e0b'];
avatarColors.forEach((col, idx) => {
  generatePngFallback(path.join(PUBLIC_MEDIA, 'avatars', `avatar-${idx + 1}.png`), 256, 256, col);
});

const coverColors = ['#6366f1', '#db2777', '#0891b2'];
coverColors.forEach((col, idx) => {
  generatePngFallback(path.join(PUBLIC_MEDIA, 'covers', `cover-${idx + 1}.png`), 720, 405, col);
});

const songColors = ['#9333ea', '#2563eb', '#e11d48', '#d97706', '#059669', '#7c3aed'];
songColors.forEach((col, idx) => {
  generatePngFallback(path.join(PUBLIC_MEDIA, 'covers', `song-${idx + 1}.png`), 400, 400, col);
});

const giftColors = ['#f43f5e', '#eab308', '#ec4899', '#38bdf8', '#a855f7'];
giftColors.forEach((col, idx) => {
  generatePngFallback(path.join(PUBLIC_MEDIA, 'gifts', `gift-${idx + 1}.png`), 192, 192, col);
});

console.log('Generating playable stereo H.264 + AAC karaoke backing videos (.mp4) & vocal covers (.m4a)...');

const songChords = [
  { file: 'song-1.mp4', bg: '#1e1b4b', expr: '0.25*sin(2*PI*261.63*t)+0.2*sin(2*PI*329.63*t)+0.2*sin(2*PI*392.00*t)' },
  { file: 'song-2.mp4', bg: '#0f172a', expr: '0.25*sin(2*PI*220.00*t)+0.2*sin(2*PI*261.63*t)+0.2*sin(2*PI*329.63*t)' },
  { file: 'song-3.mp4', bg: '#311042', expr: '0.25*sin(2*PI*293.66*t)+0.2*sin(2*PI*369.99*t)+0.2*sin(2*PI*440.00*t)' }
];

for (const sc of songChords) {
  const outMp4 = path.join(PUBLIC_MEDIA, 'songs', sc.file);
  if (!fs.existsSync(outMp4)) {
    runFfmpeg([
      '-f', 'lavfi', '-i', `color=c=${sc.bg}:s=640x360:r=24:d=20`,
      '-f', 'lavfi', '-i', `aevalsrc='${sc.expr}|${sc.expr}':s=44100:d=20`,
      '-c:v', 'libx264', '-profile:v', 'baseline', '-level', '3.0', '-pix_fmt', 'yuv420p',
      '-c:a', 'aac', '-b:a', '128k', '-ar', '44100', '-ac', '2',
      '-movflags', '+faststart',
      outMp4
    ]);
  }
}

const recTracks = [
  { file: 'rec-1.m4a', expr: '0.25*sin(2*PI*261.63*t)+0.2*sin(2*PI*329.63*t)+0.25*sin(2*PI*523.25*t*(1+0.01*sin(2*PI*5*t)))' },
  { file: 'rec-2.m4a', expr: '0.25*sin(2*PI*220.00*t)+0.2*sin(2*PI*329.63*t)+0.25*sin(2*PI*440.00*t*(1+0.01*sin(2*PI*5*t)))' }
];

for (const rt of recTracks) {
  const outM4a = path.join(PUBLIC_MEDIA, 'songs', rt.file);
  if (!fs.existsSync(outM4a)) {
    runFfmpeg([
      '-f', 'lavfi', '-i', `aevalsrc='${rt.expr}|${rt.expr}':s=44100:d=20`,
      '-c:a', 'aac', '-b:a', '128k', '-ar', '44100', '-ac', '2',
      '-movflags', '+faststart',
      outM4a
    ]);
  }
}

console.log('Media generation complete!');
