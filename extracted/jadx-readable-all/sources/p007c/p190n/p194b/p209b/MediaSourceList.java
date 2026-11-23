package p007c.p190n.p194b.p209b;

import android.os.Handler;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsCollector;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;
import p007c.p190n.p194b.p209b.p243w1.MaskingMediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.MaskingMediaSource;
import p007c.p190n.p194b.p209b.p243w1.MediaLoadData;
import p007c.p190n.p194b.p209b.p243w1.MediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener;
import p007c.p190n.p194b.p209b.p243w1.ShuffleOrder;

/* JADX INFO: renamed from: c.n.b.b.y0, reason: use source file name */
/* JADX INFO: compiled from: MediaSourceList.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaSourceList {

    /* JADX INFO: renamed from: d */
    public final d f10182d;

    /* JADX INFO: renamed from: e */
    public final MediaSourceEventListener.a f10183e;

    /* JADX INFO: renamed from: f */
    public final DrmSessionEventListener2.a f10184f;

    /* JADX INFO: renamed from: g */
    public final HashMap<c, b> f10185g;

    /* JADX INFO: renamed from: h */
    public final Set<c> f10186h;

    /* JADX INFO: renamed from: j */
    public boolean f10188j;

    /* JADX INFO: renamed from: k */
    public TransferListener f10189k;

    /* JADX INFO: renamed from: i */
    public ShuffleOrder f10187i = new ShuffleOrder.a(0);

    /* JADX INFO: renamed from: b */
    public final IdentityHashMap<MediaPeriod, c> f10180b = new IdentityHashMap<>();

    /* JADX INFO: renamed from: c */
    public final Map<Object, c> f10181c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final List<c> f10179a = new ArrayList();

    /* JADX INFO: renamed from: c.n.b.b.y0$a */
    /* JADX INFO: compiled from: MediaSourceList.java */
    public final class a implements MediaSourceEventListener, DrmSessionEventListener2 {

        /* JADX INFO: renamed from: f */
        public final c f10190f;

        /* JADX INFO: renamed from: g */
        public MediaSourceEventListener.a f10191g;

        /* JADX INFO: renamed from: h */
        public DrmSessionEventListener2.a f10192h;

        public a(c cVar) {
            this.f10191g = MediaSourceList.this.f10183e;
            this.f10192h = MediaSourceList.this.f10184f;
            this.f10190f = cVar;
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: B */
        public void mo1130B(int i, MediaSource2.a aVar) {
            if (m4504a(i, aVar)) {
                this.f10192h.m3696b();
            }
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: F */
        public void mo1131F(int i, MediaSource2.a aVar) {
            if (m4504a(i, aVar)) {
                this.f10192h.m3698d();
            }
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: M */
        public void mo1138M(int i, MediaSource2.a aVar) {
            if (m4504a(i, aVar)) {
                this.f10192h.m3695a();
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
        /* JADX INFO: renamed from: P */
        public void mo3498P(int i, MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m4504a(i, aVar)) {
                this.f10191g.m4106i(loadEventInfo, mediaLoadData);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: T */
        public void mo1141T(int i, MediaSource2.a aVar) {
            if (m4504a(i, aVar)) {
                this.f10192h.m3700f();
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
        /* JADX INFO: renamed from: W */
        public void mo3499W(int i, MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            if (m4504a(i, aVar)) {
                this.f10191g.m4109l(loadEventInfo, mediaLoadData, iOException, z);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: Y */
        public void mo1144Y(int i, MediaSource2.a aVar) {
            if (m4504a(i, aVar)) {
                this.f10192h.m3697c();
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m4504a(int i, MediaSource2.a aVar) {
            MediaSource2.a aVarM4097b = null;
            if (aVar != null) {
                c cVar = this.f10190f;
                for (int i2 = 0; i2 < cVar.f10199c.size(); i2++) {
                    if (cVar.f10199c.get(i2).f8860d == aVar.f8860d) {
                        Object obj = aVar.f8857a;
                        Object obj2 = cVar.f10198b;
                        int i3 = AbstractConcatenatedTimeline.f10369b;
                        aVarM4097b = aVar.m4097b(Pair.create(obj2, obj));
                        break;
                    }
                }
                if (aVarM4097b == null) {
                    return false;
                }
            }
            int i4 = i + this.f10190f.f10200d;
            MediaSourceEventListener.a aVar2 = this.f10191g;
            if (aVar2.f8873a != i4 || !Util6.m3113a(aVar2.f8874b, aVarM4097b)) {
                this.f10191g = MediaSourceList.this.f10183e.m4115r(i4, aVarM4097b, 0L);
            }
            DrmSessionEventListener2.a aVar3 = this.f10192h;
            if (aVar3.f7437a == i4 && Util6.m3113a(aVar3.f7438b, aVarM4097b)) {
                return true;
            }
            this.f10192h = MediaSourceList.this.f10184f.m3701g(i4, aVarM4097b);
            return true;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
        /* JADX INFO: renamed from: k */
        public void mo3506k(int i, MediaSource2.a aVar, MediaLoadData mediaLoadData) {
            if (m4504a(i, aVar)) {
                this.f10191g.m4100c(mediaLoadData);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
        /* JADX INFO: renamed from: l */
        public void mo3507l(int i, MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m4504a(i, aVar)) {
                this.f10191g.m4103f(loadEventInfo, mediaLoadData);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
        /* JADX INFO: renamed from: n */
        public void mo3508n(int i, MediaSource2.a aVar, MediaLoadData mediaLoadData) {
            if (m4504a(i, aVar)) {
                this.f10191g.m4114q(mediaLoadData);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: p */
        public void mo1152p(int i, MediaSource2.a aVar, Exception exc) {
            if (m4504a(i, aVar)) {
                this.f10192h.m3699e(exc);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
        /* JADX INFO: renamed from: r */
        public void mo3509r(int i, MediaSource2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m4504a(i, aVar)) {
                this.f10191g.m4112o(loadEventInfo, mediaLoadData);
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.y0$b */
    /* JADX INFO: compiled from: MediaSourceList.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final MediaSource2 f10194a;

        /* JADX INFO: renamed from: b */
        public final MediaSource2.b f10195b;

        /* JADX INFO: renamed from: c */
        public final MediaSourceEventListener f10196c;

        public b(MediaSource2 mediaSource2, MediaSource2.b bVar, MediaSourceEventListener mediaSourceEventListener) {
            this.f10194a = mediaSource2;
            this.f10195b = bVar;
            this.f10196c = mediaSourceEventListener;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.y0$c */
    /* JADX INFO: compiled from: MediaSourceList.java */
    public static final class c implements MediaSourceInfoHolder {

        /* JADX INFO: renamed from: a */
        public final MaskingMediaSource f10197a;

        /* JADX INFO: renamed from: d */
        public int f10200d;

        /* JADX INFO: renamed from: e */
        public boolean f10201e;

        /* JADX INFO: renamed from: c */
        public final List<MediaSource2.a> f10199c = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Object f10198b = new Object();

        public c(MediaSource2 mediaSource2, boolean z) {
            this.f10197a = new MaskingMediaSource(mediaSource2, z);
        }

        @Override // p007c.p190n.p194b.p209b.MediaSourceInfoHolder
        /* JADX INFO: renamed from: a */
        public Object mo3381a() {
            return this.f10198b;
        }

        @Override // p007c.p190n.p194b.p209b.MediaSourceInfoHolder
        /* JADX INFO: renamed from: b */
        public Timeline mo3382b() {
            return this.f10197a.f9768s;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.y0$d */
    /* JADX INFO: compiled from: MediaSourceList.java */
    public interface d {
    }

    public MediaSourceList(d dVar, AnalyticsCollector analyticsCollector, Handler handler) {
        this.f10182d = dVar;
        MediaSourceEventListener.a aVar = new MediaSourceEventListener.a();
        this.f10183e = aVar;
        DrmSessionEventListener2.a aVar2 = new DrmSessionEventListener2.a();
        this.f10184f = aVar2;
        this.f10185g = new HashMap<>();
        this.f10186h = new HashSet();
        if (analyticsCollector != null) {
            Objects.requireNonNull(handler);
            aVar.f8875c.add(new MediaSourceEventListener.a.C8511a(handler, analyticsCollector));
            aVar2.f7439c.add(new DrmSessionEventListener2.a.C8510a(handler, analyticsCollector));
        }
    }

    /* JADX INFO: renamed from: a */
    public Timeline m4495a(int i, List<c> list, ShuffleOrder shuffleOrder) {
        if (!list.isEmpty()) {
            this.f10187i = shuffleOrder;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    c cVar2 = this.f10179a.get(i2 - 1);
                    cVar.f10200d = cVar2.f10197a.f9768s.mo3356p() + cVar2.f10200d;
                    cVar.f10201e = false;
                    cVar.f10199c.clear();
                } else {
                    cVar.f10200d = 0;
                    cVar.f10201e = false;
                    cVar.f10199c.clear();
                }
                m4496b(i2, cVar.f10197a.f9768s.mo3356p());
                this.f10179a.add(i2, cVar);
                this.f10181c.put(cVar.f10198b, cVar);
                if (this.f10188j) {
                    m4501g(cVar);
                    if (this.f10180b.isEmpty()) {
                        this.f10186h.add(cVar);
                    } else {
                        b bVar = this.f10185g.get(cVar);
                        if (bVar != null) {
                            bVar.f10194a.mo4088e(bVar.f10195b);
                        }
                    }
                }
            }
        }
        return m4497c();
    }

    /* JADX INFO: renamed from: b */
    public final void m4496b(int i, int i2) {
        while (i < this.f10179a.size()) {
            this.f10179a.get(i).f10200d += i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public Timeline m4497c() {
        if (this.f10179a.isEmpty()) {
            return Timeline.f6743a;
        }
        int iMo3356p = 0;
        for (int i = 0; i < this.f10179a.size(); i++) {
            c cVar = this.f10179a.get(i);
            cVar.f10200d = iMo3356p;
            iMo3356p += cVar.f10197a.f9768s.mo3356p();
        }
        return new PlaylistTimeline(this.f10179a, this.f10187i);
    }

    /* JADX INFO: renamed from: d */
    public final void m4498d() {
        Iterator<c> it = this.f10186h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f10199c.isEmpty()) {
                b bVar = this.f10185g.get(next);
                if (bVar != null) {
                    bVar.f10194a.mo4088e(bVar.f10195b);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public int m4499e() {
        return this.f10179a.size();
    }

    /* JADX INFO: renamed from: f */
    public final void m4500f(c cVar) {
        if (cVar.f10201e && cVar.f10199c.isEmpty()) {
            b bVarRemove = this.f10185g.remove(cVar);
            Objects.requireNonNull(bVarRemove);
            bVarRemove.f10194a.mo4085b(bVarRemove.f10195b);
            bVarRemove.f10194a.mo4087d(bVarRemove.f10196c);
            this.f10186h.remove(cVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4501g(c cVar) {
        MaskingMediaSource maskingMediaSource = cVar.f10197a;
        MediaSource2.b bVar = new MediaSource2.b() { // from class: c.n.b.b.x
            @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2.b
            /* JADX INFO: renamed from: a */
            public final void mo4067a(MediaSource2 mediaSource2, Timeline timeline) {
                ((ExoPlayerImplInternal2) this.f9777a.f10182d).f6693l.m3074d(22);
            }
        };
        a aVar = new a(cVar);
        this.f10185g.put(cVar, new b(maskingMediaSource, bVar, aVar));
        maskingMediaSource.mo4086c(new Handler(Util6.m3132t(), null), aVar);
        Handler handler = new Handler(Util6.m3132t(), null);
        DrmSessionEventListener2.a aVar2 = maskingMediaSource.f8983i;
        Objects.requireNonNull(aVar2);
        aVar2.f7439c.add(new DrmSessionEventListener2.a.C8510a(handler, aVar));
        maskingMediaSource.mo4095n(bVar, this.f10189k);
    }

    /* JADX INFO: renamed from: h */
    public void m4502h(MediaPeriod mediaPeriod) {
        c cVarRemove = this.f10180b.remove(mediaPeriod);
        Objects.requireNonNull(cVarRemove);
        cVarRemove.f10197a.mo4093j(mediaPeriod);
        cVarRemove.f10199c.remove(((MaskingMediaPeriod) mediaPeriod).f9757f);
        if (!this.f10180b.isEmpty()) {
            m4498d();
        }
        m4500f(cVarRemove);
    }

    /* JADX INFO: renamed from: i */
    public final void m4503i(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            c cVarRemove = this.f10179a.remove(i3);
            this.f10181c.remove(cVarRemove.f10198b);
            m4496b(i3, -cVarRemove.f10197a.f9768s.mo3356p());
            cVarRemove.f10201e = true;
            if (this.f10188j) {
                m4500f(cVarRemove);
            }
        }
    }
}
