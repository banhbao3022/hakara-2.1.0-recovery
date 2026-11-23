package p636z0.p707j.p708b;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: z0.j.b.b, reason: use source file name */
/* JADX INFO: compiled from: ViewGroupUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewGroupUtils2 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Matrix> f37215a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<RectF> f37216b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static void m15873a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m15873a(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
