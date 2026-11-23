package p636z0.p644b.p653h;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.h.d1, reason: use source file name */
/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewUtils5 {

    /* JADX INFO: renamed from: a */
    public static Method f35006a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f35006a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f35006a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14874a(View view, Rect rect, Rect rect2) {
        Method method = f35006a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14875b(View view) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        return view.getLayoutDirection() == 1;
    }
}
