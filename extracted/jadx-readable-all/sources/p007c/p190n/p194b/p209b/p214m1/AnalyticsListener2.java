package p007c.p190n.p194b.p209b.p214m1;

import android.util.SparseArray;
import android.view.Surface;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import p007c.p190n.p194b.p209b.ExoPlaybackException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.PlaybackParameters;
import p007c.p190n.p194b.p209b.Player2;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p212b2.MutableFlags;
import p007c.p190n.p194b.p209b.p217p1.DecoderCounters;
import p007c.p190n.p194b.p209b.p217p1.DecoderReuseEvaluation;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;
import p007c.p190n.p194b.p209b.p243w1.MediaLoadData;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p262y1.TrackSelectionArray;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.b.m1.b1, reason: use source file name */
/* JADX INFO: compiled from: AnalyticsListener.java */
/* JADX INFO: loaded from: classes.dex */
public interface AnalyticsListener2 {

    /* JADX INFO: renamed from: c.n.b.b.m1.b1$a */
    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f6776a;

        /* JADX INFO: renamed from: b */
        public final Timeline f6777b;

        /* JADX INFO: renamed from: c */
        public final int f6778c;

        /* JADX INFO: renamed from: d */
        public final MediaSource2.a f6779d;

        /* JADX INFO: renamed from: e */
        public final long f6780e;

        /* JADX INFO: renamed from: f */
        public final Timeline f6781f;

        /* JADX INFO: renamed from: g */
        public final int f6782g;

        /* JADX INFO: renamed from: h */
        public final MediaSource2.a f6783h;

        /* JADX INFO: renamed from: i */
        public final long f6784i;

        /* JADX INFO: renamed from: j */
        public final long f6785j;

