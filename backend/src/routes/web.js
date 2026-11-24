const express = require('express');
const { db, nowStr } = require('../db');

const router = express.Router();

function pageLayout(title, bodyHtml) {
  return `<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>${title} — Singora</title>
  <style>
    :root { color-scheme: light; --bg: #0f172a; --card: #1e293b; --ink: #f8fafc; --muted: #94a3b8; --accent: #ec4899; --accent2: #8b5cf6; }
    * { box-sizing: border-box; }
    body { margin: 0; font: 15px/1.6 system-ui, -apple-system, sans-serif; background: var(--bg); color: var(--ink); padding: 20px; }
    .card { max-width: 680px; margin: 0 auto; background: var(--card); border-radius: 16px; padding: 24px; border: 1px solid rgba(255,255,255,0.08); }
    h1 { margin-top: 0; font-size: 1.5rem; background: linear-gradient(90deg, var(--accent), var(--accent2)); -webkit-background-clip: text; -webkit-text-fill-color: transparent; }
    h2 { font-size: 1.1rem; margin-top: 1.4rem; color: #e2e8f0; }
    p, li { color: #cbd5e1; }
    label { display: block; font-weight: 600; margin: 12px 0 6px; }
    select, textarea, input { width: 100%; padding: 10px 12px; border-radius: 10px; border: 1px solid #334155; background: #0f172a; color: white; font: inherit; }
    button { margin-top: 16px; width: 100%; padding: 12px; border: 0; border-radius: 10px; font-weight: 700; color: white; background: linear-gradient(90deg, var(--accent), var(--accent2)); cursor: pointer; }
    .ok { padding: 14px; border-radius: 10px; background: rgba(16,185,129,0.18); border: 1px solid #10b981; color: #a7f3d0; }
  </style>
</head>
<body>
  <div class="card">${bodyHtml}</div>
</body>
</html>`;
}

router.get('/privacy', (_req, res) => {
  res.send(pageLayout('Privacy Policy', `
    <h1>Singora Privacy Policy</h1>
    <p>Effective Date: November 2026</p>
    <p>Singora ("we", "our") respects your privacy and complies with Google Play User Data and Data Safety policies.</p>
    <h2>1. Data We Process</h2>
    <ul>
      <li><strong>Account Profile:</strong> Display name, email, and avatar when you sign in.</li>
      <li><strong>Audio & Video Recordings:</strong> Microphone and optional camera recordings only when you actively record or publish a karaoke performance.</li>
      <li><strong>Location (Optional):</strong> Used solely if you browse Nearby recordings.</li>
    </ul>
    <h2>2. Data Security & Sharing</h2>
    <p>All API communications are encrypted over HTTPS in production, and we never sell personal data or expose authentication tokens in URLs.</p>
    <h2>3. Account & Data Deletion</h2>
    <p>You may permanently delete your account and all uploaded recordings at any time via <a href="/delete-account" style="color:#f472b6">/delete-account</a> or in-app Support settings.</p>
  `));
});

router.get('/terms', (_req, res) => {
  res.send(pageLayout('Terms of Use & UGC Guidelines', `
    <h1>Terms of Use & Community Guidelines</h1>
    <p>By using Singora and creating or sharing karaoke recordings, you agree to our User-Generated Content (UGC) safety standards:</p>
    <h2>1. Zero Tolerance for Objectionable Content</h2>
    <ul>
      <li>No harassment, hate speech, bullying, explicit/adult content, or unauthorized copyrighted material.</li>
      <li>Strict zero-tolerance policy for Child Sexual Abuse Material (CSAM) or child exploitation.</li>
    </ul>
    <h2>2. In-App Reporting & Blocking</h2>
    <p>Users can block abusive accounts immediately from any profile and report recordings, comments, or profiles using the in-app Report tool. Moderation reports are reviewed and acted upon within 24 hours.</p>
  `));
});

