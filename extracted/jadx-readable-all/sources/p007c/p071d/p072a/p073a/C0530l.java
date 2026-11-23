package p007c.p071d.p072a.p073a;

import androidx.annotation.RecentlyNonNull;
import com.android.billingclient.api.SkuDetails;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.d.a.a.l */
/* JADX INFO: compiled from: com.android.billingclient:billing-ktx@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0530l {

    /* JADX INFO: renamed from: a */
    public final C0519f f2738a;

    /* JADX INFO: renamed from: b */
    public final List<SkuDetails> f2739b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0530l(@RecentlyNonNull C0519f c0519f, List<? extends SkuDetails> list) {
        Intrinsics2.m13089e(c0519f, "billingResult");
        this.f2738a = c0519f;
        this.f2739b = list;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0530l)) {
            return false;
        }
        C0530l c0530l = (C0530l) obj;
        return Intrinsics2.m13085a(this.f2738a, c0530l.f2738a) && Intrinsics2.m13085a(this.f2739b, c0530l.f2739b);
    }

    public int hashCode() {
        C0519f c0519f = this.f2738a;
        int iHashCode = (c0519f != null ? c0519f.hashCode() : 0) * 31;
        List<SkuDetails> list = this.f2739b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("SkuDetailsResult(billingResult=");
        sbM1556G.append(this.f2738a);
        sbM1556G.append(", skuDetailsList=");
        sbM1556G.append(this.f2739b);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }
}
