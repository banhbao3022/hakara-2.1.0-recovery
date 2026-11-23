package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: c.n.b.d.j.a.fr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3039fr implements hn2 {

    /* JADX INFO: renamed from: a */
    public final hn2 f14100a;

    /* JADX INFO: renamed from: b */
    public final long f14101b;

    /* JADX INFO: renamed from: c */
    public final hn2 f14102c;

    /* JADX INFO: renamed from: d */
    public long f14103d;

    /* JADX INFO: renamed from: e */
    public Uri f14104e;

    public C3039fr(hn2 hn2Var, int i, hn2 hn2Var2) {
        this.f14100a = hn2Var;
        this.f14101b = i;
        this.f14102c = hn2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: a */
    public final long mo6843a(jn2 jn2Var) throws IOException {
        jn2 jn2Var2;
        this.f14104e = jn2Var.f15667a;
        long j2 = jn2Var.f15669c;
        long j3 = this.f14101b;
        jn2 jn2Var3 = null;
        if (j2 >= j3) {
            jn2Var2 = null;
        } else {
            long j4 = jn2Var.f15670d;
            jn2Var2 = new jn2(jn2Var.f15667a, null, j2, j2, j4 != -1 ? Math.min(j4, j3 - j2) : j3 - j2, null, 0);
        }
        long j5 = jn2Var.f15670d;
        if (j5 == -1 || jn2Var.f15669c + j5 > this.f14101b) {
            long jMax = Math.max(this.f14101b, jn2Var.f15669c);
            long j6 = jn2Var.f15670d;
            jn2Var3 = new jn2(jn2Var.f15667a, null, jMax, jMax, j6 != -1 ? Math.min(j6, (jn2Var.f15669c + j6) - this.f14101b) : -1L, null, 0);
        }
        long jMo6843a = jn2Var2 != null ? this.f14100a.mo6843a(jn2Var2) : 0L;
        long jMo6843a2 = jn2Var3 != null ? this.f14102c.mo6843a(jn2Var3) : 0L;
        this.f14103d = jn2Var.f15669c;
        if (jMo6843a2 == -1) {
            return -1L;
        }
        return jMo6843a + jMo6843a2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: b */
    public final Uri mo6844b() {
        return this.f14104e;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: d */
    public final int mo6845d(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j2 = this.f14103d;
        long j3 = this.f14101b;
        if (j2 < j3) {
            int iMo6845d = this.f14100a.mo6845d(bArr, i, (int) Math.min(i2, j3 - j2));
            long j4 = this.f14103d + ((long) iMo6845d);
            this.f14103d = j4;
            i3 = iMo6845d;
            j2 = j4;
        } else {
            i3 = 0;
        }
        if (j2 < this.f14101b) {
            return i3;
        }
        int iMo6845d2 = this.f14102c.mo6845d(bArr, i + i3, i2 - i3);
        this.f14103d += (long) iMo6845d2;
        return i3 + iMo6845d2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: e */
    public final void mo6846e() throws IOException {
        this.f14100a.mo6846e();
        this.f14102c.mo6846e();
    }
}
