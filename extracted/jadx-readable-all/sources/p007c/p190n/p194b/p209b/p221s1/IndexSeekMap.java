package p007c.p190n.p194b.p209b.p221s1;

import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.t, reason: use source file name */
/* JADX INFO: compiled from: IndexSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class IndexSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a */
    public final long[] f8515a;

    /* JADX INFO: renamed from: b */
    public final long[] f8516b;

    /* JADX INFO: renamed from: c */
    public final long f8517c;

    /* JADX INFO: renamed from: d */
    public final boolean f8518d;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j2) {
        C2096e.m4566b(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f8518d = z;
        if (!z || jArr2[0] <= 0) {
            this.f8515a = jArr;
            this.f8516b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f8515a = jArr3;
            long[] jArr4 = new long[i];
            this.f8516b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f8517c = j2;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: d */
    public boolean mo3716d() {
        return this.f8518d;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: h */
    public SeekMap.a mo3717h(long j2) {
        if (!this.f8518d) {
            return new SeekMap.a(SeekPoint.f8524a);
        }
        int iM3118f = Util6.m3118f(this.f8516b, j2, true, true);
        SeekPoint seekPoint = new SeekPoint(this.f8516b[iM3118f], this.f8515a[iM3118f]);
        if (seekPoint.f8525b == j2 || iM3118f == this.f8516b.length - 1) {
            return new SeekMap.a(seekPoint);
        }
        int i = iM3118f + 1;
        return new SeekMap.a(seekPoint, new SeekPoint(this.f8516b[i], this.f8515a[i]));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: i */
    public long mo3718i() {
        return this.f8517c;
    }
}
