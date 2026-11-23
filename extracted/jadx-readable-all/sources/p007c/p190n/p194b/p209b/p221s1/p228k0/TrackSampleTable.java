package p007c.p190n.p194b.p209b.p221s1.p228k0;

import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.k0.p, reason: use source file name */
/* JADX INFO: compiled from: TrackSampleTable.java */
/* JADX INFO: loaded from: classes.dex */
public final class TrackSampleTable {

    /* JADX INFO: renamed from: a */
    public final Track f8012a;

    /* JADX INFO: renamed from: b */
    public final int f8013b;

    /* JADX INFO: renamed from: c */
    public final long[] f8014c;

    /* JADX INFO: renamed from: d */
    public final int[] f8015d;

    /* JADX INFO: renamed from: e */
    public final int f8016e;

    /* JADX INFO: renamed from: f */
    public final long[] f8017f;

    /* JADX INFO: renamed from: g */
    public final int[] f8018g;

    /* JADX INFO: renamed from: h */
    public final long f8019h;

    public TrackSampleTable(Track track, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j2) {
        C2096e.m4566b(iArr.length == jArr2.length);
        C2096e.m4566b(jArr.length == jArr2.length);
        C2096e.m4566b(iArr2.length == jArr2.length);
        this.f8012a = track;
        this.f8014c = jArr;
        this.f8015d = iArr;
        this.f8016e = i;
        this.f8017f = jArr2;
        this.f8018g = iArr2;
        this.f8019h = j2;
        this.f8013b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m3842a(long j2) {
        for (int iM3118f = Util6.m3118f(this.f8017f, j2, true, false); iM3118f >= 0; iM3118f--) {
            if ((this.f8018g[iM3118f] & 1) != 0) {
                return iM3118f;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public int m3843b(long j2) {
        for (int iM3114b = Util6.m3114b(this.f8017f, j2, true, false); iM3114b < this.f8017f.length; iM3114b++) {
            if ((this.f8018g[iM3114b] & 1) != 0) {
                return iM3114b;
            }
        }
        return -1;
    }
}
