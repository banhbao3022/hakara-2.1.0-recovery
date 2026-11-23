package p007c.p071d.p072a.p073a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import p007c.p190n.p194b.p266d.p314j.p326l.AbstractBinderC4439c;
import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;
import p007c.p190n.p194b.p266d.p314j.p326l.C4438b;
import p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d;

/* JADX INFO: renamed from: c.d.a.a.t */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC0538t implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Object f2755a = new Object();

    /* JADX INFO: renamed from: b */
    public boolean f2756b = false;

    /* JADX INFO: renamed from: c */
    public InterfaceC0515d f2757c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0511b f2758d;

    public /* synthetic */ ServiceConnectionC0538t(C0511b c0511b, InterfaceC0515d interfaceC0515d) {
        this.f2758d = c0511b;
        this.f2757c = interfaceC0515d;
    }

    /* JADX INFO: renamed from: a */
    public static void m1544a(ServiceConnectionC0538t serviceConnectionC0538t, C0519f c0519f) {
        serviceConnectionC0538t.f2758d.m1535j(new RunnableC0535q(serviceConnectionC0538t, c0519f));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC4440d c4438b;
        C4437a.m10349a("BillingClient", "Billing service connected.");
        C0511b c0511b = this.f2758d;
        int i = AbstractBinderC4439c.f23684f;
        if (iBinder == null) {
            c4438b = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            c4438b = iInterfaceQueryLocalInterface instanceof InterfaceC4440d ? (InterfaceC4440d) iInterfaceQueryLocalInterface : new C4438b(iBinder);
        }
        c0511b.f2683f = c4438b;
        if (this.f2758d.m1538m(new CallableC0536r(this), 30000L, new RunnableC0537s(this)) == null) {
            this.f2758d.m1535j(new RunnableC0535q(this, this.f2758d.m1536k()));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C4437a.m10350b("BillingClient", "Billing service disconnected.");
        C0511b c0511b = this.f2758d;
        c0511b.f2683f = null;
        c0511b.f2678a = 0;
        synchronized (this.f2755a) {
            InterfaceC0515d interfaceC0515d = this.f2757c;
            if (interfaceC0515d != null) {
                interfaceC0515d.mo1541c();
            }
        }
    }
}
