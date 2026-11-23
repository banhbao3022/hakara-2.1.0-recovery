package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: c.n.b.d.j.a.do */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2962do {

    /* JADX INFO: renamed from: a */
    public static final lv1 f13330a;

    /* JADX INFO: renamed from: b */
    public static final lv1 f13331b;

    /* JADX INFO: renamed from: c */
    public static final lv1 f13332c;

    /* JADX INFO: renamed from: d */
    public static final ScheduledExecutorService f13333d;

    /* JADX INFO: renamed from: e */
    public static final lv1 f13334e;

    /* JADX INFO: renamed from: f */
    public static final lv1 f13335f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f13330a = new C2925co(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, timeUnit, new SynchronousQueue(), new ThreadFactoryC2850ao("Default")));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC2850ao("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f13331b = new C2925co(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC2850ao("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f13332c = new C2925co(threadPoolExecutor2);
        f13333d = new C3776zn(new ThreadFactoryC2850ao("Schedule"));
        f13334e = new C2925co(new ExecutorC2887bo());
        f13335f = new C2925co(wu1.INSTANCE);
    }
}
