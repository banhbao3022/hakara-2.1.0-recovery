package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: c.n.b.d.j.a.js */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3188js extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: f */
    public final C2879bg f15712f;

    public C3188js(C2879bg c2879bg, int i) {
        this.f15712f = c2879bg;
        ((ByteArrayOutputStream) this).buf = c2879bg.m5989a(Math.max(i, 256));
    }

    /* JADX INFO: renamed from: a */
    public final void m7387a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        byte[] bArrM5989a = this.f15712f.m5989a(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrM5989a, 0, ((ByteArrayOutputStream) this).count);
        this.f15712f.m5990b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrM5989a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15712f.m5990b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f15712f.m5990b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        m7387a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        m7387a(i2);
        super.write(bArr, i, i2);
    }
}
