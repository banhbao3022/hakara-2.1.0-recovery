package p007c.p190n.p194b.p209b.p243w1;

import java.util.Objects;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DefaultLoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p218q1.DefaultDrmSessionManagerProvider;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManagerProvider;
import p007c.p190n.p194b.p209b.p221s1.DefaultExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;

/* JADX INFO: renamed from: c.n.b.b.w1.j0, reason: use source file name */
/* JADX INFO: compiled from: ProgressiveMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class ProgressiveMediaSource extends BaseMediaSource implements ProgressiveMediaPeriod.b {

    /* JADX INFO: renamed from: l */
    public final MediaItem2 f8950l;

    /* JADX INFO: renamed from: m */
    public final MediaItem2.g f8951m;

    /* JADX INFO: renamed from: n */
    public final DataSource3.a f8952n;

    /* JADX INFO: renamed from: o */
    public final ExtractorsFactory2 f8953o;

    /* JADX INFO: renamed from: p */
    public final DrmSessionManager2 f8954p;

    /* JADX INFO: renamed from: q */
    public final LoadErrorHandlingPolicy f8955q;

    /* JADX INFO: renamed from: r */
    public final int f8956r;

    /* JADX INFO: renamed from: s */
    public boolean f8957s;

    /* JADX INFO: renamed from: t */
    public long f8958t;

    /* JADX INFO: renamed from: u */
    public boolean f8959u;

    /* JADX INFO: renamed from: v */
    public boolean f8960v;

    /* JADX INFO: renamed from: w */
    public TransferListener f8961w;

    /* JADX INFO: renamed from: c.n.b.b.w1.j0$a */
    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public class a extends ForwardingTimeline {
        public a(ProgressiveMediaSource progressiveMediaSource, Timeline timeline) {
            super(timeline);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ForwardingTimeline, p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: o */
        public Timeline.c mo3469o(int i, Timeline.c cVar, long j2) {
            super.mo3469o(i, cVar, j2);
            cVar.f6763n = true;
            return cVar;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.j0$b */
    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public static final class b implements MediaSourceFactory {

        /* JADX INFO: renamed from: a */
        public final DataSource3.a f8962a;

        /* JADX INFO: renamed from: b */
        public ExtractorsFactory2 f8963b;

        /* JADX INFO: renamed from: c */
        public DrmSessionManagerProvider f8964c;

        /* JADX INFO: renamed from: d */
        public LoadErrorHandlingPolicy f8965d;

        /* JADX INFO: renamed from: e */
        public int f8966e;

        public b(DataSource3.a aVar) {
            this(aVar, new DefaultExtractorsFactory());
        }

        public b(DataSource3.a aVar, ExtractorsFactory2 extractorsFactory2) {
            this.f8962a = aVar;
            this.f8963b = extractorsFactory2;
            this.f8964c = new DefaultDrmSessionManagerProvider();
            this.f8965d = new DefaultLoadErrorHandlingPolicy();
            this.f8966e = 1048576;
        }
    }

    public ProgressiveMediaSource(MediaItem2 mediaItem2, DataSource3.a aVar, ExtractorsFactory2 extractorsFactory2, DrmSessionManager2 drmSessionManager2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i) {
        MediaItem2.g gVar = mediaItem2.f7466b;
        Objects.requireNonNull(gVar);
        this.f8951m = gVar;
        this.f8950l = mediaItem2;
        this.f8952n = aVar;
        this.f8953o = extractorsFactory2;
        this.f8954p = drmSessionManager2;
        this.f8955q = loadErrorHandlingPolicy;
        this.f8956r = i;
        this.f8957s = true;
        this.f8958t = -9223372036854775807L;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: a */
    public MediaPeriod mo4084a(MediaSource2.a aVar, Allocator allocator, long j2) {
        DataSource3 dataSource3Mo2953a = this.f8952n.mo2953a();
        TransferListener transferListener = this.f8961w;
        if (transferListener != null) {
            dataSource3Mo2953a.mo2915c(transferListener);
        }
        return new ProgressiveMediaPeriod(this.f8951m.f7518a, dataSource3Mo2953a, this.f8953o, this.f8954p, this.f8983i.m3701g(0, aVar), this.f8955q, this.f8982h.m4115r(0, aVar, 0L), this, allocator, this.f8951m.f7523f, this.f8956r);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: f */
    public MediaItem2 mo4089f() {
        return this.f8950l;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: h */
    public void mo4091h() {
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: j */
    public void mo4093j(MediaPeriod mediaPeriod) {
        ProgressiveMediaPeriod progressiveMediaPeriod = (ProgressiveMediaPeriod) mediaPeriod;
        if (progressiveMediaPeriod.f8890C) {
            for (SampleQueue sampleQueue : progressiveMediaPeriod.f8925z) {
                sampleQueue.m4148A();
            }
        }
        progressiveMediaPeriod.f8917r.m2901g(progressiveMediaPeriod);
        progressiveMediaPeriod.f8922w.removeCallbacksAndMessages(null);
        progressiveMediaPeriod.f8923x = null;
        progressiveMediaPeriod.f8906S = true;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: u */
    public void mo4132u(TransferListener transferListener) {
        this.f8961w = transferListener;
        this.f8954p.prepare();
        m4134x();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: w */
    public void mo4133w() {
        this.f8954p.release();
    }

    /* JADX INFO: renamed from: x */
    public final void m4134x() {
        Timeline singlePeriodTimeline = new SinglePeriodTimeline(this.f8958t, this.f8959u, false, this.f8960v, (Object) null, this.f8950l);
        if (this.f8957s) {
            singlePeriodTimeline = new a(this, singlePeriodTimeline);
        }
        m4147v(singlePeriodTimeline);
    }

    /* JADX INFO: renamed from: y */
    public void m4135y(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.f8958t;
        }
        if (!this.f8957s && this.f8958t == j2 && this.f8959u == z && this.f8960v == z2) {
            return;
        }
        this.f8958t = j2;
        this.f8959u = z;
        this.f8960v = z2;
        this.f8957s = false;
        m4134x();
    }
}
