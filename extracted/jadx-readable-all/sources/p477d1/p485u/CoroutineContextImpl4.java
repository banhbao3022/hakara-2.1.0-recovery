package p477d1.p485u;

import java.io.Serializable;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.u.h, reason: use source file name */
/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineContextImpl4 implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: f */
    public static final CoroutineContextImpl4 f29535f = new CoroutineContextImpl4();

    private final Object readResolve() {
        return f29535f;
    }

    @Override // p477d1.p485u.CoroutineContext
    public <R> R fold(R r, InterfaceC6168p<? super R, ? super CoroutineContext.a, ? extends R> interfaceC6168p) {
        Intrinsics2.m13089e(interfaceC6168p, "operation");
        return r;
    }

    @Override // p477d1.p485u.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        Intrinsics2.m13089e(bVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p477d1.p485u.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        Intrinsics2.m13089e(bVar, "key");
        return this;
    }

    @Override // p477d1.p485u.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        Intrinsics2.m13089e(coroutineContext, "context");
        return coroutineContext;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
