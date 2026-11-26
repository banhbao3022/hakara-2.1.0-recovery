# Hakara 2.1.0 — replacement backend

A self-hosted REST server the existing Hakara Android client (`mtp.media.karaoke`
2.1.0, versionCode 46) can talk to unmodified apart from its base URL. It serves
all 56 of the routes the client calls — the 57th in `ApiService.java` is an
absolute URL to Google's autocomplete service, which the client calls directly.

Built from the decompiled client in `../extracted/`, not from a guess at the
original API. Where the two disagree, the decompiled client wins.

Node 22 · TypeScript · Fastify 5 · Prisma 6 · PostgreSQL 16.

---

## Quick start

```bash
cp -n .env.example .env     # -n: never clobber an .env you already tuned
```

Then edit `JWT_SECRET`, and `PORT` / `DB_PORT` if those are taken on your
machine. `DATABASE_URL` must match `DB_PORT` and `PUBLIC_URL` must match `PORT`.

```bash
docker compose up -d db && npx prisma migrate deploy && npm run seed && npm run dev
```

The seed is not optional in practice: against an empty database the client
renders exactly the "Not found song" empty state, so there is nothing to look at.
It creates 20 songs with locally generated audio, 8 gifts, 7 daily tasks, 4
explore rails, 6 backgrounds, and 3 demo users with recordings, follows,
comments and likes between them.

If port 5432 or 8080 is already taken on your machine, set `DB_PORT` and `PORT`
in `.env` — both are configurable and `DATABASE_URL` must match `DB_PORT` when
you connect from the host rather than from inside Compose.

### Container image

```bash
docker compose up --build
```

**This was not verified on the machine the server was developed on, and the
reason is worth knowing before you debug it.** That network TLS-intercepts
package registries: `apk` reports `TLS: server certificate not trusted` and
`npm ci` eventually fails with the unhelpful `Exit handler never called`. The
host installs fine because it trusts the interception CA; the image does not.
Raising npm's retry limits changed the failure from 73 s to 475 s, which
confirms the cause rather than fixing it.

On such a network, supply the CA at build time:

```bash
docker compose build --build-arg NODE_EXTRA_CA_CERTS=/certs/corp.pem api
```

mounting the certificate at that path, or build somewhere without interception.
The `db` service is unaffected — `postgres:16-alpine` pulls and runs fine, which
is what the whole local workflow above uses.

---

## Pointing the client at it

The base URL is compiled into the client
(`https://api.karavietnam.com/`, set in `NetworkModule.kt` → `j/a/a/j/f.java`),
so redirecting it means repacking and re-signing the APK, or a DNS/proxy
override on the device. That is a separate decision and is deliberately not
automated here. Nothing in this server has been tested against the real APK —
see **What is not verified** below.

---

## Configuration

| Variable | Default | Notes |
|---|---|---|
| `PORT` / `HOST` | `8080` / `0.0.0.0` | |
| `DB_PORT` | `5432` | Host port the db container publishes |
| `DATABASE_URL` | — | Required |
| `JWT_SECRET` | — | Signs `access_token`. Change it. |
| `JWT_EXPIRES_IN` | `365d` | The client holds a token across restarts |
| `REQUIRE_SIG` | `false` | See **Request signature** |
| `APP_KEY` | empty | Required when `REQUIRE_SIG=true` |
| `SIG_MAX_SKEW_SECONDS` | `300` | `0` disables the replay window |
| `STORAGE_DIR` / `PUBLIC_URL` | `./storage` / `http://localhost:8080` | Where uploads land and how they are addressed |
| `ALLOW_MEDIA_UPLOAD` | `true` | Gates the three upload routes |
| `MAX_UPLOAD_BYTES` | `268435456` | Recordings can be video |
| `DISPLAY_TZ_OFFSET_MINUTES` | `0` | **Set this.** See below. |

### `DISPLAY_TZ_OFFSET_MINUTES`

The client parses timestamps with `SimpleDateFormat("yyyy-MM-dd HH:mm:ss")` in
the *device's* timezone. A UTC timestamp is therefore read as local time, and
every "x minutes ago" label is wrong by the device's offset. Set this to the
offset your users are in — `420` for Asia/Ho_Chi_Minh. It is `0` by default
because a wrong guess is worse than an explicit choice.

### Request signature

Every client request carries a `Sig` header: lowercase hex HMAC-SHA256 over

```
App-Version=2.1.0&Current-Time=<unix-seconds>&Os=<Build.VERSION.RELEASE>&Unique-Id=<device-id>
```

keyed by `NativeUtils.getAppKey()`, which lives in `libAudioEngine.so`. That key
is **not** shipped with this server and was not extracted from the binary, so
verification is off by default. The check is fully implemented: supply your own
`APP_KEY` and set `REQUIRE_SIG=true` to enforce it, including the replay window.

---

## Four client behaviours that shape the implementation

These are the things a server that "looks right" gets wrong.

1. **POST and PUT parameters arrive in the query string, not the body.** Retrofit
   annotates nearly every write route with `@Query` / `@QueryMap`, so
   `POST /v1/comments?commentable_id=1&message=hi` has no body at all. Only
   `POST /v1/duets/{id}` and `POST /v1/images/deletes` use `@Body`. Every handler
   reads through `params(req)` in [`src/http/params.ts`](src/http/params.ts),
   which merges query over body.

