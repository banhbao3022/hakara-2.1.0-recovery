package p007c.p190n.p194b.p209b.p262y1;

import java.util.List;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p210a2.BandwidthMeter;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.p245u0.Chunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunkIterator;

/* JADX INFO: renamed from: c.n.b.b.y1.h, reason: use source file name */
/* JADX INFO: compiled from: ExoTrackSelection.java */
/* JADX INFO: loaded from: classes.dex */
public interface ExoTrackSelection2 extends TrackSelection {

    /* JADX INFO: renamed from: c.n.b.b.y1.h$a */
    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final TrackGroup f10333a;

        /* JADX INFO: renamed from: b */
        public final int[] f10334b;

        /* JADX INFO: renamed from: c */
        public final int f10335c;

        /* JADX INFO: renamed from: d */
        public final Object f10336d;

        public a(TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0, null);
        }

        public a(TrackGroup trackGroup, int[] iArr, int i, Object obj) {
            this.f10333a = trackGroup;
            this.f10334b = iArr;
            this.f10335c = i;
            this.f10336d = obj;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.y1.h$b */
    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        ExoTrackSelection2[] mo4511a(a[] aVarArr, BandwidthMeter bandwidthMeter, MediaSource2.a aVar, Timeline timeline);
    }

    /* JADX INFO: renamed from: b */
    int mo4302b();

    /* JADX INFO: renamed from: c */
    boolean mo4513c(int i, long j2);

    /* JADX INFO: renamed from: d */
    boolean mo4514d(long j2, Chunk chunk, List<? extends MediaChunk> list);

    /* JADX INFO: renamed from: e */
    void mo4515e(boolean z);

    /* JADX INFO: renamed from: g */
    void mo4506g();

    /* JADX INFO: renamed from: h */
    void mo4507h();

    /* JADX INFO: renamed from: j */
    int mo4508j(long j2, List<? extends MediaChunk> list);

    /* JADX INFO: renamed from: l */
    void mo4303l(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr);

    /* JADX INFO: renamed from: m */
    int mo4519m();

    /* JADX INFO: renamed from: n */
    Format mo4520n();

    /* JADX INFO: renamed from: o */
    int mo4304o();

    /* JADX INFO: renamed from: p */
    void mo4509p(float f);

    /* JADX INFO: renamed from: q */
    Object mo4305q();

    /* JADX INFO: renamed from: r */
    void mo4521r();

    /* JADX INFO: renamed from: s */
    void mo4522s();
}
