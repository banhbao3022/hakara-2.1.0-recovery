package p500e1.p501a;

import java.util.concurrent.CancellationException;
import p007c.p451o.p452a.C5729a;
import p477d1.Exceptions;
import p477d1.Result;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.p503c2.DispatchedContinuation;
import p500e1.p501a.p503c2.ThreadContext;
import p500e1.p501a.p504d2.Tasks5;
import p500e1.p501a.p504d2.Tasks6;

/* JADX INFO: renamed from: e1.a.i0, reason: use source file name */
/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class DispatchedTask<T> extends Tasks5 {

    /* JADX INFO: renamed from: h */
    public int f29754h;

    public DispatchedTask(int i) {
        this.f29754h = i;
    }

    /* JADX INFO: renamed from: a */
    public void mo13134a(Object obj, Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public abstract Continuation<T> mo13135b();

    /* JADX INFO: renamed from: c */
    public Throwable mo13256c(Object obj) {
        if (!(obj instanceof CompletionState2)) {
            obj = null;
        }
        CompletionState2 completionState2 = (CompletionState2) obj;
        if (completionState2 != null) {
            return completionState2.f29810b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public <T> T mo13257d(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: f */
    public final void m13258f(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            Exceptions.m12964a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics2.m13087c(th);
        C5729a.m12466u(mo13135b().getContext(), new C6244d0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo13136h();

    @Override // java.lang.Runnable
    public final void run() {
        Object objM12456k;
        Tasks6 tasks6 = this.f29725g;
        try {
            Continuation<T> continuationMo13135b = mo13135b();
            if (continuationMo13135b == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
            }
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuationMo13135b;
            Continuation<T> continuation = dispatchedContinuation.f29646m;
            Object obj = dispatchedContinuation.f29644k;
            CoroutineContext context = continuation.getContext();
            Object objM13164b = ThreadContext.m13164b(context, obj);
            CoroutineContext3<?> coroutineContext3M13298b = objM13164b != ThreadContext.f29671a ? CoroutineContext4.m13298b(continuation, context, objM13164b) : null;
            try {
                CoroutineContext context2 = continuation.getContext();
                Object objMo13136h = mo13136h();
                Throwable thMo13256c = mo13256c(objMo13136h);
                Job job = (thMo13256c == null && C5729a.m12468w(this.f29754h)) ? (Job) context2.get(Job.f29633e) : null;
                if (job != null && !job.mo13115a()) {
                    CancellationException cancellationExceptionMo13127H = job.mo13127H();
                    mo13134a(objMo13136h, cancellationExceptionMo13127H);
                    Result.a aVar = Result.f29493f;
                    continuation.mo13056g(C5729a.m12456k(cancellationExceptionMo13127H));
                } else if (thMo13256c != null) {
                    Result.a aVar2 = Result.f29493f;
                    continuation.mo13056g(C5729a.m12456k(thMo13256c));
                } else {
                    T tMo13257d = mo13257d(objMo13136h);
                    Result.a aVar3 = Result.f29493f;
                    continuation.mo13056g(tMo13257d);
                }
                Object objM12456k2 = Unit.f29502a;
                if (coroutineContext3M13298b == null || coroutineContext3M13298b.m13296V()) {
                    ThreadContext.m13163a(context, objM13164b);
                }
                try {
                    Result.a aVar4 = Result.f29493f;
                    tasks6.mo13198B();
                } catch (Throwable th) {
                    Result.a aVar5 = Result.f29493f;
                    objM12456k2 = C5729a.m12456k(th);
                }
                m13258f(null, Result.m13022a(objM12456k2));
            } catch (Throwable th2) {
                if (coroutineContext3M13298b == null || coroutineContext3M13298b.m13296V()) {
                    ThreadContext.m13163a(context, objM13164b);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                Result.a aVar6 = Result.f29493f;
                tasks6.mo13198B();
                objM12456k = Unit.f29502a;
            } catch (Throwable th4) {
                Result.a aVar7 = Result.f29493f;
                objM12456k = C5729a.m12456k(th4);
            }
            m13258f(th3, Result.m13022a(objM12456k));
        }
    }
}
