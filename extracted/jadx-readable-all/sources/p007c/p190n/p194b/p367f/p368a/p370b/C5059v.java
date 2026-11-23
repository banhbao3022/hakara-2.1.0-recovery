package p007c.p190n.p194b.p367f.p368a.p370b;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: c.n.b.f.a.b.v */
/* JADX INFO: loaded from: classes.dex */
public final class C5059v extends InputStream {

    /* JADX INFO: renamed from: f */
    public final InputStream f25980f;

    /* JADX INFO: renamed from: g */
    public long f25981g;

    public C5059v(InputStream inputStream, long j2) {
        this.f25980f = inputStream;
        this.f25981g = j2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f25980f.close();
        this.f25981g = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j2 = this.f25981g;
        if (j2 <= 0) {
            return -1;
        }
        this.f25981g = j2 - 1;
        return this.f25980f.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j2 = this.f25981g;
        if (j2 <= 0) {
            return -1;
        }
        int i3 = this.f25980f.read(bArr, i, (int) Math.min(i2, j2));
        if (i3 != -1) {
            this.f25981g -= (long) i3;
        }
        return i3;
    }
}
