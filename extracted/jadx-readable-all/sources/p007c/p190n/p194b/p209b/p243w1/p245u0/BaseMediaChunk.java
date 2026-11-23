package p007c.p190n.p194b.p209b.p243w1.p245u0;

import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.u0.a, reason: use source file name */
/* JADX INFO: compiled from: BaseMediaChunk.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMediaChunk extends MediaChunk {

    /* JADX INFO: renamed from: k */
    public final long f9085k;

    /* JADX INFO: renamed from: l */
    public final long f9086l;

    /* JADX INFO: renamed from: m */
    public BaseMediaChunkOutput f9087m;

    /* JADX INFO: renamed from: n */
    public int[] f9088n;

    public BaseMediaChunk(DataSource3 dataSource3, DataSpec dataSpec, Format format, int i, Object obj, long j2, long j3, long j4, long j5, long j6) {
        super(dataSource3, dataSpec, format, i, obj, j2, j3, j6);
        this.f9085k = j4;
        this.f9086l = j5;
    }

    /* JADX INFO: renamed from: e */
    public final int m4196e(int i) {
        int[] iArr = this.f9088n;
        C2096e.m4572h(iArr);
        return iArr[i];
    }
}
