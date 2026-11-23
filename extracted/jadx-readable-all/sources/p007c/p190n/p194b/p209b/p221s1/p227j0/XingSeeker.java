package p007c.p190n.p194b.p209b.p221s1.p227j0;

import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.SeekPoint;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.j0.i, reason: use source file name */
/* JADX INFO: compiled from: XingSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class XingSeeker implements Seeker {

    /* JADX INFO: renamed from: a */
    public final long f7844a;

    /* JADX INFO: renamed from: b */
    public final int f7845b;

    /* JADX INFO: renamed from: c */
    public final long f7846c;

    /* JADX INFO: renamed from: d */
    public final long f7847d;

    /* JADX INFO: renamed from: e */
    public final long f7848e;

    /* JADX INFO: renamed from: f */
    public final long[] f7849f;

    public XingSeeker(long j2, int i, long j3, long j4, long[] jArr) {
        this.f7844a = j2;
        this.f7845b = i;
        this.f7846c = j3;
        this.f7849f = jArr;
        this.f7847d = j4;
        this.f7848e = j4 != -1 ? j2 + j4 : -1L;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p227j0.Seeker
    /* JADX INFO: renamed from: a */
    public long mo3797a(long j2) {
        long j3 = j2 - this.f7844a;
        if (!mo3716d() || j3 <= this.f7845b) {
            return 0L;
        }
        long[] jArr = this.f7849f;
        C2096e.m4572h(jArr);
        double d = (j3 * 256.0d) / this.f7847d;
        int iM3118f = Util6.m3118f(jArr, (long) d, true, true);
        long j4 = this.f7846c;
        long j5 = (((long) iM3118f) * j4) / 100;
        long j6 = jArr[iM3118f];
        int i = iM3118f + 1;
        long j7 = (j4 * ((long) i)) / 100;
        long j8 = iM3118f == 99 ? 256L : jArr[i];
        return Math.round((j6 == j8 ? 0.0d : (d - j6) / (j8 - j6)) * (j7 - j5)) + j5;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p227j0.Seeker
    /* JADX INFO: renamed from: b */
    public long mo3798b() {
        return this.f7848e;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: d */
    public boolean mo3716d() {
        return this.f7849f != null;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: h */
    public SeekMap.a mo3717h(long j2) {
        if (!mo3716d()) {
            return new SeekMap.a(new SeekPoint(0L, this.f7844a + ((long) this.f7845b)));
        }
        long jM3122j = Util6.m3122j(j2, 0L, this.f7846c);
        double d = (jM3122j * 100.0d) / this.f7846c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.f7849f;
                C2096e.m4572h(jArr);
                long[] jArr2 = jArr;
                double d3 = jArr2[i];
                d2 = d3 + (((i == 99 ? 256.0d : jArr2[i + 1]) - d3) * (d - ((double) i)));
            }
        }
        return new SeekMap.a(new SeekPoint(jM3122j, this.f7844a + Util6.m3122j(Math.round((d2 / 256.0d) * this.f7847d), this.f7845b, this.f7847d - 1)));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: i */
    public long mo3718i() {
        return this.f7846c;
    }
}