router.get('/report-violation', (req, res) => {
  const contentId = String(req.query.content_id || '');
  const contentType = String(req.query.content_type || 'r');
  const lang = String(req.query.lang || 'en');
  const region = String(req.query.region || 'VN');
  res.send(pageLayout('Report Violation', `
    <h1>Report Content or User</h1>
    <p>Help keep Singora safe. No account token is exposed in this page URL.</p>
    <form method="POST" action="/report-violation">
      <input type="hidden" name="content_id" value="${contentId.replace(/"/g, '')}" />
      <input type="hidden" name="content_type" value="${contentType.replace(/"/g, '')}" />
      <input type="hidden" name="lang" value="${lang.replace(/"/g, '')}" />
      <input type="hidden" name="region" value="${region.replace(/"/g, '')}" />
      <label for="reason">Reason for Report</label>
      <select id="reason" name="reason" required>
        <option value="spam">Spam or misleading content</option>
        <option value="harassment">Harassment or hate speech</option>
        <option value="inappropriate">Inappropriate audio / image</option>
        <option value="copyright">Copyright / music rights concern</option>
      </select>
      <label for="details">Additional Details</label>
      <textarea id="details" name="details" rows="4" placeholder="Describe the issue..."></textarea>
      <button type="submit">Submit Moderation Report</button>
    </form>
  `));
});

router.post('/report-violation', express.urlencoded({ extended: true }), (req, res) => {
  const b = req.body || {};
  db.prepare(`
    INSERT INTO reports (reporter_id, content_id, content_type, reason, details, lang, region, status, created_at)
    VALUES (?, ?, ?, ?, ?, ?, ?, 'open', ?)
  `).run(
    req.user ? req.user.id : null,
    String(b.content_id || ''),
    String(b.content_type || 'r'),
    String(b.reason || 'other'),
    String(b.details || ''),
    String(b.lang || 'en'),
    String(b.region || 'VN'),
    nowStr()
  );
  res.send(pageLayout('Report Submitted', `
    <h1>Thank You</h1>
    <div class="ok">Your report has been logged for moderation review. You can also block this user directly from their profile menu.</div>
  `));
});

router.get('/delete-account', (_req, res) => {
  res.send(pageLayout('Delete Account & Data', `
    <h1>Delete Your Singora Account</h1>
    <p>In compliance with Google Play's Account Deletion policy, submitting this form permanently deletes your profile, recordings, comments, and uploaded photos.</p>
    <form method="POST" action="/delete-account">
      <label for="email">Confirm Account Email or UID</label>
      <input id="email" name="email" type="text" placeholder="you@singora.app" required />
      <button type="submit">Request Permanent Account Deletion</button>
    </form>
  `));
});

router.post('/delete-account', express.urlencoded({ extended: true }), (req, res) => {
  const identifier = String((req.body && req.body.email) || '').trim();
  if (identifier) {
    const user = db.prepare('SELECT * FROM users WHERE email = ? OR uid = ?').get(identifier, identifier);
    if (user && user.id > 4) { // protect seeded demo profiles 1..4 from accidental wipe
      db.prepare('DELETE FROM recordings WHERE user_id = ?').run(user.id);
      db.prepare('DELETE FROM comments WHERE user_id = ?').run(user.id);
      db.prepare('DELETE FROM users WHERE id = ?').run(user.id);
    }
  }
  res.send(pageLayout('Account Deleted', `
    <h1>Deletion Completed</h1>
    <div class="ok">If a matching user account existed, its profile and user-generated content have been permanently deleted.</div>
  `));
});

router.get('/share/recording/:id', (req, res) => {
  const rec = db.prepare('SELECT * FROM recordings WHERE id = ?').get(Number(req.params.id));
  res.send(pageLayout(rec ? rec.name : 'Shared Performance', `
    <h1>${rec ? rec.name : 'Singora Performance'}</h1>
    <p>${rec ? rec.message : 'Listen and duet on Singora!'}</p>
    ${rec ? `<audio controls src="${rec.url}" style="width:100%;margin-top:12px"></audio>` : ''}
  `));
});

module.exports = router;
