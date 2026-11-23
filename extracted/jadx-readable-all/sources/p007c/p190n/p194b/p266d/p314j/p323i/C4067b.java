package p007c.p190n.p194b.p266d.p314j.p323i;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.i.b */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4067b extends FilterInputStream {

    /* JADX INFO: renamed from: f */
    public long f23010f;

    /* JADX INFO: renamed from: g */
    public long f23011g;

    public C4067b(InputStream inputStream) {
        super(inputStream);
        this.f23011g = -1L;
        Objects.requireNonNull(inputStream);
        this.f23010f = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f23010f);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f23011g = this.f23010f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f23010f == 0) {
            return -1;
        }
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f23010f--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f23011g == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f23010f = this.f23011g;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j2, this.f23010f));
        this.f23010f -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j2 = this.f23010f;
        if (j2 == 0) {
            return -1;
        }
        int i3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j2));
        if (i3 != -1) {
            this.f23010f -= (long) i3;
        }
        return i3;
    }
}
