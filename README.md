# Singora (`com.banhbao.singora`) & Hakara 2.1.0 Full-Stack Monorepo

Production-ready full-stack mobile karaoke platform comprising:
1. **Singora Backend (`backend/`)** — A self-contained **Node.js 22** REST & media server backed by `node:sqlite` (WAL mode), `multer`, and **FFmpeg**, implementing all **57 client REST endpoints**, **HTTP `206 Partial Content` Range streaming**, HMAC-SHA256 request verification, and Google Play compliance WebViews.
2. **Singora Android Client (`com.banhbao.singora`)** — A fully rebranded, security-hardened **Android 14–16 (`targetSdkVersion 35`)** build pipeline generating 16 KB ZIP-aligned signed APKs and `bundletool`-validated Google Play Android App Bundles (`.aab`).
3. **Hakara 2.1.0 Reference Recovery (`extracted/`, `emulator-test-apktool/`, `android-project/`)** — Complete reverse-engineered JADX Java sources, buildable Smali reference tree (`mtp.media.karaoke`), and Android Studio Gradle workspace.

---

## 1. Architecture Overview

| Layer | Directory / Key Files | Technology & Capabilities |
| :--- | :--- | :--- |
| **Karaoke API & Media Backend** | [`backend/`](backend/) | **Node.js 22** + built-in **`node:sqlite` (WAL mode)** + **`multer`** multipart uploads + **FFmpeg** synthesis/transcoding + **HTTP `206` Range** audio/video streaming + **57 `/v1/*` REST endpoints** + optional **HMAC-SHA256 `Sig`** enforcement + built-in **Compliance WebViews** (`/privacy`, `/terms`, `/delete-account`, `/report-violation`). |
| **Rebranded Play Store App (`Singora`)** | [`singora-config.json`](singora-config.json), [`singora-apktool/`](singora-apktool/), [`scripts/build-singora.ps1`](scripts/build-singora.ps1), [`scripts/build-singora-aab.ps1`](scripts/build-singora-aab.ps1) | Package ID **`com.banhbao.singora`**, **`targetSdkVersion 35`**, Android 14–16 runtime hardening (`PendingIntentCompat` `FLAG_IMMUTABLE`, `RECEIVER_EXPORTED` shim, `AlarmManager.set` WorkManager fix, `SingTicker` native timer decoupled from YouTube, `READ_MEDIA_*` permissions, custom `LayoutManager` namespace fixes), rebranded Play Billing SKUs (`com.banhbao.singora.lv1.diamonds` .. `lv6.diamonds`), and strict HTTPS production networking. |
| **Reverse-Engineered Reference (`Hakara 2.1.0`)** | [`extracted/`](extracted/), [`emulator-test-apktool/`](emulator-test-apktool/), [`android-project/`](android-project/) | **99.8% clean** decompiled first-party Java/Kotlin classes (`mtp.media.karaoke.*` & `p555j.p556a.p557a.*`), **3,720** decoded XML resources, **86** prebuilt JNI `.so` libraries, F-01/F-02 security fixes, and side-by-side reference APK builder ([`scripts/build-custom-apk.ps1`](scripts/build-custom-apk.ps1)). |

### Repository Structure

```text
hakara-2.1.0-recovery/
├── backend/                        # Node.js 22 + node:sqlite (WAL) + Multer + FFmpeg server
│   ├── src/                        # Express routes (57 REST endpoints + compliance WebViews)
│   ├── public/media/               # Backing tracks (MP4/M4A), cover art, and uploaded recordings
│   └── test/                       # Automated 33-check API, streaming, UGC & security test suite
├── singora-apktool/                # Rebranded Singora (com.banhbao.singora, targetSdk 35) tree
├── assets-singora/                 # Singora launcher icons & 512x512 Play Store icon
├── keystore/                       # Upload keystore (singora-upload-key.jks)
├── dist-singora/                   # Signed Singora APKs & validated Google Play .aab bundles
├── emulator-test-apktool/          # Patched original reference Smali tree (mtp.media.karaoke)
├── extracted/                      # Decompiled JADX Java sources & raw APK analysis artifacts
├── android-project/                # Standard Android Studio Gradle source project
├── scripts/
│   ├── build-singora.ps1           # Build & sign Singora APK (emulator or -Production HTTPS)
│   ├── build-singora-aab.ps1       # Build, sign & bundletool-validate Google Play .aab
│   ├── build-custom-apk.ps1        # Build & sign reference mtp.media.karaoke APK
│   ├── start-https-tunnel.ps1      # Start Cloudflare quick HTTPS tunnel to local backend
│   └── deploy-cloudrun.ps1         # Deploy backend container to Google Cloud Run (asia-southeast1)
├── singora-config.json             # Singora branding, version, targetSdk & production URLs
├── app-config.json                 # Reference mtp.media.karaoke APK configuration
├── docker-compose.yml              # Production Docker Compose stack (Node 22 + FFmpeg + volumes)
├── render.yaml                     # Render.com Blueprint deployment manifest
├── railway.json                    # Railway.app deployment manifest
├── GOOGLE_PLAY_DEPLOY_GUIDE.md     # Cloud deployment, Android 14-16 hardening & Play Store guide
├── CUSTOMIZATION_GUIDE.md          # Rebranding tracks, package map & security audit fixes
└── BACKEND_API_SPEC.md             # Full client-compatible specification for all 57 endpoints
```

