package p007c.p190n.p194b.p209b.p221s1;

import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.o, reason: use source file name */
/* JADX INFO: compiled from: FlacSeekTableSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class FlacSeekTableSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a */
    public final FlacStreamMetadata f8453a;

    /* JADX INFO: renamed from: b */
    public final long f8454b;

    public FlacSeekTableSeekMap(FlacStreamMetadata flacStreamMetadata, long j2) {
        this.f8453a = flacStreamMetadata;
        this.f8454b = j2;
    }

    /* JADX INFO: renamed from: c */
    public final SeekPoint m3907c(long j2, long j3) {
        return new SeekPoint((j2 * 1000000) / ((long) this.f8453a.f8500e), this.f8454b + j3);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: d */
    public boolean mo3716d() {
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: h */
    public SeekMap.a mo3717h(long j2) {
        C2096e.m4572h(this.f8453a.f8506k);
        FlacStreamMetadata flacStreamMetadata = this.f8453a;
        FlacStreamMetadata.a aVar = flacStreamMetadata.f8506k;
        long[] jArr = aVar.f8508a;
        long[] jArr2 = aVar.f8509b;
        int iM3118f = Util6.m3118f(jArr, flacStreamMetadata.m3922g(j2), true, false);
        SeekPoint seekPointM3907c = m3907c(iM3118f == -1 ? 0L : jArr[iM3118f], iM3118f != -1 ? jArr2[iM3118f] : 0L);
        if (seekPointM3907c.f8525b == j2 || iM3118f == jArr.length - 1) {
            return new SeekMap.a(seekPointM3907c);
        }
        int i = iM3118f + 1;
        return new SeekMap.a(seekPointM3907c, m3907c(jArr[i], jArr2[i]));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: i */
    public long mo3718i() {
        return this.f8453a.m3919d();
    }
}
