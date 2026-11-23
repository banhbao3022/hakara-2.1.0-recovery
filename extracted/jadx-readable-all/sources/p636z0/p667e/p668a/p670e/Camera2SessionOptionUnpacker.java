package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import java.util.Iterator;
import java.util.Objects;
import p636z0.p667e.p668a.p669d.Camera2ImplConfig;
import p636z0.p667e.p668a.p669d.CameraEventCallbacks;
import p636z0.p667e.p668a.p675f.CaptureRequestOptions;
import p636z0.p667e.p676b.p677v1.CaptureConfig;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.OptionsBundle;
import p636z0.p667e.p676b.p677v1.SessionConfig;
import p636z0.p667e.p676b.p677v1.UseCaseConfig2;

/* JADX INFO: renamed from: z0.e.a.e.u0, reason: use source file name */
/* JADX INFO: compiled from: Camera2SessionOptionUnpacker.java */
/* JADX INFO: loaded from: classes.dex */
public final class Camera2SessionOptionUnpacker implements SessionConfig.d {

    /* JADX INFO: renamed from: a */
    public static final Camera2SessionOptionUnpacker f35691a = new Camera2SessionOptionUnpacker();

    @Override // p636z0.p667e.p676b.p677v1.SessionConfig.d
    /* JADX INFO: renamed from: a */
    public void mo15200a(UseCaseConfig2<?> useCaseConfig2, SessionConfig.b bVar) {
        SessionConfig sessionConfigMo15109j = useCaseConfig2.mo15109j(null);
        Config3 config3 = OptionsBundle.f36110r;
        int i = SessionConfig.m15370a().f36164f.f36145e;
        if (sessionConfigMo15109j != null) {
            i = sessionConfigMo15109j.f36164f.f36145e;
            Iterator<CameraDevice.StateCallback> it = sessionConfigMo15109j.f36160b.iterator();
            while (it.hasNext()) {
                bVar.m15374b(it.next());
            }
            Iterator<CameraCaptureSession.StateCallback> it2 = sessionConfigMo15109j.f36161c.iterator();
            while (it2.hasNext()) {
                bVar.m15375c(it2.next());
            }
            bVar.f36166b.m15363a(sessionConfigMo15109j.f36164f.f36146f);
            config3 = sessionConfigMo15109j.f36164f.f36144d;
        }
        CaptureConfig.a aVar = bVar.f36166b;
        Objects.requireNonNull(aVar);
        aVar.f36150b = MutableOptionsBundle.m15435z(config3);
        Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(useCaseConfig2);
        bVar.f36166b.f36151c = ((Integer) camera2ImplConfig.f35852r.mo15105d(Camera2ImplConfig.f35415s, Integer.valueOf(i))).intValue();
        bVar.m15374b((CameraDevice.StateCallback) camera2ImplConfig.f35852r.mo15105d(Camera2ImplConfig.f35416t, new CameraDeviceStateCallbacks()));
        bVar.m15375c((CameraCaptureSession.StateCallback) camera2ImplConfig.f35852r.mo15105d(Camera2ImplConfig.f35417u, new CameraCaptureSessionStateCallbacks2()));
        CaptureCallbackContainer captureCallbackContainer = new CaptureCallbackContainer((CameraCaptureSession.CaptureCallback) camera2ImplConfig.f35852r.mo15105d(Camera2ImplConfig.f35418v, new Camera2CaptureCallbacks2()));
        bVar.f36166b.m15364b(captureCallbackContainer);
        bVar.f36170f.add(captureCallbackContainer);
        MutableOptionsBundle mutableOptionsBundleM15434y = MutableOptionsBundle.m15434y();
        Config3.a<CameraEventCallbacks> aVar2 = Camera2ImplConfig.f35419w;
        mutableOptionsBundleM15434y.m15436A(aVar2, Config3.c.OPTIONAL, (CameraEventCallbacks) camera2ImplConfig.f35852r.mo15105d(aVar2, CameraEventCallbacks.m15074d()));
        bVar.f36166b.m15365c(mutableOptionsBundleM15434y);
        bVar.f36166b.m15365c(CaptureRequestOptions.a.m15244d(camera2ImplConfig.f35852r).m15245c());
    }
}
