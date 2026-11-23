package p007c.p190n.p194b.p195a.p198j;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: c.n.b.a.j.q, reason: use source file name */
/* JADX INFO: compiled from: TransportRuntimeComponent.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class TransportRuntimeComponent implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((DaggerTransportRuntimeComponent) this).f5728k.get().close();
    }
}