2. **Timestamps are `yyyy-MM-dd HH:mm:ss`.** ISO-8601 yields a null `Date` on the
   device. [`src/lib/datetime.ts`](src/lib/datetime.ts).

3. **Some fields are non-null in Kotlin and crash on `null`.** `Simple3.name`,
   `Duet2.n`, `GetAnyResponse2.message` and `GetAnyResponse4.link` have
   constructors calling `Intrinsics.checkNotNullParameter`. The serializers emit
   `""` rather than passing null through.

4. **`Song.youtubeId` and `Song.recordCount` are camelCase** while every
   neighbouring key is snake_case, because `Song.kt` gives them no
   `@SerializedName`. This is asserted in the test suite, not just commented.

---

## `/v1/songs/getLink`

Returns the song's own `link` / `link_video` — media this server hosts. It never
contacts YouTube. The client passes a `youtube_id` because that is the key the
original service used, not because a stream has to be fetched from there. A song
with no uploaded media returns `{ "status": 0, "link": "" }`, which the client
renders as its not-found state.

---

## Known weaknesses

Both are inherited from the client and cannot be closed server-side alone. They
are listed because shipping them silently would be worse.

**Social login is unverifiable.** `/v1/auth/facebook/login` and
`/v1/auth/google/login` receive only the provider's numeric *user id* plus a
display name — never an OAuth access token or ID token. Anyone who knows a
user's Facebook or Google id can obtain that user's session. Closing this needs
a client change: send the provider ID token and verify it in
`verifyProviderToken` in [`src/routes/auth.ts`](src/routes/auth.ts), then make a
missing token fatal.

**In-app purchases are unverifiable.** `/v1/diamonds/apple/exchange` receives a
transaction id and SKU but no Play Billing purchase token, so there is nothing
to check against Google's API. Replay is blocked by the unique
`transaction_id` alone — a *fabricated* id still credits diamonds. The seam is
`verifyPurchase` in [`src/routes/economy.ts`](src/routes/economy.ts).

**Follower fan-out is capped at 500.** Publishing a recording notifies up to 500
followers; beyond that the remainder are not notified and a warning is logged.
A write-time fan-out is the wrong shape for a larger account.

**Four dev-only npm advisories remain**, all in one chain: the `prisma` CLI →
`@prisma/config` → `deepmerge-ts` / `effect`. They are reachable at
`prisma generate` / `migrate` time, not from the request path. Clearing them
means moving to Prisma 7, which changes the generated client's import path.

---

## Verification

```bash
npm run typecheck && npm test && npm run check:routes
```

- `npm test` — 58 offline, deterministic tests: no database, no network. The
  serializer suite parses the decompiled `*.java` model classes and asserts the
  server emits every key each one declares, so a rename on either side fails the
  build rather than producing a blank row on a phone.
- `npm run check:routes` — parses the route annotations out of `ApiService.java`
  and asserts each is registered on the Fastify instance. "All 57 routes" stays
  checked rather than claimed.
- `npm run smoke` — end-to-end against a running server and a real database:
  83 assertions walking the client's actual startup sequence, with every POST
  and PUT sending its parameters in the query string. Each run uses fresh
  identities, so the daily-reward and receipt-replay idempotency checks are
  meaningful on re-runs rather than trivially true.

```bash
npm run smoke
```

### Testing the authenticated routes by hand

Most routes need a Bearer token. `scripts/dev-token.sh` mints one and prints
shell exports:

```bash
eval "$(bash scripts/dev-token.sh alice 'Alice Tester')"
```

```bash
curl -H "Authorization: Bearer $TOKEN" http://localhost:8099/v1/notifications
```

It adds no bypass endpoint. It calls the real `POST /v1/auth/google/login`,
which already accepts a bare `gg_user_id` — see **Known weaknesses** above for
why that is the client's design rather than a shortcut taken here. Passing a
different identity gets a different account, so two-user cases (follow, gift,
duet, block) can be driven from the shell.

### What is not verified

- **The app itself.** Nothing here has been run against the real APK. Doing that
  requires repointing the client's compiled base URL, which means repacking and
  re-signing — out of scope for this server. Every verification above is against
  the decompiled source and this server's own behaviour, not against the app on
  a device.
- **The container image.** `docker compose build api` has not completed
  successfully here; see **Container image** above for why and what to do about
  it. The server itself was run, seeded and smoke-tested directly on Node 22
  against the `db` container.

---

## Layout

```
prisma/schema.prisma    20 models
prisma/seed.ts          seed data, including locally generated audio
src/http/params.ts      query-over-body merge   ← client behaviour 1
src/http/envelope.ts    the response shapes     ← client behaviour 3
src/http/errors.ts      { status, message } on every failure
src/lib/datetime.ts     yyyy-MM-dd HH:mm:ss     ← client behaviour 2
src/lib/storage.ts      uploads; the single seam for swapping in S3
src/lib/counters.ts     transactional denormalized counters
src/lib/viewer.ts       like_status / follow_status in a fixed query count
src/plugins/sig.ts      HMAC-SHA256, off unless APP_KEY is supplied
src/plugins/auth.ts     Bearer JWT, anonymous-tolerant
src/serializers/        every client-facing field name, written once
src/routes/             12 files, 56 routes
scripts/check-routes.ts route parity against ApiService.java
scripts/smoke.sh        end-to-end walk of the client's startup sequence
```
