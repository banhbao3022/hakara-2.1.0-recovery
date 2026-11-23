package p500e1.p501a;

import p007c.p451o.p452a.C5729a;
import p477d1.Result;
import p477d1.Unit;

/* JADX INFO: renamed from: e1.a.p1 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C6294p1<T> extends AbstractC6267g1 {

    /* JADX INFO: renamed from: j */
    public final CancellableContinuationImpl4<T> f29791j;

    /* JADX WARN: Multi-variable type inference failed */
    public C6294p1(CancellableContinuationImpl4<? super T> cancellableContinuationImpl4) {
        this.f29791j = cancellableContinuationImpl4;
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
        Object objM13242x = m13218r().m13242x();
        if (objM13242x instanceof CompletionState2) {
            CancellableContinuationImpl4<T> cancellableContinuationImpl4 = this.f29791j;
            Throwable th2 = ((CompletionState2) objM13242x).f29810b;
            Result.a aVar = Result.f29493f;
            cancellableContinuationImpl4.mo13056g(C5729a.m12456k(th2));
            return;
        }
        CancellableContinuationImpl4<T> cancellableContinuationImpl5 = this.f29791j;
        Object objM13259a = C6273i1.m13259a(objM13242x);
        Result.a aVar2 = Result.f29493f;
        cancellableContinuationImpl5.mo13056g(objM13259a);
    }
}
