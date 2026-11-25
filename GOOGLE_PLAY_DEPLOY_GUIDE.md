# Singora (`com.banhbao.singora`) — Full-Stack Run & Google Play Store Deployment Guide

## 1. Quick Start: Run Backend + Both Apps Locally (Emulator)

### Step 1: Start the Singora Karaoke Backend
```powershell
cd D:\revert\work\hakara-2.1.0-recovery\backend
npm install
npm run generate-media   # Synthesizes playable stereo karaoke MP4/M4A tracks & artwork via FFmpeg
npm start                # Listens on http://0.0.0.0:3000 (Emulator: http://10.0.2.2:3000/)
```
- Verify backend health, HTTP `206` Range streaming, uploads, UGC compliance & all 57 endpoints anytime with the **33-check automated test suite**:
  ```powershell
  npm test
  ```
- *(Optional)* Expose your local backend over a public HTTPS URL via Cloudflare Tunnel for physical-device testing:
  ```powershell
  cd D:\revert\work\hakara-2.1.0-recovery
  .\scripts\start-https-tunnel.ps1
  ```

### Step 2: Build & Run Either App on Android Emulator
Both apps can be installed **side-by-side** on the same Android 16 (`Medium_Phone_API_36`) emulator:

- **App 1 — Patched Original App (`mtp.media.karaoke`):**
  ```powershell
  .\scripts\build-custom-apk.ps1 -Install
  ```
- **App 2 — Rebranded Production Clone: Singora (`com.banhbao.singora`, `targetSdkVersion 35`):**
  ```powershell
  .\scripts\build-singora.ps1 -Install
  ```

---

## 2. Production Backend Deployment

The Singora backend (`backend/`) runs on **Node.js 22** with built-in **`node:sqlite` (WAL mode)**, **`multer`**, and **FFmpeg**, requiring **no external database service**.

### 2.1 Production Security & Environment Variables (`ENFORCE_SIG=true`)

Before exposing the backend publicly, configure these environment variables on your host/platform:

| Variable | Recommended Production Value | Purpose |
| :--- | :--- | :--- |
| `PORT` | `3000` *(or platform-assigned)* | HTTP listen port behind TLS load balancer / reverse proxy. |
| `PUBLIC_BASE_URL` | `https://api.singora.app` | Canonical public HTTPS origin used when generating media & compliance links. |
| `JWT_SECRET` | `<64-char random hex>` | Secret key signing `Authorization: Bearer <token>` sessions. |
| `ENFORCE_SIG` | `true` | Enforces strict `HMAC-SHA256` verification of the `Sig` request header (`App-Version`, `Current-Time`, `Os`, `Unique-Id`), rejecting unsigned or tampered requests. |
| `APP_HMAC_KEY` | `<key matching NativeUtils.getAppKey()>` | Shared HMAC secret paired with `libAudioEngine.so` (`Java_mtp_media_karaoke_utils_NativeUtils_getAppKey`). |

### 2.2 Option A: Docker Compose ([`docker-compose.yml`](docker-compose.yml))
Ideal for any Linux VPS / VM behind Caddy, Nginx, or Cloudflare Tunnel. Persists the SQLite WAL database and uploaded karaoke recordings across container restarts:

```powershell
# Set production secrets in environment or .env, then launch:
$env:ENFORCE_SIG="true"
$env:APP_HMAC_KEY="<your-app-hmac-key>"
$env:JWT_SECRET="<your-strong-jwt-secret>"
$env:PUBLIC_BASE_URL="https://api.singora.app"

docker compose up -d --build
```

### 2.3 Option B: Google Cloud Run — `asia-southeast1` ([`scripts/deploy-cloudrun.ps1`](scripts/deploy-cloudrun.ps1))
Deploys the containerized backend directly to **Google Cloud Run** in **`asia-southeast1` (Singapore)** with managed TLS and low-latency Southeast Asia routing:

```powershell
.\scripts\deploy-cloudrun.ps1
```
- Pass or configure `ENFORCE_SIG=true`, `APP_HMAC_KEY`, and `JWT_SECRET` in Cloud Run service environment variables/Secret Manager, and mount a Cloud Storage volume (Cloud Run Gen2 volume mount) if you require durable multi-revision persistence for `node:sqlite` and user uploads.

### 2.4 Option C: Render Blueprint ([`render.yaml`](render.yaml))
1. Push this repository to GitHub/GitLab and select **New -> Blueprint** in the Render Dashboard.
2. Render automatically provisions the Docker service, health checks, and persistent disk defined in [`render.yaml`](render.yaml).
3. In the Render **Environment** tab, set `ENFORCE_SIG=true`, `APP_HMAC_KEY`, `JWT_SECRET`, and `PUBLIC_BASE_URL`.

