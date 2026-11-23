package p007c.p190n.p438f.p446m.p447b;

import com.facebook.stetho.dumpapp.Framer;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: c.n.f.m.b.f, reason: use source file name */
/* JADX INFO: compiled from: PDF417HighLevelEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class PDF417HighLevelEncoder {

    /* JADX INFO: renamed from: c */
    public static final byte[] f27767c;

    /* JADX INFO: renamed from: a */
    public static final byte[] f27765a = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, Framer.STDIN_FRAME_PREFIX, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f27766b = {59, 60, 62, 64, 91, 92, 93, Framer.STDIN_REQUEST_FRAME_PREFIX, 96, 126, Framer.ENTER_FRAME_PREFIX, 13, 9, 44, 58, 10, Framer.STDIN_FRAME_PREFIX, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* JADX INFO: renamed from: d */
    public static final byte[] f27768d = new byte[128];

    /* JADX INFO: renamed from: e */
    public static final Charset f27769e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        f27767c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f27765a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                f27767c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f27768d, (byte) -1);
        while (true) {
            byte[] bArr3 = f27766b;
            if (i >= bArr3.length) {
                return;
            }
            byte b2 = bArr3[i];
            if (b2 > 0) {
                f27768d[b2] = (byte) i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12404a(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append((char) 913);
        } else if (i2 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j2 = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j2 = (j2 << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j2 % 900);
                    j2 /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12405b(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int iMin = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + iMin));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            int length = sb2.length();
            while (true) {
                length--;
                if (length >= 0) {
                    sb.append(sb2.charAt(length));
                }
            }
            i3 += iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff A[EDGE_INSN: B:83:0x00ff->B:62:0x00ff BREAK  A[LOOP:0: B:3:0x0011->B:100:0x0011], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static int m12406c(CharSequence charSequence, int i, int i2, StringBuilder sb, int i3) {
        StringBuilder sb2 = new StringBuilder(i2);
        int i4 = i3;
        int i5 = 0;
        while (true) {
            int i6 = i + i5;
            char cCharAt = charSequence.charAt(i6);
            if (i4 == 0) {
                if (m12408e(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (cCharAt - 'A'));
                    }
                } else if (m12407d(cCharAt)) {
                    sb2.append((char) 27);
                    i4 = 1;
                } else if (m12410g(cCharAt)) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) f27768d[cCharAt]);
                }
                i5++;
                if (i5 >= i2) {
                    break;
                    break;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        byte[] bArr = f27768d;
                        if (bArr[cCharAt] != -1) {
                            sb2.append((char) bArr[cCharAt]);
                        } else {
                            sb2.append((char) 29);
                            i4 = 0;
                        }
                    } else if (m12410g(cCharAt)) {
                        sb2.append((char) f27767c[cCharAt]);
                    } else if (m12408e(cCharAt)) {
                        sb2.append((char) 28);
                        i4 = 0;
                    } else if (m12407d(cCharAt)) {
                        sb2.append((char) 27);
                        i4 = 1;
                    } else {
                        int i7 = i6 + 1;
                        if (i7 < i2) {
                            if (f27768d[charSequence.charAt(i7)] != -1) {
                                i4 = 3;
                                sb2.append((char) 25);
                            }
                        }
                        sb2.append((char) 29);
                        sb2.append((char) f27768d[cCharAt]);
                    }
                } else if (m12407d(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (cCharAt - 'a'));
                    }
                } else if (m12408e(cCharAt)) {
                    sb2.append((char) 27);
                    sb2.append((char) (cCharAt - 'A'));
                } else if (m12410g(cCharAt)) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) f27768d[cCharAt]);
                }
                i5++;
                if (i5 >= i2) {
                    break;
                }
            }
        }
        int length = sb2.length();
        char cCharAt2 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 % 2 != 0) {
                cCharAt2 = (char) (sb2.charAt(i8) + (cCharAt2 * 30));
                sb.append(cCharAt2);
            } else {
                cCharAt2 = sb2.charAt(i8);
            }
        }
        if (length % 2 != 0) {
            sb.append((char) ((cCharAt2 * 30) + 29));
        }
        return i4;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12407d(char c2) {
        if (c2 != ' ') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m12408e(char c2) {
        if (c2 != ' ') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12409f(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12410g(char c2) {
        return f27767c[c2] != -1;
    }
}
