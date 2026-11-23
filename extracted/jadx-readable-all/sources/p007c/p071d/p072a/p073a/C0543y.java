package p007c.p071d.p072a.p073a;

import android.content.Context;
import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;

/* JADX INFO: renamed from: c.d.a.a.y */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0543y {

    /* JADX INFO: renamed from: a */
    public final Context f2781a;

    /* JADX INFO: renamed from: b */
    public final C0542x f2782b;

    public C0543y(Context context, InterfaceC0525i interfaceC0525i) {
        this.f2781a = context;
        this.f2782b = new C0542x(this, interfaceC0525i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1545a() {
        C0542x c0542x = this.f2782b;
        Context context = this.f2781a;
        if (!c0542x.f2779b) {
            C4437a.m10350b("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(c0542x.f2780c.f2782b);
            c0542x.f2779b = false;
        }
    }
}
