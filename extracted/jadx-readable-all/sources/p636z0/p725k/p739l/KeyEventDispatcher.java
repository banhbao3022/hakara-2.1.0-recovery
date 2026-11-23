package p636z0.p725k.p739l;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;

/* JADX INFO: renamed from: z0.k.l.f, reason: use source file name */
/* JADX INFO: compiled from: KeyEventDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class KeyEventDispatcher {

    /* JADX INFO: renamed from: a */
    public static boolean f38058a = false;

    /* JADX INFO: renamed from: b */
    public static Method f38059b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f38060c = false;

    /* JADX INFO: renamed from: d */
    public static Field f38061d;

    /* JADX INFO: renamed from: z0.k.l.f$a */
    /* JADX INFO: compiled from: KeyEventDispatcher.java */
    public interface a {
        /* JADX INFO: renamed from: u */
        boolean mo14678u(KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16289a(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = ViewCompat.g.f38087a;
            ViewCompat.g gVar = (ViewCompat.g) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (gVar == null) {
                gVar = new ViewCompat.g();
                view.setTag(R.id.tag_unhandled_key_event_manager, gVar);
            }
            WeakReference<KeyEvent> weakReference = gVar.f38090d;
            if (weakReference == null || weakReference.get() != keyEvent) {
                gVar.f38090d = new WeakReference<>(keyEvent);
                WeakReference<View> weakReferenceValueAt = null;
                if (gVar.f38089c == null) {
                    gVar.f38089c = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = gVar.f38089c;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReferenceValueAt = sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReferenceValueAt == null) {
                    weakReferenceValueAt = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReferenceValueAt != null) {
                    View view2 = weakReferenceValueAt.get();
                    if (view2 == null || !view2.isAttachedToWindow()) {
                        return true;
                    }
                    gVar.m16341b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16290b(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo14678u(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f38058a) {
                        try {
                            f38059b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f38058a = true;
                    }
                    Method method = f38059b;
                    if (method != null) {
                        try {
                            zBooleanValue = ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (zBooleanValue) {
                        return true;
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (ViewCompat.m16312f(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && ViewCompat.m16312f(view, keyEvent)) || aVar.mo14678u(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f38060c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f38061d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f38060c = true;
        }
        Field field = f38061d;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
                onKeyListener = null;
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (ViewCompat.m16312f(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }
}
