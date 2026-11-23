package p007c.p190n.p194b.p266d.p314j.p325k;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.k.x7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4406x7 extends AbstractC4393w7 {
    /* JADX INFO: renamed from: d */
    public static int m10334d(byte[] bArr, int i, long j2, int i2) {
        if (i2 == 0) {
            AbstractC4393w7 abstractC4393w7 = C4367u7.f23503a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return C4367u7.m10280c(i, C4353t7.m10222a(bArr, j2), C4353t7.m10222a(bArr, j2 + 1));
            }
            throw new AssertionError();
        }
        byte bM10222a = C4353t7.m10222a(bArr, j2);
        AbstractC4393w7 abstractC4393w8 = C4367u7.f23503a;
        if (i > -12 || bM10222a > -65) {
            return -1;
        }
        return i ^ (bM10222a << 8);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4393w7
    /* JADX INFO: renamed from: a */
    public final int mo10290a(int i, byte[] bArr, int i2, int i3) {
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
                if (C4353t7.m10222a(bArr, j4) < 0) {
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
            byte bM10222a = 0;
            while (i6 > 0) {
                long j7 = j6 + 1;
                bM10222a = C4353t7.m10222a(bArr, j6);
                if (bM10222a < 0) {
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
            if (bM10222a < -32) {
                if (i7 == 0) {
                    return bM10222a;
                }
                i6 = i7 - 1;
                if (bM10222a >= -62) {
                    j2 = j6 + 1;
                    if (C4353t7.m10222a(bArr, j6) > -65) {
                    }
                }
                return -1;
            }
            if (bM10222a >= -16) {
                if (i7 < 3) {
                    return m10334d(bArr, bM10222a, j6, i7);
                }
                i6 = i7 - 3;
                long j8 = j6 + 1;
                byte bM10222a2 = C4353t7.m10222a(bArr, j6);
                if (bM10222a2 <= -65 && (((bM10222a2 + 112) + (bM10222a << 28)) >> 30) == 0) {
                    long j9 = j8 + 1;
                    if (C4353t7.m10222a(bArr, j8) <= -65) {
                        j2 = j9 + 1;
                        if (C4353t7.m10222a(bArr, j9) > -65) {
                        }
                    }
                }
                return -1;
            }
            if (i7 < 2) {
                return m10334d(bArr, bM10222a, j6, i7);
            }
            i6 = i7 - 2;
            long j10 = j6 + 1;
            byte bM10222a3 = C4353t7.m10222a(bArr, j6);
            if (bM10222a3 <= -65 && ((bM10222a != -32 || bM10222a3 >= -96) && (bM10222a != -19 || bM10222a3 < -96))) {
                j6 = j10 + 1;
                if (C4353t7.m10222a(bArr, j10) > -65) {
                }
            }
            return -1;
            j6 = j2;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4393w7
    /* JADX INFO: renamed from: b */
    public final int mo10291b(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
            C4353t7.m10230i(bArr, j5, (byte) cCharAt);
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
                    C4353t7.m10230i(bArr, j5, (byte) ((cCharAt3 >>> 6) | 960));
                    C4353t7.m10230i(bArr, j7, (byte) ((cCharAt3 & '?') | 128));
                    j3 = j7 + j2;
                    j4 = j2;
                } else {
                    if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j5 > j6 - 3) {
                        if (j5 > j6 - 4) {
                            if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i3)))) {
                                throw new C4419y7(i4, length);
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
                                C4353t7.m10230i(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                long j9 = j8 + 1;
                                C4353t7.m10230i(bArr, j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j10 = j9 + 1;
                                C4353t7.m10230i(bArr, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 = 1;
                                j3 = j10 + 1;
                                C4353t7.m10230i(bArr, j10, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C4419y7(i4 - 1, length);
                    }
                    long j11 = j5 + j2;
                    C4353t7.m10230i(bArr, j5, (byte) ((cCharAt3 >>> '\f') | 480));
                    long j12 = j11 + j2;
                    C4353t7.m10230i(bArr, j11, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                    C4353t7.m10230i(bArr, j12, (byte) ((cCharAt3 & '?') | 128));
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
                C4353t7.m10230i(bArr, j5, (byte) cCharAt3);
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

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4393w7
    /* JADX INFO: renamed from: c */
    public final String mo10292c(byte[] bArr, int i, int i2) throws C4239l5 {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte bM10222a = C4353t7.m10222a(bArr, i);
            if (!C2622l.m5456x1(bM10222a)) {
                break;
            }
            i++;
            cArr[i4] = (char) bM10222a;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte bM10222a2 = C4353t7.m10222a(bArr, i);
            if (C2622l.m5456x1(bM10222a2)) {
                int i7 = i5 + 1;
                cArr[i5] = (char) bM10222a2;
                i = i6;
                while (true) {
                    i5 = i7;
                    if (i >= i3) {
                        break;
                    }
                    byte bM10222a3 = C4353t7.m10222a(bArr, i);
                    if (!C2622l.m5456x1(bM10222a3)) {
                        break;
                    }
                    i++;
                    i7 = i5 + 1;
                    cArr[i5] = (char) bM10222a3;
                }
            } else {
                if (!(bM10222a2 < -32)) {
                    if (bM10222a2 < -16) {
                        if (i6 >= i3 - 1) {
                            throw C4239l5.m10002h();
                        }
                        int i8 = i6 + 1;
                        C2622l.m5308S0(bM10222a2, C4353t7.m10222a(bArr, i6), C4353t7.m10222a(bArr, i8), cArr, i5);
                        i = i8 + 1;
                        i5++;
                    } else {
                        if (i6 >= i3 - 2) {
                            throw C4239l5.m10002h();
                        }
                        int i9 = i6 + 1;
                        byte bM10222a4 = C4353t7.m10222a(bArr, i6);
                        int i10 = i9 + 1;
                        C2622l.m5304R0(bM10222a2, bM10222a4, C4353t7.m10222a(bArr, i9), C4353t7.m10222a(bArr, i10), cArr, i5);
                        i5 = i5 + 1 + 1;
                        i = i10 + 1;
                    }
                } else {
                    if (i6 >= i3) {
                        throw C4239l5.m10002h();
                    }
                    C2622l.m5312T0(bM10222a2, C4353t7.m10222a(bArr, i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                }
            }
        }
        return new String(cArr, 0, i5);
    }
}
