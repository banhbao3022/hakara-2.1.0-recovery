package p007c.p190n.p194b.p209b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.BandwidthMeter;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.Clock2;
import p007c.p190n.p194b.p209b.p212b2.Log;
import p007c.p190n.p194b.p209b.p212b2.MediaClock;
import p007c.p190n.p194b.p209b.p212b2.StandaloneMediaClock;
import p007c.p190n.p194b.p209b.p212b2.SystemHandlerWrapper;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsCollector;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p243w1.MediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.SampleStream;
import p007c.p190n.p194b.p209b.p243w1.SequenceableLoader;
import p007c.p190n.p194b.p209b.p243w1.ShuffleOrder;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p252x1.TextRenderer;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;
import p007c.p190n.p194b.p209b.p262y1.TrackSelector;
import p007c.p190n.p194b.p209b.p262y1.TrackSelectorResult;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.RegularImmutableList;

/* JADX INFO: renamed from: c.n.b.b.k0, reason: use source file name */
/* JADX INFO: compiled from: ExoPlayerImplInternal.java */
/* JADX INFO: loaded from: classes.dex */
public final class ExoPlayerImplInternal2 implements Handler.Callback, MediaPeriod.a, TrackSelector.a, MediaSourceList.d, DefaultMediaClock.a, PlayerMessage.a {

    /* JADX INFO: renamed from: A */
    public SeekParameters f6668A;

    /* JADX INFO: renamed from: B */
    public PlaybackInfo f6669B;

    /* JADX INFO: renamed from: C */
    public d f6670C;

    /* JADX INFO: renamed from: D */
    public boolean f6671D;

    /* JADX INFO: renamed from: E */
    public boolean f6672E;

    /* JADX INFO: renamed from: F */
    public boolean f6673F;

    /* JADX INFO: renamed from: G */
    public boolean f6674G;

    /* JADX INFO: renamed from: H */
    public boolean f6675H;

    /* JADX INFO: renamed from: I */
    public int f6676I;

    /* JADX INFO: renamed from: J */
    public boolean f6677J;

    /* JADX INFO: renamed from: K */
    public boolean f6678K;

    /* JADX INFO: renamed from: L */
    public boolean f6679L;

    /* JADX INFO: renamed from: M */
    public boolean f6680M;

    /* JADX INFO: renamed from: N */
    public int f6681N;

    /* JADX INFO: renamed from: O */
    public g f6682O;

    /* JADX INFO: renamed from: P */
    public long f6683P;

    /* JADX INFO: renamed from: Q */
    public int f6684Q;

    /* JADX INFO: renamed from: R */
    public boolean f6685R;

    /* JADX INFO: renamed from: S */
    public ExoPlaybackException f6686S;

    /* JADX INFO: renamed from: f */
    public final Renderer2[] f6687f;

    /* JADX INFO: renamed from: g */
    public final RendererCapabilities[] f6688g;

    /* JADX INFO: renamed from: h */
    public final TrackSelector f6689h;

    /* JADX INFO: renamed from: i */
    public final TrackSelectorResult f6690i;

    /* JADX INFO: renamed from: j */
    public final LoadControl f6691j;

    /* JADX INFO: renamed from: k */
    public final BandwidthMeter f6692k;

    /* JADX INFO: renamed from: l */
    public final SystemHandlerWrapper f6693l;

    /* JADX INFO: renamed from: m */
    public final HandlerThread f6694m;

    /* JADX INFO: renamed from: n */
    public final Looper f6695n;

    /* JADX INFO: renamed from: o */
    public final Timeline.c f6696o;

    /* JADX INFO: renamed from: p */
    public final Timeline.b f6697p;

    /* JADX INFO: renamed from: q */
    public final long f6698q;

    /* JADX INFO: renamed from: r */
    public final boolean f6699r;

    /* JADX INFO: renamed from: s */
    public final DefaultMediaClock f6700s;

    /* JADX INFO: renamed from: t */
    public final ArrayList<c> f6701t;

    /* JADX INFO: renamed from: u */
    public final Clock2 f6702u;

    /* JADX INFO: renamed from: v */
    public final e f6703v;

    /* JADX INFO: renamed from: w */
    public final MediaPeriodQueue f6704w;

    /* JADX INFO: renamed from: x */
    public final MediaSourceList f6705x;

    /* JADX INFO: renamed from: y */
    public final LivePlaybackSpeedControl f6706y;

    /* JADX INFO: renamed from: z */
    public final long f6707z;

    /* JADX INFO: renamed from: c.n.b.b.k0$a */
    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<MediaSourceList.c> f6708a;

        /* JADX INFO: renamed from: b */
        public final ShuffleOrder f6709b;

        /* JADX INFO: renamed from: c */
        public final int f6710c;

        /* JADX INFO: renamed from: d */
        public final long f6711d;

