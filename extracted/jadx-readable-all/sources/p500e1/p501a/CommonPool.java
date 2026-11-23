package p500e1.p501a;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.StringNumberConversions;
import p477d1.p485u.CoroutineContext;

/* JADX INFO: renamed from: e1.a.p, reason: use source file name */
/* JADX INFO: compiled from: CommonPool.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CommonPool extends Executors4 {

    /* JADX INFO: renamed from: g */
    public static final int f29780g;

    /* JADX INFO: renamed from: h */
    public static final CommonPool f29781h = new CommonPool();
    private static volatile Executor pool;

    /* JADX INFO: renamed from: e1.a.p$a */
    /* JADX INFO: compiled from: CommonPool.kt */
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicInteger f29782a;

        public a(AtomicInteger atomicInteger) {
            this.f29782a = atomicInteger;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            StringBuilder sbM1556G = outline.m1556G("CommonPool-worker-");
            sbM1556G.append(this.f29782a.incrementAndGet());
            Thread thread = new Thread(runnable, sbM1556G.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    static {
        String property;
        int iIntValue;
        try {
            property = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            property = null;
        }
        if (property != null) {
            Integer numM12986c = StringNumberConversions.m12986c(property);
            if (numM12986c == null || numM12986c.intValue() < 1) {
                throw new IllegalStateException(outline.m1599u("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", property).toString());
            }
            iIntValue = numM12986c.intValue();
        } else {
            iIntValue = -1;
        }
        f29780g = iIntValue;
    }

    @Override // p500e1.p501a.CoroutineDispatcher
    /* JADX INFO: renamed from: F0 */
    public void mo13118F0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor executorM13282J0 = pool;
            if (executorM13282J0 == null) {
                synchronized (this) {
                    executorM13282J0 = pool;
                    if (executorM13282J0 == null) {
                        executorM13282J0 = m13282J0();
                        pool = executorM13282J0;
                    }
                }
            }
            executorM13282J0.execute(runnable);
        } catch (RejectedExecutionException unused) {
            DefaultExecutor.f29739n.m13284P0(runnable);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final ExecutorService m13281I0() {
        return Executors.newFixedThreadPool(m13283K0(), new a(new AtomicInteger()));
    }

    /* JADX INFO: renamed from: J0 */
    public final ExecutorService m13282J0() {
        Class<?> cls;
        ExecutorService executorService;
        Integer num;
        if (System.getSecurityManager() != null) {
            return m13281I0();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return m13281I0();
        }
        if (f29780g < 0) {
            try {
                Object objInvoke = cls.getMethod("commonPool", new Class[0]).invoke(null, new Object[0]);
                if (!(objInvoke instanceof ExecutorService)) {
                    objInvoke = null;
                }
                executorService = (ExecutorService) objInvoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                Objects.requireNonNull(f29781h);
                executorService.submit(CommonPool2.f29792f);
                try {
                    Object objInvoke2 = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
                    if (!(objInvoke2 instanceof Integer)) {
                        objInvoke2 = null;
                    }
                    num = (Integer) objInvoke2;
                } catch (Throwable unused3) {
                    num = null;
                }
                if (!(num != null && num.intValue() >= 1)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(f29781h.m13283K0()));
            if (!(objNewInstance instanceof ExecutorService)) {
                objNewInstance = null;
            }
            executorService2 = (ExecutorService) objNewInstance;
        } catch (Throwable unused4) {
        }
        return executorService2 != null ? executorService2 : m13281I0();
    }

    /* JADX INFO: renamed from: K0 */
    public final int m13283K0() {
        Integer numValueOf = Integer.valueOf(f29780g);
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        return iAvailableProcessors >= 1 ? iAvailableProcessors : 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // p500e1.p501a.CoroutineDispatcher
    public String toString() {
        return "CommonPool";
    }
}
