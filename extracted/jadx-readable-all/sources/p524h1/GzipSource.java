package p524h1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.n, reason: use source file name */
/* JADX INFO: compiled from: GzipSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GzipSource implements Source {

    /* JADX INFO: renamed from: f */
    public byte f30719f;

    /* JADX INFO: renamed from: g */
    public final RealBufferedSource f30720g;

    /* JADX INFO: renamed from: h */
    public final Inflater f30721h;

    /* JADX INFO: renamed from: i */
    public final InflaterSource f30722i;

    /* JADX INFO: renamed from: j */
    public final CRC32 f30723j;

    public GzipSource(Source source) {
        Intrinsics2.m13090f(source, "source");
        RealBufferedSource realBufferedSource = new RealBufferedSource(source);
        this.f30720g = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.f30721h = inflater;
        this.f30722i = new InflaterSource((BufferedSource) realBufferedSource, inflater);
        this.f30723j = new CRC32();
    }

    /* JADX INFO: renamed from: a */
    public final void m13778a(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        Intrinsics2.m13086b(str2, "java.lang.String.format(this, *args)");
        throw new IOException(str2);
    }

    /* JADX INFO: renamed from: c */
    public final void m13779c(Buffer3 buffer3, long j2, long j3) {
        Segment segment = buffer3.f30707f;
        if (segment == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        do {
            int i = segment.f30744c;
            int i2 = segment.f30743b;
            if (j2 < i - i2) {
                while (j3 > 0) {
                    int i3 = (int) (((long) segment.f30743b) + j2);
                    int iMin = (int) Math.min(segment.f30744c - i3, j3);
                    this.f30723j.update(segment.f30742a, i3, iMin);
                    j3 -= (long) iMin;
                    segment = segment.f30747f;
                    if (segment == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    j2 = 0;
                }
                return;
            }
            j2 -= (long) (i - i2);
            segment = segment.f30747f;
        } while (segment != null);
        Intrinsics2.m13095k();
        throw null;
    }

    @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30722i.close();
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13391d() {
        return this.f30720g.mo13391d();
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: p0 */
    public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
        Intrinsics2.m13090f(buffer3, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(outline.m1594p("byteCount < 0: ", j2).toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        if (this.f30719f == 0) {
            this.f30720g.mo13757w0(10L);
            byte bM13740b0 = this.f30720g.f30738f.m13740b0(3L);
            boolean z = ((bM13740b0 >> 1) & 1) == 1;
            if (z) {
                m13779c(this.f30720g.f30738f, 0L, 10L);
            }
            RealBufferedSource realBufferedSource = this.f30720g;
            realBufferedSource.mo13757w0(2L);
            m13778a("ID1ID2", 8075, realBufferedSource.f30738f.readShort());
            this.f30720g.skip(8L);
            if (((bM13740b0 >> 2) & 1) == 1) {
                this.f30720g.mo13757w0(2L);
                if (z) {
                    m13779c(this.f30720g.f30738f, 0L, 2L);
                }
                long jM13750n0 = this.f30720g.f30738f.m13750n0();
                this.f30720g.mo13757w0(jM13750n0);
                if (z) {
                    m13779c(this.f30720g.f30738f, 0L, jM13750n0);
                }
                this.f30720g.skip(jM13750n0);
            }
            if (((bM13740b0 >> 3) & 1) == 1) {
                long jM13784a = this.f30720g.m13784a((byte) 0, 0L, Long.MAX_VALUE);
                if (jM13784a == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m13779c(this.f30720g.f30738f, 0L, jM13784a + 1);
                }
                this.f30720g.skip(jM13784a + 1);
            }
            if (((bM13740b0 >> 4) & 1) == 1) {
                long jM13784a2 = this.f30720g.m13784a((byte) 0, 0L, Long.MAX_VALUE);
                if (jM13784a2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m13779c(this.f30720g.f30738f, 0L, jM13784a2 + 1);
                }
                this.f30720g.skip(jM13784a2 + 1);
            }
            if (z) {
                RealBufferedSource realBufferedSource2 = this.f30720g;
                realBufferedSource2.mo13757w0(2L);
                m13778a("FHCRC", realBufferedSource2.f30738f.m13750n0(), (short) this.f30723j.getValue());
                this.f30723j.reset();
            }
            this.f30719f = (byte) 1;
        }
        if (this.f30719f == 1) {
            long j3 = buffer3.f30708g;
            long jMo13392p0 = this.f30722i.mo13392p0(buffer3, j2);
            if (jMo13392p0 != -1) {
                m13779c(buffer3, j3, jMo13392p0);
                return jMo13392p0;
            }
            this.f30719f = (byte) 2;
        }
        if (this.f30719f == 2) {
            m13778a("CRC", this.f30720g.m13785c(), (int) this.f30723j.getValue());
            m13778a("ISIZE", this.f30720g.m13785c(), (int) this.f30721h.getBytesWritten());
            this.f30719f = (byte) 3;
            if (!this.f30720g.mo13759y()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
