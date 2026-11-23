package p636z0.p667e.p668a.p670e;

import android.content.Context;
import android.media.CamcorderProfile;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat;
import p636z0.p667e.p676b.CameraUnavailableException;
import p636z0.p667e.p676b.p677v1.CameraDeviceSurfaceManager;
import p636z0.p667e.p676b.p677v1.p678r1.MainThreadAsyncHandler;

/* JADX INFO: renamed from: z0.e.a.e.t0, reason: use source file name */
/* JADX INFO: compiled from: Camera2DeviceSurfaceManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class Camera2DeviceSurfaceManager implements CameraDeviceSurfaceManager {

    /* JADX INFO: renamed from: a */
    public final Map<String, SupportedSurfaceCombination> f35681a;

    /* JADX INFO: renamed from: b */
    public final CamcorderProfileHelper f35682b;

    public Camera2DeviceSurfaceManager(Context context, Object obj, Set<String> set) throws CameraUnavailableException {
        C7618a c7618a = new CamcorderProfileHelper() { // from class: z0.e.a.e.a
            @Override // p636z0.p667e.p668a.p670e.CamcorderProfileHelper
            /* JADX INFO: renamed from: a */
            public final boolean mo15077a(int i, int i2) {
                return CamcorderProfile.hasProfile(i, i2);
            }
        };
        this.f35681a = new HashMap();
        this.f35682b = c7618a;
        CameraManagerCompat cameraManagerCompatM15213a = obj instanceof CameraManagerCompat ? (CameraManagerCompat) obj : CameraManagerCompat.m15213a(context, MainThreadAsyncHandler.m15419a());
        Objects.requireNonNull(context);
        for (String str : set) {
            this.f35681a.put(str, new SupportedSurfaceCombination(context, str, cameraManagerCompatM15213a, this.f35682b));
        }
    }
}
