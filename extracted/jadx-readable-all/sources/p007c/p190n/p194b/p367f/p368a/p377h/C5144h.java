package p007c.p190n.p194b.p367f.p368a.p377h;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.f.a.h.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5144h<ResultT> implements InterfaceC5149m<ResultT> {

    /* JADX INFO: renamed from: a */
    public final Executor f26100a;

    /* JADX INFO: renamed from: b */
    public final Object f26101b = new Object();

    /* JADX INFO: renamed from: c */
    public final InterfaceC5137a<ResultT> f26102c;

    public C5144h(Executor executor, InterfaceC5137a<ResultT> interfaceC5137a) {
        this.f26100a = executor;
        this.f26102c = interfaceC5137a;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p377h.InterfaceC5149m
    /* JADX INFO: renamed from: a */
    public final void mo11569a(AbstractC5141e<ResultT> abstractC5141e) {
        synchronized (this.f26101b) {
            if (this.f26102c == null) {
                return;
            }
            this.f26100a.execute(new RunnableC5143g(this, abstractC5141e));
        }
    }
}
