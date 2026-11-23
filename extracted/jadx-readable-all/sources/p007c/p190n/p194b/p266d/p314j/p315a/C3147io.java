package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: renamed from: c.n.b.d.j.a.io */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C3147io<T> implements kv1<T> {

    /* JADX INFO: renamed from: f */
    public final sv1<T> f15328f = new sv1<>();

    /* JADX INFO: renamed from: a */
    public final boolean m7286a(T t) {
        boolean zMo6531l = this.f15328f.mo6531l(t);
        if (!zMo6531l) {
            C2330u.f10884a.f10893h.m6648e(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return zMo6531l;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7287b(Throwable th) {
        boolean zMo6532m = this.f15328f.mo6532m(th);
        if (!zMo6532m) {
            C2330u.f10884a.f10893h.m6648e(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return zMo6532m;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f15328f.cancel(z);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kv1
    /* JADX INFO: renamed from: f */
    public final void mo6230f(Runnable runnable, Executor executor) {
        this.f15328f.mo6230f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException, InterruptedException {
        return this.f15328f.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15328f.f13393j instanceof tt1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15328f.isDone();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f15328f.get(j2, timeUnit);
    }
}
