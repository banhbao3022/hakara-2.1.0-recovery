package p636z0.p667e.p676b.p681w1;

import p636z0.p667e.p668a.p670e.ZoomStateImpl;
import p636z0.p667e.p676b.ZoomState;

/* JADX INFO: renamed from: z0.e.b.w1.d, reason: use source file name */
/* JADX INFO: compiled from: ImmutableZoomState.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableZoomState implements ZoomState {
    /* JADX INFO: renamed from: a */
    public static ZoomState m15453a(ZoomState zoomState) {
        float f = ((ZoomStateImpl) zoomState).f35703a;
        ZoomStateImpl zoomStateImpl = (ZoomStateImpl) zoomState;
        return new AutoValue_ImmutableZoomState(f, zoomStateImpl.f35704b, zoomStateImpl.f35705c, zoomStateImpl.f35706d);
    }

    /* JADX INFO: renamed from: b */
    public abstract float mo15443b();

    /* JADX INFO: renamed from: c */
    public abstract float mo15444c();

    /* JADX INFO: renamed from: d */
    public abstract float mo15445d();

    /* JADX INFO: renamed from: e */
    public abstract float mo15446e();
}
