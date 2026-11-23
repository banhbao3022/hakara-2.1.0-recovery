package p636z0.p667e.p676b.p677v1.p678r1.p680c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p655c.p656a.p659c.Function3;
import p636z0.p686f.C7944a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;
import p636z0.p693h.p694a.ResolvableFuture;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.b.v1.r1.c.g, reason: use source file name */
/* JADX INFO: compiled from: Futures.java */
/* JADX INFO: loaded from: classes.dex */
public final class Futures2 {

    /* JADX INFO: renamed from: a */
    public static final Function3<?, ?> f36277a = new a();

    /* JADX INFO: renamed from: z0.e.b.v1.r1.c.g$a */
    /* JADX INFO: compiled from: Futures.java */
    public class a implements Function3<Object, Object> {
        @Override // p636z0.p655c.p656a.p659c.Function3
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: z0.e.b.v1.r1.c.g$b */
    /* JADX INFO: compiled from: Futures.java */
    public class b<I> implements FutureCallback<I> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter f36278a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function3 f36279b;

        public b(CallbackToFutureAdapter callbackToFutureAdapter, Function3 function3) {
            this.f36278a = callbackToFutureAdapter;
            this.f36279b = function3;
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: a */
        public void mo15090a(I i) {
            try {
                this.f36278a.m15659a(this.f36279b.apply(i));
            } catch (Throwable th) {
                this.f36278a.m15661c(th);
            }
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: b */
        public void mo15091b(Throwable th) {
            this.f36278a.m15661c(th);
        }
    }

    /* JADX INFO: renamed from: z0.e.b.v1.r1.c.g$c */
    /* JADX INFO: compiled from: Futures.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ListenableFuture f36280f;

        public c(ListenableFuture listenableFuture) {
            this.f36280f = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36280f.cancel(true);
        }
    }

    /* JADX INFO: renamed from: z0.e.b.v1.r1.c.g$d */
    /* JADX INFO: compiled from: Futures.java */
    public static final class d<V> implements Runnable {

        /* JADX INFO: renamed from: f */
        public final Future<V> f36281f;

        /* JADX INFO: renamed from: g */
        public final FutureCallback<? super V> f36282g;

        public d(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.f36281f = future;
            this.f36282g = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f36282g.mo15090a(Futures2.m15426a(this.f36281f));
            } catch (Error e) {
                e = e;
                this.f36282g.mo15091b(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.f36282g.mo15091b(e);
            } catch (ExecutionException e3) {
                this.f36282g.mo15091b(e3.getCause());
            }
        }

        public String toString() {
            return d.class.getSimpleName() + "," + this.f36282g;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <V> V m15426a(Future<V> future) throws ExecutionException {
        C8162a.m16065j(future.isDone(), "Future was expected to be done, " + future);
        return (V) m15427b(future);
    }

    /* JADX INFO: renamed from: b */
    public static <V> V m15427b(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: renamed from: c */
    public static <V> ListenableFuture<V> m15428c(V v) {
        return v == null ? ImmediateFuture.c.f36284f : new ImmediateFuture.c(v);
    }

    /* JADX INFO: renamed from: d */
    public static <V> ListenableFuture<V> m15429d(final ListenableFuture<V> listenableFuture) {
        Objects.requireNonNull(listenableFuture);
        return listenableFuture.isDone() ? listenableFuture : C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.b.v1.r1.c.a
            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
            /* JADX INFO: renamed from: a */
            public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter) {
                ListenableFuture listenableFuture2 = listenableFuture;
                Futures2.m15431f(false, listenableFuture2, Futures2.f36277a, callbackToFutureAdapter, C7462a.m14569f());
                return "nonCancellationPropagating[" + listenableFuture2 + "]";
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static <V> void m15430e(ListenableFuture<V> listenableFuture, CallbackToFutureAdapter<V> callbackToFutureAdapter) {
        m15431f(true, listenableFuture, f36277a, callbackToFutureAdapter, C7462a.m14569f());
    }

    /* JADX INFO: renamed from: f */
    public static <I, O> void m15431f(boolean z, ListenableFuture<I> listenableFuture, Function3<? super I, ? extends O> function3, CallbackToFutureAdapter<O> callbackToFutureAdapter, Executor executor) {
        Objects.requireNonNull(listenableFuture);
        Objects.requireNonNull(function3);
        Objects.requireNonNull(callbackToFutureAdapter);
        Objects.requireNonNull(executor);
        listenableFuture.mo11664h(new d(listenableFuture, new b(callbackToFutureAdapter, function3)), executor);
        if (z) {
            c cVar = new c(listenableFuture);
            Executor executorM14569f = C7462a.m14569f();
            ResolvableFuture<Void> resolvableFuture = callbackToFutureAdapter.f36710c;
            if (resolvableFuture != null) {
                resolvableFuture.mo11664h(cVar, executorM14569f);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static <V> ListenableFuture<List<V>> m15432g(Collection<? extends ListenableFuture<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), false, C7462a.m14569f());
    }
}
