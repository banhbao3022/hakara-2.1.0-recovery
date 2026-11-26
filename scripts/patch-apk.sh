#!/usr/bin/env bash
#
# Repoint the Hakara 2.1.0 client at a self-hosted backend, and make the result
# installable.
#
#   usage: scripts/patch-apk.sh <input.apk> [base-url] [output.apk]
#   e.g.   scripts/patch-apk.sh ~/hakara-2.1.0.apk http://10.0.2.2:8099/
#
# Three edits, each of which the app needs to work at all:
#
#   1. The Retrofit base URL, compiled into NetworkModule.kt as the string
#      "https://api.karavietnam.com/".
#   2. Cleartext HTTP permission for the new host. Android 9+ blocks cleartext
#      by default, and res/xml/network_security_config.xml currently allows it
#      only for suggestqueries.google.com and googleapis.com — so an http://
#      base URL fails with no useful error until this is added.
#   3. The Facebook content provider's authority. Apktool loses the original
#      literal and emits android:authorities="", which makes the rebuilt APK
#      fail to install with INSTALL_PARSE_FAILED_MANIFEST_MALFORMED. See
#      REVIEW.md § Emulator test.
#
# Every step that matches zero occurrences is a hard failure: a patch that
# silently changes nothing is worse than one that stops.
#
set -euo pipefail

export PATH="$HOME/.local/bin:$PATH"

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
CASE_DIR="$(dirname "$SCRIPT_DIR")"

IN_APK="${1:-}"
BASE_URL="${2:-http://10.0.2.2:8099/}"
OUT_APK="${3:-$CASE_DIR/hakara-2.1.0-selfhosted.apk}"

WORK="$CASE_DIR/apk-build"
DECODED="$WORK/decoded"
UNSIGNED="$WORK/unsigned.apk"
ALIGNED="$WORK/aligned.apk"

BUILD_TOOLS="${BUILD_TOOLS:-$HOME/Android/Sdk/build-tools/34.0.0}"
KEYSTORE="${KEYSTORE:-$HOME/.android/debug.keystore}"
KS_PASS="${KS_PASS:-android}"
KS_ALIAS="${KS_ALIAS:-androiddebugkey}"

# The build this case was audited against (REVIEW.md). A different file is
# allowed, but you should know that the audit no longer describes it.
KNOWN_SHA256="9DA68EA4F50B7228155C95C29A9C16CDA8AB623F19F99440DD513AB759D451AF"

ORIGINAL_BASE_URL="https://api.karavietnam.com/"

die() { printf '\n\033[31mERROR\033[0m %s\n' "$*" >&2; exit 1; }
step() { printf '\n\033[1m==> %s\033[0m\n' "$*"; }
info() { printf '    %s\n' "$*"; }

[ -n "$IN_APK" ] || die "usage: $0 <input.apk> [base-url] [output.apk]"
[ -f "$IN_APK" ] || die "no such file: $IN_APK"
[ -d "$BUILD_TOOLS" ] || die "Android build-tools not found at $BUILD_TOOLS (set BUILD_TOOLS=)"
command -v apktool >/dev/null || die "apktool not on PATH"

case "$BASE_URL" in
  */) ;;
  *) die "base URL must end in '/' — Retrofit rejects a baseUrl without one (got: $BASE_URL)" ;;
esac

# Host without scheme or port, for the network-security-config entry.
BASE_HOST="$(printf '%s' "$BASE_URL" | sed -E 's#^[a-z]+://##; s#[:/].*$##')"
BASE_SCHEME="$(printf '%s' "$BASE_URL" | sed -E 's#^([a-z]+)://.*#\1#')"

step "Input"
info "apk       : $IN_APK"
info "size      : $(stat -c%s "$IN_APK") bytes"
ACTUAL_SHA="$(sha256sum "$IN_APK" | cut -d' ' -f1 | tr 'a-f' 'A-F')"
info "sha256    : $ACTUAL_SHA"
if [ "$ACTUAL_SHA" = "$KNOWN_SHA256" ]; then
  info "           matches the build REVIEW.md audited"
else
  printf '    \033[33mNOTE\033[0m this is NOT the build REVIEW.md audited (expected %s).\n' "$KNOWN_SHA256"
  printf '         Patching will still be attempted; the audit findings may not apply.\n'
fi
info "base url  : $ORIGINAL_BASE_URL  ->  $BASE_URL"
info "output    : $OUT_APK"

step "Decoding (this takes a few minutes — 2 dex files and 86 native libraries)"
rm -rf "$DECODED"
mkdir -p "$WORK"
apktool d -f -o "$DECODED" "$IN_APK" >"$WORK/decode.log" 2>&1 \
  || { tail -20 "$WORK/decode.log"; die "apktool decode failed (full log: $WORK/decode.log)"; }
info "decoded to $DECODED"

# ---------------------------------------------------------------- 1. base URL
step "1/3  Repointing the Retrofit base URL"
mapfile -t HITS < <(grep -rl --include='*.smali' -F "$ORIGINAL_BASE_URL" "$DECODED" || true)
[ "${#HITS[@]}" -gt 0 ] || die "the string '$ORIGINAL_BASE_URL' was not found in any smali file.
       The base URL has moved or is built at runtime; inspect the decoded tree
       before trusting any further step."

for f in "${HITS[@]}"; do
  n="$(grep -c -F "$ORIGINAL_BASE_URL" "$f")"
  info "$n occurrence(s) in ${f#"$DECODED"/}"
  sed -i "s#${ORIGINAL_BASE_URL}#${BASE_URL}#g" "$f"
done

