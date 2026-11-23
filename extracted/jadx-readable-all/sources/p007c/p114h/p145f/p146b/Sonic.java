package p007c.p114h.p145f.p146b;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.h.f.b.j, reason: use source file name */
/* JADX INFO: compiled from: Sonic.java */
/* JADX INFO: loaded from: classes.dex */
public final class Sonic {

    /* JADX INFO: renamed from: a */
    public final int f4329a;

    /* JADX INFO: renamed from: b */
    public final int f4330b;

    /* JADX INFO: renamed from: c */
    public final float f4331c;

    /* JADX INFO: renamed from: d */
    public final float f4332d;

    /* JADX INFO: renamed from: e */
    public final float f4333e;

    /* JADX INFO: renamed from: f */
    public final int f4334f;

    /* JADX INFO: renamed from: g */
    public final int f4335g;

    /* JADX INFO: renamed from: h */
    public final int f4336h;

    /* JADX INFO: renamed from: i */
    public final short[] f4337i;

    /* JADX INFO: renamed from: j */
    public int f4338j;

    /* JADX INFO: renamed from: k */
    public short[] f4339k;

    /* JADX INFO: renamed from: l */
    public int f4340l;

    /* JADX INFO: renamed from: m */
    public short[] f4341m;

    /* JADX INFO: renamed from: n */
    public int f4342n;

    /* JADX INFO: renamed from: o */
    public short[] f4343o;

    /* JADX INFO: renamed from: r */
    public int f4346r;

    /* JADX INFO: renamed from: s */
    public int f4347s;

    /* JADX INFO: renamed from: t */
    public int f4348t;

    /* JADX INFO: renamed from: u */
    public int f4349u;

    /* JADX INFO: renamed from: w */
    public int f4351w;

    /* JADX INFO: renamed from: x */
    public int f4352x;

    /* JADX INFO: renamed from: y */
    public int f4353y;

    /* JADX INFO: renamed from: p */
    public int f4344p = 0;

    /* JADX INFO: renamed from: q */
    public int f4345q = 0;

    /* JADX INFO: renamed from: v */
    public int f4350v = 0;

    public Sonic(int i, int i2, float f, float f2, int i3) {
        this.f4329a = i;
        this.f4330b = i2;
        this.f4334f = i / 400;
        int i4 = i / 65;
        this.f4335g = i4;
        int i5 = i4 * 2;
        this.f4336h = i5;
        this.f4337i = new short[i5];
        this.f4338j = i5;
        this.f4339k = new short[i5 * i2];
        this.f4340l = i5;
        this.f4341m = new short[i5 * i2];
        this.f4342n = i5;
        this.f4343o = new short[i5 * i2];
        this.f4331c = f;
        this.f4332d = f2;
        this.f4333e = i / i3;
    }

