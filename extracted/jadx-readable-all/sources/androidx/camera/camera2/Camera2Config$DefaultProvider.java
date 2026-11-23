package androidx.camera.camera2;

import android.content.Context;
import java.util.Set;
import p636z0.p667e.p668a.C7612a;
import p636z0.p667e.p668a.C7613b;
import p636z0.p667e.p668a.C7614c;
import p636z0.p667e.p668a.p670e.Camera2CameraFactory;
import p636z0.p667e.p668a.p670e.Camera2DeviceSurfaceManager;
import p636z0.p667e.p668a.p670e.Camera2UseCaseConfigFactory;
import p636z0.p667e.p676b.CameraSelector;
import p636z0.p667e.p676b.CameraUnavailableException;
import p636z0.p667e.p676b.CameraXConfig;
import p636z0.p667e.p676b.InitializationException;
import p636z0.p667e.p676b.p677v1.CameraDeviceSurfaceManager;
import p636z0.p667e.p676b.p677v1.CameraFactory;
import p636z0.p667e.p676b.p677v1.CameraThreadConfig;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.OptionsBundle;
import p636z0.p667e.p676b.p677v1.UseCaseConfigFactory;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2Config$DefaultProvider implements CameraXConfig.b {
    @Override // p636z0.p667e.p676b.CameraXConfig.b
    public CameraXConfig getCameraXConfig() {
        C7614c c7614c = new CameraFactory.a() { // from class: z0.e.a.c
            @Override // p636z0.p667e.p676b.p677v1.CameraFactory.a
            /* JADX INFO: renamed from: a */
            public final CameraFactory mo15070a(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector) {
                return new Camera2CameraFactory(context, cameraThreadConfig, cameraSelector);
            }
        };
        C7613b c7613b = new CameraDeviceSurfaceManager.a() { // from class: z0.e.a.b
            @Override // p636z0.p667e.p676b.p677v1.CameraDeviceSurfaceManager.a
            /* JADX INFO: renamed from: a */
            public final CameraDeviceSurfaceManager mo15069a(Context context, Object obj, Set set) throws InitializationException {
                try {
                    return new Camera2DeviceSurfaceManager(context, obj, set);
                } catch (CameraUnavailableException e) {
                    throw new InitializationException(e);
                }
            }
        };
        C7612a c7612a = new UseCaseConfigFactory.b() { // from class: z0.e.a.a
            @Override // p636z0.p667e.p676b.p677v1.UseCaseConfigFactory.b
            /* JADX INFO: renamed from: a */
            public final UseCaseConfigFactory mo15068a(Context context) {
                return new Camera2UseCaseConfigFactory(context);
            }
        };
        CameraXConfig.a aVar = new CameraXConfig.a();
        MutableOptionsBundle mutableOptionsBundle = aVar.f36363a;
        Config3.a<CameraFactory.a> aVar2 = CameraXConfig.f36355r;
        Config3.c cVar = Config3.c.OPTIONAL;
        mutableOptionsBundle.m15436A(aVar2, cVar, c7614c);
        aVar.f36363a.m15436A(CameraXConfig.f36356s, cVar, c7613b);
        aVar.f36363a.m15436A(CameraXConfig.f36357t, cVar, c7612a);
        return new CameraXConfig(OptionsBundle.m15339x(aVar.f36363a));
    }
}
