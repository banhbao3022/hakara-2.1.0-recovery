package p477d1.p485u.p487j.p488a;

import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.CoroutineContextImpl4;

/* JADX INFO: renamed from: d1.u.j.a.g, reason: use source file name */
/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class ContinuationImpl4 extends ContinuationImpl {
    public ContinuationImpl4(Continuation<Object> continuation) {
        super(continuation);
        if (continuation != null) {
            if (!(continuation.getContext() == CoroutineContextImpl4.f29535f)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // p477d1.p485u.Continuation
    public CoroutineContext getContext() {
        return CoroutineContextImpl4.f29535f;
    }
}
