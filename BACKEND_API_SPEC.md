# Hakara 2.1.0 (`mtp.media.karaoke`) — Backend API & Data Model Specification

> **Purpose:** This document is extracted from the decompiled Android client (`extracted/jadx-readable-all/sources`) of **Hakara 2.1.0 (versionCode 46)** to enable backend developers to implement a 100% client-compatible REST API server.

---

## 1. Base Configuration & Transport

- **Primary Base URL:** `https://api.karavietnam.com/` (configured in [`NetworkModule3.java`](extracted/jadx-readable-all/sources/p555j/p556a/p557a/p617j/NetworkModule3.java))
- **Content-Type / Serialization:** JSON via Gson (`application/json`), plus `multipart/form-data` for media uploads.
- **Web / WebView Endpoints:**
  - Report User URL (loaded in WebView): `https://www.karavietnam.com/report?access_token=<token>` (Note: see security audit `F-02` in [`report/hakara-2.1.0-technical-audit.html`](report/hakara-2.1.0-technical-audit.html)).

---

## 2. Global Request Headers, Authentication & HMAC-SHA256 Signature

Every request sent through the primary Retrofit `OkHttpClient` passes through [`Interceptor2.java`](extracted/jadx-readable-all/sources/p555j/p556a/p557a/p617j/Interceptor2.java) (`j.a.a.j.c`), which attaches the following HTTP headers:

| Header | Example / Format | Description |
| :--- | :--- | :--- |
| `Accept` | `application/json` | Fixed constant |
| `Accept-Language` | `en-US` or `vi-VN` | `<Locale.language>-<Locale.country>` |
| `Unique-Id` | `<device_id>` | Android device unique identifier (`DeviceUtils.a.m14247a(context)`) |
| `App-Version` | `2.1.0` | Hardcoded client version string |
| `Os` | `11` / `14` | `Build.VERSION.RELEASE` (Android OS release string) |
| `Current-Time` | `1700000000` | Unix epoch timestamp in **seconds** (`Calendar.getInstance().getTimeInMillis() / 1000`) |
| `Sig` | `<64-char hex>` | Lowercase hex-encoded `HMAC-SHA256` signature (see formula below) |
| `Authorization` | `Bearer <access_token>` | Attached only when `access_token` is present in `SharedPreferences` |

### Request Signature (`Sig`) Formula

The client constructs a canonical query-style string from 4 header values in exact order:

```text
data = "App-Version=2.1.0&Current-Time=" + currentTime + "&Os=" + os + "&Unique-Id=" + uniqueId
```

Then computes:

```text
Sig = HexLower(HMAC_SHA256(key = NativeUtils.getAppKey(), data = data))
```

- **Note for Backend Implementation:** `NativeUtils.getAppKey()` is loaded from the native library `libAudioEngine.so` (`extracted/apktool/lib/<abi>/libAudioEngine.so`). When building a custom or replacement backend, the server can either:
  1. Skip `Sig` verification (or make it configurable via environment flag), OR
  2. Verify `Sig` using the secret key extracted from `Java_mtp_media_karaoke_utils_NativeUtils_getAppKey` in `libAudioEngine.so`.

---

## 3. Standard JSON Response Envelopes

All response wrapper classes are located under [`mtp/media/karaoke/data/remote/response/`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/remote/response/).

### 3.1 Single Item Envelope (`GetItemResponse<T>` / `BaseItemResponse<T>`)
```json
{
  "data": { ... }
}
```
*(Note: `GetAnyResponse` extends `BaseItemResponse<Object>`, expecting `{ "data": ... }`)*

### 3.2 List Envelope (`GetListResponse<T>` / `BaseListResponse<T>` / `GetRecordingListResponse` / `GetSongListResponse`)
```json
{
  "data": [
    { ... },
    { ... }
  ]
}
```

### 3.3 Specialized Flat Responses
- **`GetAnyResponse2`** (e.g. `POST /v1/recordings/pin`):
  ```json
  {
    "status": 1,
    "message": "Success"
  }
  ```
- **`GetAnyResponse3`** (`POST /v1/diamonds/apple/exchange`):
  ```json
  {
    "status": 1,
    "amount": 100
  }
  ```
