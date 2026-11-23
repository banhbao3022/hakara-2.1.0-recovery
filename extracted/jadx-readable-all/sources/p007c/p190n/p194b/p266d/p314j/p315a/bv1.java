package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bv1<V> implements Future<V> {
    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        return ((cv1) this).f13126f.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ((cv1) this).f13126f.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return ((cv1) this).f13126f.isDone();
    }

    public final String toString() {
        return ((cv1) this).f13126f.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return ((cv1) this).f13126f.get(j2, timeUnit);
    }
}
