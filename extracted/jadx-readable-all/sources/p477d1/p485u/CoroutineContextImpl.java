package p477d1.p485u;

import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.u.a, reason: use source file name */
/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineContextImpl implements CoroutineContext.a {
    private final CoroutineContext.b<?> key;

    public CoroutineContextImpl(CoroutineContext.b<?> bVar) {
        Intrinsics2.m13089e(bVar, "key");
        this.key = bVar;
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
    public CoroutineContext.b<?> getKey() {
        return this.key;
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
