package p636z0.p685e0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: z0.e0.v, reason: use source file name */
/* JADX INFO: compiled from: ViewUtilsApi21.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewUtilsApi21 extends ViewUtilsApi19 {

    /* JADX INFO: renamed from: f */
    public static boolean f36503f = true;

    /* JADX INFO: renamed from: g */
    public static boolean f36504g = true;

    @Override // p636z0.p685e0.ViewUtilsBase
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g */
    public void mo15536g(View view, Matrix matrix) {
        if (f36503f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f36503f = false;
            }
        }
    }

    @Override // p636z0.p685e0.ViewUtilsBase
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: h */
    public void mo15537h(View view, Matrix matrix) {
        if (f36504g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f36504g = false;
            }
        }
    }
}
