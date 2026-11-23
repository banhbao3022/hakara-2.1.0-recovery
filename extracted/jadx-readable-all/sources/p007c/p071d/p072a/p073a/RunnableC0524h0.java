package p007c.p071d.p072a.p073a;

import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;

/* JADX INFO: renamed from: c.d.a.a.h0 */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0524h0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Exception f2725f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0523h f2726g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f2727h;

    public RunnableC0524h0(Exception exc, InterfaceC0523h interfaceC0523h, String str) {
        this.f2725f = exc;
        this.f2726g = interfaceC0523h;
        this.f2727h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strValueOf = String.valueOf(this.f2725f);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 30);
        sb.append("Error consuming purchase; ex: ");
        sb.append(strValueOf);
        C4437a.m10350b("BillingClient", sb.toString());
        this.f2726g.mo1542a(C0539u.f2768j, this.f2727h);
    }
}
