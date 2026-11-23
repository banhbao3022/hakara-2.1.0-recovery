package p636z0.p685e0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: z0.e0.z, reason: use source file name */
/* JADX INFO: compiled from: ViewUtilsBase.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewUtilsBase {

    /* JADX INFO: renamed from: a */
    public static Method f36507a;

    /* JADX INFO: renamed from: b */
    public static boolean f36508b;

    /* JADX INFO: renamed from: c */
    public static Field f36509c;

    /* JADX INFO: renamed from: d */
    public static boolean f36510d;

    /* JADX INFO: renamed from: a */
    public void mo15532a(View view) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public float mo15533b(View view) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public void mo15534c(View view) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public void mo15538d(View view, int i, int i2, int i3, int i4) {
        if (!f36508b) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f36507a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f36508b = true;
        }
        Method method = f36507a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo15535e(View view, float f) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public void mo15539f(View view, int i) {
        if (!f36510d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f36509c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f36510d = true;
        }
        Field field = f36509c;
        if (field != null) {
            try {
                f36509c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo15536g(View view, Matrix matrix) {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public void mo15537h(View view, Matrix matrix) {
        throw null;
    }
}
