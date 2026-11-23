package p007c.p190n.p194b.p334e.p363w;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p636z0.p725k.p729e.ColorUtils;

/* JADX INFO: renamed from: c.n.b.e.w.a, reason: use source file name */
/* JADX INFO: compiled from: RippleUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class RippleUtils {

    /* JADX INFO: renamed from: a */
    public static final int[] f25542a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b */
    public static final int[] f25543b = {R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: c */
    public static final int[] f25544c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f25545d = {R.attr.state_hovered};

    /* JADX INFO: renamed from: e */
    public static final int[] f25546e = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: f */
    public static final int[] f25547f = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: g */
    public static final int[] f25548g = {R.attr.state_selected, R.attr.state_focused};

    /* JADX INFO: renamed from: h */
    public static final int[] f25549h = {R.attr.state_selected, R.attr.state_hovered};

    /* JADX INFO: renamed from: i */
    public static final int[] f25550i = {R.attr.state_selected};

    /* JADX INFO: renamed from: j */
    public static final int[] f25551j = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: k */
    public static final String f25552k = RippleUtils.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m11358a(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{f25550i, StateSet.NOTHING}, new int[]{m11359b(colorStateList, f25546e), m11359b(colorStateList, f25542a)});
    }

    /* JADX INFO: renamed from: b */
    public static int m11359b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return ColorUtils.m16165d(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m11360c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f25551j, 0)) != 0) {
            Log.w(f25552k, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11361d(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
