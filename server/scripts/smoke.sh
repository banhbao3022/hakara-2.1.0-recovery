#!/usr/bin/env bash
#
# End-to-end smoke test: walks the sequence the real client performs, in the
# order it performs it, using the same transport quirks.
#
# In particular, every POST and PUT below sends its parameters in the QUERY
# STRING with no body, because that is what Retrofit does for the @Query /
# @QueryMap annotations in ApiService.java. A server that only reads req.body
# passes a hand-written test suite and fails against the actual app.
#
#   usage: bash scripts/smoke.sh [base_url]
#
set -uo pipefail

BASE="${1:-${SMOKE_BASE_URL:-http://localhost:8099}}"
PASS=0
FAIL=0
TOKEN=""
TMP="$(mktemp -d)"
trap 'rm -rf "$TMP"' EXIT

# Every run gets its own identities. Without this, the second run of the day
# finds the daily reward already collected and the diamond receipt already
# redeemed, so both idempotency checks pass trivially while proving nothing.
RUN="$(date +%s)-$$"
DEVICE="smoke-device-$RUN"
DEVICE_B="smoke-device-b-$RUN"

note() { printf '\n\033[1m%s\033[0m\n' "$*"; }

# call <name> <expected-status> <method> <path-with-query> [curl args...]
call() {
  local name="$1" expect="$2" method="$3" path="$4"
  shift 4

  local auth=()
  [ -n "$TOKEN" ] && auth=(-H "Authorization: Bearer $TOKEN")

  local code
  code="$(curl -sS -o "$TMP/body" -w '%{http_code}' -X "$method" "$BASE$path" \
    -H 'Accept: application/json' \
    -H 'App-Version: 2.1.0' \
    -H 'Os: 11' \
    -H "Current-Time: $(date +%s)" \
    -H "Unique-Id: $DEVICE" \
    "${auth[@]}" "$@" 2>"$TMP/err")" || code="000"

  if [ "$code" = "$expect" ]; then
    printf '  \033[32mok\033[0m   %-3s %-6s %s\n' "$code" "$method" "${path%%\?*}"
    PASS=$((PASS + 1))
  else
    printf '  \033[31mFAIL\033[0m %-3s %-6s %s  (expected %s)\n' "$code" "$method" "${path%%\?*}" "$expect"
    printf '       %s\n' "$(head -c 300 "$TMP/body")"
    FAIL=$((FAIL + 1))
  fi
}

