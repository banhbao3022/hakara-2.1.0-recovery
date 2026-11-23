package p007c.p190n.p194b.p209b.p212b2;

/* JADX INFO: renamed from: c.n.b.b.b2.g0, reason: use source file name */
/* JADX INFO: compiled from: TimestampAdjuster.java */
/* JADX INFO: loaded from: classes.dex */
public final class TimestampAdjuster {

    /* JADX INFO: renamed from: a */
    public boolean f6301a;

    /* JADX INFO: renamed from: b */
    public long f6302b;

    /* JADX INFO: renamed from: c */
    public long f6303c;

    /* JADX INFO: renamed from: d */
    public long f6304d = -9223372036854775807L;

    public TimestampAdjuster(long j2) {
        this.f6302b = j2;
    }

    /* JADX INFO: renamed from: a */
    public synchronized long m3084a(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f6304d != -9223372036854775807L) {
            this.f6304d = j2;
        } else {
            long j3 = this.f6302b;
            if (j3 != Long.MAX_VALUE) {
                this.f6303c = j3 - j2;
            }
            this.f6304d = j2;
            notifyAll();
        }
        return j2 + this.f6303c;
    }

    /* JADX INFO: renamed from: b */
    public synchronized long m3085b(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f6304d;
        if (j3 != -9223372036854775807L) {
            long j4 = (j3 * 90000) / 1000000;
            long j5 = (4294967296L + j4) / 8589934592L;
            long j6 = ((j5 - 1) * 8589934592L) + j2;
            j2 += j5 * 8589934592L;
            if (Math.abs(j6 - j4) < Math.abs(j2 - j4)) {
                j2 = j6;
            }
        }
        return m3084a((j2 * 1000000) / 90000);
    }

    /* JADX INFO: renamed from: c */
    public synchronized long m3086c() {
        return this.f6302b;
    }

    /* JADX INFO: renamed from: d */
    public synchronized long m3087d() {
        long j2;
        j2 = -9223372036854775807L;
        if (this.f6302b == Long.MAX_VALUE) {
            j2 = 0;
        } else if (this.f6304d != -9223372036854775807L) {
            j2 = this.f6303c;
        }
        return j2;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m3088e(long j2) {
        this.f6302b = j2;
        this.f6304d = -9223372036854775807L;
        this.f6301a = false;
    }
}
