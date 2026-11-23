package p007c.p190n.p194b.p209b.p243w1.p246v0;

import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.ChunkIndex;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.RangedUri;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.h, reason: use source file name */
/* JADX INFO: compiled from: DashWrappingSegmentIndex.java */
/* JADX INFO: loaded from: classes.dex */
public final class DashWrappingSegmentIndex implements DashSegmentIndex {

    /* JADX INFO: renamed from: a */
    public final ChunkIndex f9201a;

    /* JADX INFO: renamed from: b */
    public final long f9202b;

    public DashWrappingSegmentIndex(ChunkIndex chunkIndex, long j2) {
        this.f9201a = chunkIndex;
        this.f9202b = j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
    /* JADX INFO: renamed from: a */
    public long mo4230a(long j2) {
        return this.f9201a.f7554e[(int) j2] - this.f9202b;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
    /* JADX INFO: renamed from: b */
    public long mo4231b(long j2, long j3) {
        return this.f9201a.f7553d[(int) j2];
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
    /* JADX INFO: renamed from: c */
    public long mo4232c(long j2, long j3) {
        return 0L;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
    /* JADX INFO: renamed from: d */
    public long mo4233d(long j2, long j3) {
        return -9223372036854775807L;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
    /* JADX INFO: renamed from: e */
    public RangedUri mo4234e(long j2) {
        ChunkIndex chunkIndex = this.f9201a;
        int i = (int) j2;
        return new RangedUri(null, chunkIndex.f7552c[i], chunkIndex.f7551b[i]);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
    /* JADX INFO: renamed from: f */
    public long mo4235f(long j2, long j3) {
        return Util6.m3118f(this.f9201a.f7554e, j2 + this.f9202b, true, true);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
    /* JADX INFO: renamed from: g */
    public boolean mo4236g() {
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
    /* JADX INFO: renamed from: h */
    public long mo4237h() {
        return 0L;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
    /* JADX INFO: renamed from: i */
    public int mo4238i(long j2) {
        return this.f9201a.f7550a;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex
    /* JADX INFO: renamed from: j */
    public int mo4239j(long j2, long j3) {
        return this.f9201a.f7550a;
    }
}
