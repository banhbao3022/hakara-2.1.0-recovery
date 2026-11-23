package p007c.p085g.p086a.p089m.p090s;

import com.facebook.stetho.dumpapp.Framer;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.g.a.m.s.g, reason: use source file name */
/* JADX INFO: compiled from: ExifOrientationStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class ExifOrientationStream extends FilterInputStream {

    /* JADX INFO: renamed from: f */
    public static final byte[] f3053f;

    /* JADX INFO: renamed from: g */
    public static final int f3054g;

    /* JADX INFO: renamed from: h */
    public static final int f3055h;

    /* JADX INFO: renamed from: i */
    public final byte f3056i;

    /* JADX INFO: renamed from: j */
    public int f3057j;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, Framer.EXIT_FRAME_PREFIX, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f3053f = bArr;
        int length = bArr.length;
        f3054g = length;
        f3055h = length + 2;
    }

    public ExifOrientationStream(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(outline.m1590l("Cannot add invalid orientation: ", i));
        }
        this.f3056i = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f3057j;
        if (i3 < 2 || i3 > (i2 = f3055h)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.f3056i : f3053f[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f3057j++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jSkip = super.skip(j2);
        if (jSkip > 0) {
            this.f3057j = (int) (((long) this.f3057j) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f3057j;
        int i5 = f3055h;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f3056i;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f3053f, this.f3057j - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f3057j += i3;
        }
        return i3;
    }
}
