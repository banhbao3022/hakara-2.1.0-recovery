package p500e1.p501a;

import p477d1.Unit;
import p477d1.p485u.Continuation;
import p500e1.p501a.p503c2.DispatchedContinuation;

/* JADX INFO: renamed from: e1.a.l */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C6280l extends AbstractC6261e1 {

    /* JADX INFO: renamed from: j */
    public final CancellableContinuationImpl4<?> f29771j;

    public C6280l(CancellableContinuationImpl4<?> cancellableContinuationImpl4) {
        this.f29771j = cancellableContinuationImpl4;
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
        CancellableContinuationImpl4<?> cancellableContinuationImpl4 = this.f29771j;
        Throwable thMo13244r = cancellableContinuationImpl4.mo13244r(m13218r());
        boolean zM13140n = false;
        if (cancellableContinuationImpl4.f29754h == 2) {
            Continuation<?> continuation = cancellableContinuationImpl4.f29765l;
            if (!(continuation instanceof DispatchedContinuation)) {
                continuation = null;
            }
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
            if (dispatchedContinuation != null) {
                zM13140n = dispatchedContinuation.m13140n(thMo13244r);
            }
        }
        if (zM13140n) {
            return;
        }
        cancellableContinuationImpl4.m13264n(thMo13244r);
        cancellableContinuationImpl4.m13266p();
    }
}
