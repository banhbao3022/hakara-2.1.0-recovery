package p500e1.p501a.p503c2;

import java.util.concurrent.CancellationException;
import p007c.p451o.p452a.C5729a;
import p477d1.Result;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p494b.InterfaceC6164l;
import p500e1.p501a.AbstractC6290o0;
import p500e1.p501a.C6312v1;
import p500e1.p501a.CompletionState3;
import p500e1.p501a.CoroutineContext3;
import p500e1.p501a.CoroutineContext4;
import p500e1.p501a.Job;

/* JADX INFO: renamed from: e1.a.c2.g, reason: use source file name */
/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DispatchedContinuation2 {

    /* JADX INFO: renamed from: a */
    public static final Symbol f29647a = new Symbol("UNDEFINED");

    /* JADX INFO: renamed from: b */
    public static final Symbol f29648b = new Symbol("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: a */
    public static final <T> void m13141a(Continuation<? super T> continuation, Object obj, InterfaceC6164l<? super Throwable, Unit> interfaceC6164l) {
        boolean z;
        if (!(continuation instanceof DispatchedContinuation)) {
            continuation.mo13056g(obj);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        Object objM12444Q = C5729a.m12444Q(obj, interfaceC6164l);
        if (dispatchedContinuation.f29645l.mo13119G0(dispatchedContinuation.getContext())) {
            dispatchedContinuation.f29643j = objM12444Q;
            dispatchedContinuation.f29754h = 1;
            dispatchedContinuation.f29645l.mo13118F0(dispatchedContinuation.getContext(), dispatchedContinuation);
            return;
        }
        C6312v1 c6312v1 = C6312v1.f29813b;
        AbstractC6290o0 abstractC6290o0M13295a = C6312v1.m13295a();
        if (abstractC6290o0M13295a.m13278L0()) {
            dispatchedContinuation.f29643j = objM12444Q;
            dispatchedContinuation.f29754h = 1;
            abstractC6290o0M13295a.m13276J0(dispatchedContinuation);
            return;
        }
        abstractC6290o0M13295a.m13277K0(true);
        try {
            Job job = (Job) dispatchedContinuation.getContext().get(Job.f29633e);
            if (job == null || job.mo13115a()) {
                z = false;
            } else {
                CancellationException cancellationExceptionMo13127H = job.mo13127H();
                if (objM12444Q instanceof CompletionState3) {
                    ((CompletionState3) objM12444Q).f29815b.mo3b(cancellationExceptionMo13127H);
                }
                Result.a aVar = Result.f29493f;
                dispatchedContinuation.mo13056g(C5729a.m12456k(cancellationExceptionMo13127H));
                z = true;
            }
            if (!z) {
                Continuation<T> continuation2 = dispatchedContinuation.f29646m;
                Object obj2 = dispatchedContinuation.f29644k;
                CoroutineContext context = continuation2.getContext();
                Object objM13164b = ThreadContext.m13164b(context, obj2);
                CoroutineContext3<?> coroutineContext3M13298b = objM13164b != ThreadContext.f29671a ? CoroutineContext4.m13298b(continuation2, context, objM13164b) : null;
                try {
                    dispatchedContinuation.f29646m.mo13056g(obj);
                    if (coroutineContext3M13298b == null || coroutineContext3M13298b.m13296V()) {
                        ThreadContext.m13163a(context, objM13164b);
                    }
                } catch (Throwable th) {
                    if (coroutineContext3M13298b == null || coroutineContext3M13298b.m13296V()) {
                        ThreadContext.m13163a(context, objM13164b);
                    }
                    throw th;
                }
            }
            while (abstractC6290o0M13295a.m13280N0()) {
            }
        } catch (Throwable th2) {
            try {
                dispatchedContinuation.m13258f(th2, null);
            } finally {
                abstractC6290o0M13295a.m13274H0(true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13142b(Continuation continuation, Object obj, InterfaceC6164l interfaceC6164l, int i) {
        int i2 = i & 2;
        m13141a(continuation, obj, null);
    }
}
