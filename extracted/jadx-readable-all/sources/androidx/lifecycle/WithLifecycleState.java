package androidx.lifecycle;

import p007c.p451o.p452a.C5729a;
import p477d1.Result;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CancellableContinuation;
import p500e1.p501a.CoroutineDispatcher;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.WithLifecycleState2;

/* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1, reason: use source file name */
/* JADX INFO: compiled from: WithLifecycleState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WithLifecycleState implements LifecycleEventObserver {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CancellableContinuation f795f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle3 f796g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Lifecycle3.b f797h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC6153a f798i;

    public WithLifecycleState(CancellableContinuation cancellableContinuation, Lifecycle3 lifecycle3, Lifecycle3.b bVar, InterfaceC6153a interfaceC6153a, boolean z, CoroutineDispatcher coroutineDispatcher) {
        this.f795f = cancellableContinuation;
        this.f796g = lifecycle3;
        this.f797h = bVar;
        this.f798i = interfaceC6153a;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: c */
    public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
        Object objM12456k;
        Intrinsics2.m13089e(lifecycleOwner, "source");
        Intrinsics2.m13089e(aVar, "event");
        if (aVar != Lifecycle3.a.upTo(this.f797h)) {
            if (aVar == Lifecycle3.a.ON_DESTROY) {
                this.f796g.mo16729c(this);
                CancellableContinuation cancellableContinuation = this.f795f;
                WithLifecycleState2 withLifecycleState2 = new WithLifecycleState2();
                Result.a aVar2 = Result.f29493f;
                cancellableContinuation.mo13056g(C5729a.m12456k(withLifecycleState2));
                return;
            }
            return;
        }
        this.f796g.mo16729c(this);
        CancellableContinuation cancellableContinuation2 = this.f795f;
        InterfaceC6153a interfaceC6153a = this.f798i;
        try {
            Result.a aVar3 = Result.f29493f;
            objM12456k = interfaceC6153a.mo2c();
        } catch (Throwable th) {
            Result.a aVar4 = Result.f29493f;
            objM12456k = C5729a.m12456k(th);
        }
        cancellableContinuation2.mo13056g(objM12456k);
    }
}
