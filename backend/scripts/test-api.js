const assert = require('node:assert/strict');
const fs = require('node:fs');
const path = require('node:path');

const BASE = (process.env.API_URL || process.env.BASE_URL || 'http://127.0.0.1:3000').replace(/\/+$/, '');

async function reqJson(method, urlPath, { token, body, headers = {} } = {}) {
  const opts = {
    method,
    headers: {
      'Accept': 'application/json',
      'App-Version': '2.1.0',
      'Os': '16',
      'Unique-Id': 'test-device-001',
      'Current-Time': String(Math.floor(Date.now() / 1000)),
      ...headers
    }
  };
  if (token) opts.headers['Authorization'] = `Bearer ${token}`;
  if (body && !(body instanceof FormData)) {
    opts.headers['Content-Type'] = 'application/json';
    opts.body = JSON.stringify(body);
  } else if (body instanceof FormData) {
    opts.body = body;
  }
  const res = await fetch(`${BASE}${urlPath}`, opts);
  const text = await res.text();
  let json = null;
  try {
    json = text ? JSON.parse(text) : {};
  } catch (e) {
    throw new Error(`Invalid JSON on ${method} ${urlPath} (${res.status}): ${text.slice(0, 200)}`);
  }
  assert.ok(res.ok, `HTTP ${res.status} on ${method} ${urlPath}: ${text}`);
  return json;
}

