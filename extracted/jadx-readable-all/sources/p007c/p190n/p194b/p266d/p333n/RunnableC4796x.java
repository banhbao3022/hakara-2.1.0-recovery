package p007c.p190n.p194b.p266d.p333n;

/* JADX INFO: renamed from: c.n.b.d.n.x */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4796x implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC4781i f24718f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4795w f24719g;

    public RunnableC4796x(C4795w c4795w, AbstractC4781i abstractC4781i) {
        this.f24719g = c4795w;
        this.f24718f = abstractC4781i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24719g.f24716b) {
            InterfaceC4773e interfaceC4773e = this.f24719g.f24717c;
            if (interfaceC4773e != null) {
                interfaceC4773e.mo8822c(this.f24718f.mo10936i());
            }
        }
    }
}