- **`GetAnyResponse4`** (`GET /v1/songs/getLink`):
  ```json
  {
    "status": 1,
    "link": "https://..."
  }
  ```
- **`GetCollectedRewardResponse`** (`POST /v1/daily-task/collect-reward`):
  ```json
  {
    "status": 201,
    "coins": 10,
    "diamonds": 0,
    "exps": 5
  }
  ```
- **`ServerErrorResponse`** (Error payload parsed by [`ErrorHandlingAdapter.java`](extracted/jadx-readable-all/sources/p555j/p556a/p557a/p606h/p613d/ErrorHandlingAdapter.java)):
  ```json
  {
    "status": 400,
    "message": "Error description"
  }
  ```

---

## 4. Complete REST Endpoint Inventory (57 Routes)

Defined in [`ApiService.java`](extracted/jadx-readable-all/sources/p555j/p556a/p557a/p606h/p613d/ApiService.java) (`j.a.a.h.d.a`).

> **Important Retrofit Detail:** Many `POST` and `PUT` methods in `ApiService.java` use `@Query` or `@QueryMap` instead of `@Body`! A compatible backend should accept parameters from **both query string and request body** (or specifically check `req.query` on those `POST`/`PUT` routes).

### 4.1 Authentication & Device Registration

| Method | Path | Parameters (Type & Keys) | Response Type | Description |
| :--- | :--- | :--- | :--- | :--- |
| `POST` | `/v1/auth/device` | `@QueryMap`: `os` (`"2"` = Android), `os_version`, `app_version` (`"2.1.0"`), `device_name`, `unique_id`, `timezone`, `screen_width`, `screen_height`, `brand`, `fcm_token`, `lat`, `long` | `GetAnyResponse` | Register/update device info, location & FCM push token on startup (`MainActivity.java`) |
| `POST` | `/v1/auth/facebook/login` | `@QueryMap`: `fb_user_id`, `full_name`, `email`, `avatar`, `unique_id` | `GetItemResponse<User>` | Login with Facebook account; returns `User` containing `access_token` |
| `POST` | `/v1/auth/google/login` | `@QueryMap`: `gg_user_id`, `full_name`, `email`, `avatar`, `unique_id` | `GetItemResponse<User>` | Login with Google account; returns `User` containing `access_token` |

### 4.2 Users, Profiles, Follows & Blocks

| Method | Path | Parameters (Type & Keys) | Response Type | Description |
| :--- | :--- | :--- | :--- | :--- |
| `GET` | `/v1/users/{id}` | `@Path("id") int id` | `GetItemResponse<User>` | Get user profile by ID |
| `POST` | `/v1/users/{id}` | `@Path("id") int id`, `@QueryMap`: `full_name`, `birthday`, `avatar`, `gender`, `bio` | `GetItemResponse<User>` | Update user profile (`ProfileEditActivity.java`) |
| `GET` | `/v1/users/search` | `@Query("q") String q`, `@Query("page") int page` | `GetListResponse<User>` | Search users by keyword |
| `GET` | `/v1/users/suggestion` | `@QueryMap`: `page`, `type`, `song_id`, `user_id` | `GetListResponse<User>` | Get suggested users / duet invite candidates |
| `GET` | `/v1/follows/followers` | `@QueryMap`: `page`, `user_id`, `follower_id` | `GetListResponse<User>` | List followers of a user |
| `GET` | `/v1/follows/following` | `@QueryMap`: `page`, `user_id`, `follower_id` | `GetListResponse<User>` | List users followed by a user |
| `POST` | `/v1/follows` | `@QueryMap`: `user_id`, `status` (`"1"` or `"0"`) | `GetAnyResponse` | Follow / unfollow a user |
| `GET` | `/v1/blocks` | `@QueryMap`: `page` | `GetListResponse<User>` | List blocked users |
| `POST` | `/v1/blocks` | `@Query("blocked_id") int blockedId`, `@Query("status") int status` | `GetAnyResponse` | Block or unblock a user |

### 4.3 Songs & Search / Autocomplete

