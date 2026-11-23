package p007c.p190n.p194b.p266d.p333n;

/* JADX INFO: renamed from: c.n.b.d.n.t */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4792t implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4791s f24709f;

    public RunnableC4792t(C4791s c4791s) {
        this.f24709f = c4791s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24709f.f24707b) {
            InterfaceC4769c interfaceC4769c = this.f24709f.f24708c;
            if (interfaceC4769c != null) {
                interfaceC4769c.mo10925d();
            }
        }
    }
}
