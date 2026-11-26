#!/usr/bin/env bash
#
# Mint an access token for local testing.
#
#   usage: scripts/dev-token.sh [identity] [display-name]
#     eval "$(scripts/dev-token.sh alice)"   # exports TOKEN
#
# This deliberately adds no server-side bypass. It calls the real
# POST /v1/auth/google/login, which already accepts a bare provider id: the
# decompiled client sends only `gg_user_id` and a display name, never an OAuth
# or ID token (ApiService.java, @QueryMap on both login routes), so there is
# nothing for the server to verify. See README.md § Known weaknesses.
#
# Consequence worth being explicit about: anyone who knows a user's Google or
# Facebook numeric id can obtain that user's session. That is inherited from the
# client's design, not introduced here, and it is why this script needs no
# special endpoint to work.
#
set -euo pipefail

BASE="${BASE:-http://localhost:8099}"
IDENTITY="${1:-devtester}"
NAME="${2:-Dev Tester}"

command -v curl >/dev/null || { echo "curl is required" >&2; exit 1; }
command -v python3 >/dev/null || { echo "python3 is required" >&2; exit 1; }

urlencode() { python3 -c 'import sys,urllib.parse; print(urllib.parse.quote(sys.argv[1]))' "$1"; }

RESPONSE="$(curl -sS -X POST \
  "$BASE/v1/auth/google/login?gg_user_id=$(urlencode "$IDENTITY")&full_name=$(urlencode "$NAME")&unique_id=$(urlencode "dev-$IDENTITY")")"

TOKEN="$(printf '%s' "$RESPONSE" | python3 -c '
import json, sys
try:
    data = json.load(sys.stdin)
except json.JSONDecodeError:
    sys.exit("server did not return JSON")
user = (data or {}).get("data")
if not user:
    sys.exit(f"unexpected response: {json.dumps(data)[:200]}")
token = user.get("access_token")
if not token:
    sys.exit("response carried no access_token")
print(token)
')"

USER_ID="$(printf '%s' "$RESPONSE" | python3 -c 'import json,sys; print(json.load(sys.stdin)["data"]["id"])')"

# Stdout is shell-evaluable; everything human goes to stderr so `eval "$(...)"`
# stays clean.
{
  echo "identity : $IDENTITY (user id $USER_ID)"
  echo "base     : $BASE"
  echo
  echo "use it:"
  echo "  curl -H \"Authorization: Bearer \$TOKEN\" $BASE/v1/notifications"
} >&2

echo "export TOKEN=$TOKEN"
echo "export USER_ID=$USER_ID"
