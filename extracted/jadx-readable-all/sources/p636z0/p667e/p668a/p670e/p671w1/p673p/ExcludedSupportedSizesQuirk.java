package p636z0.p667e.p668a.p670e.p671w1.p673p;

import android.os.Build;
import p636z0.p667e.p676b.p677v1.Quirk;

/* JADX INFO: renamed from: z0.e.a.e.w1.p.e, reason: use source file name */
/* JADX INFO: compiled from: ExcludedSupportedSizesQuirk.java */
/* JADX INFO: loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements Quirk {
    /* JADX INFO: renamed from: a */
    public static boolean m15239a() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15240b() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }
}
