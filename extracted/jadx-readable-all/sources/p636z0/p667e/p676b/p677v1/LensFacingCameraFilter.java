package p636z0.p667e.p676b.p677v1;

import java.util.ArrayList;
import java.util.List;
import p636z0.p667e.p676b.CameraFilter;
import p636z0.p667e.p676b.CameraInfo;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.b.v1.v0, reason: use source file name */
/* JADX INFO: compiled from: LensFacingCameraFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class LensFacingCameraFilter implements CameraFilter {

    /* JADX INFO: renamed from: a */
    public int f36308a;

    public LensFacingCameraFilter(int i) {
        this.f36308a = i;
    }

    @Override // p636z0.p667e.p676b.CameraFilter
    /* JADX INFO: renamed from: a */
    public List<CameraInfo> mo15294a(List<CameraInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (CameraInfo cameraInfo : list) {
            C8162a.m16061f(cameraInfo instanceof CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            Integer numMo15184b = ((CameraInfoInternal) cameraInfo).mo15184b();
            if (numMo15184b != null && numMo15184b.intValue() == this.f36308a) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }
}
