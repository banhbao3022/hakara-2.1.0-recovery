package p007c.p190n.p194b.p209b.p212b2;

import java.nio.charset.Charset;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p379a.Charsets;

/* JADX INFO: renamed from: c.n.b.b.b2.w, reason: use source file name */
/* JADX INFO: compiled from: ParsableByteArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class ParsableByteArray {

    /* JADX INFO: renamed from: a */
    public byte[] f6392a;

    /* JADX INFO: renamed from: b */
    public int f6393b;

    /* JADX INFO: renamed from: c */
    public int f6394c;

    public ParsableByteArray() {
        this.f6392a = Util6.f6312f;
    }

    /* JADX INFO: renamed from: A */
    public void m3191A(byte[] bArr) {
        int length = bArr.length;
        this.f6392a = bArr;
        this.f6394c = length;
        this.f6393b = 0;
    }

    /* JADX INFO: renamed from: B */
    public void m3192B(byte[] bArr, int i) {
        this.f6392a = bArr;
        this.f6394c = i;
        this.f6393b = 0;
    }

    /* JADX INFO: renamed from: C */
    public void m3193C(int i) {
        C2096e.m4566b(i >= 0 && i <= this.f6392a.length);
        this.f6394c = i;
    }

    /* JADX INFO: renamed from: D */
    public void m3194D(int i) {
        C2096e.m4566b(i >= 0 && i <= this.f6394c);
        this.f6393b = i;
    }

    /* JADX INFO: renamed from: E */
    public void m3195E(int i) {
        m3194D(this.f6393b + i);
    }

    /* JADX INFO: renamed from: a */
    public int m3196a() {
        return this.f6394c - this.f6393b;
    }

    /* JADX INFO: renamed from: b */
    public void m3197b(int i) {
        byte[] bArr = this.f6392a;
        if (i > bArr.length) {
            this.f6392a = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m3198c() {
        return this.f6392a[this.f6393b] & 255;
    }

    /* JADX INFO: renamed from: d */
    public void m3199d(ParsableBitArray parsableBitArray, int i) {
        m3200e(parsableBitArray.f6388a, 0, i);
        parsableBitArray.m3187k(0);
    }

    /* JADX INFO: renamed from: e */
    public void m3200e(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f6392a, this.f6393b, bArr, i, i2);
        this.f6393b += i2;
    }

    /* JADX INFO: renamed from: f */
    public int m3201f() {
        byte[] bArr = this.f6392a;
        int i = this.f6393b;
        int i2 = i + 1;
        this.f6393b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i2 + 1;
        this.f6393b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 16);
        int i6 = i4 + 1;
        this.f6393b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f6393b = i6 + 1;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX INFO: renamed from: g */
    public String m3202g() {
        if (m3196a() == 0) {
            return null;
        }
        int i = this.f6393b;
        while (i < this.f6394c && !Util6.m3097F(this.f6392a[i])) {
            i++;
        }
        int i2 = this.f6393b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f6392a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f6393b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f6392a;
        int i3 = this.f6393b;
        String strM3128p = Util6.m3128p(bArr2, i3, i - i3);
        this.f6393b = i;
        int i4 = this.f6394c;
        if (i == i4) {
            return strM3128p;
        }
        byte[] bArr3 = this.f6392a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f6393b = i5;
            if (i5 == i4) {
                return strM3128p;
            }
        }
        int i6 = this.f6393b;
        if (bArr3[i6] == 10) {
            this.f6393b = i6 + 1;
        }
        return strM3128p;
    }

    /* JADX INFO: renamed from: h */
    public int m3203h() {
        byte[] bArr = this.f6392a;
        int i = this.f6393b;
        int i2 = i + 1;
        this.f6393b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.f6393b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        int i6 = i4 + 1;
        this.f6393b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f6393b = i6 + 1;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* JADX INFO: renamed from: i */
    public short m3204i() {
        byte[] bArr = this.f6392a;
        int i = this.f6393b;
        int i2 = i + 1;
        this.f6393b = i2;
        int i3 = bArr[i] & 255;
        this.f6393b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* JADX INFO: renamed from: j */
    public long m3205j() {
        byte[] bArr = this.f6392a;
        int i = this.f6393b;
        int i2 = i + 1;
        this.f6393b = i2;
        long j2 = ((long) bArr[i]) & 255;
        int i3 = i2 + 1;
        this.f6393b = i3;
        long j3 = j2 | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i3 + 1;
        this.f6393b = i4;
        long j4 = j3 | ((((long) bArr[i3]) & 255) << 16);
        this.f6393b = i4 + 1;
        return j4 | ((((long) bArr[i4]) & 255) << 24);
    }

    /* JADX INFO: renamed from: k */
    public int m3206k() {
        int iM3203h = m3203h();
        if (iM3203h >= 0) {
            return iM3203h;
        }
        throw new IllegalStateException(outline.m1590l("Top bit not zero: ", iM3203h));
    }

    /* JADX INFO: renamed from: l */
    public int m3207l() {
        byte[] bArr = this.f6392a;
        int i = this.f6393b;
        int i2 = i + 1;
        this.f6393b = i2;
        int i3 = bArr[i] & 255;
        this.f6393b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* JADX INFO: renamed from: m */
    public long m3208m() {
        byte[] bArr = this.f6392a;
        int i = this.f6393b;
        int i2 = i + 1;
        this.f6393b = i2;
        long j2 = (((long) bArr[i]) & 255) << 56;
        int i3 = i2 + 1;
        this.f6393b = i3;
        long j3 = j2 | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i3 + 1;
        this.f6393b = i4;
        long j4 = j3 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i4 + 1;
        this.f6393b = i5;
        long j5 = j4 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i5 + 1;
        this.f6393b = i6;
        long j6 = j5 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i6 + 1;
        this.f6393b = i7;
        long j7 = j6 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i7 + 1;
        this.f6393b = i8;
        long j8 = j7 | ((((long) bArr[i7]) & 255) << 8);
        this.f6393b = i8 + 1;
        return j8 | (((long) bArr[i8]) & 255);
    }

    /* JADX INFO: renamed from: n */
    public String m3209n() {
        if (m3196a() == 0) {
            return null;
        }
        int i = this.f6393b;
        while (i < this.f6394c && this.f6392a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f6392a;
        int i2 = this.f6393b;
        String strM3128p = Util6.m3128p(bArr, i2, i - i2);
        this.f6393b = i;
        if (i < this.f6394c) {
            this.f6393b = i + 1;
        }
        return strM3128p;
    }

    /* JADX INFO: renamed from: o */
    public String m3210o(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f6393b;
        int i3 = (i2 + i) - 1;
        String strM3128p = Util6.m3128p(this.f6392a, i2, (i3 >= this.f6394c || this.f6392a[i3] != 0) ? i : i - 1);
        this.f6393b += i;
        return strM3128p;
    }

    /* JADX INFO: renamed from: p */
    public String m3211p(int i) {
        return m3212q(i, Charsets.f26131c);
    }

    /* JADX INFO: renamed from: q */
    public String m3212q(int i, Charset charset) {
        String str = new String(this.f6392a, this.f6393b, i, charset);
        this.f6393b += i;
        return str;
    }

    /* JADX INFO: renamed from: r */
    public int m3213r() {
        return (m3214s() << 21) | (m3214s() << 14) | (m3214s() << 7) | m3214s();
    }

    /* JADX INFO: renamed from: s */
    public int m3214s() {
        byte[] bArr = this.f6392a;
        int i = this.f6393b;
        this.f6393b = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: t */
    public long m3215t() {
        byte[] bArr = this.f6392a;
        int i = this.f6393b;
        int i2 = i + 1;
        this.f6393b = i2;
        long j2 = (((long) bArr[i]) & 255) << 24;
        int i3 = i2 + 1;
        this.f6393b = i3;
        long j3 = j2 | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i3 + 1;
        this.f6393b = i4;
        long j4 = j3 | ((((long) bArr[i3]) & 255) << 8);
        this.f6393b = i4 + 1;
        return j4 | (((long) bArr[i4]) & 255);
    }

    /* JADX INFO: renamed from: u */
    public int m3216u() {
        byte[] bArr = this.f6392a;
        int i = this.f6393b;
        int i2 = i + 1;
        this.f6393b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i2 + 1;
        this.f6393b = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.f6393b = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: v */
    public int m3217v() {
        int iM3201f = m3201f();
        if (iM3201f >= 0) {
            return iM3201f;
        }
        throw new IllegalStateException(outline.m1590l("Top bit not zero: ", iM3201f));
    }

    /* JADX INFO: renamed from: w */
    public long m3218w() {
        long jM3208m = m3208m();
        if (jM3208m >= 0) {
            return jM3208m;
        }
        throw new IllegalStateException(outline.m1594p("Top bit not zero: ", jM3208m));
    }

    /* JADX INFO: renamed from: x */
    public int m3219x() {
        byte[] bArr = this.f6392a;
        int i = this.f6393b;
        int i2 = i + 1;
        this.f6393b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f6393b = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    /* JADX INFO: renamed from: y */
    public long m3220y() {
        int i;
        int i2;
        long j2 = this.f6392a[this.f6393b];
        int i3 = 7;
        while (true) {
            if (i3 >= 0) {
                int i4 = 1 << i3;
                if ((((long) i4) & j2) == 0) {
                    if (i3 < 6) {
                        j2 &= (long) (i4 - 1);
                        i2 = 7 - i3;
                        break;
                    }
                    if (i3 == 7) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i3--;
                }
            }
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            throw new NumberFormatException(outline.m1594p("Invalid UTF-8 sequence first byte: ", j2));
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f6392a[this.f6393b + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException(outline.m1594p("Invalid UTF-8 sequence continuation byte: ", j2));
            }
            j2 = (j2 << 6) | ((long) (b & 63));
        }
        this.f6393b += i2;
        return j2;
    }

    /* JADX INFO: renamed from: z */
    public void m3221z(int i) {
        byte[] bArr = this.f6392a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m3192B(bArr, i);
    }

    public ParsableByteArray(int i) {
        this.f6392a = new byte[i];
        this.f6394c = i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.f6392a = bArr;
        this.f6394c = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.f6392a = bArr;
        this.f6394c = i;
    }
}
