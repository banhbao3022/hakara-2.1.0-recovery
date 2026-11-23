package p636z0.p667e.p676b.p677v1;

import android.view.Surface;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;

/* JADX INFO: renamed from: z0.e.b.v1.u0, reason: use source file name */
/* JADX INFO: compiled from: ImmediateSurface.java */
/* JADX INFO: loaded from: classes.dex */
public final class ImmediateSurface extends DeferrableSurface {

    /* JADX INFO: renamed from: i */
    public final Surface f36305i;

    public ImmediateSurface(Surface surface) {
        this.f36305i = surface;
    }

    @Override // p636z0.p667e.p676b.p677v1.DeferrableSurface
    /* JADX INFO: renamed from: g */
    public ListenableFuture<Surface> mo15288g() {
        return Futures2.m15428c(this.f36305i);
    }
}
