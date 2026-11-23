package p007c.p008a.p009a.p010a.p014h;

import android.media.MediaPlayer;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import p007c.p008a.p009a.p010a.p014h.p017f.NativeMediaPlaybackException;
import p007c.p008a.p009a.p010a.p014h.p018g.ExoMediaPlayer;
import p007c.p008a.p009a.p010a.p014h.p019h.ExoPlayerListener;
import p007c.p008a.p009a.p010a.p014h.p019h.MetadataListener;
import p007c.p008a.p009a.p010a.p014h.p023k.ClearableSurface;
import p007c.p008a.p009a.p010a.p027i.OnBufferUpdateListener;
import p007c.p008a.p009a.p010a.p027i.OnCompletionListener2;
import p007c.p008a.p009a.p010a.p027i.OnErrorListener2;
import p007c.p008a.p009a.p010a.p027i.OnPreparedListener2;
import p007c.p008a.p009a.p010a.p027i.OnSeekCompletionListener;
import p007c.p190n.p194b.p209b.ExoPlaybackException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.PlaybackParameters;
import p007c.p190n.p194b.p209b.Player2;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsListener;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2;
import p007c.p190n.p194b.p209b.p217p1.DecoderCounters;
import p007c.p190n.p194b.p209b.p217p1.DecoderReuseEvaluation;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;
import p007c.p190n.p194b.p209b.p243w1.MediaLoadData;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p262y1.TrackSelectionArray;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.a, reason: use source file name */
/* JADX INFO: compiled from: ListenerMux.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ListenerMux implements ExoPlayerListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnSeekCompleteListener, OnBufferUpdateListener, MetadataListener, AnalyticsListener2 {

    /* JADX INFO: renamed from: f */
    public final Handler f1504f;

    /* JADX INFO: renamed from: g */
    public OnPreparedListener2 f1505g;

    /* JADX INFO: renamed from: h */
    public OnCompletionListener2 f1506h;

    /* JADX INFO: renamed from: i */
    public OnBufferUpdateListener f1507i;

    /* JADX INFO: renamed from: j */
    public OnSeekCompletionListener f1508j;

    /* JADX INFO: renamed from: k */
    public OnErrorListener2 f1509k;

    /* JADX INFO: renamed from: l */
    public MetadataListener f1510l;

    /* JADX INFO: renamed from: m */
    public AnalyticsListener2 f1511m;

    /* JADX INFO: renamed from: n */
    public WeakReference<ClearableSurface> f1512n;

    /* JADX INFO: renamed from: o */
    public boolean f1513o;

    /* JADX INFO: renamed from: p */
    public boolean f1514p;

    /* JADX INFO: renamed from: q */
    public boolean f1515q;

    /* JADX INFO: renamed from: r */
    public final b f1516r;

    /* JADX INFO: renamed from: c.a.a.a.h.a$a */
    /* JADX INFO: compiled from: ListenerMux.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.h.a$b */
    /* JADX INFO: compiled from: ListenerMux.kt */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public abstract void mo1007a(ExoMediaPlayer exoMediaPlayer, Exception exc);

        /* JADX INFO: renamed from: b */
        public abstract void mo1008b();

        /* JADX INFO: renamed from: c */
        public void mo1009c() {
        }

        /* JADX INFO: renamed from: d */
        public void mo1089d(boolean z) {
        }

        /* JADX INFO: renamed from: e */
        public void mo1090e() {
        }

        /* JADX INFO: renamed from: f */
        public void mo1091f(int i, int i2, int i3, float f) {
        }

        /* JADX INFO: renamed from: g */
        public abstract boolean mo1010g(long j2);
    }

    static {
        new a(null);
    }

    public ListenerMux(b bVar) {
        Intrinsics2.m13089e(bVar, "muxNotifier");
        this.f1516r = bVar;
        this.f1504f = new Handler();
        this.f1512n = new WeakReference<>(null);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: A */
    public void mo1028A(AnalyticsListener2.a aVar, Metadata metadata) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(metadata, "metadata");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1028A(aVar, metadata);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: B */
    public void mo1029B(AnalyticsListener2.a aVar, int i) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1029B(aVar, i);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void mo1030C(Player2 player2, AnalyticsListener2.b bVar) {
        AnalyticsListener.m3490j(this, player2, bVar);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: D */
    public void mo1031D(AnalyticsListener2.a aVar, boolean z, int i) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1031D(aVar, z, i);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: E */
    public void mo1032E(AnalyticsListener2.a aVar, int i) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1032E(aVar, i);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: F */
    public void mo1033F(AnalyticsListener2.a aVar, Format format) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(format, "format");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1033F(aVar, format);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: G */
    public void mo1034G(AnalyticsListener2.a aVar) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1034G(aVar);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: H */
    public void mo1035H(AnalyticsListener2.a aVar, Format format) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(format, "format");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1035H(aVar, format);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: I */
    public void mo1036I(AnalyticsListener2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(loadEventInfo, "loadEventInfo");
        Intrinsics2.m13089e(mediaLoadData, "mediaLoadData");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1036I(aVar, loadEventInfo, mediaLoadData);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: J */
    public void mo1037J(AnalyticsListener2.a aVar, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(trackGroupArray, "trackGroups");
        Intrinsics2.m13089e(trackSelectionArray, "trackSelections");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1037J(aVar, trackGroupArray, trackSelectionArray);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: K */
    public void mo1038K(AnalyticsListener2.a aVar, long j2) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1038K(aVar, j2);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: L */
    public void mo1039L(AnalyticsListener2.a aVar, boolean z) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1039L(aVar, z);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: M */
    public void mo1040M(AnalyticsListener2.a aVar, MediaLoadData mediaLoadData) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(mediaLoadData, "mediaLoadData");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1040M(aVar, mediaLoadData);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: N */
    public void mo1041N(AnalyticsListener2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(loadEventInfo, "loadEventInfo");
        Intrinsics2.m13089e(mediaLoadData, "mediaLoadData");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1041N(aVar, loadEventInfo, mediaLoadData);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: O */
    public void mo1042O(AnalyticsListener2.a aVar, MediaLoadData mediaLoadData) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(mediaLoadData, "mediaLoadData");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1042O(aVar, mediaLoadData);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: P */
    public void mo1043P(AnalyticsListener2.a aVar, int i, long j2) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1043P(aVar, i, j2);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void mo1044Q(AnalyticsListener2.a aVar, Exception exc) {
        AnalyticsListener.m3485e(this, aVar, exc);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: R */
    public void mo1045R(AnalyticsListener2.a aVar, boolean z) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1045R(aVar, z);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void mo1046S(AnalyticsListener2.a aVar, String str) {
        AnalyticsListener.m3481a(this, aVar, str);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: T */
    public void mo1047T(AnalyticsListener2.a aVar, boolean z, int i) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1047T(aVar, z, i);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void mo1048U(AnalyticsListener2.a aVar, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.m3497q(this, aVar, format, decoderReuseEvaluation);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: V */
    public void mo1049V(AnalyticsListener2.a aVar, int i) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1049V(aVar, i);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: W */
    public void mo1050W(AnalyticsListener2.a aVar, String str, long j2) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(str, "decoderName");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1050W(aVar, str, j2);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: X */
    public void mo1051X(AnalyticsListener2.a aVar) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1051X(aVar);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: Y */
    public void mo1052Y(AnalyticsListener2.a aVar, MediaItem2 mediaItem2, int i) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1052Y(aVar, mediaItem2, i);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: Z */
    public void mo1053Z(AnalyticsListener2.a aVar, Surface surface) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1053Z(aVar, surface);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p019h.MetadataListener
    /* JADX INFO: renamed from: a */
    public void mo1054a(Metadata metadata) {
        Intrinsics2.m13089e(metadata, "metadata");
        MetadataListener metadataListener = this.f1510l;
        if (metadataListener != null) {
            metadataListener.mo1054a(metadata);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void mo1055a0(AnalyticsListener2.a aVar, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.m3483c(this, aVar, format, decoderReuseEvaluation);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p019h.ExoPlayerListener
    /* JADX INFO: renamed from: b */
    public void mo1056b(int i, int i2, int i3, float f) {
        this.f1516r.mo1091f(i, i2, i3, f);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p019h.ExoPlayerListener
    /* JADX INFO: renamed from: b0 */
    public void mo1057b0(ExoMediaPlayer exoMediaPlayer, Exception exc) {
        Intrinsics2.m13089e(exoMediaPlayer, "exoMediaPlayer");
        this.f1516r.mo1008b();
        this.f1516r.mo1007a(exoMediaPlayer, exc);
        OnErrorListener2 onErrorListener2 = this.f1509k;
        if (onErrorListener2 != null) {
            onErrorListener2.mo1206f(exc);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: c */
    public void mo1058c(AnalyticsListener2.a aVar, int i, long j2, long j3) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1058c(aVar, i, j2, j3);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: c0 */
    public void mo1059c0(AnalyticsListener2.a aVar, int i, DecoderCounters decoderCounters) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(decoderCounters, "decoderCounters");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1059c0(aVar, i, decoderCounters);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: d */
    public void mo1060d(AnalyticsListener2.a aVar, int i, int i2, int i3, float f) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1060d(aVar, i, i2, i3, f);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void mo1061d0(AnalyticsListener2.a aVar, List list) {
        AnalyticsListener.m3493m(this, aVar, list);
    }

    @Override // p007c.p008a.p009a.p010a.p027i.OnBufferUpdateListener
    /* JADX INFO: renamed from: e */
    public void mo1062e(int i) {
        Objects.requireNonNull(this.f1516r);
        OnBufferUpdateListener onBufferUpdateListener = this.f1507i;
        if (onBufferUpdateListener != null) {
            onBufferUpdateListener.mo1062e(i);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: e0 */
    public void mo1063e0(AnalyticsListener2.a aVar) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1063e0(aVar);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void mo1064f(AnalyticsListener2.a aVar, String str) {
        AnalyticsListener.m3494n(this, aVar, str);
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: f0 */
    public void mo1065f0(AnalyticsListener2.a aVar, boolean z) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1065f0(aVar, z);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: g */
    public void mo1066g(AnalyticsListener2.a aVar, int i, Format format) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(format, "format");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1066g(aVar, i, format);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: g0 */
    public void mo1067g0(AnalyticsListener2.a aVar, DecoderCounters decoderCounters) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(decoderCounters, "counters");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1067g0(aVar, decoderCounters);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: h */
    public void mo1068h(AnalyticsListener2.a aVar, long j2, int i) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1068h(aVar, j2, i);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: h0 */
    public void mo1069h0(AnalyticsListener2.a aVar) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1069h0(aVar);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: i */
    public void mo1070i(AnalyticsListener2.a aVar) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1070i(aVar);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: i0 */
    public void mo1071i0(AnalyticsListener2.a aVar, ExoPlaybackException exoPlaybackException) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(exoPlaybackException, "error");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1071i0(aVar, exoPlaybackException);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: j */
    public void mo1072j(AnalyticsListener2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(loadEventInfo, "loadEventInfo");
        Intrinsics2.m13089e(mediaLoadData, "mediaLoadData");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1072j(aVar, loadEventInfo, mediaLoadData);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: k */
    public void mo1073k(AnalyticsListener2.a aVar, int i, String str, long j2) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(str, "decoderName");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1073k(aVar, i, str, j2);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: l */
    public void mo1074l(AnalyticsListener2.a aVar, int i) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1074l(aVar, i);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: m */
    public void mo1075m(AnalyticsListener2.a aVar, Exception exc) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(exc, "error");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1075m(aVar, exc);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: n */
    public void mo1076n(AnalyticsListener2.a aVar) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1076n(aVar);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: o */
    public void mo1077o(AnalyticsListener2.a aVar) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1077o(aVar);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        Intrinsics2.m13089e(mediaPlayer, "mp");
        Objects.requireNonNull(this.f1516r);
        OnBufferUpdateListener onBufferUpdateListener = this.f1507i;
        if (onBufferUpdateListener != null) {
            onBufferUpdateListener.mo1062e(i);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        Intrinsics2.m13089e(mediaPlayer, "mp");
        OnCompletionListener2 onCompletionListener2 = this.f1506h;
        if (onCompletionListener2 != null) {
            onCompletionListener2.mo1205g();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics2.m13089e(mediaPlayer, "mp");
        NativeMediaPlaybackException nativeMediaPlaybackException = new NativeMediaPlaybackException(i, i2);
        OnErrorListener2 onErrorListener2 = this.f1509k;
        return onErrorListener2 != null && onErrorListener2.mo1206f(nativeMediaPlaybackException);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        Intrinsics2.m13089e(mediaPlayer, "mp");
        this.f1513o = true;
        this.f1504f.post(new ListenerMux3(this));
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        Intrinsics2.m13089e(mediaPlayer, "mp");
        OnSeekCompletionListener onSeekCompletionListener = this.f1508j;
        if (onSeekCompletionListener != null) {
            onSeekCompletionListener.mo1081s();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: p */
    public void mo1078p(AnalyticsListener2.a aVar, int i) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1078p(aVar, i);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: q */
    public void mo1079q(AnalyticsListener2.a aVar, PlaybackParameters playbackParameters) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(playbackParameters, "playbackParameters");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1079q(aVar, playbackParameters);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: r */
    public void mo1080r(AnalyticsListener2.a aVar, int i, long j2, long j3) {
        Intrinsics2.m13089e(aVar, "eventTime");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1080r(aVar, i, j2, j3);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p027i.OnSeekCompletionListener
    /* JADX INFO: renamed from: s */
    public void mo1081s() {
        this.f1516r.mo1090e();
        OnSeekCompletionListener onSeekCompletionListener = this.f1508j;
        if (onSeekCompletionListener != null) {
            onSeekCompletionListener.mo1081s();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: t */
    public void mo1082t(AnalyticsListener2.a aVar, DecoderCounters decoderCounters) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(decoderCounters, "counters");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1082t(aVar, decoderCounters);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: u */
    public void mo1083u(AnalyticsListener2.a aVar, DecoderCounters decoderCounters) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(decoderCounters, "counters");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1083u(aVar, decoderCounters);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p019h.ExoPlayerListener
    /* JADX INFO: renamed from: v */
    public void mo1084v(boolean z, int i) {
        if (i == 1) {
            if (this.f1515q) {
                this.f1515q = false;
                ClearableSurface clearableSurface = this.f1512n.get();
                if (clearableSurface != null) {
                    clearableSurface.mo1163e();
                    this.f1512n = new WeakReference<>(null);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            if (!this.f1513o) {
                this.f1513o = true;
                this.f1504f.post(new ListenerMux3(this));
            }
            if (z) {
                this.f1516r.mo1089d(false);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        this.f1516r.mo1008b();
        if (this.f1514p || !this.f1516r.mo1010g(1000L)) {
            return;
        }
        this.f1514p = true;
        this.f1504f.post(new ListenerMux2(this));
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: w */
    public void mo1085w(AnalyticsListener2.a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(loadEventInfo, "loadEventInfo");
        Intrinsics2.m13089e(mediaLoadData, "mediaLoadData");
        Intrinsics2.m13089e(iOException, "error");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1085w(aVar, loadEventInfo, mediaLoadData, iOException, z);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: x */
    public void mo1086x(AnalyticsListener2.a aVar, int i, DecoderCounters decoderCounters) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(decoderCounters, "decoderCounters");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1086x(aVar, i, decoderCounters);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: y */
    public void mo1087y(AnalyticsListener2.a aVar, DecoderCounters decoderCounters) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(decoderCounters, "counters");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1087y(aVar, decoderCounters);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2
    /* JADX INFO: renamed from: z */
    public void mo1088z(AnalyticsListener2.a aVar, String str, long j2) {
        Intrinsics2.m13089e(aVar, "eventTime");
        Intrinsics2.m13089e(str, "decoderName");
        AnalyticsListener2 analyticsListener2 = this.f1511m;
        if (analyticsListener2 != null) {
            analyticsListener2.mo1088z(aVar, str, j2);
        }
    }
}
