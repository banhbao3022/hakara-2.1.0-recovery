package p007c.p071d.p072a.p073a;

import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;

/* JADX INFO: renamed from: c.d.a.a.r */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0536r implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ServiceConnectionC0538t f2753a;

    public CallableC0536r(ServiceConnectionC0538t serviceConnectionC0538t) {
        this.f2753a = serviceConnectionC0538t;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() throws Exception {
        int iMo10364n1;
        synchronized (this.f2753a.f2755a) {
            ServiceConnectionC0538t serviceConnectionC0538t = this.f2753a;
            if (!serviceConnectionC0538t.f2756b) {
                int i = 3;
                try {
                    String packageName = serviceConnectionC0538t.f2758d.f2682e.getPackageName();
                    int i2 = 16;
                    iMo10364n1 = 3;
                    while (true) {
                        if (i2 < 3) {
                            i2 = 0;
                            break;
                        }
                        try {
                            iMo10364n1 = this.f2753a.f2758d.f2683f.mo10364n1(i2, packageName, "subs");
                            if (iMo10364n1 == 0) {
                                break;
                            }
                            i2--;
                        } catch (Exception unused) {
                            i = iMo10364n1;
                            C4437a.m10350b("BillingClient", "Exception while checking if billing is supported; try to reconnect");
                            C0511b c0511b = this.f2753a.f2758d;
                            c0511b.f2678a = 0;
                            c0511b.f2683f = null;
                            iMo10364n1 = i;
                        }
                    }
                    C0511b c0511b2 = this.f2753a.f2758d;
                    boolean z = true;
                    c0511b2.f2686i = i2 >= 5;
                    c0511b2.f2685h = i2 >= 3;
                    if (i2 < 3) {
                        C4437a.m10349a("BillingClient", "In-app billing API does not support subscription on this device.");
                    }
                    for (int i3 = 16; i3 >= 3; i3--) {
                        iMo10364n1 = this.f2753a.f2758d.f2683f.mo10364n1(i3, packageName, "inapp");
                        if (iMo10364n1 == 0) {
                            this.f2753a.f2758d.f2687j = i3;
                            break;
                        }
                    }
                    C0511b c0511b3 = this.f2753a.f2758d;
                    int i4 = c0511b3.f2687j;
                    c0511b3.f2695r = i4 >= 16;
                    c0511b3.f2694q = i4 >= 15;
                    c0511b3.f2693p = i4 >= 14;
                    c0511b3.f2692o = i4 >= 12;
                    c0511b3.f2691n = i4 >= 10;
                    c0511b3.f2690m = i4 >= 9;
                    c0511b3.f2689l = i4 >= 8;
                    if (i4 < 6) {
                        z = false;
                    }
                    c0511b3.f2688k = z;
                    if (i4 < 3) {
                        C4437a.m10350b("BillingClient", "In-app billing API version 3 is not supported on this device.");
                    }
                    if (iMo10364n1 == 0) {
                        this.f2753a.f2758d.f2678a = 2;
                    } else {
                        C0511b c0511b4 = this.f2753a.f2758d;
                        c0511b4.f2678a = 0;
                        c0511b4.f2683f = null;
                    }
                } catch (Exception unused2) {
                }
                if (iMo10364n1 == 0) {
                    ServiceConnectionC0538t.m1544a(this.f2753a, C0539u.f2767i);
                } else {
                    ServiceConnectionC0538t.m1544a(this.f2753a, C0539u.f2759a);
                }
            }
        }
        return null;
    }
}
