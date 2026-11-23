package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class km2 implements lj2 {

    /* JADX INFO: renamed from: e */
    public jm2 f15986e;

    /* JADX INFO: renamed from: f */
    public jm2 f15987f;

    /* JADX INFO: renamed from: g */
    public ch2 f15988g;

    /* JADX INFO: renamed from: h */
    public long f15989h;

    /* JADX INFO: renamed from: j */
    public vl2 f15991j;

    /* JADX INFO: renamed from: k */
    public final kn2 f15992k;

    /* JADX INFO: renamed from: a */
    public final im2 f15982a = new im2();

    /* JADX INFO: renamed from: b */
    public final hm2 f15983b = new hm2();

    /* JADX INFO: renamed from: c */
    public final do2 f15984c = new do2(32);

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f15985d = new AtomicInteger();

    /* JADX INFO: renamed from: i */
    public int f15990i = 65536;

    public km2(kn2 kn2Var, byte[] bArr) {
        this.f15992k = kn2Var;
        jm2 jm2Var = new jm2(0L, 65536);
        this.f15986e = jm2Var;
        this.f15987f = jm2Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m7515a(ch2 ch2Var) {
        boolean z;
        if (ch2Var == null) {
            ch2Var = null;
        }
        im2 im2Var = this.f15982a;
        synchronized (im2Var) {
            z = true;
            try {
                if (ch2Var == null) {
                    im2Var.f15317p = true;
                } else {
                    im2Var.f15317p = false;
                    if (!jo2.m7369a(ch2Var, im2Var.f15318q)) {
                        im2Var.f15318q = ch2Var;
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        vl2 vl2Var = this.f15991j;
        if (vl2Var == null || !z) {
            return;
        }
        vl2Var.f20852r.post(vl2Var.f20850p);
    }

    /* JADX INFO: renamed from: b */
    public final void m7516b(do2 do2Var, int i) {
        if (!m7526l()) {
            do2Var.m6389f(do2Var.f13341b + i);
            return;
        }
        while (i > 0) {
            int iM7529o = m7529o(i);
            do2Var.m6391h(this.f15987f.f15663d.f13625a, this.f15990i, iM7529o);
            this.f15990i += iM7529o;
            this.f15989h += (long) iM7529o;
            i -= iM7529o;
        }
        m7527m();
    }

    /* JADX INFO: renamed from: c */
    public final void m7517c(long j2, int i, int i2, int i3, kj2 kj2Var) {
        if (!m7526l()) {
            im2 im2Var = this.f15982a;
            synchronized (im2Var) {
                im2Var.f15315n = Math.max(im2Var.f15315n, j2);
            }
        } else {
            try {
                this.f15982a.m7282b(j2, i, this.f15989h - ((long) i2), i2, kj2Var);
            } finally {
                m7527m();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m7518d(bj2 bj2Var, int i, boolean z) throws InterruptedException, IOException {
        if (!m7526l()) {
            int iMin = Math.min(bj2Var.f12713g, i);
            bj2Var.m6025e(iMin);
            if (iMin == 0) {
                iMin = bj2Var.m6026f(bj2.f12707a, 0, Math.min(i, 4096), 0, true);
            }
            bj2Var.m6027g(iMin);
            if (iMin != -1) {
                return iMin;
            }
            throw new EOFException();
        }
        try {
            int iM7529o = m7529o(i);
            byte[] bArr = this.f15987f.f15663d.f13625a;
            int i2 = this.f15990i;
            int i3 = bj2Var.f12713g;
            int iM6026f = 0;
            if (i3 != 0) {
                int iMin2 = Math.min(i3, iM7529o);
                System.arraycopy(bj2Var.f12711e, 0, bArr, i2, iMin2);
                bj2Var.m6025e(iMin2);
                iM6026f = iMin2;
            }
            if (iM6026f == 0) {
                iM6026f = bj2Var.m6026f(bArr, i2, iM7529o, 0, true);
            }
            bj2Var.m6027g(iM6026f);
            if (iM6026f == -1) {
                throw new EOFException();
            }
            this.f15990i += iM6026f;
            this.f15989h += (long) iM6026f;
            m7527m();
            return iM6026f;
        } catch (Throwable th) {
            m7527m();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7519e(boolean z) {
        int andSet = this.f15985d.getAndSet(true != z ? 2 : 0);
        m7528n();
        im2 im2Var = this.f15982a;
        im2Var.f15314m = Long.MIN_VALUE;
        im2Var.f15315n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f15988g = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7520f() {
        if (this.f15985d.getAndSet(2) == 0) {
            m7528n();
        }
    }

    /* JADX INFO: renamed from: g */
    public final ch2 m7521g() {
        ch2 ch2Var;
        im2 im2Var = this.f15982a;
        synchronized (im2Var) {
            ch2Var = im2Var.f15317p ? null : im2Var.f15318q;
        }
        return ch2Var;
    }

    /* JADX INFO: renamed from: h */
    public final long m7522h() {
        long jMax;
        im2 im2Var = this.f15982a;
        synchronized (im2Var) {
            jMax = Math.max(im2Var.f15314m, im2Var.f15315n);
        }
        return jMax;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m7523i(long j2, boolean z) {
        long j3;
        im2 im2Var = this.f15982a;
        synchronized (im2Var) {
            if (im2Var.m7281a()) {
                long[] jArr = im2Var.f15307f;
                int i = im2Var.f15312k;
                if (j2 < jArr[i]) {
                    j3 = -1;
                } else {
                    if (j2 <= im2Var.f15315n || z) {
                        int i2 = -1;
                        int i3 = 0;
                        while (i != im2Var.f15313l && im2Var.f15307f[i] <= j2) {
                            if (1 == (im2Var.f15306e[i] & 1)) {
                                i2 = i3;
                            }
                            i = (i + 1) % im2Var.f15302a;
                            i3++;
                        }
                        if (i2 != -1) {
                            int i4 = (im2Var.f15312k + i2) % im2Var.f15302a;
                            im2Var.f15312k = i4;
                            im2Var.f15311j += i2;
                            im2Var.f15310i -= i2;
                            j3 = im2Var.f15304c[i4];
                        }
                    }
                    j3 = -1;
                }
            } else {
                j3 = -1;
            }
        }
        if (j3 == -1) {
            return false;
        }
        m7525k(j3);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m7524j(long j2, byte[] bArr, int i) {
        m7525k(j2);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j2 - this.f15986e.f15660a);
            int iMin = Math.min(i - i2, 65536 - i3);
            en2 en2Var = this.f15986e.f15663d;
            System.arraycopy(en2Var.f13625a, i3, bArr, i2, iMin);
            j2 += (long) iMin;
            i2 += iMin;
            if (j2 == this.f15986e.f15661b) {
                this.f15992k.m7531b(en2Var);
                jm2 jm2Var = this.f15986e;
                jm2Var.f15663d = null;
                this.f15986e = jm2Var.f15664e;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m7525k(long j2) {
        while (true) {
            jm2 jm2Var = this.f15986e;
            if (j2 < jm2Var.f15661b) {
                return;
            }
            this.f15992k.m7531b(jm2Var.f15663d);
            jm2 jm2Var2 = this.f15986e;
            jm2Var2.f15663d = null;
            this.f15986e = jm2Var2.f15664e;
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m7526l() {
        return this.f15985d.compareAndSet(0, 1);
    }

    /* JADX INFO: renamed from: m */
    public final void m7527m() {
        if (this.f15985d.compareAndSet(1, 0)) {
            return;
        }
        m7528n();
    }

    /* JADX INFO: renamed from: n */
    public final void m7528n() {
        im2 im2Var = this.f15982a;
        im2Var.f15311j = 0;
        im2Var.f15312k = 0;
        im2Var.f15313l = 0;
        im2Var.f15310i = 0;
        im2Var.f15316o = true;
        jm2 jm2Var = this.f15986e;
        if (jm2Var.f15662c) {
            jm2 jm2Var2 = this.f15987f;
            int i = (((int) (jm2Var2.f15660a - jm2Var.f15660a)) / 65536) + (jm2Var2.f15662c ? 1 : 0);
            en2[] en2VarArr = new en2[i];
            for (int i2 = 0; i2 < i; i2++) {
                en2VarArr[i2] = jm2Var.f15663d;
                jm2Var.f15663d = null;
                jm2Var = jm2Var.f15664e;
            }
            this.f15992k.m7532c(en2VarArr);
        }
        jm2 jm2Var3 = new jm2(0L, 65536);
        this.f15986e = jm2Var3;
        this.f15987f = jm2Var3;
        this.f15989h = 0L;
        this.f15990i = 65536;
        this.f15992k.m7533d();
    }

    /* JADX INFO: renamed from: o */
    public final int m7529o(int i) {
        en2 en2Var;
        if (this.f15990i == 65536) {
            this.f15990i = 0;
            jm2 jm2Var = this.f15987f;
            if (jm2Var.f15662c) {
                this.f15987f = jm2Var.f15664e;
            }
            jm2 jm2Var2 = this.f15987f;
            kn2 kn2Var = this.f15992k;
            synchronized (kn2Var) {
                kn2Var.f16001c++;
                int i2 = kn2Var.f16002d;
                if (i2 > 0) {
                    en2[] en2VarArr = kn2Var.f16003e;
                    int i3 = i2 - 1;
                    kn2Var.f16002d = i3;
                    en2Var = en2VarArr[i3];
                    en2VarArr[i3] = null;
                } else {
                    en2Var = new en2(new byte[65536], 0);
                }
            }
            jm2 jm2Var3 = new jm2(this.f15987f.f15661b, 65536);
            jm2Var2.f15663d = en2Var;
            jm2Var2.f15664e = jm2Var3;
            jm2Var2.f15662c = true;
        }
        return Math.min(i, 65536 - this.f15990i);
    }
}
