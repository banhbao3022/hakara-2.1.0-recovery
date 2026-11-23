package p007c.p190n.p194b.p367f.p368a.p373d;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: c.n.b.f.a.d.v */
/* JADX INFO: loaded from: classes.dex */
public final class C5119v extends AbstractC5118u {

    /* JADX INFO: renamed from: f */
    public final AbstractC5118u f26069f;

    /* JADX INFO: renamed from: g */
    public final long f26070g;

    /* JADX INFO: renamed from: h */
    public final long f26071h;

    public C5119v(AbstractC5118u abstractC5118u, long j2, long j3) {
        this.f26069f = abstractC5118u;
        long jM11557f = m11557f(j2);
        this.f26070g = jM11557f;
        this.f26071h = m11557f(jM11557f + j3);
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractC5118u
    /* JADX INFO: renamed from: a */
    public final long mo11506a() {
        return this.f26071h - this.f26070g;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractC5118u
    /* JADX INFO: renamed from: c */
    public final InputStream mo11507c(long j2, long j3) throws IOException {
        long jM11557f = m11557f(this.f26070g);
        return this.f26069f.mo11507c(jM11557f, m11557f(j3 + jM11557f) - jM11557f);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    /* JADX INFO: renamed from: f */
    public final long m11557f(long j2) {
        if (j2 < 0) {
            return 0L;
        }
        return j2 > this.f26069f.mo11506a() ? this.f26069f.mo11506a() : j2;
    }
}