### 2.5 Option D: Railway ([`railway.json`](railway.json))
1. Deploy from GitHub or run `railway up` from the repository root (configured via [`railway.json`](railway.json)).
2. Attach a Railway **Volume** for persistent SQLite WAL & media storage, and set `ENFORCE_SIG=true`, `APP_HMAC_KEY`, `JWT_SECRET`, and `PUBLIC_BASE_URL` under **Variables**.

---

## 3. Building Your Production Google Play Bundle (`.aab`)

When your backend is deployed to your HTTPS domain (for example `https://api.singora.app/` and `https://www.singora.app`):

1. **Set your production domain** in [`singora-config.json`](singora-config.json):
   ```json
   {
     "appName": "Singora",
     "packageId": "com.banhbao.singora",
     "versionCode": 1,
     "versionName": "1.0.0",
     "targetSdkVersion": 35,
     "productionApiBaseUrl": "https://api.singora.app/",
     "productionWebBaseUrl": "https://www.singora.app"
   }
   ```

2. **Build the Production Signed APK (16 KB ZIP-aligned, strict HTTPS):**
   ```powershell
   .\scripts\build-singora.ps1 -Production
   ```
   Output: `dist-singora\singora-1.0.0-playstore-release-signed.apk`

3. **Convert & Validate the Google Play Android App Bundle (`.aab`):**
   ```powershell
   .\scripts\build-singora-aab.ps1
   ```
   Output: `dist-singora\singora-1.0.0-playstore-release.aab` (signed with `keystore\singora-upload-key.jks` and verified via official Google `bundletool validate`).

---

## 4. Android 14–16 (`targetSdkVersion 35`) Runtime Hardening Summary

Because the original Hakara 2.1.0 client targeted legacy Android SDKs, upgrading Singora to **`targetSdkVersion 35`** and running cleanly on **Android 14, 15, and 16 (`API 34–36`)** required comprehensive bytecode, manifest, layout, and billing hardening:

| Area | Android 14–16 Breaking Change | Singora Hardening Applied |
| :--- | :--- | :--- |
| **`PendingIntent` & Dynamic `BroadcastReceiver`** | Android 12+ throws `IllegalArgumentException` without explicit mutability flags; Android 14+ (`targetSdk >= 34`) throws `SecurityException` on dynamic `registerReceiver` without export flags. | Injected **`PendingIntentCompat`** (`FLAG_IMMUTABLE` default shim) and a dynamic `BroadcastReceiver` registration shim applying **`RECEIVER_EXPORTED`** where system/app broadcasts are registered dynamically. |
| **`WorkManager` Exact Alarms** | Legacy bundled `WorkManager` (`Alarms`) invoked exact alarm APIs that crash on Android 12–16 without `SCHEDULE_EXACT_ALARM`. | Patched `Alarms` scheduling to use inexact **`AlarmManager.set(...)`**, eliminating background job crashes without requesting restricted alarm permissions. |
| **`SingTicker` Native Timer & YouTube Removal** | Original singing flow coupled playback/lyric ticker progress to an embedded YouTube scraper/player (violating Play Store policy and breaking offline/self-hosted tracks). | Decoupled **`SingTicker`** native C++/client timing from YouTube so lyric synchronization and vocal recording run directly against licensed first-party MP4/M4A karaoke streams; removed legacy YouTube scraping. |
| **Android 13+ Storage Permissions** | `READ_EXTERNAL_STORAGE` is a no-op on Android 13+ (`API 33+`), blocking local media selection and recording access. | Upgraded manifest declarations and runtime permission checks to granular **`READ_MEDIA_AUDIO`**, **`READ_MEDIA_VIDEO`**, and **`READ_MEDIA_IMAGES`** permissions while maintaining backward compatibility. |
| **Custom `LayoutManager` XML Inflation** | Rebranding the application package (`com.banhbao.singora`) broke relative/custom `RecyclerView` layout manager class resolution in XML layouts. | Fixed fully-qualified class & namespace bindings for **`GiftRecordingLinearLayoutManager`** and **`CustomLinearLayoutManager`** while preserving `mtp.media.karaoke.*` Java class names required by `libAudioEngine.so` JNI symbols. |
| **Google Play Billing SKUs** | In-app product IDs were hardcoded to the legacy `mtp.media.karaoke` namespace. | Rebranded all 6 diamond top-up SKUs across client & backend (`GET /v1/skus` & Google receipt exchange) to **`com.banhbao.singora.lv1.diamonds`** .. **`com.banhbao.singora.lv6.diamonds`**. |
| **Network & WebView Token Security (`F-01` / `F-02`)** | Legacy client leaked `Authorization`/`Sig` headers to `http://suggestqueries.google.com` and placed JWTs in `/report-violation?token=...` URLs. | Enforced `cleartextTrafficPermitted="false"` in production, upgraded autocomplete to HTTPS with host-scoped auth headers, and moved WebView auth into `Authorization: Bearer` request headers. |

---

## 5. Technical Note: 16 KB Page Size Alignment (`arm64-v8a` Native Libraries)

