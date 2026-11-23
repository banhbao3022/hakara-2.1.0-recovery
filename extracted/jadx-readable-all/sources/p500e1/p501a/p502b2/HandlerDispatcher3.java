package p500e1.p501a.p502b2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import p007c.p451o.p452a.C5729a;
import p477d1.Result;

/* JADX INFO: renamed from: e1.a.b2.c, reason: use source file name */
/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerDispatcher3 {
    private static volatile Choreographer choreographer;

    static {
        Object objM12456k;
        boolean z = false;
        boolean z2 = false;
        try {
            Result.a aVar = Result.f29493f;
            objM12456k = new HandlerDispatcher(m13124a(Looper.getMainLooper(), true), z2 ? 1 : 0, 2, z ? 1 : 0);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f29493f;
            objM12456k = C5729a.m12456k(th);
        }
        Result.a aVar3 = Result.f29493f;
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m13124a(Looper looper, boolean z) throws IllegalAccessException, InvocationTargetException {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
