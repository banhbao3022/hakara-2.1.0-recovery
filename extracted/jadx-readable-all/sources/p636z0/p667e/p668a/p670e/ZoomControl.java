package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import java.util.concurrent.Executor;
import p636z0.p667e.p668a.p669d.Camera2ImplConfig;
import p636z0.p667e.p668a.p670e.p671w1.CameraCharacteristicsCompat;
import p636z0.p667e.p676b.ZoomState;
import p636z0.p667e.p676b.p681w1.ImmutableZoomState;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: z0.e.a.e.u1, reason: use source file name */
/* JADX INFO: compiled from: ZoomControl.java */
/* JADX INFO: loaded from: classes.dex */
public final class ZoomControl {

    /* JADX INFO: renamed from: a */
    public final Camera2CameraControlImpl f35692a;

    /* JADX INFO: renamed from: b */
    public final Executor f35693b;

    /* JADX INFO: renamed from: c */
    public final ZoomStateImpl f35694c;

    /* JADX INFO: renamed from: d */
    public final MutableLiveData<ZoomState> f35695d;

    /* JADX INFO: renamed from: e */
    public final b f35696e;

    /* JADX INFO: renamed from: f */
    public boolean f35697f = false;

    /* JADX INFO: renamed from: g */
    public Camera2CameraControlImpl.c f35698g = new a();

    /* JADX INFO: renamed from: z0.e.a.e.u1$a */
    /* JADX INFO: compiled from: ZoomControl.java */
    public class a implements Camera2CameraControlImpl.c {
        public a() {
        }

        @Override // p636z0.p667e.p668a.p670e.Camera2CameraControlImpl.c
        /* JADX INFO: renamed from: a */
        public boolean mo15133a(TotalCaptureResult totalCaptureResult) {
            ZoomControl.this.f35696e.mo15096a(totalCaptureResult);
            return false;
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.u1$b */
    /* JADX INFO: compiled from: ZoomControl.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo15096a(TotalCaptureResult totalCaptureResult);

        /* JADX INFO: renamed from: b */
        void mo15097b(Camera2ImplConfig.a aVar);

        /* JADX INFO: renamed from: c */
        float mo15098c();

        /* JADX INFO: renamed from: d */
        float mo15099d();

        /* JADX INFO: renamed from: e */
        void mo15100e();
    }

    public ZoomControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        boolean z = false;
        this.f35692a = camera2CameraControlImpl;
        this.f35693b = executor;
        if (Build.VERSION.SDK_INT >= 30 && cameraCharacteristicsCompat.m15209a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) != null) {
            z = true;
        }
        b androidRZoomImpl = z ? new AndroidRZoomImpl(cameraCharacteristicsCompat) : new CropRegionZoomImpl(cameraCharacteristicsCompat);
        this.f35696e = androidRZoomImpl;
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(androidRZoomImpl.mo15098c(), androidRZoomImpl.mo15099d());
        this.f35694c = zoomStateImpl;
        zoomStateImpl.m15202a(1.0f);
        this.f35695d = new MutableLiveData<>(ImmutableZoomState.m15453a(zoomStateImpl));
        camera2CameraControlImpl.m15121d(this.f35698g);
    }
}