# Extract a value from the last response without requiring jq.
# Any miss — absent key, short list, non-JSON body — yields an empty string, so
# a caller's `if [ -n "$x" ]` guard is what decides, not a stack trace.
jsonget() { python3 -c "
import json,sys
try: d=json.load(open('$TMP/body'))
except Exception: print(''); sys.exit()
for k in sys.argv[1].split('.'):
    try:
        d = d[int(k)] if isinstance(d,list) else d.get(k)
    except (KeyError, IndexError, ValueError, AttributeError, TypeError):
        d = None
    if d is None: break
print('' if d is None else d)
" "$1"; }

# Assert a value matches a regex — for shapes a status code cannot catch.
expect_match() {
  local name="$1" value="$2" pattern="$3"
  if printf '%s' "$value" | grep -Eq "$pattern"; then
    printf '  \033[32mok\033[0m   %s = %s\n' "$name" "$value"
    PASS=$((PASS + 1))
  else
    printf '  \033[31mFAIL\033[0m %s = %s  (expected to match %s)\n' "$name" "$value" "$pattern"
    FAIL=$((FAIL + 1))
  fi
}

note "1. Startup — the calls MainActivity makes before any login"
call health   200 GET  "/health"
call device   200 POST "/v1/auth/device?os=2&os_version=11&app_version=2.1.0&device_name=Pixel&unique_id=$DEVICE&timezone=Asia%2FHo_Chi_Minh&screen_width=1080&screen_height=2340&brand=Google&fcm_token=smoke-fcm&lat=10.7769&long=106.7009"
call songs    200 GET  "/v1/songs?page=1&per_page=100"
call explores 200 GET  "/v1/explores"
call expRecs  200 GET  "/v1/explores/recordings?page=1&type=1"
call feed     200 GET  "/v1/recordings?page=1"
call bg       200 GET  "/v1/recordings/background"
call keywords 200 GET  "/v1/keywords?page=1&orderBy=hot"

note "2. Anonymous reads that must still work without a token"
call duetFeed 200 GET  "/v1/duets/recordings?page=1"
call nearby   200 GET  "/v1/recordings/nearby?page=1&lat=10.7769&long=106.7009"
call search   200 GET  "/v1/songs/search?name=adele&page=1"

note "3. Routes that require auth must refuse an anonymous caller"
call noAuthFollowing 401 GET  "/v1/recordings/following?page=1"
call noAuthNotifs    401 GET  "/v1/notifications?page=1"
call noAuthLike      401 POST "/v1/likes?likeable_id=1&likeable_type=recording&status=1"

note "4. Login"
call login 200 POST "/v1/auth/google/login?gg_user_id=smoke-google-$RUN&full_name=Smoke%20Tester&email=smoke%40example.com&unique_id=$DEVICE"
TOKEN="$(jsonget 'data.access_token')"
USER_ID="$(jsonget 'data.id')"
if [ -z "$TOKEN" ]; then
  printf '  \033[31mFAIL\033[0m login returned no access_token; aborting\n'
  exit 1
fi
printf '       token acquired for user id %s\n' "$USER_ID"

note "5. getLink resolves self-hosted media, never YouTube"
call getLink 200 GET "/v1/songs/getLink?youtube_id=seed0000001&type=1"
LINK="$(jsonget 'link')"
STATUS="$(jsonget 'status')"
printf '       status=%s link=%s\n' "$STATUS" "$LINK"
if [ "$STATUS" = "1" ] && [ -n "$LINK" ]; then
  # Take the path out of the returned URL rather than stripping $BASE. Once
  # PUBLIC_URL points at an address the *device* uses (10.0.2.2 for the
  # emulator), the link's host no longer matches the host we are testing from,
  # and a prefix strip would leave an absolute URL in the request path.
  call media 200 GET "/$(printf '%s' "$LINK" | sed -E 's#^[a-z]+://[^/]+/##')"
else
  printf '  \033[31mFAIL\033[0m getLink returned no playable link\n'
  FAIL=$((FAIL + 1))
fi
call getLinkMissing 200 GET "/v1/songs/getLink?youtube_id=does-not-exist&type=1"

note "6. Upload and publish a recording (multipart: audio / video_resize / thumbnail)"
head -c 2048 /dev/urandom > "$TMP/take.m4a"
call upload 200 POST "/v1/recordings" \
  -F "audio=@$TMP/take.m4a;type=audio/mp4" \
  -F 'song_id=1' -F 'name=Smoke take' -F 'message=from the smoke test' \
  -F 'privacy=1' -F 'use_headphone=1' -F 'duration=96' -F 'type=0' -F 'format=0'
REC_ID="$(jsonget 'data.id')"
printf '       recording id %s\n' "$REC_ID"

call detail 200 GET "/v1/recordings/detail/$REC_ID"

# Shapes a 200 does not prove. The client parses timestamps with
# SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), and Song.youtubeId / recordCount are
# camelCase because Song.kt gives them no @SerializedName.
expect_match 'created_at'      "$(jsonget 'data.created_at')" '^[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}$'
expect_match 'duet_id'         "$(jsonget 'data.duet_id')"    '^[0-9]+$'
expect_match 'song.youtubeId'  "$(jsonget 'data.song.youtubeId')" '^seed[0-9]+$'
expect_match 'song.recordCount' "$(jsonget 'data.song.recordCount')" '^[0-9]+$'
expect_match 'user.level'      "$(jsonget 'data.user.level')"  '^[0-9]+$'

call play    200 PUT "/v1/recordings/$REC_ID?play_count=1"
call privacy 200 PUT "/v1/recordings/$REC_ID?privacy=1"
call pin     200 POST "/v1/recordings/pin?id=$REC_ID&status=1"

note "7. Social — every one of these sends its params in the query string"
call comment    200 POST   "/v1/comments?commentable_id=$REC_ID&commentable_type=recording&message=Great%20take!"
COMMENT_ID="$(jsonget 'data.id')"
call comments   200 GET    "/v1/comments?commentable_id=$REC_ID&commentable_type=recording&page=1"
call reply      200 POST   "/v1/comments?commentable_id=$REC_ID&commentable_type=recording&message=thanks&parent_id=$COMMENT_ID"
call like       200 POST   "/v1/likes?likeable_id=$REC_ID&likeable_type=recording&status=1"
call unlike     200 POST   "/v1/likes?likeable_id=$REC_ID&likeable_type=recording&status=0"
call share      200 POST   "/v1/shares?shareable_id=$REC_ID&shareable_type=recording&social=1&message=hi"
call badType    422 POST   "/v1/likes?likeable_id=$REC_ID&likeable_type=banana&status=1"
call delComment 204 DELETE "/v1/comments/$COMMENT_ID"

note "8. Follows, blocks, profiles"
call follow     200 POST "/v1/follows?user_id=1&status=1"
call followers  200 GET  "/v1/follows/followers?user_id=1&page=1"
call following  200 GET  "/v1/follows/following?user_id=$USER_ID&page=1"
call followFeed 200 GET  "/v1/recordings/following?page=1"
call profile    200 GET  "/v1/users/1"
call editSelf   200 POST "/v1/users/$USER_ID?full_name=Smoke%20Tester&bio=updated%20by%20smoke"
call editOther  403 POST "/v1/users/1?full_name=nope"
call userSearch 200 GET  "/v1/users/search?q=Mai&page=1"
call suggestion 200 GET  "/v1/users/suggestion?page=1"
call block      200 POST "/v1/blocks?blocked_id=2&status=1"
call blocks     200 GET  "/v1/blocks?page=1"
call unblock    200 POST "/v1/blocks?blocked_id=2&status=0"

note "9. Images"
printf '\x89PNG\r\n\x1a\n' > "$TMP/pic.png"
head -c 512 /dev/urandom >> "$TMP/pic.png"
call imgAdd    200 POST "/v1/images/add" -F "image=@$TMP/pic.png;type=image/png"
IMAGE_ID="$(jsonget 'data.id')"
call imgList   200 GET  "/v1/images/list?page=1&per_page=16&user_id=$USER_ID"
call imgDelete 204 POST "/v1/images/deletes" -H 'Content-Type: application/json' -d "{\"ids\":[$IMAGE_ID]}"

note "10. Duets — the JSON-body route, segments as a JSON string"
call duetCreate 200 POST "/v1/duets/$REC_ID" -H 'Content-Type: application/json' \
  -d '{"segments":"[{\"n\":\"Part 1\",\"s\":0,\"e\":45.5},{\"n\":\"Part 2\",\"s\":45.5,\"e\":96}]"}'
call duetBad    422 POST "/v1/duets/$REC_ID" -H 'Content-Type: application/json' \
  -d '{"segments":"[{\"n\":\"Bad\",\"s\":50,\"e\":10}]"}'
call duetJoin   200 GET  "/v1/recordings/singDuetJoin/$REC_ID"
call duetList   200 GET  "/v1/recordings/duet/$REC_ID?page=1"
call invite     200 POST "/v1/recordings/sendInviteDuet?recording_id=$REC_ID&user_ids=1,2"

note "11. Economy"
call gifts    200 GET  "/v1/gifts"
call topup    200 POST "/v1/diamonds/apple/exchange?transaction_id=smoke-tx-$RUN&product_id=mtp.media.karaokelv3.diamonds&date=2026-11-24&state=purchased&unique_id=$DEVICE"
BALANCE="$(jsonget 'amount')"
printf '       diamond balance %s\n' "$BALANCE"
call replay   200 POST "/v1/diamonds/apple/exchange?transaction_id=smoke-tx-$RUN&product_id=mtp.media.karaokelv3.diamonds&date=2026-11-24&state=purchased&unique_id=$DEVICE"
REPLAY="$(jsonget 'amount')"
if [ "$BALANCE" = "$REPLAY" ]; then
  printf '  \033[32mok\033[0m   replayed receipt did not double-credit (%s)\n' "$REPLAY"
  PASS=$((PASS + 1))
else
  printf '  \033[31mFAIL\033[0m replayed receipt credited twice: %s then %s\n' "$BALANCE" "$REPLAY"
  FAIL=$((FAIL + 1))
fi
call badSku   422 POST "/v1/diamonds/apple/exchange?transaction_id=smoke-tx-bad-$RUN&product_id=not.a.real.sku&state=purchased"
call present  200 POST "/v1/gifts/present?recording_id=1&gift_id=1&quantity=2&unique_id=$DEVICE"
call topGifts 200 GET  "/v1/gifts/recording/top?recording_id=1&page=1"
call topRecv  200 GET  "/v1/gifts/receiver/top?receiver_id=1&page=1"
call giftUser 200 GET  "/v1/gifts/user?page=1&receiver_id=1"

note "12. Daily tasks"
call tasks    200 GET  "/v1/daily-task"
call addLog   200 POST "/v1/daily-task/addLog?type=1&unique_id=$DEVICE"
call collect  200 POST "/v1/daily-task/collect-reward?daily_task_id=1&unique_id=$DEVICE"
COINS="$(jsonget 'coins')"
call collect2 200 POST "/v1/daily-task/collect-reward?daily_task_id=1&unique_id=$DEVICE"
COINS2="$(jsonget 'coins')"
if [ "$COINS2" = "0" ] && [ "$COINS" != "0" ]; then
  printf '  \033[32mok\033[0m   reward is idempotent (%s then %s)\n' "$COINS" "$COINS2"
  PASS=$((PASS + 1))
else
  printf '  \033[31mFAIL\033[0m reward paid twice: %s then %s\n' "$COINS" "$COINS2"
  FAIL=$((FAIL + 1))
fi

note "13. A second user acts on the first, so there is a notification to read"
PRIMARY_TOKEN="$TOKEN"
TOKEN=""
call login2 200 POST "/v1/auth/google/login?gg_user_id=smoke-google-b-$RUN&full_name=Second%20Tester&unique_id=$DEVICE_B"
TOKEN="$(jsonget 'data.access_token')"
call b_follow  200 POST "/v1/follows?user_id=$USER_ID&status=1"
call b_comment 200 POST "/v1/comments?commentable_id=$REC_ID&commentable_type=recording&message=nice%20one"
call b_like    200 POST "/v1/likes?likeable_id=$REC_ID&likeable_type=recording&status=1"
TOKEN="$PRIMARY_TOKEN"

note "14. Notifications and ranking"
call notifs   200 GET  "/v1/notifications?page=1"
NOTIF_ID="$(jsonget 'data.0.id')"
if [ -n "$NOTIF_ID" ]; then
  call markRead 200 POST   "/v1/notifications/markAsRead/$NOTIF_ID?read_os=2&read_section=list"
  call delNotif 204 DELETE "/v1/notifications/$NOTIF_ID"
else
  printf '  \033[31mFAIL\033[0m notifications list was empty; markAsRead and delete were not exercised\n'
  FAIL=$((FAIL + 1))
fi
call ranking  200 GET  "/v1/recordings/ranking/1?page=1&type=monthly"
call keyword  200 POST "/v1/keywords?name=smoke%20test"
call song1    200 GET  "/v1/songs/1"
call missing  404 GET  "/v1/songs/99999"

note "15. Teardown"
call delRec   204 DELETE "/v1/recordings/$REC_ID"
call gone     404 GET    "/v1/recordings/detail/$REC_ID"

printf '\n\033[1m%d passed, %d failed\033[0m\n' "$PASS" "$FAIL"
[ "$FAIL" -eq 0 ] || exit 1
