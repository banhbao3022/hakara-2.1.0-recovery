package p500e1.p501a.p503c2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.p487j.p488a.CoroutineStackFrame;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.AbstractC6290o0;
import p500e1.p501a.C6312v1;
import p500e1.p501a.CancellableContinuation;
import p500e1.p501a.CancellableContinuationImpl4;
import p500e1.p501a.CompletionState3;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.DispatchedTask;

/* JADX INFO: renamed from: e1.a.c2.f, reason: use source file name */
/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DispatchedContinuation<T> extends DispatchedTask<T> implements CoroutineStackFrame, Continuation<T> {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29642i = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: j */
    public Object f29643j;

    /* JADX INFO: renamed from: k */
    public final Object f29644k;

    /* JADX INFO: renamed from: l */
    public final CoroutineDispatcher f29645l;

    /* JADX INFO: renamed from: m */
    public final Continuation<T> f29646m;

    /* JADX WARN: Multi-variable type inference failed */
    public DispatchedContinuation(CoroutineDispatcher coroutineDispatcher, Continuation<? super T> continuation) {
        super(-1);
        this.f29645l = coroutineDispatcher;
        this.f29646m = continuation;
        this.f29643j = DispatchedContinuation2.f29647a;
        Object objFold = getContext().fold(0, ThreadContext.f29672b);
        Intrinsics2.m13087c(objFold);
        this.f29644k = objFold;
        this._reusableCancellableContinuation = null;
    }

    @Override // p500e1.p501a.DispatchedTask
    /* JADX INFO: renamed from: a */
    public void mo13134a(Object obj, Throwable th) {
        if (obj instanceof CompletionState3) {
            ((CompletionState3) obj).f29815b.mo3b(th);
        }
    }

    @Override // p500e1.p501a.DispatchedTask
    /* JADX INFO: renamed from: b */
    public Continuation<T> mo13135b() {
        return this;
    }

    @Override // p477d1.p485u.p487j.p488a.CoroutineStackFrame
    /* JADX INFO: renamed from: e */
    public CoroutineStackFrame mo13065e() {
        Continuation<T> continuation = this.f29646m;
        if (!(continuation instanceof CoroutineStackFrame)) {
            continuation = null;
        }
        return (CoroutineStackFrame) continuation;
    }

    @Override // p477d1.p485u.Continuation
    /* JADX INFO: renamed from: g */
    public void mo13056g(Object obj) {
        CoroutineContext context = this.f29646m.getContext();
        Object objM12444Q = C5729a.m12444Q(obj, null);
        if (this.f29645l.mo13119G0(context)) {
            this.f29643j = objM12444Q;
            this.f29754h = 0;
            this.f29645l.mo13118F0(context, this);
            return;
        }
        C6312v1 c6312v1 = C6312v1.f29813b;
        AbstractC6290o0 abstractC6290o0M13295a = C6312v1.m13295a();
        if (abstractC6290o0M13295a.m13278L0()) {
            this.f29643j = objM12444Q;
            this.f29754h = 0;
            abstractC6290o0M13295a.m13276J0(this);
            return;
        }
        abstractC6290o0M13295a.m13277K0(true);
        try {
            CoroutineContext context2 = getContext();
            Object objM13164b = ThreadContext.m13164b(context2, this.f29644k);
            try {
                this.f29646m.mo13056g(obj);
                ThreadContext.m13163a(context2, objM13164b);
                while (abstractC6290o0M13295a.m13280N0()) {
                }
            } catch (Throwable th) {
                ThreadContext.m13163a(context2, objM13164b);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m13258f(th2, null);
            } finally {
                abstractC6290o0M13295a.m13274H0(true);
            }
        }
    }

    @Override // p477d1.p485u.Continuation
    public CoroutineContext getContext() {
        return this.f29646m.getContext();
    }

    @Override // p500e1.p501a.DispatchedTask
    /* JADX INFO: renamed from: h */
    public Object mo13136h() {
        Object obj = this.f29643j;
        this.f29643j = DispatchedContinuation2.f29647a;
        return obj;
    }

    /* JADX INFO: renamed from: k */
    public final Throwable m13137k(CancellableContinuation<?> cancellableContinuation) {
        Symbol symbol;
        do {
            Object obj = this._reusableCancellableContinuation;
            symbol = DispatchedContinuation2.f29648b;
            if (obj != symbol) {
                if (obj == null) {
                    return null;
                }
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(outline.m1598t("Inconsistent state ", obj).toString());
                }
                if (f29642i.compareAndSet(this, obj, null)) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } while (!f29642i.compareAndSet(this, symbol, cancellableContinuation));
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final CancellableContinuationImpl4<?> m13138l() {
        Object obj = this._reusableCancellableContinuation;
        if (!(obj instanceof CancellableContinuationImpl4)) {
            obj = null;
        }
        return (CancellableContinuationImpl4) obj;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m13139m(CancellableContinuationImpl4<?> cancellableContinuationImpl4) {
        Object obj = this._reusableCancellableContinuation;
        if (obj != null) {
            return !(obj instanceof CancellableContinuationImpl4) || obj == cancellableContinuationImpl4;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m13140n(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            Symbol symbol = DispatchedContinuation2.f29648b;
            if (Intrinsics2.m13085a(obj, symbol)) {
                if (f29642i.compareAndSet(this, symbol, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (f29642i.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("DispatchedContinuation[");
        sbM1556G.append(this.f29645l);
        sbM1556G.append(", ");
        sbM1556G.append(C5729a.m12443P(this.f29646m));
        sbM1556G.append(']');
        return sbM1556G.toString();
    }
}