(async () => {
  console.log(`Testing Singora Backend at ${BASE}...`);

  // 1. Health
  const health = await reqJson('GET', '/health');
  assert.equal(health.ok, true);
  assert.ok(health.songs >= 6);

  // 2. Device Auth & Social Login
  const devRes = await reqJson('POST', '/v1/auth/device?os=2&os_version=16&app_version=2.1.0&unique_id=emu_test_1');
  assert.equal(devRes.data.registered, true);

  const testGgId = `gg_tester_${Date.now()}`;
  const loginRes = await reqJson('POST', `/v1/auth/google/login?gg_user_id=${testGgId}&full_name=Test+Vocalist&email=tester@singora.app&unique_id=emu_test_1`);
  const user = loginRes.data;
  assert.ok(user.id > 0);
  assert.ok(user.access_token && user.access_token.startsWith('sgr_'));
  const token = user.access_token;

  // 3. Profile, Search, Suggestion, Follow
  const prof = await reqJson('GET', `/v1/users/${user.id}`, { token });
  assert.equal(prof.data.full_name, 'Test Vocalist');

  const updProf = await reqJson('POST', `/v1/users/${user.id}?full_name=Pro+Vocalist&bio=Emulator+Verified`, { token });
  assert.equal(updProf.data.full_name, 'Pro Vocalist');

  const sugg = await reqJson('GET', '/v1/users/suggestion', { token });
  assert.ok(Array.isArray(sugg.data) && sugg.data.length > 0);

  await reqJson('POST', '/v1/follows?user_id=1&status=1', { token });
  const following = await reqJson('GET', `/v1/follows/following?follower_id=${user.id}`, { token });
  assert.ok(following.data.some(u => u.id === 1));

  // 4. Songs, Search, GetLink, Keywords
  const songs = await reqJson('GET', '/v1/songs?page=1&type=recommend&per_page=20', { token });
  assert.ok(songs.data.length >= 6);
  assert.ok(songs.data[0].link_video.includes('/media/songs/'));

  const songSearch = await reqJson('GET', '/v1/songs/search?name=Midnight&page=1', { token });
  assert.ok(songSearch.data.length >= 1);

  const songLink = await reqJson('GET', `/v1/songs/getLink?youtube_id=${songs.data[0].youtubeId}&type=1`, { token });
  assert.equal(songLink.status, 1);
  assert.ok(songLink.link.endsWith('.mp4'));

  await reqJson('POST', '/v1/keywords?name=Starlight', { token });
  const kws = await reqJson('GET', '/v1/keywords?page=1&orderBy=hot', { token });
  assert.ok(kws.data.some(k => k.name === 'Starlight'));

  // 5. Explore & Recordings & Multipart Upload
  const explores = await reqJson('GET', '/v1/explores', { token });
  assert.equal(explores.data.length, 4);

  const expRecs = await reqJson('GET', '/v1/explores/recordings?type=1&per_page=6', { token });
  assert.ok(expRecs.data.length > 0);

  const feed = await reqJson('GET', '/v1/recordings?page=1&type=1', { token });
  assert.ok(feed.data.length >= 6);

  const sampleM4a = fs.readFileSync(path.join(__dirname, '..', 'public', 'media', 'songs', 'rec-1.m4a'));
  const fd = new FormData();
  fd.append('audio', new Blob([sampleM4a], { type: 'audio/mp4' }), 'test-cover.m4a');
  fd.append('song_id', '1');
  fd.append('name', 'Automated Test Cover');
  fd.append('message', 'Uploaded via multipart test');
  fd.append('privacy', '0');
  fd.append('duration', '20');
  const createdRec = await reqJson('POST', '/v1/recordings', { token, body: fd });
  assert.equal(createdRec.data.name, 'Automated Test Cover');
  const newRecId = createdRec.data.id;

  // Duet segments save
  const duetRes = await reqJson('POST', `/v1/duets/${newRecId}`, {
    token,
    body: { segments: JSON.stringify([{ n: 'Part 1', s: 0, e: 10 }]) }
  });
  assert.equal(duetRes.data.recording_id, newRecId);

  // 6. Comments, Likes, Gifts, Diamonds, Daily Tasks
  const commentRes = await reqJson('POST', `/v1/comments?commentable_id=${newRecId}&commentable_type=recording&message=Great+take!`, { token });
  assert.equal(commentRes.data.message, 'Great take!');

  const likeRes = await reqJson('POST', `/v1/likes?likeable_id=${newRecId}&likeable_type=recording&status=1`, { token });
  assert.equal(likeRes.data.like_status, true);

  const gifts = await reqJson('GET', '/v1/gifts', { token });
  assert.ok(gifts.data.length >= 5);

  const giftSend = await reqJson('POST', `/v1/gifts/present?recording_id=1&gift_id=${gifts.data[0].id}&quantity=1&unique_id=emu_test_1`, { token });
  assert.equal(giftSend.data.gifted, true);

  const iapRes = await reqJson('POST', '/v1/diamonds/apple/exchange?transaction_id=tx_999&product_id=lv1.diamonds&state=purchased', { token });
  assert.equal(iapRes.status, 1);
  assert.equal(iapRes.amount, 60);

  const tasks = await reqJson('GET', '/v1/daily-task', { token });
  assert.ok(tasks.data.length >= 4);
  await reqJson('POST', '/v1/daily-task/addLog?type=1&unique_id=emu_test_1', { token });
  const reward = await reqJson('POST', `/v1/daily-task/collect-reward?daily_task_id=${tasks.data[0].id}&unique_id=emu_test_1`, { token });
  assert.equal(reward.status, 201);
  assert.ok(reward.coins > 0);

  // Cleanup test recording so public feed stays neat
  await reqJson('DELETE', `/v1/recordings/${newRecId}`, { token });

  // 7. HTTP Range Streaming (206 Partial Content) & WebView Compliance Pages
  const rangeRes = await fetch(`${BASE}/media/songs/song-1.mp4`, {
    headers: { Range: 'bytes=0-1023' }
  });
  assert.equal(rangeRes.status, 206, 'Expected 206 Partial Content for media Range request');
  const buf = await rangeRes.arrayBuffer();
  assert.equal(buf.byteLength, 1024);

  for (const webPath of ['/privacy', '/terms', '/report-violation?content_id=1', '/delete-account']) {
    const wRes = await fetch(`${BASE}${webPath}`);
    assert.equal(wRes.status, 200, `Expected 200 on ${webPath}`);
    assert.equal(wRes.headers.get('x-content-type-options'), 'nosniff');
  }

  // 8. Production Security Hardening Checks (Rate-limit headers, unsafe upload rejection, JSON error handler)
  const songsRes = await fetch(`${BASE}/v1/songs`);
  assert.ok(songsRes.headers.get('x-ratelimit-limit'), 'Expected X-RateLimit-Limit header on /v1 routes');

  const badForm = new FormData();
  badForm.append('image', new Blob(['<svg onload=alert(1)>'], { type: 'image/svg+xml' }), 'xss.svg');
  const badUploadRes = await fetch(`${BASE}/v1/images/add`, {
    method: 'POST',
    headers: { Authorization: `Bearer ${token}` },
    body: badForm
  });
  assert.equal(badUploadRes.status, 400, 'Expected 400 rejection for unsafe .svg upload');
  const badUploadJson = await badUploadRes.json();
  assert.equal(badUploadJson.status, 400);

  const badJsonRes = await fetch(`${BASE}/v1/images/deletes`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json', Authorization: `Bearer ${token}` },
    body: '{bad_json'
  });
  assert.equal(badJsonRes.status, 400, 'Expected 400 JSON response for malformed JSON body');
  const badJsonPayload = await badJsonRes.json();
  assert.equal(badJsonPayload.status, 400);

  // 9. Self-service Account Deletion (Google Play policy compliance + keeps DB clean)
  const delAccountRes = await reqJson('DELETE', '/v1/users/me', { token });
  assert.equal(delAccountRes.status, 1);

  console.log('ALL 33 INTEGRATION & SECURITY CHECKS PASSED SUCCESSFULLY!');
})();
