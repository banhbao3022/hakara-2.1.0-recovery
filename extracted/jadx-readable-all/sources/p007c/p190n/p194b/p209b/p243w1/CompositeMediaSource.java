package p007c.p190n.p194b.p209b.p243w1;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.p, reason: use source file name */
/* JADX INFO: compiled from: CompositeMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {

    /* JADX INFO: renamed from: l */
    public final HashMap<T, b> f9039l = new HashMap<>();

    /* JADX INFO: renamed from: m */
    public Handler f9040m;

    /* JADX INFO: renamed from: n */
    public TransferListener f9041n;

    /* JADX INFO: renamed from: c.n.b.b.w1.p$a */
    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public final class a implements MediaSourceEventListener, DrmSessionEventListener2 {

        /* JADX INFO: renamed from: f */
        public final T f9042f;

        /* JADX INFO: renamed from: g */
        public MediaSourceEventListener.a f9043g;

        /* JADX INFO: renamed from: h */
        public DrmSessionEventListener2.a f9044h;

        public a(T t) {
            this.f9043g = CompositeMediaSource.this.m4144q(null);
            this.f9044h = CompositeMediaSource.this.m4143p(null);
            this.f9042f = t;
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: B */
        public void mo1130B(int i, MediaSource2.a aVar) {
            if (m4190a(i, aVar)) {
                this.f9044h.m3696b();
            }
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: F */
        public void mo1131F(int i, MediaSource2.a aVar) {
            if (m4190a(i, aVar)) {
                this.f9044h.m3698d();
            }
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: M */
        public void mo1138M(int i, MediaSource2.a aVar) {
            if (m4190a(i, aVar)) {
                this.f9044h.m3695a();
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
        /* JADX INFO: renamed from: P */
        public void mo3498P(int i, MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m4190a(i, aVar)) {
                this.f9043g.m4106i(loadEventInfo, m4191b(mediaLoadData));
            }
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: T */
        public void mo1141T(int i, MediaSource2.a aVar) {
            if (m4190a(i, aVar)) {
                this.f9044h.m3700f();
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
        /* JADX INFO: renamed from: W */
        public void mo3499W(int i, MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            if (m4190a(i, aVar)) {
                this.f9043g.m4109l(loadEventInfo, m4191b(mediaLoadData), iOException, z);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: Y */
        public void mo1144Y(int i, MediaSource2.a aVar) {
            if (m4190a(i, aVar)) {
                this.f9044h.m3697c();
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m4190a(int i, MediaSource2.a aVar) {
            MediaSource2.a aVarMo4187x;
            if (aVar != null) {
                aVarMo4187x = CompositeMediaSource.this.mo4187x(this.f9042f, aVar);
                if (aVarMo4187x == null) {
                    return false;
                }
            } else {
                aVarMo4187x = null;
            }
            Objects.requireNonNull(CompositeMediaSource.this);
            MediaSourceEventListener.a aVar2 = this.f9043g;
            if (aVar2.f8873a != i || !Util6.m3113a(aVar2.f8874b, aVarMo4187x)) {
                this.f9043g = CompositeMediaSource.this.f8982h.m4115r(i, aVarMo4187x, 0L);
            }
            DrmSessionEventListener2.a aVar3 = this.f9044h;
            if (aVar3.f7437a == i && Util6.m3113a(aVar3.f7438b, aVarMo4187x)) {
                return true;
            }
            this.f9044h = new DrmSessionEventListener2.a(CompositeMediaSource.this.f8983i.f7439c, i, aVarMo4187x);
            return true;
        }

        /* JADX INFO: renamed from: b */
        public final MediaLoadData m4191b(MediaLoadData mediaLoadData) {
            CompositeMediaSource compositeMediaSource = CompositeMediaSource.this;
            long j2 = mediaLoadData.f8845f;
            Objects.requireNonNull(compositeMediaSource);
            CompositeMediaSource compositeMediaSource2 = CompositeMediaSource.this;
            long j3 = mediaLoadData.f8846g;
            Objects.requireNonNull(compositeMediaSource2);
            return (j2 == mediaLoadData.f8845f && j3 == mediaLoadData.f8846g) ? mediaLoadData : new MediaLoadData(mediaLoadData.f8840a, mediaLoadData.f8841b, mediaLoadData.f8842c, mediaLoadData.f8843d, mediaLoadData.f8844e, j2, j3);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
        /* JADX INFO: renamed from: k */
        public void mo3506k(int i, MediaSource2.a aVar, MediaLoadData mediaLoadData) {
            if (m4190a(i, aVar)) {
                this.f9043g.m4100c(m4191b(mediaLoadData));
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
        /* JADX INFO: renamed from: l */
        public void mo3507l(int i, MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m4190a(i, aVar)) {
                this.f9043g.m4103f(loadEventInfo, m4191b(mediaLoadData));
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
        /* JADX INFO: renamed from: n */
        public void mo3508n(int i, MediaSource2.a aVar, MediaLoadData mediaLoadData) {
            if (m4190a(i, aVar)) {
                this.f9043g.m4114q(m4191b(mediaLoadData));
            }
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: p */
        public void mo1152p(int i, MediaSource2.a aVar, Exception exc) {
            if (m4190a(i, aVar)) {
                this.f9044h.m3699e(exc);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
        /* JADX INFO: renamed from: r */
        public void mo3509r(int i, MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m4190a(i, aVar)) {
                this.f9043g.m4112o(loadEventInfo, m4191b(mediaLoadData));
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.p$b */
    /* JADX INFO: compiled from: CompositeMediaSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final MediaSource2 f9046a;

        /* JADX INFO: renamed from: b */
        public final MediaSource2.b f9047b;

        /* JADX INFO: renamed from: c */
        public final MediaSourceEventListener f9048c;

        public b(MediaSource2 mediaSource2, MediaSource2.b bVar, MediaSourceEventListener mediaSourceEventListener) {
            this.f9046a = mediaSource2;
            this.f9047b = bVar;
            this.f9048c = mediaSourceEventListener;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: h */
    public void mo4091h() throws IOException {
        Iterator<b> it = this.f9039l.values().iterator();
        while (it.hasNext()) {
            it.next().f9046a.mo4091h();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: r */
    public void mo4145r() {
        for (b bVar : this.f9039l.values()) {
            bVar.f9046a.mo4088e(bVar.f9047b);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: s */
    public void mo4146s() {
        for (b bVar : this.f9039l.values()) {
            bVar.f9046a.mo4096o(bVar.f9047b);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: u */
    public void mo4132u(TransferListener transferListener) {
        this.f9041n = transferListener;
        this.f9040m = Util6.m3124l();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: w */
    public void mo4133w() {
        for (b bVar : this.f9039l.values()) {
            bVar.f9046a.mo4085b(bVar.f9047b);
            bVar.f9046a.mo4087d(bVar.f9048c);
        }
        this.f9039l.clear();
    }

    /* JADX INFO: renamed from: x */
    public MediaSource2.a mo4187x(T t, MediaSource2.a aVar) {
        return aVar;
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo4188y(T t, MediaSource2 mediaSource2, Timeline timeline);

    /* JADX INFO: renamed from: z */
    public final void m4189z(T t, MediaSource2 mediaSource2) {
        final Object obj = null;
        C2096e.m4566b(!this.f9039l.containsKey(null));
        MediaSource2.b bVar = new MediaSource2.b() { // from class: c.n.b.b.w1.a
            @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2.b
            /* JADX INFO: renamed from: a */
            public final void mo4067a(MediaSource2 mediaSource3, Timeline timeline) {
                this.f8838a.mo4188y(obj, mediaSource3, timeline);
            }
        };
        a aVar = new a(null);
        this.f9039l.put(null, new b(mediaSource2, bVar, aVar));
        Handler handler = this.f9040m;
        Objects.requireNonNull(handler);
        mediaSource2.mo4086c(handler, aVar);
        Handler handler2 = this.f9040m;
        Objects.requireNonNull(handler2);
        mediaSource2.mo4090g(handler2, aVar);
        mediaSource2.mo4095n(bVar, this.f9041n);
        if (!this.f8981g.isEmpty()) {
            return;
        }
        mediaSource2.mo4088e(bVar);
    }
}