        public a(long j2, Timeline timeline, int i, MediaSource2.a aVar, long j3, Timeline timeline2, int i2, MediaSource2.a aVar2, long j4, long j5) {
            this.f6776a = j2;
            this.f6777b = timeline;
            this.f6778c = i;
            this.f6779d = aVar;
            this.f6780e = j3;
            this.f6781f = timeline2;
            this.f6782g = i2;
            this.f6783h = aVar2;
            this.f6784i = j4;
            this.f6785j = j5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6776a == aVar.f6776a && this.f6778c == aVar.f6778c && this.f6780e == aVar.f6780e && this.f6782g == aVar.f6782g && this.f6784i == aVar.f6784i && this.f6785j == aVar.f6785j && C4799a.m10952C(this.f6777b, aVar.f6777b) && C4799a.m10952C(this.f6779d, aVar.f6779d) && C4799a.m10952C(this.f6781f, aVar.f6781f) && C4799a.m10952C(this.f6783h, aVar.f6783h);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f6776a), this.f6777b, Integer.valueOf(this.f6778c), this.f6779d, Long.valueOf(this.f6780e), this.f6781f, Integer.valueOf(this.f6782g), this.f6783h, Long.valueOf(this.f6784i), Long.valueOf(this.f6785j)});
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.m1.b1$b */
    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class b extends MutableFlags {

        /* JADX INFO: renamed from: b */
        public final SparseArray<a> f6786b = new SparseArray<>(0);
    }

    /* JADX INFO: renamed from: A */
    void mo1028A(a aVar, Metadata metadata);

    /* JADX INFO: renamed from: B */
    void mo1029B(a aVar, int i);

    /* JADX INFO: renamed from: C */
    void mo1030C(Player2 player2, b bVar);

    @Deprecated
    /* JADX INFO: renamed from: D */
    void mo1031D(a aVar, boolean z, int i);

    /* JADX INFO: renamed from: E */
    void mo1032E(a aVar, int i);

    @Deprecated
    /* JADX INFO: renamed from: F */
    void mo1033F(a aVar, Format format);

    /* JADX INFO: renamed from: G */
    void mo1034G(a aVar);

    @Deprecated
    /* JADX INFO: renamed from: H */
    void mo1035H(a aVar, Format format);

    /* JADX INFO: renamed from: I */
    void mo1036I(a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* JADX INFO: renamed from: J */
    void mo1037J(a aVar, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);

    /* JADX INFO: renamed from: K */
    void mo1038K(a aVar, long j2);

    /* JADX INFO: renamed from: L */
    void mo1039L(a aVar, boolean z);

    /* JADX INFO: renamed from: M */
    void mo1040M(a aVar, MediaLoadData mediaLoadData);

    /* JADX INFO: renamed from: N */
    void mo1041N(a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* JADX INFO: renamed from: O */
    void mo1042O(a aVar, MediaLoadData mediaLoadData);

    /* JADX INFO: renamed from: P */
    void mo1043P(a aVar, int i, long j2);

    /* JADX INFO: renamed from: Q */
    void mo1044Q(a aVar, Exception exc);

    /* JADX INFO: renamed from: R */
    void mo1045R(a aVar, boolean z);

    /* JADX INFO: renamed from: S */
    void mo1046S(a aVar, String str);

    /* JADX INFO: renamed from: T */
    void mo1047T(a aVar, boolean z, int i);

    /* JADX INFO: renamed from: U */
    void mo1048U(a aVar, Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    /* JADX INFO: renamed from: V */
    void mo1049V(a aVar, int i);

    /* JADX INFO: renamed from: W */
    void mo1050W(a aVar, String str, long j2);

    /* JADX INFO: renamed from: X */
    void mo1051X(a aVar);

    /* JADX INFO: renamed from: Y */
    void mo1052Y(a aVar, MediaItem2 mediaItem2, int i);

    /* JADX INFO: renamed from: Z */
    void mo1053Z(a aVar, Surface surface);

    /* JADX INFO: renamed from: a0 */
    void mo1055a0(a aVar, Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    /* JADX INFO: renamed from: c */
    void mo1058c(a aVar, int i, long j2, long j3);

    @Deprecated
    /* JADX INFO: renamed from: c0 */
    void mo1059c0(a aVar, int i, DecoderCounters decoderCounters);

    /* JADX INFO: renamed from: d */
    void mo1060d(a aVar, int i, int i2, int i3, float f);

    /* JADX INFO: renamed from: d0 */
    void mo1061d0(a aVar, List<Metadata> list);

    /* JADX INFO: renamed from: e0 */
    void mo1063e0(a aVar);

    /* JADX INFO: renamed from: f */
    void mo1064f(a aVar, String str);

    /* JADX INFO: renamed from: f0 */
    void mo1065f0(a aVar, boolean z);

    @Deprecated
    /* JADX INFO: renamed from: g */
    void mo1066g(a aVar, int i, Format format);

    /* JADX INFO: renamed from: g0 */
    void mo1067g0(a aVar, DecoderCounters decoderCounters);

    /* JADX INFO: renamed from: h */
    void mo1068h(a aVar, long j2, int i);

    /* JADX INFO: renamed from: h0 */
    void mo1069h0(a aVar);

    @Deprecated
    /* JADX INFO: renamed from: i */
    void mo1070i(a aVar);

    /* JADX INFO: renamed from: i0 */
    void mo1071i0(a aVar, ExoPlaybackException exoPlaybackException);

    /* JADX INFO: renamed from: j */
    void mo1072j(a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    @Deprecated
    /* JADX INFO: renamed from: k */
    void mo1073k(a aVar, int i, String str, long j2);

    /* JADX INFO: renamed from: l */
    void mo1074l(a aVar, int i);

    /* JADX INFO: renamed from: m */
    void mo1075m(a aVar, Exception exc);

    /* JADX INFO: renamed from: n */
    void mo1076n(a aVar);

    /* JADX INFO: renamed from: o */
    void mo1077o(a aVar);

    /* JADX INFO: renamed from: p */
    void mo1078p(a aVar, int i);

    /* JADX INFO: renamed from: q */
    void mo1079q(a aVar, PlaybackParameters playbackParameters);

    /* JADX INFO: renamed from: r */
    void mo1080r(a aVar, int i, long j2, long j3);

    /* JADX INFO: renamed from: t */
    void mo1082t(a aVar, DecoderCounters decoderCounters);

    /* JADX INFO: renamed from: u */
    void mo1083u(a aVar, DecoderCounters decoderCounters);

    /* JADX INFO: renamed from: w */
    void mo1085w(a aVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z);

    @Deprecated
    /* JADX INFO: renamed from: x */
    void mo1086x(a aVar, int i, DecoderCounters decoderCounters);

    /* JADX INFO: renamed from: y */
    void mo1087y(a aVar, DecoderCounters decoderCounters);

    /* JADX INFO: renamed from: z */
    void mo1088z(a aVar, String str, long j2);
}