| Method | Path | Parameters (Type & Keys) | Response Type | Description |
| :--- | :--- | :--- | :--- | :--- |
| `GET` | `/v1/songs` | `@QueryMap`: `page`, `type`, `per_page` (default `"100"`) | `GetSongListResponse` | List songs by category/type |
| `GET` | `/v1/songs/{id}` | `@Path("id") int id` | `GetItemResponse<Song>` | Get single song details |
| `GET` | `/v1/songs/search` | `@Query("name") String name`, `@Query("page") int page` | `GetListResponse<Song>` | Search songs by name |
| `GET` | `/v1/songs/getLink` | `@Query("youtube_id") String youtubeId`, `@Query("type") int type` | `GetAnyResponse4` | Resolve playable audio/video stream URL (`{ status, link }`) |
| `POST` | `/v1/songs/downloadFromYoutube` | `@Multipart`: `@Part("file")` (`audio/*` or `video/*`), `@PartMap`: `type`, `song_id` | `GetAnyResponse` | Upload extracted YouTube media track for a song (`C6799h0.java`) |
| `GET` | `/v1/keywords` | `@Query("page") int page`, `@Query("orderBy") String orderBy` | `GetListResponse<Keyword>` | Get trending/hot search keywords |
| `POST` | `/v1/keywords` | `@Query("name") String name` | `GetItemResponse<Keyword>` | Log/create a search keyword |
| `GET` | `http://suggestqueries.google.com/complete/search` | `@Query`: `q`, `client`, `ds`, `hl` | `Object` | External Google autocomplete (called directly by client) |

### 4.4 Recordings, Duets & Explore Feeds

| Method | Path | Parameters (Type & Keys) | Response Type | Description |
| :--- | :--- | :--- | :--- | :--- |
| `GET` | `/v1/recordings` | `@QueryMap`: `page`, `type`, `user_id` | `GetRecordingListResponse` | List recordings (by user or feed type) |
| `POST` | `/v1/recordings` | `@Multipart`:<br>- `@Part("audio")` (`audio/*` or `video/*`)<br>- `@Part("video_resize")` (`video/*`, optional)<br>- `@Part("thumbnail")` (`image/png`, optional)<br>- `@PartMap`: `message`, `unique_id`, `privacy`, `song_id`, `name`, `effect`, `use_headphone`, `type`, `duet_id`, `format`, `video_ratio`, `image_ids`, `thumbnail_url`, `duration` | `GetItemResponse<Recording>` | Upload & publish a new karaoke recording (`PostActivity.java`, `C6797g0.java`) |
| `GET` | `/v1/recordings/detail/{id}` | `@Path("id") int id` | `GetItemResponse<Recording>` | Get single recording details |
| `PUT` | `/v1/recordings/{id}` | `@Path("id") int id`, `@QueryMap`: `privacy` or `play_count` (`"1"`) | `GetItemResponse<Recording>` | Update recording privacy or increment play count |
| `DELETE` | `/v1/recordings/{id}` | `@Path("id") int id` | `Response<Unit>` | Delete a recording |
| `POST` | `/v1/recordings/pin` | `@Query("id") int id`, `@Query("status") int status` | `GetAnyResponse2` | Pin/unpin a recording on user profile |
| `GET` | `/v1/recordings/following` | `@QueryMap`: `page`, `type` | `GetRecordingListResponse` | Feed of recordings from followed users |
| `GET` | `/v1/recordings/nearby` | `@QueryMap`: `page`, `lat`, `long`, `type` | `GetRecordingListResponse` | Feed of nearby recordings by geolocation |
| `GET` | `/v1/recordings/ranking/{id}` | `@Path("id") int songId`, `@QueryMap`: `page`, `type` (`"monthly"`, etc.) | `GetRecordingListResponse` | Top ranking recordings for a song |
| `GET` | `/v1/recordings/background` | *(none)* | `GetListResponse<Simple2>` | List background messages/images (`{ key, value }`) |
| `GET` | `/v1/recordings/duet/{id}` | `@Path("id") int id`, `@QueryMap`: `page` | `GetRecordingListResponse` | List duet recordings for a parent recording/song |
| `GET` | `/v1/recordings/singDuetJoin/{id}` | `@Path("id") int id` | `GetItemResponse<Recording>` | Get duet recording info to join |
| `POST` | `/v1/recordings/sendInviteDuet` | `@QueryMap`: `recording_id`, `user_ids` (comma-separated IDs) | `GetAnyResponse` | Send duet invitations to selected users |
| `POST` | `/v1/duets/{id}` | `@Path("id") int recordingId`, `@Body HashMap`: `segments` (JSON string of `ArrayList<Duet2>`) | `GetItemResponse<Duet>` | Create/save duet lyrics/timing segments (`PostActivity.java:269`) |
| `GET` | `/v1/duets/recordings` | `@QueryMap`: `page`, `type` | `GetRecordingListResponse` | List featured duet recordings |
| `GET` | `/v1/explores` | `@QueryMap`: `type`, `per_page` | `GetListResponse<Simple3>` | Get explore page sections/categories |
| `GET` | `/v1/explores/recordings` | `@QueryMap`: `page`, `type`, `per_page` | `GetRecordingListResponse` | Get recordings for an explore section |

