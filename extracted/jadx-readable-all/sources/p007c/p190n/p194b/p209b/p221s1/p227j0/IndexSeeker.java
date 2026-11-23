package p007c.p190n.p194b.p209b.p221s1.p227j0;

import p007c.p190n.p194b.p209b.p212b2.LongArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.SeekPoint;

/* JADX INFO: renamed from: c.n.b.b.s1.j0.d, reason: use source file name */
/* JADX INFO: compiled from: IndexSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class IndexSeeker implements Seeker {

    /* JADX INFO: renamed from: a */
    public final long f7812a;

    /* JADX INFO: renamed from: b */
    public final LongArray f7813b;

    /* JADX INFO: renamed from: c */
    public final LongArray f7814c;

    /* JADX INFO: renamed from: d */
    public long f7815d;

    public IndexSeeker(long j2, long j3, long j4) {
        this.f7815d = j2;
        this.f7812a = j4;
        LongArray longArray = new LongArray();
        this.f7813b = longArray;
        LongArray longArray2 = new LongArray();
        this.f7814c = longArray2;
        longArray.m3157a(0L);
        longArray2.m3157a(j3);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p227j0.Seeker
    /* JADX INFO: renamed from: a */
    public long mo3797a(long j2) {
        return this.f7813b.m3158b(Util6.m3115c(this.f7814c, j2, true, true));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p227j0.Seeker
    /* JADX INFO: renamed from: b */
    public long mo3798b() {
        return this.f7812a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m3799c(long j2) {
        LongArray longArray = this.f7813b;
        return j2 - longArray.m3158b(longArray.f6358a - 1) < 100000;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: d */
    public boolean mo3716d() {
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: h */
    public SeekMap.a mo3717h(long j2) {
        int iM3115c = Util6.m3115c(this.f7813b, j2, true, true);
        SeekPoint seekPoint = new SeekPoint(this.f7813b.m3158b(iM3115c), this.f7814c.m3158b(iM3115c));
        if (seekPoint.f8525b == j2 || iM3115c == this.f7813b.f6358a - 1) {
            return new SeekMap.a(seekPoint);
        }
        int i = iM3115c + 1;
        return new SeekMap.a(seekPoint, new SeekPoint(this.f7813b.m3158b(i), this.f7814c.m3158b(i)));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: i */
    public long mo3718i() {
        return this.f7815d;
    }
}
