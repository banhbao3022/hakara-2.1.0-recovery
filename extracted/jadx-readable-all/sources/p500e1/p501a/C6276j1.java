package p500e1.p501a;

import p007c.p451o.p452a.C5729a;
import p477d1.Result;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.p486i.IntrinsicsJvm;
import p477d1.p493x.p494b.InterfaceC6168p;
import p500e1.p501a.p503c2.DispatchedContinuation2;

/* JADX INFO: renamed from: e1.a.j1 */
/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C6276j1 extends C6303s1 {

    /* JADX INFO: renamed from: i */
    public final Continuation<Unit> f29767i;

    public C6276j1(CoroutineContext coroutineContext, InterfaceC6168p<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> interfaceC6168p) {
        super(coroutineContext, false);
        this.f29767i = IntrinsicsJvm.m13063a(interfaceC6168p, this, this);
    }

    @Override // p500e1.p501a.AbstractCoroutine
    /* JADX INFO: renamed from: T */
    public void mo13113T() {
        try {
            Continuation continuationM13064b = IntrinsicsJvm.m13064b(this.f29767i);
            Result.a aVar = Result.f29493f;
            DispatchedContinuation2.m13142b(continuationM13064b, Unit.f29502a, null, 2);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f29493f;
            mo13056g(C5729a.m12456k(th));
        }
    }
}
