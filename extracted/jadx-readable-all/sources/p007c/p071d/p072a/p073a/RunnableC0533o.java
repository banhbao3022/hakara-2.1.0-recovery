package p007c.p071d.p072a.p073a;

/* JADX INFO: renamed from: c.d.a.a.o */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0533o implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0540v f2745f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CallableC0534p f2746g;

    public RunnableC0533o(CallableC0534p callableC0534p, C0540v c0540v) {
        this.f2746g = callableC0534p;
        this.f2745f = c0540v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0529k interfaceC0529k = this.f2746g.f2749c;
        C0540v c0540v = this.f2745f;
        int i = c0540v.f2775b;
        String str = c0540v.f2776c;
        C0519f c0519f = new C0519f();
        c0519f.f2715a = i;
        c0519f.f2716b = str;
        interfaceC0529k.mo1539a(c0519f, this.f2745f.f2774a);
    }
}
