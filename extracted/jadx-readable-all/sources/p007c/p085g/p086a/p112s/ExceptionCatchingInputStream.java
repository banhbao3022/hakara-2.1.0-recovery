package p007c.p085g.p086a.p112s;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: c.g.a.s.d, reason: use source file name */
/* JADX INFO: compiled from: ExceptionCatchingInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public class ExceptionCatchingInputStream extends InputStream {

    /* JADX INFO: renamed from: f */
    public static final Queue<ExceptionCatchingInputStream> f3813f;

    /* JADX INFO: renamed from: g */
    public InputStream f3814g;

    /* JADX INFO: renamed from: h */
    public IOException f3815h;

    static {
        char[] cArr = Util4.f3828a;
        f3813f = new ArrayDeque(0);
    }

    /* JADX INFO: renamed from: a */
    public void m2039a() {
        this.f3815h = null;
        this.f3814g = null;
        Queue<ExceptionCatchingInputStream> queue = f3813f;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f3814g.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3814g.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f3814g.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f3814g.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f3814g.read(bArr);
        } catch (IOException e) {
            this.f3815h = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f3814g.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        try {
            return this.f3814g.skip(j2);
        } catch (IOException e) {
            this.f3815h = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f3814g.read(bArr, i, i2);
        } catch (IOException e) {
            this.f3815h = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f3814g.read();
        } catch (IOException e) {
            this.f3815h = e;
            return -1;
        }
    }
}
