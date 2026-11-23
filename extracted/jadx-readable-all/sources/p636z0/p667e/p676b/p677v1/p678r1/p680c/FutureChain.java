package p636z0.p667e.p676b.p677v1.p678r1.p680c;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p686f.C7944a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.b.v1.r1.c.e, reason: use source file name */
/* JADX INFO: compiled from: FutureChain.java */
/* JADX INFO: loaded from: classes.dex */
public class FutureChain<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: f */
    public final ListenableFuture<V> f36273f;

    /* JADX INFO: renamed from: g */
    public CallbackToFutureAdapter<V> f36274g;

    /* JADX INFO: renamed from: z0.e.b.v1.r1.c.e$a */
    /* JADX INFO: compiled from: FutureChain.java */
    public class a implements CallbackToFutureAdapter3<V> {
        public a() {
        }

        @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
        /* JADX INFO: renamed from: a */
        public Object mo15078a(CallbackToFutureAdapter<V> callbackToFutureAdapter) {
            C8162a.m16065j(FutureChain.this.f36274g == null, "The result can only set once!");
            FutureChain.this.f36274g = callbackToFutureAdapter;
            StringBuilder sbM1556G = outline.m1556G("FutureChain[");
            sbM1556G.append(FutureChain.this);
            sbM1556G.append("]");
            return sbM1556G.toString();
        }
    }

    public FutureChain(ListenableFuture<V> listenableFuture) {
        Objects.requireNonNull(listenableFuture);
        this.f36273f = listenableFuture;
    }

    /* JADX INFO: renamed from: a */
    public static <V> FutureChain<V> m15423a(ListenableFuture<V> listenableFuture) {
        return listenableFuture instanceof FutureChain ? (FutureChain) listenableFuture : new FutureChain<>(listenableFuture);
    }

    /* JADX INFO: renamed from: b */
    public boolean m15424b(Throwable th) {
        CallbackToFutureAdapter<V> callbackToFutureAdapter = this.f36274g;
        if (callbackToFutureAdapter != null) {
            return callbackToFutureAdapter.m15661c(th);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final <T> FutureChain<T> m15425c(AsyncFunction<? super V, T> asyncFunction, Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, this);
        this.f36273f.mo11664h(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f36273f.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return this.f36273f.get();
    }

    @Override // p007c.p190n.p378c.p383e.p384a.ListenableFuture
    /* JADX INFO: renamed from: h */
    public void mo11664h(Runnable runnable, Executor executor) {
        this.f36273f.mo11664h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f36273f.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f36273f.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f36273f.get(j2, timeUnit);
    }

    public FutureChain() {
        this.f36273f = C7944a.m15540a(new a());
    }
}
