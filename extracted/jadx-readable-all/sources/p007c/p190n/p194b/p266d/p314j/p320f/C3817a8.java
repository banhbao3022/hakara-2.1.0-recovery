package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.a8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3817a8 extends AbstractC4024v7 {
    /* JADX INFO: renamed from: c */
    public static int m8941c(byte[] bArr, int i, long j2, int i2) {
        if (i2 == 0) {
            AbstractC4024v7 abstractC4024v7 = C4033w7.f22982a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return C4033w7.m9296b(i, C4015u7.m9235a(bArr, j2), C4015u7.m9235a(bArr, j2 + 1));
            }
            throw new AssertionError();
        }
        byte bM9235a = C4015u7.m9235a(bArr, j2);
        AbstractC4024v7 abstractC4024v8 = C4033w7.f22982a;
        if (i > -12 || bM9235a > -65) {
            return -1;
        }
        return i ^ (bM9235a << 8);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4024v7
    /* JADX INFO: renamed from: a */
    public final int mo8942a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c2;
        long j2;
        long j3;
        long j4;
        int i3;
        char cCharAt;
        long j5 = i;
        long j6 = ((long) i2) + j5;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char cCharAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(cCharAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c2 = 128;
            j2 = 1;
            if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            C4015u7.m9239e(bArr, j5, (byte) cCharAt);
            i4++;
            j5 = 1 + j5;
        }
        if (i4 == length) {
            return (int) j5;
        }
        while (i4 < length) {
            char cCharAt3 = charSequence.charAt(i4);
            if (cCharAt3 >= c2 || j5 >= j6) {
                if (cCharAt3 < 2048 && j5 <= j6 - 2) {
                    long j7 = j5 + j2;
                    C4015u7.m9239e(bArr, j5, (byte) ((cCharAt3 >>> 6) | 960));
                    C4015u7.m9239e(bArr, j7, (byte) ((cCharAt3 & '?') | 128));
                    j3 = j7 + j2;
                    j4 = j2;
                } else {
                    if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j5 > j6 - 3) {
                        if (j5 > j6 - 4) {
                            if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i3)))) {
                                throw new C4042x7(i4, length);
                            }
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Failed writing ");
                            sb2.append(cCharAt3);
                            sb2.append(" at index ");
                            sb2.append(j5);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                long j8 = j5 + 1;
                                C4015u7.m9239e(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                long j9 = j8 + 1;
                                C4015u7.m9239e(bArr, j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j10 = j9 + 1;
                                C4015u7.m9239e(bArr, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 = 1;
                                j3 = j10 + 1;
                                C4015u7.m9239e(bArr, j10, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C4042x7(i4 - 1, length);
                    }
                    long j11 = j5 + j2;
                    C4015u7.m9239e(bArr, j5, (byte) ((cCharAt3 >>> '\f') | 480));
                    long j12 = j11 + j2;
                    C4015u7.m9239e(bArr, j11, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                    C4015u7.m9239e(bArr, j12, (byte) ((cCharAt3 & '?') | 128));
                    j3 = j12 + 1;
                    j4 = 1;
                }
                i4++;
                c2 = 128;
                long j13 = j4;
                j5 = j3;
                j2 = j13;
            } else {
                long j14 = j5 + j2;
                C4015u7.m9239e(bArr, j5, (byte) cCharAt3);
                j4 = j2;
                j3 = j14;
            }
            i4++;
            c2 = 128;
            long j15 = j4;
            j5 = j3;
            j2 = j15;
        }
        return (int) j5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4024v7
    /* JADX INFO: renamed from: b */
    public final int mo8943b(int i, byte[] bArr, int i2, int i3) {
        int i4;
        long j2;
        if ((i2 | i3 | (bArr.length - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        long j3 = i2;
        int i5 = (int) (((long) i3) - j3);
        if (i5 >= 16) {
            long j4 = j3;
            i4 = 0;
            while (true) {
                if (i4 >= i5) {
                    i4 = i5;
                    break;
                }
                long j5 = j4 + 1;
                if (C4015u7.m9235a(bArr, j4) < 0) {
                    break;
                }
                i4++;
                j4 = j5;
            }
        } else {
            i4 = 0;
        }
        int i6 = i5 - i4;
        long j6 = j3 + ((long) i4);
        while (true) {
            byte bM9235a = 0;
            while (i6 > 0) {
                long j7 = j6 + 1;
                bM9235a = C4015u7.m9235a(bArr, j6);
                if (bM9235a < 0) {
                    j6 = j7;
                    break;
                }
                i6--;
                j6 = j7;
            }
            if (i6 == 0) {
                return 0;
            }
            int i7 = i6 - 1;
            if (bM9235a < -32) {
                if (i7 == 0) {
                    return bM9235a;
                }
                i6 = i7 - 1;
                if (bM9235a >= -62) {
                    j2 = j6 + 1;
                    if (C4015u7.m9235a(bArr, j6) > -65) {
                    }
                }
                return -1;
            }
            if (bM9235a >= -16) {
                if (i7 < 3) {
                    return m8941c(bArr, bM9235a, j6, i7);
                }
                i6 = i7 - 3;
                long j8 = j6 + 1;
                byte bM9235a2 = C4015u7.m9235a(bArr, j6);
                if (bM9235a2 <= -65 && (((bM9235a2 + 112) + (bM9235a << 28)) >> 30) == 0) {
                    long j9 = j8 + 1;
                    if (C4015u7.m9235a(bArr, j8) <= -65) {
                        j2 = j9 + 1;
                        if (C4015u7.m9235a(bArr, j9) > -65) {
                        }
                    }
                }
                return -1;
            }
            if (i7 < 2) {
                return m8941c(bArr, bM9235a, j6, i7);
            }
            i6 = i7 - 2;
            long j10 = j6 + 1;
            byte bM9235a3 = C4015u7.m9235a(bArr, j6);
            if (bM9235a3 <= -65 && ((bM9235a != -32 || bM9235a3 >= -96) && (bM9235a != -19 || bM9235a3 < -96))) {
                j6 = j10 + 1;
                if (C4015u7.m9235a(bArr, j10) > -65) {
                }
            }
            return -1;
            j6 = j2;
        }
    }
}
