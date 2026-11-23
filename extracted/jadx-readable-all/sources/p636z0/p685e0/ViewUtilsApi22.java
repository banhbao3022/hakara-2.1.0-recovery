package p636z0.p685e0;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: renamed from: z0.e0.w, reason: use source file name */
/* JADX INFO: compiled from: ViewUtilsApi22.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewUtilsApi22 extends ViewUtilsApi21 {

    /* JADX INFO: renamed from: h */
    public static boolean f36505h = true;

    @Override // p636z0.p685e0.ViewUtilsBase
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: d */
    public void mo15538d(View view, int i, int i2, int i3, int i4) {
        if (f36505h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f36505h = false;
            }
        }
    }
}
