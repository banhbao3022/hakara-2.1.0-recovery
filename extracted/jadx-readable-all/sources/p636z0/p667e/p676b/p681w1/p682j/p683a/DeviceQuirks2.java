package p636z0.p667e.p676b.p681w1.p682j.p683a;

import android.os.Build;
import java.util.ArrayList;
import java.util.Locale;
import p636z0.p667e.p676b.p677v1.Quirks;

/* JADX INFO: renamed from: z0.e.b.w1.j.a.a, reason: use source file name */
/* JADX INFO: compiled from: DeviceQuirks.java */
/* JADX INFO: loaded from: classes.dex */
public class DeviceQuirks2 {

    /* JADX INFO: renamed from: a */
    public static final Quirks f36352a;

    static {
        ArrayList arrayList = new ArrayList();
        if (IncompleteCameraListQuirk.f36353a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
            arrayList.add(new IncompleteCameraListQuirk());
        }
        String str = Build.BRAND;
        boolean z = true;
        if (!("HUAWEI".equalsIgnoreCase(str) && "SNE-LX1".equalsIgnoreCase(Build.MODEL))) {
            if (!("HONOR".equalsIgnoreCase(str) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
                z = false;
            }
        }
        if (z) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        f36352a = new Quirks(arrayList);
    }
}
