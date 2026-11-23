package p524h1;

import java.io.OutputStream;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.g, reason: use source file name */
/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Buffer4 extends OutputStream {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Buffer3 f30710f;

    public Buffer4(Buffer3 buffer3) {
        this.f30710f = buffer3;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.f30710f + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f30710f.m13721J0(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        Intrinsics2.m13090f(bArr, "data");
        this.f30710f.m13720I0(bArr, i, i2);
    }
}
