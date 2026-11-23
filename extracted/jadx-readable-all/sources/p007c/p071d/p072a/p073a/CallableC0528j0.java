package p007c.p071d.p072a.p073a;

import android.os.Bundle;
import com.android.billingclient.api.SkuDetails;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.d.a.a.j0 */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0528j0 implements Callable<Bundle> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0517e f2735a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SkuDetails f2736b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0511b f2737c;

    public CallableC0528j0(C0511b c0511b, C0517e c0517e, SkuDetails skuDetails) {
        this.f2737c = c0511b;
        this.f2735a = c0517e;
        this.f2736b = skuDetails;
    }

    @Override // java.util.concurrent.Callable
    public final Bundle call() throws Exception {
        C0511b c0511b = this.f2737c;
        return c0511b.f2683f.mo10360k4(5, c0511b.f2682e.getPackageName(), Arrays.asList(this.f2735a.f2707c), this.f2736b.m12555a(), "subs", null);
    }
}
