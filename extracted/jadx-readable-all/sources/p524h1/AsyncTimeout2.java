package p524h1;

import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: h1.c, reason: use source file name */
/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AsyncTimeout2 implements Sink {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AsyncTimeout f30703f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Sink f30704g;

    public AsyncTimeout2(AsyncTimeout asyncTimeout, Sink sink) {
        this.f30703f = asyncTimeout;
        this.f30704g = sink;
    }

    @Override // p524h1.Sink
    /* JADX INFO: renamed from: U */
    public void mo13415U(Buffer3 buffer3, long j2) throws IOException {
        Intrinsics2.m13090f(buffer3, "source");
        SkuDao.a.m14085f(buffer3.f30708g, 0L, j2);
        while (true) {
            long j3 = 0;
            if (j2 <= 0) {
                return;
            }
            Segment segment = buffer3.f30707f;
            if (segment == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            while (j3 < 65536) {
                j3 += (long) (segment.f30744c - segment.f30743b);
                if (j3 >= j2) {
                    j3 = j2;
                    break;
                }
                segment = segment.f30747f;
                if (segment == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
            }
            AsyncTimeout asyncTimeout = this.f30703f;
            asyncTimeout.m13703h();
            try {
                try {
                    this.f30704g.mo13415U(buffer3, j3);
                    if (asyncTimeout.m13704i()) {
                        throw asyncTimeout.mo13563j(null);
                    }
                    j2 -= j3;
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
    }

    @Override // p524h1.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        AsyncTimeout asyncTimeout = this.f30703f;
        asyncTimeout.m13703h();
        try {
            try {
                this.f30704g.close();
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

    @Override // p524h1.Sink
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13505d() {
        return this.f30703f;
    }

    @Override // p524h1.Sink, java.io.Flushable
    public void flush() throws IOException {
        AsyncTimeout asyncTimeout = this.f30703f;
        asyncTimeout.m13703h();
        try {
            try {
                this.f30704g.flush();
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

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("AsyncTimeout.sink(");
        sbM1556G.append(this.f30704g);
        sbM1556G.append(')');
        return sbM1556G.toString();
    }
}
