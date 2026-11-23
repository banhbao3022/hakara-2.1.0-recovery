package p007c.p190n.p194b.p209b.p243w1;

import java.io.IOException;
import p007c.p190n.p194b.p209b.SeekParameters;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;

/* JADX INFO: renamed from: c.n.b.b.w1.b0, reason: use source file name */
/* JADX INFO: compiled from: MediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public interface MediaPeriod extends SequenceableLoader {

    /* JADX INFO: renamed from: c.n.b.b.w1.b0$a */
    /* JADX INFO: compiled from: MediaPeriod.java */
    public interface a extends SequenceableLoader.a<MediaPeriod> {
        /* JADX INFO: renamed from: j */
        void mo3429j(MediaPeriod mediaPeriod);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: b */
    long mo4068b();

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: d */
    boolean mo4069d(long j2);

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: e */
    boolean mo4070e();

    /* JADX INFO: renamed from: f */
    long mo4071f(long j2, SeekParameters seekParameters);

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: g */
    long mo4072g();

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: h */
    void mo4073h(long j2);

    /* JADX INFO: renamed from: m */
    void mo4074m() throws IOException;

    /* JADX INFO: renamed from: n */
    long mo4075n(long j2);

    /* JADX INFO: renamed from: p */
    long mo4076p();

    /* JADX INFO: renamed from: q */
    void mo4077q(a aVar, long j2);

    /* JADX INFO: renamed from: r */
    long mo4078r(ExoTrackSelection2[] exoTrackSelection2Arr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2);

    /* JADX INFO: renamed from: s */
    TrackGroupArray mo4079s();

    /* JADX INFO: renamed from: u */
    void mo4080u(long j2, boolean z);
}
