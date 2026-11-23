package p636z0.p685e0;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: z0.e0.s, reason: use source file name */
/* JADX INFO: compiled from: ViewGroupUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewGroupUtils {

    /* JADX INFO: renamed from: a */
    public static boolean f36499a = true;

    /* JADX INFO: renamed from: a */
    public static void m15529a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f36499a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f36499a = false;
            }
        }
    }
}
