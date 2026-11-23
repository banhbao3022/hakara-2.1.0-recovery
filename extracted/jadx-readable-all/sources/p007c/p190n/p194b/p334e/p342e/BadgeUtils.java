package p007c.p190n.p194b.p334e.p342e;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: c.n.b.e.e.b, reason: use source file name */
/* JADX INFO: compiled from: BadgeUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class BadgeUtils {
    /* JADX INFO: renamed from: a */
    public static void m11104a(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        m11106c(badgeDrawable, view, null);
        if (badgeDrawable.m11094d() != null) {
            badgeDrawable.m11094d().setForeground(badgeDrawable);
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11105b(BadgeDrawable badgeDrawable, View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (badgeDrawable.m11094d() != null) {
            badgeDrawable.m11094d().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11106c(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.m11102l(view, frameLayout);
    }
}
