package p636z0.p667e.p668a.p670e.p671w1;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.e.a.e.w1.n, reason: use source file name */
/* JADX INFO: compiled from: CameraManagerCompatBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraManagerCompatBaseImpl implements CameraManagerCompat.b {

    /* JADX INFO: renamed from: a */
    public final CameraManager f35794a;

    /* JADX INFO: renamed from: b */
    public final Object f35795b;

    /* JADX INFO: renamed from: z0.e.a.e.w1.n$a */
    /* JADX INFO: compiled from: CameraManagerCompatBaseImpl.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Map<CameraManager.AvailabilityCallback, CameraManagerCompat.a> f35796a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Handler f35797b;

        public a(Handler handler) {
            this.f35797b = handler;
        }
    }

    public CameraManagerCompatBaseImpl(Context context, Object obj) {
        this.f35794a = (CameraManager) context.getSystemService("camera");
        this.f35795b = obj;
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat.b
    /* JADX INFO: renamed from: a */
    public void mo15216a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        CameraManagerCompat.a aVar = null;
        a aVar2 = (a) this.f35795b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f35796a) {
                aVar = aVar2.f35796a.get(availabilityCallback);
                if (aVar == null) {
                    aVar = new CameraManagerCompat.a(executor, availabilityCallback);
                    aVar2.f35796a.put(availabilityCallback, aVar);
                }
            }
        }
        this.f35794a.registerAvailabilityCallback(aVar, aVar2.f35797b);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat.b
    /* JADX INFO: renamed from: b */
    public void mo15217b(CameraManager.AvailabilityCallback availabilityCallback) {
        CameraManagerCompat.a aVarRemove;
        if (availabilityCallback != null) {
            a aVar = (a) this.f35795b;
            synchronized (aVar.f35796a) {
                aVarRemove = aVar.f35796a.remove(availabilityCallback);
            }
        } else {
            aVarRemove = null;
        }
        if (aVarRemove != null) {
            synchronized (aVarRemove.f35787c) {
                aVarRemove.f35788d = true;
            }
        }
        this.f35794a.unregisterAvailabilityCallback(aVarRemove);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat.b
    /* JADX INFO: renamed from: c */
    public CameraCharacteristics mo15218c(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f35794a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            Set<Integer> set = CameraAccessExceptionCompat.f35712f;
            throw new CameraAccessExceptionCompat(e);
        }
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat.b
    /* JADX INFO: renamed from: d */
    public void mo15219d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        Objects.requireNonNull(executor);
        Objects.requireNonNull(stateCallback);
        try {
            this.f35794a.openCamera(str, new CameraDeviceCompat.b(executor, stateCallback), ((a) this.f35795b).f35797b);
        } catch (CameraAccessException e) {
            Set<Integer> set = CameraAccessExceptionCompat.f35712f;
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
