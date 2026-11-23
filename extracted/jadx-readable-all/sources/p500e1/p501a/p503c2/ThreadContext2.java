package p500e1.p501a.p503c2;

import p007c.p071d.p078c.p079a.outline;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.CoroutineContextImpl4;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.ThreadContextElement;

/* JADX INFO: renamed from: e1.a.c2.t, reason: use source file name */
/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadContext2<T> implements ThreadContextElement<T> {

    /* JADX INFO: renamed from: f */
    public final CoroutineContext.b<?> f29678f;

    /* JADX INFO: renamed from: g */
    public final T f29679g;

    /* JADX INFO: renamed from: h */
    public final ThreadLocal<T> f29680h;

    public ThreadContext2(T t, ThreadLocal<T> threadLocal) {
        this.f29679g = t;
        this.f29680h = threadLocal;
        this.f29678f = new ThreadContext3(threadLocal);
    }

    @Override // p500e1.p501a.ThreadContextElement
    /* JADX INFO: renamed from: f0 */
    public void mo13165f0(CoroutineContext coroutineContext, T t) {
        this.f29680h.set(t);
    }

    @Override // p477d1.p485u.CoroutineContext
    public <R> R fold(R r, InterfaceC6168p<? super R, ? super CoroutineContext.a, ? extends R> interfaceC6168p) {
        return (R) CoroutineContext.a.C8537a.m13059a(this, r, interfaceC6168p);
    }

    @Override // p477d1.p485u.CoroutineContext.a, p477d1.p485u.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        if (Intrinsics2.m13085a(this.f29678f, bVar)) {
            return this;
        }
        return null;
    }

    @Override // p477d1.p485u.CoroutineContext.a
    public CoroutineContext.b<?> getKey() {
        return this.f29678f;
    }

    @Override // p477d1.p485u.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return Intrinsics2.m13085a(this.f29678f, bVar) ? CoroutineContextImpl4.f29535f : this;
    }

    @Override // p477d1.p485u.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.C8537a.m13062d(this, coroutineContext);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ThreadLocal(value=");
        sbM1556G.append(this.f29679g);
        sbM1556G.append(", threadLocal = ");
        sbM1556G.append(this.f29680h);
        sbM1556G.append(')');
        return sbM1556G.toString();
    }

    @Override // p500e1.p501a.ThreadContextElement
    /* JADX INFO: renamed from: z0 */
    public T mo13166z0(CoroutineContext coroutineContext) {
        T t = this.f29680h.get();
        this.f29680h.set(this.f29679g);
        return t;
    }
}
