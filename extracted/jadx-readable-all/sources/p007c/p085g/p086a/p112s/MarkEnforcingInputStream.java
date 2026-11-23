package p007c.p085g.p086a.p112s;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: c.g.a.s.h, reason: use source file name */
/* JADX INFO: compiled from: MarkEnforcingInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public class MarkEnforcingInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: f */
    public int f3824f;

    public MarkEnforcingInputStream(InputStream inputStream) {
        super(inputStream);
        this.f3824f = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final long m2044a(long j2) {
        int i = this.f3824f;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j2 <= ((long) i)) ? j2 : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.f3824f;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* JADX INFO: renamed from: c */
    public final void m2045c(long j2) {
        int i = this.f3824f;
        if (i == Integer.MIN_VALUE || j2 == -1) {
            return;
        }
        this.f3824f = (int) (((long) i) - j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.f3824f = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m2044a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m2045c(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f3824f = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jM2044a = m2044a(j2);
        if (jM2044a == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM2044a);
        m2045c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int iM2044a = (int) m2044a(i2);
        if (iM2044a == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iM2044a);
        m2045c(i3);
        return i3;
    }
}
