package p500e1.p501a;

import p477d1.Result;
import p477d1.Unit;
import p477d1.p485u.Continuation;

/* JADX INFO: renamed from: e1.a.q1 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C6297q1 extends AbstractC6267g1 {

    /* JADX INFO: renamed from: j */
    public final Continuation<Unit> f29793j;

    /* JADX WARN: Multi-variable type inference failed */
    public C6297q1(Continuation<? super Unit> continuation) {
        this.f29793j = continuation;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Unit mo3b(Throwable th) {
        mo13120q(th);
        return Unit.f29502a;
    }

    @Override // p500e1.p501a.CompletionHandler2
    /* JADX INFO: renamed from: q */
    public void mo13120q(Throwable th) {
        Continuation<Unit> continuation = this.f29793j;
        Unit unit = Unit.f29502a;
        Result.a aVar = Result.f29493f;
        continuation.mo13056g(unit);
    }
}
