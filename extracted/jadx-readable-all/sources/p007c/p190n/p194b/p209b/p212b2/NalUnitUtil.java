package p007c.p190n.p194b.p209b.p212b2;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.b2.u, reason: use source file name */
/* JADX INFO: compiled from: NalUnitUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class NalUnitUtil {

    /* JADX INFO: renamed from: a */
    public static final byte[] f6368a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f6369b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f6370c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f6371d = new int[10];

    /* JADX INFO: renamed from: c.n.b.b.b2.u$a */
    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f6372a;

        /* JADX INFO: renamed from: b */
        public final int f6373b;

        /* JADX INFO: renamed from: c */
        public final boolean f6374c;

        public a(int i, int i2, boolean z) {
            this.f6372a = i;
            this.f6373b = i2;
            this.f6374c = z;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.b2.u$b */
    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f6375a;

        /* JADX INFO: renamed from: b */
        public final int f6376b;

        /* JADX INFO: renamed from: c */
        public final int f6377c;

        /* JADX INFO: renamed from: d */
        public final int f6378d;

        /* JADX INFO: renamed from: e */
        public final int f6379e;

        /* JADX INFO: renamed from: f */
        public final int f6380f;

        /* JADX INFO: renamed from: g */
        public final float f6381g;

        /* JADX INFO: renamed from: h */
        public final boolean f6382h;

        /* JADX INFO: renamed from: i */
        public final boolean f6383i;

        /* JADX INFO: renamed from: j */
        public final int f6384j;

        /* JADX INFO: renamed from: k */
        public final int f6385k;

        /* JADX INFO: renamed from: l */
        public final int f6386l;

        /* JADX INFO: renamed from: m */
        public final boolean f6387m;

        public b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f6375a = i;
            this.f6376b = i2;
            this.f6377c = i3;
            this.f6378d = i4;
            this.f6379e = i5;
            this.f6380f = i6;
            this.f6381g = f;
            this.f6382h = z;
            this.f6383i = z2;
            this.f6384j = i7;
            this.f6385k = i8;
            this.f6386l = i9;
            this.f6387m = z3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3172a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m3173b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        C2096e.m4570f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zArr[0] = false;
            zArr[1] = false;
            zArr[2] = false;
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zArr[0] = false;
            zArr[1] = false;
            zArr[2] = false;
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zArr[0] = false;
            zArr[1] = false;
            zArr[2] = false;
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            if ((bArr[i5] & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && bArr[i5] == 1) {
                    zArr[0] = false;
                    zArr[1] = false;
                    zArr[2] = false;
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static a m3174c(byte[] bArr, int i, int i2) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i2);
        parsableNalUnitBitArray.m3232k(8);
        int iM3227f = parsableNalUnitBitArray.m3227f();
        int iM3227f2 = parsableNalUnitBitArray.m3227f();
        parsableNalUnitBitArray.m3231j();
        return new a(iM3227f, iM3227f2, parsableNalUnitBitArray.m3225d());
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:72:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x011d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:0x0172  */
    /* JADX INFO: renamed from: d */
    public static b m3175d(byte[] bArr, int i, int i2) {
        int iM3227f;
        boolean z;
        int iM3227f2;
        boolean z2;
        int i3;
        boolean zM3225d;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i2);
        parsableNalUnitBitArray.m3232k(8);
        int iM3226e = parsableNalUnitBitArray.m3226e(8);
        int iM3226e2 = parsableNalUnitBitArray.m3226e(8);
        int iM3226e3 = parsableNalUnitBitArray.m3226e(8);
        int iM3227f3 = parsableNalUnitBitArray.m3227f();
        int i8 = 1;
        if (iM3226e == 100 || iM3226e == 110 || iM3226e == 122 || iM3226e == 244 || iM3226e == 44 || iM3226e == 83 || iM3226e == 86 || iM3226e == 118 || iM3226e == 128 || iM3226e == 138) {
            iM3227f = parsableNalUnitBitArray.m3227f();
            boolean zM3225d2 = iM3227f == 3 ? parsableNalUnitBitArray.m3225d() : false;
            parsableNalUnitBitArray.m3227f();
            parsableNalUnitBitArray.m3227f();
            parsableNalUnitBitArray.m3231j();
            if (parsableNalUnitBitArray.m3225d()) {
                int i9 = iM3227f != 3 ? 8 : 12;
                int i10 = 0;
                while (i10 < i9) {
                    if (parsableNalUnitBitArray.m3225d()) {
                        int i11 = i10 < 6 ? 16 : 64;
                        int iM3228g = 8;
                        int i12 = 8;
                        for (int i13 = 0; i13 < i11; i13++) {
                            if (iM3228g != 0) {
                                iM3228g = ((parsableNalUnitBitArray.m3228g() + i12) + 256) % 256;
                            }
                            if (iM3228g != 0) {
                                i12 = iM3228g;
                            }
                        }
                    }
                    i10++;
                }
            }
            z = zM3225d2;
        } else {
            iM3227f = 1;
            z = false;
        }
        int iM3227f4 = parsableNalUnitBitArray.m3227f() + 4;
        int iM3227f5 = parsableNalUnitBitArray.m3227f();
        if (iM3227f5 != 0) {
            if (iM3227f5 == 1) {
                boolean zM3225d3 = parsableNalUnitBitArray.m3225d();
                parsableNalUnitBitArray.m3228g();
                parsableNalUnitBitArray.m3228g();
                long jM3227f = parsableNalUnitBitArray.m3227f();
                for (int i14 = 0; i14 < jM3227f; i14++) {
                    parsableNalUnitBitArray.m3227f();
                }
                z2 = zM3225d3;
                i3 = 0;
            } else {
                iM3227f2 = 0;
            }
            parsableNalUnitBitArray.m3227f();
            parsableNalUnitBitArray.m3231j();
            int iM3227f6 = parsableNalUnitBitArray.m3227f() + 1;
            int iM3227f7 = parsableNalUnitBitArray.m3227f() + 1;
            zM3225d = parsableNalUnitBitArray.m3225d();
            int i15 = (2 - (zM3225d ? 1 : 0)) * iM3227f7;
            if (!zM3225d) {
                parsableNalUnitBitArray.m3231j();
            }
            parsableNalUnitBitArray.m3231j();
            i4 = iM3227f6 * 16;
            i5 = i15 * 16;
            if (parsableNalUnitBitArray.m3225d()) {
                int iM3227f8 = parsableNalUnitBitArray.m3227f();
                int iM3227f9 = parsableNalUnitBitArray.m3227f();
                int iM3227f10 = parsableNalUnitBitArray.m3227f();
                int iM3227f11 = parsableNalUnitBitArray.m3227f();
                if (iM3227f == 0) {
                    i7 = 2 - (zM3225d ? 1 : 0);
                } else {
                    if (iM3227f == 3) {
                        i6 = 1;
                    } else {
                        i6 = 2;
                    }
                    i7 = (2 - (zM3225d ? 1 : 0)) * (iM3227f == 1 ? 2 : 1);
                    i8 = i6;
                }
                i4 -= (iM3227f8 + iM3227f9) * i8;
                i5 -= (iM3227f10 + iM3227f11) * i7;
            }
            int i16 = i4;
            int i17 = i5;
            float f2 = 1.0f;
            if (parsableNalUnitBitArray.m3225d() || !parsableNalUnitBitArray.m3225d()) {
                f = 1.0f;
            } else {
                int iM3226e4 = parsableNalUnitBitArray.m3226e(8);
                if (iM3226e4 == 255) {
                    int iM3226e5 = parsableNalUnitBitArray.m3226e(16);
                    int iM3226e6 = parsableNalUnitBitArray.m3226e(16);
                    if (iM3226e5 != 0 && iM3226e6 != 0) {
                        f2 = iM3226e5 / iM3226e6;
                    }
                    f = f2;
                } else {
                    float[] fArr = f6369b;
                    if (iM3226e4 < fArr.length) {
                        f = fArr[iM3226e4];
                    } else {
                        outline.m1565P("Unexpected aspect_ratio_idc value: ", iM3226e4, "NalUnitUtil");
                        f = 1.0f;
                    }
                }
            }
            return new b(iM3226e, iM3226e2, iM3226e3, iM3227f3, i16, i17, f, z, zM3225d, iM3227f4, iM3227f5, i3, z2);
        }
        iM3227f2 = parsableNalUnitBitArray.m3227f() + 4;
        i3 = iM3227f2;
        z2 = false;
        parsableNalUnitBitArray.m3227f();
        parsableNalUnitBitArray.m3231j();
        int iM3227f12 = parsableNalUnitBitArray.m3227f() + 1;
        int iM3227f13 = parsableNalUnitBitArray.m3227f() + 1;
        zM3225d = parsableNalUnitBitArray.m3225d();
        int i18 = (2 - (zM3225d ? 1 : 0)) * iM3227f13;
        if (!zM3225d) {
            parsableNalUnitBitArray.m3231j();
        }
        parsableNalUnitBitArray.m3231j();
        i4 = iM3227f12 * 16;
        i5 = i18 * 16;
        if (parsableNalUnitBitArray.m3225d()) {
            int iM3227f14 = parsableNalUnitBitArray.m3227f();
            int iM3227f15 = parsableNalUnitBitArray.m3227f();
            int iM3227f16 = parsableNalUnitBitArray.m3227f();
            int iM3227f17 = parsableNalUnitBitArray.m3227f();
            if (iM3227f == 0) {
                i7 = 2 - (zM3225d ? 1 : 0);
            } else {
                if (iM3227f == 3) {
                    i6 = 1;
                } else {
                    i6 = 2;
                }
                i7 = (2 - (zM3225d ? 1 : 0)) * (iM3227f == 1 ? 2 : 1);
                i8 = i6;
            }
            i4 -= (iM3227f14 + iM3227f15) * i8;
            i5 -= (iM3227f16 + iM3227f17) * i7;
        }
        int i19 = i4;
        int i110 = i5;
        float f3 = 1.0f;
        if (parsableNalUnitBitArray.m3225d()) {
            f = 1.0f;
        } else {
            f = 1.0f;
        }
        return new b(iM3226e, iM3226e2, iM3226e3, iM3227f3, i19, i110, f, z, zM3225d, iM3227f4, iM3227f5, i3, z2);
    }

    /* JADX INFO: renamed from: e */
    public static int m3176e(byte[] bArr, int i) {
        int i2;
        synchronized (f6370c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i) {
                    int[] iArr = f6371d;
                    if (iArr.length <= i4) {
                        f6371d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f6371d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f6371d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
