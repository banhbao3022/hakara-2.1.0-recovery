package p500e1.p501a;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p500e1.p501a.p503c2.Concurrent;

/* JADX INFO: renamed from: e1.a.u0, reason: use source file name */
/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Executors6 extends Executors5 {

    /* JADX INFO: renamed from: h */
    public final Executor f29808h;

    public Executors6(Executor executor) {
        Method method;
        this.f29808h = executor;
        Executor executorMo13291H0 = mo13291H0();
        Method method2 = Concurrent.f29640a;
        boolean z = false;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) (executorMo13291H0 instanceof ScheduledThreadPoolExecutor ? executorMo13291H0 : null);
            if (scheduledThreadPoolExecutor != null && (method = Concurrent.f29640a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
                z = true;
            }
        } catch (Throwable unused) {
        }
        this.f29802g = z;
    }

    @Override // p500e1.p501a.Executors4
    /* JADX INFO: renamed from: H0 */
    public Executor mo13291H0() {
        return this.f29808h;
    }
}