### 4.5 Social Interactions (Comments, Likes, Shares, Images, Notifications)

| Method | Path | Parameters (Type & Keys) | Response Type | Description |
| :--- | :--- | :--- | :--- | :--- |
| `GET` | `/v1/comments` | `@Query("commentable_id") int id`, `@Query("commentable_type") String type`, `@Query("page") int page` | `GetListResponse<Comment>` | List comments for a recording/item |
| `POST` | `/v1/comments` | `@Query("commentable_id") int id`, `@Query("commentable_type") String type`, `@Query("message") String msg`, `@Query("parent_id") Integer parentId`, `@Query("quote_id") Integer quoteId` | `GetItemResponse<Comment>` | Post a comment or reply |
| `DELETE` | `/v1/comments/{id}` | `@Path("id") int id` | `Response<Unit>` | Delete a comment |
| `POST` | `/v1/likes` | `@Query("likeable_id") int id`, `@Query("likeable_type") String type`, `@Query("status") int status` | `GetAnyResponse` | Like or unlike a recording or comment |
| `POST` | `/v1/shares` | `@Query("shareable_id") int id`, `@Query("shareable_type") String type`, `@Query("social") int social`, `@Query("message") String message` | `GetAnyResponse` | Record a social share action |
| `GET` | `/v1/images/list` | `@QueryMap`: `page`, `per_page` (`"16"`), `user_id` | `GetListResponse<Image>` | List user's uploaded gallery images |
| `POST` | `/v1/images/add` | `@Multipart`: `@Part("image")` (`image/png`) | `GetItemResponse<Image>` | Upload a new photo to user gallery |
| `POST` | `/v1/images/deletes` | `@Body HashMap`: `{ "ids": [1, 2, 3] }` | `Response<Unit>` | Batch delete user gallery images (`ImageActivity.java:222`) |
| `GET` | `/v1/notifications` | `@QueryMap`: `page` | `GetListResponse<Notification>` | List user notifications |
| `POST` | `/v1/notifications/markAsRead/{id}` | `@Path("id") int id`, `@QueryMap`: `read_os`, `read_section` | `GetItemResponse<Notification>` | Mark notification as read |
| `DELETE` | `/v1/notifications/{id}` | `@Path("id") int id` | `Response<Unit>` | Delete a notification |

### 4.6 Virtual Economy (Gifts, Wallet, Diamonds, Daily Tasks)

