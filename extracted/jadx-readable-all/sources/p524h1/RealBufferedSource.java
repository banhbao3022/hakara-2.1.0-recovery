package p524h1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.CharJVM;
import p477d1.p493x.p495c.Intrinsics2;
import p524h1.p525b0.Buffer2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: h1.t, reason: use source file name */
/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RealBufferedSource implements BufferedSource {

    /* JADX INFO: renamed from: f */
    public final Buffer3 f30738f;

    /* JADX INFO: renamed from: g */
    public boolean f30739g;

    /* JADX INFO: renamed from: h */
    public final Source f30740h;

    public RealBufferedSource(Source source) {
        Intrinsics2.m13090f(source, "source");
        this.f30740h = source;
        this.f30738f = new Buffer3();
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: B0 */
    public long mo13709B0() throws EOFException {
        mo13757w0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo13738a0(i2)) {
                break;
            }
            byte bM13740b0 = this.f30738f.m13740b0(i);
            if ((bM13740b0 < ((byte) 48) || bM13740b0 > ((byte) 57)) && ((bM13740b0 < ((byte) 97) || bM13740b0 > ((byte) 102)) && (bM13740b0 < ((byte) 65) || bM13740b0 > ((byte) 70)))) {
                if (i != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                CharJVM.m12978a(16);
                CharJVM.m12978a(16);
                String string = Integer.toString(bM13740b0, 16);
                Intrinsics2.m13086b(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            i = i2;
        }
        return this.f30738f.mo13709B0();
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: C0 */
    public InputStream mo13710C0() {
        return new a();
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: E */
    public long mo13712E(ByteString3 byteString3) {
        Intrinsics2.m13090f(byteString3, "targetBytes");
        Intrinsics2.m13090f(byteString3, "targetBytes");
        if (!(!this.f30739g)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        while (true) {
            long jM13744g0 = this.f30738f.m13744g0(byteString3, jMax);
            if (jM13744g0 != -1) {
                return jM13744g0;
            }
            Buffer3 buffer3 = this.f30738f;
            long j2 = buffer3.f30708g;
            if (this.f30740h.mo13392p0(buffer3, 8192) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j2);
        }
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: E0 */
    public int mo13713E0(Options2 options2) throws EOFException {
        Intrinsics2.m13090f(options2, "options");
        if (!(!this.f30739g)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iM13707b = Buffer2.m13707b(this.f30738f, options2, true);
            if (iM13707b != -2) {
                if (iM13707b == -1) {
                    break;
                }
                this.f30738f.skip(options2.f30731h[iM13707b].mo13765j());
                return iM13707b;
            }
        } while (this.f30740h.mo13392p0(this.f30738f, 8192) != -1);
        return -1;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: G */
    public long mo13716G() throws EOFException {
        mo13757w0(1L);
        long j2 = 0;
        while (true) {
            long j3 = j2 + 1;
            if (!mo13738a0(j3)) {
                break;
            }
            byte bM13740b0 = this.f30738f.m13740b0(j2);
            if ((bM13740b0 < ((byte) 48) || bM13740b0 > ((byte) 57)) && !(j2 == 0 && bM13740b0 == ((byte) 45))) {
                if (j2 != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9] or '-' character but was 0x");
                CharJVM.m12978a(16);
                CharJVM.m12978a(16);
                String string = Integer.toString(bM13740b0, 16);
                Intrinsics2.m13086b(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            j2 = j3;
        }
        return this.f30738f.mo13716G();
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: I */
    public String mo13719I(long j2) throws EOFException {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(outline.m1594p("limit < 0: ", j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        byte b = (byte) 10;
        long jM13784a = m13784a(b, 0L, j3);
        if (jM13784a != -1) {
            return Buffer2.m13706a(this.f30738f, jM13784a);
        }
        if (j3 < Long.MAX_VALUE && mo13738a0(j3) && this.f30738f.m13740b0(j3 - 1) == ((byte) 13) && mo13738a0(1 + j3) && this.f30738f.m13740b0(j3) == b) {
            return Buffer2.m13706a(this.f30738f, j3);
        }
        Buffer3 buffer3 = new Buffer3();
        Buffer3 buffer4 = this.f30738f;
        buffer4.m13731R(buffer3, 0L, Math.min(32, buffer4.f30708g));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f30738f.f30708g, j2) + " content=" + buffer3.mo13736Y().mo13766l() + "…");
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: S */
    public String mo13733S(Charset charset) throws IOException {
        Intrinsics2.m13090f(charset, "charset");
        this.f30738f.mo13734V(this.f30740h);
        return this.f30738f.mo13733S(charset);
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: Y */
    public ByteString3 mo13736Y() throws IOException {
        this.f30738f.mo13734V(this.f30740h);
        return this.f30738f.mo13736Y();
    }

    /* JADX INFO: renamed from: a */
    public long m13784a(byte b, long j2, long j3) {
        if (!(!this.f30739g)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j2 && j3 >= j2)) {
            StringBuilder sbM1560K = outline.m1560K("fromIndex=", j2, " toIndex=");
            sbM1560K.append(j3);
            throw new IllegalArgumentException(sbM1560K.toString().toString());
        }
        while (j2 < j3) {
            long jM13742f0 = this.f30738f.m13742f0(b, j2, j3);
            if (jM13742f0 != -1) {
                return jM13742f0;
            }
            Buffer3 buffer3 = this.f30738f;
            long j4 = buffer3.f30708g;
            if (j4 >= j3 || this.f30740h.mo13392p0(buffer3, 8192) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, j4);
        }
        return -1L;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: a0 */
    public boolean mo13738a0(long j2) {
        Buffer3 buffer3;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(outline.m1594p("byteCount < 0: ", j2).toString());
        }
        if (!(!this.f30739g)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            buffer3 = this.f30738f;
            if (buffer3.f30708g >= j2) {
                return true;
            }
        } while (this.f30740h.mo13392p0(buffer3, 8192) != -1);
        return false;
    }

    @Override // p524h1.BufferedSource, p524h1.BufferedSink
    /* JADX INFO: renamed from: b */
    public Buffer3 mo13739b() {
        return this.f30738f;
    }

    /* JADX INFO: renamed from: c */
    public int m13785c() throws EOFException {
        mo13757w0(4L);
        int i = this.f30738f.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f30739g) {
            return;
        }
        this.f30739g = true;
        this.f30740h.close();
        Buffer3 buffer3 = this.f30738f;
        buffer3.skip(buffer3.f30708g);
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13391d() {
        return this.f30740h.mo13391d();
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: e0 */
    public String mo13741e0() {
        return mo13719I(Long.MAX_VALUE);
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: h0 */
    public byte[] mo13745h0(long j2) throws EOFException {
        if (mo13738a0(j2)) {
            return this.f30738f.mo13745h0(j2);
        }
        throw new EOFException();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f30739g;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: l */
    public Buffer3 mo13746l() {
        return this.f30738f;
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: m */
    public ByteString3 mo13748m(long j2) throws EOFException {
        if (mo13738a0(j2)) {
            return this.f30738f.mo13748m(j2);
        }
        throw new EOFException();
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: p0 */
    public long mo13392p0(Buffer3 buffer3, long j2) {
        Intrinsics2.m13090f(buffer3, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(outline.m1594p("byteCount < 0: ", j2).toString());
        }
        if (!(!this.f30739g)) {
            throw new IllegalStateException("closed".toString());
        }
        Buffer3 buffer4 = this.f30738f;
        if (buffer4.f30708g == 0 && this.f30740h.mo13392p0(buffer4, 8192) == -1) {
            return -1L;
        }
        return this.f30738f.mo13392p0(buffer3, Math.min(j2, this.f30738f.f30708g));
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: r0 */
    public long mo13752r0(Sink sink) {
        Intrinsics2.m13090f(sink, "sink");
        long j2 = 0;
        while (this.f30740h.mo13392p0(this.f30738f, 8192) != -1) {
            long jM13726O = this.f30738f.m13726O();
            if (jM13726O > 0) {
                j2 += jM13726O;
                ((Buffer3) sink).mo13415U(this.f30738f, jM13726O);
            }
        }
        Buffer3 buffer3 = this.f30738f;
        long j3 = buffer3.f30708g;
        if (j3 <= 0) {
            return j2;
        }
        long j4 = j2 + j3;
        ((Buffer3) sink).mo13415U(buffer3, j3);
        return j4;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        Intrinsics2.m13090f(byteBuffer, "sink");
        Buffer3 buffer3 = this.f30738f;
        if (buffer3.f30708g == 0 && this.f30740h.mo13392p0(buffer3, 8192) == -1) {
            return -1;
        }
        return this.f30738f.read(byteBuffer);
    }

    @Override // p524h1.BufferedSource
    public byte readByte() throws EOFException {
        mo13757w0(1L);
        return this.f30738f.readByte();
    }

    @Override // p524h1.BufferedSource
    public int readInt() throws EOFException {
        mo13757w0(4L);
        return this.f30738f.readInt();
    }

    @Override // p524h1.BufferedSource
    public short readShort() throws EOFException {
        mo13757w0(2L);
        return this.f30738f.readShort();
    }

    @Override // p524h1.BufferedSource
    public void skip(long j2) throws EOFException {
        if (!(!this.f30739g)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            Buffer3 buffer3 = this.f30738f;
            if (buffer3.f30708g == 0 && this.f30740h.mo13392p0(buffer3, 8192) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, this.f30738f.f30708g);
            this.f30738f.skip(jMin);
            j2 -= jMin;
        }
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("buffer(");
        sbM1556G.append(this.f30740h);
        sbM1556G.append(')');
        return sbM1556G.toString();
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: w */
    public byte[] mo13756w() throws IOException {
        this.f30738f.mo13734V(this.f30740h);
        return this.f30738f.mo13756w();
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: w0 */
    public void mo13757w0(long j2) throws EOFException {
        if (!mo13738a0(j2)) {
            throw new EOFException();
        }
    }

    @Override // p524h1.BufferedSource
    /* JADX INFO: renamed from: y */
    public boolean mo13759y() {
        if (!this.f30739g) {
            return this.f30738f.mo13759y() && this.f30740h.mo13392p0(this.f30738f, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX INFO: renamed from: h1.t$a */
    /* JADX INFO: compiled from: RealBufferedSource.kt */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            RealBufferedSource realBufferedSource = RealBufferedSource.this;
            if (realBufferedSource.f30739g) {
                throw new IOException("closed");
            }
            return (int) Math.min(realBufferedSource.f30738f.f30708g, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            RealBufferedSource.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            RealBufferedSource realBufferedSource = RealBufferedSource.this;
            if (realBufferedSource.f30739g) {
                throw new IOException("closed");
            }
            Buffer3 buffer3 = realBufferedSource.f30738f;
            if (buffer3.f30708g == 0 && realBufferedSource.f30740h.mo13392p0(buffer3, 8192) == -1) {
                return -1;
            }
            return RealBufferedSource.this.f30738f.readByte() & 255;
        }

        public String toString() {
            return RealBufferedSource.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            Intrinsics2.m13090f(bArr, "data");
            if (!RealBufferedSource.this.f30739g) {
                SkuDao.a.m14085f(bArr.length, i, i2);
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                Buffer3 buffer3 = realBufferedSource.f30738f;
                if (buffer3.f30708g == 0 && realBufferedSource.f30740h.mo13392p0(buffer3, 8192) == -1) {
                    return -1;
                }
                return RealBufferedSource.this.f30738f.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
