package p007c.p190n.p194b.p209b;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Player2;
import p007c.p190n.p194b.p209b.p210a2.BandwidthMeter;
import p007c.p190n.p194b.p209b.p212b2.Clock2;
import p007c.p190n.p194b.p209b.p212b2.ListenerSet;
import p007c.p190n.p194b.p209b.p212b2.MutableFlags;
import p007c.p190n.p194b.p209b.p212b2.SystemHandlerWrapper;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsCollector;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceFactory;
import p007c.p190n.p194b.p209b.p243w1.ShuffleOrder;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;
import p007c.p190n.p194b.p209b.p262y1.TrackSelectionArray;
import p007c.p190n.p194b.p209b.p262y1.TrackSelector;
import p007c.p190n.p194b.p209b.p262y1.TrackSelectorResult;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p379a.Supplier;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.RegularImmutableList;

/* JADX INFO: renamed from: c.n.b.b.i0, reason: use source file name */
/* JADX INFO: compiled from: ExoPlayerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class ExoPlayerImpl extends BasePlayer implements ExoPlayer {

    /* JADX INFO: renamed from: b */
    public final TrackSelectorResult f6635b;

    /* JADX INFO: renamed from: c */
    public final Renderer2[] f6636c;

    /* JADX INFO: renamed from: d */
    public final TrackSelector f6637d;

    /* JADX INFO: renamed from: e */
    public final SystemHandlerWrapper f6638e;

    /* JADX INFO: renamed from: f */
    public final ExoPlayerImplInternal2.e f6639f;

    /* JADX INFO: renamed from: g */
    public final ExoPlayerImplInternal2 f6640g;

    /* JADX INFO: renamed from: h */
    public final ListenerSet<Player2.a, Player2.b> f6641h;

    /* JADX INFO: renamed from: i */
    public final Timeline.b f6642i;

    /* JADX INFO: renamed from: j */
    public final List<a> f6643j;

    /* JADX INFO: renamed from: k */
    public final boolean f6644k;

    /* JADX INFO: renamed from: l */
    public final MediaSourceFactory f6645l;

    /* JADX INFO: renamed from: m */
    public final AnalyticsCollector f6646m;

    /* JADX INFO: renamed from: n */
    public final Looper f6647n;

    /* JADX INFO: renamed from: o */
    public final BandwidthMeter f6648o;

    /* JADX INFO: renamed from: p */
    public final Clock2 f6649p;

    /* JADX INFO: renamed from: q */
    public int f6650q;

    /* JADX INFO: renamed from: r */
    public boolean f6651r;

    /* JADX INFO: renamed from: s */
    public int f6652s;

    /* JADX INFO: renamed from: t */
    public boolean f6653t;

    /* JADX INFO: renamed from: u */
    public int f6654u;

    /* JADX INFO: renamed from: v */
    public int f6655v;

    /* JADX INFO: renamed from: w */
    public ShuffleOrder f6656w;

    /* JADX INFO: renamed from: x */
    public PlaybackInfo f6657x;

    /* JADX INFO: renamed from: y */
    public int f6658y;

    /* JADX INFO: renamed from: z */
    public long f6659z;

    /* JADX INFO: renamed from: c.n.b.b.i0$a */
    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class a implements MediaSourceInfoHolder {

        /* JADX INFO: renamed from: a */
        public final Object f6660a;

        /* JADX INFO: renamed from: b */
        public Timeline f6661b;

        public a(Object obj, Timeline timeline) {
            this.f6660a = obj;
            this.f6661b = timeline;
        }

        @Override // p007c.p190n.p194b.p209b.MediaSourceInfoHolder
        /* JADX INFO: renamed from: a */
        public Object mo3381a() {
            return this.f6660a;
        }

        @Override // p007c.p190n.p194b.p209b.MediaSourceInfoHolder
        /* JADX INFO: renamed from: b */
        public Timeline mo3382b() {
            return this.f6661b;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public ExoPlayerImpl(Renderer2[] renderer2Arr, TrackSelector trackSelector, MediaSourceFactory mediaSourceFactory, LoadControl loadControl, BandwidthMeter bandwidthMeter, final AnalyticsCollector analyticsCollector, boolean z, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j2, boolean z2, Clock2 clock2, Looper looper, Player2 player2) {
        StringBuilder sbM1556G = outline.m1556G("Init ");
        sbM1556G.append(Integer.toHexString(System.identityHashCode(this)));
        sbM1556G.append(" [");
        sbM1556G.append("ExoPlayerLib/2.13.3");
        sbM1556G.append("] [");
        sbM1556G.append(Util6.f6311e);
        sbM1556G.append("]");
        Log.i("ExoPlayerImpl", sbM1556G.toString());
        boolean z3 = true;
        C2096e.m4570f(renderer2Arr.length > 0);
        this.f6636c = renderer2Arr;
        Objects.requireNonNull(trackSelector);
        this.f6637d = trackSelector;
        this.f6645l = mediaSourceFactory;
        this.f6648o = bandwidthMeter;
        this.f6646m = analyticsCollector;
        this.f6644k = z;
        this.f6647n = looper;
        this.f6649p = clock2;
        this.f6650q = 0;
        final Player2 player3 = player2 != null ? player2 : this;
        this.f6641h = new ListenerSet<>(looper, clock2, new Supplier() { // from class: c.n.b.b.y
            @Override // p007c.p190n.p378c.p379a.Supplier
            public final Object get() {
                return new Player2.b();
            }
        }, new ListenerSet.b() { // from class: c.n.b.b.j
            @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.b
            /* JADX INFO: renamed from: a */
            public final void mo3152a(Object obj, MutableFlags mutableFlags) {
                ((Player2.a) obj).mo1126w(player3, (Player2.b) mutableFlags);
            }
        });
        this.f6643j = new ArrayList();
        this.f6656w = new ShuffleOrder.a(0);
        TrackSelectorResult trackSelectorResult = new TrackSelectorResult(new RendererConfiguration[renderer2Arr.length], new ExoTrackSelection2[renderer2Arr.length], null);
        this.f6635b = trackSelectorResult;
        this.f6642i = new Timeline.b();
        this.f6658y = -1;
        this.f6638e = clock2.mo3070c(looper, null);
        C1541m c1541m = new C1541m(this);
        this.f6639f = c1541m;
        this.f6657x = PlaybackInfo.m2886i(trackSelectorResult);
        if (analyticsCollector != null) {
            if (analyticsCollector.f6903l != null && !analyticsCollector.f6900i.f6906b.isEmpty()) {
                z3 = false;
            }
            C2096e.m4570f(z3);
            analyticsCollector.f6903l = player3;
            ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = analyticsCollector.f6902k;
            analyticsCollector.f6902k = new ListenerSet<>(listenerSet.f6350e, looper, listenerSet.f6346a, listenerSet.f6348c, new ListenerSet.b() { // from class: c.n.b.b.m1.y0
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.b
                /* JADX INFO: renamed from: a */
                public final void mo3152a(Object obj, MutableFlags mutableFlags) {
                    AnalyticsCollector analyticsCollector2 = analyticsCollector;
                    Player2 player4 = player3;
                    AnalyticsListener2 analyticsListener2 = (AnalyticsListener2) obj;
                    AnalyticsListener2.b bVar = (AnalyticsListener2.b) mutableFlags;
                    SparseArray<AnalyticsListener2.a> sparseArray = analyticsCollector2.f6901j;
                    bVar.f6786b.clear();
                    int i = 0;
                    while (i < bVar.f6367a.size()) {
                        C2096e.m4566b(i >= 0 && i < bVar.f6367a.size());
                        int iKeyAt = bVar.f6367a.keyAt(i);
                        SparseArray<AnalyticsListener2.a> sparseArray2 = bVar.f6786b;
                        AnalyticsListener2.a aVar = sparseArray.get(iKeyAt);
                        Objects.requireNonNull(aVar);
                        sparseArray2.append(iKeyAt, aVar);
                        i++;
                    }
                    analyticsListener2.mo1030C(player4, bVar);
                }
            });
            m3374r(analyticsCollector);
            bandwidthMeter.mo2920g(new Handler(looper), analyticsCollector);
        }
        this.f6640g = new ExoPlayerImplInternal2(renderer2Arr, trackSelector, trackSelectorResult, loadControl, bandwidthMeter, this.f6650q, this.f6651r, analyticsCollector, seekParameters, livePlaybackSpeedControl, j2, z2, looper, clock2, c1541m);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m3372v(PlaybackInfo playbackInfo) {
        return playbackInfo.f5932e == 3 && playbackInfo.f5939l && playbackInfo.f5940m == 0;
    }

    /* JADX INFO: renamed from: A */
    public final void m3373A(final PlaybackInfo playbackInfo, boolean z, final int i, final int i2, final int i3, boolean z2) {
        Pair pair;
        int i4;
        final MediaItem2 mediaItem2;
        PlaybackInfo playbackInfo2 = this.f6657x;
        this.f6657x = playbackInfo;
        boolean z3 = !playbackInfo2.f5929b.equals(playbackInfo.f5929b);
        Timeline timeline = playbackInfo2.f5929b;
        Timeline timeline2 = playbackInfo.f5929b;
        if (timeline2.m3470q() && timeline.m3470q()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (timeline2.m3470q() != timeline.m3470q()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            Object obj = timeline.m3468n(timeline.mo3463h(playbackInfo2.f5930c.f8857a, this.f6642i).f6746c, this.f5927a).f6752c;
            Object obj2 = timeline2.m3468n(timeline2.mo3463h(playbackInfo.f5930c.f8857a, this.f6642i).f6746c, this.f5927a).f6752c;
            int i5 = this.f5927a.f6764o;
            if (obj.equals(obj2)) {
                pair = (z && i == 0 && timeline2.mo3457b(playbackInfo.f5930c.f8857a) == i5) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z && i == 0) {
                    i4 = 1;
                } else if (z && i == 1) {
                    i4 = 2;
                } else {
                    if (!z3) {
                        throw new IllegalStateException();
                    }
                    i4 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        if (!playbackInfo2.f5929b.equals(playbackInfo.f5929b)) {
            this.f6641h.m3149b(0, new ListenerSet.a() { // from class: c.n.b.b.b
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    ((Player2.a) obj3).mo1121q(playbackInfo3.f5929b, i2);
                }
            });
        }
        if (z) {
            this.f6641h.m3149b(12, new ListenerSet.a() { // from class: c.n.b.b.c
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    ((Player2.a) obj3).mo1109d(i);
                }
            });
        }
        if (zBooleanValue) {
            if (playbackInfo.f5929b.m3470q()) {
                mediaItem2 = null;
            } else {
                mediaItem2 = playbackInfo.f5929b.m3468n(playbackInfo.f5929b.mo3463h(playbackInfo.f5930c.f8857a, this.f6642i).f6746c, this.f5927a).f6754e;
            }
            this.f6641h.m3149b(1, new ListenerSet.a() { // from class: c.n.b.b.p
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    ((Player2.a) obj3).mo1100E(mediaItem2, iIntValue);
                }
            });
        }
        ExoPlaybackException exoPlaybackException = playbackInfo2.f5933f;
        ExoPlaybackException exoPlaybackException2 = playbackInfo.f5933f;
        if (exoPlaybackException != exoPlaybackException2 && exoPlaybackException2 != null) {
            this.f6641h.m3149b(11, new ListenerSet.a() { // from class: c.n.b.b.l
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    ((Player2.a) obj3).mo1114j(playbackInfo.f5933f);
                }
            });
        }
        TrackSelectorResult trackSelectorResult = playbackInfo2.f5936i;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.f5936i;
        if (trackSelectorResult != trackSelectorResult2) {
            this.f6637d.mo4543a(trackSelectorResult2.f10368d);
            final TrackSelectionArray trackSelectionArray = new TrackSelectionArray(playbackInfo.f5936i.f10367c);
            this.f6641h.m3149b(2, new ListenerSet.a() { // from class: c.n.b.b.k
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    ((Player2.a) obj3).mo1102Q(playbackInfo3.f5935h, trackSelectionArray);
                }
            });
        }
        if (!playbackInfo2.f5937j.equals(playbackInfo.f5937j)) {
            this.f6641h.m3149b(3, new ListenerSet.a() { // from class: c.n.b.b.h
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    ((Player2.a) obj3).mo1113h(playbackInfo.f5937j);
                }
            });
        }
        if (playbackInfo2.f5934g != playbackInfo.f5934g) {
            this.f6641h.m3149b(4, new ListenerSet.a() { // from class: c.n.b.b.e
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    ((Player2.a) obj3).mo1117m(playbackInfo.f5934g);
                }
            });
        }
        if (playbackInfo2.f5932e != playbackInfo.f5932e || playbackInfo2.f5939l != playbackInfo.f5939l) {
            this.f6641h.m3149b(-1, new ListenerSet.a() { // from class: c.n.b.b.n
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    ((Player2.a) obj3).mo1128z(playbackInfo3.f5939l, playbackInfo3.f5932e);
                }
            });
        }
        if (playbackInfo2.f5932e != playbackInfo.f5932e) {
            this.f6641h.m3149b(5, new ListenerSet.a() { // from class: c.n.b.b.i
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    ((Player2.a) obj3).mo1123s(playbackInfo.f5932e);
                }
            });
        }
        if (playbackInfo2.f5939l != playbackInfo.f5939l) {
            this.f6641h.m3149b(6, new ListenerSet.a() { // from class: c.n.b.b.t
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    PlaybackInfo playbackInfo3 = playbackInfo;
                    ((Player2.a) obj3).mo1101O(playbackInfo3.f5939l, i3);
                }
            });
        }
        if (playbackInfo2.f5940m != playbackInfo.f5940m) {
            this.f6641h.m3149b(7, new ListenerSet.a() { // from class: c.n.b.b.q
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    ((Player2.a) obj3).mo1106a(playbackInfo.f5940m);
                }
            });
        }
        if (m3372v(playbackInfo2) != m3372v(playbackInfo)) {
            this.f6641h.m3149b(8, new ListenerSet.a() { // from class: c.n.b.b.g
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    ((Player2.a) obj3).mo1105Z(ExoPlayerImpl.m3372v(playbackInfo));
                }
            });
        }
        if (!playbackInfo2.f5941n.equals(playbackInfo.f5941n)) {
            this.f6641h.m3149b(13, new ListenerSet.a() { // from class: c.n.b.b.u
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    ((Player2.a) obj3).mo1103S(playbackInfo.f5941n);
                }
            });
        }
        if (z2) {
            this.f6641h.m3149b(-1, new ListenerSet.a() { // from class: c.n.b.b.a
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    ((Player2.a) obj3).mo1119o();
                }
            });
        }
        if (playbackInfo2.f5942o != playbackInfo.f5942o) {
            this.f6641h.m3149b(-1, new ListenerSet.a() { // from class: c.n.b.b.f
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    ((Player2.a) obj3).mo1104U(playbackInfo.f5942o);
                }
            });
        }
        if (playbackInfo2.f5943p != playbackInfo.f5943p) {
            this.f6641h.m3149b(-1, new ListenerSet.a() { // from class: c.n.b.b.s
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj3) {
                    ((Player2.a) obj3).mo1127y(playbackInfo.f5943p);
                }
            });
        }
        this.f6641h.m3148a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: P */
    public int mo3329P() {
        return this.f6657x.f5932e;
    }

    @Override // p007c.p190n.p194b.p209b.ExoPlayer
    /* JADX INFO: renamed from: a */
    public void mo3366a(MediaSource2 mediaSource2) {
        List listSingletonList = Collections.singletonList(mediaSource2);
        m3376t();
        getCurrentPosition();
        this.f6652s++;
        if (!this.f6643j.isEmpty()) {
            m3380z(0, this.f6643j.size());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listSingletonList.size(); i++) {
            MediaSourceList.c cVar = new MediaSourceList.c((MediaSource2) listSingletonList.get(i), this.f6644k);
            arrayList.add(cVar);
            this.f6643j.add(i + 0, new a(cVar.f10198b, cVar.f10197a.f9768s));
        }
        this.f6656w = this.f6656w.mo4184f(0, arrayList.size());
        PlaylistTimeline playlistTimeline = new PlaylistTimeline(this.f6643j, this.f6656w);
        if (!playlistTimeline.m3470q() && -1 >= playlistTimeline.f6603f) {
            throw new IllegalSeekPositionException(playlistTimeline, -1, -9223372036854775807L);
        }
        int iMo3456a = playlistTimeline.mo3456a(this.f6651r);
        PlaybackInfo playbackInfoM3378w = m3378w(this.f6657x, playlistTimeline, m3377u(playlistTimeline, iMo3456a, -9223372036854775807L));
        int i2 = playbackInfoM3378w.f5932e;
        if (iMo3456a != -1 && i2 != 1) {
            i2 = (playlistTimeline.m3470q() || iMo3456a >= playlistTimeline.f6603f) ? 4 : 2;
        }
        PlaybackInfo playbackInfoM2893g = playbackInfoM3378w.m2893g(i2);
        this.f6640g.f6693l.m3073c(17, new ExoPlayerImplInternal2.a(arrayList, this.f6656w, iMo3456a, C.m3236b(-9223372036854775807L), null)).sendToTarget();
        m3373A(playbackInfoM2893g, false, 4, 0, 1, false);
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: b */
    public PlaybackParameters mo3330b() {
        return this.f6657x.f5941n;
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: c */
    public boolean mo3331c() {
        return this.f6657x.f5930c.m4081a();
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: d */
    public long mo3332d() {
        return C.m3237c(this.f6657x.f5945r);
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: e */
    public void mo3333e(int i, long j2) {
        Timeline timeline = this.f6657x.f5929b;
        if (i < 0 || (!timeline.m3470q() && i >= timeline.mo3356p())) {
            throw new IllegalSeekPositionException(timeline, i, j2);
        }
        this.f6652s++;
        if (!mo3331c()) {
            PlaybackInfo playbackInfo = this.f6657x;
            PlaybackInfo playbackInfoM3378w = m3378w(playbackInfo.m2893g(playbackInfo.f5932e != 1 ? 2 : 1), timeline, m3377u(timeline, i, j2));
            this.f6640g.f6693l.m3073c(3, new ExoPlayerImplInternal2.g(timeline, i, C.m3236b(j2))).sendToTarget();
            m3373A(playbackInfoM3378w, true, 1, 0, 1, true);
            return;
        }
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        ExoPlayerImplInternal2.d dVar = new ExoPlayerImplInternal2.d(this.f6657x);
        dVar.m3452a(1);
        ExoPlayerImpl exoPlayerImpl = ((C1541m) this.f6639f).f6769a;
        exoPlayerImpl.f6638e.f6291a.post(new RunnableC1687r(exoPlayerImpl, dVar));
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: f */
    public boolean mo3334f() {
        return this.f6657x.f5939l;
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    public long getCurrentPosition() {
        if (this.f6657x.f5929b.m3470q()) {
            return this.f6659z;
        }
        if (this.f6657x.f5930c.m4081a()) {
            return C.m3237c(this.f6657x.f5946s);
        }
        PlaybackInfo playbackInfo = this.f6657x;
        return m3379y(playbackInfo.f5930c, playbackInfo.f5946s);
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    public long getDuration() {
        if (mo3331c()) {
            PlaybackInfo playbackInfo = this.f6657x;
            MediaSource2.a aVar = playbackInfo.f5930c;
            playbackInfo.f5929b.mo3463h(aVar.f8857a, this.f6642i);
            return C.m3237c(this.f6642i.m3471a(aVar.f8858b, aVar.f8859c));
        }
        Timeline timeline = this.f6657x.f5929b;
        if (timeline.m3470q()) {
            return -9223372036854775807L;
        }
        return timeline.m3468n(mo3337j(), this.f5927a).m3478b();
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: h */
    public int mo3335h() {
        if (this.f6657x.f5929b.m3470q()) {
            return 0;
        }
        PlaybackInfo playbackInfo = this.f6657x;
        return playbackInfo.f5929b.mo3457b(playbackInfo.f5930c.f8857a);
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: i */
    public int mo3336i() {
        if (mo3331c()) {
            return this.f6657x.f5930c.f8859c;
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: j */
    public int mo3337j() {
        int iM3376t = m3376t();
        if (iM3376t == -1) {
            return 0;
        }
        return iM3376t;
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: k */
    public void mo3338k(boolean z) {
        PlaybackInfo playbackInfo = this.f6657x;
        if (playbackInfo.f5939l == z && playbackInfo.f5940m == 0) {
            return;
        }
        this.f6652s++;
        PlaybackInfo playbackInfoM2890d = playbackInfo.m2890d(z, 0);
        this.f6640g.f6693l.m3072b(1, z ? 1 : 0, 0).sendToTarget();
        m3373A(playbackInfoM2890d, false, 4, 0, 1, false);
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: l */
    public long mo3339l() {
        if (!mo3331c()) {
            return getCurrentPosition();
        }
        PlaybackInfo playbackInfo = this.f6657x;
        playbackInfo.f5929b.mo3463h(playbackInfo.f5930c.f8857a, this.f6642i);
        PlaybackInfo playbackInfo2 = this.f6657x;
        return playbackInfo2.f5931d == -9223372036854775807L ? playbackInfo2.f5929b.m3468n(mo3337j(), this.f5927a).m3477a() : C.m3237c(this.f6642i.f6748e) + C.m3237c(this.f6657x.f5931d);
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: n */
    public int mo3340n() {
        if (mo3331c()) {
            return this.f6657x.f5930c.f8858b;
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    /* JADX INFO: renamed from: p */
    public Timeline mo3341p() {
        return this.f6657x.f5929b;
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    public void prepare() {
        PlaybackInfo playbackInfo = this.f6657x;
        if (playbackInfo.f5932e != 1) {
            return;
        }
        PlaybackInfo playbackInfoM2891e = playbackInfo.m2891e(null);
        PlaybackInfo playbackInfoM2893g = playbackInfoM2891e.m2893g(playbackInfoM2891e.f5929b.m3470q() ? 4 : 2);
        this.f6652s++;
        this.f6640g.f6693l.m3071a(0).sendToTarget();
        m3373A(playbackInfoM2893g, false, 4, 1, 1, false);
    }

    @Override // p007c.p190n.p194b.p209b.ExoPlayer
    /* JADX INFO: renamed from: q */
    public PlayerMessage mo3367q(PlayerMessage.b bVar) {
        return new PlayerMessage(this.f6640g, bVar, this.f6657x.f5929b, mo3337j(), this.f6649p, this.f6640g.f6695n);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: r */
    public void m3374r(Player2.a aVar) {
        ListenerSet<Player2.a, Player2.b> listenerSet = this.f6641h;
        if (listenerSet.f6353h) {
            return;
        }
        Objects.requireNonNull(aVar);
        listenerSet.f6350e.add((ListenerSet.c<T, E>) new ListenerSet.c(aVar, listenerSet.f6348c));
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    public void release() {
        String str;
        boolean z;
        StringBuilder sbM1556G = outline.m1556G("Release ");
        sbM1556G.append(Integer.toHexString(System.identityHashCode(this)));
        sbM1556G.append(" [");
        sbM1556G.append("ExoPlayerLib/2.13.3");
        sbM1556G.append("] [");
        sbM1556G.append(Util6.f6311e);
        sbM1556G.append("] [");
        HashSet<String> hashSet = ExoPlayerLibraryInfo.f6741a;
        synchronized (ExoPlayerLibraryInfo.class) {
            str = ExoPlayerLibraryInfo.f6742b;
        }
        sbM1556G.append(str);
        sbM1556G.append("]");
        Log.i("ExoPlayerImpl", sbM1556G.toString());
        ExoPlayerImplInternal2 exoPlayerImplInternal2 = this.f6640g;
        synchronized (exoPlayerImplInternal2) {
            if (exoPlayerImplInternal2.f6671D || !exoPlayerImplInternal2.f6694m.isAlive()) {
                z = true;
            } else {
                exoPlayerImplInternal2.f6693l.m3074d(7);
                long jMo3068a = exoPlayerImplInternal2.f6707z;
                synchronized (exoPlayerImplInternal2) {
                    long jMo3068a2 = exoPlayerImplInternal2.f6702u.mo3068a() + jMo3068a;
                    boolean z2 = false;
                    while (!Boolean.valueOf(exoPlayerImplInternal2.f6671D).booleanValue() && jMo3068a > 0) {
                        try {
                            exoPlayerImplInternal2.wait(jMo3068a);
                        } catch (InterruptedException unused) {
                            z2 = true;
                        }
                        jMo3068a = jMo3068a2 - exoPlayerImplInternal2.f6702u.mo3068a();
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    z = exoPlayerImplInternal2.f6671D;
                }
            }
        }
        if (!z) {
            ListenerSet<Player2.a, Player2.b> listenerSet = this.f6641h;
            listenerSet.m3149b(11, new ListenerSet.a() { // from class: c.n.b.b.o
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj) {
                    ((Player2.a) obj).mo1114j(new ExoPlaybackException(1, new ExoTimeoutException(1), null, null, -1, null, 4, false));
                }
            });
            listenerSet.m3148a();
        }
        this.f6641h.m3150c();
        this.f6638e.f6291a.removeCallbacksAndMessages(null);
        AnalyticsCollector analyticsCollector = this.f6646m;
        if (analyticsCollector != null) {
            this.f6648o.mo2918d(analyticsCollector);
        }
        PlaybackInfo playbackInfoM2893g = this.f6657x.m2893g(1);
        this.f6657x = playbackInfoM2893g;
        PlaybackInfo playbackInfoM2887a = playbackInfoM2893g.m2887a(playbackInfoM2893g.f5930c);
        this.f6657x = playbackInfoM2887a;
        playbackInfoM2887a.f5944q = playbackInfoM2887a.f5946s;
        this.f6657x.f5945r = 0L;
    }

    /* JADX INFO: renamed from: s */
    public long m3375s() {
        if (this.f6657x.f5929b.m3470q()) {
            return this.f6659z;
        }
        PlaybackInfo playbackInfo = this.f6657x;
        if (playbackInfo.f5938k.f8860d != playbackInfo.f5930c.f8860d) {
            return playbackInfo.f5929b.m3468n(mo3337j(), this.f5927a).m3478b();
        }
        long j2 = playbackInfo.f5944q;
        if (this.f6657x.f5938k.m4081a()) {
            PlaybackInfo playbackInfo2 = this.f6657x;
            Timeline.b bVarMo3463h = playbackInfo2.f5929b.mo3463h(playbackInfo2.f5938k.f8857a, this.f6642i);
            long jM3474d = bVarMo3463h.m3474d(this.f6657x.f5938k.f8858b);
            j2 = jM3474d == Long.MIN_VALUE ? bVarMo3463h.f6747d : jM3474d;
        }
        return m3379y(this.f6657x.f5938k, j2);
    }

    @Override // p007c.p190n.p194b.p209b.Player2
    public void setRepeatMode(final int i) {
        if (this.f6650q != i) {
            this.f6650q = i;
            this.f6640g.f6693l.m3072b(11, i, 0).sendToTarget();
            ListenerSet<Player2.a, Player2.b> listenerSet = this.f6641h;
            listenerSet.m3149b(9, new ListenerSet.a() { // from class: c.n.b.b.d
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj) {
                    ((Player2.a) obj).mo1099D(i);
                }
            });
            listenerSet.m3148a();
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m3376t() {
        if (this.f6657x.f5929b.m3470q()) {
            return this.f6658y;
        }
        PlaybackInfo playbackInfo = this.f6657x;
        return playbackInfo.f5929b.mo3463h(playbackInfo.f5930c.f8857a, this.f6642i).f6746c;
    }

    /* JADX INFO: renamed from: u */
    public final Pair<Object, Long> m3377u(Timeline timeline, int i, long j2) {
        if (timeline.m3470q()) {
            this.f6658y = i;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.f6659z = j2;
            return null;
        }
        if (i == -1 || i >= timeline.mo3356p()) {
            i = timeline.mo3456a(this.f6651r);
            j2 = timeline.m3468n(i, this.f5927a).m3477a();
        }
        return timeline.m3464j(this.f5927a, this.f6642i, i, C.m3236b(j2));
    }

    /* JADX INFO: renamed from: w */
    public final PlaybackInfo m3378w(PlaybackInfo playbackInfo, Timeline timeline, Pair<Object, Long> pair) {
        List<Metadata> list;
        C2096e.m4566b(timeline.m3470q() || pair != null);
        Timeline timeline2 = playbackInfo.f5929b;
        PlaybackInfo playbackInfoM2894h = playbackInfo.m2894h(timeline);
        if (timeline.m3470q()) {
            MediaSource2.a aVar = PlaybackInfo.f5928a;
            long jM3236b = C.m3236b(this.f6659z);
            long jM3236b2 = C.m3236b(this.f6659z);
            TrackGroupArray trackGroupArray = TrackGroupArray.f9067f;
            TrackSelectorResult trackSelectorResult = this.f6635b;
            AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
            PlaybackInfo playbackInfoM2887a = playbackInfoM2894h.m2888b(aVar, jM3236b, jM3236b2, 0L, trackGroupArray, trackSelectorResult, RegularImmutableList.f26218h).m2887a(aVar);
            playbackInfoM2887a.f5944q = playbackInfoM2887a.f5946s;
            return playbackInfoM2887a;
        }
        Object obj = playbackInfoM2894h.f5930c.f8857a;
        int i = Util6.f6307a;
        boolean z = !obj.equals(pair.first);
        MediaSource2.a aVar2 = z ? new MediaSource2.a(pair.first) : playbackInfoM2894h.f5930c;
        long jLongValue = ((Long) pair.second).longValue();
        long jM3236b3 = C.m3236b(mo3339l());
        if (!timeline2.m3470q()) {
            jM3236b3 -= timeline2.mo3463h(obj, this.f6642i).f6748e;
        }
        if (z || jLongValue < jM3236b3) {
            C2096e.m4570f(!aVar2.m4081a());
            TrackGroupArray trackGroupArray2 = z ? TrackGroupArray.f9067f : playbackInfoM2894h.f5935h;
            TrackSelectorResult trackSelectorResult2 = z ? this.f6635b : playbackInfoM2894h.f5936i;
            if (z) {
                AbstractIndexedListIterator<Object> abstractIndexedListIterator2 = ImmutableList2.f26255g;
                list = RegularImmutableList.f26218h;
            } else {
                list = playbackInfoM2894h.f5937j;
            }
            PlaybackInfo playbackInfoM2887a2 = playbackInfoM2894h.m2888b(aVar2, jLongValue, jLongValue, 0L, trackGroupArray2, trackSelectorResult2, list).m2887a(aVar2);
            playbackInfoM2887a2.f5944q = jLongValue;
            return playbackInfoM2887a2;
        }
        if (jLongValue != jM3236b3) {
            C2096e.m4570f(!aVar2.m4081a());
            long jMax = Math.max(0L, playbackInfoM2894h.f5945r - (jLongValue - jM3236b3));
            long j2 = playbackInfoM2894h.f5944q;
            if (playbackInfoM2894h.f5938k.equals(playbackInfoM2894h.f5930c)) {
                j2 = jLongValue + jMax;
            }
            PlaybackInfo playbackInfoM2888b = playbackInfoM2894h.m2888b(aVar2, jLongValue, jLongValue, jMax, playbackInfoM2894h.f5935h, playbackInfoM2894h.f5936i, playbackInfoM2894h.f5937j);
            playbackInfoM2888b.f5944q = j2;
            return playbackInfoM2888b;
        }
        int iMo3457b = timeline.mo3457b(playbackInfoM2894h.f5938k.f8857a);
        if (iMo3457b != -1 && timeline.m3461f(iMo3457b, this.f6642i).f6746c == timeline.mo3463h(aVar2.f8857a, this.f6642i).f6746c) {
            return playbackInfoM2894h;
        }
        timeline.mo3463h(aVar2.f8857a, this.f6642i);
        long jM3471a = aVar2.m4081a() ? this.f6642i.m3471a(aVar2.f8858b, aVar2.f8859c) : this.f6642i.f6747d;
        PlaybackInfo playbackInfoM2887a3 = playbackInfoM2894h.m2888b(aVar2, playbackInfoM2894h.f5946s, playbackInfoM2894h.f5946s, jM3471a - playbackInfoM2894h.f5946s, playbackInfoM2894h.f5935h, playbackInfoM2894h.f5936i, playbackInfoM2894h.f5937j).m2887a(aVar2);
        playbackInfoM2887a3.f5944q = jM3471a;
        return playbackInfoM2887a3;
    }

    /* JADX INFO: renamed from: y */
    public final long m3379y(MediaSource2.a aVar, long j2) {
        long jM3237c = C.m3237c(j2);
        this.f6657x.f5929b.mo3463h(aVar.f8857a, this.f6642i);
        return jM3237c + C.m3237c(this.f6642i.f6748e);
    }

    /* JADX INFO: renamed from: z */
    public final void m3380z(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.f6643j.remove(i3);
        }
        this.f6656w = this.f6656w.mo4180b(i, i2);
    }
}