REMAINING="$(grep -rl --include='*.smali' -F 'api.karavietnam.com' "$DECODED" || true)"
[ -z "$REMAINING" ] || die "api.karavietnam.com still present after patching:
$REMAINING"

# Other hosts in the same domain are left alone on purpose: the report-user
# WebView points at www.karavietnam.com, which this server does not implement.
OTHER="$(grep -rh --include='*.smali' -o 'https\?://[a-z0-9.-]*karavietnam\.com[^"]*' "$DECODED" 2>/dev/null | sort -u || true)"
if [ -n "$OTHER" ]; then
  printf '    \033[33mNOTE\033[0m other karavietnam.com URLs left unpatched (not served by this backend):\n'
  printf '         %s\n' $OTHER
fi

# -------------------------------------------------- 2. cleartext HTTP, if http
step "2/3  Network security config"
NSC="$DECODED/res/xml/network_security_config.xml"
if [ "$BASE_SCHEME" != "http" ]; then
  info "base URL is https — no cleartext exemption needed"
elif [ ! -f "$NSC" ]; then
  die "expected $NSC to exist (the manifest references it); cannot grant cleartext safely"
elif grep -q "<domain[^>]*>$BASE_HOST<" "$NSC"; then
  info "$BASE_HOST already present in network_security_config.xml"
else
  python3 - "$NSC" "$BASE_HOST" <<'PY'
import sys, xml.etree.ElementTree as ET
path, host = sys.argv[1], sys.argv[2]
tree = ET.parse(path)
root = tree.getroot()
if root.tag != 'network-security-config':
    raise SystemExit(f'unexpected root element <{root.tag}> in {path}')
dc = ET.SubElement(root, 'domain-config')
dc.set('cleartextTrafficPermitted', 'true')
d = ET.SubElement(dc, 'domain')
d.set('includeSubdomains', 'true')
d.text = host
ET.indent(tree, space='    ')
tree.write(path, encoding='utf-8', xml_declaration=True)
print(f'    added cleartext domain-config for {host}')
PY
  grep -q "$BASE_HOST" "$NSC" || die "failed to add $BASE_HOST to $NSC"
fi

# --------------------------------------- 3. Facebook provider authority (fix)
step "3/3  Repairing empty manifest authorities"
MANIFEST="$DECODED/AndroidManifest.xml"
STRINGS="$DECODED/res/values/strings.xml"
[ -f "$MANIFEST" ] || die "no AndroidManifest.xml in the decoded tree"

if ! grep -q 'android:authorities=""' "$MANIFEST"; then
  info "no empty android:authorities — nothing to repair"
else
  FB_ID="$(sed -nE 's#.*<string name="facebook_app_id">([^<]+)</string>.*#\1#p' "$STRINGS" | head -1)"
  [ -n "$FB_ID" ] || die "android:authorities=\"\" present but facebook_app_id not found in $STRINGS"
  info "facebook_app_id = $FB_ID"
  sed -i "s#android:authorities=\"\"#android:authorities=\"com.facebook.app.FacebookContentProvider${FB_ID}\"#g" "$MANIFEST"
  grep -q 'android:authorities=""' "$MANIFEST" && die "empty authorities remain after repair"
  info "set to com.facebook.app.FacebookContentProvider${FB_ID}"
fi

# ---------------------------------------------------------------- rebuild
step "Rebuilding"
rm -f "$UNSIGNED"
apktool b "$DECODED" -o "$UNSIGNED" >"$WORK/build.log" 2>&1 \
  || { tail -30 "$WORK/build.log"; die "apktool build failed (full log: $WORK/build.log)"; }
info "unsigned: $(stat -c%s "$UNSIGNED") bytes"

step "Aligning"
rm -f "$ALIGNED"
"$BUILD_TOOLS/zipalign" -p -f 4 "$UNSIGNED" "$ALIGNED"
"$BUILD_TOOLS/zipalign" -c -v 4 "$ALIGNED" >/dev/null || die "zipalign verification failed"
info "aligned"

step "Signing"
if [ ! -f "$KEYSTORE" ]; then
  info "creating a debug keystore at $KEYSTORE"
  mkdir -p "$(dirname "$KEYSTORE")"
  keytool -genkeypair -v \
    -keystore "$KEYSTORE" -storepass "$KS_PASS" -keypass "$KS_PASS" \
    -alias "$KS_ALIAS" -keyalg RSA -keysize 2048 -validity 10000 \
    -dname "CN=Android Debug,O=Android,C=US" >/dev/null 2>&1 \
    || die "keytool failed to create the debug keystore"
fi

"$BUILD_TOOLS/apksigner" sign \
  --ks "$KEYSTORE" --ks-pass "pass:$KS_PASS" --key-pass "pass:$KS_PASS" \
  --ks-key-alias "$KS_ALIAS" \
  --out "$OUT_APK" "$ALIGNED" || die "apksigner sign failed"

"$BUILD_TOOLS/apksigner" verify --print-certs "$OUT_APK" >"$WORK/verify.log" 2>&1 \
  || { cat "$WORK/verify.log"; die "apksigner verify failed"; }
info "signature verified"

step "Done"
info "output : $OUT_APK"
info "size   : $(stat -c%s "$OUT_APK") bytes"
info "sha256 : $(sha256sum "$OUT_APK" | cut -d' ' -f1)"
printf '
    This is signed with a DEBUG key, so it is a separate app identity from the
    Play Store build: uninstall any existing copy before installing, and expect
    Facebook/Google login to be rejected by those providers (their app configs
    pin the original signing certificate).

    Install:
      adb install -r --no-incremental "%s"

    The server must be reachable at %s from the device.
' "$OUT_APK" "$BASE_URL"
