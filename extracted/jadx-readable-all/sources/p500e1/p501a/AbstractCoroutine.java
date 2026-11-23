package p500e1.p501a;

import p007c.p451o.p452a.C5729a;
import p477d1.NoWhenBranchMatchedException;
import p477d1.Result;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p486i.IntrinsicsJvm;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.TypeIntrinsics;
import p500e1.p501a.p503c2.ThreadContext;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: e1.a.a, reason: use source file name */
/* JADX INFO: compiled from: AbstractCoroutine.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractCoroutine<T> extends C6270h1 implements Job, Continuation<T>, CoroutineScope {

    /* JADX INFO: renamed from: g */
    public final CoroutineContext f29615g;

    /* JADX INFO: renamed from: h */
    public final CoroutineContext f29616h;

    public /* synthetic */ AbstractCoroutine(CoroutineContext coroutineContext, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineContext, (i & 2) != 0 ? true : z);
    }

    @Override // p500e1.p501a.C6270h1
    /* JADX INFO: renamed from: E */
    public String mo13108E() {
        boolean z = CoroutineContext4.f29822a;
        return super.mo13108E();
    }

    @Override // p500e1.p501a.C6270h1
    /* JADX INFO: renamed from: I */
    public final void mo13109I(Object obj) {
        if (obj instanceof CompletionState2) {
            CompletionState2 completionState2 = (CompletionState2) obj;
            Throwable th = completionState2.f29810b;
            completionState2.m13294a();
        }
    }

    @Override // p500e1.p501a.C6270h1
    /* JADX INFO: renamed from: J */
    public final void mo13110J() {
        mo13113T();
    }

    /* JADX INFO: renamed from: R */
    public void mo13111R(Object obj) {
        mo13162d(obj);
    }

    /* JADX INFO: renamed from: S */
    public final void m13112S() {
        m13220A((Job) this.f29616h.get(Job.f29633e));
    }

    /* JADX INFO: renamed from: T */
    public void mo13113T() {
    }

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(Ljava/lang/Object;TR;Ld1/x/b/p<-TR;-Ld1/u/d<-TT;>;+Ljava/lang/Object;>;)V */
    /* JADX INFO: renamed from: U */
    public final void m13114U(int i, Object obj, InterfaceC6168p interfaceC6168p) {
        m13112S();
        int iM15315d = C7804v0.m15315d(i);
        if (iM15315d == 0) {
            C5729a.m12435H(interfaceC6168p, obj, this, null, 4);
            return;
        }
        if (iM15315d != 1) {
            if (iM15315d == 2) {
                Intrinsics2.m13089e(interfaceC6168p, "$this$startCoroutine");
                Intrinsics2.m13089e(this, "completion");
                Continuation continuationM13064b = IntrinsicsJvm.m13064b(IntrinsicsJvm.m13063a(interfaceC6168p, obj, this));
                Unit unit = Unit.f29502a;
                Result.a aVar = Result.f29493f;
                continuationM13064b.mo13056g(unit);
                return;
            }
            if (iM15315d != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics2.m13089e(this, "completion");
            try {
                CoroutineContext coroutineContext = this.f29615g;
                Object objM13164b = ThreadContext.m13164b(coroutineContext, null);
                try {
                    if (interfaceC6168p == null) {
                        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                    }
                    TypeIntrinsics.m13099a(interfaceC6168p, 2);
                    Object objMo5l = interfaceC6168p.mo5l(obj, this);
                    ThreadContext.m13163a(coroutineContext, objM13164b);
                    if (objMo5l != Intrinsics.COROUTINE_SUSPENDED) {
                        Result.a aVar2 = Result.f29493f;
                        mo13056g(objMo5l);
                    }
                } catch (Throwable th) {
                    ThreadContext.m13163a(coroutineContext, objM13164b);
                    throw th;
                }
            } catch (Throwable th2) {
                Result.a aVar3 = Result.f29493f;
                mo13056g(C5729a.m12456k(th2));
            }
        }
    }

    @Override // p500e1.p501a.C6270h1, p500e1.p501a.Job
    /* JADX INFO: renamed from: a */
    public boolean mo13115a() {
        return super.mo13115a();
    }

    @Override // p477d1.p485u.Continuation
    /* JADX INFO: renamed from: g */
    public final void mo13056g(Object obj) throws Throwable {
        Object objM13221C = m13221C(C5729a.m12444Q(obj, null));
        if (objM13221C == C6273i1.f29756b) {
            return;
        }
        mo13111R(objM13221C);
    }

    @Override // p477d1.p485u.Continuation
    public final CoroutineContext getContext() {
        return this.f29615g;
    }

    @Override // p500e1.p501a.CoroutineScope
    /* JADX INFO: renamed from: h */
    public CoroutineContext mo417h() {
        return this.f29615g;
    }

    @Override // p500e1.p501a.C6270h1
    /* JADX INFO: renamed from: m */
    public String mo13116m() {
        return getClass().getSimpleName() + " was cancelled";
    }

    @Override // p500e1.p501a.C6270h1
    /* JADX INFO: renamed from: z */
    public final void mo13117z(Throwable th) {
        C5729a.m12466u(this.f29615g, th);
    }

    public AbstractCoroutine(CoroutineContext coroutineContext, boolean z) {
        super(z);
        this.f29616h = coroutineContext;
        this.f29615g = coroutineContext.plus(this);
    }
}
