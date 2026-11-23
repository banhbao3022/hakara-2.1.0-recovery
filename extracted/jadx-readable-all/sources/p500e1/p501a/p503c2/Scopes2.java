package p500e1.p501a.p503c2;

import p007c.p451o.p452a.C5729a;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.p486i.IntrinsicsJvm;
import p477d1.p485u.p487j.p488a.CoroutineStackFrame;
import p500e1.p501a.AbstractCoroutine;

/* JADX INFO: renamed from: e1.a.c2.p, reason: use source file name */
/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes.dex */
public class Scopes2<T> extends AbstractCoroutine<T> implements CoroutineStackFrame {

    /* JADX INFO: renamed from: i */
    public final Continuation<T> f29668i;

    /* JADX WARN: Multi-variable type inference failed */
    public Scopes2(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, true);
        this.f29668i = continuation;
    }

    @Override // p500e1.p501a.C6270h1
    /* JADX INFO: renamed from: B */
    public final boolean mo13161B() {
        return true;
    }

    @Override // p500e1.p501a.AbstractCoroutine
    /* JADX INFO: renamed from: R */
    public void mo13111R(Object obj) {
        Continuation<T> continuation = this.f29668i;
        continuation.mo13056g(C5729a.m12432E(obj, continuation));
    }

    @Override // p500e1.p501a.C6270h1
    /* JADX INFO: renamed from: d */
    public void mo13162d(Object obj) {
        DispatchedContinuation2.m13142b(IntrinsicsJvm.m13064b(this.f29668i), C5729a.m12432E(obj, this.f29668i), null, 2);
    }

    @Override // p477d1.p485u.p487j.p488a.CoroutineStackFrame
    /* JADX INFO: renamed from: e */
    public final CoroutineStackFrame mo13065e() {
        Continuation<T> continuation = this.f29668i;
        if (!(continuation instanceof CoroutineStackFrame)) {
            continuation = null;
        }
        return (CoroutineStackFrame) continuation;
    }
}
