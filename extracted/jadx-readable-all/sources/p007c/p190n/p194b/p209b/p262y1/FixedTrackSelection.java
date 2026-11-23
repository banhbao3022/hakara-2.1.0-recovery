package p007c.p190n.p194b.p209b.p262y1;

import java.util.List;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunkIterator;

/* JADX INFO: renamed from: c.n.b.b.y1.i, reason: use source file name */
/* JADX INFO: compiled from: FixedTrackSelection.java */
/* JADX INFO: loaded from: classes.dex */
public final class FixedTrackSelection extends BaseTrackSelection {

    /* JADX INFO: renamed from: g */
    public final int f10337g;

    /* JADX INFO: renamed from: h */
    public final Object f10338h;

    public FixedTrackSelection(TrackGroup trackGroup, int i) {
        this(trackGroup, i, 0, null);
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: b */
    public int mo4302b() {
        return 0;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: l */
    public void mo4303l(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: o */
    public int mo4304o() {
        return this.f10337g;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: q */
    public Object mo4305q() {
        return this.f10338h;
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i, int i2, Object obj) {
        super(trackGroup, i);
        this.f10337g = i2;
        this.f10338h = obj;
    }
}
