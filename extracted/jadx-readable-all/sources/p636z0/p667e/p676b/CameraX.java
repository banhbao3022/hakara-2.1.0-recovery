package p636z0.p667e.p676b;

import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback;
import p636z0.p693h.p694a.CallbackToFutureAdapter;

/* JADX INFO: renamed from: z0.e.b.u0, reason: use source file name */
/* JADX INFO: compiled from: CameraX.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraX implements FutureCallback<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CallbackToFutureAdapter f36030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraX2 f36031b;

    public CameraX(CallbackToFutureAdapter callbackToFutureAdapter, CameraX2 cameraX2) {
        this.f36030a = callbackToFutureAdapter;
        this.f36031b = cameraX2;
    }

    @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
    /* JADX INFO: renamed from: a */
    public void mo15090a(Void r2) {
        this.f36030a.m15659a(null);
    }

    @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
    /* JADX INFO: renamed from: b */
    public void mo15091b(Throwable th) {
        Logger8.m15276e("CameraX", "CameraX initialize() failed", th);
        synchronized (CameraX2.f36313a) {
            if (CameraX2.f36314b == this.f36031b) {
                CameraX2.m15441f();
            }
        }
        this.f36030a.m15661c(th);
    }
}
