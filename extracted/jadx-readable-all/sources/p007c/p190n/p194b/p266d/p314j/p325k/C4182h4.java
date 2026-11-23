package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: c.n.b.d.j.k.h4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4182h4 extends AbstractC4154f4 {

    /* JADX INFO: renamed from: d */
    public final byte[] f23215d;

    /* JADX INFO: renamed from: e */
    public int f23216e;

    /* JADX INFO: renamed from: f */
    public int f23217f;

    /* JADX INFO: renamed from: g */
    public int f23218g;

    /* JADX INFO: renamed from: h */
    public int f23219h;

    /* JADX INFO: renamed from: i */
    public int f23220i;

    public C4182h4(byte[] bArr, int i) {
        super(null);
        this.f23220i = Integer.MAX_VALUE;
        this.f23215d = bArr;
        this.f23216e = i + 0;
        this.f23218g = 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: A */
    public final int mo9599A() {
        return this.f23218g + 0;
    }

    /* JADX INFO: renamed from: B */
    public final byte m9821B() throws IOException {
        int i = this.f23218g;
        if (i == this.f23216e) {
            throw C4239l5.m9995a();
        }
        byte[] bArr = this.f23215d;
        this.f23218g = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: C */
    public final void m9822C(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f23216e;
            int i3 = this.f23218g;
            if (i <= i2 - i3) {
                this.f23218g = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw C4239l5.m9995a();
        }
        throw C4239l5.m9996b();
    }

    /* JADX INFO: renamed from: D */
    public final long m9823D() throws IOException {
        long j2 = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM9821B = m9821B();
            j2 |= ((long) (bM9821B & 127)) << i;
            if ((bM9821B & 128) == 0) {
                return j2;
            }
        }
        throw C4239l5.m9997c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m9824E() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f23218g
            int r1 = r5.f23216e
            if (r1 == r0) goto L6b
            byte[] r2 = r5.f23215d
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.f23218g = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.f23218g = r1
            return r0
        L6b:
            long r0 = r5.m9823D()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p314j.p325k.C4182h4.m9824E():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L40;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m9825F() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f23218g
            int r1 = r11.f23216e
            if (r1 == r0) goto Lb8
            byte[] r2 = r11.f23215d
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r11.f23218g = r3
            long r0 = (long) r0
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto Lb8
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L25
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
        L22:
            long r2 = (long) r0
            goto Lb5
        L25:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L36
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto Lb5
        L36:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L44
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L22
        L44:
            long r3 = (long) r0
            int r0 = r1 + 1
            r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L5b
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L57:
            long r2 = r3 ^ r1
            r1 = r0
            goto Lb5
        L5b:
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L70
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L6d:
            long r2 = r3 ^ r5
            goto Lb5
        L70:
            int r0 = r1 + 1
            r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L83
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L57
        L83:
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L96
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L6d
        L96:
            int r0 = r1 + 1
            r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto Lb3
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto Lb8
            goto Lb4
        Lb3:
            r1 = r0
        Lb4:
            r2 = r3
        Lb5:
            r11.f23218g = r1
            return r2
        Lb8:
            long r0 = r11.m9823D()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p314j.p325k.C4182h4.m9825F():long");
    }

    /* JADX INFO: renamed from: G */
    public final int m9826G() throws IOException {
        int i = this.f23218g;
        if (this.f23216e - i < 4) {
            throw C4239l5.m9995a();
        }
        byte[] bArr = this.f23215d;
        this.f23218g = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: H */
    public final long m9827H() throws IOException {
        int i = this.f23218g;
        if (this.f23216e - i < 8) {
            throw C4239l5.m9995a();
        }
        byte[] bArr = this.f23215d;
        this.f23218g = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: I */
    public final void m9828I() {
        int i = this.f23216e + this.f23217f;
        this.f23216e = i;
        int i2 = i + 0;
        int i3 = this.f23220i;
        if (i2 <= i3) {
            this.f23217f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f23217f = i4;
        this.f23216e = i - i4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: a */
    public final int mo9600a() throws IOException {
        if (mo9622z()) {
            this.f23219h = 0;
            return 0;
        }
        int iM9824E = m9824E();
        this.f23219h = iM9824E;
        if ((iM9824E >>> 3) != 0) {
            return iM9824E;
        }
        throw C4239l5.m9998d();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: d */
    public final void mo9601d(int i) throws C4239l5 {
        if (this.f23219h != i) {
            throw C4239l5.m9999e();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: e */
    public final double mo9602e() throws IOException {
        return Double.longBitsToDouble(m9827H());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: f */
    public final boolean mo9603f(int i) throws IOException {
        int iMo9600a;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f23216e - this.f23218g < 10) {
                while (i3 < 10) {
                    if (m9821B() < 0) {
                        i3++;
                    }
                }
                throw C4239l5.m9997c();
            }
            while (i3 < 10) {
                byte[] bArr = this.f23215d;
                int i4 = this.f23218g;
                this.f23218g = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw C4239l5.m9997c();
            return true;
        }
        if (i2 == 1) {
            m9822C(8);
            return true;
        }
        if (i2 == 2) {
            m9822C(m9824E());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw C4239l5.m10000f();
            }
            m9822C(4);
            return true;
        }
        do {
            iMo9600a = mo9600a();
            if (iMo9600a == 0) {
                break;
            }
        } while (mo9603f(iMo9600a));
        mo9601d(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: g */
    public final float mo9604g() throws IOException {
        return Float.intBitsToFloat(m9826G());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: h */
    public final int mo9605h(int i) throws C4239l5 {
        if (i < 0) {
            throw C4239l5.m9996b();
        }
        int iMo9599A = mo9599A() + i;
        int i2 = this.f23220i;
        if (iMo9599A > i2) {
            throw C4239l5.m9995a();
        }
        this.f23220i = iMo9599A;
        m9828I();
        return i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: i */
    public final long mo9606i() throws IOException {
        return m9825F();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: j */
    public final void mo9607j(int i) {
        this.f23220i = i;
        m9828I();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: l */
    public final long mo9608l() throws IOException {
        return m9825F();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: m */
    public final int mo9609m() throws IOException {
        return m9824E();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: n */
    public final long mo9610n() throws IOException {
        return m9827H();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: o */
    public final int mo9611o() throws IOException {
        return m9826G();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: p */
    public final boolean mo9612p() throws IOException {
        return m9825F() != 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: q */
    public final String mo9613q() throws IOException {
        int iM9824E = m9824E();
        if (iM9824E > 0 && iM9824E <= this.f23216e - this.f23218g) {
            String str = new String(this.f23215d, this.f23218g, iM9824E, C4127d5.f23112a);
            this.f23218g += iM9824E;
            return str;
        }
        if (iM9824E == 0) {
            return "";
        }
        if (iM9824E < 0) {
            throw C4239l5.m9996b();
        }
        throw C4239l5.m9995a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: r */
    public final String mo9614r() throws IOException {
        int iM9824E = m9824E();
        if (iM9824E > 0) {
            int i = this.f23216e;
            int i2 = this.f23218g;
            if (iM9824E <= i - i2) {
                String strMo10292c = C4367u7.f23503a.mo10292c(this.f23215d, i2, iM9824E);
                this.f23218g += iM9824E;
                return strMo10292c;
            }
        }
        if (iM9824E == 0) {
            return "";
        }
        if (iM9824E <= 0) {
            throw C4239l5.m9996b();
        }
        throw C4239l5.m9995a();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: s */
    public final AbstractC4402x3 mo9615s() throws IOException {
        byte[] bArrCopyOfRange;
        int iM9824E = m9824E();
        if (iM9824E > 0) {
            int i = this.f23216e;
            int i2 = this.f23218g;
            if (iM9824E <= i - i2) {
                AbstractC4402x3 abstractC4402x3M10331m = AbstractC4402x3.m10331m(this.f23215d, i2, iM9824E);
                this.f23218g += iM9824E;
                return abstractC4402x3M10331m;
            }
        }
        if (iM9824E == 0) {
            return AbstractC4402x3.f23614f;
        }
        if (iM9824E > 0) {
            int i3 = this.f23216e;
            int i4 = this.f23218g;
            if (iM9824E <= i3 - i4) {
                int i5 = iM9824E + i4;
                this.f23218g = i5;
                bArrCopyOfRange = Arrays.copyOfRange(this.f23215d, i4, i5);
            } else {
                if (iM9824E <= 0) {
                    throw C4239l5.m9995a();
                }
                if (iM9824E == 0) {
                    throw C4239l5.m9996b();
                }
                bArrCopyOfRange = C4127d5.f23113b;
            }
        } else {
            if (iM9824E <= 0) {
                throw C4239l5.m9995a();
            }
            if (iM9824E == 0) {
                throw C4239l5.m9996b();
            }
            bArrCopyOfRange = C4127d5.f23113b;
        }
        AbstractC4402x3 abstractC4402x3 = AbstractC4402x3.f23614f;
        return new C4126d4(bArrCopyOfRange);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: t */
    public final int mo9616t() throws IOException {
        return m9824E();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: u */
    public final int mo9617u() throws IOException {
        return m9824E();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: v */
    public final int mo9618v() throws IOException {
        return m9826G();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: w */
    public final long mo9619w() throws IOException {
        return m9827H();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: x */
    public final int mo9620x() throws IOException {
        return AbstractC4154f4.m9598k(m9824E());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: y */
    public final long mo9621y() throws IOException {
        return AbstractC4154f4.m9596b(m9825F());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4154f4
    /* JADX INFO: renamed from: z */
    public final boolean mo9622z() throws IOException {
        return this.f23218g == this.f23216e;
    }
}
