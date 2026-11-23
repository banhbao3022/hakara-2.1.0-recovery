package p007c.p190n.p194b.p209b.p221s1.p227j0;

import p007c.p190n.p194b.p209b.p215n1.MpegAudioUtil;
import p007c.p190n.p194b.p209b.p221s1.ConstantBitrateSeekMap;

/* JADX INFO: renamed from: c.n.b.b.s1.j0.c, reason: use source file name */
/* JADX INFO: compiled from: ConstantBitrateSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    public ConstantBitrateSeeker(long j2, long j3, MpegAudioUtil.a aVar) {
        super(j2, j3, aVar.f7005f, aVar.f7002c);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p227j0.Seeker
    /* JADX INFO: renamed from: a */
    public long mo3797a(long j2) {
        return ConstantBitrateSeekMap.m3727e(j2, this.f7558b, this.f7561e);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p227j0.Seeker
    /* JADX INFO: renamed from: b */
    public long mo3798b() {
        return -1L;
    }
}
