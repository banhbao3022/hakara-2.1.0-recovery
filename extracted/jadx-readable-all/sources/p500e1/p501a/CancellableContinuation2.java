package p500e1.p501a;

import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;

/* JADX INFO: renamed from: e1.a.m0, reason: use source file name */
/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CancellableContinuation2 extends CancellableContinuationImpl3 {

    /* JADX INFO: renamed from: f */
    public final Job2 f29772f;

    public CancellableContinuation2(Job2 job2) {
        this.f29772f = job2;
    }

    @Override // p500e1.p501a.CompletionHandler
    /* JADX INFO: renamed from: a */
    public void mo13213a(Throwable th) {
        this.f29772f.dispose();
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Throwable th) {
        this.f29772f.dispose();
        return Unit.f29502a;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("DisposeOnCancel[");
        sbM1556G.append(this.f29772f);
        sbM1556G.append(']');
        return sbM1556G.toString();
    }
}
