package p524h1;

import java.io.EOFException;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.e, reason: use source file name */
/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Okio implements Sink {
    @Override // p524h1.Sink
    /* JADX INFO: renamed from: U */
    public void mo13415U(Buffer3 buffer3, long j2) throws EOFException {
        Intrinsics2.m13090f(buffer3, "source");
        buffer3.skip(j2);
    }

    @Override // p524h1.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p524h1.Sink
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13505d() {
        return Timeout2.f30690a;
    }

    @Override // p524h1.Sink, java.io.Flushable
    public void flush() {
    }
}
