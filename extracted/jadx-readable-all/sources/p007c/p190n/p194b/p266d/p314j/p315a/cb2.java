package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cb2 {

    /* JADX INFO: renamed from: a */
    public static final ab2 f12972a;

    static {
        if (za2.f22224g && za2.f22223f) {
            int i = v62.f20704a;
        }
        f12972a = new ab2();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6157a(byte[] bArr, int i, int i2) {
        return f12972a.m5727a(0, bArr, i, i2) == 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m6158b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char cCharAt2 = charSequence.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new bb2(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static int m6159c(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length) {
            return i + length;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char cCharAt2 = charSequence.charAt(i7);
            if (cCharAt2 >= 128 || i8 >= i6) {
                if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i8 > i6 - 3) {
                        if (i8 > i6 - 4) {
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                throw new bb2(i7, length);
                            }
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Failed writing ");
                            sb.append(cCharAt2);
                            sb.append(" at index ");
                            sb.append(i8);
                            throw new ArrayIndexOutOfBoundsException(sb.toString());
                        }
                        int i10 = i7 + 1;
                        if (i10 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i10);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i11 = i8 + 1;
                                bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                int i12 = i11 + 1;
                                bArr[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i13 = i12 + 1;
                                bArr[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i8 = i13 + 1;
                                bArr[i13] = (byte) ((codePoint & 63) | 128);
                                i7 = i10;
                            } else {
                                i7 = i10;
                            }
                        }
                        throw new bb2(i7 - 1, length);
                    }
                    int i14 = i8 + 1;
                    bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i3 = i15 + 1;
                    bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
                }
                i7++;
            } else {
                i3 = i8 + 1;
                bArr[i8] = (byte) cCharAt2;
            }
            i8 = i3;
            i7++;
        }
        return i8;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e A[PHI: r10
  0x009e: PHI (r10v19 byte) = (r10v18 byte), (r10v26 byte) binds: [B:43:0x0098, B:45:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00b7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static String m6160d(byte[] bArr, int i, int i2) throws r82 {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!C2622l.m5376h1(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (C2622l.m5376h1(b2)) {
                int i6 = i4 + 1;
                cArr[i4] = (char) b2;
                i = i5;
                while (true) {
                    i4 = i6;
                    if (i >= i3) {
                        break;
                    }
                    byte b3 = bArr[i];
                    if (!C2622l.m5376h1(b3)) {
                        break;
                    }
                    i++;
                    i6 = i4 + 1;
                    cArr[i4] = (char) b3;
                }
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw r82.m8267h();
                }
                int i7 = i5 + 1;
                int i8 = i4 + 1;
                byte b4 = bArr[i5];
                if (b2 < -62 || C2622l.m5368f3(b4)) {
                    throw r82.m8267h();
                }
                cArr[i4] = (char) (((b2 & 31) << 6) | (b4 & 63));
                i = i7;
                i4 = i8;
            } else {
                if (b2 < -16) {
                    if (i5 >= i3 - 1) {
                        throw r82.m8267h();
                    }
                    int i9 = i5 + 1;
                    int i10 = i9 + 1;
                    int i11 = i4 + 1;
                    byte b5 = bArr[i5];
                    byte b6 = bArr[i9];
                    if (!C2622l.m5368f3(b5)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!C2622l.m5368f3(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i = i10;
                                    i4 = i11;
                                }
                            } else if (b5 < -96) {
                                b2 = -19;
                                if (!C2622l.m5368f3(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i = i10;
                                    i4 = i11;
                                }
                            }
                        } else if (b5 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!C2622l.m5368f3(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i = i10;
                                    i4 = i11;
                                }
                            } else if (b5 < -96) {
                                b2 = -19;
                                if (!C2622l.m5368f3(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i = i10;
                                    i4 = i11;
                                }
                            }
                        }
                    }
                    throw r82.m8267h();
                }
                if (i5 >= i3 - 2) {
                    throw r82.m8267h();
                }
                int i12 = i5 + 1;
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                byte b7 = bArr[i5];
                byte b8 = bArr[i12];
                byte b9 = bArr[i13];
                if (C2622l.m5368f3(b7) || (((b7 + 112) + (b2 << 28)) >> 30) != 0 || C2622l.m5368f3(b8) || C2622l.m5368f3(b9)) {
                    throw r82.m8267h();
                }
                int i15 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i4] = (char) ((i15 >>> 10) + 55232);
                cArr[i4 + 1] = (char) ((i15 & 1023) + 56320);
                i4 += 2;
                i = i14;
            }
        }
        return new String(cArr, 0, i4);
    }

    /* JADX INFO: renamed from: e */
    public static int m6161e(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m6162f(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            byte b2 = bArr[i];
            if (b <= -12 && b2 <= -65) {
                return b ^ (b2 << 8);
            }
        } else if (b <= -12) {
            return b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static int m6162f(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
