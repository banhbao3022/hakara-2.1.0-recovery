package p007c.p071d.p072a.p073a;

import com.android.billingclient.api.SkuDetails;
import java.util.List;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CompletableDeferred;

/* JADX INFO: renamed from: c.d.a.a.c */
/* JADX INFO: compiled from: com.android.billingclient:billing-ktx@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0513c implements InterfaceC0529k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletableDeferred f2700a;

    public C0513c(CompletableDeferred completableDeferred) {
        this.f2700a = completableDeferred;
    }

    @Override // p007c.p071d.p072a.p073a.InterfaceC0529k
    /* JADX INFO: renamed from: a */
    public final void mo1539a(C0519f c0519f, List<SkuDetails> list) {
        Intrinsics2.m13088d(c0519f, "billingResult");
        this.f2700a.mo13289g0(new C0530l(c0519f, list));
    }
}
