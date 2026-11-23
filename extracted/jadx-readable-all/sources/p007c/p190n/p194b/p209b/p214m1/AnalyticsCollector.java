package p007c.p190n.p194b.p209b.p214m1;

import android.util.SparseArray;
import android.view.Surface;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.ExoPlaybackException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.PlaybackParameters;
import p007c.p190n.p194b.p209b.Player;
import p007c.p190n.p194b.p209b.Player2;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p210a2.BandwidthMeter;
import p007c.p190n.p194b.p209b.p212b2.Clock2;
import p007c.p190n.p194b.p209b.p212b2.ListenerSet;
import p007c.p190n.p194b.p209b.p212b2.MutableFlags;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener;
import p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2;
import p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener;
import p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2;
import p007c.p190n.p194b.p209b.p217p1.DecoderCounters;
import p007c.p190n.p194b.p209b.p217p1.DecoderReuseEvaluation;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;
import p007c.p190n.p194b.p209b.p243w1.MediaLoadData;
import p007c.p190n.p194b.p209b.p243w1.MediaPeriodId;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p262y1.TrackSelectionArray;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p378c.p379a.Supplier;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.ImmutableMap;
import p007c.p190n.p378c.p380b.RegularImmutableList;
import p007c.p190n.p378c.p380b.RegularImmutableMap;

/* JADX INFO: renamed from: c.n.b.b.m1.z0, reason: use source file name */
/* JADX INFO: compiled from: AnalyticsCollector.java */
/* JADX INFO: loaded from: classes.dex */
public class AnalyticsCollector implements Player2.a, AudioRendererEventListener2, VideoRendererEventListener2, MediaSourceEventListener, BandwidthMeter.a, DrmSessionEventListener2 {

    /* JADX INFO: renamed from: f */
    public final Clock2 f6897f;

    /* JADX INFO: renamed from: g */
    public final Timeline.b f6898g;

    /* JADX INFO: renamed from: h */
    public final Timeline.c f6899h;

    /* JADX INFO: renamed from: i */
    public final a f6900i;

    /* JADX INFO: renamed from: j */
    public final SparseArray<AnalyticsListener2.a> f6901j;

    /* JADX INFO: renamed from: k */
    public ListenerSet<AnalyticsListener2, AnalyticsListener2.b> f6902k;

    /* JADX INFO: renamed from: l */
    public Player2 f6903l;

    /* JADX INFO: renamed from: m */
    public boolean f6904m;

    /* JADX INFO: renamed from: c.n.b.b.m1.z0$a */
    /* JADX INFO: compiled from: AnalyticsCollector.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Timeline.b f6905a;

        /* JADX INFO: renamed from: b */
        public ImmutableList2<MediaSource2.a> f6906b;

        /* JADX INFO: renamed from: c */
        public ImmutableMap<MediaSource2.a, Timeline> f6907c;

        /* JADX INFO: renamed from: d */
        public MediaSource2.a f6908d;

        /* JADX INFO: renamed from: e */
        public MediaSource2.a f6909e;

        /* JADX INFO: renamed from: f */
        public MediaSource2.a f6910f;

        public a(Timeline.b bVar) {
            this.f6905a = bVar;
            AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
            this.f6906b = RegularImmutableList.f26218h;
            this.f6907c = RegularImmutableMap.f26222i;
        }

