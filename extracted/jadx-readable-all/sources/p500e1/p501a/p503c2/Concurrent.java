package p500e1.p501a.p503c2;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: e1.a.c2.d, reason: use source file name */
/* JADX INFO: compiled from: Concurrent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Concurrent {

    /* JADX INFO: renamed from: a */
    public static final Method f29640a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f29640a = method;
    }
}
