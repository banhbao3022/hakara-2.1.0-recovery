package p500e1.p501a;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.Result;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.CoroutineStackFrame;
import p477d1.p493x.p494b.InterfaceC6164l;
import p500e1.p501a.p503c2.DispatchedContinuation;

/* JADX INFO: renamed from: e1.a.j, reason: use source file name */
/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public class CancellableContinuationImpl4<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29762i = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl4.class, "_decision");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29763j = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl4.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: k */
    public final CoroutineContext f29764k;

    /* JADX INFO: renamed from: l */
    public final Continuation<T> f29765l;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl4(Continuation<? super T> continuation, int i) {
        super(i);
        this.f29765l = continuation;
        this.f29764k = continuation.getContext();
        this._decision = 0;
        this._state = CancellableContinuationImpl.f29622f;
        this._parentHandle = null;
    }

    /* JADX INFO: renamed from: w */
    public static void m13260w(CancellableContinuationImpl4 cancellableContinuationImpl4, Object obj, int i, InterfaceC6164l interfaceC6164l, int i2, Object obj2) {
        Object obj3;
        Object cancellableContinuationImpl6;
        do {
            InterfaceC6164l interfaceC6164l2 = null;
            obj3 = cancellableContinuationImpl4._state;
            if (!(obj3 instanceof CancellableContinuationImpl5)) {
                if (obj3 instanceof CompletionState) {
                    CompletionState completionState = (CompletionState) obj3;
                    Objects.requireNonNull(completionState);
                    if (CompletionState.f29768c.compareAndSet(completionState, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(outline.m1598t("Already resumed, but proposed with update ", obj).toString());
            }
            CancellableContinuationImpl5 cancellableContinuationImpl5 = (CancellableContinuationImpl5) obj3;
            if (!(obj instanceof CompletionState2) && C5729a.m12468w(i) && (cancellableContinuationImpl5 instanceof CancellableContinuationImpl3) && !(cancellableContinuationImpl5 instanceof CancellableContinuationImpl2)) {
                if (!(cancellableContinuationImpl5 instanceof CancellableContinuationImpl3)) {
                    cancellableContinuationImpl5 = null;
                }
                cancellableContinuationImpl6 = new CancellableContinuationImpl6(obj, (CancellableContinuationImpl3) cancellableContinuationImpl5, interfaceC6164l2, null, null, 16, null);
            } else {
                cancellableContinuationImpl6 = obj;
            }
        } while (!f29763j.compareAndSet(cancellableContinuationImpl4, obj3, cancellableContinuationImpl6));
        cancellableContinuationImpl4.m13266p();
        cancellableContinuationImpl4.m13267q(i);
    }

    @Override // p500e1.p501a.DispatchedTask
    /* JADX INFO: renamed from: a */
    public void mo13134a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof CancellableContinuationImpl5) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof CompletionState2) {
                return;
            }
            if (obj2 instanceof CancellableContinuationImpl6) {
                CancellableContinuationImpl6 cancellableContinuationImpl6 = (CancellableContinuationImpl6) obj2;
                if (!(!(cancellableContinuationImpl6.f29807e != null))) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (f29763j.compareAndSet(this, obj2, CancellableContinuationImpl6.m13293a(cancellableContinuationImpl6, null, null, null, null, th, 15))) {
                    CancellableContinuationImpl3 cancellableContinuationImpl3 = cancellableContinuationImpl6.f29804b;
                    if (cancellableContinuationImpl3 != null) {
                        m13262l(cancellableContinuationImpl3, th);
                    }
                    InterfaceC6164l<Throwable, Unit> interfaceC6164l = cancellableContinuationImpl6.f29805c;
                    if (interfaceC6164l != null) {
                        m13263m(interfaceC6164l, th);
                        return;
                    }
                    return;
                }
            } else if (f29763j.compareAndSet(this, obj2, new CancellableContinuationImpl6(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // p500e1.p501a.DispatchedTask
    /* JADX INFO: renamed from: b */
    public final Continuation<T> mo13135b() {
        return this.f29765l;
    }

    @Override // p500e1.p501a.DispatchedTask
    /* JADX INFO: renamed from: c */
    public Throwable mo13256c(Object obj) {
        Throwable thMo13256c = super.mo13256c(obj);
        if (thMo13256c != null) {
            return thMo13256c;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p500e1.p501a.DispatchedTask
    /* JADX INFO: renamed from: d */
    public <T> T mo13257d(Object obj) {
        return obj instanceof CancellableContinuationImpl6 ? (T) ((CancellableContinuationImpl6) obj).f29803a : obj;
    }

    @Override // p477d1.p485u.p487j.p488a.CoroutineStackFrame
    /* JADX INFO: renamed from: e */
    public CoroutineStackFrame mo13065e() {
        Continuation<T> continuation = this.f29765l;
        if (!(continuation instanceof CoroutineStackFrame)) {
            continuation = null;
        }
        return (CoroutineStackFrame) continuation;
    }

    @Override // p477d1.p485u.Continuation
    /* JADX INFO: renamed from: g */
    public void mo13056g(Object obj) {
        Throwable thM13022a = Result.m13022a(obj);
        if (thM13022a != null) {
            obj = new CompletionState2(thM13022a, false, 2, null);
        }
        m13260w(this, obj, this.f29754h, null, 4, null);
    }

    @Override // p477d1.p485u.Continuation
    public CoroutineContext getContext() {
        return this.f29764k;
    }

    @Override // p500e1.p501a.DispatchedTask
    /* JADX INFO: renamed from: h */
    public Object mo13136h() {
        return this._state;
    }

    @Override // p500e1.p501a.CancellableContinuation
    /* JADX INFO: renamed from: i */
    public void mo13254i(InterfaceC6164l<? super Throwable, Unit> interfaceC6164l) {
        CancellableContinuationImpl3 cancellableContinuationImpl7 = interfaceC6164l instanceof CancellableContinuationImpl3 ? (CancellableContinuationImpl3) interfaceC6164l : new CancellableContinuationImpl7(interfaceC6164l);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof CancellableContinuationImpl)) {
                if (obj instanceof CancellableContinuationImpl3) {
                    m13270u(interfaceC6164l, obj);
                    throw null;
                }
                boolean z = obj instanceof CompletionState2;
                if (z) {
                    CompletionState2 completionState2 = (CompletionState2) obj;
                    Objects.requireNonNull(completionState2);
                    if (!CompletionState2.f29809a.compareAndSet(completionState2, 0, 1)) {
                        m13270u(interfaceC6164l, obj);
                        throw null;
                    }
                    if (obj instanceof CompletionState) {
                        if (!z) {
                            obj = null;
                        }
                        CompletionState2 completionState3 = (CompletionState2) obj;
                        m13261k(interfaceC6164l, completionState3 != null ? completionState3.f29810b : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof CancellableContinuationImpl6) {
                    CancellableContinuationImpl6 cancellableContinuationImpl6 = (CancellableContinuationImpl6) obj;
                    if (cancellableContinuationImpl6.f29804b != null) {
                        m13270u(interfaceC6164l, obj);
                        throw null;
                    }
                    if (cancellableContinuationImpl7 instanceof CancellableContinuationImpl2) {
                        return;
                    }
                    Throwable th = cancellableContinuationImpl6.f29807e;
                    if (th != null) {
                        m13261k(interfaceC6164l, th);
                        return;
                    } else {
                        if (f29763j.compareAndSet(this, obj, CancellableContinuationImpl6.m13293a(cancellableContinuationImpl6, null, cancellableContinuationImpl7, null, null, null, 29))) {
                            return;
                        }
                    }
                } else {
                    if (cancellableContinuationImpl7 instanceof CancellableContinuationImpl2) {
                        return;
                    }
                    if (f29763j.compareAndSet(this, obj, new CancellableContinuationImpl6(obj, cancellableContinuationImpl7, null, null, null, 28, null))) {
                        return;
                    }
                }
            } else if (f29763j.compareAndSet(this, obj, cancellableContinuationImpl7)) {
                return;
            }
        }
    }

    @Override // p500e1.p501a.CancellableContinuation
    /* JADX INFO: renamed from: j */
    public void mo13255j(CoroutineDispatcher coroutineDispatcher, T t) {
        Continuation<T> continuation = this.f29765l;
        if (!(continuation instanceof DispatchedContinuation)) {
            continuation = null;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        m13260w(this, t, (dispatchedContinuation != null ? dispatchedContinuation.f29645l : null) == coroutineDispatcher ? 4 : this.f29754h, null, 4, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m13261k(InterfaceC6164l<? super Throwable, Unit> interfaceC6164l, Throwable th) {
        try {
            interfaceC6164l.mo3b(th);
        } catch (Throwable th2) {
            C5729a.m12466u(this.f29764k, new C6319y("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13262l(CancellableContinuationImpl3 cancellableContinuationImpl3, Throwable th) {
        try {
            cancellableContinuationImpl3.mo13213a(th);
        } catch (Throwable th2) {
            C5729a.m12466u(this.f29764k, new C6319y("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m13263m(InterfaceC6164l<? super Throwable, Unit> interfaceC6164l, Throwable th) {
        try {
            interfaceC6164l.mo3b(th);
        } catch (Throwable th2) {
            C5729a.m12466u(this.f29764k, new C6319y("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m13264n(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof CancellableContinuationImpl5)) {
                return false;
            }
            z = obj instanceof CancellableContinuationImpl3;
        } while (!f29763j.compareAndSet(this, obj, new CompletionState(this, th, z)));
        if (!z) {
            obj = null;
        }
        CancellableContinuationImpl3 cancellableContinuationImpl3 = (CancellableContinuationImpl3) obj;
        if (cancellableContinuationImpl3 != null) {
            m13262l(cancellableContinuationImpl3, th);
        }
        m13266p();
        m13267q(this.f29754h);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m13265o() {
        Job2 job2 = (Job2) this._parentHandle;
        if (job2 != null) {
            job2.dispose();
        }
        this._parentHandle = Job4.f29773f;
    }

    /* JADX INFO: renamed from: p */
    public final void m13266p() {
        if (m13269t()) {
            return;
        }
        Job2 job2 = (Job2) this._parentHandle;
        if (job2 != null) {
            job2.dispose();
        }
        this._parentHandle = Job4.f29773f;
    }

    /* JADX INFO: renamed from: q */
    public final void m13267q(int i) {
        boolean z;
        while (true) {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                z = false;
                break;
            } else if (f29762i.compareAndSet(this, 0, 2)) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        Continuation<T> continuationMo13135b = mo13135b();
        boolean z2 = i == 4;
        if (z2 || !(continuationMo13135b instanceof DispatchedContinuation) || C5729a.m12468w(i) != C5729a.m12468w(this.f29754h)) {
            C5729a.m12434G(this, continuationMo13135b, z2);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((DispatchedContinuation) continuationMo13135b).f29645l;
        CoroutineContext context = continuationMo13135b.getContext();
        if (coroutineDispatcher.mo13119G0(context)) {
            coroutineDispatcher.mo13118F0(context, this);
            return;
        }
        C6312v1 c6312v1 = C6312v1.f29813b;
        AbstractC6290o0 abstractC6290o0M13295a = C6312v1.m13295a();
        if (abstractC6290o0M13295a.m13278L0()) {
            abstractC6290o0M13295a.m13276J0(this);
            return;
        }
        abstractC6290o0M13295a.m13277K0(true);
        try {
            C5729a.m12434G(this, mo13135b(), true);
            do {
            } while (abstractC6290o0M13295a.m13280N0());
        } catch (Throwable th) {
            try {
                m13258f(th, null);
            } finally {
                abstractC6290o0M13295a.m13274H0(true);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public Throwable mo13244r(Job job) {
        return ((C6270h1) job).mo13127H();
    }

    /* JADX INFO: renamed from: s */
    public final Object m13268s() {
        boolean z;
        Job job;
        m13271x();
        while (true) {
            int i = this._decision;
            z = false;
            if (i != 0) {
                if (i == 2) {
                    break;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
            if (f29762i.compareAndSet(this, 0, 1)) {
                z = true;
                break;
            }
        }
        if (z) {
            return Intrinsics.COROUTINE_SUSPENDED;
        }
        Object obj = this._state;
        if (obj instanceof CompletionState2) {
            throw ((CompletionState2) obj).f29810b;
        }
        if (!C5729a.m12468w(this.f29754h) || (job = (Job) this.f29764k.get(Job.f29633e)) == null || job.mo13115a()) {
            return mo13257d(obj);
        }
        CancellationException cancellationExceptionMo13127H = job.mo13127H();
        mo13134a(obj, cancellationExceptionMo13127H);
        throw cancellationExceptionMo13127H;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m13269t() {
        Continuation<T> continuation = this.f29765l;
        return (continuation instanceof DispatchedContinuation) && ((DispatchedContinuation) continuation).m13139m(this);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo13245v());
        sb.append('(');
        sb.append(C5729a.m12443P(this.f29765l));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof CancellableContinuationImpl5) {
            str = "Active";
        } else {
            str = obj instanceof CompletionState ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(C5729a.m12463r(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m13270u(InterfaceC6164l<? super Throwable, Unit> interfaceC6164l, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC6164l + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: v */
    public String mo13245v() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: x */
    public final void m13271x() {
        Job job;
        Throwable thM13137k;
        boolean z = !(this._state instanceof CancellableContinuationImpl5);
        if (this.f29754h == 2) {
            Continuation<T> continuation = this.f29765l;
            if (!(continuation instanceof DispatchedContinuation)) {
                continuation = null;
            }
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
            if (dispatchedContinuation != null && (thM13137k = dispatchedContinuation.m13137k(this)) != null) {
                if (!z) {
                    m13264n(thM13137k);
                }
                z = true;
            }
        }
        if (z || ((Job2) this._parentHandle) != null || (job = (Job) this.f29765l.getContext().get(Job.f29633e)) == null) {
            return;
        }
        Job2 job2M12467v = C5729a.m12467v(job, true, false, new C6280l(this), 2, null);
        this._parentHandle = job2M12467v;
        if (!(true ^ (this._state instanceof CancellableContinuationImpl5)) || m13269t()) {
            return;
        }
        job2M12467v.dispose();
        this._parentHandle = Job4.f29773f;
    }
}
