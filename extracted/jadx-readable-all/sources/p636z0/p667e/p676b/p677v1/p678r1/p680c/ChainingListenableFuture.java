package p636z0.p667e.p676b.p677v1.p678r1.p680c;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;

/* JADX INFO: renamed from: z0.e.b.v1.r1.c.c, reason: use source file name */
/* JADX INFO: compiled from: ChainingListenableFuture.java */
/* JADX INFO: loaded from: classes.dex */
public class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {

    /* JADX INFO: renamed from: h */
    public AsyncFunction<? super I, ? extends O> f36266h;

    /* JADX INFO: renamed from: i */
    public final BlockingQueue<Boolean> f36267i = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: j */
    public final CountDownLatch f36268j = new CountDownLatch(1);

    /* JADX INFO: renamed from: k */
    public ListenableFuture<? extends I> f36269k;

    /* JADX INFO: renamed from: l */
    public volatile ListenableFuture<? extends O> f36270l;

    /* JADX INFO: renamed from: z0.e.b.v1.r1.c.c$a */
    /* JADX INFO: compiled from: ChainingListenableFuture.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ListenableFuture f36271f;

        public a(ListenableFuture listenableFuture) {
            this.f36271f = listenableFuture;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ChainingListenableFuture chainingListenableFuture = ChainingListenableFuture.this;
                    Object objM15427b = Futures2.m15427b(this.f36271f);
                    CallbackToFutureAdapter<V> callbackToFutureAdapter = chainingListenableFuture.f36274g;
                    if (callbackToFutureAdapter != 0) {
                        callbackToFutureAdapter.m15659a((V) objM15427b);
                    }
                } catch (CancellationException unused) {
                    ChainingListenableFuture.this.cancel(false);
                } catch (ExecutionException e) {
                    ChainingListenableFuture.this.m15424b(e.getCause());
                }
            } finally {
                ChainingListenableFuture.this.f36270l = null;
            }
        }
    }

    public ChainingListenableFuture(AsyncFunction<? super I, ? extends O> asyncFunction, ListenableFuture<? extends I> listenableFuture) {
        Objects.requireNonNull(asyncFunction);
        this.f36266h = asyncFunction;
        Objects.requireNonNull(listenableFuture);
        this.f36269k = listenableFuture;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.f36273f.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.f36267i.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        ListenableFuture<? extends I> listenableFuture = this.f36269k;
        if (listenableFuture != null) {
            listenableFuture.cancel(z);
        }
        ListenableFuture<? extends O> listenableFuture2 = this.f36270l;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(z);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final <E> E m15422d(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
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
        return eTake;
    }

    @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureChain, java.util.concurrent.Future
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            ListenableFuture<? extends I> listenableFuture = this.f36269k;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.f36268j.await();
            ListenableFuture<? extends O> listenableFuture2 = this.f36270l;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c.n.c.e.a.a<? extends I>, z0.e.b.v1.r1.c.b<? super I, ? extends O>] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r0 = (AsyncFunction<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        ListenableFuture<? extends O> listenableFutureApply = this.f36266h.apply(Futures2.m15427b(this.f36269k));
                        this.f36270l = listenableFutureApply;
                        if (!isCancelled()) {
                            listenableFutureApply.mo11664h(new a(listenableFutureApply), C7462a.m14569f());
                        } else {
                            listenableFutureApply.cancel(((Boolean) m15422d(this.f36267i)).booleanValue());
                            this.f36270l = null;
                        }
                    } catch (Error e) {
                        CallbackToFutureAdapter<V> callbackToFutureAdapter = this.f36274g;
                        if (callbackToFutureAdapter != 0) {
                            callbackToFutureAdapter.m15661c(e);
                        }
                    } catch (UndeclaredThrowableException e2) {
                        m15424b(e2.getCause());
                    }
                } finally {
                    this.f36266h = null;
                    this.f36269k = null;
                    this.f36268j.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                m15424b(e3.getCause());
            }
        } catch (Exception e4) {
            CallbackToFutureAdapter<V> callbackToFutureAdapter2 = this.f36274g;
            if (callbackToFutureAdapter2 != 0) {
                callbackToFutureAdapter2.m15661c(e4);
            }
        }
    }

    @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureChain, java.util.concurrent.Future
    public O get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j2 = timeUnit2.convert(j2, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture<? extends I> listenableFuture = this.f36269k;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j2, timeUnit);
                j2 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f36268j.await(j2, timeUnit)) {
                j2 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                ListenableFuture<? extends O> listenableFuture2 = this.f36270l;
                if (listenableFuture2 != null) {
                    listenableFuture2.get(j2, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j2, timeUnit);
    }
}
