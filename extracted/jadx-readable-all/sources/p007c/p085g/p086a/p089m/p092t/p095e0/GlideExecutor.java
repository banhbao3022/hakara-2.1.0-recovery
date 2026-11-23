package p007c.p085g.p086a.p089m.p092t.p095e0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: c.g.a.m.t.e0.a, reason: use source file name */
/* JADX INFO: compiled from: GlideExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public final class GlideExecutor implements ExecutorService {

    /* JADX INFO: renamed from: f */
    public static final long f3189f = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: g */
    public static volatile int f3190g;

    /* JADX INFO: renamed from: h */
    public final ExecutorService f3191h;

    /* JADX INFO: renamed from: c.g.a.m.t.e0.a$a */
    /* JADX INFO: compiled from: GlideExecutor.java */
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final String f3192a;

        /* JADX INFO: renamed from: b */
        public final boolean f3193b;

        /* JADX INFO: renamed from: c */
        public int f3194c;

        /* JADX INFO: renamed from: c.g.a.m.t.e0.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GlideExecutor.java */
        public class C8501a extends Thread {
            public C8501a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (a.this.f3193b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    Objects.requireNonNull(a.this);
                    ((b.a) b.f3197b).m1787a(th);
                }
            }
        }

        public a(String str, b bVar, boolean z) {
            this.f3192a = str;
            this.f3193b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C8501a c8501a;
            c8501a = new C8501a(runnable, "glide-" + this.f3192a + "-thread-" + this.f3194c);
            this.f3194c = this.f3194c + 1;
            return c8501a;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.e0.a$b */
    /* JADX INFO: compiled from: GlideExecutor.java */
    public interface b {

        /* JADX INFO: renamed from: a */
        public static final b f3196a;

        /* JADX INFO: renamed from: b */
        public static final b f3197b;

        /* JADX INFO: renamed from: c.g.a.m.t.e0.a$b$a */
        /* JADX INFO: compiled from: GlideExecutor.java */
        public class a implements b {
            /* JADX INFO: renamed from: a */
            public void m1787a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        static {
            a aVar = new a();
            f3196a = aVar;
            f3197b = aVar;
        }
    }

    public GlideExecutor(ExecutorService executorService) {
        this.f3191h = executorService;
    }

    /* JADX INFO: renamed from: a */
    public static int m1786a() {
        if (f3190g == 0) {
            f3190g = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f3190g;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f3191h.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3191h.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f3191h.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f3191h.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f3191h.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f3191h.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f3191h.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f3191h.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f3191h.submit(runnable);
    }

    public String toString() {
        return this.f3191h.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f3191h.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f3191h.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f3191h.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f3191h.submit(callable);
    }
}
