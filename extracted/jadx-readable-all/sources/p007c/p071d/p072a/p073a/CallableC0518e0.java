package p007c.p071d.p072a.p073a;

import android.os.Bundle;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d;

/* JADX INFO: renamed from: c.d.a.a.e0 */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0518e0 implements Callable<Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f2713a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0511b f2714b;

    public CallableC0518e0(C0511b c0511b, String str) {
        this.f2714b = c0511b;
        this.f2713a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() throws Exception {
        C0511b c0511b = this.f2714b;
        InterfaceC4440d interfaceC4440d = c0511b.f2683f;
        String packageName = c0511b.f2682e.getPackageName();
        String str = this.f2713a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("vr", true);
        return Integer.valueOf(interfaceC4440d.mo10357S2(7, packageName, str, bundle));
    }
}
