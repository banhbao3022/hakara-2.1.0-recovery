package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.w7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4033w7 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4024v7 f22982a;

    static {
        f22982a = (!(C4015u7.f22899h && C4015u7.f22898g) || C4056z3.m9317a()) ? new C4051y7() : new C3817a8();
    }

    /* JADX INFO: renamed from: a */
    public static int m9295a(CharSequence charSequence) {
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
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new C4042x7(i2, length2);
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
        long j2 = ((long) i3) + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public static int m9296b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX INFO: renamed from: c */
    public static int m9297c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        int i4 = -1;
        if (i3 == 0) {
            if (b > -12) {
                b = -1;
            }
            return b;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                return m9296b(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        }
        byte b2 = bArr[i];
        if (b <= -12 && b2 <= -65) {
            i4 = b ^ (b2 << 8);
        }
        return i4;
    }
}
