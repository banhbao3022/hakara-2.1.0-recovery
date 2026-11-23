package p007c.p085g.p086a.p089m.p090s;

import java.io.IOException;
import java.io.OutputStream;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;

/* JADX INFO: renamed from: c.g.a.m.s.c, reason: use source file name */
/* JADX INFO: compiled from: BufferedOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class BufferedOutputStream extends OutputStream {

    /* JADX INFO: renamed from: f */
    public final OutputStream f3046f;

    /* JADX INFO: renamed from: g */
    public byte[] f3047g;

    /* JADX INFO: renamed from: h */
    public ArrayPool f3048h;

    /* JADX INFO: renamed from: i */
    public int f3049i;

    public BufferedOutputStream(OutputStream outputStream, ArrayPool arrayPool) {
        this.f3046f = outputStream;
        this.f3048h = arrayPool;
        this.f3047g = (byte[]) arrayPool.mo1745e(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f3046f.close();
            byte[] bArr = this.f3047g;
            if (bArr != null) {
                this.f3048h.mo1744d(bArr);
                this.f3047g = null;
            }
        } catch (Throwable th) {
            this.f3046f.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int i = this.f3049i;
        if (i > 0) {
            this.f3046f.write(this.f3047g, 0, i);
            this.f3049i = 0;
        }
        this.f3046f.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f3047g;
        int i2 = this.f3049i;
        int i3 = i2 + 1;
        this.f3049i = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f3046f.write(bArr, 0, i3);
        this.f3049i = 0;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f3049i;
            if (i6 == 0 && i4 >= this.f3047g.length) {
                this.f3046f.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f3047g.length - i6);
            System.arraycopy(bArr, i5, this.f3047g, this.f3049i, iMin);
            int i7 = this.f3049i + iMin;
            this.f3049i = i7;
            i3 += iMin;
            byte[] bArr2 = this.f3047g;
            if (i7 == bArr2.length && i7 > 0) {
                this.f3046f.write(bArr2, 0, i7);
                this.f3049i = 0;
            }
        } while (i3 < i2);
    }
}
