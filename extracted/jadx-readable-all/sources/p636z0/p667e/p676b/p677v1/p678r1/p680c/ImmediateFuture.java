package p636z0.p667e.p676b.p677v1.p678r1.p680c;

import java.util.Objects;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p667e.p676b.Logger8;

/* JADX INFO: renamed from: z0.e.b.v1.r1.c.h, reason: use source file name */
/* JADX INFO: compiled from: ImmediateFuture.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImmediateFuture<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: z0.e.b.v1.r1.c.h$a */
    /* JADX INFO: compiled from: ImmediateFuture.java */
    public static class a<V> extends ImmediateFuture<V> {

        /* JADX INFO: renamed from: f */
        public final Throwable f36283f;

        public a(Throwable th) {
            this.f36283f = th;
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.ImmediateFuture, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f36283f);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f36283f + "]]";
        }
    }

    /* JADX INFO: renamed from: z0.e.b.v1.r1.c.h$b */
    /* JADX INFO: compiled from: ImmediateFuture.java */
    public static final class b<V> extends a<V> implements ScheduledFuture<V> {
        public b(Throwable th) {
            super(th);
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: z0.e.b.v1.r1.c.h$c */
    /* JADX INFO: compiled from: ImmediateFuture.java */
    public static final class c<V> extends ImmediateFuture<V> {

        /* JADX INFO: renamed from: f */
        public static final ImmediateFuture<Object> f36284f = new c(null);

        /* JADX INFO: renamed from: g */
        public final V f36285g;

        public c(V v) {
            this.f36285g = v;
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.ImmediateFuture, java.util.concurrent.Future
        public V get() {
            return this.f36285g;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f36285g + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws ExecutionException {
        Objects.requireNonNull(timeUnit);
        return get();
    }

    @Override // p007c.p190n.p378c.p383e.p384a.ListenableFuture
    /* JADX INFO: renamed from: h */
    public void mo11664h(Runnable runnable, Executor executor) {
        Objects.requireNonNull(runnable);
        Objects.requireNonNull(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger8.m15273b("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
