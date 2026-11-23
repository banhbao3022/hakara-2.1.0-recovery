package p500e1.p501a;

import p477d1.Unit;

/* JADX INFO: renamed from: e1.a.n */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C6286n extends AbstractC6261e1 implements Job3 {

    /* JADX INFO: renamed from: j */
    public final Job5 f29774j;

    public C6286n(Job5 job5) {
        this.f29774j = job5;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Unit mo3b(Throwable th) {
        mo13120q(th);
        return Unit.f29502a;
    }

    @Override // p500e1.p501a.Job3
    /* JADX INFO: renamed from: j */
    public boolean mo13273j(Throwable th) {
        return m13218r().mo13234n(th);
    }

    @Override // p500e1.p501a.CompletionHandler2
    /* JADX INFO: renamed from: q */
    public void mo13120q(Throwable th) {
        this.f29774j.mo13228O(m13218r());
    }
}
