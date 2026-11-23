package p007c.p190n.p194b.p266d.p314j.p323i;

import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.i.a */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4066a extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
    }
}
