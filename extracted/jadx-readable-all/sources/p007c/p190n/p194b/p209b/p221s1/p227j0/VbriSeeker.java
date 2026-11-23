package p007c.p190n.p194b.p209b.p221s1.p227j0;

import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.SeekPoint;

/* JADX INFO: renamed from: c.n.b.b.s1.j0.h, reason: use source file name */
/* JADX INFO: compiled from: VbriSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class VbriSeeker implements Seeker {

    /* JADX INFO: renamed from: a */
    public final long[] f7840a;

    /* JADX INFO: renamed from: b */
    public final long[] f7841b;

    /* JADX INFO: renamed from: c */
    public final long f7842c;

    /* JADX INFO: renamed from: d */
    public final long f7843d;

    public VbriSeeker(long[] jArr, long[] jArr2, long j2, long j3) {
        this.f7840a = jArr;
        this.f7841b = jArr2;
        this.f7842c = j2;
        this.f7843d = j3;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p227j0.Seeker
    /* JADX INFO: renamed from: a */
    public long mo3797a(long j2) {
        return this.f7840a[Util6.m3118f(this.f7841b, j2, true, true)];
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p227j0.Seeker
    /* JADX INFO: renamed from: b */
    public long mo3798b() {
        return this.f7843d;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: d */
    public boolean mo3716d() {
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: h */
    public SeekMap.a mo3717h(long j2) {
        int iM3118f = Util6.m3118f(this.f7840a, j2, true, true);
        SeekPoint seekPoint = new SeekPoint(this.f7840a[iM3118f], this.f7841b[iM3118f]);
        if (seekPoint.f8525b >= j2 || iM3118f == this.f7840a.length - 1) {
            return new SeekMap.a(seekPoint);
        }
        int i = iM3118f + 1;
        return new SeekMap.a(seekPoint, new SeekPoint(this.f7840a[i], this.f7841b[i]));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: i */
    public long mo3718i() {
        return this.f7842c;
    }
}
