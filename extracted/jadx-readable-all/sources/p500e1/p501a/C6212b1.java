package p500e1.p501a;

import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;

/* JADX INFO: renamed from: e1.a.b1 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C6212b1 extends AbstractC6267g1 {

    /* JADX INFO: renamed from: j */
    public final InterfaceC6164l<Throwable, Unit> f29624j;

    /* JADX WARN: Multi-variable type inference failed */
    public C6212b1(InterfaceC6164l<? super Throwable, Unit> interfaceC6164l) {
        this.f29624j = interfaceC6164l;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Throwable th) {
        this.f29624j.mo3b(th);
        return Unit.f29502a;
    }

    @Override // p500e1.p501a.CompletionHandler2
    /* JADX INFO: renamed from: q */
    public void mo13120q(Throwable th) {
        this.f29624j.mo3b(th);
    }
}
