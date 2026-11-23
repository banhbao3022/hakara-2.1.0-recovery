package p007c.p190n.p194b.p367f.p368a.p377h;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.f.a.h.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5146j<ResultT> implements InterfaceC5149m<ResultT> {

    /* JADX INFO: renamed from: a */
    public final Executor f26105a;

    /* JADX INFO: renamed from: b */
    public final Object f26106b = new Object();

    /* JADX INFO: renamed from: c */
    public final InterfaceC5138b f26107c;

    public C5146j(Executor executor, InterfaceC5138b interfaceC5138b) {
        this.f26105a = executor;
        this.f26107c = interfaceC5138b;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p377h.InterfaceC5149m
    /* JADX INFO: renamed from: a */
    public final void mo11569a(AbstractC5141e<ResultT> abstractC5141e) {
        if (abstractC5141e.mo11568f()) {
            return;
        }
        synchronized (this.f26106b) {
            if (this.f26107c == null) {
                return;
            }
            this.f26105a.execute(new RunnableC5145i(this, abstractC5141e));
        }
    }
}