| Method | Path | Parameters (Type & Keys) | Response Type | Description |
| :--- | :--- | :--- | :--- | :--- |
| `GET` | `/v1/gifts` | *(none)* | `GetListResponse<Gift>` | Get catalog of virtual gifts |
| `POST` | `/v1/gifts/present` | `@Query("recording_id") int recId`, `@Query("gift_id") int giftId`, `@Query("quantity") int qty`, `@Query("unique_id") String uniqueId` | `GetAnyResponse` | Send a virtual gift to a recording |
| `GET` | `/v1/gifts/recording/top` | `@Query("recording_id") int recId`, `@Query("page") int page` | `GetListResponse<Present>` | Top gifts/presents received on a recording |
| `GET` | `/v1/gifts/receiver/top` | `@Query("receiver_id") int userId`, `@Query("page") int page` | `GetListResponse<Present>` | Leaderboard of top gift senders for a receiver |
| `GET` | `/v1/gifts/user` | `@QueryMap`: `page`, `receiver_id` | `GetListResponse<Present>` | Gift history for a user |
| `POST` | `/v1/diamonds/apple/exchange` | `@QueryMap`: `transaction_id`, `product_id`, `date`, `state` (`"purchased"`), `unique_id` | `GetAnyResponse3` | Verify Google Play IAP purchase & credit diamonds (`WalletViewModel.java`). SKUs: `<pkg>lv1.diamonds` .. `<pkg>lv6.diamonds` |
| `GET` | `/v1/daily-task` | *(none)* | `GetListResponse<Task>` | List daily tasks and check-in progress |
| `POST` | `/v1/daily-task/addLog` | `@QueryMap`: `type`, `unique_id` | `GetItemResponse<Task4>` | Log progress on a daily task |
| `POST` | `/v1/daily-task/collect-reward` | `@QueryMap`: `daily_task_id`, `unique_id` | `GetCollectedRewardResponse` | Claim reward (`{ status, coins, diamonds, exps }`) for completed daily task |

---

## 5. Data Models (JSON Field Schemas)

All model classes are located in [`mtp/media/karaoke/data/model/`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/). Below are the exact JSON property names (respecting `@SerializedName` annotations).

### 5.1 `User` ([`User.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/User.java))
```json
{
  "id": 1,
  "uid": "string",
  "fb_user_id": "string|null",
  "gg_user_id": "string|null",
  "full_name": "string",
  "email": "string|null",
  "address": "string|null",
  "city": "string|null",
  "country": "string|null",
  "language": "string|null",
  "region": "string|null",
  "phone": "string|null",
  "avatar": "string|null",
  "cover": "string|null",
  "gender": 0,
  "birthday": "string|null",
  "bio": "string|null",
  "level": 1,
  "current_level_exps": 0,
  "next_level_exps": 100,
  "diamonds": 0,
  "coins": 0,
  "stars": 0,
  "exps": 0,
  "access_token": "string|null",
  "recording_count": 0,
  "notification_count": 0,
  "following_count": 0,
  "follower_count": 0,
  "gift_count": 0,
  "play_count": 0,
  "lat": 0.0,
  "long": 0.0,
  "distance": 0.0,
  "label": "string|null",
  "follow_status": false,
  "created_at": "2026-01-01 00:00:00",
  "updated_at": "2026-01-01 00:00:00"
}
```

### 5.2 `Song` ([`Song.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Song.java))
```json
{
  "id": 1,
  "name": "string",
  "artist": "string|null",
  "youtubeId": "string",
  "player_ias_url": "string|null",
  "thumbnail": "string|null",
  "cover": "string|null",
  "link": "string|null",
  "link_video": "string|null",
  "trending": 0,
  "duet_singer": 0,
  "recordCount": 0,
  "region": "string|null",
  "status": 1
}
```

### 5.3 `Recording` ([`Recording.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Recording.java))
```json
{
  "id": 1,
  "name": "string",
  "slug": "string|null",
  "user_id": 1,
  "song_id": 1,
  "duet_id": 0,
  "message": "string|null",
  "thumbnail": "string|null",
  "url": "string",
  "url_video_resize": "string|null",
  "share_url": "string|null",
  "type": 0,
  "format": 0,
  "video_ratio": 0,
  "privacy": 1,
  "pin": 0,
  "status": 1,
  "duration": 180,
  "effect": 0,
  "effect_custom": "string|null",
  "use_headphone": true,
  "image_ids": "1,2,3",
  "images": [],
  "play_count": 0,
  "like_count": 0,
  "like_status": false,
  "comment_count": 0,
  "share_count": 0,
  "duet_count": 0,
  "gift_count": 0,
  "star_count": 0,
  "user": { "...User..." },
  "duet": { "...Duet|null..." },
  "song": { "...Song..." },
  "created_at": "2026-01-01 00:00:00",
  "updated_at": "2026-01-01 00:00:00"
}
```

