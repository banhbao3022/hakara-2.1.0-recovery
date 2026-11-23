package p007c.p071d.p072a.p073a;

/* JADX INFO: renamed from: c.d.a.a.q */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0535q implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0519f f2751f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ServiceConnectionC0538t f2752g;

    public RunnableC0535q(ServiceConnectionC0538t serviceConnectionC0538t, C0519f c0519f) {
        this.f2752g = serviceConnectionC0538t;
        this.f2751f = c0519f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2752g.f2755a) {
            InterfaceC0515d interfaceC0515d = this.f2752g.f2757c;
            if (interfaceC0515d != null) {
                interfaceC0515d.mo1540b(this.f2751f);
            }
        }
    }
}
