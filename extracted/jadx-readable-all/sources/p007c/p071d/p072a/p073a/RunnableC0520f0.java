package p007c.p071d.p072a.p073a;

import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;

/* JADX INFO: renamed from: c.d.a.a.f0 */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0520f0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0523h f2717f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0519f f2718g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f2719h;

    public RunnableC0520f0(InterfaceC0523h interfaceC0523h, C0519f c0519f, String str) {
        this.f2717f = interfaceC0523h;
        this.f2718g = c0519f;
        this.f2719h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4437a.m10349a("BillingClient", "Successfully consumed purchase.");
        this.f2717f.mo1542a(this.f2718g, this.f2719h);
    }
}
