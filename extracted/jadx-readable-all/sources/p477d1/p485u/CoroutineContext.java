package p477d1.p485u;

import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.u.f, reason: use source file name */
/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes.dex */
public interface CoroutineContext {

    /* JADX INFO: renamed from: d1.u.f$a */
    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface a extends CoroutineContext {

        /* JADX INFO: renamed from: d1.u.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CoroutineContext.kt */
        public static final class C8537a {
            /* JADX INFO: renamed from: a */
            public static <R> R m13059a(a aVar, R r, InterfaceC6168p<? super R, ? super a, ? extends R> interfaceC6168p) {
                Intrinsics2.m13089e(interfaceC6168p, "operation");
                return interfaceC6168p.mo5l(r, aVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: b */
            public static <E extends a> E m13060b(a aVar, b<E> bVar) {
                Intrinsics2.m13089e(bVar, "key");
                if (Intrinsics2.m13085a(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            /* JADX INFO: renamed from: c */
            public static CoroutineContext m13061c(a aVar, b<?> bVar) {
                Intrinsics2.m13089e(bVar, "key");
                return Intrinsics2.m13085a(aVar.getKey(), bVar) ? CoroutineContextImpl4.f29535f : aVar;
            }

            /* JADX INFO: renamed from: d */
            public static CoroutineContext m13062d(a aVar, CoroutineContext coroutineContext) {
                Intrinsics2.m13089e(coroutineContext, "context");
                Intrinsics2.m13089e(coroutineContext, "context");
                return coroutineContext == CoroutineContextImpl4.f29535f ? aVar : (CoroutineContext) coroutineContext.fold(aVar, CoroutineContext2.f29534g);
            }
        }

        @Override // p477d1.p485u.CoroutineContext
        <E extends a> E get(b<E> bVar);

        b<?> getKey();
    }

    /* JADX INFO: renamed from: d1.u.f$b */
    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface b<E extends a> {
    }

    <R> R fold(R r, InterfaceC6168p<? super R, ? super a, ? extends R> interfaceC6168p);

    <E extends a> E get(b<E> bVar);

    CoroutineContext minusKey(b<?> bVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
