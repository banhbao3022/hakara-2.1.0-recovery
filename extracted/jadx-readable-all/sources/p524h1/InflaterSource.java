package p524h1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.o, reason: use source file name */
/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InflaterSource implements Source {

    /* JADX INFO: renamed from: f */
    public int f30724f;

    /* JADX INFO: renamed from: g */
    public boolean f30725g;

    /* JADX INFO: renamed from: h */
    public final BufferedSource f30726h;

    /* JADX INFO: renamed from: i */
    public final Inflater f30727i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InflaterSource(Source source, Inflater inflater) {
        this((BufferedSource) new RealBufferedSource(source), inflater);
        Intrinsics2.m13090f(source, "source");
        Intrinsics2.m13090f(inflater, "inflater");
        Intrinsics2.m13090f(source, "$this$buffer");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13780a() throws IOException {
        if (!this.f30727i.needsInput()) {
            return false;
        }
        if (this.f30726h.mo13759y()) {
            return true;
        }
        Segment segment = this.f30726h.mo13739b().f30707f;
        if (segment == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        int i = segment.f30744c;
        int i2 = segment.f30743b;
        int i3 = i - i2;
        this.f30724f = i3;
        this.f30727i.setInput(segment.f30742a, i2, i3);
        return false;
    }

    @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f30725g) {
            return;
        }
        this.f30727i.end();
        this.f30725g = true;
        this.f30726h.close();
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13391d() {
        return this.f30726h.mo13391d();
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: p0 */
    public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
        long j3;
        Intrinsics2.m13090f(buffer3, "sink");
        do {
            Intrinsics2.m13090f(buffer3, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(outline.m1594p("byteCount < 0: ", j2).toString());
            }
            if (!(!this.f30725g)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j2 == 0) {
                j3 = 0;
            } else {
                try {
                    Segment segmentM13715F0 = buffer3.m13715F0(1);
                    int iMin = (int) Math.min(j2, 8192 - segmentM13715F0.f30744c);
                    m13780a();
                    int iInflate = this.f30727i.inflate(segmentM13715F0.f30742a, segmentM13715F0.f30744c, iMin);
                    int i = this.f30724f;
                    if (i != 0) {
                        int remaining = i - this.f30727i.getRemaining();
                        this.f30724f -= remaining;
                        this.f30726h.skip(remaining);
                    }
                    if (iInflate > 0) {
                        segmentM13715F0.f30744c += iInflate;
                        j3 = iInflate;
                        buffer3.f30708g += j3;
                    } else {
                        if (segmentM13715F0.f30743b == segmentM13715F0.f30744c) {
                            buffer3.f30707f = segmentM13715F0.m13786a();
                            SegmentPool.m13790a(segmentM13715F0);
                        }
                        j3 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j3 > 0) {
                return j3;
            }
            if (this.f30727i.finished() || this.f30727i.needsDictionary()) {
                return -1L;
            }
        } while (!this.f30726h.mo13759y());
        throw new EOFException("source exhausted prematurely");
    }

    public InflaterSource(BufferedSource bufferedSource, Inflater inflater) {
        Intrinsics2.m13090f(bufferedSource, "source");
        Intrinsics2.m13090f(inflater, "inflater");
        this.f30726h = bufferedSource;
        this.f30727i = inflater;
    }
}
