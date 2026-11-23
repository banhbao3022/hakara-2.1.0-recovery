package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import java.util.concurrent.Executor;
import p636z0.p667e.p668a.p670e.p671w1.CameraCharacteristicsCompat;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: z0.e.a.e.t1, reason: use source file name */
/* JADX INFO: compiled from: TorchControl.java */
/* JADX INFO: loaded from: classes.dex */
public final class TorchControl {

    /* JADX INFO: renamed from: a */
    public final Camera2CameraControlImpl f35683a;

    /* JADX INFO: renamed from: b */
    public final MutableLiveData<Integer> f35684b;

    /* JADX INFO: renamed from: c */
    public final Executor f35685c;

    /* JADX INFO: renamed from: d */
    public boolean f35686d;

    /* JADX INFO: renamed from: e */
    public final Camera2CameraControlImpl.c f35687e;

    /* JADX INFO: renamed from: z0.e.a.e.t1$a */
    /* JADX INFO: compiled from: TorchControl.java */
    public class a implements Camera2CameraControlImpl.c {
        public a() {
        }

        @Override // p636z0.p667e.p668a.p670e.Camera2CameraControlImpl.c
        /* JADX INFO: renamed from: a */
        public boolean mo15133a(TotalCaptureResult totalCaptureResult) {
            Objects.requireNonNull(TorchControl.this);
            return false;
        }
    }

    public TorchControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        a aVar = new a();
        this.f35687e = aVar;
        this.f35683a = camera2CameraControlImpl;
        this.f35685c = executor;
        Boolean bool = (Boolean) cameraCharacteristicsCompat.m15209a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool != null) {
            bool.booleanValue();
        }
        this.f35684b = new MutableLiveData<>(0);
        camera2CameraControlImpl.f35526b.f35545a.add(aVar);
    }
}
