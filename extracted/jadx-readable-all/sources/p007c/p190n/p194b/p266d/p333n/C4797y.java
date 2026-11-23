package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.n.y */
/* JADX INFO: loaded from: classes.dex */
public final class C4797y<TResult> implements InterfaceC4770c0<TResult> {

    /* JADX INFO: renamed from: a */
    public final Executor f24720a;

    /* JADX INFO: renamed from: b */
    public final Object f24721b = new Object();

    /* JADX INFO: renamed from: c */
    public InterfaceC4775f<? super TResult> f24722c;

    public C4797y(Executor executor, InterfaceC4775f<? super TResult> interfaceC4775f) {
        this.f24720a = executor;
        this.f24722c = interfaceC4775f;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4770c0
    /* JADX INFO: renamed from: b */
    public final void mo10924b(AbstractC4781i<TResult> abstractC4781i) {
        if (abstractC4781i.mo10941n()) {
            synchronized (this.f24721b) {
                if (this.f24722c == null) {
                    return;
                }
                this.f24720a.execute(new RunnableC4798z(this, abstractC4781i));
            }
        }
    }
}
