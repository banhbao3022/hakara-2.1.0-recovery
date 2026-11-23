package p500e1.p501a;

import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;

/* JADX INFO: renamed from: e1.a.z0, reason: use source file name */
/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CancellableContinuationImpl7 extends CancellableContinuationImpl3 {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<Throwable, Unit> f29823f;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl7(InterfaceC6164l<? super Throwable, Unit> interfaceC6164l) {
        this.f29823f = interfaceC6164l;
    }

    @Override // p500e1.p501a.CompletionHandler
    /* JADX INFO: renamed from: a */
    public void mo13213a(Throwable th) {
        this.f29823f.mo3b(th);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Throwable th) {
        this.f29823f.mo3b(th);
        return Unit.f29502a;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("InvokeOnCancel[");
        sbM1556G.append(C5729a.m12461p(this.f29823f));
        sbM1556G.append('@');
        sbM1556G.append(C5729a.m12463r(this));
        sbM1556G.append(']');
        return sbM1556G.toString();
    }
}
