package p524h1;

import java.io.IOException;
import java.io.OutputStream;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: h1.r, reason: use source file name */
/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmOkio2 implements Sink {

    /* JADX INFO: renamed from: f */
    public final OutputStream f30733f;

    /* JADX INFO: renamed from: g */
    public final Timeout2 f30734g;

    public JvmOkio2(OutputStream outputStream, Timeout2 timeout2) {
        Intrinsics2.m13090f(outputStream, "out");
        Intrinsics2.m13090f(timeout2, "timeout");
        this.f30733f = outputStream;
        this.f30734g = timeout2;
    }

    @Override // p524h1.Sink
    /* JADX INFO: renamed from: U */
    public void mo13415U(Buffer3 buffer3, long j2) throws IOException {
        Intrinsics2.m13090f(buffer3, "source");
        SkuDao.a.m14085f(buffer3.f30708g, 0L, j2);
        while (j2 > 0) {
            this.f30734g.mo13701f();
            Segment segment = buffer3.f30707f;
            if (segment == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            int iMin = (int) Math.min(j2, segment.f30744c - segment.f30743b);
            this.f30733f.write(segment.f30742a, segment.f30743b, iMin);
            int i = segment.f30743b + iMin;
            segment.f30743b = i;
            long j3 = iMin;
            j2 -= j3;
            buffer3.f30708g -= j3;
            if (i == segment.f30744c) {
                buffer3.f30707f = segment.m13786a();
                SegmentPool.m13790a(segment);
            }
        }
    }

    @Override // p524h1.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30733f.close();
    }

    @Override // p524h1.Sink
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13505d() {
        return this.f30734g;
    }

    @Override // p524h1.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.f30733f.flush();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("sink(");
        sbM1556G.append(this.f30733f);
        sbM1556G.append(')');
        return sbM1556G.toString();
    }
}
