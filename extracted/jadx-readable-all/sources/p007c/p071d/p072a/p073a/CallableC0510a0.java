package p007c.p071d.p072a.p073a;

import android.os.Bundle;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;
import p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d;

/* JADX INFO: renamed from: c.d.a.a.a0 */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0510a0 implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0521g f2675a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0523h f2676b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0511b f2677c;

    public CallableC0510a0(C0511b c0511b, C0521g c0521g, InterfaceC0523h interfaceC0523h) {
        this.f2677c = c0511b;
        this.f2675a = c0521g;
        this.f2676b = interfaceC0523h;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        int iMo10358c4;
        String strM10353e;
        C0511b c0511b = this.f2677c;
        C0521g c0521g = this.f2675a;
        InterfaceC0523h interfaceC0523h = this.f2676b;
        String str = c0521g.f2720a;
        try {
            String strValueOf = String.valueOf(str);
            C4437a.m10349a("BillingClient", strValueOf.length() != 0 ? "Consuming purchase with token: ".concat(strValueOf) : new String("Consuming purchase with token: "));
            if (c0511b.f2690m) {
                InterfaceC4440d interfaceC4440d = c0511b.f2683f;
                String packageName = c0511b.f2682e.getPackageName();
                boolean z = c0511b.f2690m;
                String str2 = c0511b.f2679b;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str2);
                }
                Bundle bundleMo10361k5 = interfaceC4440d.mo10361k5(9, packageName, str, bundle);
                iMo10358c4 = bundleMo10361k5.getInt("RESPONSE_CODE");
                strM10353e = C4437a.m10353e(bundleMo10361k5, "BillingClient");
            } else {
                iMo10358c4 = c0511b.f2683f.mo10358c4(3, c0511b.f2682e.getPackageName(), str);
                strM10353e = "";
            }
            C0519f c0519f = new C0519f();
            c0519f.f2715a = iMo10358c4;
            c0519f.f2716b = strM10353e;
            if (iMo10358c4 == 0) {
                c0511b.m1535j(new RunnableC0520f0(interfaceC0523h, c0519f, str));
                return null;
            }
            c0511b.m1535j(new RunnableC0522g0(iMo10358c4, interfaceC0523h, c0519f, str));
            return null;
        } catch (Exception e) {
            c0511b.m1535j(new RunnableC0524h0(e, interfaceC0523h, str));
            return null;
        }
    }
}
