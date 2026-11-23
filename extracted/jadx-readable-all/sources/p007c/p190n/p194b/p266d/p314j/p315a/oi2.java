package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class oi2 {

    /* JADX INFO: renamed from: a */
    public final int f17634a;

    /* JADX INFO: renamed from: b */
    public final int f17635b;

    /* JADX INFO: renamed from: c */
    public final int f17636c;

    /* JADX INFO: renamed from: d */
    public final int f17637d;

    /* JADX INFO: renamed from: e */
    public final int f17638e;

    /* JADX INFO: renamed from: f */
    public final short[] f17639f;

    /* JADX INFO: renamed from: g */
    public int f17640g;

    /* JADX INFO: renamed from: h */
    public short[] f17641h;

    /* JADX INFO: renamed from: i */
    public int f17642i;

    /* JADX INFO: renamed from: j */
    public short[] f17643j;

    /* JADX INFO: renamed from: k */
    public int f17644k;

    /* JADX INFO: renamed from: l */
    public short[] f17645l;

    /* JADX INFO: renamed from: q */
    public int f17650q;

    /* JADX INFO: renamed from: r */
    public int f17651r;

    /* JADX INFO: renamed from: s */
    public int f17652s;

    /* JADX INFO: renamed from: t */
    public int f17653t;

    /* JADX INFO: renamed from: v */
    public int f17655v;

    /* JADX INFO: renamed from: w */
    public int f17656w;

    /* JADX INFO: renamed from: x */
    public int f17657x;

    /* JADX INFO: renamed from: m */
    public int f17646m = 0;

    /* JADX INFO: renamed from: n */
    public int f17647n = 0;

    /* JADX INFO: renamed from: u */
    public int f17654u = 0;

    /* JADX INFO: renamed from: o */
    public float f17648o = 1.0f;

    /* JADX INFO: renamed from: p */
    public float f17649p = 1.0f;

    public oi2(int i, int i2) {
        this.f17634a = i;
        this.f17635b = i2;
        this.f17636c = i / 400;
        int i3 = i / 65;
        this.f17637d = i3;
        int i4 = i3 + i3;
        this.f17638e = i4;
        this.f17639f = new short[i4];
        this.f17640g = i4;
        int i5 = i2 * i4;
        this.f17641h = new short[i5];
        this.f17642i = i4;
        this.f17643j = new short[i5];
        this.f17644k = i4;
        this.f17645l = new short[i5];
    }

    /* JADX INFO: renamed from: g */
    public static void m8019g(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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
    public final void m8020a(int i) {
        int i2 = this.f17651r;
        int i3 = this.f17642i;
        if (i2 + i > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.f17642i = i4;
            this.f17643j = Arrays.copyOf(this.f17643j, i4 * this.f17635b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8021b(int i) {
        int i2 = this.f17650q;
        int i3 = this.f17640g;
        if (i2 + i > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.f17640g = i4;
            this.f17641h = Arrays.copyOf(this.f17641h, i4 * this.f17635b);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8022c(short[] sArr, int i, int i2) {
        m8020a(i2);
        int i3 = this.f17635b;
        System.arraycopy(sArr, i * i3, this.f17643j, this.f17651r * i3, i3 * i2);
        this.f17651r += i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m8023d(short[] sArr, int i, int i2) {
        int i3 = this.f17638e / i2;
        int i4 = this.f17635b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[outline.m1591m(i7, i5, i6, i9)];
            }
            this.f17639f[i7] = (short) (i8 / i5);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m8024e(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f17635b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            int i11 = i9 * i7;
            int i12 = i5 * i2;
            if (i11 < i12) {
                i5 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i6;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i6 = i2;
            }
            i2++;
        }
        this.f17656w = i5 / i7;
        this.f17657x = i8 / i6;
        return i7;
    }

    /* JADX INFO: renamed from: f */
    public final void m8025f() {
        int iM8024e;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f17651r;
        float f = this.f17648o / this.f17649p;
        double d = f;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = this.f17650q;
            if (i10 >= this.f17638e) {
                int i11 = 0;
                while (true) {
                    int i12 = this.f17653t;
                    if (i12 > 0) {
                        int iMin = Math.min(this.f17638e, i12);
                        m8022c(this.f17641h, i11, iMin);
                        this.f17653t -= iMin;
                        i11 += iMin;
                    } else {
                        short[] sArr = this.f17641h;
                        int i13 = this.f17634a;
                        int i14 = i13 > 4000 ? i13 / 4000 : 1;
                        if (this.f17635b == i9 && i14 == i9) {
                            iM8024e = m8024e(sArr, i11, this.f17636c, this.f17637d);
                        } else {
                            m8023d(sArr, i11, i14);
                            int iM8024e2 = m8024e(this.f17639f, 0, this.f17636c / i14, this.f17637d / i14);
                            if (i14 != i9) {
                                int i15 = iM8024e2 * i14;
                                int i16 = i14 * 4;
                                int i17 = i15 - i16;
                                int i18 = i15 + i16;
                                int i19 = this.f17636c;
                                if (i17 < i19) {
                                    i17 = i19;
                                }
                                int i20 = this.f17637d;
                                if (i18 > i20) {
                                    i18 = i20;
                                }
                                if (this.f17635b == i9) {
                                    iM8024e = m8024e(sArr, i11, i17, i18);
                                } else {
                                    m8023d(sArr, i11, i9);
                                    iM8024e = m8024e(this.f17639f, 0, i17, i18);
                                }
                            } else {
                                iM8024e = iM8024e2;
                            }
                        }
                        int i21 = this.f17656w;
                        int i22 = (i21 == 0 || (i3 = this.f17654u) == 0 || this.f17657x > i21 * 3 || i21 + i21 <= this.f17655v * 3) ? iM8024e : i3;
                        this.f17655v = i21;
                        this.f17654u = iM8024e;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f17641h;
                            if (f >= 2.0f) {
                                i2 = (int) (i22 / ((-1.0f) + f));
                            } else {
                                this.f17653t = (int) (((2.0f - f) * i22) / ((-1.0f) + f));
                                i2 = i22;
                            }
                            m8020a(i2);
                            int i23 = i2;
                            m8019g(i2, this.f17635b, this.f17643j, this.f17651r, sArr2, i11, sArr2, i11 + i22);
                            this.f17651r += i23;
                            i11 = i22 + i23 + i11;
                        } else {
                            int i24 = i22;
                            short[] sArr3 = this.f17641h;
                            if (f < 0.5f) {
                                i = (int) ((i24 * f) / (1.0f - f));
                            } else {
                                this.f17653t = (int) ((((f + f) - 1.0f) * i24) / (1.0f - f));
                                i = i24;
                            }
                            int i25 = i24 + i;
                            m8020a(i25);
                            int i26 = this.f17635b;
                            System.arraycopy(sArr3, i11 * i26, this.f17643j, this.f17651r * i26, i26 * i24);
                            m8019g(i, this.f17635b, this.f17643j, this.f17651r + i24, sArr3, i24 + i11, sArr3, i11);
                            this.f17651r += i25;
                            i11 += i;
                        }
                    }
                    if (this.f17638e + i11 > i10) {
                        break;
                    } else {
                        i9 = 1;
                    }
                }
                int i27 = this.f17650q - i11;
                short[] sArr4 = this.f17641h;
                int i28 = this.f17635b;
                System.arraycopy(sArr4, i11 * i28, sArr4, 0, i28 * i27);
                this.f17650q = i27;
            }
        } else {
            m8022c(this.f17641h, 0, this.f17650q);
            this.f17650q = 0;
        }
        float f2 = this.f17649p;
        if (f2 == 1.0f || this.f17651r == i8) {
            return;
        }
        int i29 = this.f17634a;
        int i30 = (int) (i29 / f2);
        while (true) {
            if (i30 <= 16384 && i29 <= 16384) {
                break;
            }
            i30 /= 2;
            i29 /= 2;
        }
        int i31 = this.f17651r - i8;
        int i32 = this.f17652s;
        int i33 = this.f17644k;
        if (i32 + i31 > i33) {
            int i34 = (i33 / 2) + i31 + i33;
            this.f17644k = i34;
            this.f17645l = Arrays.copyOf(this.f17645l, i34 * this.f17635b);
        }
        short[] sArr5 = this.f17643j;
        int i35 = this.f17635b;
        System.arraycopy(sArr5, i8 * i35, this.f17645l, this.f17652s * i35, i35 * i31);
        this.f17651r = i8;
        this.f17652s += i31;
        int i36 = 0;
        while (true) {
            i4 = this.f17652s;
            i5 = i4 - 1;
            if (i36 >= i5) {
                break;
            }
            while (true) {
                i6 = this.f17646m + 1;
                i7 = this.f17647n;
                if (i6 * i30 <= i7 * i29) {
                    break;
                }
                m8020a(1);
                int i37 = 0;
                while (true) {
                    int i38 = this.f17635b;
                    if (i37 < i38) {
                        short[] sArr6 = this.f17643j;
                        int i39 = this.f17651r;
                        short[] sArr7 = this.f17645l;
                        int i40 = (i36 * i38) + i37;
                        short s = sArr7[i40];
                        short s2 = sArr7[i40 + i38];
                        int i41 = this.f17647n;
                        int i42 = this.f17646m;
                        int i43 = (i42 + 1) * i30;
                        int i44 = i43 - (i41 * i29);
                        int i45 = i43 - (i42 * i30);
                        sArr6[(i39 * i38) + i37] = (short) ((((i45 - i44) * s2) + (s * i44)) / i45);
                        i37++;
                    }
                }
                this.f17647n++;
                this.f17651r++;
            }
            this.f17646m = i6;
            if (i6 == i29) {
                this.f17646m = 0;
                C2622l.m5322V2(i7 == i30);
                this.f17647n = 0;
            }
            i36++;
        }
        if (i5 != 0) {
            short[] sArr8 = this.f17645l;
            int i46 = this.f17635b;
            System.arraycopy(sArr8, i5 * i46, sArr8, 0, (i4 - i5) * i46);
            this.f17652s -= i5;
        }
    }
}
