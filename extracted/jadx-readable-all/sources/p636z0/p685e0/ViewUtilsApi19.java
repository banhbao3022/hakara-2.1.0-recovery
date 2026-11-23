package p636z0.p685e0;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: renamed from: z0.e0.u, reason: use source file name */
/* JADX INFO: compiled from: ViewUtilsApi19.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewUtilsApi19 extends ViewUtilsBase {

    /* JADX INFO: renamed from: e */
    public static boolean f36502e = true;

    @Override // p636z0.p685e0.ViewUtilsBase
    /* JADX INFO: renamed from: a */
    public void mo15532a(View view) {
    }

    @Override // p636z0.p685e0.ViewUtilsBase
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public float mo15533b(View view) {
        if (f36502e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f36502e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p636z0.p685e0.ViewUtilsBase
    /* JADX INFO: renamed from: c */
    public void mo15534c(View view) {
    }

    @Override // p636z0.p685e0.ViewUtilsBase
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: e */
    public void mo15535e(View view, float f) {
        if (f36502e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f36502e = false;
            }
        }
        view.setAlpha(f);
    }
}
