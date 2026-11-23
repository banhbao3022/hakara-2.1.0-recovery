package p007c.p190n.p194b.p209b;

import java.util.List;
import p007c.p190n.p194b.p209b.p212b2.MutableFlags;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p262y1.TrackSelectionArray;

/* JADX INFO: renamed from: c.n.b.b.d1, reason: use source file name */
/* JADX INFO: compiled from: Player.java */
/* JADX INFO: loaded from: classes.dex */
public interface Player2 {

    /* JADX INFO: renamed from: c.n.b.b.d1$a */
    /* JADX INFO: compiled from: Player.java */
    public interface a {
        @Deprecated
        /* JADX INFO: renamed from: C */
        void mo1098C(Timeline timeline, Object obj, int i);

        /* JADX INFO: renamed from: D */
        void mo1099D(int i);

        /* JADX INFO: renamed from: E */
        void mo1100E(MediaItem2 mediaItem2, int i);

        /* JADX INFO: renamed from: O */
        void mo1101O(boolean z, int i);

        /* JADX INFO: renamed from: Q */
        void mo1102Q(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);

        /* JADX INFO: renamed from: S */
        void mo1103S(PlaybackParameters playbackParameters);

        /* JADX INFO: renamed from: U */
        void mo1104U(boolean z);

        /* JADX INFO: renamed from: Z */
        void mo1105Z(boolean z);

        /* JADX INFO: renamed from: a */
        void mo1106a(int i);

        @Deprecated
        /* JADX INFO: renamed from: c */
        void mo1108c(boolean z);

        /* JADX INFO: renamed from: d */
        void mo1109d(int i);

        /* JADX INFO: renamed from: h */
        void mo1113h(List<Metadata> list);

        /* JADX INFO: renamed from: j */
        void mo1114j(ExoPlaybackException exoPlaybackException);

        /* JADX INFO: renamed from: m */
        void mo1117m(boolean z);

        @Deprecated
        /* JADX INFO: renamed from: o */
        void mo1119o();

        /* JADX INFO: renamed from: q */
        void mo1121q(Timeline timeline, int i);

        /* JADX INFO: renamed from: s */
        void mo1123s(int i);

        /* JADX INFO: renamed from: w */
        void mo1126w(Player2 player2, b bVar);

        /* JADX INFO: renamed from: y */
        void mo1127y(boolean z);

        @Deprecated
        /* JADX INFO: renamed from: z */
        void mo1128z(boolean z, int i);
    }

    /* JADX INFO: renamed from: c.n.b.b.d1$b */
    /* JADX INFO: compiled from: Player.java */
    public static final class b extends MutableFlags {
    }

    /* JADX INFO: renamed from: P */
    int mo3329P();

    /* JADX INFO: renamed from: b */
    PlaybackParameters mo3330b();

    /* JADX INFO: renamed from: c */
    boolean mo3331c();

    /* JADX INFO: renamed from: d */
    long mo3332d();

    /* JADX INFO: renamed from: e */
    void mo3333e(int i, long j2);

    /* JADX INFO: renamed from: f */
    boolean mo3334f();

    /* JADX INFO: renamed from: g */
    int mo2882g();

    long getCurrentPosition();

    long getDuration();

    /* JADX INFO: renamed from: h */
    int mo3335h();

    /* JADX INFO: renamed from: i */
    int mo3336i();

    /* JADX INFO: renamed from: j */
    int mo3337j();

    /* JADX INFO: renamed from: k */
    void mo3338k(boolean z);

    /* JADX INFO: renamed from: l */
    long mo3339l();

    /* JADX INFO: renamed from: m */
    int mo2883m();

    /* JADX INFO: renamed from: n */
    int mo3340n();

    /* JADX INFO: renamed from: o */
    int mo2884o();

    /* JADX INFO: renamed from: p */
    Timeline mo3341p();

    void prepare();

    void release();

    void setRepeatMode(int i);

    void stop();

    /* JADX INFO: renamed from: x */
    void mo2885x(long j2);
}
