package p477d1.p485u;

import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: d1.u.g, reason: use source file name */
/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineContext2 extends Lambda implements InterfaceC6168p<CoroutineContext, CoroutineContext.a, CoroutineContext> {

    /* JADX INFO: renamed from: g */
    public static final CoroutineContext2 f29534g = new CoroutineContext2();

    public CoroutineContext2() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public CoroutineContext mo5l(CoroutineContext coroutineContext, CoroutineContext.a aVar) {
        CoroutineContextImpl3 coroutineContextImpl3;
        CoroutineContext coroutineContext2 = coroutineContext;
        CoroutineContext.a aVar2 = aVar;
        Intrinsics2.m13089e(coroutineContext2, "acc");
        Intrinsics2.m13089e(aVar2, "element");
        CoroutineContext coroutineContextMinusKey = coroutineContext2.minusKey(aVar2.getKey());
        CoroutineContextImpl4 coroutineContextImpl4 = CoroutineContextImpl4.f29535f;
        if (coroutineContextMinusKey == coroutineContextImpl4) {
            return aVar2;
        }
        int i = ContinuationInterceptor.f29532c;
        ContinuationInterceptor.a aVar3 = ContinuationInterceptor.a.f29533f;
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContextMinusKey.get(aVar3);
        if (continuationInterceptor == null) {
            coroutineContextImpl3 = new CoroutineContextImpl3(coroutineContextMinusKey, aVar2);
        } else {
            CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(aVar3);
            if (coroutineContextMinusKey2 == coroutineContextImpl4) {
                return new CoroutineContextImpl3(aVar2, continuationInterceptor);
            }
            coroutineContextImpl3 = new CoroutineContextImpl3(new CoroutineContextImpl3(coroutineContextMinusKey2, aVar2), continuationInterceptor);
        }
        return coroutineContextImpl3;
    }
}
