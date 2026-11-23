package p524h1;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: h1.x, reason: use source file name */
/* JADX INFO: compiled from: Sink.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Sink extends Closeable, Flushable {
    /* JADX INFO: renamed from: U */
    void mo13415U(Buffer3 buffer3, long j2) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    /* JADX INFO: renamed from: d */
    Timeout2 mo13505d();

    void flush() throws IOException;
}
