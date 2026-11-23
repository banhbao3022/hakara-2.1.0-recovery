package p007c.p190n.p194b.p367f.p368a.p377h;

/* JADX INFO: renamed from: c.n.b.f.a.h.k */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5147k implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC5141e f26108f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5148l f26109g;

    public RunnableC5147k(C5148l c5148l, AbstractC5141e abstractC5141e) {
        this.f26109g = c5148l;
        this.f26108f = abstractC5141e;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f26109g.f26111b) {
            InterfaceC5139c<? super ResultT> interfaceC5139c = this.f26109g.f26112c;
            if (interfaceC5139c != 0) {
                interfaceC5139c.mo11421a((Object) this.f26108f.mo11566d());
            }
        }
    }
}
