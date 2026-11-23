package p524h1;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: h1.z, reason: use source file name */
/* JADX INFO: compiled from: Source.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Source extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    /* JADX INFO: renamed from: d */
    Timeout2 mo13391d();

    /* JADX INFO: renamed from: p0 */
    long mo13392p0(Buffer3 buffer3, long j2) throws IOException;
}
