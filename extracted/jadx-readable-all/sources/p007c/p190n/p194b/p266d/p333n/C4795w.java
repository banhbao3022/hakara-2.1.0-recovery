package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.n.w */
/* JADX INFO: loaded from: classes.dex */
public final class C4795w<TResult> implements InterfaceC4770c0<TResult> {

    /* JADX INFO: renamed from: a */
    public final Executor f24715a;

    /* JADX INFO: renamed from: b */
    public final Object f24716b = new Object();

    /* JADX INFO: renamed from: c */
    public InterfaceC4773e f24717c;

    public C4795w(Executor executor, InterfaceC4773e interfaceC4773e) {
        this.f24715a = executor;
        this.f24717c = interfaceC4773e;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4770c0
    /* JADX INFO: renamed from: b */
    public final void mo10924b(AbstractC4781i<TResult> abstractC4781i) {
        if (abstractC4781i.mo10941n() || abstractC4781i.mo10939l()) {
            return;
        }
        synchronized (this.f24716b) {
            if (this.f24717c == null) {
                return;
            }
            this.f24715a.execute(new RunnableC4796x(this, abstractC4781i));
        }
    }
}
