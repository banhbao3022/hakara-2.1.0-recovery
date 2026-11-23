package p636z0.p644b.p653h;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import p636z0.p644b.p648e.p649a.DrawableWrapper;
import p636z0.p725k.p729e.p730l.WrappedDrawable;

/* JADX INFO: renamed from: z0.b.h.e0, reason: use source file name */
/* JADX INFO: compiled from: DrawableUtils.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class DrawableUtils {

    /* JADX INFO: renamed from: a */
    public static final int[] f35013a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f35014b = new int[0];

    static {
        new Rect();
        try {
            Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static boolean m14885a(Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof WrappedDrawable) {
                return m14885a(((WrappedDrawable) drawable).mo16197b());
            }
            if (drawable instanceof DrawableWrapper) {
                return m14885a(((DrawableWrapper) drawable).f34658f);
            }
            if (drawable instanceof ScaleDrawable) {
                return m14885a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m14885a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m14886b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(f35013a);
            } else {
                drawable.setState(f35014b);
            }
            drawable.setState(state);
        }
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m14887c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
