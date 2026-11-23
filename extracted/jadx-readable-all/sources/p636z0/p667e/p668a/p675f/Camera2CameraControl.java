package p636z0.p667e.p668a.p675f;

import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.Executor;
import p636z0.p667e.p668a.p669d.Camera2ImplConfig;
import p636z0.p667e.p668a.p670e.Camera2CameraControlImpl;
import p636z0.p667e.p668a.p670e.RunnableC7619a0;
import p636z0.p667e.p676b.CameraControl;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.TagBundle;
import p636z0.p693h.p694a.CallbackToFutureAdapter;

/* JADX INFO: renamed from: z0.e.a.f.h, reason: use source file name */
/* JADX INFO: compiled from: Camera2CameraControl.java */
/* JADX INFO: loaded from: classes.dex */
public final class Camera2CameraControl {

    /* JADX INFO: renamed from: c */
    public final Camera2CameraControlImpl f35846c;

    /* JADX INFO: renamed from: d */
    public final Executor f35847d;

    /* JADX INFO: renamed from: g */
    public CallbackToFutureAdapter<Void> f35850g;

    /* JADX INFO: renamed from: a */
    public boolean f35844a = false;

    /* JADX INFO: renamed from: b */
    public boolean f35845b = false;

    /* JADX INFO: renamed from: e */
    public final Object f35848e = new Object();

    /* JADX INFO: renamed from: f */
    public Camera2ImplConfig.a f35849f = new Camera2ImplConfig.a();

    /* JADX INFO: renamed from: h */
    public final Camera2CameraControlImpl.c f35851h = new Camera2CameraControlImpl.c() { // from class: z0.e.a.f.c
        /* JADX WARN: Code duplicated, block: B:11:0x0036  */
        @Override // p636z0.p667e.p668a.p670e.Camera2CameraControlImpl.c
        /* JADX INFO: renamed from: a */
        public final boolean mo15133a(TotalCaptureResult totalCaptureResult) {
            CallbackToFutureAdapter<Void> callbackToFutureAdapter;
            Integer num;
            Camera2CameraControl camera2CameraControl = this.f35837a;
            if (camera2CameraControl.f35850g != null) {
                Object tag = totalCaptureResult.getRequest().getTag();
                if ((tag instanceof TagBundle) && (num = ((TagBundle) tag).f36213b.get("Camera2CameraControl")) != null && num.equals(Integer.valueOf(camera2CameraControl.f35850g.hashCode()))) {
                    callbackToFutureAdapter = camera2CameraControl.f35850g;
                    camera2CameraControl.f35850g = null;
                } else {
                    callbackToFutureAdapter = null;
                }
            } else {
                callbackToFutureAdapter = null;
            }
            if (callbackToFutureAdapter == null) {
                return false;
            }
            callbackToFutureAdapter.m15659a(null);
            return false;
        }
    };

    public Camera2CameraControl(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor) {
        this.f35846c = camera2CameraControlImpl;
        this.f35847d = executor;
    }

    /* JADX INFO: renamed from: a */
    public Camera2ImplConfig m15242a() {
        Camera2ImplConfig camera2ImplConfigM15072c;
        synchronized (this.f35848e) {
            CallbackToFutureAdapter<Void> callbackToFutureAdapter = this.f35850g;
            if (callbackToFutureAdapter != null) {
                this.f35849f.f35421a.m15436A(Camera2ImplConfig.f35420x, Config3.c.OPTIONAL, Integer.valueOf(callbackToFutureAdapter.hashCode()));
            }
            camera2ImplConfigM15072c = this.f35849f.m15072c();
        }
        return camera2ImplConfigM15072c;
    }

    /* JADX INFO: renamed from: b */
    public final void m15243b(CallbackToFutureAdapter<Void> callbackToFutureAdapter) {
        this.f35845b = true;
        CallbackToFutureAdapter<Void> callbackToFutureAdapter2 = this.f35850g;
        if (callbackToFutureAdapter2 == null) {
            callbackToFutureAdapter2 = null;
        }
        this.f35850g = callbackToFutureAdapter;
        if (this.f35844a) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.f35846c;
            camera2CameraControlImpl.f35527c.execute(new RunnableC7619a0(camera2CameraControlImpl));
            this.f35845b = false;
        }
        if (callbackToFutureAdapter2 != null) {
            callbackToFutureAdapter2.m15661c(new CameraControl("Camera2CameraControl was updated with new options."));
        }
    }
}
