package p007c.p071d.p072a.p073a;

import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;

/* JADX INFO: renamed from: c.d.a.a.g0 */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0522g0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f2721f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0523h f2722g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0519f f2723h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f2724i;

    public RunnableC0522g0(int i, InterfaceC0523h interfaceC0523h, C0519f c0519f, String str) {
        this.f2721f = i;
        this.f2722g = interfaceC0523h;
        this.f2723h = c0519f;
        this.f2724i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2721f;
        StringBuilder sb = new StringBuilder(63);
        sb.append("Error consuming purchase with token. Response code: ");
        sb.append(i);
        C4437a.m10350b("BillingClient", sb.toString());
        this.f2722g.mo1542a(this.f2723h, this.f2724i);
    }
}
