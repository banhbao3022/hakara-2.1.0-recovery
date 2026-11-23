package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: c.n.b.d.n.l */
/* JADX INFO: loaded from: classes.dex */
public final class C4784l implements InterfaceC4785m {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f24687a = new CountDownLatch(1);

    public C4784l(RunnableC4780h0 runnableC4780h0) {
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4775f
    /* JADX INFO: renamed from: a */
    public final void mo5107a(Object obj) {
        this.f24687a.countDown();
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4773e
    /* JADX INFO: renamed from: c */
    public final void mo8822c(Exception exc) {
        this.f24687a.countDown();
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4769c
    /* JADX INFO: renamed from: d */
    public final void mo10925d() {
        this.f24687a.countDown();
    }
}
