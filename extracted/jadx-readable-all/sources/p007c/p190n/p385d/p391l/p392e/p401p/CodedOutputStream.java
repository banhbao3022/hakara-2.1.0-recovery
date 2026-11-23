package p007c.p190n.p385d.p391l.p392e.p401p;

import java.io.ByteArrayInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: c.n.d.l.e.p.c, reason: use source file name */
/* JADX INFO: compiled from: CodedOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class CodedOutputStream implements Flushable {

    /* JADX INFO: renamed from: f */
    public final byte[] f26916f;

    /* JADX INFO: renamed from: g */
    public final int f26917g;

    /* JADX INFO: renamed from: h */
    public int f26918h = 0;

    /* JADX INFO: renamed from: i */
    public final OutputStream f26919i;

    /* JADX INFO: renamed from: c.n.d.l.e.p.c$a */
    /* JADX INFO: compiled from: CodedOutputStream.java */
    public static class a extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f26919i = outputStream;
        this.f26916f = bArr;
        this.f26917g = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public static int m11986a(int i, boolean z) {
        return m11990h(i) + 1;
    }

    /* JADX INFO: renamed from: c */
    public static int m11987c(int i, ByteString byteString) {
        return m11990h(i) + m11989f(byteString.f26910a.length) + byteString.f26910a.length;
    }

    /* JADX INFO: renamed from: e */
    public static int m11988e(int i, int i2) {
        return m11990h(i) + (i2 >= 0 ? m11989f(i2) : 10);
    }

    /* JADX INFO: renamed from: f */
    public static int m11989f(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: h */
    public static int m11990h(int i) {
        return m11989f((i << 3) | 0);
    }

    /* JADX INFO: renamed from: i */
    public static int m11991i(int i, int i2) {
        return m11990h(i) + m11989f(i2);
    }

    /* JADX INFO: renamed from: j */
    public static int m11992j(int i, long j2) {
        int i2;
        int iM11990h = m11990h(i);
        if (((-128) & j2) == 0) {
            i2 = 1;
        } else if (((-16384) & j2) == 0) {
            i2 = 2;
        } else if (((-2097152) & j2) == 0) {
            i2 = 3;
        } else if (((-268435456) & j2) == 0) {
            i2 = 4;
        } else if (((-34359738368L) & j2) == 0) {
            i2 = 5;
        } else if (((-4398046511104L) & j2) == 0) {
            i2 = 6;
        } else if (((-562949953421312L) & j2) == 0) {
            i2 = 7;
        } else if (((-72057594037927936L) & j2) == 0) {
            i2 = 8;
        } else {
            i2 = (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
        }
        return iM11990h + i2;
    }

    /* JADX INFO: renamed from: k */
    public static CodedOutputStream m11993k(OutputStream outputStream) {
        return new CodedOutputStream(outputStream, new byte[4096]);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f26919i != null) {
            m11994l();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m11994l() throws IOException {
        OutputStream outputStream = this.f26919i;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f26916f, 0, this.f26918h);
        this.f26918h = 0;
    }

    /* JADX INFO: renamed from: m */
    public void m11995m(int i, boolean z) throws IOException {
        m11999r((i << 3) | 0);
        m11998q(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: n */
    public void m11996n(int i, ByteString byteString) throws IOException {
        m11999r((i << 3) | 2);
        m11999r(byteString.f26910a.length);
        byte[] bArr = byteString.f26910a;
        int length = bArr.length;
        int i2 = this.f26917g;
        int i3 = this.f26918h;
        int i4 = i2 - i3;
        if (i4 >= length) {
            System.arraycopy(bArr, 0, this.f26916f, i3, length);
            this.f26918h += length;
            return;
        }
        System.arraycopy(bArr, 0, this.f26916f, i3, i4);
        int i5 = i4 + 0;
        int i6 = length - i4;
        this.f26918h = this.f26917g;
        m11994l();
        if (i6 <= this.f26917g) {
            System.arraycopy(byteString.f26910a, i5, this.f26916f, 0, i6);
            this.f26918h = i6;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteString.f26910a);
        long j2 = i5;
        if (j2 != byteArrayInputStream.skip(j2)) {
            throw new IllegalStateException("Skip failed.");
        }
        while (i6 > 0) {
            int iMin = Math.min(i6, this.f26917g);
            int i7 = byteArrayInputStream.read(this.f26916f, 0, iMin);
            if (i7 != iMin) {
                throw new IllegalStateException("Read failed.");
            }
            this.f26919i.write(this.f26916f, 0, i7);
            i6 -= i7;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m11997o(int i, int i2) throws IOException {
        m11999r((i << 3) | 0);
        if (i2 >= 0) {
            m11999r(i2);
        } else {
            m12000t(i2);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m11998q(int i) throws IOException {
        byte b = (byte) i;
        if (this.f26918h == this.f26917g) {
            m11994l();
        }
        byte[] bArr = this.f26916f;
        int i2 = this.f26918h;
        this.f26918h = i2 + 1;
        bArr[i2] = b;
    }

    /* JADX INFO: renamed from: r */
    public void m11999r(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m11998q((i & 127) | 128);
            i >>>= 7;
        }
        m11998q(i);
    }

    /* JADX INFO: renamed from: t */
    public void m12000t(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            m11998q((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        m11998q((int) j2);
    }

    /* JADX INFO: renamed from: u */
    public void m12001u(int i, int i2) throws IOException {
        m11999r((i << 3) | i2);
    }

    /* JADX INFO: renamed from: v */
    public void m12002v(int i, int i2) throws IOException {
        m11999r((i << 3) | 0);
        m11999r(i2);
    }

    /* JADX INFO: renamed from: w */
    public void m12003w(int i, long j2) throws IOException {
        m11999r((i << 3) | 0);
        m12000t(j2);
    }
}
