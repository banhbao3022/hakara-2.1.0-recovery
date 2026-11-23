package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.CoroutineContextImpl;

/* JADX INFO: compiled from: AndroidExceptionPreHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
public final class AndroidExceptionPreHandler extends CoroutineContextImpl implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.C7217a.f33300f);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        if (Build.VERSION.SDK_INT >= 28) {
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            return;
        }
        Method methodPreHandler = preHandler();
        Object objInvoke = methodPreHandler != null ? methodPreHandler.invoke(null, new Object[0]) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) (objInvoke instanceof Thread.UncaughtExceptionHandler ? objInvoke : null);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(threadCurrentThread, th);
        }
    }
}
