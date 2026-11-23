package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class av1<V> extends zu1<V> {

    /* JADX INFO: renamed from: m */
    public final kv1<V> f12281m;

    public av1(kv1<V> kv1Var) {
        Objects.requireNonNull(kv1Var);
        this.f12281m = kv1Var;
    }

    public final boolean cancel(boolean z) {
        return this.f12281m.cancel(z);
    }

    /* JADX INFO: renamed from: f */
    public final void m5861f(Runnable runnable, Executor executor) {
        this.f12281m.mo6230f(runnable, executor);
    }

    public final V get() throws ExecutionException, InterruptedException {
        return this.f12281m.get();
    }

    public final boolean isCancelled() {
        return this.f12281m.isCancelled();
    }

    public final boolean isDone() {
        return this.f12281m.isDone();
    }

    public final String toString() {
        return this.f12281m.toString();
    }

    public final V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f12281m.get(j2, timeUnit);
    }
}
