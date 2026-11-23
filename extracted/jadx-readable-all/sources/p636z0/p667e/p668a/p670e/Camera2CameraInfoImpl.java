package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.C7462a;
import p636z0.p667e.p668a.p670e.p671w1.CameraCharacteristicsCompat;
import p636z0.p667e.p668a.p675f.Camera2CameraInfo;
import p636z0.p667e.p676b.Logger8;
import p636z0.p667e.p676b.p677v1.CameraInfoInternal;
import p636z0.p667e.p676b.p677v1.Quirks;

/* JADX INFO: renamed from: z0.e.a.e.p0, reason: use source file name */
/* JADX INFO: compiled from: Camera2CameraInfoImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class Camera2CameraInfoImpl implements CameraInfoInternal {

    /* JADX INFO: renamed from: a */
    public final String f35632a;

    /* JADX INFO: renamed from: b */
    public final CameraCharacteristicsCompat f35633b;

    /* JADX INFO: renamed from: c */
    public final Object f35634c = new Object();

    /* JADX INFO: renamed from: d */
    public Camera2CameraControlImpl f35635d;

    /* JADX INFO: renamed from: e */
    public final Quirks f35636e;

    public Camera2CameraInfoImpl(String str, CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Objects.requireNonNull(str);
        this.f35632a = str;
        this.f35633b = cameraCharacteristicsCompat;
        new Camera2CameraInfo(this);
        this.f35636e = C7462a.m14571h(cameraCharacteristicsCompat);
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraInfoInternal
    /* JADX INFO: renamed from: a */
    public String mo15183a() {
        return this.f35632a;
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraInfoInternal
    /* JADX INFO: renamed from: b */
    public Integer mo15184b() {
        Integer num = (Integer) this.f35633b.m15209a(CameraCharacteristics.LENS_FACING);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            return iIntValue != 1 ? null : 1;
        }
        return 0;
    }

    @Override // p636z0.p667e.p676b.CameraInfo
    /* JADX INFO: renamed from: c */
    public int mo15185c(int i) {
        Integer num = (Integer) this.f35633b.m15209a(CameraCharacteristics.SENSOR_ORIENTATION);
        Objects.requireNonNull(num);
        Integer numValueOf = Integer.valueOf(num.intValue());
        int iM14579p = C7462a.m14579p(i);
        Integer numMo15184b = mo15184b();
        return C7462a.m14572i(iM14579p, numValueOf.intValue(), numMo15184b != null && 1 == numMo15184b.intValue());
    }

    /* JADX INFO: renamed from: d */
    public int m15186d() {
        Integer num = (Integer) this.f35633b.m15209a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: e */
    public void m15187e(Camera2CameraControlImpl camera2CameraControlImpl) {
        String strM1590l;
        synchronized (this.f35634c) {
            this.f35635d = camera2CameraControlImpl;
        }
        int iM15186d = m15186d();
        boolean z = true;
        if (iM15186d == 0) {
            strM1590l = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iM15186d == 1) {
            strM1590l = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iM15186d == 2) {
            strM1590l = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iM15186d != 3) {
            strM1590l = iM15186d != 4 ? outline.m1590l("Unknown value: ", iM15186d) : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else {
            strM1590l = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        }
        String strM1599u = outline.m1599u("Device Level: ", strM1590l);
        if (Logger8.f35916a > 4 && !Log.isLoggable(Logger8.m15275d("Camera2CameraInfo"), 4)) {
            z = false;
        }
        if (z) {
            Log.i(Logger8.m15275d("Camera2CameraInfo"), strM1599u, null);
        }
    }
}
