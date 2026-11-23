package p007c.p190n.p194b.p209b;

import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.k1, reason: use source file name */
/* JADX INFO: compiled from: SeekParameters.java */
/* JADX INFO: loaded from: classes.dex */
public final class SeekParameters {

    /* JADX INFO: renamed from: a */
    public static final SeekParameters f6736a;

    /* JADX INFO: renamed from: b */
    public static final SeekParameters f6737b;

    /* JADX INFO: renamed from: c */
    public final long f6738c;

    /* JADX INFO: renamed from: d */
    public final long f6739d;

    static {
        SeekParameters seekParameters = new SeekParameters(0L, 0L);
        f6736a = seekParameters;
        new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        new SeekParameters(Long.MAX_VALUE, 0L);
        new SeekParameters(0L, Long.MAX_VALUE);
        f6737b = seekParameters;
    }

    public SeekParameters(long j2, long j3) {
        C2096e.m4566b(j2 >= 0);
        C2096e.m4566b(j3 >= 0);
        this.f6738c = j2;
        this.f6739d = j3;
    }

    /* JADX INFO: renamed from: a */
    public long m3454a(long j2, long j3, long j4) {
        long j5 = this.f6738c;
        if (j5 == 0 && this.f6739d == 0) {
            return j2;
        }
        int i = Util6.f6307a;
        long j6 = j2 - j5;
        long j7 = ((j5 ^ j2) & (j2 ^ j6)) >= 0 ? j6 : Long.MIN_VALUE;
        long j8 = this.f6739d;
        long j9 = j2 + j8;
        long j10 = ((j8 ^ j9) & (j2 ^ j9)) >= 0 ? j9 : Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = j7 <= j3 && j3 <= j10;
        if (j7 <= j4 && j4 <= j10) {
            z = true;
        }
        if (z2 && z) {
            return Math.abs(j3 - j2) <= Math.abs(j4 - j2) ? j3 : j4;
        }
        if (z2) {
            return j3;
        }
        return z ? j4 : j7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekParameters.class != obj.getClass()) {
            return false;
        }
        SeekParameters seekParameters = (SeekParameters) obj;
        return this.f6738c == seekParameters.f6738c && this.f6739d == seekParameters.f6739d;
    }

    public int hashCode() {
        return (((int) this.f6738c) * 31) + ((int) this.f6739d);
    }
}
