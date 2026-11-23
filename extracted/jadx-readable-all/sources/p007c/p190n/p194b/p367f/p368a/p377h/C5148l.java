package p007c.p190n.p194b.p367f.p368a.p377h;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.f.a.h.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5148l<ResultT> implements InterfaceC5149m<ResultT> {

    /* JADX INFO: renamed from: a */
    public final Executor f26110a;

    /* JADX INFO: renamed from: b */
    public final Object f26111b = new Object();

    /* JADX INFO: renamed from: c */
    public final InterfaceC5139c<? super ResultT> f26112c;

    public C5148l(Executor executor, InterfaceC5139c<? super ResultT> interfaceC5139c) {
        this.f26110a = executor;
        this.f26112c = interfaceC5139c;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p377h.InterfaceC5149m
    /* JADX INFO: renamed from: a */
    public final void mo11569a(AbstractC5141e<ResultT> abstractC5141e) {
        if (abstractC5141e.mo11568f()) {
            synchronized (this.f26111b) {
                if (this.f26112c == null) {
                    return;
                }
                this.f26110a.execute(new RunnableC5147k(this, abstractC5141e));
            }
        }
    }
}
