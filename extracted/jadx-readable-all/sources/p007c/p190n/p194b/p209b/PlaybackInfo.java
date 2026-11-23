package p007c.p190n.p194b.p209b;

import java.util.List;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p262y1.TrackSelectorResult;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.RegularImmutableList;

/* JADX INFO: renamed from: c.n.b.b.a1, reason: use source file name */
/* JADX INFO: compiled from: PlaybackInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackInfo {

    /* JADX INFO: renamed from: a */
    public static final MediaSource2.a f5928a = new MediaSource2.a(new Object());

    /* JADX INFO: renamed from: b */
    public final Timeline f5929b;

    /* JADX INFO: renamed from: c */
    public final MediaSource2.a f5930c;

    /* JADX INFO: renamed from: d */
    public final long f5931d;

    /* JADX INFO: renamed from: e */
    public final int f5932e;

    /* JADX INFO: renamed from: f */
    public final ExoPlaybackException f5933f;

    /* JADX INFO: renamed from: g */
    public final boolean f5934g;

    /* JADX INFO: renamed from: h */
    public final TrackGroupArray f5935h;

    /* JADX INFO: renamed from: i */
    public final TrackSelectorResult f5936i;

    /* JADX INFO: renamed from: j */
    public final List<Metadata> f5937j;

    /* JADX INFO: renamed from: k */
    public final MediaSource2.a f5938k;

    /* JADX INFO: renamed from: l */
    public final boolean f5939l;

    /* JADX INFO: renamed from: m */
    public final int f5940m;

    /* JADX INFO: renamed from: n */
    public final PlaybackParameters f5941n;

    /* JADX INFO: renamed from: o */
    public final boolean f5942o;

    /* JADX INFO: renamed from: p */
    public final boolean f5943p;

    /* JADX INFO: renamed from: q */
    public volatile long f5944q;

    /* JADX INFO: renamed from: r */
    public volatile long f5945r;

    /* JADX INFO: renamed from: s */
    public volatile long f5946s;

    public PlaybackInfo(Timeline timeline, MediaSource2.a aVar, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List<Metadata> list, MediaSource2.a aVar2, boolean z2, int i2, PlaybackParameters playbackParameters, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.f5929b = timeline;
        this.f5930c = aVar;
        this.f5931d = j2;
        this.f5932e = i;
        this.f5933f = exoPlaybackException;
        this.f5934g = z;
        this.f5935h = trackGroupArray;
        this.f5936i = trackSelectorResult;
        this.f5937j = list;
        this.f5938k = aVar2;
        this.f5939l = z2;
        this.f5940m = i2;
        this.f5941n = playbackParameters;
        this.f5944q = j3;
        this.f5945r = j4;
        this.f5946s = j5;
        this.f5942o = z3;
        this.f5943p = z4;
    }

    /* JADX INFO: renamed from: i */
    public static PlaybackInfo m2886i(TrackSelectorResult trackSelectorResult) {
        Timeline timeline = Timeline.f6743a;
        MediaSource2.a aVar = f5928a;
        TrackGroupArray trackGroupArray = TrackGroupArray.f9067f;
        AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
        return new PlaybackInfo(timeline, aVar, -9223372036854775807L, 1, null, false, trackGroupArray, trackSelectorResult, RegularImmutableList.f26218h, aVar, false, 0, PlaybackParameters.f6259a, 0L, 0L, 0L, false, false);
    }

    /* JADX INFO: renamed from: a */
    public PlaybackInfo m2887a(MediaSource2.a aVar) {
        return new PlaybackInfo(this.f5929b, this.f5930c, this.f5931d, this.f5932e, this.f5933f, this.f5934g, this.f5935h, this.f5936i, this.f5937j, aVar, this.f5939l, this.f5940m, this.f5941n, this.f5944q, this.f5945r, this.f5946s, this.f5942o, this.f5943p);
    }

    /* JADX INFO: renamed from: b */
    public PlaybackInfo m2888b(MediaSource2.a aVar, long j2, long j3, long j4, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List<Metadata> list) {
        return new PlaybackInfo(this.f5929b, aVar, j3, this.f5932e, this.f5933f, this.f5934g, trackGroupArray, trackSelectorResult, list, this.f5938k, this.f5939l, this.f5940m, this.f5941n, this.f5944q, j4, j2, this.f5942o, this.f5943p);
    }

    /* JADX INFO: renamed from: c */
    public PlaybackInfo m2889c(boolean z) {
        return new PlaybackInfo(this.f5929b, this.f5930c, this.f5931d, this.f5932e, this.f5933f, this.f5934g, this.f5935h, this.f5936i, this.f5937j, this.f5938k, this.f5939l, this.f5940m, this.f5941n, this.f5944q, this.f5945r, this.f5946s, z, this.f5943p);
    }

    /* JADX INFO: renamed from: d */
    public PlaybackInfo m2890d(boolean z, int i) {
        return new PlaybackInfo(this.f5929b, this.f5930c, this.f5931d, this.f5932e, this.f5933f, this.f5934g, this.f5935h, this.f5936i, this.f5937j, this.f5938k, z, i, this.f5941n, this.f5944q, this.f5945r, this.f5946s, this.f5942o, this.f5943p);
    }

    /* JADX INFO: renamed from: e */
    public PlaybackInfo m2891e(ExoPlaybackException exoPlaybackException) {
        return new PlaybackInfo(this.f5929b, this.f5930c, this.f5931d, this.f5932e, exoPlaybackException, this.f5934g, this.f5935h, this.f5936i, this.f5937j, this.f5938k, this.f5939l, this.f5940m, this.f5941n, this.f5944q, this.f5945r, this.f5946s, this.f5942o, this.f5943p);
    }

    /* JADX INFO: renamed from: f */
    public PlaybackInfo m2892f(PlaybackParameters playbackParameters) {
        return new PlaybackInfo(this.f5929b, this.f5930c, this.f5931d, this.f5932e, this.f5933f, this.f5934g, this.f5935h, this.f5936i, this.f5937j, this.f5938k, this.f5939l, this.f5940m, playbackParameters, this.f5944q, this.f5945r, this.f5946s, this.f5942o, this.f5943p);
    }

    /* JADX INFO: renamed from: g */
    public PlaybackInfo m2893g(int i) {
        return new PlaybackInfo(this.f5929b, this.f5930c, this.f5931d, i, this.f5933f, this.f5934g, this.f5935h, this.f5936i, this.f5937j, this.f5938k, this.f5939l, this.f5940m, this.f5941n, this.f5944q, this.f5945r, this.f5946s, this.f5942o, this.f5943p);
    }

    /* JADX INFO: renamed from: h */
    public PlaybackInfo m2894h(Timeline timeline) {
        return new PlaybackInfo(timeline, this.f5930c, this.f5931d, this.f5932e, this.f5933f, this.f5934g, this.f5935h, this.f5936i, this.f5937j, this.f5938k, this.f5939l, this.f5940m, this.f5941n, this.f5944q, this.f5945r, this.f5946s, this.f5942o, this.f5943p);
    }
}
