package p477d1.p485u;

import p477d1.p485u.CoroutineContext.a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.u.b, reason: use source file name */
/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineContextImpl2<B extends CoroutineContext.a, E extends B> implements CoroutineContext.b<E> {

    /* JADX INFO: renamed from: f */
    public final CoroutineContext.b<?> f29524f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<CoroutineContext.a, E> f29525g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [d1.u.f$b<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [d1.x.b.l<? super d1.u.f$a, ? extends E extends B>, d1.x.b.l<d1.u.f$a, E extends B>, java.lang.Object] */
    public CoroutineContextImpl2(CoroutineContext.b<B> bVar, InterfaceC6164l<? super CoroutineContext.a, ? extends E> interfaceC6164l) {
        Intrinsics2.m13089e(bVar, "baseKey");
        Intrinsics2.m13089e(interfaceC6164l, "safeCast");
        this.f29525g = interfaceC6164l;
        this.f29524f = bVar instanceof CoroutineContextImpl2 ? (CoroutineContext.b<B>) ((CoroutineContextImpl2) bVar).f29524f : bVar;
    }
}
