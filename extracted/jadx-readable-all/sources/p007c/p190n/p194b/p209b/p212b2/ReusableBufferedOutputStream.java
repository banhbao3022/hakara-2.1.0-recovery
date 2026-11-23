package p007c.p190n.p194b.p209b.p212b2;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.b2.z, reason: use source file name */
/* JADX INFO: compiled from: ReusableBufferedOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class ReusableBufferedOutputStream extends BufferedOutputStream {

    /* JADX INFO: renamed from: f */
    public boolean f6401f;

    public ReusableBufferedOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    /* JADX INFO: renamed from: a */
    public void m3234a(OutputStream outputStream) {
        C2096e.m4570f(this.f6401f);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f6401f = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f6401f = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th == null) {
            return;
        }
        int i = Util6.f6307a;
        throw th;
    }

    public ReusableBufferedOutputStream(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
