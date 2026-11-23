package p007c.p085g.p086a.p087k;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: c.g.a.k.b, reason: use source file name */
/* JADX INFO: compiled from: StrictLineReader.java */
/* JADX INFO: loaded from: classes.dex */
public class StrictLineReader implements Closeable {

    /* JADX INFO: renamed from: f */
    public final InputStream f2960f;

    /* JADX INFO: renamed from: g */
    public final Charset f2961g;

    /* JADX INFO: renamed from: h */
    public byte[] f2962h;

    /* JADX INFO: renamed from: i */
    public int f2963i;

    /* JADX INFO: renamed from: j */
    public int f2964j;

    /* JADX INFO: renamed from: c.g.a.k.b$a */
    /* JADX INFO: compiled from: StrictLineReader.java */
    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, StrictLineReader.this.f2961g.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public StrictLineReader(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* JADX INFO: renamed from: a */
    public final void m1680a() throws IOException {
        InputStream inputStream = this.f2960f;
        byte[] bArr = this.f2962h;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.f2963i = 0;
        this.f2964j = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX INFO: renamed from: c */
    public String m1681c() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f2960f) {
            if (this.f2962h == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f2963i >= this.f2964j) {
                m1680a();
            }
            for (int i3 = this.f2963i; i3 != this.f2964j; i3++) {
                byte[] bArr2 = this.f2962h;
                if (bArr2[i3] == 10) {
                    if (i3 != this.f2963i) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    byte[] bArr3 = this.f2962h;
                    int i4 = this.f2963i;
                    String str = new String(bArr3, i4, i2 - i4, this.f2961g.name());
                    this.f2963i = i3 + 1;
                    return str;
                }
            }
            a aVar = new a((this.f2964j - this.f2963i) + 80);
            loop1: while (true) {
                byte[] bArr4 = this.f2962h;
                int i5 = this.f2963i;
                aVar.write(bArr4, i5, this.f2964j - i5);
                this.f2964j = -1;
                m1680a();
                i = this.f2963i;
                while (i != this.f2964j) {
                    bArr = this.f2962h;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.f2963i;
            if (i != i6) {
                aVar.write(bArr, i6, i - i6);
            }
            this.f2963i = i + 1;
            return aVar.toString();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f2960f) {
            if (this.f2962h != null) {
                this.f2962h = null;
                this.f2960f.close();
            }
        }
    }

    public StrictLineReader(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(Util3.f2966a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f2960f = inputStream;
        this.f2961g = charset;
        this.f2962h = new byte[i];
    }
}
