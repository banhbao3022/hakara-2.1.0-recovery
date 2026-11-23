package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fl1<E, V> implements kv1<V> {

    /* JADX INFO: renamed from: f */
    public final E f14052f;

    /* JADX INFO: renamed from: g */
    public final String f14053g;

    /* JADX INFO: renamed from: h */
    public final kv1<V> f14054h;

    public fl1(E e, String str, kv1<V> kv1Var) {
        this.f14052f = e;
        this.f14053g = str;
        this.f14054h = kv1Var;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f14054h.cancel(z);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kv1
    /* JADX INFO: renamed from: f */
    public final void mo6230f(Runnable runnable, Executor executor) {
        this.f14054h.mo6230f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        return this.f14054h.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14054h.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14054h.isDone();
    }

    public final String toString() {
        String str = this.f14053g;
        int iIdentityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(iIdentityHashCode);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f14054h.get(j2, timeUnit);
    }
}
