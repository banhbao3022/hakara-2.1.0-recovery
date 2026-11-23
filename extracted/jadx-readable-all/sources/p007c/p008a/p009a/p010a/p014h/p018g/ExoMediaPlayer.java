package p007c.p008a.p009a.p010a.p014h.p018g;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import android.view.Surface;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p008a.p009a.p010a.ExoMedia;
import p007c.p008a.p009a.p010a.ExoMedia3;
import p007c.p008a.p009a.p010a.p014h.p019h.CaptionListener;
import p007c.p008a.p009a.p010a.p014h.p019h.ExoPlayerListener;
import p007c.p008a.p009a.p010a.p014h.p019h.MetadataListener;
import p007c.p008a.p009a.p010a.p014h.p020i.RendererProvider;
import p007c.p008a.p009a.p010a.p014h.p021j.MediaSourceProvider;
import p007c.p008a.p009a.p010a.p014h.p021j.p022b.DefaultMediaSourceBuilder;
import p007c.p008a.p009a.p010a.p014h.p021j.p022b.MediaSourceBuilder;
import p007c.p008a.p009a.p010a.p027i.OnBufferUpdateListener;
import p007c.p008a.p009a.p010a.p028j.Repeater;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.DefaultLoadControl;
import p007c.p190n.p194b.p209b.ExoPlaybackException;
import p007c.p190n.p194b.p209b.ExoPlayer;
import p007c.p190n.p194b.p209b.ExoPlayerImpl;
import p007c.p190n.p194b.p209b.ExoPlayerImplInternal2;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.PlaybackParameters;
import p007c.p190n.p194b.p209b.Player;
import p007c.p190n.p194b.p209b.Player2;
import p007c.p190n.p194b.p209b.PlayerMessage;
import p007c.p190n.p194b.p209b.Renderer2;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p210a2.DefaultBandwidthMeter;
import p007c.p190n.p194b.p209b.p212b2.Clock2;
import p007c.p190n.p194b.p209b.p212b2.ListenerSet;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p213c2.MediaCodecVideoRenderer;
import p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener;
import p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsCollector;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2;
import p007c.p190n.p194b.p209b.p215n1.AudioCapabilities;
import p007c.p190n.p194b.p209b.p215n1.AudioProcessor;
import p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener;
import p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2;
import p007c.p190n.p194b.p209b.p215n1.MediaCodecAudioRenderer;
import p007c.p190n.p194b.p209b.p217p1.DecoderCounters;
import p007c.p190n.p194b.p209b.p217p1.DecoderReuseEvaluation;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p233t1.C1830f;
import p007c.p190n.p194b.p209b.p233t1.MediaCodecSelector;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.MetadataDecoderFactory;
import p007c.p190n.p194b.p209b.p234u1.MetadataOutput;
import p007c.p190n.p194b.p209b.p234u1.MetadataRenderer;
import p007c.p190n.p194b.p209b.p243w1.DefaultMediaSourceFactory;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.TextOutput;
import p007c.p190n.p194b.p209b.p252x1.TextRenderer;
import p007c.p190n.p194b.p209b.p262y1.AdaptiveTrackSelection;
import p007c.p190n.p194b.p209b.p262y1.DefaultTrackSelector;
import p007c.p190n.p194b.p209b.p262y1.TrackSelectionArray;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p477d1.Unit;
import p477d1.p481d0.Regex2;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s.CollectionsJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c.a.a.a.h.g.a, reason: use source file name */
/* JADX INFO: compiled from: ExoMediaPlayer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExoMediaPlayer implements Player2.a {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f1530f = 0;

    /* JADX INFO: renamed from: A */
    public final Context f1531A;

    /* JADX INFO: renamed from: g */
    public final ExoPlayer f1532g;

    /* JADX INFO: renamed from: h */
    public final DefaultTrackSelector f1533h;

    /* JADX INFO: renamed from: i */
    public final AdaptiveTrackSelection.b f1534i;

    /* JADX INFO: renamed from: j */
    public final Handler f1535j;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList<ExoPlayerListener> f1536k;

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f1537l;

    /* JADX INFO: renamed from: m */
    public boolean f1538m;

    /* JADX INFO: renamed from: n */
    public final StateStore f1539n;

    /* JADX INFO: renamed from: o */
    public final Repeater f1540o;

    /* JADX INFO: renamed from: p */
    public Surface f1541p;

    /* JADX INFO: renamed from: q */
    public MediaSource2 f1542q;

    /* JADX INFO: renamed from: r */
    public final List<Renderer2> f1543r;

    /* JADX INFO: renamed from: s */
    public final DefaultBandwidthMeter f1544s;

    /* JADX INFO: renamed from: t */
    public CaptionListener f1545t;

    /* JADX INFO: renamed from: u */
    public MetadataListener f1546u;

    /* JADX INFO: renamed from: v */
    public OnBufferUpdateListener f1547v;

    /* JADX INFO: renamed from: w */
    public PowerManager.WakeLock f1548w;

    /* JADX INFO: renamed from: x */
    public float f1549x;

    /* JADX INFO: renamed from: y */
    public final AnalyticsCollector f1550y;

    /* JADX INFO: renamed from: z */
    public DrmSessionManager2 f1551z;

    /* JADX INFO: renamed from: c.a.a.a.h.g.a$a */
    /* JADX INFO: compiled from: ExoMediaPlayer.kt */
    public static final class a extends Lambda implements InterfaceC6153a<Unit> {
        public a() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            ExoMediaPlayer exoMediaPlayer = ExoMediaPlayer.this;
            OnBufferUpdateListener onBufferUpdateListener = exoMediaPlayer.f1547v;
            if (onBufferUpdateListener != null) {
                onBufferUpdateListener.mo1062e(exoMediaPlayer.f1532g.mo2882g());
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.h.g.a$b */
    /* JADX INFO: compiled from: ExoMediaPlayer.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.h.g.a$c */
    /* JADX INFO: compiled from: ExoMediaPlayer.kt */
    public final class c implements VideoRendererEventListener2, AudioRendererEventListener2, TextOutput, MetadataOutput, DrmSessionEventListener2 {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ExoMediaPlayer f1553f;

        public c(ExoMediaPlayer exoMediaPlayer, AnalyticsCollector analyticsCollector) {
            Intrinsics2.m13089e(analyticsCollector, "delegate");
            this.f1553f = exoMediaPlayer;
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
        /* JADX INFO: renamed from: A */
        public /* synthetic */ void mo1129A(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            AudioRendererEventListener.m3564e(this, format, decoderReuseEvaluation);
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: B */
        public /* synthetic */ void mo1130B(int i, MediaSource2.a aVar) {
            DrmSessionEventListener.m3691b(this, i, aVar);
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: F */
        public /* synthetic */ void mo1131F(int i, MediaSource2.a aVar) {
            DrmSessionEventListener.m3693d(this, i, aVar);
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
        /* JADX INFO: renamed from: G */
        public void mo1132G(boolean z) {
            this.f1553f.f1550y.mo1132G(z);
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void mo1133H(Exception exc) {
            AudioRendererEventListener.m3566g(this, exc);
        }

        @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void mo1134I(Format format) {
            VideoRendererEventListener.m3325h(this, format);
        }

        @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
        /* JADX INFO: renamed from: J */
        public /* synthetic */ void mo1135J(DecoderCounters decoderCounters) {
            VideoRendererEventListener.m3323f(this, decoderCounters);
        }

        @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
        /* JADX INFO: renamed from: K */
        public /* synthetic */ void mo1136K(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            VideoRendererEventListener.m3326i(this, format, decoderReuseEvaluation);
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
        /* JADX INFO: renamed from: L */
        public /* synthetic */ void mo1137L(long j2) {
            AudioRendererEventListener.m3565f(this, j2);
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: M */
        public /* synthetic */ void mo1138M(int i, MediaSource2.a aVar) {
            DrmSessionEventListener.m3690a(this, i, aVar);
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
        /* JADX INFO: renamed from: N */
        public /* synthetic */ void mo1139N(Format format) {
            AudioRendererEventListener.m3563d(this, format);
        }

        @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
        /* JADX INFO: renamed from: R */
        public /* synthetic */ void mo1140R(DecoderCounters decoderCounters) {
            VideoRendererEventListener.m3322e(this, decoderCounters);
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: T */
        public /* synthetic */ void mo1141T(int i, MediaSource2.a aVar) {
            DrmSessionEventListener.m3694e(this, i, aVar);
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
        /* JADX INFO: renamed from: V */
        public void mo1142V(int i, long j2, long j3) {
            ExoMediaPlayer exoMediaPlayer = this.f1553f;
            int i2 = ExoMediaPlayer.f1530f;
            Objects.requireNonNull(exoMediaPlayer);
            this.f1553f.f1550y.mo1142V(i, j2, j3);
        }

        @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
        /* JADX INFO: renamed from: X */
        public /* synthetic */ void mo1143X(long j2, int i) {
            VideoRendererEventListener.m3324g(this, j2, i);
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: Y */
        public /* synthetic */ void mo1144Y(int i, MediaSource2.a aVar) {
            DrmSessionEventListener.m3692c(this, i, aVar);
        }

        @Override // p007c.p190n.p194b.p209b.p234u1.MetadataOutput
        /* JADX INFO: renamed from: a */
        public void mo1145a(final Metadata metadata) {
            Intrinsics2.m13089e(metadata, "metadata");
            MetadataListener metadataListener = this.f1553f.f1546u;
            if (metadataListener != null) {
                metadataListener.mo1054a(metadata);
            }
            AnalyticsCollector analyticsCollector = this.f1553f.f1550y;
            final AnalyticsListener2.a aVarM3500a0 = analyticsCollector.m3500a0();
            ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.d
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj) {
                    ((AnalyticsListener2) obj).mo1028A(aVarM3500a0, metadata);
                }
            };
            analyticsCollector.f6901j.put(1007, aVarM3500a0);
            ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = analyticsCollector.f6902k;
            listenerSet.m3149b(1007, aVar);
            listenerSet.m3148a();
        }

        @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
        /* JADX INFO: renamed from: b */
        public void mo1146b(int i, int i2, int i3, float f) {
            Iterator<ExoPlayerListener> it = this.f1553f.f1536k.iterator();
            while (it.hasNext()) {
                it.next().mo1056b(i, i2, i3, f);
            }
            this.f1553f.f1550y.mo1146b(i, i2, i3, f);
        }

        @Override // p007c.p190n.p194b.p209b.p252x1.TextOutput
        /* JADX INFO: renamed from: c */
        public void mo1147c(List<Cue> list) {
            Intrinsics2.m13089e(list, "cues");
            CaptionListener captionListener = this.f1553f.f1545t;
            if (captionListener != null) {
                captionListener.m1160c(list);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
        /* JADX INFO: renamed from: e */
        public void mo1148e(DecoderCounters decoderCounters) {
            Intrinsics2.m13089e(decoderCounters, "counters");
            ExoMediaPlayer exoMediaPlayer = this.f1553f;
            int i = ExoMediaPlayer.f1530f;
            Objects.requireNonNull(exoMediaPlayer);
            this.f1553f.f1550y.mo1148e(decoderCounters);
        }

        @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void mo1149f(String str) {
            VideoRendererEventListener.m3321d(this, str);
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
        /* JADX INFO: renamed from: g */
        public /* synthetic */ void mo1150g(DecoderCounters decoderCounters) {
            AudioRendererEventListener.m3562c(this, decoderCounters);
        }

        @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void mo1151i(String str, long j2, long j3) {
            VideoRendererEventListener.m3320c(this, str, j2, j3);
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2
        /* JADX INFO: renamed from: p */
        public void mo1152p(int i, MediaSource2.a aVar, Exception exc) {
            Intrinsics2.m13089e(exc, "error");
            ExoMediaPlayer exoMediaPlayer = this.f1553f;
            int i2 = ExoMediaPlayer.f1530f;
            Objects.requireNonNull(exoMediaPlayer);
            this.f1553f.f1550y.mo1152p(i, aVar, exc);
        }

        @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
        /* JADX INFO: renamed from: t */
        public /* synthetic */ void mo1153t(Surface surface) {
            VideoRendererEventListener.m3319b(this, surface);
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
        /* JADX INFO: renamed from: u */
        public /* synthetic */ void mo1154u(String str) {
            AudioRendererEventListener.m3561b(this, str);
        }

        @Override // p007c.p190n.p194b.p209b.p215n1.AudioRendererEventListener2
        /* JADX INFO: renamed from: v */
        public /* synthetic */ void mo1155v(String str, long j2, long j3) {
            AudioRendererEventListener.m3560a(this, str, j2, j3);
        }

        @Override // p007c.p190n.p194b.p209b.p213c2.VideoRendererEventListener2
        /* JADX INFO: renamed from: x */
        public /* synthetic */ void mo1156x(int i, long j2) {
            VideoRendererEventListener.m3318a(this, i, j2);
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.h.g.a$d */
    /* JADX INFO: compiled from: ExoMediaPlayer.kt */
    public final class d {

        /* JADX INFO: renamed from: a */
        public final List<Integer> f1554a;

        public d(ExoMediaPlayer exoMediaPlayer, List<Integer> list, int i, int i2) {
            Intrinsics2.m13089e(list, "rendererTrackIndexes");
            List<Integer> listUnmodifiableList = Collections.unmodifiableList(list);
            Intrinsics2.m13088d(listUnmodifiableList, "Collections.unmodifiableList(rendererTrackIndexes)");
            this.f1554a = listUnmodifiableList;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x010d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0117  */
    /* JADX WARN: Code duplicated, block: B:35:0x0180  */
    /* JADX WARN: Code duplicated, block: B:38:0x018a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x00b8  */
    public ExoMediaPlayer(Context context) {
        boolean z;
        AudioCapabilities audioCapabilities;
        AudioCapabilities audioCapabilities2;
        List<String> list;
        ArrayList arrayList;
        List<String> list2;
        Iterator<T> it;
        Object objNewInstance;
        Iterator<T> it2;
        Object objNewInstance2;
        Intrinsics2.m13089e(context, "context");
        this.f1531A = context;
        this.f1536k = new CopyOnWriteArrayList<>();
        this.f1537l = new AtomicBoolean();
        this.f1539n = new StateStore();
        Repeater repeater = new Repeater(false, 1, null);
        this.f1540o = repeater;
        DefaultBandwidthMeter.a aVar = new DefaultBandwidthMeter.a(context);
        DefaultBandwidthMeter defaultBandwidthMeter = new DefaultBandwidthMeter(aVar.f6185a, aVar.f6186b, aVar.f6187c, aVar.f6188d, aVar.f6189e);
        Intrinsics2.m13088d(defaultBandwidthMeter, "DefaultBandwidthMeter.Builder(context).build()");
        this.f1544s = defaultBandwidthMeter;
        this.f1549x = 1.0f;
        AnalyticsCollector analyticsCollector = new AnalyticsCollector(Clock2.f6300a);
        this.f1550y = analyticsCollector;
        repeater.f1665b = CloseCodes.NORMAL_CLOSURE;
        repeater.f1669f = new a();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f1535j = handler;
        c cVar = new c(this, analyticsCollector);
        RendererProvider rendererProvider = new RendererProvider(context, handler, cVar, cVar, cVar, cVar);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Context context2 = rendererProvider.f1562c;
        C1830f c1830f = new MediaCodecSelector() { // from class: c.n.b.b.t1.f
            @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecSelector
            /* JADX INFO: renamed from: a */
            public final List mo3932a(String str, boolean z2, boolean z3) {
                return MediaCodecUtil.m3988e(str, z2, z3);
            }
        };
        Handler handler2 = rendererProvider.f1563d;
        AudioRendererEventListener2 audioRendererEventListener2 = rendererProvider.f1566g;
        AudioCapabilities audioCapabilities3 = AudioCapabilities.f7105a;
        Intent intentRegisterReceiver = context2.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (Util6.f6307a >= 17) {
            String str = Util6.f6309c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z || Settings.Global.getInt(context2.getContentResolver(), "external_surround_sound_enabled", 0) != 1) {
            if (intentRegisterReceiver == null || intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
                audioCapabilities = AudioCapabilities.f7105a;
            } else {
                audioCapabilities2 = new AudioCapabilities(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
            }
            arrayList3.add(new MediaCodecAudioRenderer(context2, c1830f, handler2, audioRendererEventListener2, audioCapabilities2, new AudioProcessor[0]));
            ExoMedia exoMedia = ExoMedia.f1497e;
            list = ExoMedia.f1493a.get(ExoMedia3.AUDIO);
            if (list != null) {
                it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        objNewInstance2 = Class.forName((String) it2.next()).getConstructor(Handler.class, AudioRendererEventListener2.class).newInstance(rendererProvider.f1563d, rendererProvider.f1566g);
                        if (objNewInstance2 != null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.google.android.exoplayer2.Renderer");
                        }
                        arrayList3.add((Renderer2) objNewInstance2);
                    } catch (Exception unused) {
                    }
                }
            }
            arrayList2.addAll(arrayList3);
            arrayList = new ArrayList();
            arrayList.add(new MediaCodecVideoRenderer(rendererProvider.f1562c, new MediaCodecSelector() { // from class: c.n.b.b.t1.f
                @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecSelector
                /* JADX INFO: renamed from: a */
                public final List mo3932a(String str2, boolean z2, boolean z3) {
                    return MediaCodecUtil.m3988e(str2, z2, z3);
                }
            }, rendererProvider.f1561b, rendererProvider.f1563d, rendererProvider.f1567h, rendererProvider.f1560a));
            ExoMedia exoMedia2 = ExoMedia.f1497e;
            list2 = ExoMedia.f1493a.get(ExoMedia3.VIDEO);
            if (list2 != null) {
                it = list2.iterator();
                while (it.hasNext()) {
                    try {
                        objNewInstance = Class.forName((String) it.next()).getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, VideoRendererEventListener2.class, Integer.TYPE).newInstance(Boolean.TRUE, Integer.valueOf(rendererProvider.f1561b), rendererProvider.f1563d, rendererProvider.f1567h, Integer.valueOf(rendererProvider.f1560a));
                        if (objNewInstance != null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.google.android.exoplayer2.Renderer");
                        }
                        arrayList.add((Renderer2) objNewInstance);
                    } catch (Exception unused2) {
                    }
                }
            }
            arrayList2.addAll(arrayList);
            arrayList2.addAll(CollectionsJVM.m13036a(new TextRenderer(rendererProvider.f1564e, rendererProvider.f1563d.getLooper())));
            arrayList2.addAll(CollectionsJVM.m13036a(new MetadataRenderer(rendererProvider.f1565f, rendererProvider.f1563d.getLooper(), MetadataDecoderFactory.f8662a)));
            this.f1543r = arrayList2;
            AdaptiveTrackSelection.b bVar = new AdaptiveTrackSelection.b();
            this.f1534i = bVar;
            DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(this.f1531A, bVar);
            this.f1533h = defaultTrackSelector;
            ExoMedia exoMedia3 = ExoMedia.f1497e;
            DefaultLoadControl defaultLoadControl = new DefaultLoadControl();
            Object[] array = arrayList2.toArray(new Renderer2[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            ExoPlayer.a aVar2 = new ExoPlayer.a((Renderer2[]) array, defaultTrackSelector, new DefaultMediaSourceFactory(this.f1531A), defaultLoadControl, this.f1544s);
            AnalyticsCollector analyticsCollector2 = this.f1550y;
            C2096e.m4570f(!aVar2.f6633m);
            aVar2.f6628h = analyticsCollector2;
            C2096e.m4570f(!aVar2.f6633m);
            aVar2.f6633m = true;
            ExoPlayerImpl exoPlayerImpl = new ExoPlayerImpl(aVar2.f6621a, aVar2.f6623c, aVar2.f6624d, aVar2.f6625e, aVar2.f6626f, aVar2.f6628h, aVar2.f6629i, aVar2.f6630j, aVar2.f6632l, aVar2.f6631k, false, aVar2.f6622b, aVar2.f6627g, null);
            Intrinsics2.m13088d(exoPlayerImpl, "ExoPlayer.Builder(render…llector)\n        .build()");
            this.f1532g = exoPlayerImpl;
            exoPlayerImpl.m3374r(this);
            exoPlayerImpl.m3374r(this.f1550y);
        }
        audioCapabilities = AudioCapabilities.f7106b;
        audioCapabilities2 = audioCapabilities;
        arrayList3.add(new MediaCodecAudioRenderer(context2, c1830f, handler2, audioRendererEventListener2, audioCapabilities2, new AudioProcessor[0]));
        ExoMedia exoMedia4 = ExoMedia.f1497e;
        list = ExoMedia.f1493a.get(ExoMedia3.AUDIO);
        if (list != null) {
            it2 = list.iterator();
            while (it2.hasNext()) {
                objNewInstance2 = Class.forName((String) it2.next()).getConstructor(Handler.class, AudioRendererEventListener2.class).newInstance(rendererProvider.f1563d, rendererProvider.f1566g);
                if (objNewInstance2 != null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.exoplayer2.Renderer");
                }
                arrayList3.add((Renderer2) objNewInstance2);
            }
        }
        arrayList2.addAll(arrayList3);
        arrayList = new ArrayList();
        arrayList.add(new MediaCodecVideoRenderer(rendererProvider.f1562c, new MediaCodecSelector() { // from class: c.n.b.b.t1.f
            @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecSelector
            /* JADX INFO: renamed from: a */
            public final List mo3932a(String str2, boolean z2, boolean z3) {
                return MediaCodecUtil.m3988e(str2, z2, z3);
            }
        }, rendererProvider.f1561b, rendererProvider.f1563d, rendererProvider.f1567h, rendererProvider.f1560a));
        ExoMedia exoMedia5 = ExoMedia.f1497e;
        list2 = ExoMedia.f1493a.get(ExoMedia3.VIDEO);
        if (list2 != null) {
            it = list2.iterator();
            while (it.hasNext()) {
                objNewInstance = Class.forName((String) it.next()).getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, VideoRendererEventListener2.class, Integer.TYPE).newInstance(Boolean.TRUE, Integer.valueOf(rendererProvider.f1561b), rendererProvider.f1563d, rendererProvider.f1567h, Integer.valueOf(rendererProvider.f1560a));
                if (objNewInstance != null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.exoplayer2.Renderer");
                }
                arrayList.add((Renderer2) objNewInstance);
            }
        }
        arrayList2.addAll(arrayList);
        arrayList2.addAll(CollectionsJVM.m13036a(new TextRenderer(rendererProvider.f1564e, rendererProvider.f1563d.getLooper())));
        arrayList2.addAll(CollectionsJVM.m13036a(new MetadataRenderer(rendererProvider.f1565f, rendererProvider.f1563d.getLooper(), MetadataDecoderFactory.f8662a)));
        this.f1543r = arrayList2;
        AdaptiveTrackSelection.b bVar2 = new AdaptiveTrackSelection.b();
        this.f1534i = bVar2;
        DefaultTrackSelector defaultTrackSelector2 = new DefaultTrackSelector(this.f1531A, bVar2);
        this.f1533h = defaultTrackSelector2;
        ExoMedia exoMedia6 = ExoMedia.f1497e;
        DefaultLoadControl defaultLoadControl2 = new DefaultLoadControl();
        Object[] array2 = arrayList2.toArray(new Renderer2[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        ExoPlayer.a aVar3 = new ExoPlayer.a((Renderer2[]) array2, defaultTrackSelector2, new DefaultMediaSourceFactory(this.f1531A), defaultLoadControl2, this.f1544s);
        AnalyticsCollector analyticsCollector3 = this.f1550y;
        C2096e.m4570f(!aVar3.f6633m);
        aVar3.f6628h = analyticsCollector3;
        C2096e.m4570f(!aVar3.f6633m);
        aVar3.f6633m = true;
        ExoPlayerImpl exoPlayerImpl2 = new ExoPlayerImpl(aVar3.f6621a, aVar3.f6623c, aVar3.f6624d, aVar3.f6625e, aVar3.f6626f, aVar3.f6628h, aVar3.f6629i, aVar3.f6630j, aVar3.f6632l, aVar3.f6631k, false, aVar3.f6622b, aVar3.f6627g, null);
        Intrinsics2.m13088d(exoPlayerImpl2, "ExoPlayer.Builder(render…llector)\n        .build()");
        this.f1532g = exoPlayerImpl2;
        exoPlayerImpl2.m3374r(this);
        exoPlayerImpl2.m3374r(this.f1550y);
    }

    /* JADX INFO: renamed from: i */
    public static void m1097i(ExoMediaPlayer exoMediaPlayer, long j2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        AnalyticsCollector analyticsCollector = exoMediaPlayer.f1550y;
        if (!analyticsCollector.f6904m) {
            final AnalyticsListener2.a aVarM3500a0 = analyticsCollector.m3500a0();
            analyticsCollector.f6904m = true;
            ListenerSet.a<AnalyticsListener2> aVar = new ListenerSet.a() { // from class: c.n.b.b.m1.t0
                @Override // p007c.p190n.p194b.p209b.p212b2.ListenerSet.a
                /* JADX INFO: renamed from: b */
                public final void mo2881b(Object obj) {
                    ((AnalyticsListener2) obj).mo1051X(aVarM3500a0);
                }
            };
            analyticsCollector.f6901j.put(-1, aVarM3500a0);
            ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = analyticsCollector.f6902k;
            listenerSet.m3149b(-1, aVar);
            listenerSet.m3148a();
        }
        if (z) {
            exoMediaPlayer.f1532g.mo2885x(j2);
            StateStore stateStore = exoMediaPlayer.f1539n;
            stateStore.m1159c(stateStore.m1157a(), 100);
            return;
        }
        Timeline timelineMo3341p = exoMediaPlayer.f1532g.mo3341p();
        Intrinsics2.m13088d(timelineMo3341p, "exoPlayer.currentTimeline");
        int iMo3356p = timelineMo3341p.mo3356p();
        long j3 = 0;
        Timeline.c cVar = new Timeline.c();
        for (int i2 = 0; i2 < iMo3356p; i2++) {
            timelineMo3341p.m3468n(i2, cVar);
            long jM3478b = cVar.m3478b();
            if (j3 < j2 && j2 <= j3 + jM3478b) {
                exoMediaPlayer.f1532g.mo3333e(i2, j2 - j3);
                StateStore stateStore2 = exoMediaPlayer.f1539n;
                stateStore2.m1159c(stateStore2.m1157a(), 100);
                return;
            }
            j3 += jM3478b;
        }
        Log.e("ExoMediaPlayer", "Unable to seek across windows, falling back to in-window seeking");
        exoMediaPlayer.f1532g.mo2885x(j2);
        StateStore stateStore3 = exoMediaPlayer.f1539n;
        stateStore3.m1159c(stateStore3.m1157a(), 100);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void mo1098C(Timeline timeline, Object obj, int i) {
        Player.m3254q(this, timeline, obj, i);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void mo1099D(int i) {
        Player.m3250m(this, i);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void mo1100E(MediaItem2 mediaItem2, int i) {
        Player.m3244g(this, mediaItem2, i);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void mo1101O(boolean z, int i) {
        Player.m3245h(this, z, i);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void mo1102Q(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        Player.m3255r(this, trackGroupArray, trackSelectionArray);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void mo1103S(PlaybackParameters playbackParameters) {
        Player.m3246i(this, playbackParameters);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void mo1104U(boolean z) {
        Player.m3239b(this, z);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void mo1105Z(boolean z) {
        Player.m3242e(this, z);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo1106a(int i) {
        Player.m3248k(this, i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: b */
    public final void m1107b(AnalyticsListener2 analyticsListener2) {
        Intrinsics2.m13089e(analyticsListener2, "listener");
        AnalyticsCollector analyticsCollector = this.f1550y;
        Objects.requireNonNull(analyticsCollector);
        ListenerSet<AnalyticsListener2, AnalyticsListener2.b> listenerSet = analyticsCollector.f6902k;
        if (listenerSet.f6353h) {
            return;
        }
        listenerSet.f6350e.add((ListenerSet.c<T, E>) new ListenerSet.c(analyticsListener2, listenerSet.f6348c));
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void mo1108c(boolean z) {
        Player.m3243f(this, z);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void mo1109d(int i) {
        Player.m3249l(this, i);
    }

    /* JADX INFO: renamed from: e */
    public final long m1110e() {
        long currentPosition = this.f1532g.getCurrentPosition();
        Timeline timelineMo3341p = this.f1532g.mo3341p();
        Intrinsics2.m13088d(timelineMo3341p, "exoPlayer.currentTimeline");
        int iMin = Math.min(timelineMo3341p.mo3356p() - 1, this.f1532g.mo3337j());
        long jM3478b = 0;
        Timeline.c cVar = new Timeline.c();
        for (int i = 0; i < iMin; i++) {
            timelineMo3341p.m3468n(i, cVar);
            jM3478b += cVar.m3478b();
        }
        return jM3478b + currentPosition;
    }

    /* JADX INFO: renamed from: f */
    public final void m1111f() {
        MediaSource2 mediaSource2 = this.f1542q;
        if (this.f1538m || mediaSource2 == null) {
            return;
        }
        if (!this.f1543r.isEmpty()) {
            this.f1532g.stop();
        }
        StateStore stateStore = this.f1539n;
        int length = stateStore.f1555a.length;
        for (int i = 0; i < length; i++) {
            stateStore.f1555a[i] = 1;
        }
        this.f1532g.mo3366a(mediaSource2);
        this.f1532g.prepare();
        this.f1538m = true;
        this.f1537l.set(false);
    }

    /* JADX INFO: renamed from: g */
    public final void m1112g() {
        m1116l(false);
        this.f1536k.clear();
        MediaSource2 mediaSource2 = this.f1542q;
        if (mediaSource2 != null) {
            mediaSource2.mo4087d(this.f1550y);
        }
        this.f1541p = null;
        this.f1532g.release();
        m1124t(false);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void mo1113h(List list) {
        Player.m3252o(this, list);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: j */
    public void mo1114j(ExoPlaybackException exoPlaybackException) {
        Intrinsics2.m13089e(exoPlaybackException, "error");
        Iterator<T> it = this.f1536k.iterator();
        while (it.hasNext()) {
            ((ExoPlayerListener) it.next()).mo1057b0(this, exoPlaybackException);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1115k(int i, int i2, Object obj, boolean z) {
        if (this.f1543r.isEmpty()) {
            return;
        }
        ArrayList<PlayerMessage> arrayList = new ArrayList();
        for (Renderer2 renderer2 : this.f1543r) {
            if (renderer2.mo3054x() == i) {
                PlayerMessage playerMessageMo3367q = this.f1532g.mo3367q(renderer2);
                C2096e.m4570f(!playerMessageMo3367q.f6593k);
                playerMessageMo3367q.f6587e = i2;
                C2096e.m4570f(true ^ playerMessageMo3367q.f6593k);
                playerMessageMo3367q.f6588f = obj;
                arrayList.add(playerMessageMo3367q);
            }
        }
        if (!z) {
            for (PlayerMessage playerMessage : arrayList) {
                C2096e.m4570f(!playerMessage.f6593k);
                if (playerMessage.f6591i == -9223372036854775807L) {
                    C2096e.m4566b(playerMessage.f6592j);
                }
                playerMessage.f6593k = true;
                ExoPlayerImplInternal2 exoPlayerImplInternal2 = (ExoPlayerImplInternal2) playerMessage.f6584b;
                synchronized (exoPlayerImplInternal2) {
                    if (exoPlayerImplInternal2.f6671D || !exoPlayerImplInternal2.f6694m.isAlive()) {
                        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                        playerMessage.m3354b(false);
                    } else {
                        exoPlayerImplInternal2.f6693l.m3073c(14, playerMessage).sendToTarget();
                    }
                }
            }
            return;
        }
        Intrinsics2.m13089e(arrayList, "messages");
        boolean z2 = false;
        for (PlayerMessage playerMessage2 : arrayList) {
            boolean z3 = true;
            while (z3) {
                try {
                    synchronized (playerMessage2) {
                        try {
                            C2096e.m4570f(playerMessage2.f6593k);
                            C2096e.m4570f(playerMessage2.f6589g.getThread() != Thread.currentThread());
                            while (!playerMessage2.f6595m) {
                                playerMessage2.wait();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    z3 = false;
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1116l(boolean z) {
        if (z && this.f1547v != null) {
            this.f1540o.m1213b();
            return;
        }
        Repeater repeater = this.f1540o;
        repeater.m1212a().quit();
        repeater.f1664a = false;
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void mo1117m(boolean z) {
        Player.m3241d(this, z);
    }

    /* JADX INFO: renamed from: n */
    public final void m1118n(MediaSource2 mediaSource2) {
        MediaSource2 mediaSource3 = this.f1542q;
        if (mediaSource3 != null) {
            mediaSource3.mo4087d(this.f1550y);
            Objects.requireNonNull(this.f1550y);
        }
        if (mediaSource2 != null) {
            mediaSource2.mo4086c(this.f1535j, this.f1550y);
        }
        this.f1542q = mediaSource2;
        this.f1538m = false;
        m1111f();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void mo1119o() {
        Player.m3251n(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m1120p(boolean z) {
        this.f1532g.mo3338k(z);
        m1124t(z);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void mo1121q(Timeline timeline, int i) {
        Player.m3253p(this, timeline, i);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX INFO: renamed from: r */
    public final void m1122r(Uri uri) {
        MediaSourceProvider.b bVar;
        MediaSourceBuilder defaultMediaSourceBuilder;
        String lowerCase;
        Object next;
        Object next2;
        ExoMedia exoMedia = ExoMedia.f1497e;
        MediaSourceProvider mediaSourceProvider = ExoMedia.f1496d;
        MediaSourceBuilder.a aVar = new MediaSourceBuilder.a(this.f1531A, uri, this.f1535j, this.f1544s, this.f1551z, null, 32, null);
        Objects.requireNonNull(mediaSourceProvider);
        Intrinsics2.m13089e(aVar, "attributes");
        MediaSourceProvider.a aVar2 = MediaSourceProvider.f1569b;
        Uri uri2 = aVar.f1575b;
        Objects.requireNonNull(aVar2);
        Intrinsics2.m13089e(uri2, "uri");
        Intrinsics2.m13089e(uri2, "uri");
        String scheme = uri2.getScheme();
        Object obj = null;
        if (scheme != null) {
            Intrinsics2.m13088d(scheme, "it");
            if (!(scheme.length() > 0)) {
                scheme = null;
            }
            if (scheme != null) {
                Intrinsics2.m13088d(scheme, "uri.scheme?.takeIf { it.…tEmpty() } ?: return null");
                Iterator<T> it = ExoMedia.f1494b.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!StringsJVM.m12989f(((MediaSourceProvider.b) next2).f1571b, scheme, true));
                bVar = (MediaSourceProvider.b) next2;
            } else {
                bVar = null;
            }
        } else {
            bVar = null;
        }
        if (bVar == null) {
            Intrinsics2.m13089e(uri2, "uri");
            Intrinsics2.m13089e(uri2, "$this$getExtension");
            String lastPathSegment = uri2.getLastPathSegment();
            if (lastPathSegment != null) {
                int iM13014x = Strings5.m13014x(lastPathSegment, '.', 0, false, 6);
                if (iM13014x == -1 && uri2.getPathSegments().size() > 1) {
                    String str = uri2.getPathSegments().get(uri2.getPathSegments().size() - 2);
                    Intrinsics2.m13088d(str, "pathSegments[pathSegments.size - 2]");
                    lastPathSegment = str;
                    iM13014x = Strings5.m13014x(lastPathSegment, '.', 0, false, 6);
                }
                if (iM13014x == -1) {
                    StringBuilder sbM1555F = outline.m1555F('.');
                    sbM1555F.append(uri2.getLastPathSegment());
                    lastPathSegment = sbM1555F.toString();
                    iM13014x = 0;
                }
                Objects.requireNonNull(lastPathSegment, "null cannot be cast to non-null type java.lang.String");
                String strSubstring = lastPathSegment.substring(iM13014x);
                Intrinsics2.m13088d(strSubstring, "(this as java.lang.String).substring(startIndex)");
                Locale locale = Locale.getDefault();
                Intrinsics2.m13088d(locale, "Locale.getDefault()");
                lowerCase = strSubstring.toLowerCase(locale);
                Intrinsics2.m13088d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = "";
            }
            if (!(lowerCase.length() > 0)) {
                lowerCase = null;
            }
            if (lowerCase != null) {
                ExoMedia exoMedia2 = ExoMedia.f1497e;
                Iterator<T> it2 = ExoMedia.f1494b.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!StringsJVM.m12989f(((MediaSourceProvider.b) next).f1572c, lowerCase, true));
                bVar = (MediaSourceProvider.b) next;
            } else {
                bVar = null;
            }
        }
        if (bVar == null) {
            Intrinsics2.m13089e(uri2, "uri");
            String string = uri2.toString();
            Intrinsics2.m13088d(string, "uri.toString()");
            ExoMedia exoMedia3 = ExoMedia.f1497e;
            for (Object obj2 : ExoMedia.f1494b) {
                String str2 = ((MediaSourceProvider.b) obj2).f1573d;
                if (str2 != null && new Regex2(str2).m12982a(string)) {
                    obj = obj2;
                    break;
                }
            }
            bVar = (MediaSourceProvider.b) obj;
        }
        if (bVar == null || (defaultMediaSourceBuilder = bVar.f1570a) == null) {
            defaultMediaSourceBuilder = new DefaultMediaSourceBuilder();
        }
        m1118n(defaultMediaSourceBuilder.mo1161a(aVar));
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void mo1123s(int i) {
        Player.m3247j(this, i);
    }

    /* JADX INFO: renamed from: t */
    public final void m1124t(boolean z) {
        PowerManager.WakeLock wakeLock = this.f1548w;
        if (wakeLock != null) {
            if (z && !wakeLock.isHeld()) {
                wakeLock.acquire(CloseCodes.NORMAL_CLOSURE);
            } else {
                if (z || !wakeLock.isHeld()) {
                    return;
                }
                wakeLock.release();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1125u() {
        if (this.f1537l.getAndSet(true)) {
            return;
        }
        this.f1532g.mo3338k(false);
        this.f1532g.stop();
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void mo1126w(Player2 player2, Player2.b bVar) {
        Player.m3238a(this, player2, bVar);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void mo1127y(boolean z) {
        Player.m3240c(this, z);
    }

    @Override // p007c.p190n.p194b.p209b.Player2.a
    /* JADX INFO: renamed from: z */
    public void mo1128z(boolean z, int i) {
        boolean zMo3334f = this.f1532g.mo3334f();
        int iMo3329P = this.f1532g.mo3329P();
        Objects.requireNonNull(this.f1539n);
        int i2 = (zMo3334f ? -268435456 : 0) | iMo3329P;
        StateStore stateStore = this.f1539n;
        if (i2 == stateStore.f1555a[3]) {
            return;
        }
        stateStore.m1159c(zMo3334f, iMo3329P);
        boolean zM1158b = true;
        if (i2 == 3) {
            m1116l(true);
        } else if (i2 == 1 || i2 == 4) {
            m1116l(false);
        }
        StateStore stateStore2 = this.f1539n;
        Objects.requireNonNull(stateStore2);
        if (!stateStore2.m1158b(new int[]{100, 2, 3}, true) && !stateStore2.m1158b(new int[]{2, 100, 3}, true)) {
            zM1158b = stateStore2.m1158b(new int[]{100, 3, 2, 3}, true);
        }
        for (ExoPlayerListener exoPlayerListener : this.f1536k) {
            exoPlayerListener.mo1084v(zMo3334f, iMo3329P);
            if (zM1158b) {
                exoPlayerListener.mo1081s();
            }
        }
    }
}
