#!/usr/bin/env bash
#
# Create (once) and boot the AVD used to test the patched Hakara client.
#
#   usage: scripts/run-emulator.sh [start|stop|status|shell]
#
# Headless by default. DISPLAY here is an X11 forward (:10.0), and forwarding a
# full emulator window over it is slow enough to be misleading about the app's
# own performance — drive it with adb and take screenshots instead. Pass
# WINDOW=1 to get a real window anyway.
#
# The emulator reaches this host at 10.0.2.2, which is why the patched APK's
# base URL is http://10.0.2.2:<port>/ rather than localhost.
#
set -euo pipefail

export JAVA_HOME="${JAVA_HOME:-/usr/lib/jvm/java-17}"
export ANDROID_HOME="${ANDROID_HOME:-$HOME/Android/Sdk}"
export ANDROID_SDK_ROOT="$ANDROID_HOME"
export PATH="$JAVA_HOME/bin:$ANDROID_HOME/platform-tools:$ANDROID_HOME/emulator:$ANDROID_HOME/cmdline-tools/latest/bin:$PATH"

AVD_NAME="${AVD_NAME:-hakara}"
IMAGE="${IMAGE:-system-images;android-34;google_apis;x86_64}"
DEVICE="${DEVICE:-pixel_6}"
BOOT_TIMEOUT="${BOOT_TIMEOUT:-300}"

die() { printf '\n\033[31mERROR\033[0m %s\n' "$*" >&2; exit 1; }
step() { printf '\n\033[1m==> %s\033[0m\n' "$*"; }
info() { printf '    %s\n' "$*"; }

ensure_avd() {
  if avdmanager list avd 2>/dev/null | grep -q "Name: $AVD_NAME\$"; then
    info "AVD '$AVD_NAME' already exists"
    return
  fi
  # IMAGE is an sdkmanager coordinate ("a;b;c"); its on-disk path is the same
  # with separators swapped, and it already begins with "system-images".
  [ -d "$ANDROID_HOME/${IMAGE//;//}" ] \
    || die "system image not installed: $IMAGE
       install with: sdkmanager --install \"$IMAGE\""
  step "Creating AVD '$AVD_NAME'"
  echo no | avdmanager create avd -n "$AVD_NAME" -k "$IMAGE" -d "$DEVICE" >/dev/null
  # 2 GB of RAM and a real data partition: the APK alone is ~79 MB and the
  # default 800 MB userdata fills up fast once recordings are written.
  CFG="$HOME/.android/avd/$AVD_NAME.avd/config.ini"
  {
    echo 'hw.ramSize=2048'
    echo 'disk.dataPartition.size=4096M'
    echo 'hw.keyboard=yes'
  } >> "$CFG"
  info "created, config at $CFG"
}

serial_of() {
  adb devices | awk '/^emulator-[0-9]+\tdevice$/ {print $1; exit}'
}

cmd_start() {
  ensure_avd

  if [ -n "$(serial_of)" ]; then
    info "an emulator is already booted: $(serial_of)"
    return
  fi

  step "Booting '$AVD_NAME'"
  local args=(
    -avd "$AVD_NAME"
    -no-snapshot                # always a clean boot; snapshots hide state bugs
    -no-audio
    -no-boot-anim
    -gpu swiftshader_indirect   # software GL — no usable host GPU over X forward
    -netdelay none
    -netspeed full
  )
  [ "${WINDOW:-0}" = "1" ] || args+=(-no-window)
  [ -w /dev/kvm ] || info "WARNING: /dev/kvm not writable — boot will be very slow"

  nohup emulator "${args[@]}" >/tmp/emulator-$AVD_NAME.log 2>&1 &
  info "pid $!, log /tmp/emulator-$AVD_NAME.log"

  step "Waiting for boot (up to ${BOOT_TIMEOUT}s)"
  adb wait-for-device
  local waited=0
  until [ "$(adb shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')" = "1" ]; do
    sleep 5
    waited=$((waited + 5))
    [ "$waited" -lt "$BOOT_TIMEOUT" ] || die "boot did not complete within ${BOOT_TIMEOUT}s
       check /tmp/emulator-$AVD_NAME.log"
    printf '.'
  done
  printf '\n'

  info "booted: $(serial_of)"
  info "android: $(adb shell getprop ro.build.version.release | tr -d '\r') (API $(adb shell getprop ro.build.version.sdk | tr -d '\r'))"
}

cmd_stop() {
  local s; s="$(serial_of)"
  [ -n "$s" ] || { info "no emulator running"; return; }
  step "Stopping $s"
  adb -s "$s" emu kill || true
  info "stopped"
}

cmd_status() {
  adb devices
  local s; s="$(serial_of)"
  [ -n "$s" ] || { info "no emulator booted"; return; }
  info "boot_completed=$(adb shell getprop sys.boot_completed | tr -d '\r')"
  info "api=$(adb shell getprop ro.build.version.sdk | tr -d '\r')"
  # Proves the backend is reachable from inside the emulator, which is the
  # thing that actually matters for the patched client.
  #
  # Raw HTTP over nc because the system image ships no curl or wget. stdin is
  # held open deliberately: toybox nc exits on stdin EOF and would close the
  # socket before a response that needs a database round-trip comes back,
  # which reads as "connection refused" when the server is in fact healthy.
  local port="${BACKEND_PORT:-8099}"
  local reply
  reply="$(adb shell "{ printf 'GET /health HTTP/1.1\r\nHost: 10.0.2.2:${port}\r\nConnection: close\r\n\r\n'; sleep 3; } | nc 10.0.2.2 ${port}" 2>&1 | tr -d '\r' | tail -1)"
  case "$reply" in
    *'"status":1"'*|*'"status":1'*) info "backend at 10.0.2.2:${port}: reachable" ;;
    *) info "backend at 10.0.2.2:${port}: NOT reachable — got: ${reply:-<nothing>}" ;;
  esac
}

case "${1:-start}" in
  start)  cmd_start ;;
  stop)   cmd_stop ;;
  status) cmd_status ;;
  shell)  exec adb shell ;;
  *) die "usage: $0 [start|stop|status|shell]" ;;
esac
