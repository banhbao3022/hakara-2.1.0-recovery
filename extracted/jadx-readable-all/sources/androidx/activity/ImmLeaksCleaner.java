package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LifecycleEventObserver;
import java.lang.reflect.Field;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class ImmLeaksCleaner implements LifecycleEventObserver {

    /* JADX INFO: renamed from: f */
    public static int f158f;

    /* JADX INFO: renamed from: g */
    public static Field f159g;

    /* JADX INFO: renamed from: h */
    public static Field f160h;

    /* JADX INFO: renamed from: i */
    public static Field f161i;

    /* JADX INFO: renamed from: j */
    public Activity f162j;

    public ImmLeaksCleaner(Activity activity) {
        this.f162j = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: c */
    public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
        if (aVar != Lifecycle3.a.ON_DESTROY) {
            return;
        }
        if (f158f == 0) {
            try {
                f158f = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f160h = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f161i = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f159g = declaredField3;
                declaredField3.setAccessible(true);
                f158f = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f158f == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f162j.getSystemService("input_method");
            try {
                Object obj = f159g.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f160h.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f161i.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
