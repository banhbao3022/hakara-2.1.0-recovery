package p636z0.p725k.p739l;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: z0.k.l.v, reason: use source file name */
/* JADX INFO: compiled from: ViewConfigurationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class ViewConfigurationCompat {

    /* JADX INFO: renamed from: a */
    public static Method f38091a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f38091a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static float m16344a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f38091a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
