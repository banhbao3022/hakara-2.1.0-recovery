package p636z0.p667e.p668a.p670e.p671w1;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import p636z0.p667e.p668a.p670e.p671w1.p672o.InputConfigurationCompat;
import p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat;

/* JADX INFO: renamed from: z0.e.a.e.w1.g, reason: use source file name */
/* JADX INFO: compiled from: CameraDeviceCompatApi23Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraDeviceCompatApi23Impl extends CameraDeviceCompatBaseImpl {
    public CameraDeviceCompatApi23Impl(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraDeviceCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.CameraDeviceCompat.a
    /* JADX INFO: renamed from: a */
    public void mo15210a(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessException {
        CameraDeviceCompatBaseImpl.m15211b(this.f35780a, sessionConfigurationCompat);
        CameraCaptureSessionCompat.c cVar = new CameraCaptureSessionCompat.c(sessionConfigurationCompat.m15226a(), sessionConfigurationCompat.m15230e());
        List<Surface> listM15212c = CameraDeviceCompatBaseImpl.m15212c(sessionConfigurationCompat.m15228c());
        CameraDeviceCompatBaseImpl.a aVar = (CameraDeviceCompatBaseImpl.a) this.f35781b;
        Objects.requireNonNull(aVar);
        Handler handler = aVar.f35782a;
        InputConfigurationCompat inputConfigurationCompatM15227b = sessionConfigurationCompat.m15227b();
        if (inputConfigurationCompatM15227b != null) {
            InputConfiguration inputConfiguration = (InputConfiguration) inputConfigurationCompatM15227b.f35798a.mo15221a();
            Objects.requireNonNull(inputConfiguration);
            this.f35780a.createReprocessableCaptureSession(inputConfiguration, listM15212c, cVar, handler);
        } else if (sessionConfigurationCompat.m15229d() == 1) {
            this.f35780a.createConstrainedHighSpeedCaptureSession(listM15212c, cVar, handler);
        } else {
            this.f35780a.createCaptureSession(listM15212c, cVar, handler);
        }
    }
}
