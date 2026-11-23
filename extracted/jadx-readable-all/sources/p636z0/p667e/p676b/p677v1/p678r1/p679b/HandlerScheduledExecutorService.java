package p636z0.p667e.p676b.p677v1.p678r1.p679b;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.ImmediateFuture;
import p636z0.p686f.C7944a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;
import p636z0.p693h.p694a.ResolvableFuture;

/* JADX INFO: renamed from: z0.e.b.v1.r1.b.b, reason: use source file name */
/* JADX INFO: compiled from: HandlerScheduledExecutorService.java */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerScheduledExecutorService extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: f */
    public final Handler f36245f;

    /* JADX INFO: renamed from: z0.e.b.v1.r1.b.b$a */
    /* JADX INFO: compiled from: HandlerScheduledExecutorService.java */
    public class a extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return C7462a.m14576m();
            }
            if (Looper.myLooper() != null) {
                return new HandlerScheduledExecutorService(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: z0.e.b.v1.r1.b.b$b */
    /* JADX INFO: compiled from: HandlerScheduledExecutorService.java */
    public class b implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f36246a;

        public b(HandlerScheduledExecutorService handlerScheduledExecutorService, Runnable runnable) {
            this.f36246a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            this.f36246a.run();
            return null;
        }
    }

    /* JADX INFO: renamed from: z0.e.b.v1.r1.b.b$c */
    /* JADX INFO: compiled from: HandlerScheduledExecutorService.java */
    public static class c<V> implements RunnableScheduledFuture<V> {

        /* JADX INFO: renamed from: f */
        public final AtomicReference<CallbackToFutureAdapter<V>> f36247f = new AtomicReference<>(null);

        /* JADX INFO: renamed from: g */
        public final long f36248g;

        /* JADX INFO: renamed from: h */
        public final Callable<V> f36249h;

        /* JADX INFO: renamed from: i */
        public final ListenableFuture<V> f36250i;

        /* JADX INFO: renamed from: z0.e.b.v1.r1.b.b$c$a */
        /* JADX INFO: compiled from: HandlerScheduledExecutorService.java */
        public class a implements CallbackToFutureAdapter3<V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Handler f36251a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Callable f36252b;

            /* JADX INFO: renamed from: z0.e.b.v1.r1.b.b$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: HandlerScheduledExecutorService.java */
            public class RunnableC8567a implements Runnable {
                public RunnableC8567a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.f36247f.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f36251a.removeCallbacks(c.this);
                    }
                }
            }

            public a(Handler handler, Callable callable) {
                this.f36251a = handler;
                this.f36252b = callable;
            }

            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
            /* JADX INFO: renamed from: a */
            public Object mo15078a(CallbackToFutureAdapter<V> callbackToFutureAdapter) throws RejectedExecutionException {
                RunnableC8567a runnableC8567a = new RunnableC8567a();
                Executor executorM14569f = C7462a.m14569f();
                ResolvableFuture<Void> resolvableFuture = callbackToFutureAdapter.f36710c;
                if (resolvableFuture != null) {
                    resolvableFuture.mo11664h(runnableC8567a, executorM14569f);
                }
                c.this.f36247f.set(callbackToFutureAdapter);
                return "HandlerScheduledFuture-" + this.f36252b.toString();
            }
        }

        public c(Handler handler, long j2, Callable<V> callable) {
            this.f36248g = j2;
            this.f36249h = callable;
            this.f36250i = C7944a.m15540a(new a(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.f36250i.cancel(z);
        }

        @Override // java.lang.Comparable
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public V get() throws ExecutionException, InterruptedException {
            return this.f36250i.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f36248g - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f36250i.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f36250i.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            CallbackToFutureAdapter andSet = this.f36247f.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.m15659a(this.f36249h.call());
                } catch (Exception e) {
                    andSet.m15661c(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f36250i.get(j2, timeUnit);
        }
    }

    static {
        new a();
    }

    public HandlerScheduledExecutorService(Handler handler) {
        this.f36245f = handler;
    }

    /* JADX INFO: renamed from: a */
    public final RejectedExecutionException m15420a() {
        return new RejectedExecutionException(this.f36245f + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(HandlerScheduledExecutorService.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f36245f.post(runnable)) {
            throw m15420a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        return schedule(new b(this, runnable), j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(HandlerScheduledExecutorService.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(HandlerScheduledExecutorService.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(HandlerScheduledExecutorService.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(HandlerScheduledExecutorService.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) {
        long jConvert = TimeUnit.MILLISECONDS.convert(j2, timeUnit) + SystemClock.uptimeMillis();
        c cVar = new c(this.f36245f, jConvert, callable);
        return this.f36245f.postAtTime(cVar, jConvert) ? cVar : new ImmediateFuture.b(m15420a());
    }
}
