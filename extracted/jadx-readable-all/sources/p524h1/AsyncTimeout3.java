package p524h1;

import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.d, reason: use source file name */
/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AsyncTimeout3 implements Source {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AsyncTimeout f30705f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Source f30706g;

    public AsyncTimeout3(AsyncTimeout asyncTimeout, Source source) {
        this.f30705f = asyncTimeout;
        this.f30706g = source;
    }

    @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        AsyncTimeout asyncTimeout = this.f30705f;
        asyncTimeout.m13703h();
        try {
            try {
                this.f30706g.close();
                if (asyncTimeout.m13704i()) {
                    throw asyncTimeout.mo13563j(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.m13704i()) {
                    throw e;
                }
                throw asyncTimeout.mo13563j(e);
            }
        } catch (Throwable th) {
            asyncTimeout.m13704i();
            throw th;
        }
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13391d() {
        return this.f30705f;
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: p0 */
    public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
        Intrinsics2.m13090f(buffer3, "sink");
        AsyncTimeout asyncTimeout = this.f30705f;
        asyncTimeout.m13703h();
        try {
            try {
                long jMo13392p0 = this.f30706g.mo13392p0(buffer3, j2);
                if (asyncTimeout.m13704i()) {
                    throw asyncTimeout.mo13563j(null);
                }
                return jMo13392p0;
            } catch (IOException e) {
                if (asyncTimeout.m13704i()) {
                    throw asyncTimeout.mo13563j(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            asyncTimeout.m13704i();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("AsyncTimeout.source(");
        sbM1556G.append(this.f30706g);
        sbM1556G.append(')');
        return sbM1556G.toString();
    }
}
