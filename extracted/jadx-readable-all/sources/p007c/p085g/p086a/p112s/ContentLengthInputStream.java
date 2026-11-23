package p007c.p085g.p086a.p112s;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.g.a.s.c, reason: use source file name */
/* JADX INFO: compiled from: ContentLengthInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class ContentLengthInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: f */
    public final long f3811f;

    /* JADX INFO: renamed from: g */
    public int f3812g;

    public ContentLengthInputStream(InputStream inputStream, long j2) {
        super(inputStream);
        this.f3811f = j2;
    }

    /* JADX INFO: renamed from: a */
    public final int m2038a(int i) throws IOException {
        if (i >= 0) {
            this.f3812g += i;
        } else if (this.f3811f - ((long) this.f3812g) > 0) {
            StringBuilder sbM1556G = outline.m1556G("Failed to read all expected data, expected: ");
            sbM1556G.append(this.f3811f);
            sbM1556G.append(", but read: ");
            sbM1556G.append(this.f3812g);
            throw new IOException(sbM1556G.toString());
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f3811f - ((long) this.f3812g), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i;
        i = super.read();
        m2038a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        i3 = super.read(bArr, i, i2);
        m2038a(i3);
        return i3;
    }
}
