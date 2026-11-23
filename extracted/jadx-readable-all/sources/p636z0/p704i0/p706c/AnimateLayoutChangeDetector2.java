package p636z0.p704i0.p706c;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: z0.i0.c.b, reason: use source file name */
/* JADX INFO: compiled from: AnimateLayoutChangeDetector.java */
/* JADX INFO: loaded from: classes.dex */
public final class AnimateLayoutChangeDetector2 {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.MarginLayoutParams f37187a;

    /* JADX INFO: renamed from: b */
    public LinearLayoutManager f37188b;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f37187a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public AnimateLayoutChangeDetector2(LinearLayoutManager linearLayoutManager) {
        this.f37188b = linearLayoutManager;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15864a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m15864a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
