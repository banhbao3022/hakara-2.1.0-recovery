package p007c.p085g.p086a.p089m.p098v.p099d;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;

/* JADX INFO: renamed from: c.g.a.m.v.d.x, reason: use source file name */
/* JADX INFO: compiled from: RecyclableBufferedInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: f */
    public volatile byte[] f3593f;

    /* JADX INFO: renamed from: g */
    public int f3594g;

    /* JADX INFO: renamed from: h */
    public int f3595h;

    /* JADX INFO: renamed from: i */
    public int f3596i;

    /* JADX INFO: renamed from: j */
    public int f3597j;

    /* JADX INFO: renamed from: k */
    public final ArrayPool f3598k;

    /* JADX INFO: renamed from: c.g.a.m.v.d.x$a */
    /* JADX INFO: compiled from: RecyclableBufferedInputStream.java */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, ArrayPool arrayPool) {
        super(inputStream);
        this.f3596i = -1;
        this.f3598k = arrayPool;
        this.f3593f = (byte[]) arrayPool.mo1745e(65536, byte[].class);
    }

    /* JADX INFO: renamed from: f */
    public static IOException m1915f() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* JADX INFO: renamed from: a */
    public final int m1916a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f3596i;
        if (i != -1) {
            int i2 = this.f3597j - i;
            int i3 = this.f3595h;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f3594g == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f3598k.mo1745e(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f3593f = bArr2;
                    this.f3598k.mo1744d(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f3597j - this.f3596i;
                this.f3597j = i4;
                this.f3596i = 0;
                this.f3594g = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f3597j;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f3594g = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f3596i = -1;
            this.f3597j = 0;
            this.f3594g = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f3593f == null || inputStream == null) {
            m1915f();
            throw null;
        }
        return (this.f3594g - this.f3597j) + inputStream.available();
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m1917c() {
        if (this.f3593f != null) {
            this.f3598k.mo1744d(this.f3593f);
            this.f3593f = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f3593f != null) {
            this.f3598k.mo1744d(this.f3593f);
            this.f3593f = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f3595h = Math.max(this.f3595h, i);
        this.f3596i = this.f3597j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f3593f;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m1915f();
            throw null;
        }
        if (this.f3597j >= this.f3594g && m1916a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f3593f && (bArr = this.f3593f) == null) {
            m1915f();
            throw null;
        }
        int i = this.f3594g;
        int i2 = this.f3597j;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f3597j = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f3593f == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f3596i;
        if (-1 == i) {
            throw new a("Mark has been invalidated, pos: " + this.f3597j + " markLimit: " + this.f3595h);
        }
        this.f3597j = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) throws IOException {
        if (j2 < 1) {
            return 0L;
        }
        byte[] bArr = this.f3593f;
        if (bArr == null) {
            m1915f();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m1915f();
            throw null;
        }
        int i = this.f3594g;
        int i2 = this.f3597j;
        if (i - i2 >= j2) {
            this.f3597j = (int) (((long) i2) + j2);
            return j2;
        }
        long j3 = ((long) i) - ((long) i2);
        this.f3597j = i;
        if (this.f3596i == -1 || j2 > this.f3595h) {
            return j3 + inputStream.skip(j2 - j3);
        }
        if (m1916a(inputStream, bArr) == -1) {
            return j3;
        }
        int i3 = this.f3594g;
        int i4 = this.f3597j;
        if (i3 - i4 >= j2 - j3) {
            this.f3597j = (int) ((((long) i4) + j2) - j3);
            return j2;
        }
        long j4 = (j3 + ((long) i3)) - ((long) i4);
        this.f3597j = i3;
        return j4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f3593f;
        if (bArr2 == null) {
            m1915f();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f3597j;
            int i6 = this.f3594g;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f3597j += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f3596i == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (m1916a(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f3593f && (bArr2 = this.f3593f) == null) {
                        m1915f();
                        throw null;
                    }
                    int i8 = this.f3594g;
                    int i9 = this.f3597j;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f3597j += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            m1915f();
            throw null;
        }
    }
}
