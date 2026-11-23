package p007c.p190n.p194b.p209b.p243w1;

import java.io.IOException;
import java.util.Objects;
import p007c.p190n.p194b.p209b.SeekParameters;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;

/* JADX INFO: renamed from: c.n.b.b.w1.y, reason: use source file name */
/* JADX INFO: compiled from: MaskingMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class MaskingMediaPeriod implements MediaPeriod, MediaPeriod.a {

    /* JADX INFO: renamed from: f */
    public final MediaSource2.a f9757f;

    /* JADX INFO: renamed from: g */
    public final long f9758g;

    /* JADX INFO: renamed from: h */
    public final Allocator f9759h;

    /* JADX INFO: renamed from: i */
    public MediaSource2 f9760i;

    /* JADX INFO: renamed from: j */
    public MediaPeriod f9761j;

    /* JADX INFO: renamed from: k */
    public MediaPeriod.a f9762k;

    /* JADX INFO: renamed from: l */
    public long f9763l = -9223372036854775807L;

    public MaskingMediaPeriod(MediaSource2.a aVar, Allocator allocator, long j2) {
        this.f9757f = aVar;
        this.f9759h = allocator;
        this.f9758g = j2;
    }

    /* JADX INFO: renamed from: a */
    public void m4388a(MediaSource2.a aVar) {
        long j2 = this.f9758g;
        long j3 = this.f9763l;
        if (j3 != -9223372036854775807L) {
            j2 = j3;
        }
        MediaSource2 mediaSource2 = this.f9760i;
        Objects.requireNonNull(mediaSource2);
        MediaPeriod mediaPeriodMo4084a = mediaSource2.mo4084a(aVar, this.f9759h, j2);
        this.f9761j = mediaPeriodMo4084a;
        if (this.f9762k != null) {
            mediaPeriodMo4084a.mo4077q(this, j2);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: b */
    public long mo4068b() {
        MediaPeriod mediaPeriod = this.f9761j;
        int i = Util6.f6307a;
        return mediaPeriod.mo4068b();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: d */
    public boolean mo4069d(long j2) {
        MediaPeriod mediaPeriod = this.f9761j;
        return mediaPeriod != null && mediaPeriod.mo4069d(j2);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public boolean mo4070e() {
        MediaPeriod mediaPeriod = this.f9761j;
        return mediaPeriod != null && mediaPeriod.mo4070e();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: f */
    public long mo4071f(long j2, SeekParameters seekParameters) {
        MediaPeriod mediaPeriod = this.f9761j;
        int i = Util6.f6307a;
        return mediaPeriod.mo4071f(j2, seekParameters);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: g */
    public long mo4072g() {
        MediaPeriod mediaPeriod = this.f9761j;
        int i = Util6.f6307a;
        return mediaPeriod.mo4072g();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: h */
    public void mo4073h(long j2) {
        MediaPeriod mediaPeriod = this.f9761j;
        int i = Util6.f6307a;
        mediaPeriod.mo4073h(j2);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader.a
    /* JADX INFO: renamed from: i */
    public void mo3428i(SequenceableLoader sequenceableLoader) {
        MediaPeriod.a aVar = this.f9762k;
        int i = Util6.f6307a;
        aVar.mo3428i(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod.a
    /* JADX INFO: renamed from: j */
    public void mo3429j(MediaPeriod mediaPeriod) {
        MediaPeriod.a aVar = this.f9762k;
        int i = Util6.f6307a;
        aVar.mo3429j(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: m */
    public void mo4074m() throws IOException {
        try {
            MediaPeriod mediaPeriod = this.f9761j;
            if (mediaPeriod != null) {
                mediaPeriod.mo4074m();
                return;
            }
            MediaSource2 mediaSource2 = this.f9760i;
            if (mediaSource2 != null) {
                mediaSource2.mo4091h();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: n */
    public long mo4075n(long j2) {
        MediaPeriod mediaPeriod = this.f9761j;
        int i = Util6.f6307a;
        return mediaPeriod.mo4075n(j2);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: p */
    public long mo4076p() {
        MediaPeriod mediaPeriod = this.f9761j;
        int i = Util6.f6307a;
        return mediaPeriod.mo4076p();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: q */
    public void mo4077q(MediaPeriod.a aVar, long j2) {
        this.f9762k = aVar;
        MediaPeriod mediaPeriod = this.f9761j;
        if (mediaPeriod != null) {
            long j3 = this.f9758g;
            long j4 = this.f9763l;
            if (j4 != -9223372036854775807L) {
                j3 = j4;
            }
            mediaPeriod.mo4077q(this, j3);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: r */
    public long mo4078r(ExoTrackSelection2[] exoTrackSelection2Arr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        long j3;
        long j4 = this.f9763l;
        if (j4 == -9223372036854775807L || j2 != this.f9758g) {
            j3 = j2;
        } else {
            this.f9763l = -9223372036854775807L;
            j3 = j4;
        }
        MediaPeriod mediaPeriod = this.f9761j;
        int i = Util6.f6307a;
        return mediaPeriod.mo4078r(exoTrackSelection2Arr, zArr, sampleStreamArr, zArr2, j3);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: s */
    public TrackGroupArray mo4079s() {
        MediaPeriod mediaPeriod = this.f9761j;
        int i = Util6.f6307a;
        return mediaPeriod.mo4079s();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: u */
    public void mo4080u(long j2, boolean z) {
        MediaPeriod mediaPeriod = this.f9761j;
        int i = Util6.f6307a;
        mediaPeriod.mo4080u(j2, z);
    }
}
