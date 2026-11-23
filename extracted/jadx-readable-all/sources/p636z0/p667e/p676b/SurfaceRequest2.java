package p636z0.p667e.p676b;

import android.view.Surface;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback;
import p636z0.p725k.C8162a;
import p636z0.p725k.p738k.Consumer2;

/* JADX INFO: renamed from: z0.e.b.r1, reason: use source file name */
/* JADX INFO: compiled from: SurfaceRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class SurfaceRequest2 implements FutureCallback<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Consumer2 f36006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Surface f36007b;

    public SurfaceRequest2(SurfaceRequest surfaceRequest, Consumer2 consumer2, Surface surface) {
        this.f36006a = consumer2;
        this.f36007b = surface;
    }

    @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
    /* JADX INFO: renamed from: a */
    public void mo15090a(Void r4) {
        this.f36006a.mo2060a(new AutoValue_SurfaceRequest_Result(0, this.f36007b));
    }

    @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
    /* JADX INFO: renamed from: b */
    public void mo15091b(Throwable th) {
        C8162a.m16065j(th instanceof SurfaceRequest.d, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
        this.f36006a.mo2060a(new AutoValue_SurfaceRequest_Result(1, this.f36007b));
    }
}
