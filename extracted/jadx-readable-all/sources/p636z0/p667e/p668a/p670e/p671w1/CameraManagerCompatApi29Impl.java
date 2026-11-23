package p636z0.p667e.p668a.p670e.p671w1;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.e.a.e.w1.m, reason: use source file name */
/* JADX INFO: compiled from: CameraManagerCompatApi29Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraManagerCompatApi29Impl extends CameraManagerCompatApi28Impl {
    public CameraManagerCompatApi29Impl(Context context) {
        super(context);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompatApi28Impl, p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat.b
    /* JADX INFO: renamed from: c */
    public CameraCharacteristics mo15218c(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f35794a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            Set<Integer> set = CameraAccessExceptionCompat.f35712f;
            throw new CameraAccessExceptionCompat(e);
        }
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompatApi28Impl, p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat.b
    /* JADX INFO: renamed from: d */
    public void mo15219d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f35794a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            Set<Integer> set = CameraAccessExceptionCompat.f35712f;
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
