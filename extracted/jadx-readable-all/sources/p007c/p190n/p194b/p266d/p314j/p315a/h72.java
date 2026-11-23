package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class h72 extends j72 {

    /* JADX INFO: renamed from: c */
    public final byte[] f14777c;

    /* JADX INFO: renamed from: d */
    public int f14778d;

    /* JADX INFO: renamed from: e */
    public int f14779e;

    /* JADX INFO: renamed from: f */
    public int f14780f;

    /* JADX INFO: renamed from: g */
    public final int f14781g;

    /* JADX INFO: renamed from: h */
    public int f14782h;

    /* JADX INFO: renamed from: i */
    public int f14783i = Integer.MAX_VALUE;

    public /* synthetic */ h72(byte[] bArr, int i, int i2) {
        this.f14777c = bArr;
        this.f14778d = i2 + i;
        this.f14780f = i;
        this.f14781g = i;
    }

    /* JADX INFO: renamed from: A */
    public final byte m7068A() throws IOException {
        int i = this.f14780f;
        if (i == this.f14778d) {
            throw r82.m8260a();
        }
        byte[] bArr = this.f14777c;
        this.f14780f = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: B */
    public final void m7069B(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f14778d;
            int i3 = this.f14780f;
            if (i <= i2 - i3) {
                this.f14780f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw r82.m8260a();
        }
        throw r82.m8261b();
    }

    /* JADX INFO: renamed from: C */
    public final void m7070C() {
        int i = this.f14778d + this.f14779e;
        this.f14778d = i;
        int i2 = i - this.f14781g;
        int i3 = this.f14783i;
        if (i2 <= i3) {
            this.f14779e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f14779e = i4;
        this.f14778d = i - i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] >= 0) goto L33;
     */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m7071D() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f14780f
            int r1 = r5.f14778d
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f14777c
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f14780f = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.f14780f = r1
            return r0
        L6c:
            long r0 = r5.m7073F()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p314j.p315a.h72.m7071D():int");
    }

    /* JADX INFO: renamed from: E */
    public final long m7072E() throws IOException {
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        int i2 = this.f14780f;
        int i3 = this.f14778d;
        if (i3 != i2) {
            byte[] bArr = this.f14777c;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f14780f = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 < 0) {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j6 = (((long) bArr[i5]) << 28) ^ ((long) i9);
                            if (j6 >= 0) {
                                j5 = 266354560;
                            } else {
                                int i10 = i7 + 1;
                                long j7 = j6 ^ (((long) bArr[i7]) << 35);
                                if (j7 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j6 = j7 ^ (((long) bArr[i10]) << 42);
                                    if (j6 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j7 = j6 ^ (((long) bArr[i7]) << 49);
                                        if (j7 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j2 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j3 = j2;
                                                }
                                            }
                                        }
                                        i5 = i10;
                                    }
                                }
                                j3 = j4 ^ j7;
                                i5 = i10;
                            }
                            j2 = j6 ^ j5;
                        }
                        this.f14780f = i5;
                        return j3;
                    }
                    j2 = i8 ^ 16256;
                    i5 = i7;
                    j3 = j2;
                    this.f14780f = i5;
                    return j3;
                }
                i = i6 ^ (-128);
                j3 = i;
                this.f14780f = i5;
                return j3;
            }
        }
        return m7073F();
    }

    /* JADX INFO: renamed from: F */
    public final long m7073F() throws IOException {
        long j2 = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM7068A = m7068A();
            j2 |= ((long) (bM7068A & 127)) << i;
            if ((bM7068A & 128) == 0) {
                return j2;
            }
        }
        throw r82.m8262c();
    }

    /* JADX INFO: renamed from: G */
    public final int m7074G() throws IOException {
        int i = this.f14780f;
        if (this.f14778d - i < 4) {
            throw r82.m8260a();
        }
        byte[] bArr = this.f14777c;
        this.f14780f = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: H */
    public final long m7075H() throws IOException {
        int i = this.f14780f;
        if (this.f14778d - i < 8) {
            throw r82.m8260a();
        }
        byte[] bArr = this.f14777c;
        this.f14780f = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: a */
    public final void mo7076a(int i) {
        this.f14783i = i;
        m7070C();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: b */
    public final boolean mo7077b() throws IOException {
        return this.f14780f == this.f14778d;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: c */
    public final int mo7078c() {
        return this.f14780f - this.f14781g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: f */
    public final int mo7079f() throws IOException {
        if (mo7077b()) {
            this.f14782h = 0;
            return 0;
        }
        int iM7071D = m7071D();
        this.f14782h = iM7071D;
        if ((iM7071D >>> 3) != 0) {
            return iM7071D;
        }
        throw r82.m8263d();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: g */
    public final void mo7080g(int i) throws r82 {
        if (this.f14782h != i) {
            throw r82.m8264e();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: h */
    public final boolean mo7081h(int i) throws IOException {
        int iMo7079f;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f14778d - this.f14780f < 10) {
                while (i3 < 10) {
                    if (m7068A() < 0) {
                        i3++;
                    }
                }
                throw r82.m8262c();
            }
            while (i3 < 10) {
                byte[] bArr = this.f14777c;
                int i4 = this.f14780f;
                this.f14780f = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw r82.m8262c();
            return true;
        }
        if (i2 == 1) {
            m7069B(8);
            return true;
        }
        if (i2 == 2) {
            m7069B(m7071D());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw r82.m8265f();
            }
            m7069B(4);
            return true;
        }
        do {
            iMo7079f = mo7079f();
            if (iMo7079f == 0) {
                break;
            }
        } while (mo7081h(iMo7079f));
        mo7080g(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: i */
    public final double mo7082i() throws IOException {
        return Double.longBitsToDouble(m7075H());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: j */
    public final float mo7083j() throws IOException {
        return Float.intBitsToFloat(m7074G());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: k */
    public final long mo7084k() throws IOException {
        return m7072E();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: l */
    public final long mo7085l() throws IOException {
        return m7072E();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: m */
    public final int mo7086m() throws IOException {
        return m7071D();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: n */
    public final long mo7087n() throws IOException {
        return m7075H();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: o */
    public final int mo7088o() throws IOException {
        return m7074G();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: p */
    public final boolean mo7089p() throws IOException {
        return m7072E() != 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: q */
    public final String mo7090q() throws IOException {
        int iM7071D = m7071D();
        if (iM7071D > 0) {
            int i = this.f14778d;
            int i2 = this.f14780f;
            if (iM7071D <= i - i2) {
                String str = new String(this.f14777c, i2, iM7071D, p82.f17879a);
                this.f14780f += iM7071D;
                return str;
            }
        }
        if (iM7071D == 0) {
            return "";
        }
        if (iM7071D < 0) {
            throw r82.m8261b();
        }
        throw r82.m8260a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: r */
    public final String mo7091r() throws IOException {
        int iM7071D = m7071D();
        if (iM7071D > 0) {
            int i = this.f14778d;
            int i2 = this.f14780f;
            if (iM7071D <= i - i2) {
                String strM6160d = cb2.m6160d(this.f14777c, i2, iM7071D);
                this.f14780f += iM7071D;
                return strM6160d;
            }
        }
        if (iM7071D == 0) {
            return "";
        }
        if (iM7071D <= 0) {
            throw r82.m8261b();
        }
        throw r82.m8260a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: s */
    public final g72 mo7092s() throws IOException {
        int iM7071D = m7071D();
        if (iM7071D > 0) {
            int i = this.f14778d;
            int i2 = this.f14780f;
            if (iM7071D <= i - i2) {
                g72 g72VarM6939G = g72.m6939G(this.f14777c, i2, iM7071D);
                this.f14780f += iM7071D;
                return g72VarM6939G;
            }
        }
        if (iM7071D == 0) {
            return g72.f14513f;
        }
        if (iM7071D > 0) {
            int i3 = this.f14778d;
            int i4 = this.f14780f;
            if (iM7071D <= i3 - i4) {
                int i5 = iM7071D + i4;
                this.f14780f = i5;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f14777c, i4, i5);
                g72 g72Var = g72.f14513f;
                return new e72(bArrCopyOfRange);
            }
        }
        if (iM7071D <= 0) {
            throw r82.m8261b();
        }
        throw r82.m8260a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: t */
    public final int mo7093t() throws IOException {
        return m7071D();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: u */
    public final int mo7094u() throws IOException {
        return m7071D();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: v */
    public final int mo7095v() throws IOException {
        return m7074G();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: w */
    public final long mo7096w() throws IOException {
        return m7075H();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: x */
    public final int mo7097x() throws IOException {
        return j72.m7318d(m7071D());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: y */
    public final long mo7098y() throws IOException {
        return j72.m7319e(m7072E());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: z */
    public final int mo7099z(int i) throws r82 {
        if (i < 0) {
            throw r82.m8261b();
        }
        int i2 = (this.f14780f - this.f14781g) + i;
        int i3 = this.f14783i;
        if (i2 > i3) {
            throw r82.m8260a();
        }
        this.f14783i = i2;
        m7070C();
        return i3;
    }
}