    /* JADX INFO: renamed from: f */
    public static void m2205f(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2206a(short[] sArr, int i, int i2) {
        m2209d(i2);
        int i3 = this.f4330b;
        System.arraycopy(sArr, i * i3, this.f4341m, this.f4347s * i3, i3 * i2);
        this.f4347s += i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m2207b(short[] sArr, int i, int i2) {
        int i3 = this.f4336h / i2;
        int i4 = this.f4330b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[outline.m1591m(i7, i5, i6, i9)];
            }
            this.f4337i[i7] = (short) (i8 / i5);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2208c(int i) {
        int i2 = this.f4346r + i;
        int i3 = this.f4338j;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.f4338j = i4;
            this.f4339k = Arrays.copyOf(this.f4339k, i4 * this.f4330b);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2209d(int i) {
        int i2 = this.f4347s + i;
        int i3 = this.f4340l;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.f4340l = i4;
            this.f4341m = Arrays.copyOf(this.f4341m, i4 * this.f4330b);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2210e(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f4330b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i5 * i2) {
                i7 = i2;
                i5 = iAbs;
            }
            if (iAbs * i6 > i8 * i2) {
                i6 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f4352x = i5 / i7;
        this.f4353y = i8 / i6;
        return i7;
    }

    /* JADX INFO: renamed from: g */
    public final void m2211g() {
        int iM2210e;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f4347s;
        float f = this.f4331c;
        float f2 = this.f4332d;
        float f3 = f / f2;
        float f4 = this.f4333e * f2;
        double d = f3;
        float f5 = 1.0f;
        int i6 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i7 = this.f4346r;
            if (i7 >= this.f4336h) {
                int i8 = 0;
                while (true) {
                    int i9 = this.f4349u;
                    if (i9 > 0) {
                        int iMin = Math.min(this.f4336h, i9);
                        m2206a(this.f4339k, i8, iMin);
                        this.f4349u -= iMin;
                        i8 += iMin;
                    } else {
                        short[] sArr = this.f4339k;
                        int i10 = this.f4329a;
                        int i11 = i10 > 4000 ? i10 / 4000 : 1;
                        if (this.f4330b == i6 && i11 == i6) {
                            iM2210e = m2210e(sArr, i8, this.f4334f, this.f4335g);
                        } else {
                            m2207b(sArr, i8, i11);
                            int iM2210e2 = m2210e(this.f4337i, 0, this.f4334f / i11, this.f4335g / i11);
                            if (i11 != i6) {
                                int i12 = iM2210e2 * i11;
                                int i13 = i11 * 4;
                                int i14 = i12 - i13;
                                int i15 = i12 + i13;
                                int i16 = this.f4334f;
                                if (i14 < i16) {
                                    i14 = i16;
                                }
                                int i17 = this.f4335g;
                                if (i15 > i17) {
                                    i15 = i17;
                                }
                                if (this.f4330b == i6) {
                                    iM2210e = m2210e(sArr, i8, i14, i15);
                                } else {
                                    m2207b(sArr, i8, i6);
                                    iM2210e = m2210e(this.f4337i, 0, i14, i15);
                                }
                            } else {
                                iM2210e = iM2210e2;
                            }
                        }
                        int i18 = this.f4352x;
                        int i19 = i18 != 0 && this.f4350v != 0 && this.f4353y <= i18 * 3 && i18 * 2 > this.f4351w * 3 ? this.f4350v : iM2210e;
                        this.f4351w = i18;
                        this.f4350v = iM2210e;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f4339k;
                            if (f3 >= 2.0f) {
                                i2 = (int) (i19 / (f3 - f5));
                            } else {
                                this.f4349u = (int) (((2.0f - f3) * i19) / (f3 - f5));
                                i2 = i19;
                            }
                            m2209d(i2);
                            int i20 = i2;
                            m2205f(i2, this.f4330b, this.f4341m, this.f4347s, sArr2, i8, sArr2, i8 + i19);
                            this.f4347s += i20;
                            i8 = i19 + i20 + i8;
                        } else {
                            int i21 = i19;
                            short[] sArr3 = this.f4339k;
                            if (f3 < 0.5f) {
                                i = (int) ((i21 * f3) / (f5 - f3));
                            } else {
                                this.f4349u = (int) ((((2.0f * f3) - f5) * i21) / (f5 - f3));
                                i = i21;
                            }
                            int i22 = i21 + i;
                            m2209d(i22);
                            int i23 = this.f4330b;
                            System.arraycopy(sArr3, i8 * i23, this.f4341m, this.f4347s * i23, i23 * i21);
                            m2205f(i, this.f4330b, this.f4341m, this.f4347s + i21, sArr3, i8 + i21, sArr3, i8);
                            this.f4347s += i22;
                            i8 += i;
                        }
                    }
                    if (this.f4336h + i8 > i7) {
                        break;
                    }
                    f5 = 1.0f;
                    i6 = 1;
                }
                int i24 = this.f4346r - i8;
                short[] sArr4 = this.f4339k;
                int i25 = this.f4330b;
                System.arraycopy(sArr4, i8 * i25, sArr4, 0, i25 * i24);
                this.f4346r = i24;
            }
            f5 = 1.0f;
        } else {
            m2206a(this.f4339k, 0, this.f4346r);
            this.f4346r = 0;
        }
        if (f4 == f5 || this.f4347s == i5) {
            return;
        }
        int i26 = this.f4329a;
        int i27 = (int) (i26 / f4);
        while (true) {
            if (i27 <= 16384 && i26 <= 16384) {
                break;
            }
            i27 /= 2;
            i26 /= 2;
        }
        int i28 = this.f4347s - i5;
        int i29 = this.f4348t + i28;
        int i30 = this.f4342n;
        if (i29 > i30) {
            int i31 = (i30 / 2) + i28 + i30;
            this.f4342n = i31;
            this.f4343o = Arrays.copyOf(this.f4343o, i31 * this.f4330b);
        }
        short[] sArr5 = this.f4341m;
        int i32 = this.f4330b;
        System.arraycopy(sArr5, i5 * i32, this.f4343o, this.f4348t * i32, i32 * i28);
        this.f4347s = i5;
        this.f4348t += i28;
        int i33 = 0;
        while (true) {
            int i34 = this.f4348t;
            int i35 = i34 - 1;
            if (i33 >= i35) {
                if (i35 == 0) {
                    return;
                }
                short[] sArr6 = this.f4343o;
                int i36 = this.f4330b;
                System.arraycopy(sArr6, i35 * i36, sArr6, 0, (i34 - i35) * i36);
                this.f4348t -= i35;
                return;
            }
            while (true) {
                i3 = this.f4344p + 1;
                int i37 = i3 * i27;
                i4 = this.f4345q;
                if (i37 <= i4 * i26) {
                    break;
                }
                m2209d(1);
                int i38 = 0;
                while (true) {
                    int i39 = this.f4330b;
                    if (i38 < i39) {
                        short[] sArr7 = this.f4341m;
                        int i40 = (this.f4347s * i39) + i38;
                        short[] sArr8 = this.f4343o;
                        int i41 = (i33 * i39) + i38;
                        short s = sArr8[i41];
                        short s2 = sArr8[i41 + i39];
                        int i42 = this.f4345q * i26;
                        int i43 = this.f4344p;
                        int i44 = i43 * i27;
                        int i45 = (i43 + 1) * i27;
                        int i46 = i45 - i42;
                        int i47 = i45 - i44;
                        sArr7[i40] = (short) ((((i47 - i46) * s2) + (s * i46)) / i47);
                        i38++;
                    }
                }
                this.f4345q++;
                this.f4347s++;
            }
            this.f4344p = i3;
            if (i3 == i26) {
                this.f4344p = 0;
                if (i4 != i27) {
                    throw new IllegalStateException();
                }
                this.f4345q = 0;
            }
            i33++;
        }
    }
}
