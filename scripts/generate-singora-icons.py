import os
import struct
import zlib
import math

def write_png(path, width, height, rgba_bytes):
    def chunk(tag, data):
        return (
            struct.pack(">I", len(data))
            + tag
            + data
            + struct.pack(">I", zlib.crc32(tag + data) & 0xFFFFFFFF)
        )

    raw = bytearray()
    stride = width * 4
    for y in range(height):
        raw.append(0)
        raw.extend(rgba_bytes[y * stride : (y + 1) * stride])

    ihdr = struct.pack(">IIBBBBB", width, height, 8, 6, 0, 0, 0)
    png = b"\x89PNG\r\n\x1a\n" + chunk(b"IHDR", ihdr) + chunk(b"IDAT", zlib.compress(bytes(raw), 9)) + chunk(b"IEND", b"")
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "wb") as f:
        f.write(png)

def render_singora_icon(size, round_mask=False, foreground_only=False):
    buf = bytearray(size * size * 4)
    cx = (size - 1) / 2.0
    cy = (size - 1) / 2.0
    r_max = size / 2.0

    for y in range(size):
        ny = y / float(size - 1)
        for x in range(size):
            nx = x / float(size - 1)
            dx = x - cx
            dy = y - cy
            dist = math.hypot(dx, dy)
            idx = (y * size + x) * 4

            if round_mask and dist > r_max - 1.0:
                buf[idx : idx + 4] = b"\x00\x00\x00\x00"
                continue

            # Background: vibrant magenta-to-violet diagonal gradient
            if foreground_only:
                r, g, b, a = 0, 0, 0, 0
            else:
                t = (nx * 0.6 + ny * 0.4)
                r = int(236 * (1 - t) + 99 * t)
                g = int(72 * (1 - t) + 38 * t)
                b = int(153 * (1 - t) + 241 * t)
                a = 255

                # Subtle glowing ring
                ring = abs(dist - size * 0.38)
                if ring < size * 0.018:
                    r = min(255, r + 70)
                    g = min(255, g + 70)
                    b = min(255, b + 70)

            # Stylized microphone capsule + stand in crisp white
            mx = (x - cx) / (size * 0.5)
            my = (y - cy) / (size * 0.5)

            in_mic_head = (abs(mx) <= 0.16 and -0.34 <= my <= 0.02) or (
                math.hypot(mx, my + 0.34) <= 0.16
            ) or (
                math.hypot(mx, my - 0.02) <= 0.16
            )
            arc_r = math.hypot(mx, my - 0.02)
            in_u_holder = (0.23 <= arc_r <= 0.29 and my >= -0.02 and abs(mx) <= 0.30)
            in_stem = (abs(mx) <= 0.035 and 0.27 <= my <= 0.44)
            in_base = (abs(mx) <= 0.18 and 0.42 <= my <= 0.48)

            # Grill lines on mic capsule
            is_grill = in_mic_head and (abs(my + 0.24) < 0.018 or abs(my + 0.14) < 0.018) and abs(mx) < 0.12

            if (in_mic_head and not is_grill) or in_u_holder or in_stem or in_base:
                r, g, b, a = 255, 255, 255, 255

            buf[idx] = r
            buf[idx + 1] = g
            buf[idx + 2] = b
            buf[idx + 3] = a
    return buf

out_dir = r"D:\revert\work\hakara-2.1.0-recovery\assets-singora"
for name, sz, rnd, fg in [
    ("ic_launcher.png", 192, False, False),
    ("ic_launcher_round.png", 192, True, False),
    ("ic_launcher_foreground.png", 256, False, True),
    ("play_store_512.png", 512, False, False),
]:
    write_png(os.path.join(out_dir, name), sz, sz, render_singora_icon(sz, rnd, fg))

print("Generated Singora custom icons in", out_dir)
