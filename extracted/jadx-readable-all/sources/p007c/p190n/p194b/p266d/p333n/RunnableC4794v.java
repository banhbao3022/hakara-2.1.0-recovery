package p007c.p190n.p194b.p266d.p333n;

/* JADX INFO: renamed from: c.n.b.d.n.v */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4794v implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC4781i f24713f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4793u f24714g;

    public RunnableC4794v(C4793u c4793u, AbstractC4781i abstractC4781i) {
        this.f24714g = c4793u;
        this.f24713f = abstractC4781i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24714g.f24711b) {
            InterfaceC4771d<TResult> interfaceC4771d = this.f24714g.f24712c;
            if (interfaceC4771d != 0) {
                interfaceC4771d.mo5171b((AbstractC4781i<TResult>) this.f24713f);
            }
        }
    }
}
