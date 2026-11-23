package p007c.p190n.p194b.p209b.p243w1;

import android.util.Pair;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.z, reason: use source file name */
/* JADX INFO: compiled from: MaskingMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class MaskingMediaSource extends CompositeMediaSource<Void> {

    /* JADX INFO: renamed from: o */
    public final MediaSource2 f9764o;

    /* JADX INFO: renamed from: p */
    public final boolean f9765p;

    /* JADX INFO: renamed from: q */
    public final Timeline.c f9766q;

    /* JADX INFO: renamed from: r */
    public final Timeline.b f9767r;

    /* JADX INFO: renamed from: s */
    public a f9768s;

    /* JADX INFO: renamed from: t */
    public MaskingMediaPeriod f9769t;

    /* JADX INFO: renamed from: u */
    public boolean f9770u;

    /* JADX INFO: renamed from: v */
    public boolean f9771v;

    /* JADX INFO: renamed from: w */
    public boolean f9772w;

    /* JADX INFO: renamed from: c.n.b.b.w1.z$a */
    /* JADX INFO: compiled from: MaskingMediaSource.java */
    public static final class a extends ForwardingTimeline {

        /* JADX INFO: renamed from: c */
        public static final Object f9773c = new Object();

        /* JADX INFO: renamed from: d */
        public final Object f9774d;

        /* JADX INFO: renamed from: e */
        public final Object f9775e;

        public a(Timeline timeline, Object obj, Object obj2) {
            super(timeline);
            this.f9774d = obj;
            this.f9775e = obj2;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ForwardingTimeline, p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: b */
        public int mo3457b(Object obj) {
            Object obj2;
            Timeline timeline = this.f9166b;
            if (f9773c.equals(obj) && (obj2 = this.f9775e) != null) {
                obj = obj2;
            }
            return timeline.mo3457b(obj);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ForwardingTimeline, p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: g */
        public Timeline.b mo3462g(int i, Timeline.b bVar, boolean z) {
            this.f9166b.mo3462g(i, bVar, z);
            if (Util6.m3113a(bVar.f6745b, this.f9775e) && z) {
                bVar.f6745b = f9773c;
            }
            return bVar;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ForwardingTimeline, p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: m */
        public Object mo3467m(int i) {
            Object objMo3467m = this.f9166b.mo3467m(i);
            return Util6.m3113a(objMo3467m, this.f9775e) ? f9773c : objMo3467m;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.ForwardingTimeline, p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: o */
        public Timeline.c mo3469o(int i, Timeline.c cVar, long j2) {
            this.f9166b.mo3469o(i, cVar, j2);
            if (Util6.m3113a(cVar.f6752c, this.f9774d)) {
                cVar.f6752c = Timeline.c.f6750a;
            }
            return cVar;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.z$b */
    /* JADX INFO: compiled from: MaskingMediaSource.java */
    public static final class b extends Timeline {

        /* JADX INFO: renamed from: b */
        public final MediaItem2 f9776b;

        public b(MediaItem2 mediaItem2) {
            this.f9776b = mediaItem2;
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: b */
        public int mo3457b(Object obj) {
            return obj == a.f9773c ? 0 : -1;
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: g */
        public Timeline.b mo3462g(int i, Timeline.b bVar, boolean z) {
            bVar.m3476f(z ? 0 : null, z ? a.f9773c : null, 0, -9223372036854775807L, 0L);
            return bVar;
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: i */
        public int mo3355i() {
            return 1;
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: m */
        public Object mo3467m(int i) {
            return a.f9773c;
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: o */
        public Timeline.c mo3469o(int i, Timeline.c cVar, long j2) {
            cVar.m3480d(Timeline.c.f6750a, this.f9776b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f6763n = true;
            return cVar;
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: p */
        public int mo3356p() {
            return 1;
        }
    }

    public MaskingMediaSource(MediaSource2 mediaSource2, boolean z) {
        this.f9764o = mediaSource2;
        this.f9765p = z && mediaSource2.mo4092i();
        this.f9766q = new Timeline.c();
        this.f9767r = new Timeline.b();
        Timeline timelineMo4094m = mediaSource2.mo4094m();
        if (timelineMo4094m == null) {
            this.f9768s = new a(new b(mediaSource2.mo4089f()), Timeline.c.f6750a, a.f9773c);
        } else {
            this.f9768s = new a(timelineMo4094m, null, null);
            this.f9772w = true;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public MaskingMediaPeriod mo4084a(MediaSource2.a aVar, Allocator allocator, long j2) {
        MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(aVar, allocator, j2);
        MediaSource2 mediaSource2 = this.f9764o;
        C2096e.m4570f(maskingMediaPeriod.f9760i == null);
        maskingMediaPeriod.f9760i = mediaSource2;
        if (this.f9771v) {
            Object obj = aVar.f8857a;
            if (this.f9768s.f9775e != null && obj.equals(a.f9773c)) {
                obj = this.f9768s.f9775e;
            }
            maskingMediaPeriod.m4388a(aVar.m4097b(obj));
        } else {
            this.f9769t = maskingMediaPeriod;
            if (!this.f9770u) {
                this.f9770u = true;
                m4189z(null, this.f9764o);
            }
        }
        return maskingMediaPeriod;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* JADX INFO: renamed from: B */
    public final void m4390B(long j2) {
        MaskingMediaPeriod maskingMediaPeriod = this.f9769t;
        int iMo3457b = this.f9768s.mo3457b(maskingMediaPeriod.f9757f.f8857a);
        if (iMo3457b == -1) {
            return;
        }
        long j3 = this.f9768s.m3461f(iMo3457b, this.f9767r).f6747d;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        maskingMediaPeriod.f9763l = j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: f */
    public MediaItem2 mo4089f() {
        return this.f9764o.mo4089f();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.CompositeMediaSource, p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: h */
    public void mo4091h() {
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: j */
    public void mo4093j(MediaPeriod mediaPeriod) {
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) mediaPeriod;
        if (maskingMediaPeriod.f9761j != null) {
            MediaSource2 mediaSource2 = maskingMediaPeriod.f9760i;
            Objects.requireNonNull(mediaSource2);
            mediaSource2.mo4093j(maskingMediaPeriod.f9761j);
        }
        if (mediaPeriod == this.f9769t) {
            this.f9769t = null;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.CompositeMediaSource, p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: u */
    public void mo4132u(TransferListener transferListener) {
        this.f9041n = transferListener;
        this.f9040m = Util6.m3124l();
        if (this.f9765p) {
            return;
        }
        this.f9770u = true;
        m4189z(null, this.f9764o);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.CompositeMediaSource, p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: w */
    public void mo4133w() {
        this.f9771v = false;
        this.f9770u = false;
        super.mo4133w();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.CompositeMediaSource
    /* JADX INFO: renamed from: x */
    public MediaSource2.a mo4187x(Void r2, MediaSource2.a aVar) {
        Object obj = aVar.f8857a;
        Object obj2 = this.f9768s.f9775e;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f9773c;
        }
        return aVar.m4097b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // p007c.p190n.p194b.p209b.p243w1.CompositeMediaSource
    /* JADX INFO: renamed from: y */
    public void mo4188y(Void r10, MediaSource2 mediaSource2, Timeline timeline) {
        long j2;
        a aVar;
        MediaSource2.a aVarM4097b;
        a aVar2;
        if (this.f9771v) {
            a aVar3 = this.f9768s;
            this.f9768s = new a(timeline, aVar3.f9774d, aVar3.f9775e);
            MaskingMediaPeriod maskingMediaPeriod = this.f9769t;
            if (maskingMediaPeriod != null) {
                m4390B(maskingMediaPeriod.f9763l);
            }
        } else {
            if (!timeline.m3470q()) {
                timeline.m3468n(0, this.f9766q);
                Timeline.c cVar = this.f9766q;
                long j3 = cVar.f6766q;
                Object obj = cVar.f6752c;
                MaskingMediaPeriod maskingMediaPeriod2 = this.f9769t;
                if (maskingMediaPeriod2 != null) {
                    long j4 = maskingMediaPeriod2.f9758g;
                    this.f9768s.mo3463h(maskingMediaPeriod2.f9757f.f8857a, this.f9767r);
                    long j5 = this.f9767r.f6748e + j4;
                    if (j5 != this.f9768s.m3468n(0, this.f9766q).f6766q) {
                        j2 = j5;
                    } else {
                        j2 = j3;
                    }
                } else {
                    j2 = j3;
                }
                Pair<Object, Long> pairM3464j = timeline.m3464j(this.f9766q, this.f9767r, 0, j2);
                Object obj2 = pairM3464j.first;
                long jLongValue = ((Long) pairM3464j.second).longValue();
                if (this.f9772w) {
                    a aVar4 = this.f9768s;
                    aVar = new a(timeline, aVar4.f9774d, aVar4.f9775e);
                } else {
                    aVar = new a(timeline, obj, obj2);
                }
                this.f9768s = aVar;
                MaskingMediaPeriod maskingMediaPeriod3 = this.f9769t;
                if (maskingMediaPeriod3 != null) {
                    m4390B(jLongValue);
                    MediaSource2.a aVar5 = maskingMediaPeriod3.f9757f;
                    Object obj3 = aVar5.f8857a;
                    if (this.f9768s.f9775e != null && obj3.equals(a.f9773c)) {
                        obj3 = this.f9768s.f9775e;
                    }
                    aVarM4097b = aVar5.m4097b(obj3);
                }
                this.f9772w = true;
                this.f9771v = true;
                m4147v(this.f9768s);
                if (aVarM4097b != null) {
                    MaskingMediaPeriod maskingMediaPeriod4 = this.f9769t;
                    Objects.requireNonNull(maskingMediaPeriod4);
                    maskingMediaPeriod4.m4388a(aVarM4097b);
                }
            }
            if (this.f9772w) {
                a aVar6 = this.f9768s;
                aVar2 = new a(timeline, aVar6.f9774d, aVar6.f9775e);
            } else {
                aVar2 = new a(timeline, Timeline.c.f6750a, a.f9773c);
            }
            this.f9768s = aVar2;
        }
        aVarM4097b = null;
        this.f9772w = true;
        this.f9771v = true;
        m4147v(this.f9768s);
        if (aVarM4097b != null) {
            MaskingMediaPeriod maskingMediaPeriod5 = this.f9769t;
            Objects.requireNonNull(maskingMediaPeriod5);
            maskingMediaPeriod5.m4388a(aVarM4097b);
        }
    }
}