Android 15+ introduces support for devices configured with **16 KB (`0x4000`) memory pages**, which requires two distinct alignment layers for uncompressed native `.so` libraries:

1. **APK / AAB ZIP Entry Alignment (`Implemented`):**
   - [`scripts/build-singora.ps1`](scripts/build-singora.ps1) aligns the packaged archive using **`zipalign -P 16 -f 4`**, ensuring uncompressed `.so` entries inside the APK (and converted `.aab`) start on **16 KB (`16384`-byte)** ZIP boundaries.
2. **Internal ELF `PT_LOAD` Segment Alignment (`Prebuilt 2021 Binary Caveat`):**
   - Out of the **27** prebuilt `arm64-v8a/*.so` libraries inherited from the 2021 release, **4** already use `>= 0x4000` alignment, while **23 libraries** (including `libAudioEngine.so`, `libavcodec.so`, `libavformat.so`, `libavutil.so`, `libswresample.so`, `libswscale.so`, `libcainfilter.so`, and `libsoundtouch.so`) were compiled with an older Android NDK using **`0x1000` (4 KB)** ELF `PT_LOAD` `p_align` values.
   - **Runtime Behavior:** On all standard 4 KB page-size Android 14–16 phones, tablets, and emulators, Singora installs and runs normally. On hardware booted with a 16 KB kernel page size, `dlopen` rejects `0x1000`-aligned 64-bit ELF segments.

### Practical Options if Google Play Console Enforces Strict `ELF PT_LOAD >= 0x4000` Checks

If Google Play Console blocks a `targetSdkVersion 35+` release or displays a mandatory 16 KB ELF alignment error in **App bundle explorer**:

- **Option 1 — Recompile Media Stack with Android NDK r27+ (Recommended Production Path):**
  - Rebuild the open-source audio/video dependencies (**FFmpeg** `libav*`/`libsw*`, **SoundTouch** `libsoundtouch.so`, and **CainMedia/CainFilter** `libcainfilter.so`) using **Android NDK r27+** (where `max-page-size=16384` is enabled by default for `arm64-v8a` and `x86_64`) or pass `-Wl,-z,max-page-size=16384` explicitly.
  - Reimplement the thin JNI bridge in **`libAudioEngine.so`** (`SingActivity`, `ProcessActivity`, and `NativeUtils.getAppKey`) in C++ compiled with NDK r27+ so all `arm64-v8a/*.so` binaries carry native `0x4000` `PT_LOAD` alignment.
- **Option 2 — ABI Packaging & Transitional Delivery Options:**
  - **Verify Play Console Delivery Warnings vs. Hard Blocks:** Upload `dist-singora\singora-1.0.0-playstore-release.aab` to an **Internal Testing** track first to inspect Play Console's *App bundle explorer -> 16 KB page size* status under current enforcement rules.
  - **ABI Packaging Considerations:** Note that Google Play policy requires `arm64-v8a` native libraries whenever 32-bit `armeabi-v7a` `.so` files are shipped (so 32-bit-only `armeabi-v7a` packaging is only viable for direct APK sideloading, not Play Store submission). Keeping `zipalign -P 16 -f 4` active while migrating `libAudioEngine.so` + FFmpeg under Option 1 is the cleanest path to full 16 KB hardware support.

---

## 6. Google Play Console Submission Checklist

| Play Console Section | What to Provide / Configure |
| :--- | :--- |
| **App Bundle Upload** | Upload `dist-singora\singora-1.0.0-playstore-release.aab` under **Production** or **Internal Testing**. Keep `keystore\singora-upload-key.jks` backed up safely! |
| **Google Sign-In / Firebase** | Copy the **App Signing Key SHA-1** from Google Play Console (*Setup -> App signing*) + your upload key SHA-1 (`8B:35:CB:BB:39:B0:7D:A3:EF:7B:46:FB:54:1E:CD:18:5A:03:2F:5E`) into your Google Cloud / Firebase Android OAuth client for `com.banhbao.singora`. |
| **In-App Products (Play Billing)** | Create active managed products matching the 6 rebranded SKUs: `com.banhbao.singora.lv1.diamonds` through `com.banhbao.singora.lv6.diamonds`. |
| **Privacy Policy URL** | `https://<your-domain>/privacy` (served directly by `backend/src/routes/web.js`). |
| **Account Deletion URL** | `https://<your-domain>/delete-account` (served by `backend/src/routes/web.js` + authenticated in-app deletion via `DELETE /v1/users/me`). |
| **UGC Moderation Declaration** | Declare that Singora provides in-app Terms acceptance on sign-in, in-app Content & Profile Reporting (`/report-violation`), and in-app User Blocking (`POST /v1/blocks`). |
| **Store Listing Icon** | Upload [`assets-singora/play_store_512.png`](assets-singora/play_store_512.png) (512×512 high-res icon). |
| **Music Licensing Rights** | Only host backing tracks in `backend/public/media/songs/` for which you hold distribution/karaoke rights. Legacy YouTube scraping has been completely removed. |
