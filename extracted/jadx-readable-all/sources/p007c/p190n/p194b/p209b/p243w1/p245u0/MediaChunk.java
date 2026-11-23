package p007c.p190n.p194b.p209b.p243w1.p245u0;

import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;

/* JADX INFO: renamed from: c.n.b.b.w1.u0.m, reason: use source file name */
/* JADX INFO: compiled from: MediaChunk.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class MediaChunk extends Chunk {

    /* JADX INFO: renamed from: j */
    public final long f9160j;

    public MediaChunk(DataSource3 dataSource3, DataSpec dataSpec, Format format, int i, Object obj, long j2, long j3, long j4) {
        super(dataSource3, dataSpec, 1, format, i, obj, j2, j3);
        Objects.requireNonNull(format);
        this.f9160j = j4;
    }

    /* JADX INFO: renamed from: c */
    public long mo4221c() {
        long j2 = this.f9160j;
        if (j2 != -1) {
            return 1 + j2;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo4222d();
}
