package p636z0.p667e.p668a.p670e.p671w1;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.e.a.e.w1.l, reason: use source file name */
/* JADX INFO: compiled from: CameraManagerCompatApi28Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraManagerCompatApi28Impl extends CameraManagerCompatBaseImpl {
    public CameraManagerCompatApi28Impl(Context context) {
        super(context, null);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat.b
    /* JADX INFO: renamed from: a */
    public void mo15216a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f35794a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat.b
    /* JADX INFO: renamed from: b */
    public void mo15217b(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f35794a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat.b
    /* JADX INFO: renamed from: c */
    public CameraCharacteristics mo15218c(String str) throws CameraAccessExceptionCompat {
        try {
            try {
                return this.f35794a.getCameraCharacteristics(str);
            } catch (CameraAccessException e) {
                Set<Integer> set = CameraAccessExceptionCompat.f35712f;
                throw new CameraAccessExceptionCompat(e);
            }
        } catch (RuntimeException e2) {
            if (m15220e(e2)) {
                throw new CameraAccessExceptionCompat(10001, e2);
            }
            throw e2;
        }
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat.b
    /* JADX INFO: renamed from: d */
    public void mo15219d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f35794a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            Set<Integer> set = CameraAccessExceptionCompat.f35712f;
            throw new CameraAccessExceptionCompat(e);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (SecurityException e3) {
        } catch (RuntimeException e4) {
            if (!m15220e(e4)) {
                throw e4;
            }
            throw new CameraAccessExceptionCompat(10001, e4);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15220e(Throwable th) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            return (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName());
        }
        return false;
    }
}
