package p636z0.p693h.p694a;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;

/* JADX INFO: renamed from: z0.h.a.e, reason: use source file name */
/* JADX INFO: compiled from: CallbackToFutureAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class CallbackToFutureAdapter4<T> implements ListenableFuture<T> {

    /* JADX INFO: renamed from: f */
    public final WeakReference<CallbackToFutureAdapter<T>> f36712f;

    /* JADX INFO: renamed from: g */
    public final AbstractResolvableFuture<T> f36713g = new a();

    /* JADX INFO: renamed from: z0.h.a.e$a */
    /* JADX INFO: compiled from: CallbackToFutureAdapter.java */
    public class a extends AbstractResolvableFuture<T> {
        public a() {
        }

        @Override // p636z0.p693h.p694a.AbstractResolvableFuture
        /* JADX INFO: renamed from: g */
        public String mo15650g() {
            CallbackToFutureAdapter<T> callbackToFutureAdapter = CallbackToFutureAdapter4.this.f36712f.get();
            if (callbackToFutureAdapter == null) {
                return "Completer object has been garbage collected, future will fail soon";
            }
            StringBuilder sbM1556G = outline.m1556G("tag=[");
            sbM1556G.append(callbackToFutureAdapter.f36708a);
            sbM1556G.append("]");
            return sbM1556G.toString();
        }
    }

    public CallbackToFutureAdapter4(CallbackToFutureAdapter<T> callbackToFutureAdapter) {
        this.f36712f = new WeakReference<>(callbackToFutureAdapter);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        CallbackToFutureAdapter<T> callbackToFutureAdapter = this.f36712f.get();
        boolean zCancel = this.f36713g.cancel(z);
        if (zCancel && callbackToFutureAdapter != null) {
            callbackToFutureAdapter.f36708a = null;
            callbackToFutureAdapter.f36709b = null;
            callbackToFutureAdapter.f36710c.mo15652j(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        return this.f36713g.get();
    }

    @Override // p007c.p190n.p378c.p383e.p384a.ListenableFuture
    /* JADX INFO: renamed from: h */
    public void mo11664h(Runnable runnable, Executor executor) {
        this.f36713g.mo11664h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f36713g.f36688j instanceof AbstractResolvableFuture.c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f36713g.isDone();
    }

    public String toString() {
        return this.f36713g.toString();
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f36713g.get(j2, timeUnit);
    }
}