        /* JADX INFO: renamed from: b */
        public static MediaSource2.a m3510b(Player2 player2, ImmutableList2<MediaSource2.a> immutableList2, MediaSource2.a aVar, Timeline.b bVar) {
            Timeline timelineMo3341p = player2.mo3341p();
            int iMo3335h = player2.mo3335h();
            Object objMo3467m = timelineMo3341p.m3470q() ? null : timelineMo3341p.mo3467m(iMo3335h);
            int iM3472b = (player2.mo3331c() || timelineMo3341p.m3470q()) ? -1 : timelineMo3341p.m3461f(iMo3335h, bVar).m3472b(C.m3236b(player2.getCurrentPosition()) - bVar.f6748e);
            for (int i = 0; i < immutableList2.size(); i++) {
                MediaSource2.a aVar2 = immutableList2.get(i);
                if (m3511c(aVar2, objMo3467m, player2.mo3331c(), player2.mo3340n(), player2.mo3336i(), iM3472b)) {
                    return aVar2;
                }
            }
            if (immutableList2.isEmpty() && aVar != null) {
                if (m3511c(aVar, objMo3467m, player2.mo3331c(), player2.mo3340n(), player2.mo3336i(), iM3472b)) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m3511c(MediaSource2.a aVar, Object obj, boolean z, int i, int i2, int i3) {
            if (aVar.f8857a.equals(obj)) {
                return (z && aVar.f8858b == i && aVar.f8859c == i2) || (!z && aVar.f8858b == -1 && aVar.f8861e == i3);
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        public final void m3512a(ImmutableMap.a<MediaSource2.a, Timeline> aVar, MediaSource2.a aVar2, Timeline timeline) {
            if (aVar2 == null) {
                return;
            }
            if (timeline.mo3457b(aVar2.f8857a) != -1) {
                aVar.m11656c(aVar2, timeline);
                return;
            }
            Timeline timeline2 = this.f6907c.get(aVar2);
            if (timeline2 != null) {
                aVar.m11656c(aVar2, timeline2);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m3513d(Timeline timeline) {
            ImmutableMap.a<MediaSource2.a, Timeline> aVar = new ImmutableMap.a<>();
            if (this.f6906b.isEmpty()) {
                m3512a(aVar, this.f6909e, timeline);
                if (!C4799a.m10952C(this.f6910f, this.f6909e)) {
                    m3512a(aVar, this.f6910f, timeline);
                }
                if (!C4799a.m10952C(this.f6908d, this.f6909e) && !C4799a.m10952C(this.f6908d, this.f6910f)) {
                    m3512a(aVar, this.f6908d, timeline);
                }
            } else {
                for (int i = 0; i < this.f6906b.size(); i++) {
                    m3512a(aVar, this.f6906b.get(i), timeline);
                }
                if (!this.f6906b.contains(this.f6908d)) {
                    m3512a(aVar, this.f6908d, timeline);
                }
            }
            this.f6907c = aVar.m11654a();
        }
    }

    public AnalyticsCollector(Clock2 clock2) {
        Objects.requireNonNull(clock2);
        this.f6897f = clock2;
        this.f6902k = new ListenerSet<>(Util6.m3132t(), clock2, new Supplier() { // from class: c.n.b.b.m1.a
            @Override // p007c.p190n.p378c.p379a.Supplier
            public final Object get() {
                return new AnalyticsListener2.b();
            }
        }, new ListenerSet.b() { // from class: c.n.b.b.m1.l
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.b
            /* JADX INFO: renamed from: a */
            public final void mo3152a(Object obj, MutableFlags mutableFlags) {
            }
        });
        Timeline.b bVar = new Timeline.b();
        this.f6898g = bVar;
        this.f6899h = new Timeline.c();
        this.f6900i = new a(bVar);
        this.f6901j = new SparseArray<>();
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
    /* JADX INFO: renamed from: A */
    public final void mo1129A(final Format format, final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.k0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                AnalyticsListener2.a aVar2 = aVarM3505f0;
                Format format2 = format;
                AnalyticsListener2 analyticsListener2 = (AnalyticsListener2) obj;
                analyticsListener2.mo1055a0(aVar2, format2, decoderReuseEvaluation);
                analyticsListener2.mo1066g(aVar2, 1, format2);
            }
        };
        this.f6901j.put(1010, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1010, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
    /* JADX INFO: renamed from: B */
    public final void mo1130B(int i, MediaSource2.a aVar) {
        final AnalyticsListener2.a aVarM3503d0 = m3503d0(i, aVar);
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.b0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1069h0(aVarM3503d0);
            }
        };
        this.f6901j.put(1034, aVarM3503d0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1034, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void mo1098C(Timeline timeline, Object obj, int i) {
        Player.m3254q(this, timeline, obj, i);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: D */
    public final void mo1099D(final int i) {
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.n0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1029B(aVarM3500a0, i);
            }
        };
        this.f6901j.put(9, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(9, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: E */
    public final void mo1100E(final MediaItem2 mediaItem2, final int i) {
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.n
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1052Y(aVarM3500a0, mediaItem2, i);
            }
        };
        this.f6901j.put(1, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
    /* JADX INFO: renamed from: F */
    public final void mo1131F(int i, MediaSource2.a aVar) {
        final AnalyticsListener2.a aVarM3503d0 = m3503d0(i, aVar);
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.x
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1063e0(aVarM3503d0);
            }
        };
        this.f6901j.put(1030, aVarM3503d0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1030, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
    /* JADX INFO: renamed from: G */
    public final void mo1132G(final boolean z) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.d0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1045R(aVarM3505f0, z);
            }
        };
        this.f6901j.put(1017, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1017, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
    /* JADX INFO: renamed from: H */
    public final void mo1133H(final Exception exc) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.g
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1044Q(aVarM3505f0, exc);
            }
        };
        this.f6901j.put(1018, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1018, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void mo1134I(Format format) {
        VideoRendererEventListener.m3325h(this, format);
    }

    @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
    /* JADX INFO: renamed from: J */
    public final void mo1135J(final DecoderCounters decoderCounters) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.x0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                AnalyticsListener2.a aVar2 = aVarM3505f0;
                DecoderCounters decoderCounters2 = decoderCounters;
                AnalyticsListener2 analyticsListener2 = (AnalyticsListener2) obj;
                analyticsListener2.mo1087y(aVar2, decoderCounters2);
                analyticsListener2.mo1086x(aVar2, 2, decoderCounters2);
            }
        };
        this.f6901j.put(1020, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1020, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
    /* JADX INFO: renamed from: K */
    public final void mo1136K(final Format format, final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.j0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                AnalyticsListener2.a aVar2 = aVarM3505f0;
                Format format2 = format;
                AnalyticsListener2 analyticsListener2 = (AnalyticsListener2) obj;
                analyticsListener2.mo1048U(aVar2, format2, decoderReuseEvaluation);
                analyticsListener2.mo1066g(aVar2, 2, format2);
            }
        };
        this.f6901j.put(1022, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1022, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
    /* JADX INFO: renamed from: L */
    public final void mo1137L(final long j2) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.v0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1038K(aVarM3505f0, j2);
            }
        };
        this.f6901j.put(CloseCodes.UNEXPECTED_CONDITION, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(CloseCodes.UNEXPECTED_CONDITION, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
    /* JADX INFO: renamed from: M */
    public final void mo1138M(int i, MediaSource2.a aVar) {
        final AnalyticsListener2.a aVarM3503d0 = m3503d0(i, aVar);
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.v
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1034G(aVarM3503d0);
            }
        };
        this.f6901j.put(1031, aVarM3503d0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1031, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void mo1139N(Format format) {
        AudioRendererEventListener.m3563d(this, format);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: O */
    public final void mo1101O(final boolean z, final int i) {
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.q0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1047T(aVarM3500a0, z, i);
            }
        };
        this.f6901j.put(6, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(6, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
    /* JADX INFO: renamed from: P */
    public final void mo3498P(int i, MediaSource2.a aVar, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener2.a aVarM3503d0 = m3503d0(i, aVar);
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.u
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1041N(aVarM3503d0, loadEventInfo, mediaLoadData);
            }
        };
        this.f6901j.put(1001, aVarM3503d0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1001, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: Q */
    public final void mo1102Q(final TrackGroupArray trackGroupArray, final TrackSelectionArray trackSelectionArray) {
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.h
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1037J(aVarM3500a0, trackGroupArray, trackSelectionArray);
            }
        };
        this.f6901j.put(2, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(2, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
    /* JADX INFO: renamed from: R */
    public final void mo1140R(final DecoderCounters decoderCounters) {
        final AnalyticsListener2.a aVarM3504e0 = m3504e0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.i
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                AnalyticsListener2.a aVar2 = aVarM3504e0;
                DecoderCounters decoderCounters2 = decoderCounters;
                AnalyticsListener2 analyticsListener2 = (AnalyticsListener2) obj;
                analyticsListener2.mo1067g0(aVar2, decoderCounters2);
                analyticsListener2.mo1059c0(aVar2, 2, decoderCounters2);
            }
        };
        this.f6901j.put(1025, aVarM3504e0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1025, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: S */
    public final void mo1103S(final PlaybackParameters playbackParameters) {
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.z
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1079q(aVarM3500a0, playbackParameters);
            }
        };
        this.f6901j.put(13, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(13, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
    /* JADX INFO: renamed from: T */
    public final void mo1141T(int i, MediaSource2.a aVar) {
        final AnalyticsListener2.a aVarM3503d0 = m3503d0(i, aVar);
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.i0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1076n(aVarM3503d0);
            }
        };
        this.f6901j.put(1035, aVarM3503d0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1035, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void mo1104U(boolean z) {
        Player.m3239b(this, z);
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
    /* JADX INFO: renamed from: V */
    public final void mo1142V(final int i, final long j2, final long j3) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.w0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1080r(aVarM3505f0, i, j2, j3);
            }
        };
        this.f6901j.put(1012, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1012, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
    /* JADX INFO: renamed from: W */
    public final void mo3499W(int i, MediaSource2.a aVar, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z) {
        final AnalyticsListener2.a aVarM3503d0 = m3503d0(i, aVar);
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.c0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1085w(aVarM3503d0, loadEventInfo, mediaLoadData, iOException, z);
            }
        };
        this.f6901j.put(1003, aVarM3503d0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1003, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
    /* JADX INFO: renamed from: X */
    public final void mo1143X(final long j2, final int i) {
        final AnalyticsListener2.a aVarM3504e0 = m3504e0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.m0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1068h(aVarM3504e0, j2, i);
            }
        };
        this.f6901j.put(1026, aVarM3504e0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1026, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
    /* JADX INFO: renamed from: Y */
    public final void mo1144Y(int i, MediaSource2.a aVar) {
        final AnalyticsListener2.a aVarM3503d0 = m3503d0(i, aVar);
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.o
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1077o(aVarM3503d0);
            }
        };
        this.f6901j.put(1033, aVarM3503d0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1033, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: Z */
    public void mo1105Z(final boolean z) {
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.u0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1039L(aVarM3500a0, z);
            }
        };
        this.f6901j.put(8, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(8, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: a */
    public final void mo1106a(final int i) {
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.c
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1078p(aVarM3500a0, i);
            }
        };
        this.f6901j.put(7, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(7, aVar);
        listenerSet.m3148a();
    }

    /* JADX INFO: renamed from: a0 */
    public final AnalyticsListener2.a m3500a0() {
        return m3502c0(this.f6900i.f6908d);
    }

    @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
    /* JADX INFO: renamed from: b */
    public final void mo1146b(final int i, final int i2, final int i3, final float f) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.j
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1060d(aVarM3505f0, i, i2, i3, f);
            }
        };
        this.f6901j.put(1028, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1028, aVar);
        listenerSet.m3148a();
    }

    @RequiresNonNull({"player"})
    /* JADX INFO: renamed from: b0 */
    public final AnalyticsListener2.a m3501b0(Timeline timeline, int i, MediaSource2.a aVar) {
        long jMo3339l;
        MediaSource2.a aVar2 = timeline.m3470q() ? null : aVar;
        long jMo3068a = this.f6897f.mo3068a();
        boolean z = false;
        boolean z2 = timeline.equals(this.f6903l.mo3341p()) && i == this.f6903l.mo3337j();
        long jM3477a = 0;
        if (aVar2 == null || !aVar2.m4081a()) {
            if (z2) {
                jMo3339l = this.f6903l.mo3339l();
            } else if (!timeline.m3470q()) {
                jM3477a = timeline.mo3469o(i, this.f6899h, 0L).m3477a();
            }
            return new AnalyticsListener2.a(jMo3068a, timeline, i, aVar2, jMo3339l, this.f6903l.mo3341p(), this.f6903l.mo3337j(), this.f6900i.f6908d, this.f6903l.getCurrentPosition(), this.f6903l.mo3332d());
        }
        if (z2 && this.f6903l.mo3340n() == aVar2.f8858b && this.f6903l.mo3336i() == aVar2.f8859c) {
            z = true;
        }
        if (z) {
            jM3477a = this.f6903l.getCurrentPosition();
        }
        jMo3339l = jM3477a;
        return new AnalyticsListener2.a(jMo3068a, timeline, i, aVar2, jMo3339l, this.f6903l.mo3341p(), this.f6903l.mo3337j(), this.f6900i.f6908d, this.f6903l.getCurrentPosition(), this.f6903l.mo3332d());
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void mo1108c(boolean z) {
        Player.m3243f(this, z);
    }

    /* JADX INFO: renamed from: c0 */
    public final AnalyticsListener2.a m3502c0(MediaSource2.a aVar) {
        Objects.requireNonNull(this.f6903l);
        Timeline timeline = aVar == null ? null : this.f6900i.f6907c.get(aVar);
        if (aVar != null && timeline != null) {
            return m3501b0(timeline, timeline.mo3463h(aVar.f8857a, this.f6898g).f6746c, aVar);
        }
        int iMo3337j = this.f6903l.mo3337j();
        Timeline timelineMo3341p = this.f6903l.mo3341p();
        if (!(iMo3337j < timelineMo3341p.mo3356p())) {
            timelineMo3341p = Timeline.f6743a;
        }
        return m3501b0(timelineMo3341p, iMo3337j, null);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: d */
    public final void mo1109d(final int i) {
        if (i == 1) {
            this.f6904m = false;
        }
        a aVar = this.f6900i;
        Player2 player2 = this.f6903l;
        Objects.requireNonNull(player2);
        aVar.f6908d = a.m3510b(player2, aVar.f6906b, aVar.f6909e, aVar.f6905a);
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.o0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1074l(aVarM3500a0, i);
            }
        };
        this.f6901j.put(12, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(12, aVar2);
        listenerSet.m3148a();
    }

    /* JADX INFO: renamed from: d0 */
    public final AnalyticsListener2.a m3503d0(int i, MediaSource2.a aVar) {
        Objects.requireNonNull(this.f6903l);
        if (aVar != null) {
            return this.f6900i.f6907c.get(aVar) != null ? m3502c0(aVar) : m3501b0(Timeline.f6743a, i, aVar);
        }
        Timeline timelineMo3341p = this.f6903l.mo3341p();
        if (!(i < timelineMo3341p.mo3356p())) {
            timelineMo3341p = Timeline.f6743a;
        }
        return m3501b0(timelineMo3341p, i, null);
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
    /* JADX INFO: renamed from: e */
    public final void mo1148e(final DecoderCounters decoderCounters) {
        final AnalyticsListener2.a aVarM3504e0 = m3504e0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.s
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                AnalyticsListener2.a aVar2 = aVarM3504e0;
                DecoderCounters decoderCounters2 = decoderCounters;
                AnalyticsListener2 analyticsListener2 = (AnalyticsListener2) obj;
                analyticsListener2.mo1082t(aVar2, decoderCounters2);
                analyticsListener2.mo1059c0(aVar2, 1, decoderCounters2);
            }
        };
        this.f6901j.put(1014, aVarM3504e0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1014, aVar);
        listenerSet.m3148a();
    }

    /* JADX INFO: renamed from: e0 */
    public final AnalyticsListener2.a m3504e0() {
        return m3502c0(this.f6900i.f6909e);
    }

    @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
    /* JADX INFO: renamed from: f */
    public final void mo1149f(final String str) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.e0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1064f(aVarM3505f0, str);
            }
        };
        this.f6901j.put(1024, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1024, aVar);
        listenerSet.m3148a();
    }

    /* JADX INFO: renamed from: f0 */
    public final AnalyticsListener2.a m3505f0() {
        return m3502c0(this.f6900i.f6910f);
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
    /* JADX INFO: renamed from: g */
    public final void mo1150g(final DecoderCounters decoderCounters) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.q
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                AnalyticsListener2.a aVar2 = aVarM3505f0;
                DecoderCounters decoderCounters2 = decoderCounters;
                AnalyticsListener2 analyticsListener2 = (AnalyticsListener2) obj;
                analyticsListener2.mo1083u(aVar2, decoderCounters2);
                analyticsListener2.mo1086x(aVar2, 1, decoderCounters2);
            }
        };
        this.f6901j.put(1008, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1008, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: h */
    public final void mo1113h(final List<Metadata> list) {
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.a0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1061d0(aVarM3500a0, list);
            }
        };
        this.f6901j.put(3, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(3, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
    /* JADX INFO: renamed from: i */
    public final void mo1151i(final String str, long j2, final long j3) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.m
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                AnalyticsListener2.a aVar2 = aVarM3505f0;
                String str2 = str;
                long j4 = j3;
                AnalyticsListener2 analyticsListener2 = (AnalyticsListener2) obj;
                analyticsListener2.mo1050W(aVar2, str2, j4);
                analyticsListener2.mo1073k(aVar2, 2, str2, j4);
            }
        };
        this.f6901j.put(1021, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1021, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: j */
    public final void mo1114j(final ExoPlaybackException exoPlaybackException) {
        MediaPeriodId mediaPeriodId = exoPlaybackException.f6617l;
        final AnalyticsListener2.a aVarM3502c0 = mediaPeriodId != null ? m3502c0(new MediaSource2.a(mediaPeriodId)) : m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.p
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1071i0(aVarM3502c0, exoPlaybackException);
            }
        };
        this.f6901j.put(11, aVarM3502c0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(11, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
    /* JADX INFO: renamed from: k */
    public final void mo3506k(int i, MediaSource2.a aVar, final MediaLoadData mediaLoadData) {
        final AnalyticsListener2.a aVarM3503d0 = m3503d0(i, aVar);
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.e
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1040M(aVarM3503d0, mediaLoadData);
            }
        };
        this.f6901j.put(1004, aVarM3503d0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1004, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
    /* JADX INFO: renamed from: l */
    public final void mo3507l(int i, MediaSource2.a aVar, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener2.a aVarM3503d0 = m3503d0(i, aVar);
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.g0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1036I(aVarM3503d0, loadEventInfo, mediaLoadData);
            }
        };
        this.f6901j.put(CloseCodes.PROTOCOL_ERROR, aVarM3503d0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(CloseCodes.PROTOCOL_ERROR, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: m */
    public final void mo1117m(final boolean z) {
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.b
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1065f0(aVarM3500a0, z);
            }
        };
        this.f6901j.put(4, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(4, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
    /* JADX INFO: renamed from: n */
    public final void mo3508n(int i, MediaSource2.a aVar, final MediaLoadData mediaLoadData) {
        final AnalyticsListener2.a aVarM3503d0 = m3503d0(i, aVar);
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.f0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1042O(aVarM3503d0, mediaLoadData);
            }
        };
        this.f6901j.put(1005, aVarM3503d0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1005, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: o */
    public final void mo1119o() {
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.h0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1070i(aVarM3500a0);
            }
        };
        this.f6901j.put(-1, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(-1, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
    /* JADX INFO: renamed from: p */
    public final void mo1152p(int i, MediaSource2.a aVar, final Exception exc) {
        final AnalyticsListener2.a aVarM3503d0 = m3503d0(i, aVar);
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.r
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1075m(aVarM3503d0, exc);
            }
        };
        this.f6901j.put(1032, aVarM3503d0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1032, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: q */
    public final void mo1121q(Timeline timeline, final int i) {
        a aVar = this.f6900i;
        Player2 player2 = this.f6903l;
        Objects.requireNonNull(player2);
        aVar.f6908d = a.m3510b(player2, aVar.f6906b, aVar.f6909e, aVar.f6905a);
        aVar.m3513d(player2.mo3341p());
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.t
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1049V(aVarM3500a0, i);
            }
        };
        this.f6901j.put(0, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(0, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener
    /* JADX INFO: renamed from: r */
    public final void mo3509r(int i, MediaSource2.a aVar, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener2.a aVarM3503d0 = m3503d0(i, aVar);
        ListenerSet.a<AnalyticsListener2> aVar2 = new ListenerSet.a() { // from class: c.n.b.b.m1.l0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1072j(aVarM3503d0, loadEventInfo, mediaLoadData);
            }
        };
        this.f6901j.put(CloseCodes.NORMAL_CLOSURE, aVarM3503d0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(CloseCodes.NORMAL_CLOSURE, aVar2);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: s */
    public final void mo1123s(final int i) {
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.y
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1032E(aVarM3500a0, i);
            }
        };
        this.f6901j.put(5, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(5, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
    /* JADX INFO: renamed from: t */
    public final void mo1153t(final Surface surface) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.r0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1053Z(aVarM3505f0, surface);
            }
        };
        this.f6901j.put(1027, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1027, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
    /* JADX INFO: renamed from: u */
    public final void mo1154u(final String str) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.f
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1046S(aVarM3505f0, str);
            }
        };
        this.f6901j.put(1013, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1013, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
    /* JADX INFO: renamed from: v */
    public final void mo1155v(final String str, long j2, final long j3) {
        final AnalyticsListener2.a aVarM3505f0 = m3505f0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.s0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                AnalyticsListener2.a aVar2 = aVarM3505f0;
                String str2 = str;
                long j4 = j3;
                AnalyticsListener2 analyticsListener2 = (AnalyticsListener2) obj;
                analyticsListener2.mo1088z(aVar2, str2, j4);
                analyticsListener2.mo1073k(aVar2, 1, str2, j4);
            }
        };
        this.f6901j.put(1009, aVarM3505f0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1009, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void mo1126w(Player2 player2, Player2.b bVar) {
        Player.m3238a(this, player2, bVar);
    }

    @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
    /* JADX INFO: renamed from: x */
    public final void mo1156x(final int i, final long j2) {
        final AnalyticsListener2.a aVarM3504e0 = m3504e0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.w
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1043P(aVarM3504e0, i, j2);
            }
        };
        this.f6901j.put(1023, aVarM3504e0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(1023, aVar);
        listenerSet.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void mo1127y(boolean z) {
        Player.m3240c(this, z);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: z */
    public final void mo1128z(final boolean z, final int i) {
        final AnalyticsListener2.a aVarM3500a0 = m3500a0();
        ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.p0
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
            /* JADX INFO: renamed from: b */
            public final void mo2881b(Object obj) {
                ((AnalyticsListener2) obj).mo1031D(aVarM3500a0, z, i);
            }
        };
        this.f6901j.put(-1, aVarM3500a0);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = this.f6902k;
        listenerSet.m3149b(-1, aVar);
        listenerSet.m3148a();
    }
}
