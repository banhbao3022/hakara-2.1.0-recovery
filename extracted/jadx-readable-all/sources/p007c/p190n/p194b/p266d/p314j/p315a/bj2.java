package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bj2 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f12707a = new byte[4096];

    /* JADX INFO: renamed from: b */
    public final hn2 f12708b;

    /* JADX INFO: renamed from: c */
    public final long f12709c;

    /* JADX INFO: renamed from: d */
    public long f12710d;

    /* JADX INFO: renamed from: e */
    public byte[] f12711e = new byte[65536];

    /* JADX INFO: renamed from: f */
    public int f12712f;

    /* JADX INFO: renamed from: g */
    public int f12713g;

    public bj2(hn2 hn2Var, long j2, long j3) {
        this.f12708b = hn2Var;
        this.f12710d = j2;
        this.f12709c = j3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6021a(byte[] bArr, int i, int i2, boolean z) throws InterruptedException, IOException {
        int iMin;
        int i3 = this.f12713g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f12711e, 0, bArr, i, iMin);
            m6025e(iMin);
        }
        int iM6026f = iMin;
        while (iM6026f < i2 && iM6026f != -1) {
            iM6026f = m6026f(bArr, i, i2, iM6026f, z);
        }
        m6027g(iM6026f);
        return iM6026f != -1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6022b(int i, boolean z) throws InterruptedException, IOException {
        int iMin = Math.min(this.f12713g, i);
        m6025e(iMin);
        int iM6026f = iMin;
        while (iM6026f < i && iM6026f != -1) {
            iM6026f = m6026f(f12707a, -iM6026f, Math.min(i, iM6026f + 4096), iM6026f, false);
        }
        m6027g(iM6026f);
        return iM6026f != -1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6023c(byte[] bArr, int i, int i2) throws InterruptedException, IOException {
        if (!m6024d(i2, false)) {
            return false;
        }
        System.arraycopy(this.f12711e, this.f12712f - i2, bArr, i, i2);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6024d(int i, boolean z) throws InterruptedException, IOException {
        int i2 = this.f12712f + i;
        int length = this.f12711e.length;
        if (i2 > length) {
            int i3 = jo2.f15673a;
            this.f12711e = Arrays.copyOf(this.f12711e, Math.max(65536 + i2, Math.min(length + length, i2 + 524288)));
        }
        int iMin = Math.min(this.f12713g - this.f12712f, i);
        while (iMin < i) {
            iMin = m6026f(this.f12711e, this.f12712f, i, iMin, false);
            if (iMin == -1) {
                return false;
            }
        }
        int i4 = this.f12712f + i;
        this.f12712f = i4;
        this.f12713g = Math.max(this.f12713g, i4);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m6025e(int i) {
        int i2 = this.f12713g - i;
        this.f12713g = i2;
        this.f12712f = 0;
        byte[] bArr = this.f12711e;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f12711e = bArr2;
    }

    /* JADX INFO: renamed from: f */
    public final int m6026f(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iMo6845d = this.f12708b.mo6845d(bArr, i + i3, i2 - i3);
        if (iMo6845d != -1) {
            return i3 + iMo6845d;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: g */
    public final void m6027g(int i) {
        if (i != -1) {
            this.f12710d += (long) i;
        }
    }
}
