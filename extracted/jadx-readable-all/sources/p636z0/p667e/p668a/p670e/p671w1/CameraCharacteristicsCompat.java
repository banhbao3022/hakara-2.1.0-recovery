package p636z0.p667e.p668a.p670e.p671w1;

import android.hardware.camera2.CameraCharacteristics;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: z0.e.a.e.w1.e, reason: use source file name */
/* JADX INFO: compiled from: CameraCharacteristicsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraCharacteristicsCompat {

    /* JADX INFO: renamed from: a */
    public final Map<CameraCharacteristics.Key<?>, Object> f35766a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final CameraCharacteristics f35767b;

    public CameraCharacteristicsCompat(CameraCharacteristics cameraCharacteristics) {
        this.f35767b = cameraCharacteristics;
    }

    /* JADX INFO: renamed from: a */
    public <T> T m15209a(CameraCharacteristics.Key<T> key) {
        synchronized (this) {
            T t = (T) this.f35766a.get(key);
            if (t != null) {
                return t;
            }
            T t2 = (T) this.f35767b.get(key);
            if (t2 != null) {
                this.f35766a.put((CameraCharacteristics.Key<?>) key, t2);
            }
            return t2;
        }
    }
}
