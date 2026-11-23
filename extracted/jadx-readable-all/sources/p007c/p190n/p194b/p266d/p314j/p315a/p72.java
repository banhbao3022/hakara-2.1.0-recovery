package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class p72 {

    /* JADX INFO: renamed from: a */
    public final o72 f17875a;

    public p72(o72 o72Var) {
        Charset charset = p82.f17879a;
        this.f17875a = o72Var;
        o72Var.f17553c = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m8081a(int i, float f) throws IOException {
        this.f17875a.mo7664g(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: b */
    public final void m8082b(int i, double d) throws IOException {
        this.f17875a.mo7666i(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: c */
    public final void m8083c(int i, int i2) throws IOException {
        this.f17875a.mo7663f(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* JADX INFO: renamed from: d */
    public final void m8084d(int i, long j2) throws IOException {
        this.f17875a.mo7665h(i, (j2 >> 63) ^ (j2 + j2));
    }

    /* JADX INFO: renamed from: e */
    public final void m8085e(int i, Object obj, ba2 ba2Var) throws IOException {
        l92 l92Var = (l92) obj;
        m72 m72Var = (m72) this.f17875a;
        m72Var.mo7672o((i << 3) | 2);
        t62 t62Var = (t62) l92Var;
        int iMo6959c = t62Var.mo6959c();
        if (iMo6959c == -1) {
            iMo6959c = ba2Var.mo5948c(t62Var);
            t62Var.mo6962f(iMo6959c);
        }
        m72Var.mo7672o(iMo6959c);
        ba2Var.mo5955k(l92Var, m72Var.f17553c);
    }

    /* JADX INFO: renamed from: f */
    public final void m8086f(int i, Object obj, ba2 ba2Var) throws IOException {
        o72 o72Var = this.f17875a;
        o72Var.mo7661d(i, 3);
        ba2Var.mo5955k((l92) obj, o72Var.f17553c);
        o72Var.mo7661d(i, 4);
    }
}
