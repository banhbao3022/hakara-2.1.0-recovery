package p500e1.p501a;

import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p494b.InterfaceC6168p;

/* JADX INFO: renamed from: e1.a.z1, reason: use source file name */
/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineContext5 implements CoroutineContext.a, CoroutineContext.b<CoroutineContext5> {

    /* JADX INFO: renamed from: f */
    public static final CoroutineContext5 f29824f = new CoroutineContext5();

    @Override // p477d1.p485u.CoroutineContext
    public <R> R fold(R r, InterfaceC6168p<? super R, ? super CoroutineContext.a, ? extends R> interfaceC6168p) {
        return (R) CoroutineContext.a.C8537a.m13059a(this, r, interfaceC6168p);
    }

    @Override // p477d1.p485u.CoroutineContext.a, p477d1.p485u.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.a.C8537a.m13060b(this, bVar);
    }

    @Override // p477d1.p485u.CoroutineContext.a
    public CoroutineContext.b<?> getKey() {
        return this;
    }

    @Override // p477d1.p485u.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return CoroutineContext.a.C8537a.m13061c(this, bVar);
    }

    @Override // p477d1.p485u.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.C8537a.m13062d(this, coroutineContext);
    }
}
