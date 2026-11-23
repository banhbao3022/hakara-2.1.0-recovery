package p636z0.p685e0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: z0.e0.y, reason: use source file name */
/* JADX INFO: compiled from: ViewUtilsApi29.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewUtilsApi29 extends ViewUtilsApi23 {
    @Override // p636z0.p685e0.ViewUtilsApi19, p636z0.p685e0.ViewUtilsBase
    /* JADX INFO: renamed from: b */
    public float mo15533b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p636z0.p685e0.ViewUtilsApi22, p636z0.p685e0.ViewUtilsBase
    /* JADX INFO: renamed from: d */
    public void mo15538d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p636z0.p685e0.ViewUtilsApi19, p636z0.p685e0.ViewUtilsBase
    /* JADX INFO: renamed from: e */
    public void mo15535e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p636z0.p685e0.ViewUtilsApi23, p636z0.p685e0.ViewUtilsBase
    /* JADX INFO: renamed from: f */
    public void mo15539f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p636z0.p685e0.ViewUtilsApi21, p636z0.p685e0.ViewUtilsBase
    /* JADX INFO: renamed from: g */
    public void mo15536g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p636z0.p685e0.ViewUtilsApi21, p636z0.p685e0.ViewUtilsBase
    /* JADX INFO: renamed from: h */
    public void mo15537h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
