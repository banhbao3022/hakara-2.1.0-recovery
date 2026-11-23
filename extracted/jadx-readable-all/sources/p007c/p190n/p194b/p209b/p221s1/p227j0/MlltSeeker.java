package p007c.p190n.p194b.p209b.p221s1.p227j0;

import android.util.Pair;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.SeekPoint;

/* JADX INFO: renamed from: c.n.b.b.s1.j0.e, reason: use source file name */
/* JADX INFO: compiled from: MlltSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class MlltSeeker implements Seeker {

    /* JADX INFO: renamed from: a */
    public final long[] f7816a;

    /* JADX INFO: renamed from: b */
    public final long[] f7817b;

    /* JADX INFO: renamed from: c */
    public final long f7818c;

    public MlltSeeker(long[] jArr, long[] jArr2, long j2) {
        this.f7816a = jArr;
        this.f7817b = jArr2;
        this.f7818c = j2 == -9223372036854775807L ? C.m3236b(jArr2[jArr2.length - 1]) : j2;
    }

    /* JADX INFO: renamed from: c */
    public static Pair<Long, Long> m3800c(long j2, long[] jArr, long[] jArr2) {
        int iM3118f = Util6.m3118f(jArr, j2, true, true);
        long j3 = jArr[iM3118f];
        long j4 = jArr2[iM3118f];
        int i = iM3118f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        long j5 = jArr[i];
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((j5 == j3 ? 0.0d : (j2 - j3) / (j5 - j3)) * (jArr2[i] - j4))) + j4));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p227j0.Seeker
    /* JADX INFO: renamed from: a */
    public long mo3797a(long j2) {
        return C.m3236b(((Long) m3800c(j2, this.f7816a, this.f7817b).second).longValue());
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p227j0.Seeker
    /* JADX INFO: renamed from: b */
    public long mo3798b() {
        return -1L;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: d */
    public boolean mo3716d() {
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: h */
    public SeekMap.a mo3717h(long j2) {
        Pair<Long, Long> pairM3800c = m3800c(C.m3237c(Util6.m3122j(j2, 0L, this.f7818c)), this.f7817b, this.f7816a);
        return new SeekMap.a(new SeekPoint(C.m3236b(((Long) pairM3800c.first).longValue()), ((Long) pairM3800c.second).longValue()));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: i */
    public long mo3718i() {
        return this.f7818c;
    }
}
