package p636z0.p644b.p653h;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p636z0.p644b.C7463b;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.p729e.ColorUtils;

/* JADX INFO: renamed from: z0.b.h.t0, reason: use source file name */
/* JADX INFO: compiled from: ThemeUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ThemeUtils {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f35197a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final int[] f35198b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f35199c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f35200d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f35201e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f35202f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f35203g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m14962a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C7463b.f34394j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m14963b(Context context, int i) {
        ColorStateList colorStateListM14965d = m14965d(context, i);
        if (colorStateListM14965d != null && colorStateListM14965d.isStateful()) {
            return colorStateListM14965d.getColorForState(f35198b, colorStateListM14965d.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f35197a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM14964c = m14964c(context, i);
        return ColorUtils.m16165d(iM14964c, Math.round(Color.alpha(iM14964c) * f));
    }

    /* JADX INFO: renamed from: c */
    public static int m14964c(Context context, int i) {
        int[] iArr = f35203g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m14965d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f35203g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AppCompatResources.m14706a(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
