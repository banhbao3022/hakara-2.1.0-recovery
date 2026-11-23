package p007c.p190n.p194b.p266d.p333n;

/* JADX INFO: renamed from: c.n.b.d.n.z */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4798z implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC4781i f24723f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4797y f24724g;

    public RunnableC4798z(C4797y c4797y, AbstractC4781i abstractC4781i) {
        this.f24724g = c4797y;
        this.f24723f = abstractC4781i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24724g.f24721b) {
            InterfaceC4775f<? super TResult> interfaceC4775f = this.f24724g.f24722c;
            if (interfaceC4775f != 0) {
                interfaceC4775f.mo5107a((Object) this.f24723f.mo10937j());
            }
        }
    }
}
