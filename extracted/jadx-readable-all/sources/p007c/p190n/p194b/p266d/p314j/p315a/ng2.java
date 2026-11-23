package p007c.p190n.p194b.p266d.p314j.p315a;

import android.media.MediaCodec;
import java.io.IOException;
import java.nio.ByteBuffer;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ng2 implements hh2, ih2 {

    /* JADX INFO: renamed from: a */
    public final int f17093a;

    /* JADX INFO: renamed from: b */
    public jh2 f17094b;

    /* JADX INFO: renamed from: c */
    public int f17095c;

    /* JADX INFO: renamed from: d */
    public int f17096d;

    /* JADX INFO: renamed from: e */
    public ul2 f17097e;

    /* JADX INFO: renamed from: f */
    public long f17098f;

    /* JADX INFO: renamed from: g */
    public boolean f17099g = true;

    /* JADX INFO: renamed from: h */
    public boolean f17100h;

    public ng2(int i) {
        this.f17093a = i;
    }

    /* JADX INFO: renamed from: A */
    public void mo7701A() {
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: L */
    public final void mo7118L(int i) {
        this.f17095c = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: a */
    public final ih2 mo7120a() {
        return this;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: b */
    public final void mo7121b(ch2[] ch2VarArr, ul2 ul2Var, long j2) throws pg2 {
        C2622l.m5322V2(!this.f17100h);
        this.f17097e = ul2Var;
        this.f17099g = false;
        this.f17098f = j2;
        mo7861w(ch2VarArr, j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: c */
    public final int mo7122c() {
        return this.f17096d;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: d */
    public final void mo7123d(long j2) throws pg2 {
        this.f17100h = false;
        this.f17099g = false;
        mo7712x(j2, false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: e */
    public zn2 mo7124e() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: f */
    public final void mo7125f() throws pg2 {
        C2622l.m5322V2(this.f17096d == 1);
        this.f17096d = 2;
        mo7713y();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rg2
    /* JADX INFO: renamed from: g */
    public void mo7710g(int i, Object obj) throws pg2 {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: h */
    public final boolean mo7126h() {
        return this.f17099g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: i */
    public final ul2 mo7127i() {
        return this.f17097e;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: j */
    public final boolean mo7128j() {
        return this.f17100h;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: k */
    public final void mo7129k() {
        this.f17100h = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ih2
    /* JADX INFO: renamed from: l */
    public int mo7254l() throws pg2 {
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: m */
    public final void mo7130m() throws IOException {
        this.f17097e.f20374b.f20847m.m8514b(Integer.MIN_VALUE);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: n */
    public final void mo7131n() {
        C2622l.m5322V2(this.f17096d == 1);
        this.f17096d = 0;
        this.f17097e = null;
        this.f17100h = false;
        mo7701A();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: s */
    public final void mo7134s(jh2 jh2Var, ch2[] ch2VarArr, ul2 ul2Var, long j2, boolean z, long j3) throws pg2 {
        C2622l.m5322V2(this.f17096d == 0);
        this.f17094b = jh2Var;
        this.f17096d = 1;
        mo7711v(z);
        C2622l.m5322V2(!this.f17100h);
        this.f17097e = ul2Var;
        this.f17099g = false;
        this.f17098f = j3;
        mo7861w(ch2VarArr, j3);
        mo7712x(j2, z);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0228  */
    /* JADX INFO: renamed from: t */
    public final int m7860t(dh2 dh2Var, ui2 ui2Var, boolean z) {
        int i;
        int i2;
        byte b;
        int iM6393j;
        ul2 ul2Var = this.f17097e;
        vl2 vl2Var = ul2Var.f20374b;
        int i3 = ul2Var.f20373a;
        if (vl2Var.f20859y || vl2Var.m8569n()) {
            i = -4;
            i2 = -3;
        } else {
            km2 km2VarValueAt = vl2Var.f20853s.valueAt(i3);
            boolean z2 = vl2Var.f20837J;
            long j2 = vl2Var.f20834G;
            im2 im2Var = km2VarValueAt.f15982a;
            ch2 ch2Var = km2VarValueAt.f15988g;
            hm2 hm2Var = km2VarValueAt.f15983b;
            synchronized (im2Var) {
                if (im2Var.m7281a()) {
                    if (!z) {
                        ch2[] ch2VarArr = im2Var.f15309h;
                        int i4 = im2Var.f15312k;
                        if (ch2VarArr[i4] == ch2Var) {
                            if (ui2Var.f20358c != null) {
                                long j3 = im2Var.f15307f[i4];
                                ui2Var.f20359d = j3;
                                ui2Var.f18310a = im2Var.f15306e[i4];
                                hm2Var.f14913a = im2Var.f15305d[i4];
                                hm2Var.f14914b = im2Var.f15304c[i4];
                                hm2Var.f14916d = im2Var.f15308g[i4];
                                im2Var.f15314m = Math.max(im2Var.f15314m, j3);
                                int i5 = im2Var.f15310i - 1;
                                im2Var.f15310i = i5;
                                int i6 = im2Var.f15312k + 1;
                                im2Var.f15312k = i6;
                                im2Var.f15311j++;
                                if (i6 == im2Var.f15302a) {
                                    im2Var.f15312k = 0;
                                    i6 = 0;
                                }
                                hm2Var.f14915c = i5 > 0 ? im2Var.f15304c[i6] : ((long) hm2Var.f14913a) + hm2Var.f14914b;
                                b = -4;
                            } else {
                                b = -3;
                            }
                        }
                    }
                    dh2Var.f13276a = im2Var.f15309h[im2Var.f15312k];
                    b = -5;
                } else if (z2) {
                    ui2Var.f18310a = 4;
                    b = -4;
                } else {
                    ch2 ch2Var2 = im2Var.f15318q;
                    if (ch2Var2 == null || (!z && ch2Var2 == ch2Var)) {
                        b = -3;
                    } else {
                        dh2Var.f13276a = ch2Var2;
                        b = -5;
                    }
                }
            }
            if (b == -5) {
                km2VarValueAt.f15988g = dh2Var.f13276a;
                i = -4;
                i2 = -5;
            } else if (b != -4) {
                i = -4;
                i2 = -3;
            } else {
                if (!ui2Var.m8208a()) {
                    if (ui2Var.f20359d < j2) {
                        ui2Var.f18310a |= Integer.MIN_VALUE;
                    }
                    if (ui2Var.m8209b(1073741824)) {
                        hm2 hm2Var2 = km2VarValueAt.f15983b;
                        long j4 = hm2Var2.f14914b;
                        km2VarValueAt.f15984c.m6384a(1);
                        km2VarValueAt.m7524j(j4, km2VarValueAt.f15984c.f13340a, 1);
                        long j5 = j4 + 1;
                        byte b2 = km2VarValueAt.f15984c.f13340a[0];
                        int i7 = b2 & 128;
                        int i8 = b2 & 127;
                        si2 si2Var = ui2Var.f20357b;
                        if (si2Var.f19569a == null) {
                            si2Var.f19569a = new byte[16];
                        }
                        km2VarValueAt.m7524j(j5, si2Var.f19569a, i8);
                        long j6 = j5 + ((long) i8);
                        if (i7 != 0) {
                            km2VarValueAt.f15984c.m6384a(2);
                            km2VarValueAt.m7524j(j6, km2VarValueAt.f15984c.f13340a, 2);
                            j6 += 2;
                            iM6393j = km2VarValueAt.f15984c.m6393j();
                        } else {
                            iM6393j = 1;
                        }
                        si2 si2Var2 = ui2Var.f20357b;
                        int[] iArr = si2Var2.f19572d;
                        if (iArr == null || iArr.length < iM6393j) {
                            iArr = new int[iM6393j];
                        }
                        int[] iArr2 = si2Var2.f19573e;
                        if (iArr2 == null || iArr2.length < iM6393j) {
                            iArr2 = new int[iM6393j];
                        }
                        if (i7 != 0) {
                            int i9 = iM6393j * 6;
                            km2VarValueAt.f15984c.m6384a(i9);
                            km2VarValueAt.m7524j(j6, km2VarValueAt.f15984c.f13340a, i9);
                            j6 += (long) i9;
                            km2VarValueAt.f15984c.m6389f(0);
                            for (int i10 = 0; i10 < iM6393j; i10++) {
                                iArr[i10] = km2VarValueAt.f15984c.m6393j();
                                iArr2[i10] = km2VarValueAt.f15984c.m6397n();
                            }
                        } else {
                            iArr[0] = 0;
                            iArr2[0] = hm2Var2.f14913a - ((int) (j6 - hm2Var2.f14914b));
                        }
                        kj2 kj2Var = hm2Var2.f14916d;
                        si2 si2Var3 = ui2Var.f20357b;
                        byte[] bArr = kj2Var.f15966b;
                        byte[] bArr2 = si2Var3.f19569a;
                        si2Var3.f19574f = iM6393j;
                        si2Var3.f19572d = iArr;
                        si2Var3.f19573e = iArr2;
                        si2Var3.f19570b = bArr;
                        si2Var3.f19569a = bArr2;
                        si2Var3.f19571c = 1;
                        int i11 = jo2.f15673a;
                        if (i11 >= 16) {
                            MediaCodec.CryptoInfo cryptoInfo = si2Var3.f19575g;
                            cryptoInfo.numSubSamples = iM6393j;
                            cryptoInfo.numBytesOfClearData = iArr;
                            cryptoInfo.numBytesOfEncryptedData = iArr2;
                            cryptoInfo.key = bArr;
                            cryptoInfo.iv = bArr2;
                            cryptoInfo.mode = 1;
                            if (i11 >= 24) {
                                ri2 ri2Var = si2Var3.f19576h;
                                ri2Var.f18846b.set(0, 0);
                                ri2Var.f18845a.setPattern(ri2Var.f18846b);
                            }
                        }
                        long j7 = hm2Var2.f14914b;
                        int i12 = (int) (j6 - j7);
                        hm2Var2.f14914b = j7 + ((long) i12);
                        hm2Var2.f14913a -= i12;
                    }
                    int i13 = km2VarValueAt.f15983b.f14913a;
                    ByteBuffer byteBuffer = ui2Var.f20358c;
                    if (byteBuffer == null) {
                        ui2Var.m8507d(i13);
                        throw null;
                    }
                    int iCapacity = byteBuffer.capacity();
                    int iPosition = ui2Var.f20358c.position() + i13;
                    if (iCapacity < iPosition) {
                        ui2Var.m8507d(iPosition);
                        throw null;
                    }
                    hm2 hm2Var3 = km2VarValueAt.f15983b;
                    long j8 = hm2Var3.f14914b;
                    ByteBuffer byteBuffer2 = ui2Var.f20358c;
                    int i14 = hm2Var3.f14913a;
                    km2VarValueAt.m7525k(j8);
                    while (i14 > 0) {
                        int i15 = (int) (j8 - km2VarValueAt.f15986e.f15660a);
                        int iMin = Math.min(i14, 65536 - i15);
                        en2 en2Var = km2VarValueAt.f15986e.f15663d;
                        byteBuffer2.put(en2Var.f13625a, i15, iMin);
                        j8 += (long) iMin;
                        i14 -= iMin;
                        if (j8 == km2VarValueAt.f15986e.f15661b) {
                            km2VarValueAt.f15992k.m7531b(en2Var);
                            jm2 jm2Var = km2VarValueAt.f15986e;
                            jm2Var.f15663d = null;
                            km2VarValueAt.f15986e = jm2Var.f15664e;
                        }
                    }
                    km2VarValueAt.m7525k(km2VarValueAt.f15983b.f14915c);
                }
                i = -4;
                i2 = -4;
            }
        }
        if (i2 == i) {
            if (ui2Var.m8208a()) {
                this.f17099g = true;
                if (this.f17100h) {
                    return i;
                }
                return -3;
            }
            ui2Var.f20359d += this.f17098f;
        } else if (i2 == -5) {
            ch2 ch2Var3 = dh2Var.f13276a;
            long j9 = ch2Var3.f13006B;
            if (j9 != Long.MAX_VALUE) {
                dh2Var.f13276a = new ch2(ch2Var3.f13011f, ch2Var3.f13015j, ch2Var3.f13016k, ch2Var3.f13013h, ch2Var3.f13012g, ch2Var3.f13017l, ch2Var3.f13020o, ch2Var3.f13021p, ch2Var3.f13022q, ch2Var3.f13023r, ch2Var3.f13024s, ch2Var3.f13026u, ch2Var3.f13025t, ch2Var3.f13027v, ch2Var3.f13028w, ch2Var3.f13029x, ch2Var3.f13030y, ch2Var3.f13031z, ch2Var3.f13005A, ch2Var3.f13007C, ch2Var3.f13008D, ch2Var3.f13009E, j9 + this.f17098f, ch2Var3.f13018m, ch2Var3.f13019n, ch2Var3.f13014i);
                return -5;
            }
        }
        return i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    /* JADX INFO: renamed from: u */
    public final void mo7135u() throws pg2 {
        C2622l.m5322V2(this.f17096d == 2);
        this.f17096d = 1;
        mo7714z();
    }

    /* JADX INFO: renamed from: v */
    public void mo7711v(boolean z) throws pg2 {
    }

    /* JADX INFO: renamed from: w */
    public void mo7861w(ch2[] ch2VarArr, long j2) throws pg2 {
    }

    /* JADX INFO: renamed from: x */
    public void mo7712x(long j2, boolean z) throws pg2 {
        throw null;
    }

    /* JADX INFO: renamed from: y */
    public void mo7713y() throws pg2 {
    }

    /* JADX INFO: renamed from: z */
    public void mo7714z() throws pg2 {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hh2
    public final int zza() {
        return this.f17093a;
    }
}
