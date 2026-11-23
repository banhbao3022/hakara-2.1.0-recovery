package p007c.p190n.p194b.p209b.p243w1.p250x0;

import p007c.p190n.p194b.p209b.p210a2.LoaderErrorThrower;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource;
import p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifest;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;

/* JADX INFO: renamed from: c.n.b.b.w1.x0.d, reason: use source file name */
/* JADX INFO: compiled from: SsChunkSource.java */
/* JADX INFO: loaded from: classes.dex */
public interface SsChunkSource extends ChunkSource {

    /* JADX INFO: renamed from: c.n.b.b.w1.x0.d$a */
    /* JADX INFO: compiled from: SsChunkSource.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        SsChunkSource mo4370a(LoaderErrorThrower loaderErrorThrower, SsManifest ssManifest, int i, ExoTrackSelection2 exoTrackSelection2, TransferListener transferListener);
    }

    /* JADX INFO: renamed from: b */
    void mo4368b(ExoTrackSelection2 exoTrackSelection2);

    /* JADX INFO: renamed from: d */
    void mo4369d(SsManifest ssManifest);
}
