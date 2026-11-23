package p636z0.p667e.p676b.p677v1;

import java.util.Objects;
import p636z0.p667e.p676b.CameraFilter;

/* JADX INFO: renamed from: z0.e.b.v1.u, reason: use source file name */
/* JADX INFO: compiled from: CameraConfig.java */
/* JADX INFO: loaded from: classes.dex */
public interface CameraConfig extends ReadableConfig2 {
    static {
        Objects.requireNonNull("camerax.core.camera.cameraFilter", "Null id");
        Objects.requireNonNull(CameraFilter.class, "Null valueClass");
        Objects.requireNonNull("camerax.core.camera.useCaseConfigFactory", "Null id");
        Objects.requireNonNull(UseCaseConfigFactory.class, "Null valueClass");
    }
}
