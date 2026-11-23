package p524h1;

import java.io.IOException;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.l, reason: use source file name */
/* JADX INFO: compiled from: ForwardingSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ForwardingSource implements Source {

    /* JADX INFO: renamed from: f */
    public final Source f30717f;

    public ForwardingSource(Source source) {
        Intrinsics2.m13090f(source, "delegate");
        this.f30717f = source;
    }

    @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30717f.close();
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13391d() {
        return this.f30717f.mo13391d();
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: p0 */
    public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
        Intrinsics2.m13090f(buffer3, "sink");
        return this.f30717f.mo13392p0(buffer3, j2);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f30717f + ')';
    }
}
