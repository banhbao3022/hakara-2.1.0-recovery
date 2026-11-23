package p007c.p071d.p072a.p073a;

import android.os.Bundle;
import com.android.billingclient.api.SkuDetails;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.d.a.a.m */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0531m implements Callable<Bundle> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SkuDetails f2740a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2741b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0511b f2742c;

    public CallableC0531m(C0511b c0511b, SkuDetails skuDetails, String str) {
        this.f2742c = c0511b;
        this.f2740a = skuDetails;
        this.f2741b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() throws Exception {
        C0511b c0511b = this.f2742c;
        return c0511b.f2683f.mo10365u1(3, c0511b.f2682e.getPackageName(), this.f2740a.m12555a(), this.f2741b, null);
    }
}
