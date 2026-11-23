package p007c.p190n.p194b.p209b.p243w1.p246v0;

import java.util.List;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.LoaderErrorThrower;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSource;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.DashManifest;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.d, reason: use source file name */
/* JADX INFO: compiled from: DashChunkSource.java */
/* JADX INFO: loaded from: classes.dex */
public interface DashChunkSource extends ChunkSource {

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.d$a */
    /* JADX INFO: compiled from: DashChunkSource.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        DashChunkSource mo4226a(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, int i, int[] iArr, ExoTrackSelection2 exoTrackSelection2, int i2, long j2, boolean z, List<Format> list, PlayerEmsgHandler.c cVar, TransferListener transferListener);
    }

    /* JADX INFO: renamed from: b */
    void mo4224b(ExoTrackSelection2 exoTrackSelection2);

    /* JADX INFO: renamed from: g */
    void mo4225g(DashManifest dashManifest, int i);
}
