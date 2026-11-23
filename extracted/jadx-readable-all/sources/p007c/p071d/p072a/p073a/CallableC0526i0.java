package p007c.p071d.p072a.p073a;

import android.os.Bundle;
import com.android.billingclient.api.SkuDetails;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.d.a.a.i0 */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0526i0 implements Callable<Bundle> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2728a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SkuDetails f2729b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f2730c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bundle f2731d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0511b f2732e;

    public CallableC0526i0(C0511b c0511b, int i, SkuDetails skuDetails, String str, C0517e c0517e, Bundle bundle) {
        this.f2732e = c0511b;
        this.f2728a = i;
        this.f2729b = skuDetails;
        this.f2730c = str;
        this.f2731d = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() throws Exception {
        C0511b c0511b = this.f2732e;
        return c0511b.f2683f.mo10362l4(this.f2728a, c0511b.f2682e.getPackageName(), this.f2729b.m12555a(), this.f2730c, null, this.f2731d);
    }
}
