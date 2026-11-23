package p007c.p190n.p194b.p367f.p368a.p377h;

/* JADX INFO: renamed from: c.n.b.f.a.h.i */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5145i implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC5141e f26103f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5146j f26104g;

    public RunnableC5145i(C5146j c5146j, AbstractC5141e abstractC5141e) {
        this.f26104g = c5146j;
        this.f26103f = abstractC5141e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f26104g.f26106b) {
            InterfaceC5138b interfaceC5138b = this.f26104g.f26107c;
            if (interfaceC5138b != null) {
                interfaceC5138b.mo11426c(this.f26103f.mo11565c());
            }
        }
    }
}
