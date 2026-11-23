package p007c.p190n.p194b.p209b.p221s1;

import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.s1.d, reason: use source file name */
/* JADX INFO: compiled from: ConstantBitrateSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public class ConstantBitrateSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a */
    public final long f7557a;

    /* JADX INFO: renamed from: b */
    public final long f7558b;

    /* JADX INFO: renamed from: c */
    public final int f7559c;

    /* JADX INFO: renamed from: d */
    public final long f7560d;

    /* JADX INFO: renamed from: e */
    public final int f7561e;

    /* JADX INFO: renamed from: f */
    public final long f7562f;

    public ConstantBitrateSeekMap(long j2, long j3, int i, int i2) {
        this.f7557a = j2;
        this.f7558b = j3;
        this.f7559c = i2 == -1 ? 1 : i2;
        this.f7561e = i;
        if (j2 == -1) {
            this.f7560d = -1L;
            this.f7562f = -9223372036854775807L;
        } else {
            this.f7560d = j2 - j3;
            this.f7562f = m3727e(j2, j3, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m3727e(long j2, long j3, int i) {
        return ((Math.max(0L, j2 - j3) * 8) * 1000000) / ((long) i);
    }

    /* JADX INFO: renamed from: c */
    public long m3728c(long j2) {
        return m3727e(j2, this.f7558b, this.f7561e);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: d */
    public boolean mo3716d() {
        return this.f7560d != -1;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: h */
    public SeekMap.a mo3717h(long j2) {
        long j3 = this.f7560d;
        if (j3 == -1) {
            return new SeekMap.a(new SeekPoint(0L, this.f7558b));
        }
        long j4 = (((long) this.f7561e) * j2) / 8000000;
        long j5 = this.f7559c;
        long jM3122j = this.f7558b + Util6.m3122j((j4 / j5) * j5, 0L, j3 - j5);
        long jM3728c = m3728c(jM3122j);
        SeekPoint seekPoint = new SeekPoint(jM3728c, jM3122j);
        if (jM3728c < j2) {
            int i = this.f7559c;
            if (((long) i) + jM3122j < this.f7557a) {
                long j6 = jM3122j + ((long) i);
                return new SeekMap.a(seekPoint, new SeekPoint(m3728c(j6), j6));
            }
        }
        return new SeekMap.a(seekPoint);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: i */
    public long mo3718i() {
        return this.f7562f;
    }
}
