package p007c.p190n.p194b.p209b.p210a2;

import java.io.IOException;
import java.io.InputStream;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.a2.o, reason: use source file name */
/* JADX INFO: compiled from: DataSourceInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class DataSourceInputStream extends InputStream {

    /* JADX INFO: renamed from: f */
    public final DataSource3 f6131f;

    /* JADX INFO: renamed from: g */
    public final DataSpec f6132g;

    /* JADX INFO: renamed from: k */
    public long f6136k;

    /* JADX INFO: renamed from: i */
    public boolean f6134i = false;

    /* JADX INFO: renamed from: j */
    public boolean f6135j = false;

    /* JADX INFO: renamed from: h */
    public final byte[] f6133h = new byte[1];

    public DataSourceInputStream(DataSource3 dataSource3, DataSpec dataSpec) {
        this.f6131f = dataSource3;
        this.f6132g = dataSpec;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f6135j) {
            return;
        }
        this.f6131f.close();
        this.f6135j = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f6133h) == -1) {
            return -1;
        }
        return this.f6133h[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        C2096e.m4570f(!this.f6135j);
        if (!this.f6134i) {
            this.f6131f.mo2913h(this.f6132g);
            this.f6134i = true;
        }
        int i3 = this.f6131f.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f6136k += (long) i3;
        return i3;
    }
}
