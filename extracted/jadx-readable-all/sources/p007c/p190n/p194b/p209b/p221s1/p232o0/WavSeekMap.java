package p007c.p190n.p194b.p209b.p221s1.p232o0;

import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.SeekPoint;

/* JADX INFO: renamed from: c.n.b.b.s1.o0.e, reason: use source file name */
/* JADX INFO: compiled from: WavSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class WavSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a */
    public final WavHeader f8491a;

    /* JADX INFO: renamed from: b */
    public final int f8492b;

    /* JADX INFO: renamed from: c */
    public final long f8493c;

    /* JADX INFO: renamed from: d */
    public final long f8494d;

    /* JADX INFO: renamed from: e */
    public final long f8495e;

    public WavSeekMap(WavHeader wavHeader, int i, long j2, long j3) {
        this.f8491a = wavHeader;
        this.f8492b = i;
        this.f8493c = j2;
        long j4 = (j3 - j2) / ((long) wavHeader.f8486d);
        this.f8494d = j4;
        this.f8495e = m3914c(j4);
    }

    /* JADX INFO: renamed from: c */
    public final long m3914c(long j2) {
        return Util6.m3104M(j2 * ((long) this.f8492b), 1000000L, this.f8491a.f8485c);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: d */
    public boolean mo3716d() {
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: h */
    public SeekMap.a mo3717h(long j2) {
        long jM3122j = Util6.m3122j((((long) this.f8491a.f8485c) * j2) / (((long) this.f8492b) * 1000000), 0L, this.f8494d - 1);
        long j3 = (((long) this.f8491a.f8486d) * jM3122j) + this.f8493c;
        long jM3914c = m3914c(jM3122j);
        SeekPoint seekPoint = new SeekPoint(jM3914c, j3);
        if (jM3914c >= j2 || jM3122j == this.f8494d - 1) {
            return new SeekMap.a(seekPoint);
        }
        long j4 = jM3122j + 1;
        return new SeekMap.a(seekPoint, new SeekPoint(m3914c(j4), (((long) this.f8491a.f8486d) * j4) + this.f8493c));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: i */
    public long mo3718i() {
        return this.f8495e;
    }
}
