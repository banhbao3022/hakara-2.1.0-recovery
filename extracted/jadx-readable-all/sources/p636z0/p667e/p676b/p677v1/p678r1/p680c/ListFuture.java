package p636z0.p667e.p676b.p677v1.p678r1.p680c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p686f.C7944a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;
import p636z0.p693h.p694a.CallbackToFutureAdapter4;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.b.v1.r1.c.i, reason: use source file name */
/* JADX INFO: compiled from: ListFuture.java */
/* JADX INFO: loaded from: classes.dex */
public class ListFuture<V> implements ListenableFuture<List<V>> {

    /* JADX INFO: renamed from: f */
    public List<? extends ListenableFuture<? extends V>> f36286f;

    /* JADX INFO: renamed from: g */
    public List<V> f36287g;

    /* JADX INFO: renamed from: h */
    public final boolean f36288h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f36289i;

    /* JADX INFO: renamed from: j */
    public final ListenableFuture<List<V>> f36290j;

    /* JADX INFO: renamed from: k */
    public CallbackToFutureAdapter<List<V>> f36291k;

    /* JADX INFO: renamed from: z0.e.b.v1.r1.c.i$a */
    /* JADX INFO: compiled from: ListFuture.java */
    public class a implements CallbackToFutureAdapter3<List<V>> {
        public a() {
        }

        @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
        /* JADX INFO: renamed from: a */
        public Object mo15078a(CallbackToFutureAdapter<List<V>> callbackToFutureAdapter) {
            C8162a.m16065j(ListFuture.this.f36291k == null, "The result can only set once!");
            ListFuture.this.f36291k = callbackToFutureAdapter;
            return "ListFuture[" + this + "]";
        }
    }

    public ListFuture(List<? extends ListenableFuture<? extends V>> list, boolean z, Executor executor) {
        this.f36286f = list;
        this.f36287g = new ArrayList(list.size());
        this.f36288h = z;
        this.f36289i = new AtomicInteger(list.size());
        ListenableFuture<List<V>> listenableFutureM15540a = C7944a.m15540a(new a());
        this.f36290j = listenableFutureM15540a;
        ((CallbackToFutureAdapter4) listenableFutureM15540a).f36713g.mo11664h(new ListFuture2(this), C7462a.m14569f());
        if (this.f36286f.isEmpty()) {
            this.f36291k.m15659a(new ArrayList(this.f36287g));
            return;
        }
        for (int i = 0; i < this.f36286f.size(); i++) {
            this.f36287g.add(null);
        }
        List<? extends ListenableFuture<? extends V>> list2 = this.f36286f;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ListenableFuture<? extends V> listenableFuture = list2.get(i2);
            listenableFuture.mo11664h(new ListFuture3(this, i2, listenableFuture), executor);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        List<? extends ListenableFuture<? extends V>> list = this.f36286f;
        if (list != null) {
            Iterator<? extends ListenableFuture<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z);
            }
        }
        return this.f36290j.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f36290j.get(j2, timeUnit);
    }

    @Override // p007c.p190n.p378c.p383e.p384a.ListenableFuture
    /* JADX INFO: renamed from: h */
    public void mo11664h(Runnable runnable, Executor executor) {
        this.f36290j.mo11664h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f36290j.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f36290j.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        List<? extends ListenableFuture<? extends V>> list = this.f36286f;
        if (list != null && !isDone()) {
            loop0: for (ListenableFuture<? extends V> listenableFuture : list) {
                while (!listenableFuture.isDone()) {
                    try {
                        listenableFuture.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.f36288h) {
                            return this.f36290j.get();
                        }
                    }
                }
            }
        }
        return this.f36290j.get();
    }
}
