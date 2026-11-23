package p636z0.p667e.p668a.p670e.p671w1.p673p;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p636z0.p667e.p676b.p677v1.Quirk;
import p636z0.p667e.p676b.p677v1.Quirks;

/* JADX INFO: renamed from: z0.e.a.e.w1.p.d, reason: use source file name */
/* JADX INFO: compiled from: DeviceQuirks.java */
/* JADX INFO: loaded from: classes.dex */
public class DeviceQuirks {

    /* JADX INFO: renamed from: a */
    public static final Quirks f35819a;

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    static {
        boolean z;
        ArrayList arrayList = new ArrayList();
        String str = Build.MANUFACTURER;
        if (!("Google".equals(str) && "Pixel 2".equals(Build.MODEL))) {
            if (!("Google".equals(str) && "Pixel 3".equals(Build.MODEL))) {
                z = false;
            } else if (Build.VERSION.SDK_INT >= 26) {
                z = true;
            } else {
                z = false;
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        List<String> list = SamsungPreviewTargetAspectRatioQuirk.f35824a;
        String str2 = Build.BRAND;
        if ("SAMSUNG".equals(str2.toUpperCase()) && SamsungPreviewTargetAspectRatioQuirk.f35824a.contains(Build.MODEL.toUpperCase())) {
            arrayList.add(new SamsungPreviewTargetAspectRatioQuirk());
        }
        List<String> list2 = Nexus4AndroidLTargetAspectRatioQuirk.f35822a;
        if ("GOOGLE".equals(str2.toUpperCase()) && Build.VERSION.SDK_INT < 23 && Nexus4AndroidLTargetAspectRatioQuirk.f35822a.contains(Build.MODEL.toUpperCase())) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (ExcludedSupportedSizesQuirk.m15239a() || ExcludedSupportedSizesQuirk.m15240b()) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        if ("SAMSUNG".equals(str.toUpperCase()) && Build.MODEL.toUpperCase().startsWith("SM-A300")) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        List<String> list3 = PreviewPixelHDRnetQuirk.f35823a;
        if ("Google".equals(str) && PreviewPixelHDRnetQuirk.f35823a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        Locale locale = Locale.US;
        if ("SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716")) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        f35819a = new Quirks(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Quirk> T m15238a(Class<T> cls) {
        return (T) f35819a.m15353a(cls);
    }
}
