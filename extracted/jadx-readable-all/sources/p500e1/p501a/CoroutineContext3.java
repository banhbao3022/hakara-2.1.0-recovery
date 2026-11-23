package p500e1.p501a;

import p007c.p451o.p452a.C5729a;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p500e1.p501a.p503c2.Scopes2;
import p500e1.p501a.p503c2.ThreadContext;

/* JADX INFO: renamed from: e1.a.y1, reason: use source file name */
/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineContext3<T> extends Scopes2<T> {

    /* JADX INFO: renamed from: j */
    public CoroutineContext f29820j;

    /* JADX INFO: renamed from: k */
    public Object f29821k;

    /* JADX WARN: Illegal instructions before constructor call */
    public CoroutineContext3(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        CoroutineContext5 coroutineContext5 = CoroutineContext5.f29824f;
        super(coroutineContext.get(coroutineContext5) == null ? coroutineContext.plus(coroutineContext5) : coroutineContext, continuation);
    }

    @Override // p500e1.p501a.p503c2.Scopes2, p500e1.p501a.AbstractCoroutine
    /* JADX INFO: renamed from: R */
    public void mo13111R(Object obj) {
        CoroutineContext coroutineContext = this.f29820j;
        if (coroutineContext != null) {
            ThreadContext.m13163a(coroutineContext, this.f29821k);
            this.f29820j = null;
            this.f29821k = null;
        }
        Object objM12432E = C5729a.m12432E(obj, this.f29668i);
        Continuation<T> continuation = this.f29668i;
        CoroutineContext context = continuation.getContext();
        Object objM13164b = ThreadContext.m13164b(context, null);
        CoroutineContext3<?> coroutineContext3M13298b = objM13164b != ThreadContext.f29671a ? CoroutineContext4.m13298b(continuation, context, objM13164b) : null;
        try {
            this.f29668i.mo13056g(objM12432E);
        } finally {
            if (coroutineContext3M13298b == null || coroutineContext3M13298b.m13296V()) {
                ThreadContext.m13163a(context, objM13164b);
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m13296V() {
        if (this.f29820j == null) {
            return false;
        }
        this.f29820j = null;
        this.f29821k = null;
        return true;
    }
}
