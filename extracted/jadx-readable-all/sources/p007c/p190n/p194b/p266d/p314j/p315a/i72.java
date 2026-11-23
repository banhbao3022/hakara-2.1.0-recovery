package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class i72 extends j72 {

    /* JADX INFO: renamed from: c */
    public final InputStream f15102c;

    /* JADX INFO: renamed from: d */
    public final byte[] f15103d;

    /* JADX INFO: renamed from: e */
    public int f15104e;

    /* JADX INFO: renamed from: f */
    public int f15105f;

    /* JADX INFO: renamed from: g */
    public int f15106g;

    /* JADX INFO: renamed from: h */
    public int f15107h;

    /* JADX INFO: renamed from: i */
    public int f15108i;

    /* JADX INFO: renamed from: j */
    public int f15109j = Integer.MAX_VALUE;

    public i72(InputStream inputStream) {
        Charset charset = p82.f17879a;
        this.f15102c = inputStream;
        this.f15103d = new byte[4096];
        this.f15104e = 0;
        this.f15106g = 0;
        this.f15108i = 0;
    }

    /* JADX INFO: renamed from: A */
    public final byte m7206A() throws IOException {
        if (this.f15106g == this.f15104e) {
            m7209D(1);
        }
        byte[] bArr = this.f15103d;
        int i = this.f15106g;
        this.f15106g = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: B */
    public final void m7207B(int i) throws IOException {
        int i2 = this.f15104e;
        int i3 = this.f15106g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f15106g = i3 + i;
            return;
        }
        if (i < 0) {
            throw r82.m8261b();
        }
        int i5 = this.f15108i;
        int i6 = i5 + i3;
        int i7 = this.f15109j;
        if (i6 + i > i7) {
            m7207B((i7 - i5) - i3);
            throw r82.m8260a();
        }
        this.f15108i = i6;
        this.f15104e = 0;
        this.f15106g = 0;
        while (i4 < i) {
            try {
                long j2 = i - i4;
                long jSkip = this.f15102c.skip(j2);
                if (jSkip < 0 || jSkip > j2) {
                    String strValueOf = String.valueOf(this.f15102c.getClass());
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 92);
                    sb.append(strValueOf);
                    sb.append("#skip returned invalid result: ");
                    sb.append(jSkip);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i4 += (int) jSkip;
                }
            } finally {
                this.f15108i += i4;
                m7208C();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i8 = this.f15104e;
        int i9 = i8 - this.f15106g;
        this.f15106g = i8;
        m7209D(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f15104e;
            if (i10 <= i11) {
                this.f15106g = i10;
                return;
            } else {
                i9 += i11;
                this.f15106g = i11;
                m7209D(1);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m7208C() {
        int i = this.f15104e + this.f15105f;
        this.f15104e = i;
        int i2 = this.f15108i + i;
        int i3 = this.f15109j;
        if (i2 <= i3) {
            this.f15105f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f15105f = i4;
        this.f15104e = i - i4;
    }

    /* JADX INFO: renamed from: D */
    public final void m7209D(int i) throws IOException {
        if (m7210E(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f15108i) - this.f15106g) {
            throw r82.m8260a();
        }
        throw new r82("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: E */
    public final boolean m7210E(int i) throws IOException {
        int i2 = this.f15106g;
        int i3 = this.f15104e;
        if (i2 + i <= i3) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i4 = this.f15108i;
        if (i > (Integer.MAX_VALUE - i4) - i2 || i4 + i2 + i > this.f15109j) {
            return false;
        }
        if (i2 > 0) {
            if (i3 > i2) {
                byte[] bArr = this.f15103d;
                System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
            }
            i4 = this.f15108i + i2;
            this.f15108i = i4;
            i3 = this.f15104e - i2;
            this.f15104e = i3;
            this.f15106g = 0;
        }
        int i5 = this.f15102c.read(this.f15103d, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
        if (i5 == 0 || i5 < -1 || i5 > 4096) {
            String strValueOf = String.valueOf(this.f15102c.getClass());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 91);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(i5);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        }
        if (i5 <= 0) {
            return false;
        }
        this.f15104e += i5;
        m7208C();
        if (this.f15104e >= i) {
            return true;
        }
        return m7210E(i);
    }

    /* JADX INFO: renamed from: F */
    public final byte[] m7211F(int i, boolean z) throws IOException {
        byte[] bArrM7212G = m7212G(i);
        if (bArrM7212G != null) {
            return bArrM7212G;
        }
        int i2 = this.f15106g;
        int i3 = this.f15104e;
        int i4 = i3 - i2;
        this.f15108i += i3;
        this.f15106g = 0;
        this.f15104e = 0;
        List<byte[]> listM7213H = m7213H(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f15103d, i2, bArr, 0, i4);
        for (byte[] bArr2 : (ArrayList) listM7213H) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: G */
    public final byte[] m7212G(int i) throws IOException {
        if (i == 0) {
            return p82.f17880b;
        }
        if (i < 0) {
            throw r82.m8261b();
        }
        int i2 = this.f15108i;
        int i3 = this.f15106g;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw new r82("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f15109j;
        if (i4 > i5) {
            m7207B((i5 - i2) - i3);
            throw r82.m8260a();
        }
        int i6 = this.f15104e - i3;
        int i7 = i - i6;
        if (i7 >= 4096 && i7 > this.f15102c.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f15103d, this.f15106g, bArr, 0, i6);
        this.f15108i += this.f15104e;
        this.f15106g = 0;
        this.f15104e = 0;
        while (i6 < i) {
            int i8 = this.f15102c.read(bArr, i6, i - i6);
            if (i8 == -1) {
                throw r82.m8260a();
            }
            this.f15108i += i8;
            i6 += i8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: H */
    public final List<byte[]> m7213H(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f15102c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw r82.m8260a();
                }
                this.f15108i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] >= 0) goto L33;
     */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m7214I() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f15106g
            int r1 = r5.f15104e
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f15103d
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f15106g = r3
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
            r5.f15106g = r1
            return r0
        L6c:
            long r0 = r5.m7216K()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p314j.p315a.i72.m7214I():int");
    }

    /* JADX INFO: renamed from: J */
    public final long m7215J() throws IOException {
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        int i2 = this.f15106g;
        int i3 = this.f15104e;
        if (i3 != i2) {
            byte[] bArr = this.f15103d;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f15106g = i4;
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
                        this.f15106g = i5;
                        return j3;
                    }
                    j2 = i8 ^ 16256;
                    i5 = i7;
                    j3 = j2;
                    this.f15106g = i5;
                    return j3;
                }
                i = i6 ^ (-128);
                j3 = i;
                this.f15106g = i5;
                return j3;
            }
        }
        return m7216K();
    }

    /* JADX INFO: renamed from: K */
    public final long m7216K() throws IOException {
        long j2 = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM7206A = m7206A();
            j2 |= ((long) (bM7206A & 127)) << i;
            if ((bM7206A & 128) == 0) {
                return j2;
            }
        }
        throw r82.m8262c();
    }

    /* JADX INFO: renamed from: L */
    public final int m7217L() throws IOException {
        int i = this.f15106g;
        if (this.f15104e - i < 4) {
            m7209D(4);
            i = this.f15106g;
        }
        byte[] bArr = this.f15103d;
        this.f15106g = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: M */
    public final long m7218M() throws IOException {
        int i = this.f15106g;
        if (this.f15104e - i < 8) {
            m7209D(8);
            i = this.f15106g;
        }
        byte[] bArr = this.f15103d;
        this.f15106g = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: a */
    public final void mo7076a(int i) {
        this.f15109j = i;
        m7208C();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: b */
    public final boolean mo7077b() throws IOException {
        return this.f15106g == this.f15104e && !m7210E(1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: c */
    public final int mo7078c() {
        return this.f15108i + this.f15106g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: f */
    public final int mo7079f() throws IOException {
        if (mo7077b()) {
            this.f15107h = 0;
            return 0;
        }
        int iM7214I = m7214I();
        this.f15107h = iM7214I;
        if ((iM7214I >>> 3) != 0) {
            return iM7214I;
        }
        throw r82.m8263d();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: g */
    public final void mo7080g(int i) throws r82 {
        if (this.f15107h != i) {
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
            if (this.f15104e - this.f15106g < 10) {
                while (i3 < 10) {
                    if (m7206A() < 0) {
                        i3++;
                    }
                }
                throw r82.m8262c();
            }
            while (i3 < 10) {
                byte[] bArr = this.f15103d;
                int i4 = this.f15106g;
                this.f15106g = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw r82.m8262c();
            return true;
        }
        if (i2 == 1) {
            m7207B(8);
            return true;
        }
        if (i2 == 2) {
            m7207B(m7214I());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw r82.m8265f();
            }
            m7207B(4);
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
        return Double.longBitsToDouble(m7218M());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: j */
    public final float mo7083j() throws IOException {
        return Float.intBitsToFloat(m7217L());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: k */
    public final long mo7084k() throws IOException {
        return m7215J();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: l */
    public final long mo7085l() throws IOException {
        return m7215J();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: m */
    public final int mo7086m() throws IOException {
        return m7214I();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: n */
    public final long mo7087n() throws IOException {
        return m7218M();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: o */
    public final int mo7088o() throws IOException {
        return m7217L();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: p */
    public final boolean mo7089p() throws IOException {
        return m7215J() != 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: q */
    public final String mo7090q() throws IOException {
        int iM7214I = m7214I();
        if (iM7214I > 0) {
            int i = this.f15104e;
            int i2 = this.f15106g;
            if (iM7214I <= i - i2) {
                String str = new String(this.f15103d, i2, iM7214I, p82.f17879a);
                this.f15106g += iM7214I;
                return str;
            }
        }
        if (iM7214I == 0) {
            return "";
        }
        if (iM7214I > this.f15104e) {
            return new String(m7211F(iM7214I, false), p82.f17879a);
        }
        m7209D(iM7214I);
        String str2 = new String(this.f15103d, this.f15106g, iM7214I, p82.f17879a);
        this.f15106g += iM7214I;
        return str2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: r */
    public final String mo7091r() throws IOException {
        byte[] bArrM7211F;
        int iM7214I = m7214I();
        int i = this.f15106g;
        int i2 = this.f15104e;
        if (iM7214I <= i2 - i && iM7214I > 0) {
            bArrM7211F = this.f15103d;
            this.f15106g = i + iM7214I;
        } else {
            if (iM7214I == 0) {
                return "";
            }
            if (iM7214I <= i2) {
                m7209D(iM7214I);
                bArrM7211F = this.f15103d;
                this.f15106g = iM7214I;
            } else {
                bArrM7211F = m7211F(iM7214I, false);
            }
            i = 0;
        }
        return cb2.m6160d(bArrM7211F, i, iM7214I);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: s */
    public final g72 mo7092s() throws IOException {
        int iM7214I = m7214I();
        int i = this.f15104e;
        int i2 = this.f15106g;
        if (iM7214I <= i - i2 && iM7214I > 0) {
            g72 g72VarM6939G = g72.m6939G(this.f15103d, i2, iM7214I);
            this.f15106g += iM7214I;
            return g72VarM6939G;
        }
        if (iM7214I == 0) {
            return g72.f14513f;
        }
        byte[] bArrM7212G = m7212G(iM7214I);
        if (bArrM7212G != null) {
            return g72.m6939G(bArrM7212G, 0, bArrM7212G.length);
        }
        int i3 = this.f15106g;
        int i4 = this.f15104e;
        int i5 = i4 - i3;
        this.f15108i += i4;
        this.f15106g = 0;
        this.f15104e = 0;
        List<byte[]> listM7213H = m7213H(iM7214I - i5);
        byte[] bArr = new byte[iM7214I];
        System.arraycopy(this.f15103d, i3, bArr, 0, i5);
        for (byte[] bArr2 : (ArrayList) listM7213H) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return new e72(bArr);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: t */
    public final int mo7093t() throws IOException {
        return m7214I();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: u */
    public final int mo7094u() throws IOException {
        return m7214I();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: v */
    public final int mo7095v() throws IOException {
        return m7217L();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: w */
    public final long mo7096w() throws IOException {
        return m7218M();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: x */
    public final int mo7097x() throws IOException {
        return j72.m7318d(m7214I());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: y */
    public final long mo7098y() throws IOException {
        return j72.m7319e(m7215J());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j72
    /* JADX INFO: renamed from: z */
    public final int mo7099z(int i) throws r82 {
        if (i < 0) {
            throw r82.m8261b();
        }
        int i2 = this.f15108i + this.f15106g + i;
        int i3 = this.f15109j;
        if (i2 > i3) {
            throw r82.m8260a();
        }
        this.f15109j = i2;
        m7208C();
        return i3;
    }
}
