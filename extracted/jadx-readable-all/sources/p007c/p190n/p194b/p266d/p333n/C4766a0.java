package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.n.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4766a0<TResult, TContinuationResult> implements InterfaceC4769c, InterfaceC4773e, InterfaceC4775f<TContinuationResult>, InterfaceC4770c0<TResult> {

    /* JADX INFO: renamed from: a */
    public final Executor f24667a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4779h<TResult, TContinuationResult> f24668b;

    /* JADX INFO: renamed from: c */
    public final C4778g0<TContinuationResult> f24669c;

    public C4766a0(Executor executor, InterfaceC4779h<TResult, TContinuationResult> interfaceC4779h, C4778g0<TContinuationResult> c4778g0) {
        this.f24667a = executor;
        this.f24668b = interfaceC4779h;
        this.f24669c = c4778g0;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4775f
    /* JADX INFO: renamed from: a */
    public final void mo5107a(TContinuationResult tcontinuationresult) {
        this.f24669c.m10944q(tcontinuationresult);
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4770c0
    /* JADX INFO: renamed from: b */
    public final void mo10924b(AbstractC4781i<TResult> abstractC4781i) {
        this.f24667a.execute(new RunnableC4768b0(this, abstractC4781i));
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4773e
    /* JADX INFO: renamed from: c */
    public final void mo8822c(Exception exc) {
        this.f24669c.m10943p(exc);
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4769c
    /* JADX INFO: renamed from: d */
    public final void mo10925d() {
        this.f24669c.m10945r();
    }
}
