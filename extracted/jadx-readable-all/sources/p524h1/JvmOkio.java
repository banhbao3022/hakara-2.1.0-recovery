package p524h1;

import java.io.IOException;
import java.io.InputStream;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: h1.p, reason: use source file name */
/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmOkio implements Source {

    /* JADX INFO: renamed from: f */
    public final InputStream f30728f;

    /* JADX INFO: renamed from: g */
    public final Timeout2 f30729g;

    public JvmOkio(InputStream inputStream, Timeout2 timeout2) {
        Intrinsics2.m13090f(inputStream, "input");
        Intrinsics2.m13090f(timeout2, "timeout");
        this.f30728f = inputStream;
        this.f30729g = timeout2;
    }

    @Override // p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30728f.close();
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: d */
    public Timeout2 mo13391d() {
        return this.f30729g;
    }

    @Override // p524h1.Source
    /* JADX INFO: renamed from: p0 */
    public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
        Intrinsics2.m13090f(buffer3, "sink");
        if (j2 == 0) {
            return 0L;
        }
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(outline.m1594p("byteCount < 0: ", j2).toString());
        }
        try {
            this.f30729g.mo13701f();
            Segment segmentM13715F0 = buffer3.m13715F0(1);
            int i = this.f30728f.read(segmentM13715F0.f30742a, segmentM13715F0.f30744c, (int) Math.min(j2, 8192 - segmentM13715F0.f30744c));
            if (i != -1) {
                segmentM13715F0.f30744c += i;
                long j3 = i;
                buffer3.f30708g += j3;
                return j3;
            }
            if (segmentM13715F0.f30743b != segmentM13715F0.f30744c) {
                return -1L;
            }
            buffer3.f30707f = segmentM13715F0.m13786a();
            SegmentPool.m13790a(segmentM13715F0);
            return -1L;
        } catch (AssertionError e) {
            if (SkuDao.a.m14049A(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("source(");
        sbM1556G.append(this.f30728f);
        sbM1556G.append(')');
        return sbM1556G.toString();
    }
}
