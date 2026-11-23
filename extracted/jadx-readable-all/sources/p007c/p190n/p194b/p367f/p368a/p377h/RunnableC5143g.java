package p007c.p190n.p194b.p367f.p368a.p377h;

/* JADX INFO: renamed from: c.n.b.f.a.h.g */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5143g implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC5141e f26098f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5144h f26099g;

    public RunnableC5143g(C5144h c5144h, AbstractC5141e abstractC5141e) {
        this.f26099g = c5144h;
        this.f26098f = abstractC5141e;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f26099g.f26101b) {
            InterfaceC5137a<ResultT> interfaceC5137a = this.f26099g.f26102c;
            if (interfaceC5137a != 0) {
                interfaceC5137a.mo11562a((AbstractC5141e<ResultT>) this.f26098f);
            }
        }
    }
}
