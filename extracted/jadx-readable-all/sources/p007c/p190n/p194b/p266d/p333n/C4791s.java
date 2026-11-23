package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.n.s */
/* JADX INFO: loaded from: classes.dex */
public final class C4791s<TResult> implements InterfaceC4770c0<TResult> {

    /* JADX INFO: renamed from: a */
    public final Executor f24706a;

    /* JADX INFO: renamed from: b */
    public final Object f24707b = new Object();

    /* JADX INFO: renamed from: c */
    public InterfaceC4769c f24708c;

    public C4791s(Executor executor, InterfaceC4769c interfaceC4769c) {
        this.f24706a = executor;
        this.f24708c = interfaceC4769c;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4770c0
    /* JADX INFO: renamed from: b */
    public final void mo10924b(AbstractC4781i abstractC4781i) {
        if (abstractC4781i.mo10939l()) {
            synchronized (this.f24707b) {
                if (this.f24708c == null) {
                    return;
                }
                this.f24706a.execute(new RunnableC4792t(this));
            }
        }
    }
}