### 5.4 `Duet` & `Duet2` ([`Duet.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Duet.java), [`Duet2.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Duet2.java))
```json
{
  "id": 1,
  "user_id": 1,
  "song_id": 1,
  "recording_id": 1,
  "join_count": 0,
  "user": { "...User..." },
  "recording": { "...Recording..." },
  "segments": [
    {
      "n": "singer_name_or_part",
      "s": 0.0,
      "e": 15.5
    }
  ],
  "created_at": "2026-01-01 00:00:00",
  "updated_at": "2026-01-01 00:00:00"
}
```

### 5.5 `Comment` ([`Comment.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Comment.java))
```json
{
  "id": 1,
  "user_id": 1,
  "user": { "...User..." },
  "content_id": 1,
  "content_type": "recording",
  "parent_id": 0,
  "quote_id": 0,
  "quote": { "...User|null..." },
  "message": "string",
  "like_count": 0,
  "like_status": false,
  "reply_count": 0,
  "created_at": "2026-01-01 00:00:00",
  "updated_at": "2026-01-01 00:00:00"
}
```

### 5.6 `Gift` & `Present` ([`Gift.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Gift.java), [`Present.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Present.java))
- **`Gift`:**
  ```json
  {
    "id": 1,
    "name": "Rose",
    "image": "https://...",
    "type": 1,
    "amount": 10,
    "exp": 5,
    "created_at": "2026-01-01 00:00:00",
    "updated_at": "2026-01-01 00:00:00"
  }
  ```
- **`Present`:**
  ```json
  {
    "id": 1,
    "user_id": 1,
    "user": { "...User..." },
    "recording_id": 1,
    "gift_id": 1,
    "gift": { "...Gift..." },
    "quantity": 1,
    "stars": 10,
    "created_at": "2026-01-01 00:00:00",
    "updated_at": "2026-01-01 00:00:00"
  }
  ```

### 5.7 `Notification` ([`Notification.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Notification.java))
```json
{
  "id": 1,
  "user_id": 1,
  "sender": { "...User|null..." },
  "title": "string",
  "message": "string",
  "content_id": 1,
  "sub_content_id": null,
  "type": "string",
  "sub_type": "string|null",
  "image": "string|null",
  "is_read": 0,
  "pushed_at": "2026-01-01 00:00:00",
  "created_at": "2026-01-01 00:00:00",
  "updated_at": "2026-01-01 00:00:00"
}
```

### 5.8 `Task` & `Task4` ([`Task.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Task.java), [`Task4.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Task4.java))
- **`Task`:**
  ```json
  {
    "id": 1,
    "name": "Daily Check-in",
    "type": 1,
    "goal": 1,
    "finished_count": 0,
    "coin": 10,
    "diamond": 0,
    "exp": 5,
    "coins": [10, 20, 30, 40, 50, 60, 100],
    "diamonds": [0, 0, 0, 0, 0, 0, 1],
    "exps": [5, 10, 15, 20, 25, 30, 50],
    "log": {
      "id": 1,
      "user_id": 1,
      "daily_task_id": 1,
      "day": 1,
      "status": 1,
      "created_at": "2026-01-01 00:00:00",
      "updated_at": "2026-01-01 00:00:00"
    },
    "created_at": "2026-01-01 00:00:00",
    "updated_at": "2026-01-01 00:00:00"
  }
  ```

### 5.9 `Image`, `Keyword`, `Simple2`, `Simple3`
- **`Image` ([`Image.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Image.java)):** `{ "id": 1, "user_id": 1, "image": "https://...", "created_at": "...", "updated_at": "..." }`
- **`Keyword` ([`Keyword.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Keyword.java)):** `{ "id": 1, "name": "string" }`
- **`Simple2` ([`Simple2.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Simple2.java)):** `{ "key": "string", "value": "string" }`
- **`Simple3` ([`Simple3.java`](extracted/jadx-readable-all/sources/mtp/media/karaoke/data/model/Simple3.java)):** `{ "id": 1, "name": "string", "type": 1, "layout_type": 1 }`
