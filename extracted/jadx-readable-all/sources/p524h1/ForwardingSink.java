package p524h1;

import java.io.IOException;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.k, reason: use source file name */
/* JADX INFO: compiled from: ForwardingSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ForwardingSink implements Sink {

    /* JADX INFO: renamed from: f */
    public final Sink f30716f;

    public ForwardingSink(Sink sink) {
        Intrinsics2.m13090f(sink, "delegate");
        this.f30716f = sink;
    }

    @Override // p524h1.Sink
    /* JADX INFO: renamed from: U */
    public void mo13415U(Buffer3 buffer3, long j2) throws IOException {
        Intrinsics2.m13090f(buffer3, "source");
        this.f30716f.mo13415U(buffer3, j2);
    }

    @Override // p524h1.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30716f.close();
    }

    @Override // p524h1.Sink
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13505d() {
        return this.f30716f.mo13505d();
    }

    @Override // p524h1.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.f30716f.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f30716f + ')';
    }
}
