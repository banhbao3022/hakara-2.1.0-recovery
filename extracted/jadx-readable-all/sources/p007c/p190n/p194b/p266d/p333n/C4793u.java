package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.n.u */
/* JADX INFO: loaded from: classes.dex */
public final class C4793u<TResult> implements InterfaceC4770c0<TResult> {

    /* JADX INFO: renamed from: a */
    public final Executor f24710a;

    /* JADX INFO: renamed from: b */
    public final Object f24711b = new Object();

    /* JADX INFO: renamed from: c */
    public InterfaceC4771d<TResult> f24712c;

    public C4793u(Executor executor, InterfaceC4771d<TResult> interfaceC4771d) {
        this.f24710a = executor;
        this.f24712c = interfaceC4771d;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4770c0
    /* JADX INFO: renamed from: b */
    public final void mo10924b(AbstractC4781i<TResult> abstractC4781i) {
        synchronized (this.f24711b) {
            if (this.f24712c == null) {
                return;
            }
            this.f24710a.execute(new RunnableC4794v(this, abstractC4781i));
        }
    }
}