---

## 2. Backend Quickstart & Deployment

### A. Local Node.js 22 Development
Requires **Node.js 22+** (for built-in `node:sqlite`) and **FFmpeg** on `PATH`:

```powershell
cd backend
npm install
npm run generate-media   # Synthesizes playable stereo karaoke MP4/M4A tracks & cover art
npm start                # Listens on http://0.0.0.0:3000 (Android Emulator: http://10.0.2.2:3000/)
```

### B. Automated 33-Check API & Security Test Suite
Validates health, authentication, HMAC-SHA256 `Sig` enforcement, catalog/search, HTTP `206` byte-range streaming, multipart recording upload, Play Billing diamond SKUs, UGC reporting/blocking, and account deletion:

```powershell
cd backend
npm test
```

### C. Docker Compose (`docker-compose.yml`)
Runs the containerized backend with bundled Node.js 22, FFmpeg, and persistent volumes for the SQLite WAL database and uploaded media:

```powershell
docker compose up -d --build
docker compose logs -f
```

### D. Instant Public HTTPS Tunnel (`scripts/start-https-tunnel.ps1`)
Exposes your local port `3000` backend over a public `https://*.trycloudflare.com` endpoint for testing strict-HTTPS production APKs on physical devices:

```powershell
.\scripts\start-https-tunnel.ps1
```

### E. Cloud Deployments (Cloud Run, Render, Railway)
- **Google Cloud Run (`asia-southeast1`):**
  ```powershell
  .\scripts\deploy-cloudrun.ps1
  ```
- **Render:** Create a **Blueprint** instance in the Render Dashboard from [`render.yaml`](render.yaml).
- **Railway:** Connect the repo or run `railway up` using [`railway.json`](railway.json).

> **Production Security Note:** Set `ENFORCE_SIG=true`, `APP_HMAC_KEY`, and a strong `JWT_SECRET` in production so the backend strictly verifies every client request's `HMAC-SHA256` `Sig` header. See [`GOOGLE_PLAY_DEPLOY_GUIDE.md`](GOOGLE_PLAY_DEPLOY_GUIDE.md) for full configuration details.

---

## 3. Building Singora APK & Google Play Store `.aab`

Configure branding, versioning, and production HTTPS URLs in [`singora-config.json`](singora-config.json), then run from the repository root:

```powershell
# 1. Build & install emulator/local Singora APK (connects to local/configured backend)
.\scripts\build-singora.ps1 -Install

# 2. Build production Play Store APK (strict HTTPS + 16 KB zipalign -P 16 -f 4)
.\scripts\build-singora.ps1 -Production
# -> Output: dist-singora\singora-1.0.0-playstore-release-signed.apk

# 3. Build, sign & validate Google Play Android App Bundle (.aab)
.\scripts\build-singora-aab.ps1
# -> Output: dist-singora\singora-1.0.0-playstore-release.aab
```

To build and install the patched original reference client (`mtp.media.karaoke`) **side-by-side** on the same emulator or device:

```powershell
.\scripts\build-custom-apk.ps1 -Install
```

---

## 4. Documentation Guides

- **[`GOOGLE_PLAY_DEPLOY_GUIDE.md`](GOOGLE_PLAY_DEPLOY_GUIDE.md)** — Production backend deployment (Docker, Cloud Run, Render, Railway), `ENFORCE_SIG` + `APP_HMAC_KEY` setup, Android 14–16 (`targetSdkVersion 35`) runtime hardening summary, 16 KB native page-size technical notes, and Google Play Console submission checklist.
- **[`CUSTOMIZATION_GUIDE.md`](CUSTOMIZATION_GUIDE.md)** — Rebranding workflows (Singora, instant APK patcher, and Android Studio `android-project/`), obfuscated package map (`p555j.p556a.p557a`), and F-01/F-02 security patches.
- **[`BACKEND_API_SPEC.md`](BACKEND_API_SPEC.md)** — Complete endpoint reference for all 57 `/v1/*` routes, request headers, `Sig` HMAC-SHA256 calculation, and Gson response envelopes.
