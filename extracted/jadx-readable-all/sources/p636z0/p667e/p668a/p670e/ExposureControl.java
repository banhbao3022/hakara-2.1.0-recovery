package p636z0.p667e.p668a.p670e;

import java.util.concurrent.Executor;
import p636z0.p667e.p668a.p670e.p671w1.CameraCharacteristicsCompat;

/* JADX INFO: renamed from: z0.e.a.e.h1, reason: use source file name */
/* JADX INFO: compiled from: ExposureControl.java */
/* JADX INFO: loaded from: classes.dex */
public class ExposureControl {

    /* JADX INFO: renamed from: a */
    public final Camera2CameraControlImpl f35487a;

    /* JADX INFO: renamed from: b */
    public final ExposureStateImpl f35488b;

    /* JADX INFO: renamed from: c */
    public final Executor f35489c;

    /* JADX INFO: renamed from: d */
    public boolean f35490d = false;

    public ExposureControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.f35487a = camera2CameraControlImpl;
        this.f35488b = new ExposureStateImpl(cameraCharacteristicsCompat, 0);
        this.f35489c = executor;
    }
}
