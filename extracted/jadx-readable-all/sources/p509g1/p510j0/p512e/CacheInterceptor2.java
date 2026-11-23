package p509g1.p510j0.p512e;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p524h1.Buffer3;
import p524h1.BufferedSink;
import p524h1.BufferedSource;
import p524h1.Source;
import p524h1.Timeout2;

/* JADX INFO: renamed from: g1.j0.e.b, reason: use source file name */
/* JADX INFO: compiled from: CacheInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CacheInterceptor2 implements Source {

    /* JADX INFO: renamed from: f */
    public boolean f30081f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ BufferedSource f30082g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CacheRequest f30083h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ BufferedSink f30084i;

    public CacheInterceptor2(BufferedSource bufferedSource, CacheRequest cacheRequest, BufferedSink bufferedSink) {
        this.f30082g = bufferedSource;
        this.f30083h = cacheRequest;
        this.f30084i = bufferedSink;
    }

    @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f30081f && !Util9.m13368h(this, 100, TimeUnit.MILLISECONDS)) {
            this.f30081f = true;
            this.f30083h.mo13310a();
        }
        this.f30082g.close();
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13391d() {
        return this.f30082g.mo13391d();
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: p0 */
    public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
        Intrinsics2.m13090f(buffer3, "sink");
        try {
            long jMo13392p0 = this.f30082g.mo13392p0(buffer3, j2);
            if (jMo13392p0 != -1) {
                buffer3.m13731R(this.f30084i.mo13739b(), buffer3.f30708g - jMo13392p0, jMo13392p0);
                this.f30084i.mo13714F();
                return jMo13392p0;
            }
            if (!this.f30081f) {
                this.f30081f = true;
                this.f30084i.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.f30081f) {
                this.f30081f = true;
                this.f30083h.mo13310a();
            }
            throw e;
        }
    }
}
