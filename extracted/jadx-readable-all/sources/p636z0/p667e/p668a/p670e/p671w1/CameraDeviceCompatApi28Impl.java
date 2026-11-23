package p636z0.p667e.p668a.p670e.p671w1;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.Objects;
import p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat;

/* JADX INFO: renamed from: z0.e.a.e.w1.i, reason: use source file name */
/* JADX INFO: compiled from: CameraDeviceCompatApi28Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraDeviceCompatApi28Impl extends CameraDeviceCompatApi24Impl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraDeviceCompatApi28Impl(CameraDevice cameraDevice) {
        super(cameraDevice, null);
        Objects.requireNonNull(cameraDevice);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraDeviceCompatApi24Impl, p636z0.p667e.p668a.p670e.p671w1.CameraDeviceCompatApi23Impl, p636z0.p667e.p668a.p670e.p671w1.CameraDeviceCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.CameraDeviceCompat.a
    /* JADX INFO: renamed from: a */
    public void mo15210a(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessException {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) sessionConfigurationCompat.f35811a.mo15233c();
        Objects.requireNonNull(sessionConfiguration);
        this.f35780a.createCaptureSession(sessionConfiguration);
    }
}
