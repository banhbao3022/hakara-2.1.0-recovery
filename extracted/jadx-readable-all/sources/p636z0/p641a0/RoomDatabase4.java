package p636z0.p641a0;

import java.util.concurrent.atomic.AtomicInteger;
import p007c.p451o.p452a.C5729a;
import p477d1.p485u.ContinuationInterceptor;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.Job;

/* JADX INFO: renamed from: z0.a0.y, reason: use source file name */
/* JADX INFO: compiled from: RoomDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RoomDatabase4 implements CoroutineContext.a {

    /* JADX INFO: renamed from: f */
    public static final a f34368f = new a(null);

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f34369g;

    /* JADX INFO: renamed from: h */
    public final Job f34370h;

    /* JADX INFO: renamed from: i */
    public final ContinuationInterceptor f34371i;

    /* JADX INFO: renamed from: z0.a0.y$a */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    public static final class a implements CoroutineContext.b<RoomDatabase4> {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public RoomDatabase4(Job job, ContinuationInterceptor continuationInterceptor) {
        Intrinsics2.m13089e(job, "transactionThreadControlJob");
        Intrinsics2.m13089e(continuationInterceptor, "transactionDispatcher");
        this.f34370h = job;
        this.f34371i = continuationInterceptor;
        this.f34369g = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: b */
    public final void m14562b() {
        int iDecrementAndGet = this.f34369g.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
        if (iDecrementAndGet == 0) {
            C5729a.m12453h(this.f34370h, null, 1, null);
        }
    }

    @Override // p477d1.p485u.CoroutineContext
    public <R> R fold(R r, InterfaceC6168p<? super R, ? super CoroutineContext.a, ? extends R> interfaceC6168p) {
        Intrinsics2.m13089e(interfaceC6168p, "operation");
        return (R) CoroutineContext.a.C8537a.m13059a(this, r, interfaceC6168p);
    }

    @Override // p477d1.p485u.CoroutineContext.a, p477d1.p485u.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        Intrinsics2.m13089e(bVar, "key");
        return (E) CoroutineContext.a.C8537a.m13060b(this, bVar);
    }

    @Override // p477d1.p485u.CoroutineContext.a
    public CoroutineContext.b<RoomDatabase4> getKey() {
        return f34368f;
    }

    @Override // p477d1.p485u.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        Intrinsics2.m13089e(bVar, "key");
        return CoroutineContext.a.C8537a.m13061c(this, bVar);
    }

    @Override // p477d1.p485u.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        Intrinsics2.m13089e(coroutineContext, "context");
        return CoroutineContext.a.C8537a.m13062d(this, coroutineContext);
    }
}
