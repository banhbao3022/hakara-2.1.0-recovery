package p477d1.p485u.p487j.p488a;

import p477d1.p485u.Continuation;
import p477d1.p485u.ContinuationInterceptor;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.u.j.a.c, reason: use source file name */
/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class ContinuationImpl3 extends ContinuationImpl {

    /* JADX INFO: renamed from: g */
    public transient Continuation<Object> f29549g;

    /* JADX INFO: renamed from: h */
    public final CoroutineContext f29550h;

    public ContinuationImpl3(Continuation<Object> continuation, CoroutineContext coroutineContext) {
        super(continuation);
        this.f29550h = coroutineContext;
    }

    @Override // p477d1.p485u.Continuation
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f29550h;
        Intrinsics2.m13087c(coroutineContext);
        return coroutineContext;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: n */
    public void mo13067n() {
        Continuation<?> continuation = this.f29549g;
        if (continuation != null && continuation != this) {
            CoroutineContext coroutineContext = this.f29550h;
            Intrinsics2.m13087c(coroutineContext);
            int i = ContinuationInterceptor.f29532c;
            CoroutineContext.a aVar = coroutineContext.get(ContinuationInterceptor.a.f29533f);
            Intrinsics2.m13087c(aVar);
            ((ContinuationInterceptor) aVar).mo13057c(continuation);
        }
        this.f29549g = ContinuationImpl2.f29548f;
    }

    public ContinuationImpl3(Continuation<Object> continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }
}
