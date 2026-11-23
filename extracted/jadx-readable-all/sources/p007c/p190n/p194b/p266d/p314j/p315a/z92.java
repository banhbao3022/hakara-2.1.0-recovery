package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class z92 extends InputStream {

    /* JADX INFO: renamed from: f */
    public y92 f22206f;

    /* JADX INFO: renamed from: g */
    public d72 f22207g;

    /* JADX INFO: renamed from: h */
    public int f22208h;

    /* JADX INFO: renamed from: i */
    public int f22209i;

    /* JADX INFO: renamed from: j */
    public int f22210j;

    /* JADX INFO: renamed from: k */
    public int f22211k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ aa2 f22212l;

    public z92(aa2 aa2Var) {
        this.f22212l = aa2Var;
        m8850c();
    }

    /* JADX INFO: renamed from: a */
    public final int m8849a(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            m8851f();
            if (this.f22207g == null) {
                break;
            }
            int iMin = Math.min(this.f22208h - this.f22209i, i3);
            if (bArr != null) {
                this.f22207g.m6947N(bArr, this.f22209i, i, iMin);
                i += iMin;
            }
            this.f22209i += iMin;
            i3 -= iMin;
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.f22212l.f12050i - (this.f22210j + this.f22209i);
    }

    /* JADX INFO: renamed from: c */
    public final void m8850c() {
        y92 y92Var = new y92(this.f22212l, null);
        this.f22206f = y92Var;
        d72 next = y92Var.next();
        this.f22207g = next;
        this.f22208h = next.mo5719m();
        this.f22209i = 0;
        this.f22210j = 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m8851f() {
        if (this.f22207g != null) {
            int i = this.f22209i;
            int i2 = this.f22208h;
            if (i == i2) {
                this.f22210j += i2;
                int iMo5719m = 0;
                this.f22209i = 0;
                if (this.f22206f.hasNext()) {
                    d72 next = this.f22206f.next();
                    this.f22207g = next;
                    iMo5719m = next.mo5719m();
                } else {
                    this.f22207g = null;
                }
                this.f22208h = iMo5719m;
            }
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f22211k = this.f22210j + this.f22209i;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        m8851f();
        d72 d72Var = this.f22207g;
        if (d72Var == null) {
            return -1;
        }
        int i = this.f22209i;
        this.f22209i = i + 1;
        return d72Var.mo5717h(i) & 255;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        m8850c();
        m8849a(null, 0, this.f22211k);
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j2 > 2147483647L) {
            j2 = 2147483647L;
        }
        return m8849a(null, 0, (int) j2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            int iM8849a = m8849a(bArr, i, i2);
            if (iM8849a != 0) {
                return iM8849a;
            }
            if (i2 <= 0) {
                if (this.f22212l.f12050i - (this.f22210j + this.f22209i) != 0) {
                    return 0;
                }
            }
            return -1;
        }
        throw new IndexOutOfBoundsException();
    }
}
