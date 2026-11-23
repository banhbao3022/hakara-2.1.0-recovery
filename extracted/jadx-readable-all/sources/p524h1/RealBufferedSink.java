package p524h1;

import java.io.IOException;
import java.nio.ByteBuffer;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.s, reason: use source file name */
/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RealBufferedSink implements BufferedSink {

    /* JADX INFO: renamed from: f */
    public final Buffer3 f30735f;

    /* JADX INFO: renamed from: g */
    public boolean f30736g;

    /* JADX INFO: renamed from: h */
    public final Sink f30737h;

    public RealBufferedSink(Sink sink) {
        Intrinsics2.m13090f(sink, "sink");
        this.f30737h = sink;
        this.f30735f = new Buffer3();
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: F */
    public BufferedSink mo13714F() throws IOException {
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        long jM13726O = this.f30735f.m13726O();
        if (jM13726O > 0) {
            this.f30737h.mo13415U(this.f30735f, jM13726O);
        }
        return this;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: P */
    public BufferedSink mo13728P(String str) {
        Intrinsics2.m13090f(str, "string");
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f30735f.m13729P0(str);
        return mo13714F();
    }

    @Override // p524h1.Sink
    /* JADX INFO: renamed from: U */
    public void mo13415U(Buffer3 buffer3, long j2) throws IOException {
        Intrinsics2.m13090f(buffer3, "source");
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f30735f.mo13415U(buffer3, j2);
        mo13714F();
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: V */
    public long mo13734V(Source source) throws IOException {
        Intrinsics2.m13090f(source, "source");
        long j2 = 0;
        while (true) {
            long jMo13392p0 = ((JvmOkio) source).mo13392p0(this.f30735f, 8192);
            if (jMo13392p0 == -1) {
                return j2;
            }
            j2 += jMo13392p0;
            mo13714F();
        }
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: W */
    public BufferedSink mo13735W(long j2) {
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f30735f.mo13735W(j2);
        return mo13714F();
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: b */
    public Buffer3 mo13739b() {
        return this.f30735f;
    }

    @Override // p524h1.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f30736g) {
            return;
        }
        Throwable th = null;
        try {
            Buffer3 buffer3 = this.f30735f;
            long j2 = buffer3.f30708g;
            if (j2 > 0) {
                this.f30737h.mo13415U(buffer3, j2);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f30737h.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f30736g = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p524h1.Sink
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13505d() {
        return this.f30737h.mo13505d();
    }

    @Override // p524h1.BufferedSink, p524h1.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        Buffer3 buffer3 = this.f30735f;
        long j2 = buffer3.f30708g;
        if (j2 > 0) {
            this.f30737h.mo13415U(buffer3, j2);
        }
        this.f30737h.flush();
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: g */
    public BufferedSink mo13743g(byte[] bArr, int i, int i2) throws IOException {
        Intrinsics2.m13090f(bArr, "source");
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f30735f.m13720I0(bArr, i, i2);
        mo13714F();
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f30736g;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: l0 */
    public BufferedSink mo13747l0(byte[] bArr) throws IOException {
        Intrinsics2.m13090f(bArr, "source");
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f30735f.m13718H0(bArr);
        mo13714F();
        return this;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: m0 */
    public BufferedSink mo13749m0(ByteString3 byteString3) throws IOException {
        Intrinsics2.m13090f(byteString3, "byteString");
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f30735f.m13717G0(byteString3);
        mo13714F();
        return this;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: p */
    public BufferedSink mo13751p(int i) throws IOException {
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f30735f.m13725N0(i);
        mo13714F();
        return this;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: s */
    public BufferedSink mo13753s(int i) throws IOException {
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f30735f.m13724M0(i);
        mo13714F();
        return this;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("buffer(");
        sbM1556G.append(this.f30737h);
        sbM1556G.append(')');
        return sbM1556G.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        Intrinsics2.m13090f(byteBuffer, "source");
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f30735f.write(byteBuffer);
        mo13714F();
        return iWrite;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: y0 */
    public BufferedSink mo13760y0(long j2) throws IOException {
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f30735f.mo13760y0(j2);
        mo13714F();
        return this;
    }

    @Override // p524h1.BufferedSink
    /* JADX INFO: renamed from: z */
    public BufferedSink mo13761z(int i) throws IOException {
        if (!(!this.f30736g)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f30735f.m13721J0(i);
        mo13714F();
        return this;
    }
}
