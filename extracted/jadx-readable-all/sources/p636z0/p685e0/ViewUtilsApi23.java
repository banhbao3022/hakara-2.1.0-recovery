package p636z0.p685e0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: z0.e0.x, reason: use source file name */
/* JADX INFO: compiled from: ViewUtilsApi23.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewUtilsApi23 extends ViewUtilsApi22 {

    /* JADX INFO: renamed from: i */
    public static boolean f36506i = true;

    @Override // p636z0.p685e0.ViewUtilsBase
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: f */
    public void mo15539f(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo15539f(view, i);
        } else if (f36506i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f36506i = false;
            }
        }
    }
}