        public a(List list, ShuffleOrder shuffleOrder, int i, long j2, ExoPlayerImplInternal exoPlayerImplInternal) {
            this.f6708a = list;
            this.f6709b = shuffleOrder;
            this.f6710c = i;
            this.f6711d = j2;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.k0$b */
    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f6712a;

        /* JADX INFO: renamed from: b */
        public final int f6713b;

        /* JADX INFO: renamed from: c */
        public final int f6714c;

        /* JADX INFO: renamed from: d */
        public final ShuffleOrder f6715d;

        public b(int i, int i2, int i3, ShuffleOrder shuffleOrder) {
            this.f6712a = i;
            this.f6713b = i2;
            this.f6714c = i3;
            this.f6715d = shuffleOrder;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.k0$c */
    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: f */
        public final PlayerMessage f6716f;

        /* JADX INFO: renamed from: g */
        public int f6717g;

        /* JADX INFO: renamed from: h */
        public long f6718h;

        /* JADX INFO: renamed from: i */
        public Object f6719i;

        public c(PlayerMessage playerMessage) {
            this.f6716f = playerMessage;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0017  */
        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            c cVar2 = cVar;
            Object obj = this.f6719i;
            int i = 1;
            if ((obj == null) != (cVar2.f6719i == null)) {
                if (obj != null) {
                    i = -1;
                }
            } else {
                if (obj == null) {
                    return 0;
                }
                int i2 = this.f6717g - cVar2.f6717g;
                if (i2 != 0) {
                    return i2;
                }
                long j2 = this.f6718h;
                long j3 = cVar2.f6718h;
                int i3 = Util6.f6307a;
                if (j2 < j3) {
                    i = -1;
                } else if (j2 == j3) {
                    i = 0;
                }
            }
            return i;
        }

        /* JADX INFO: renamed from: f */
        public void m3451f(int i, long j2, Object obj) {
            this.f6717g = i;
            this.f6718h = j2;
            this.f6719i = obj;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.k0$d */
    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public boolean f6720a;

        /* JADX INFO: renamed from: b */
        public PlaybackInfo f6721b;

        /* JADX INFO: renamed from: c */
        public int f6722c;

        /* JADX INFO: renamed from: d */
        public boolean f6723d;

        /* JADX INFO: renamed from: e */
        public int f6724e;

        /* JADX INFO: renamed from: f */
        public boolean f6725f;

        /* JADX INFO: renamed from: g */
        public int f6726g;

        public d(PlaybackInfo playbackInfo) {
            this.f6721b = playbackInfo;
        }

        /* JADX INFO: renamed from: a */
        public void m3452a(int i) {
            this.f6720a |= i > 0;
            this.f6722c += i;
        }

        /* JADX INFO: renamed from: b */
        public void m3453b(int i) {
            if (this.f6723d && this.f6724e != 4) {
                C2096e.m4566b(i == 4);
                return;
            }
            this.f6720a = true;
            this.f6723d = true;
            this.f6724e = i;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.k0$e */
    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public interface e {
    }

    /* JADX INFO: renamed from: c.n.b.b.k0$f */
    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public final MediaSource2.a f6727a;

        /* JADX INFO: renamed from: b */
        public final long f6728b;

        /* JADX INFO: renamed from: c */
        public final long f6729c;

        /* JADX INFO: renamed from: d */
        public final boolean f6730d;

        /* JADX INFO: renamed from: e */
        public final boolean f6731e;

        /* JADX INFO: renamed from: f */
        public final boolean f6732f;

        public f(MediaSource2.a aVar, long j2, long j3, boolean z, boolean z2, boolean z3) {
            this.f6727a = aVar;
            this.f6728b = j2;
            this.f6729c = j3;
            this.f6730d = z;
            this.f6731e = z2;
            this.f6732f = z3;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.k0$g */
    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public final Timeline f6733a;

        /* JADX INFO: renamed from: b */
        public final int f6734b;

        /* JADX INFO: renamed from: c */
        public final long f6735c;

        public g(Timeline timeline, int i, long j2) {
            this.f6733a = timeline;
            this.f6734b = i;
            this.f6735c = j2;
        }
    }

    public ExoPlayerImplInternal2(Renderer2[] renderer2Arr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i, boolean z, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j2, boolean z2, Looper looper, Clock2 clock2, e eVar) {
        this.f6703v = eVar;
        this.f6687f = renderer2Arr;
        this.f6689h = trackSelector;
        this.f6690i = trackSelectorResult;
        this.f6691j = loadControl;
        this.f6692k = bandwidthMeter;
        this.f6676I = i;
        this.f6677J = z;
        this.f6668A = seekParameters;
        this.f6706y = livePlaybackSpeedControl;
        this.f6707z = j2;
        this.f6672E = z2;
        this.f6702u = clock2;
        this.f6698q = loadControl.mo3345c();
        this.f6699r = loadControl.mo3344b();
        PlaybackInfo playbackInfoM2886i = PlaybackInfo.m2886i(trackSelectorResult);
        this.f6669B = playbackInfoM2886i;
        this.f6670C = new d(playbackInfoM2886i);
        this.f6688g = new RendererCapabilities[renderer2Arr.length];
        for (int i2 = 0; i2 < renderer2Arr.length; i2++) {
            renderer2Arr[i2].mo3039f(i2);
            this.f6688g[i2] = renderer2Arr[i2].mo3044l();
        }
        this.f6700s = new DefaultMediaClock(this, clock2);
        this.f6701t = new ArrayList<>();
        this.f6696o = new Timeline.c();
        this.f6697p = new Timeline.b();
        trackSelector.f10363a = this;
        trackSelector.f10364b = bandwidthMeter;
        this.f6685R = true;
        Handler handler = new Handler(looper);
        this.f6704w = new MediaPeriodQueue(analyticsCollector, handler);
        this.f6705x = new MediaSourceList(this, analyticsCollector, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f6694m = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f6695n = looper2;
        this.f6693l = clock2.mo3070c(looper2, this);
    }

    /* JADX INFO: renamed from: I */
    public static void m3384I(Timeline timeline, c cVar, Timeline.c cVar2, Timeline.b bVar) {
        int i = timeline.m3468n(timeline.mo3463h(cVar.f6719i, bVar).f6746c, cVar2).f6765p;
        Object obj = timeline.mo3462g(i, bVar, true).f6745b;
        long j2 = bVar.f6747d;
        cVar.m3451f(i, j2 != -9223372036854775807L ? j2 - 1 : Long.MAX_VALUE, obj);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m3385J(c cVar, Timeline timeline, Timeline timeline2, int i, boolean z, Timeline.c cVar2, Timeline.b bVar) {
        Object obj = cVar.f6719i;
        if (obj == null) {
            long j2 = cVar.f6716f.f6591i;
            long jM3236b = j2 == Long.MIN_VALUE ? -9223372036854775807L : C.m3236b(j2);
            PlayerMessage playerMessage = cVar.f6716f;
            Pair<Object, Long> pairM3386L = m3386L(timeline, new g(playerMessage.f6586d, playerMessage.f6590h, jM3236b), false, i, z, cVar2, bVar);
            if (pairM3386L == null) {
                return false;
            }
            cVar.m3451f(timeline.mo3457b(pairM3386L.first), ((Long) pairM3386L.second).longValue(), pairM3386L.first);
            if (cVar.f6716f.f6591i == Long.MIN_VALUE) {
                m3384I(timeline, cVar, cVar2, bVar);
            }
            return true;
        }
        int iMo3457b = timeline.mo3457b(obj);
        if (iMo3457b == -1) {
            return false;
        }
        if (cVar.f6716f.f6591i == Long.MIN_VALUE) {
            m3384I(timeline, cVar, cVar2, bVar);
            return true;
        }
        cVar.f6717g = iMo3457b;
        timeline2.mo3463h(cVar.f6719i, bVar);
        if (timeline2.m3468n(bVar.f6746c, cVar2).f6763n) {
            Pair<Object, Long> pairM3464j = timeline.m3464j(cVar2, bVar, timeline.mo3463h(cVar.f6719i, bVar).f6746c, cVar.f6718h + bVar.f6748e);
            cVar.m3451f(timeline.mo3457b(pairM3464j.first), ((Long) pairM3464j.second).longValue(), pairM3464j.first);
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public static Pair<Object, Long> m3386L(Timeline timeline, g gVar, boolean z, int i, boolean z2, Timeline.c cVar, Timeline.b bVar) {
        Object objM3387M;
        Timeline timeline2 = gVar.f6733a;
        if (timeline.m3470q()) {
            return null;
        }
        Timeline timeline3 = timeline2.m3470q() ? timeline : timeline2;
        try {
            Pair<Object, Long> pairM3464j = timeline3.m3464j(cVar, bVar, gVar.f6734b, gVar.f6735c);
            if (timeline.equals(timeline3)) {
                return pairM3464j;
            }
            if (timeline.mo3457b(pairM3464j.first) != -1) {
                timeline3.mo3463h(pairM3464j.first, bVar);
                return timeline3.m3468n(bVar.f6746c, cVar).f6763n ? timeline.m3464j(cVar, bVar, timeline.mo3463h(pairM3464j.first, bVar).f6746c, gVar.f6735c) : pairM3464j;
            }
            if (z && (objM3387M = m3387M(cVar, bVar, i, z2, pairM3464j.first, timeline3, timeline)) != null) {
                return timeline.m3464j(cVar, bVar, timeline.mo3463h(objM3387M, bVar).f6746c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX INFO: renamed from: M */
    public static Object m3387M(Timeline.c cVar, Timeline.b bVar, int i, boolean z, Object obj, Timeline timeline, Timeline timeline2) {
        int iMo3457b = timeline.mo3457b(obj);
        int iMo3355i = timeline.mo3355i();
        int iM3459d = iMo3457b;
        int iMo3457b2 = -1;
        for (int i2 = 0; i2 < iMo3355i && iMo3457b2 == -1; i2++) {
            iM3459d = timeline.m3459d(iM3459d, bVar, cVar, i, z);
            if (iM3459d == -1) {
                break;
            }
            iMo3457b2 = timeline2.mo3457b(timeline.mo3467m(iM3459d));
        }
        if (iMo3457b2 == -1) {
            return null;
        }
        return timeline2.mo3467m(iMo3457b2);
    }

    /* JADX INFO: renamed from: h */
    public static Format[] m3388h(ExoTrackSelection2 exoTrackSelection2) {
        int length = exoTrackSelection2 != null ? exoTrackSelection2.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = exoTrackSelection2.mo4516f(i);
        }
        return formatArr;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m3389i0(PlaybackInfo playbackInfo, Timeline.b bVar, Timeline.c cVar) {
        MediaSource2.a aVar = playbackInfo.f5930c;
        Timeline timeline = playbackInfo.f5929b;
        return aVar.m4081a() || timeline.m3470q() || timeline.m3468n(timeline.mo3463h(aVar.f8857a, bVar).f6746c, cVar).f6763n;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m3390w(Renderer2 renderer2) {
        return renderer2.getState() != 0;
    }

    /* JADX INFO: renamed from: A */
    public final void m3391A(b bVar) throws Throwable {
        Timeline timelineM4497c;
        this.f6670C.m3452a(1);
        MediaSourceList mediaSourceList = this.f6705x;
        int i = bVar.f6712a;
        int i2 = bVar.f6713b;
        int i3 = bVar.f6714c;
        ShuffleOrder shuffleOrder = bVar.f6715d;
        Objects.requireNonNull(mediaSourceList);
        C2096e.m4566b(i >= 0 && i <= i2 && i2 <= mediaSourceList.m4499e() && i3 >= 0);
        mediaSourceList.f10187i = shuffleOrder;
        if (i == i2 || i == i3) {
            timelineM4497c = mediaSourceList.m4497c();
        } else {
            int iMin = Math.min(i, i3);
            int i4 = i2 - i;
            int iMax = Math.max((i3 + i4) - 1, i2 - 1);
            int iMo3356p = mediaSourceList.f10179a.get(iMin).f10200d;
            List<MediaSourceList.c> list = mediaSourceList.f10179a;
            int i5 = Util6.f6307a;
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                i4--;
                if (i4 < 0) {
                    break;
                } else {
                    arrayDeque.addFirst(list.remove(i + i4));
                }
            }
            list.addAll(Math.min(i3, list.size()), arrayDeque);
            while (iMin <= iMax) {
                MediaSourceList.c cVar = mediaSourceList.f10179a.get(iMin);
                cVar.f10200d = iMo3356p;
                iMo3356p += cVar.f10197a.f9768s.mo3356p();
                iMin++;
            }
            timelineM4497c = mediaSourceList.m4497c();
        }
        m3443r(timelineM4497c);
    }

    /* JADX INFO: renamed from: B */
    public final void m3392B() {
        this.f6670C.m3452a(1);
        m3396F(false, false, false, true);
        this.f6691j.mo3343a();
        m3424f0(this.f6669B.f5929b.m3470q() ? 4 : 2);
        MediaSourceList mediaSourceList = this.f6705x;
        TransferListener transferListenerMo2917c = this.f6692k.mo2917c();
        C2096e.m4570f(!mediaSourceList.f10188j);
        mediaSourceList.f10189k = transferListenerMo2917c;
        for (int i = 0; i < mediaSourceList.f10179a.size(); i++) {
            MediaSourceList.c cVar = mediaSourceList.f10179a.get(i);
            mediaSourceList.m4501g(cVar);
            mediaSourceList.f10186h.add(cVar);
        }
        mediaSourceList.f10188j = true;
        this.f6693l.m3074d(2);
    }

    /* JADX INFO: renamed from: C */
    public final void m3393C() {
        m3396F(true, false, true, false);
        this.f6691j.mo3347e();
        m3424f0(1);
        this.f6694m.quit();
        synchronized (this) {
            this.f6671D = true;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m3394D(int i, int i2, ShuffleOrder shuffleOrder) throws Throwable {
        this.f6670C.m3452a(1);
        MediaSourceList mediaSourceList = this.f6705x;
        Objects.requireNonNull(mediaSourceList);
        C2096e.m4566b(i >= 0 && i <= i2 && i2 <= mediaSourceList.m4499e());
        mediaSourceList.f10187i = shuffleOrder;
        mediaSourceList.m4503i(i, i2);
        m3443r(mediaSourceList.m4497c());
    }

    /* JADX INFO: renamed from: E */
    public final void m3395E() throws ExoPlaybackException {
        boolean z;
        int i;
        float f2 = this.f6700s.mo3064b().f6260b;
        MediaPeriodQueue mediaPeriodQueue = this.f6704w;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.f8832h;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.f8833i;
        boolean z2 = true;
        for (MediaPeriodHolder mediaPeriodHolder3 = mediaPeriodHolder; mediaPeriodHolder3 != null && mediaPeriodHolder3.f8649d; mediaPeriodHolder3 = mediaPeriodHolder3.f8657l) {
            TrackSelectorResult trackSelectorResultM4007i = mediaPeriodHolder3.m4007i(f2, this.f6669B.f5929b);
            TrackSelectorResult trackSelectorResult = mediaPeriodHolder3.f8659n;
            int i2 = 0;
            if (trackSelectorResult == null || trackSelectorResult.f10367c.length != trackSelectorResultM4007i.f10367c.length) {
                z = false;
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= trackSelectorResultM4007i.f10367c.length) {
                    z = true;
                    break;
                } else {
                    if (!trackSelectorResultM4007i.m4547a(trackSelectorResult, i3)) {
                        z = false;
                        break;
                    }
                    i3++;
                }
            }
            if (!z) {
                if (z2) {
                    MediaPeriodQueue mediaPeriodQueue2 = this.f6704w;
                    MediaPeriodHolder mediaPeriodHolder4 = mediaPeriodQueue2.f8832h;
                    boolean zM4063m = mediaPeriodQueue2.m4063m(mediaPeriodHolder4);
                    boolean[] zArr = new boolean[this.f6687f.length];
                    long jM3999a = mediaPeriodHolder4.m3999a(trackSelectorResultM4007i, this.f6669B.f5946s, zM4063m, zArr);
                    PlaybackInfo playbackInfo = this.f6669B;
                    i = 4;
                    PlaybackInfo playbackInfoM3446u = m3446u(playbackInfo.f5930c, jM3999a, playbackInfo.f5931d);
                    this.f6669B = playbackInfoM3446u;
                    if (playbackInfoM3446u.f5932e != 4 && jM3999a != playbackInfoM3446u.f5946s) {
                        this.f6670C.m3453b(4);
                        m3398H(jM3999a);
                    }
                    boolean[] zArr2 = new boolean[this.f6687f.length];
                    while (true) {
                        Renderer2[] renderer2Arr = this.f6687f;
                        if (i2 >= renderer2Arr.length) {
                            break;
                        }
                        Renderer2 renderer2 = renderer2Arr[i2];
                        zArr2[i2] = m3390w(renderer2);
                        SampleStream sampleStream = mediaPeriodHolder4.f8648c[i2];
                        if (zArr2[i2]) {
                            if (sampleStream != renderer2.mo3048q()) {
                                m3419d(renderer2);
                            } else if (zArr[i2]) {
                                renderer2.mo3051t(this.f6683P);
                            }
                        }
                        i2++;
                    }
                    m3425g(zArr2);
                } else {
                    i = 4;
                    this.f6704w.m4063m(mediaPeriodHolder3);
                    if (mediaPeriodHolder3.f8649d) {
                        mediaPeriodHolder3.m3999a(trackSelectorResultM4007i, Math.max(mediaPeriodHolder3.f8651f.f8810b, this.f6683P - mediaPeriodHolder3.f8660o), false, new boolean[mediaPeriodHolder3.f8654i.length]);
                    }
                }
                m3442q(true);
                if (this.f6669B.f5932e != i) {
                    m3449y();
                    m3440o0();
                    this.f6693l.m3074d(2);
                    return;
                }
                return;
            }
            if (mediaPeriodHolder3 == mediaPeriodHolder2) {
                z2 = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[PHI: r3 r4 r6
  0x00a1: PHI (r3v4 c.n.b.b.w1.e0$a) = (r3v3 c.n.b.b.w1.e0$a), (r3v9 c.n.b.b.w1.e0$a) binds: [B:30:0x0073, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r4v2 long) = (r4v1 long), (r4v5 long) binds: [B:30:0x0073, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r6v4 long) = (r6v3 long), (r6v7 long) binds: [B:30:0x0073, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: F */
    public final void m3396F(boolean z, boolean z2, boolean z3, boolean z4) {
        MediaSource2.a aVar;
        long j2;
        long j3;
        boolean z5;
        List list;
        this.f6693l.f6291a.removeMessages(2);
        this.f6674G = false;
        DefaultMediaClock defaultMediaClock = this.f6700s;
        defaultMediaClock.f6602k = false;
        StandaloneMediaClock standaloneMediaClock = defaultMediaClock.f6597f;
        if (standaloneMediaClock.f6285g) {
            standaloneMediaClock.m3063a(standaloneMediaClock.mo3066d());
            standaloneMediaClock.f6285g = false;
        }
        this.f6683P = 0L;
        for (Renderer2 renderer2 : this.f6687f) {
            try {
                m3419d(renderer2);
            } catch (ExoPlaybackException | RuntimeException e2) {
                Log.m3154b("ExoPlayerImplInternal", "Disable failed.", e2);
            }
        }
        if (z) {
            for (Renderer2 renderer3 : this.f6687f) {
                try {
                    renderer3.reset();
                } catch (RuntimeException e3) {
                    Log.m3154b("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.f6681N = 0;
        PlaybackInfo playbackInfo = this.f6669B;
        MediaSource2.a aVar2 = playbackInfo.f5930c;
        long jLongValue = playbackInfo.f5946s;
        long j4 = m3389i0(this.f6669B, this.f6697p, this.f6696o) ? this.f6669B.f5931d : this.f6669B.f5946s;
        if (z2) {
            this.f6682O = null;
            Pair<MediaSource2.a, Long> pairM3435m = m3435m(this.f6669B.f5929b);
            aVar2 = (MediaSource2.a) pairM3435m.first;
            jLongValue = ((Long) pairM3435m.second).longValue();
            j4 = -9223372036854775807L;
            if (aVar2.equals(this.f6669B.f5930c)) {
                aVar = aVar2;
                j2 = jLongValue;
                j3 = j4;
                z5 = false;
            } else {
                z5 = true;
                aVar = aVar2;
                j2 = jLongValue;
                j3 = -9223372036854775807L;
            }
        } else {
            aVar = aVar2;
            j2 = jLongValue;
            j3 = j4;
            z5 = false;
        }
        this.f6704w.m4052b();
        this.f6675H = false;
        PlaybackInfo playbackInfo2 = this.f6669B;
        Timeline timeline = playbackInfo2.f5929b;
        int i = playbackInfo2.f5932e;
        ExoPlaybackException exoPlaybackException = z4 ? null : playbackInfo2.f5933f;
        TrackGroupArray trackGroupArray = z5 ? TrackGroupArray.f9067f : playbackInfo2.f5935h;
        TrackSelectorResult trackSelectorResult = z5 ? this.f6690i : playbackInfo2.f5936i;
        if (z5) {
            AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
            list = RegularImmutableList.f26218h;
        } else {
            list = playbackInfo2.f5937j;
        }
        this.f6669B = new PlaybackInfo(timeline, aVar, j3, i, exoPlaybackException, false, trackGroupArray, trackSelectorResult, list, aVar, playbackInfo2.f5939l, playbackInfo2.f5940m, playbackInfo2.f5941n, j2, 0L, j2, this.f6680M, false);
        if (z3) {
            MediaSourceList mediaSourceList = this.f6705x;
            for (MediaSourceList.b bVar : mediaSourceList.f10185g.values()) {
                try {
                    bVar.f10194a.mo4085b(bVar.f10195b);
                } catch (RuntimeException e4) {
                    Log.m3154b("MediaSourceList", "Failed to release child source.", e4);
                }
                bVar.f10194a.mo4087d(bVar.f10196c);
            }
            mediaSourceList.f10185g.clear();
            mediaSourceList.f10186h.clear();
            mediaSourceList.f10188j = false;
        }
        this.f6686S = null;
    }

    /* JADX INFO: renamed from: G */
    public final void m3397G() {
        MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8832h;
        this.f6673F = mediaPeriodHolder != null && mediaPeriodHolder.f8651f.f8815g && this.f6672E;
    }

    /* JADX INFO: renamed from: H */
    public final void m3398H(long j2) throws ExoPlaybackException {
        MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8832h;
        if (mediaPeriodHolder != null) {
            j2 += mediaPeriodHolder.f8660o;
        }
        this.f6683P = j2;
        this.f6700s.f6597f.m3063a(j2);
        for (Renderer2 renderer2 : this.f6687f) {
            if (m3390w(renderer2)) {
                renderer2.mo3051t(this.f6683P);
            }
        }
        for (MediaPeriodHolder mediaPeriodHolder2 = this.f6704w.f8832h; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.f8657l) {
            for (ExoTrackSelection2 exoTrackSelection2 : mediaPeriodHolder2.f8659n.f10367c) {
                if (exoTrackSelection2 != null) {
                    exoTrackSelection2.mo4521r();
                }
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m3399K(Timeline timeline, Timeline timeline2) {
        if (timeline.m3470q() && timeline2.m3470q()) {
            return;
        }
        int size = this.f6701t.size();
        while (true) {
            size--;
            if (size < 0) {
                Collections.sort(this.f6701t);
                return;
            } else if (!m3385J(this.f6701t.get(size), timeline, timeline2, this.f6676I, this.f6677J, this.f6696o, this.f6697p)) {
                this.f6701t.get(size).f6716f.m3354b(false);
                this.f6701t.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m3400N(long j2, long j3) {
        this.f6693l.f6291a.removeMessages(2);
        this.f6693l.f6291a.sendEmptyMessageAtTime(2, j2 + j3);
    }

    /* JADX INFO: renamed from: O */
    public final void m3401O(boolean z) throws ExoPlaybackException {
        MediaSource2.a aVar = this.f6704w.f8832h.f8651f.f8809a;
        long jM3404R = m3404R(aVar, this.f6669B.f5946s, true, false);
        if (jM3404R != this.f6669B.f5946s) {
            this.f6669B = m3446u(aVar, jM3404R, this.f6669B.f5931d);
            if (z) {
                this.f6670C.m3453b(4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0148  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: P */
    public final void m3402P(g gVar) throws Throwable {
        long jLongValue;
        long j2;
        MediaSource2.a aVar;
        boolean z;
        int i;
        long j3;
        long j4;
        long j5;
        PlaybackInfo playbackInfo;
        int i2;
        this.f6670C.m3452a(1);
        Pair<Object, Long> pairM3386L = m3386L(this.f6669B.f5929b, gVar, true, this.f6676I, this.f6677J, this.f6696o, this.f6697p);
        if (pairM3386L == null) {
            Pair<MediaSource2.a, Long> pairM3435m = m3435m(this.f6669B.f5929b);
            aVar = (MediaSource2.a) pairM3435m.first;
            jLongValue = ((Long) pairM3435m.second).longValue();
            z = !this.f6669B.f5929b.m3470q();
            j2 = -9223372036854775807L;
        } else {
            Object obj = pairM3386L.first;
            jLongValue = ((Long) pairM3386L.second).longValue();
            j2 = gVar.f6735c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            MediaSource2.a aVarM4064n = this.f6704w.m4064n(this.f6669B.f5929b, obj, jLongValue);
            if (aVarM4064n.m4081a()) {
                this.f6669B.f5929b.mo3463h(aVarM4064n.f8857a, this.f6697p);
                jLongValue = this.f6697p.m3475e(aVarM4064n.f8858b) == aVarM4064n.f8859c ? this.f6697p.f6749f.f9079f : 0L;
                aVar = aVarM4064n;
                z = true;
            } else {
                aVar = aVarM4064n;
                z = gVar.f6735c == -9223372036854775807L;
            }
        }
        try {
            try {
                if (!this.f6669B.f5929b.m3470q()) {
                    if (pairM3386L == null) {
                        if (this.f6669B.f5932e != 1) {
                            m3424f0(4);
                        }
                        m3396F(false, true, false, true);
                    } else {
                        if (aVar.equals(this.f6669B.f5930c)) {
                            MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8832h;
                            long jMo4071f = (mediaPeriodHolder == null || !mediaPeriodHolder.f8649d || jLongValue == 0) ? jLongValue : mediaPeriodHolder.f8646a.mo4071f(jLongValue, this.f6668A);
                            long j6 = jMo4071f;
                            if (C.m3237c(jMo4071f) == C.m3237c(this.f6669B.f5946s) && ((i2 = (playbackInfo = this.f6669B).f5932e) == 2 || i2 == 3)) {
                                this.f6669B = m3446u(aVar, playbackInfo.f5946s, j2);
                                if (z) {
                                    this.f6670C.m3453b(2);
                                    return;
                                }
                                return;
                            }
                            i = 2;
                            j4 = j6;
                            j3 = jLongValue;
                            this.f6669B = m3446u(aVar, j3, j2);
                            if (z) {
                                this.f6670C.m3453b(i);
                            }
                            throw th;
                        }
                        i = 2;
                        j4 = jLongValue;
                        try {
                            long jM3403Q = m3403Q(aVar, j4, this.f6669B.f5932e == 4);
                            boolean z2 = (jLongValue != jM3403Q) | z;
                            try {
                                PlaybackInfo playbackInfo2 = this.f6669B;
                                Timeline timeline = playbackInfo2.f5929b;
                                m3438n0(timeline, aVar, timeline, playbackInfo2.f5930c, j2);
                                z = z2;
                                j5 = jM3403Q;
                            } catch (Throwable th) {
                                th = th;
                                z = z2;
                                j3 = jM3403Q;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j3 = jLongValue;
                        }
                    }
                    this.f6669B = m3446u(aVar, j5, j2);
                    if (z) {
                        this.f6670C.m3453b(i);
                    }
                }
                this.f6682O = gVar;
                j5 = jLongValue;
                i = 2;
                this.f6669B = m3446u(aVar, j5, j2);
                if (z) {
                    this.f6670C.m3453b(i);
                }
            } catch (Throwable th3) {
                th = th3;
                j3 = jLongValue;
                i = 2;
            }
        } catch (Throwable th4) {
            th = th4;
            i = 2;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final long m3403Q(MediaSource2.a aVar, long j2, boolean z) throws ExoPlaybackException {
        MediaPeriodQueue mediaPeriodQueue = this.f6704w;
        return m3404R(aVar, j2, mediaPeriodQueue.f8832h != mediaPeriodQueue.f8833i, z);
    }

    /* JADX INFO: renamed from: R */
    public final long m3404R(MediaSource2.a aVar, long j2, boolean z, boolean z2) throws ExoPlaybackException {
        MediaPeriodQueue mediaPeriodQueue;
        m3434l0();
        this.f6674G = false;
        if (z2 || this.f6669B.f5932e == 3) {
            m3424f0(2);
        }
        MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8832h;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder;
        while (mediaPeriodHolder2 != null && !aVar.equals(mediaPeriodHolder2.f8651f.f8809a)) {
            mediaPeriodHolder2 = mediaPeriodHolder2.f8657l;
        }
        if (z || mediaPeriodHolder != mediaPeriodHolder2 || (mediaPeriodHolder2 != null && mediaPeriodHolder2.f8660o + j2 < 0)) {
            for (Renderer2 renderer2 : this.f6687f) {
                m3419d(renderer2);
            }
            if (mediaPeriodHolder2 != null) {
                while (true) {
                    mediaPeriodQueue = this.f6704w;
                    if (mediaPeriodQueue.f8832h == mediaPeriodHolder2) {
                        break;
                    }
                    mediaPeriodQueue.m4051a();
                }
                mediaPeriodQueue.m4063m(mediaPeriodHolder2);
                mediaPeriodHolder2.f8660o = 0L;
                m3423f();
            }
        }
        if (mediaPeriodHolder2 != null) {
            this.f6704w.m4063m(mediaPeriodHolder2);
            if (mediaPeriodHolder2.f8649d) {
                long j3 = mediaPeriodHolder2.f8651f.f8813e;
                if (j3 != -9223372036854775807L && j2 >= j3) {
                    j2 = Math.max(0L, j3 - 1);
                }
                if (mediaPeriodHolder2.f8650e) {
                    long jMo4075n = mediaPeriodHolder2.f8646a.mo4075n(j2);
                    mediaPeriodHolder2.f8646a.mo4080u(jMo4075n - this.f6698q, this.f6699r);
                    j2 = jMo4075n;
                }
            } else {
                mediaPeriodHolder2.f8651f = mediaPeriodHolder2.f8651f.m4048b(j2);
            }
            m3398H(j2);
            m3449y();
        } else {
            this.f6704w.m4052b();
            m3398H(j2);
        }
        m3442q(false);
        this.f6693l.m3074d(2);
        return j2;
    }

    /* JADX INFO: renamed from: S */
    public final void m3405S(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.f6591i == -9223372036854775807L) {
            m3406T(playerMessage);
            return;
        }
        if (this.f6669B.f5929b.m3470q()) {
            this.f6701t.add(new c(playerMessage));
            return;
        }
        c cVar = new c(playerMessage);
        Timeline timeline = this.f6669B.f5929b;
        if (!m3385J(cVar, timeline, timeline, this.f6676I, this.f6677J, this.f6696o, this.f6697p)) {
            playerMessage.m3354b(false);
        } else {
            this.f6701t.add(cVar);
            Collections.sort(this.f6701t);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m3406T(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.f6589g != this.f6695n) {
            this.f6693l.m3073c(15, playerMessage).sendToTarget();
            return;
        }
        m3417c(playerMessage);
        int i = this.f6669B.f5932e;
        if (i == 3 || i == 2) {
            this.f6693l.m3074d(2);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m3407U(final PlayerMessage playerMessage) {
        Looper looper = playerMessage.f6589g;
        if (!looper.getThread().isAlive()) {
            android.util.Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.m3354b(false);
        } else {
            SystemHandlerWrapper systemHandlerWrapperMo3070c = this.f6702u.mo3070c(looper, null);
            systemHandlerWrapperMo3070c.f6291a.post(new Runnable() { // from class: c.n.b.b.v
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImplInternal2 exoPlayerImplInternal2 = this.f8807f;
                    PlayerMessage playerMessage2 = playerMessage;
                    Objects.requireNonNull(exoPlayerImplInternal2);
                    try {
                        exoPlayerImplInternal2.m3417c(playerMessage2);
                    } catch (ExoPlaybackException e2) {
                        Log.m3154b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
                        throw new RuntimeException(e2);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m3408V(Renderer2 renderer2, long j2) {
        renderer2.mo3043k();
        if (renderer2 instanceof TextRenderer) {
            TextRenderer textRenderer = (TextRenderer) renderer2;
            C2096e.m4570f(textRenderer.f6257o);
            textRenderer.f9828E = j2;
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m3409W(boolean z, AtomicBoolean atomicBoolean) {
        if (this.f6678K != z) {
            this.f6678K = z;
            if (!z) {
                for (Renderer2 renderer2 : this.f6687f) {
                    if (!m3390w(renderer2)) {
                        renderer2.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m3410X(a aVar) throws Throwable {
        this.f6670C.m3452a(1);
        if (aVar.f6710c != -1) {
            this.f6682O = new g(new PlaylistTimeline(aVar.f6708a, aVar.f6709b), aVar.f6710c, aVar.f6711d);
        }
        MediaSourceList mediaSourceList = this.f6705x;
        List<MediaSourceList.c> list = aVar.f6708a;
        ShuffleOrder shuffleOrder = aVar.f6709b;
        mediaSourceList.m4503i(0, mediaSourceList.f10179a.size());
        m3443r(mediaSourceList.m4495a(mediaSourceList.f10179a.size(), list, shuffleOrder));
    }

    /* JADX INFO: renamed from: Y */
    public final void m3411Y(boolean z) {
        if (z == this.f6680M) {
            return;
        }
        this.f6680M = z;
        PlaybackInfo playbackInfo = this.f6669B;
        int i = playbackInfo.f5932e;
        if (z || i == 4 || i == 1) {
            this.f6669B = playbackInfo.m2889c(z);
        } else {
            this.f6693l.m3074d(2);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m3412Z(boolean z) throws ExoPlaybackException {
        this.f6672E = z;
        m3397G();
        if (this.f6673F) {
            MediaPeriodQueue mediaPeriodQueue = this.f6704w;
            if (mediaPeriodQueue.f8833i != mediaPeriodQueue.f8832h) {
                m3401O(true);
                m3442q(false);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3413a(a aVar, int i) throws Throwable {
        this.f6670C.m3452a(1);
        MediaSourceList mediaSourceList = this.f6705x;
        if (i == -1) {
            i = mediaSourceList.m4499e();
        }
        m3443r(mediaSourceList.m4495a(i, aVar.f6708a, aVar.f6709b));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m3414a0(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
        this.f6670C.m3452a(z2 ? 1 : 0);
        d dVar = this.f6670C;
        dVar.f6720a = true;
        dVar.f6725f = true;
        dVar.f6726g = i2;
        this.f6669B = this.f6669B.m2890d(z, i);
        this.f6674G = false;
        for (MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8832h; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f8657l) {
            for (ExoTrackSelection2 exoTrackSelection2 : mediaPeriodHolder.f8659n.f10367c) {
                if (exoTrackSelection2 != null) {
                    exoTrackSelection2.mo4515e(z);
                }
            }
        }
        if (!m3426g0()) {
            m3434l0();
            m3440o0();
            return;
        }
        int i3 = this.f6669B.f5932e;
        if (i3 == 3) {
            m3430j0();
            this.f6693l.m3074d(2);
        } else if (i3 == 2) {
            this.f6693l.m3074d(2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3415b(ExoPlaybackException exoPlaybackException) throws ExoPlaybackException {
        C2096e.m4566b(exoPlaybackException.f6618m && exoPlaybackException.f6611f == 1);
        try {
            m3401O(true);
        } catch (Exception e2) {
            exoPlaybackException.addSuppressed(e2);
            throw exoPlaybackException;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m3416b0(PlaybackParameters playbackParameters) throws ExoPlaybackException {
        this.f6700s.mo3067w(playbackParameters);
        PlaybackParameters playbackParametersMo3064b = this.f6700s.mo3064b();
        m3445t(playbackParametersMo3064b, playbackParametersMo3064b.f6260b, true, true);
    }

    /* JADX INFO: renamed from: c */
    public final void m3417c(PlayerMessage playerMessage) throws ExoPlaybackException {
        playerMessage.m3353a();
        try {
            playerMessage.f6583a.mo3047p(playerMessage.f6587e, playerMessage.f6588f);
        } finally {
            playerMessage.m3354b(true);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m3418c0(int i) throws ExoPlaybackException {
        this.f6676I = i;
        MediaPeriodQueue mediaPeriodQueue = this.f6704w;
        Timeline timeline = this.f6669B.f5929b;
        mediaPeriodQueue.f8830f = i;
        if (!mediaPeriodQueue.m4065p(timeline)) {
            m3401O(true);
        }
        m3442q(false);
    }

    /* JADX INFO: renamed from: d */
    public final void m3419d(Renderer2 renderer2) throws ExoPlaybackException {
        if (renderer2.getState() != 0) {
            DefaultMediaClock defaultMediaClock = this.f6700s;
            if (renderer2 == defaultMediaClock.f6599h) {
                defaultMediaClock.f6600i = null;
                defaultMediaClock.f6599h = null;
                defaultMediaClock.f6601j = true;
            }
            if (renderer2.getState() == 2) {
                renderer2.stop();
            }
            renderer2.mo3040h();
            this.f6681N--;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m3420d0(boolean z) throws ExoPlaybackException {
        this.f6677J = z;
        MediaPeriodQueue mediaPeriodQueue = this.f6704w;
        Timeline timeline = this.f6669B.f5929b;
        mediaPeriodQueue.f8831g = z;
        if (!mediaPeriodQueue.m4065p(timeline)) {
            m3401O(true);
        }
        m3442q(false);
    }

    /* JADX WARN: Code duplicated, block: B:294:0x046b  */
    /* JADX WARN: Code duplicated, block: B:300:0x0480  */
    /* JADX WARN: Code duplicated, block: B:310:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:312:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:314:0x04af  */
    /* JADX WARN: Code duplicated, block: B:316:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:322:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:415:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:312:0x04a7, please report this as an issue */
    /* JADX INFO: renamed from: e */
    public final void m3421e() throws IOException, ExoPlaybackException {
        boolean z;
        boolean z2;
        MediaPeriodHolder mediaPeriodHolder;
        DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl;
        long j2;
        long j3;
        int i;
        boolean zM3448x;
        int i2;
        boolean z3;
        boolean z4;
        MediaPeriodHolder mediaPeriodHolder2;
        MediaPeriodHolder mediaPeriodHolder3;
        boolean z5;
        long j4;
        long j5;
        long jMo3069b = this.f6702u.mo3069b();
        if (!this.f6669B.f5929b.m3470q() && this.f6705x.f10188j) {
            this.f6704w.m4062l(this.f6683P);
            MediaPeriodQueue mediaPeriodQueue = this.f6704w;
            MediaPeriodHolder mediaPeriodHolder4 = mediaPeriodQueue.f8834j;
            if (mediaPeriodHolder4 == null || (!mediaPeriodHolder4.f8651f.f8816h && mediaPeriodHolder4.m4004f() && mediaPeriodQueue.f8834j.f8651f.f8813e != -9223372036854775807L && mediaPeriodQueue.f8835k < 100)) {
                MediaPeriodQueue mediaPeriodQueue2 = this.f6704w;
                long j6 = this.f6683P;
                PlaybackInfo playbackInfo = this.f6669B;
                MediaPeriodHolder mediaPeriodHolder5 = mediaPeriodQueue2.f8834j;
                MediaPeriodInfo mediaPeriodInfoM4054d = mediaPeriodHolder5 == null ? mediaPeriodQueue2.m4054d(playbackInfo.f5929b, playbackInfo.f5930c, playbackInfo.f5931d, playbackInfo.f5946s) : mediaPeriodQueue2.m4053c(playbackInfo.f5929b, mediaPeriodHolder5, j6);
                if (mediaPeriodInfoM4054d != null) {
                    MediaPeriodQueue mediaPeriodQueue3 = this.f6704w;
                    RendererCapabilities[] rendererCapabilitiesArr = this.f6688g;
                    TrackSelector trackSelector = this.f6689h;
                    Allocator allocatorMo3350h = this.f6691j.mo3350h();
                    MediaSourceList mediaSourceList = this.f6705x;
                    TrackSelectorResult trackSelectorResult = this.f6690i;
                    MediaPeriodHolder mediaPeriodHolder6 = mediaPeriodQueue3.f8834j;
                    if (mediaPeriodHolder6 == null) {
                        if (mediaPeriodInfoM4054d.f8809a.m4081a()) {
                            j5 = mediaPeriodInfoM4054d.f8811c;
                            if (j5 == -9223372036854775807L) {
                                j5 = 0;
                            }
                        } else {
                            j5 = 0;
                        }
                        j4 = j5;
                    } else {
                        j4 = (mediaPeriodHolder6.f8660o + mediaPeriodHolder6.f8651f.f8813e) - mediaPeriodInfoM4054d.f8810b;
                    }
                    MediaPeriodHolder mediaPeriodHolder7 = new MediaPeriodHolder(rendererCapabilitiesArr, j4, trackSelector, allocatorMo3350h, mediaSourceList, mediaPeriodInfoM4054d, trackSelectorResult);
                    MediaPeriodHolder mediaPeriodHolder8 = mediaPeriodQueue3.f8834j;
                    if (mediaPeriodHolder8 == null) {
                        mediaPeriodQueue3.f8832h = mediaPeriodHolder7;
                        mediaPeriodQueue3.f8833i = mediaPeriodHolder7;
                    } else if (mediaPeriodHolder7 != mediaPeriodHolder8.f8657l) {
                        mediaPeriodHolder8.m4000b();
                        mediaPeriodHolder8.f8657l = mediaPeriodHolder7;
                        mediaPeriodHolder8.m4001c();
                    }
                    mediaPeriodQueue3.f8836l = null;
                    mediaPeriodQueue3.f8834j = mediaPeriodHolder7;
                    mediaPeriodQueue3.f8835k++;
                    mediaPeriodQueue3.m4061k();
                    mediaPeriodHolder7.f8646a.mo4077q(this, mediaPeriodInfoM4054d.f8810b);
                    if (this.f6704w.f8832h == mediaPeriodHolder7) {
                        m3398H(mediaPeriodHolder7.m4003e());
                    }
                    m3442q(false);
                }
            }
            if (this.f6675H) {
                this.f6675H = m3447v();
                m3436m0();
            } else {
                m3449y();
            }
            MediaPeriodHolder mediaPeriodHolder9 = this.f6704w.f8833i;
            if (mediaPeriodHolder9 != null) {
                if (mediaPeriodHolder9.f8657l != null && !this.f6673F) {
                    if (!mediaPeriodHolder9.f8649d) {
                        z5 = false;
                        break;
                    }
                    int i3 = 0;
                    while (true) {
                        Renderer2[] renderer2Arr = this.f6687f;
                        if (i3 >= renderer2Arr.length) {
                            z5 = true;
                            break;
                        }
                        Renderer2 renderer2 = renderer2Arr[i3];
                        SampleStream sampleStream = mediaPeriodHolder9.f8648c[i3];
                        if (renderer2.mo3048q() != sampleStream || (sampleStream != null && !renderer2.mo3041i())) {
                            z5 = false;
                            break;
                        }
                        i3++;
                    }
                    if (z5) {
                        MediaPeriodHolder mediaPeriodHolder10 = mediaPeriodHolder9.f8657l;
                        if (mediaPeriodHolder10.f8649d || this.f6683P >= mediaPeriodHolder10.m4003e()) {
                            TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder9.f8659n;
                            MediaPeriodQueue mediaPeriodQueue4 = this.f6704w;
                            MediaPeriodHolder mediaPeriodHolder11 = mediaPeriodQueue4.f8833i;
                            C2096e.m4570f((mediaPeriodHolder11 == null || mediaPeriodHolder11.f8657l == null) ? false : true);
                            mediaPeriodQueue4.f8833i = mediaPeriodQueue4.f8833i.f8657l;
                            mediaPeriodQueue4.m4061k();
                            MediaPeriodHolder mediaPeriodHolder12 = mediaPeriodQueue4.f8833i;
                            TrackSelectorResult trackSelectorResult3 = mediaPeriodHolder12.f8659n;
                            if (!mediaPeriodHolder12.f8649d || mediaPeriodHolder12.f8646a.mo4076p() == -9223372036854775807L) {
                                for (int i4 = 0; i4 < this.f6687f.length; i4++) {
                                    boolean zM4548b = trackSelectorResult2.m4548b(i4);
                                    boolean zM4548b2 = trackSelectorResult3.m4548b(i4);
                                    if (zM4548b && !this.f6687f[i4].mo3052u()) {
                                        boolean z6 = ((BaseRenderer) this.f6688g[i4]).f6248f == 7;
                                        RendererConfiguration rendererConfiguration = trackSelectorResult2.f10366b[i4];
                                        RendererConfiguration rendererConfiguration2 = trackSelectorResult3.f10366b[i4];
                                        if (!zM4548b2 || !rendererConfiguration2.equals(rendererConfiguration) || z6) {
                                            m3408V(this.f6687f[i4], mediaPeriodHolder12.m4003e());
                                        }
                                    }
                                }
                            } else {
                                long jM4003e = mediaPeriodHolder12.m4003e();
                                for (Renderer2 renderer3 : this.f6687f) {
                                    if (renderer3.mo3048q() != null) {
                                        m3408V(renderer3, jM4003e);
                                    }
                                }
                            }
                        }
                    }
                } else if (mediaPeriodHolder9.f8651f.f8816h || this.f6673F) {
                    int i5 = 0;
                    while (true) {
                        Renderer2[] renderer2Arr2 = this.f6687f;
                        if (i5 >= renderer2Arr2.length) {
                            break;
                        }
                        Renderer2 renderer4 = renderer2Arr2[i5];
                        SampleStream sampleStream2 = mediaPeriodHolder9.f8648c[i5];
                        if (sampleStream2 != null && renderer4.mo3048q() == sampleStream2 && renderer4.mo3041i()) {
                            long j7 = mediaPeriodHolder9.f8651f.f8813e;
                            m3408V(renderer4, (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : j7 + mediaPeriodHolder9.f8660o);
                        }
                        i5++;
                    }
                }
            }
            MediaPeriodQueue mediaPeriodQueue5 = this.f6704w;
            MediaPeriodHolder mediaPeriodHolder13 = mediaPeriodQueue5.f8833i;
            if (mediaPeriodHolder13 != null && mediaPeriodQueue5.f8832h != mediaPeriodHolder13 && !mediaPeriodHolder13.f8652g) {
                TrackSelectorResult trackSelectorResult4 = mediaPeriodHolder13.f8659n;
                boolean z7 = false;
                int i6 = 0;
                while (true) {
                    Renderer2[] renderer2Arr3 = this.f6687f;
                    if (i6 >= renderer2Arr3.length) {
                        break;
                    }
                    Renderer2 renderer5 = renderer2Arr3[i6];
                    if (m3390w(renderer5)) {
                        boolean z8 = renderer5.mo3048q() != mediaPeriodHolder13.f8648c[i6];
                        if (!trackSelectorResult4.m4548b(i6) || z8) {
                            if (!renderer5.mo3052u()) {
                                renderer5.mo3042j(m3388h(trackSelectorResult4.f10367c[i6]), mediaPeriodHolder13.f8648c[i6], mediaPeriodHolder13.m4003e(), mediaPeriodHolder13.f8660o);
                            } else if (renderer5.mo3368g()) {
                                m3419d(renderer5);
                            } else {
                                z7 = true;
                            }
                        }
                    }
                    i6++;
                }
                if (!z7) {
                    m3423f();
                }
            }
            boolean z9 = false;
            while (true) {
                if (!(m3426g0() && !this.f6673F && (mediaPeriodHolder2 = this.f6704w.f8832h) != null && (mediaPeriodHolder3 = mediaPeriodHolder2.f8657l) != null && this.f6683P >= mediaPeriodHolder3.m4003e() && mediaPeriodHolder3.f8652g)) {
                    break;
                }
                if (z9) {
                    m3450z();
                }
                MediaPeriodQueue mediaPeriodQueue6 = this.f6704w;
                MediaPeriodHolder mediaPeriodHolder14 = mediaPeriodQueue6.f8832h;
                MediaPeriodHolder mediaPeriodHolderM4051a = mediaPeriodQueue6.m4051a();
                MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolderM4051a.f8651f;
                this.f6669B = m3446u(mediaPeriodInfo.f8809a, mediaPeriodInfo.f8810b, mediaPeriodInfo.f8811c);
                this.f6670C.m3453b(mediaPeriodHolder14.f8651f.f8814f ? 0 : 3);
                Timeline timeline = this.f6669B.f5929b;
                m3438n0(timeline, mediaPeriodHolderM4051a.f8651f.f8809a, timeline, mediaPeriodHolder14.f8651f.f8809a, -9223372036854775807L);
                m3397G();
                m3440o0();
                z9 = true;
            }
        }
        int i7 = this.f6669B.f5932e;
        if (i7 == 1 || i7 == 4) {
            this.f6693l.f6291a.removeMessages(2);
            return;
        }
        MediaPeriodHolder mediaPeriodHolder15 = this.f6704w.f8832h;
        if (mediaPeriodHolder15 == null) {
            m3400N(jMo3069b, 10L);
            return;
        }
        C2096e.m4565a("doSomeWork");
        m3440o0();
        if (mediaPeriodHolder15.f8649d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            mediaPeriodHolder15.f8646a.mo4080u(this.f6669B.f5946s - this.f6698q, this.f6699r);
            boolean z10 = true;
            z2 = true;
            int i8 = 0;
            while (true) {
                Renderer2[] renderer2Arr4 = this.f6687f;
                if (i8 >= renderer2Arr4.length) {
                    break;
                }
                Renderer2 renderer6 = renderer2Arr4[i8];
                if (m3390w(renderer6)) {
                    renderer6.mo3369o(this.f6683P, jElapsedRealtime);
                    boolean z11 = z10 && renderer6.mo3368g();
                    boolean z12 = mediaPeriodHolder15.f8648c[i8] != renderer6.mo3048q();
                    boolean z13 = z12 || (!z12 && renderer6.mo3041i()) || renderer6.mo3297c() || renderer6.mo3368g();
                    boolean z14 = z2 && z13;
                    if (!z13) {
                        renderer6.mo3049r();
                    }
                    z2 = z14;
                    z10 = z11;
                }
                i8++;
            }
            z = z10;
        } else {
            mediaPeriodHolder15.f8646a.mo4074m();
            z = true;
            z2 = true;
        }
        long j8 = mediaPeriodHolder15.f8651f.f8813e;
        boolean z15 = z && mediaPeriodHolder15.f8649d && (j8 == -9223372036854775807L || j8 <= this.f6669B.f5946s);
        if (z15 && this.f6673F) {
            this.f6673F = false;
            m3414a0(false, this.f6669B.f5940m, false, 5);
        }
        if (z15 && mediaPeriodHolder15.f8651f.f8816h) {
            m3424f0(4);
            m3434l0();
        } else {
            PlaybackInfo playbackInfo2 = this.f6669B;
            if (playbackInfo2.f5932e == 2) {
                if (this.f6681N == 0) {
                    zM3448x = m3448x();
                } else if (z2) {
                    if (playbackInfo2.f5934g) {
                        long j9 = m3427h0(playbackInfo2.f5929b, this.f6704w.f8832h.f8651f.f8809a) ? ((DefaultLivePlaybackSpeedControl) this.f6706y).f6557m : -9223372036854775807L;
                        MediaPeriodHolder mediaPeriodHolder16 = this.f6704w.f8834j;
                        boolean z16 = mediaPeriodHolder16.m4004f() && mediaPeriodHolder16.f8651f.f8816h;
                        boolean z17 = mediaPeriodHolder16.f8651f.f8809a.m4081a() && !mediaPeriodHolder16.f8649d;
                        if (!z16 && !z17 && !this.f6691j.mo3348f(m3437n(), this.f6700s.mo3064b().f6260b, this.f6674G, j9)) {
                            zM3448x = false;
                        }
                    }
                    zM3448x = true;
                } else {
                    zM3448x = false;
                }
                if (zM3448x) {
                    m3424f0(3);
                    this.f6686S = null;
                    if (m3426g0()) {
                        m3430j0();
                    }
                } else if (this.f6669B.f5932e == 3) {
                    this.f6674G = m3426g0();
                    m3424f0(2);
                    if (this.f6674G) {
                        for (mediaPeriodHolder = this.f6704w.f8832h; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f8657l) {
                            for (ExoTrackSelection2 exoTrackSelection2 : mediaPeriodHolder.f8659n.f10367c) {
                                if (exoTrackSelection2 != null) {
                                    exoTrackSelection2.mo4522s();
                                }
                            }
                        }
                        defaultLivePlaybackSpeedControl = (DefaultLivePlaybackSpeedControl) this.f6706y;
                        j2 = defaultLivePlaybackSpeedControl.f6557m;
                        if (j2 != -9223372036854775807L) {
                            long j10 = j2 + defaultLivePlaybackSpeedControl.f6550f;
                            defaultLivePlaybackSpeedControl.f6557m = j10;
                            j3 = defaultLivePlaybackSpeedControl.f6556l;
                            if (j3 != -9223372036854775807L) {
                                defaultLivePlaybackSpeedControl.f6557m = j3;
                            }
                            defaultLivePlaybackSpeedControl.f6561q = -9223372036854775807L;
                        }
                    }
                    m3434l0();
                }
            } else if (this.f6669B.f5932e == 3 && (this.f6681N != 0 ? !z2 : !m3448x())) {
                this.f6674G = m3426g0();
                m3424f0(2);
                if (this.f6674G) {
                    while (mediaPeriodHolder != null) {
                        while (i < r5) {
                            if (exoTrackSelection2 != null) {
                                exoTrackSelection2.mo4522s();
                            }
                        }
                    }
                    defaultLivePlaybackSpeedControl = (DefaultLivePlaybackSpeedControl) this.f6706y;
                    j2 = defaultLivePlaybackSpeedControl.f6557m;
                    if (j2 != -9223372036854775807L) {
                        long j11 = j2 + defaultLivePlaybackSpeedControl.f6550f;
                        defaultLivePlaybackSpeedControl.f6557m = j11;
                        j3 = defaultLivePlaybackSpeedControl.f6556l;
                        if (j3 != -9223372036854775807L && j11 > j3) {
                            defaultLivePlaybackSpeedControl.f6557m = j3;
                        }
                        defaultLivePlaybackSpeedControl.f6561q = -9223372036854775807L;
                    }
                }
                m3434l0();
            }
        }
        if (this.f6669B.f5932e == 2) {
            int i9 = 0;
            while (true) {
                Renderer2[] renderer2Arr5 = this.f6687f;
                if (i9 >= renderer2Arr5.length) {
                    break;
                }
                if (m3390w(renderer2Arr5[i9]) && this.f6687f[i9].mo3048q() == mediaPeriodHolder15.f8648c[i9]) {
                    this.f6687f[i9].mo3049r();
                }
                i9++;
            }
            PlaybackInfo playbackInfo3 = this.f6669B;
            if (!playbackInfo3.f5934g && playbackInfo3.f5945r < 500000 && m3447v()) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z18 = this.f6680M;
        PlaybackInfo playbackInfo4 = this.f6669B;
        if (z18 != playbackInfo4.f5942o) {
            this.f6669B = playbackInfo4.m2889c(z18);
        }
        if ((m3426g0() && this.f6669B.f5932e == 3) || (i2 = this.f6669B.f5932e) == 2) {
            if (this.f6680M && this.f6679L) {
                z4 = false;
            } else {
                m3400N(jMo3069b, 10L);
                z4 = true;
            }
            z3 = true ^ z4;
        } else {
            if (this.f6681N == 0 || i2 == 4) {
                this.f6693l.f6291a.removeMessages(2);
            } else {
                m3400N(jMo3069b, 1000L);
            }
            z3 = false;
        }
        PlaybackInfo playbackInfo5 = this.f6669B;
        if (playbackInfo5.f5943p != z3) {
            this.f6669B = new PlaybackInfo(playbackInfo5.f5929b, playbackInfo5.f5930c, playbackInfo5.f5931d, playbackInfo5.f5932e, playbackInfo5.f5933f, playbackInfo5.f5934g, playbackInfo5.f5935h, playbackInfo5.f5936i, playbackInfo5.f5937j, playbackInfo5.f5938k, playbackInfo5.f5939l, playbackInfo5.f5940m, playbackInfo5.f5941n, playbackInfo5.f5944q, playbackInfo5.f5945r, playbackInfo5.f5946s, playbackInfo5.f5942o, z3);
        }
        this.f6679L = false;
        C2096e.m4574j();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m3422e0(ShuffleOrder shuffleOrder) throws Throwable {
        this.f6670C.m3452a(1);
        MediaSourceList mediaSourceList = this.f6705x;
        int iM4499e = mediaSourceList.m4499e();
        if (shuffleOrder.mo4179a() != iM4499e) {
            shuffleOrder = shuffleOrder.mo4186h().mo4184f(0, iM4499e);
        }
        mediaSourceList.f10187i = shuffleOrder;
        m3443r(mediaSourceList.m4497c());
    }

    /* JADX INFO: renamed from: f */
    public final void m3423f() throws ExoPlaybackException {
        m3425g(new boolean[this.f6687f.length]);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m3424f0(int i) {
        PlaybackInfo playbackInfo = this.f6669B;
        if (playbackInfo.f5932e != i) {
            this.f6669B = playbackInfo.m2893g(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3425g(boolean[] zArr) throws ExoPlaybackException {
        MediaClock mediaClock;
        MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8833i;
        TrackSelectorResult trackSelectorResult = mediaPeriodHolder.f8659n;
        for (int i = 0; i < this.f6687f.length; i++) {
            if (!trackSelectorResult.m4548b(i)) {
                this.f6687f[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f6687f.length; i2++) {
            if (trackSelectorResult.m4548b(i2)) {
                boolean z = zArr[i2];
                Renderer2 renderer2 = this.f6687f[i2];
                if (m3390w(renderer2)) {
                    continue;
                } else {
                    MediaPeriodQueue mediaPeriodQueue = this.f6704w;
                    MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.f8833i;
                    boolean z2 = mediaPeriodHolder2 == mediaPeriodQueue.f8832h;
                    TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder2.f8659n;
                    RendererConfiguration rendererConfiguration = trackSelectorResult2.f10366b[i2];
                    Format[] formatArrM3388h = m3388h(trackSelectorResult2.f10367c[i2]);
                    boolean z3 = m3426g0() && this.f6669B.f5932e == 3;
                    boolean z4 = !z && z3;
                    this.f6681N++;
                    renderer2.mo3046n(rendererConfiguration, formatArrM3388h, mediaPeriodHolder2.f8648c[i2], this.f6683P, z4, z2, mediaPeriodHolder2.m4003e(), mediaPeriodHolder2.f8660o);
                    renderer2.mo3047p(103, new ExoPlayerImplInternal(this));
                    DefaultMediaClock defaultMediaClock = this.f6700s;
                    Objects.requireNonNull(defaultMediaClock);
                    MediaClock mediaClockMo3053v = renderer2.mo3053v();
                    if (mediaClockMo3053v != null && mediaClockMo3053v != (mediaClock = defaultMediaClock.f6600i)) {
                        if (mediaClock != null) {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        defaultMediaClock.f6600i = mediaClockMo3053v;
                        defaultMediaClock.f6599h = renderer2;
                        mediaClockMo3053v.mo3067w(defaultMediaClock.f6597f.f6288j);
                    }
                    if (z3) {
                        renderer2.start();
                    }
                }
            }
        }
        mediaPeriodHolder.f8652g = true;
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m3426g0() {
        PlaybackInfo playbackInfo = this.f6669B;
        return playbackInfo.f5939l && playbackInfo.f5940m == 0;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m3427h0(Timeline timeline, MediaSource2.a aVar) {
        if (aVar.m4081a() || timeline.m3470q()) {
            return false;
        }
        timeline.m3468n(timeline.mo3463h(aVar.f8857a, this.f6697p).f6746c, this.f6696o);
        if (!this.f6696o.m3479c()) {
            return false;
        }
        Timeline.c cVar = this.f6696o;
        return cVar.f6760k && cVar.f6757h != -9223372036854775807L;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        MediaPeriodHolder mediaPeriodHolder;
        try {
            switch (message.what) {
                case 0:
                    m3392B();
                    break;
                case 1:
                    m3414a0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m3421e();
                    break;
                case 3:
                    m3402P((g) message.obj);
                    break;
                case 4:
                    m3416b0((PlaybackParameters) message.obj);
                    break;
                case 5:
                    this.f6668A = (SeekParameters) message.obj;
                    break;
                case 6:
                    m3432k0(false, true);
                    break;
                case 7:
                    m3393C();
                    return true;
                case 8:
                    m3444s((MediaPeriod) message.obj);
                    break;
                case 9:
                    m3441p((MediaPeriod) message.obj);
                    break;
                case 10:
                    m3395E();
                    break;
                case 11:
                    m3418c0(message.arg1);
                    break;
                case 12:
                    m3420d0(message.arg1 != 0);
                    break;
                case 13:
                    m3409W(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m3405S((PlayerMessage) message.obj);
                    break;
                case 15:
                    m3407U((PlayerMessage) message.obj);
                    break;
                case 16:
                    PlaybackParameters playbackParameters = (PlaybackParameters) message.obj;
                    m3445t(playbackParameters, playbackParameters.f6260b, true, false);
                    break;
                case 17:
                    m3410X((a) message.obj);
                    break;
                case 18:
                    m3413a((a) message.obj, message.arg1);
                    break;
                case 19:
                    m3391A((b) message.obj);
                    break;
                case 20:
                    m3394D(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    m3422e0((ShuffleOrder) message.obj);
                    break;
                case 22:
                    m3443r(this.f6705x.m4497c());
                    break;
                case 23:
                    m3412Z(message.arg1 != 0);
                    break;
                case 24:
                    m3411Y(message.arg1 == 1);
                    break;
                case 25:
                    m3415b((ExoPlaybackException) message.obj);
                    break;
                default:
                    return false;
            }
            m3450z();
        } catch (ExoPlaybackException e2) {
            e = e2;
            if (e.f6611f == 1 && (mediaPeriodHolder = this.f6704w.f8833i) != null) {
                e = e.m3364a(mediaPeriodHolder.f8651f.f8809a);
            }
            if (e.f6618m && this.f6686S == null) {
                Log.m3156d("ExoPlayerImplInternal", "Recoverable playback error", e);
                this.f6686S = e;
                Message messageM3073c = this.f6693l.m3073c(25, e);
                messageM3073c.getTarget().sendMessageAtFrontOfQueue(messageM3073c);
            } else {
                ExoPlaybackException exoPlaybackException = this.f6686S;
                if (exoPlaybackException != null) {
                    e.addSuppressed(exoPlaybackException);
                    this.f6686S = null;
                }
                Log.m3154b("ExoPlayerImplInternal", "Playback error", e);
                m3432k0(true, false);
                this.f6669B = this.f6669B.m2891e(e);
            }
            m3450z();
        } catch (IOException e3) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(0, e3);
            MediaPeriodHolder mediaPeriodHolder2 = this.f6704w.f8832h;
            if (mediaPeriodHolder2 != null) {
                exoPlaybackException2 = exoPlaybackException2.m3364a(mediaPeriodHolder2.f8651f.f8809a);
            }
            Log.m3154b("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            m3432k0(false, false);
            this.f6669B = this.f6669B.m2891e(exoPlaybackException2);
            m3450z();
        } catch (RuntimeException e4) {
            ExoPlaybackException exoPlaybackException3 = new ExoPlaybackException(2, e4);
            Log.m3154b("ExoPlayerImplInternal", "Playback error", exoPlaybackException3);
            m3432k0(true, false);
            this.f6669B = this.f6669B.m2891e(exoPlaybackException3);
            m3450z();
        }
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader.a
    /* JADX INFO: renamed from: i */
    public void mo3428i(SequenceableLoader sequenceableLoader) {
        this.f6693l.m3073c(9, (MediaPeriod) sequenceableLoader).sendToTarget();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod.a
    /* JADX INFO: renamed from: j */
    public void mo3429j(MediaPeriod mediaPeriod) {
        this.f6693l.m3073c(8, mediaPeriod).sendToTarget();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m3430j0() throws ExoPlaybackException {
        this.f6674G = false;
        DefaultMediaClock defaultMediaClock = this.f6700s;
        defaultMediaClock.f6602k = true;
        defaultMediaClock.f6597f.m3065c();
        for (Renderer2 renderer2 : this.f6687f) {
            if (m3390w(renderer2)) {
                renderer2.start();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final long m3431k(Timeline timeline, Object obj, long j2) {
        timeline.m3468n(timeline.mo3463h(obj, this.f6697p).f6746c, this.f6696o);
        Timeline.c cVar = this.f6696o;
        if (cVar.f6757h != -9223372036854775807L && cVar.m3479c()) {
            Timeline.c cVar2 = this.f6696o;
            if (cVar2.f6760k) {
                return C.m3236b(Util6.m3135w(cVar2.f6758i) - this.f6696o.f6757h) - (j2 + this.f6697p.f6748e);
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m3432k0(boolean z, boolean z2) {
        m3396F(z || !this.f6678K, false, true, false);
        this.f6670C.m3452a(z2 ? 1 : 0);
        this.f6691j.mo3351i();
        m3424f0(1);
    }

    /* JADX INFO: renamed from: l */
    public final long m3433l() {
        MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8833i;
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        long jMax = mediaPeriodHolder.f8660o;
        if (!mediaPeriodHolder.f8649d) {
            return jMax;
        }
        int i = 0;
        while (true) {
            Renderer2[] renderer2Arr = this.f6687f;
            if (i >= renderer2Arr.length) {
                return jMax;
            }
            if (m3390w(renderer2Arr[i]) && this.f6687f[i].mo3048q() == mediaPeriodHolder.f8648c[i]) {
                long jMo3050s = this.f6687f[i].mo3050s();
                if (jMo3050s == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jMo3050s, jMax);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m3434l0() throws ExoPlaybackException {
        DefaultMediaClock defaultMediaClock = this.f6700s;
        defaultMediaClock.f6602k = false;
        StandaloneMediaClock standaloneMediaClock = defaultMediaClock.f6597f;
        if (standaloneMediaClock.f6285g) {
            standaloneMediaClock.m3063a(standaloneMediaClock.mo3066d());
            standaloneMediaClock.f6285g = false;
        }
        for (Renderer2 renderer2 : this.f6687f) {
            if (m3390w(renderer2) && renderer2.getState() == 2) {
                renderer2.stop();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final Pair<MediaSource2.a, Long> m3435m(Timeline timeline) {
        if (timeline.m3470q()) {
            return Pair.create(PlaybackInfo.f5928a, 0L);
        }
        Pair<Object, Long> pairM3464j = timeline.m3464j(this.f6696o, this.f6697p, timeline.mo3456a(this.f6677J), -9223372036854775807L);
        MediaSource2.a aVarM4064n = this.f6704w.m4064n(timeline, pairM3464j.first, 0L);
        long jLongValue = ((Long) pairM3464j.second).longValue();
        if (aVarM4064n.m4081a()) {
            timeline.mo3463h(aVarM4064n.f8857a, this.f6697p);
            jLongValue = aVarM4064n.f8859c == this.f6697p.m3475e(aVarM4064n.f8858b) ? this.f6697p.f6749f.f9079f : 0L;
        }
        return Pair.create(aVarM4064n, Long.valueOf(jLongValue));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m3436m0() {
        MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8834j;
        boolean z = this.f6675H || (mediaPeriodHolder != null && mediaPeriodHolder.f8646a.mo4070e());
        PlaybackInfo playbackInfo = this.f6669B;
        if (z != playbackInfo.f5934g) {
            this.f6669B = new PlaybackInfo(playbackInfo.f5929b, playbackInfo.f5930c, playbackInfo.f5931d, playbackInfo.f5932e, playbackInfo.f5933f, z, playbackInfo.f5935h, playbackInfo.f5936i, playbackInfo.f5937j, playbackInfo.f5938k, playbackInfo.f5939l, playbackInfo.f5940m, playbackInfo.f5941n, playbackInfo.f5944q, playbackInfo.f5945r, playbackInfo.f5946s, playbackInfo.f5942o, playbackInfo.f5943p);
        }
    }

    /* JADX INFO: renamed from: n */
    public final long m3437n() {
        return m3439o(this.f6669B.f5944q);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m3438n0(Timeline timeline, MediaSource2.a aVar, Timeline timeline2, MediaSource2.a aVar2, long j2) {
        if (timeline.m3470q() || !m3427h0(timeline, aVar)) {
            float f2 = this.f6700s.mo3064b().f6260b;
            PlaybackParameters playbackParameters = this.f6669B.f5941n;
            if (f2 != playbackParameters.f6260b) {
                this.f6700s.mo3067w(playbackParameters);
                return;
            }
            return;
        }
        timeline.m3468n(timeline.mo3463h(aVar.f8857a, this.f6697p).f6746c, this.f6696o);
        LivePlaybackSpeedControl livePlaybackSpeedControl = this.f6706y;
        MediaItem2.f fVar = this.f6696o.f6762m;
        int i = Util6.f6307a;
        DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl = (DefaultLivePlaybackSpeedControl) livePlaybackSpeedControl;
        Objects.requireNonNull(defaultLivePlaybackSpeedControl);
        defaultLivePlaybackSpeedControl.f6552h = C.m3236b(fVar.f7513a);
        defaultLivePlaybackSpeedControl.f6555k = C.m3236b(fVar.f7514b);
        defaultLivePlaybackSpeedControl.f6556l = C.m3236b(fVar.f7515c);
        float f3 = fVar.f7516d;
        if (f3 == -3.4028235E38f) {
            f3 = defaultLivePlaybackSpeedControl.f6545a;
        }
        defaultLivePlaybackSpeedControl.f6559o = f3;
        float f4 = fVar.f7517e;
        if (f4 == -3.4028235E38f) {
            f4 = defaultLivePlaybackSpeedControl.f6546b;
        }
        defaultLivePlaybackSpeedControl.f6558n = f4;
        defaultLivePlaybackSpeedControl.m3328a();
        if (j2 != -9223372036854775807L) {
            DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl2 = (DefaultLivePlaybackSpeedControl) this.f6706y;
            defaultLivePlaybackSpeedControl2.f6553i = m3431k(timeline, aVar.f8857a, j2);
            defaultLivePlaybackSpeedControl2.m3328a();
        } else {
            if (Util6.m3113a(timeline2.m3470q() ? null : timeline2.m3468n(timeline2.mo3463h(aVar2.f8857a, this.f6697p).f6746c, this.f6696o).f6752c, this.f6696o.f6752c)) {
                return;
            }
            DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl3 = (DefaultLivePlaybackSpeedControl) this.f6706y;
            defaultLivePlaybackSpeedControl3.f6553i = -9223372036854775807L;
            defaultLivePlaybackSpeedControl3.m3328a();
        }
    }

    /* JADX INFO: renamed from: o */
    public final long m3439o(long j2) {
        MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8834j;
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        return Math.max(0L, j2 - (this.f6683P - mediaPeriodHolder.f8660o));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x017d, code lost:
    
        r11 = null;
     */
    /* JADX INFO: renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3440o0() throws p007c.p190n.p194b.p209b.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p209b.ExoPlayerImplInternal2.m3440o0():void");
    }

    /* JADX INFO: renamed from: p */
    public final void m3441p(MediaPeriod mediaPeriod) {
        MediaPeriodQueue mediaPeriodQueue = this.f6704w;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.f8834j;
        if (mediaPeriodHolder != null && mediaPeriodHolder.f8646a == mediaPeriod) {
            mediaPeriodQueue.m4062l(this.f6683P);
            m3449y();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3442q(boolean z) {
        MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8834j;
        MediaSource2.a aVar = mediaPeriodHolder == null ? this.f6669B.f5930c : mediaPeriodHolder.f8651f.f8809a;
        boolean z2 = !this.f6669B.f5938k.equals(aVar);
        if (z2) {
            this.f6669B = this.f6669B.m2887a(aVar);
        }
        PlaybackInfo playbackInfo = this.f6669B;
        playbackInfo.f5944q = mediaPeriodHolder == null ? playbackInfo.f5946s : mediaPeriodHolder.m4002d();
        this.f6669B.f5945r = m3437n();
        if ((z2 || z) && mediaPeriodHolder != null && mediaPeriodHolder.f8649d) {
            this.f6691j.mo3346d(this.f6687f, mediaPeriodHolder.f8658m, mediaPeriodHolder.f8659n.f10367c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x015a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    /* JADX WARN: Code duplicated, block: B:68:0x0176  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0183  */
    /* JADX WARN: Code duplicated, block: B:75:0x0188  */
    /* JADX WARN: Code duplicated, block: B:77:0x0197  */
    /* JADX WARN: Code duplicated, block: B:78:0x019c  */
    /* JADX WARN: Code duplicated, block: B:79:0x019f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    public final void m3443r(Timeline timeline) throws Throwable {
        MediaSource2.a aVar;
        Object obj;
        int i;
        int i2;
        Object obj2;
        boolean z;
        int iMo3456a;
        int iMo3456a2;
        boolean z2;
        boolean z3;
        boolean z4;
        long j2;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        long j3;
        long j4;
        long j5;
        long j6;
        MediaSource2.a aVarM4064n;
        boolean z8;
        boolean z9;
        long j7;
        f fVar;
        long j8;
        int i4;
        long j9;
        boolean z10;
        long j10;
        boolean z11;
        boolean z12;
        long j11;
        long j12;
        long j13;
        boolean z13;
        g gVar;
        long j14;
        boolean z14;
        long j15;
        PlaybackInfo playbackInfo = this.f6669B;
        g gVar2 = this.f6682O;
        MediaPeriodQueue mediaPeriodQueue = this.f6704w;
        int i5 = this.f6676I;
        boolean z15 = this.f6677J;
        Timeline.c cVar = this.f6696o;
        Timeline.b bVar = this.f6697p;
        if (timeline.m3470q()) {
            j12 = 0;
            fVar = new f(PlaybackInfo.f5928a, 0L, -9223372036854775807L, false, true, false);
        } else {
            MediaSource2.a aVar2 = playbackInfo.f5930c;
            Object obj3 = aVar2.f8857a;
            boolean zM3389i0 = m3389i0(playbackInfo, bVar, cVar);
            long j16 = zM3389i0 ? playbackInfo.f5931d : playbackInfo.f5946s;
            if (gVar2 != null) {
                aVar = aVar2;
                Pair<Object, Long> pairM3386L = m3386L(timeline, gVar2, true, i5, z15, cVar, bVar);
                if (pairM3386L == null) {
                    iMo3456a2 = timeline.mo3456a(z15);
                    obj2 = obj3;
                    z11 = false;
                    z12 = false;
                    z2 = true;
                    j11 = j16;
                } else {
                    if (gVar2.f6735c == -9223372036854775807L) {
                        iMo3456a2 = timeline.mo3463h(pairM3386L.first, bVar).f6746c;
                        obj2 = obj3;
                        z10 = false;
                        j10 = j16;
                    } else {
                        obj2 = pairM3386L.first;
                        long jLongValue = ((Long) pairM3386L.second).longValue();
                        iMo3456a2 = -1;
                        z10 = true;
                        j10 = jLongValue;
                    }
                    z11 = playbackInfo.f5932e == 4;
                    z12 = z10;
                    z2 = false;
                    j11 = j10;
                }
                i = -1;
                boolean z16 = z12;
                z4 = z11;
                z3 = z16;
                j9 = j11;
            } else {
                aVar = aVar2;
                if (playbackInfo.f5929b.m3470q()) {
                    iMo3456a = timeline.mo3456a(z15);
                    obj = obj3;
                    i = -1;
                } else {
                    obj = obj3;
                    if (timeline.mo3457b(obj) == -1) {
                        i = -1;
                        Object objM3387M = m3387M(cVar, bVar, i5, z15, obj, playbackInfo.f5929b, timeline);
                        if (objM3387M == null) {
                            iMo3456a2 = timeline.mo3456a(z15);
                            z2 = true;
                        } else {
                            iMo3456a2 = timeline.mo3463h(objM3387M, bVar).f6746c;
                            z2 = false;
                        }
                        obj2 = obj;
                        z3 = false;
                        z4 = false;
                        j9 = j16;
                    } else {
                        i = -1;
                        if (!zM3389i0) {
                            i2 = -1;
                            obj2 = obj;
                            z = false;
                            j2 = j16;
                        } else if (j16 == -9223372036854775807L) {
                            iMo3456a = timeline.mo3463h(obj, bVar).f6746c;
                        } else {
                            aVar = aVar;
                            playbackInfo.f5929b.mo3463h(aVar.f8857a, bVar);
                            Pair<Object, Long> pairM3464j = timeline.m3464j(cVar, bVar, timeline.mo3463h(obj, bVar).f6746c, j16 + bVar.f6748e);
                            obj2 = pairM3464j.first;
                            long jLongValue2 = ((Long) pairM3464j.second).longValue();
                            i2 = -1;
                            z = true;
                            j2 = jLongValue2;
                        }
                        i3 = i2;
                        z5 = z;
                        z6 = false;
                        z7 = false;
                        j3 = j2;
                        if (i3 != i) {
                            Pair<Object, Long> pairM3464j2 = timeline.m3464j(cVar, bVar, i3, -9223372036854775807L);
                            obj2 = pairM3464j2.first;
                            long jLongValue3 = ((Long) pairM3464j2.second).longValue();
                            j4 = -9223372036854775807L;
                            j6 = jLongValue3;
                            j5 = jLongValue3;
                        } else {
                            long j17 = j3;
                            j4 = j17;
                            j6 = j17;
                            j5 = j3;
                        }
                        aVarM4064n = mediaPeriodQueue.m4064n(timeline, obj2, j6);
                        if (aVarM4064n.f8861e != i || ((i4 = aVar.f8861e) != i && aVarM4064n.f8858b >= i4)) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (aVar.f8857a.equals(obj2) || aVar.m4081a() || aVarM4064n.m4081a() || !z8) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            aVarM4064n = aVar;
                        }
                        if (aVarM4064n.m4081a()) {
                            if (aVarM4064n.equals(aVar)) {
                                j8 = playbackInfo.f5946s;
                            } else {
                                timeline.mo3463h(aVarM4064n.f8857a, bVar);
                                if (aVarM4064n.f8859c == bVar.m3475e(aVarM4064n.f8858b)) {
                                    j8 = bVar.f6749f.f9079f;
                                } else {
                                    j8 = 0;
                                }
                            }
                            j7 = j8;
                        } else {
                            j7 = j6;
                        }
                        fVar = new f(aVarM4064n, j7, j4, z6, z7, z5);
                        j12 = j5;
                    }
                }
                i2 = iMo3456a;
                obj2 = obj;
                z = false;
                j2 = j16;
                i3 = i2;
                z5 = z;
                z6 = false;
                z7 = false;
                j3 = j2;
                if (i3 != i) {
                    Pair<Object, Long> pairM3464j3 = timeline.m3464j(cVar, bVar, i3, -9223372036854775807L);
                    obj2 = pairM3464j3.first;
                    long jLongValue4 = ((Long) pairM3464j3.second).longValue();
                    j4 = -9223372036854775807L;
                    j6 = jLongValue4;
                    j5 = jLongValue4;
                } else {
                    long j18 = j3;
                    j4 = j18;
                    j6 = j18;
                    j5 = j3;
                }
                aVarM4064n = mediaPeriodQueue.m4064n(timeline, obj2, j6);
                if (aVarM4064n.f8861e != i) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if (aVar.f8857a.equals(obj2)) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    aVarM4064n = aVar;
                }
                if (aVarM4064n.m4081a()) {
                    if (aVarM4064n.equals(aVar)) {
                        j8 = playbackInfo.f5946s;
                    } else {
                        timeline.mo3463h(aVarM4064n.f8857a, bVar);
                        if (aVarM4064n.f8859c == bVar.m3475e(aVarM4064n.f8858b)) {
                            j8 = bVar.f6749f.f9079f;
                        } else {
                            j8 = 0;
                        }
                    }
                    j7 = j8;
                } else {
                    j7 = j6;
                }
                fVar = new f(aVarM4064n, j7, j4, z6, z7, z5);
                j12 = j5;
            }
            i3 = iMo3456a2;
            z5 = z3;
            z6 = z4;
            z7 = z2;
            aVar = aVar;
            j3 = j9;
            if (i3 != i) {
                Pair<Object, Long> pairM3464j4 = timeline.m3464j(cVar, bVar, i3, -9223372036854775807L);
                obj2 = pairM3464j4.first;
                long jLongValue5 = ((Long) pairM3464j4.second).longValue();
                j4 = -9223372036854775807L;
                j6 = jLongValue5;
                j5 = jLongValue5;
            } else {
                long j19 = j3;
                j4 = j19;
                j6 = j19;
                j5 = j3;
            }
            aVarM4064n = mediaPeriodQueue.m4064n(timeline, obj2, j6);
            if (aVarM4064n.f8861e != i) {
                z8 = true;
            } else {
                z8 = true;
            }
            if (aVar.f8857a.equals(obj2)) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                aVarM4064n = aVar;
            }
            if (aVarM4064n.m4081a()) {
                if (aVarM4064n.equals(aVar)) {
                    j8 = playbackInfo.f5946s;
                } else {
                    timeline.mo3463h(aVarM4064n.f8857a, bVar);
                    if (aVarM4064n.f8859c == bVar.m3475e(aVarM4064n.f8858b)) {
                        j8 = bVar.f6749f.f9079f;
                    } else {
                        j8 = 0;
                    }
                }
                j7 = j8;
            } else {
                j7 = j6;
            }
            fVar = new f(aVarM4064n, j7, j4, z6, z7, z5);
            j12 = j5;
        }
        f fVar2 = fVar;
        MediaSource2.a aVar3 = fVar2.f6727a;
        long j20 = fVar2.f6729c;
        boolean z17 = fVar2.f6730d;
        long jM3403Q = fVar2.f6728b;
        boolean z18 = (this.f6669B.f5930c.equals(aVar3) && jM3403Q == this.f6669B.f5946s) ? false : true;
        try {
            if (fVar2.f6731e) {
                if (this.f6669B.f5932e != 1) {
                    m3424f0(4);
                }
                m3396F(false, false, false, true);
            }
            try {
                if (z18) {
                    j14 = j20;
                    z14 = false;
                    if (!timeline.m3470q()) {
                        for (MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8832h; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f8657l) {
                            if (mediaPeriodHolder.f8651f.f8809a.equals(aVar3)) {
                                j15 = j14;
                                mediaPeriodHolder.f8651f = this.f6704w.m4057g(timeline, mediaPeriodHolder.f8651f);
                            } else {
                                j15 = j14;
                            }
                        }
                        j15 = j14;
                        jM3403Q = m3403Q(aVar3, jM3403Q, z17);
                        j15 = j14;
                    }
                } else {
                    long j21 = j20;
                    z14 = false;
                    j15 = j21;
                    if (!this.f6704w.m4066q(timeline, this.f6683P, m3433l())) {
                        m3401O(false);
                        j15 = j21;
                    }
                }
                j15 = j14;
                PlaybackInfo playbackInfo2 = this.f6669B;
                m3438n0(timeline, aVar3, playbackInfo2.f5929b, playbackInfo2.f5930c, fVar2.f6732f ? jM3403Q : -9223372036854775807L);
                if (z18 || j15 != this.f6669B.f5931d) {
                    this.f6669B = m3446u(aVar3, jM3403Q, j15);
                }
                m3397G();
                m3399K(timeline, this.f6669B.f5929b);
                this.f6669B = this.f6669B.m2894h(timeline);
                if (!timeline.m3470q()) {
                    this.f6682O = null;
                }
                m3442q(z14);
            } catch (Throwable th) {
                th = th;
                gVar = null;
                z13 = j20;
                j13 = j12;
                PlaybackInfo playbackInfo3 = this.f6669B;
                m3438n0(timeline, aVar3, playbackInfo3.f5929b, playbackInfo3.f5930c, fVar2.f6732f ? jM3403Q : -9223372036854775807L);
                if (z18 || j13 != this.f6669B.f5931d) {
                    this.f6669B = m3446u(aVar3, jM3403Q, j13);
                }
                m3397G();
                m3399K(timeline, this.f6669B.f5929b);
                this.f6669B = this.f6669B.m2894h(timeline);
                if (!timeline.m3470q()) {
                    this.f6682O = gVar;
                }
                m3442q(z13);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j13 = j20;
            z13 = 0;
            gVar = null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3444s(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8834j;
        if (mediaPeriodHolder != null && mediaPeriodHolder.f8646a == mediaPeriod) {
            float f2 = this.f6700s.mo3064b().f6260b;
            Timeline timeline = this.f6669B.f5929b;
            mediaPeriodHolder.f8649d = true;
            mediaPeriodHolder.f8658m = mediaPeriodHolder.f8646a.mo4079s();
            TrackSelectorResult trackSelectorResultM4007i = mediaPeriodHolder.m4007i(f2, timeline);
            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f8651f;
            long jMax = mediaPeriodInfo.f8810b;
            long j2 = mediaPeriodInfo.f8813e;
            if (j2 != -9223372036854775807L && jMax >= j2) {
                jMax = Math.max(0L, j2 - 1);
            }
            long jM3999a = mediaPeriodHolder.m3999a(trackSelectorResultM4007i, jMax, false, new boolean[mediaPeriodHolder.f8654i.length]);
            long j3 = mediaPeriodHolder.f8660o;
            MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.f8651f;
            mediaPeriodHolder.f8660o = (mediaPeriodInfo2.f8810b - jM3999a) + j3;
            mediaPeriodHolder.f8651f = mediaPeriodInfo2.m4048b(jM3999a);
            this.f6691j.mo3346d(this.f6687f, mediaPeriodHolder.f8658m, mediaPeriodHolder.f8659n.f10367c);
            if (mediaPeriodHolder == this.f6704w.f8832h) {
                m3398H(mediaPeriodHolder.f8651f.f8810b);
                m3423f();
                PlaybackInfo playbackInfo = this.f6669B;
                this.f6669B = m3446u(playbackInfo.f5930c, mediaPeriodHolder.f8651f.f8810b, playbackInfo.f5931d);
            }
            m3449y();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m3445t(PlaybackParameters playbackParameters, float f2, boolean z, boolean z2) throws ExoPlaybackException {
        int i;
        if (z) {
            if (z2) {
                this.f6670C.m3452a(1);
            }
            this.f6669B = this.f6669B.m2892f(playbackParameters);
        }
        float f3 = playbackParameters.f6260b;
        MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8832h;
        while (true) {
            i = 0;
            if (mediaPeriodHolder == null) {
                break;
            }
            ExoTrackSelection2[] exoTrackSelection2Arr = mediaPeriodHolder.f8659n.f10367c;
            int length = exoTrackSelection2Arr.length;
            while (i < length) {
                ExoTrackSelection2 exoTrackSelection2 = exoTrackSelection2Arr[i];
                if (exoTrackSelection2 != null) {
                    exoTrackSelection2.mo4509p(f3);
                }
                i++;
            }
            mediaPeriodHolder = mediaPeriodHolder.f8657l;
        }
        Renderer2[] renderer2Arr = this.f6687f;
        int length2 = renderer2Arr.length;
        while (i < length2) {
            Renderer2 renderer2 = renderer2Arr[i];
            if (renderer2 != null) {
                renderer2.mo3045m(f2, playbackParameters.f6260b);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: u */
    public final PlaybackInfo m3446u(MediaSource2.a aVar, long j2, long j3) {
        TrackSelectorResult trackSelectorResult;
        List<Metadata> list;
        TrackGroupArray trackGroupArray;
        ImmutableList2<Object> immutableList2M11647c;
        this.f6685R = (!this.f6685R && j2 == this.f6669B.f5946s && aVar.equals(this.f6669B.f5930c)) ? false : true;
        m3397G();
        PlaybackInfo playbackInfo = this.f6669B;
        TrackGroupArray trackGroupArray2 = playbackInfo.f5935h;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.f5936i;
        List<Metadata> list2 = playbackInfo.f5937j;
        if (this.f6705x.f10188j) {
            MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8832h;
            TrackGroupArray trackGroupArray3 = mediaPeriodHolder == null ? TrackGroupArray.f9067f : mediaPeriodHolder.f8658m;
            TrackSelectorResult trackSelectorResult3 = mediaPeriodHolder == null ? this.f6690i : mediaPeriodHolder.f8659n;
            ExoTrackSelection2[] exoTrackSelection2Arr = trackSelectorResult3.f10367c;
            ImmutableList2.a aVar2 = new ImmutableList2.a();
            boolean z = false;
            for (ExoTrackSelection2 exoTrackSelection2 : exoTrackSelection2Arr) {
                if (exoTrackSelection2 != null) {
                    Metadata metadata = exoTrackSelection2.mo4516f(0).f6932o;
                    if (metadata == null) {
                        aVar2.m11646b(new Metadata(new Metadata.b[0]));
                    } else {
                        aVar2.m11646b(metadata);
                        z = true;
                    }
                }
            }
            if (z) {
                immutableList2M11647c = aVar2.m11647c();
            } else {
                AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
                immutableList2M11647c = RegularImmutableList.f26218h;
            }
            if (mediaPeriodHolder != null) {
                MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f8651f;
                if (mediaPeriodInfo.f8811c != j3) {
                    mediaPeriodHolder.f8651f = mediaPeriodInfo.m4047a(j3);
                }
            }
            list = immutableList2M11647c;
            trackGroupArray = trackGroupArray3;
            trackSelectorResult = trackSelectorResult3;
        } else if (aVar.equals(playbackInfo.f5930c)) {
            trackSelectorResult = trackSelectorResult2;
            list = list2;
            trackGroupArray = trackGroupArray2;
        } else {
            TrackGroupArray trackGroupArray4 = TrackGroupArray.f9067f;
            TrackSelectorResult trackSelectorResult4 = this.f6690i;
            AbstractIndexedListIterator<Object> abstractIndexedListIterator2 = ImmutableList2.f26255g;
            trackGroupArray = trackGroupArray4;
            trackSelectorResult = trackSelectorResult4;
            list = RegularImmutableList.f26218h;
        }
        return this.f6669B.m2888b(aVar, j2, j3, m3437n(), trackGroupArray, trackSelectorResult, list);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3447v() {
        MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8834j;
        if (mediaPeriodHolder == null) {
            return false;
        }
        return (!mediaPeriodHolder.f8649d ? 0L : mediaPeriodHolder.f8646a.mo4068b()) != Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m3448x() {
        MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8832h;
        long j2 = mediaPeriodHolder.f8651f.f8813e;
        return mediaPeriodHolder.f8649d && (j2 == -9223372036854775807L || this.f6669B.f5946s < j2 || !m3426g0());
    }

    /* JADX INFO: renamed from: y */
    public final void m3449y() {
        long j2;
        long j3;
        boolean zMo3349g;
        if (m3447v()) {
            MediaPeriodHolder mediaPeriodHolder = this.f6704w.f8834j;
            long jM3439o = m3439o(!mediaPeriodHolder.f8649d ? 0L : mediaPeriodHolder.f8646a.mo4068b());
            if (mediaPeriodHolder == this.f6704w.f8832h) {
                j2 = this.f6683P;
                j3 = mediaPeriodHolder.f8660o;
            } else {
                j2 = this.f6683P - mediaPeriodHolder.f8660o;
                j3 = mediaPeriodHolder.f8651f.f8810b;
            }
            zMo3349g = this.f6691j.mo3349g(j2 - j3, jM3439o, this.f6700s.mo3064b().f6260b);
        } else {
            zMo3349g = false;
        }
        this.f6675H = zMo3349g;
        if (zMo3349g) {
            MediaPeriodHolder mediaPeriodHolder2 = this.f6704w.f8834j;
            long j4 = this.f6683P;
            C2096e.m4570f(mediaPeriodHolder2.m4005g());
            mediaPeriodHolder2.f8646a.mo4069d(j4 - mediaPeriodHolder2.f8660o);
        }
        m3436m0();
    }

    /* JADX INFO: renamed from: z */
    public final void m3450z() {
        d dVar = this.f6670C;
        PlaybackInfo playbackInfo = this.f6669B;
        boolean z = dVar.f6720a | (dVar.f6721b != playbackInfo);
        dVar.f6720a = z;
        dVar.f6721b = playbackInfo;
        if (z) {
            ExoPlayerImpl exoPlayerImpl = ((C1541m) this.f6703v).f6769a;
            exoPlayerImpl.f6638e.f6291a.post(new RunnableC1687r(exoPlayerImpl, dVar));
            this.f6670C = new d(this.f6669B);
        }
    }
}
