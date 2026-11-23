package p007c.p071d.p072a.p073a;

import android.os.Bundle;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;

/* JADX INFO: renamed from: c.d.a.a.p */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0534p implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f2747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f2748b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0529k f2749c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0511b f2750d;

    public CallableC0534p(C0511b c0511b, String str, List list, InterfaceC0529k interfaceC0529k) {
        this.f2750d = c0511b;
        this.f2747a = str;
        this.f2748b = list;
        this.f2749c = interfaceC0529k;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        C0540v c0540v;
        C0511b c0511b = this.f2750d;
        String str = this.f2747a;
        List list = this.f2748b;
        Objects.requireNonNull(c0511b);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList arrayList2 = new ArrayList(list.subList(i, i2 > size ? size : i2));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(((C0541w) arrayList2.get(i3)).f2777a);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", c0511b.f2679b);
            try {
                Bundle bundleMo10359k3 = c0511b.f2691n ? c0511b.f2683f.mo10359k3(10, c0511b.f2682e.getPackageName(), str, bundle, C4437a.m10354f(c0511b.f2687j, c0511b.f2696s, c0511b.f2679b, null, arrayList2)) : c0511b.f2683f.mo10356J4(3, c0511b.f2682e.getPackageName(), str, bundle);
                if (bundleMo10359k3 == null) {
                    C4437a.m10350b("BillingClient", "querySkuDetailsAsync got null sku details list");
                    c0540v = new C0540v(4, "Item is unavailable for purchase.", null);
                } else if (bundleMo10359k3.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = bundleMo10359k3.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null) {
                        for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                            try {
                                SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i4));
                                String strValueOf = String.valueOf(skuDetails);
                                StringBuilder sb = new StringBuilder(strValueOf.length() + 17);
                                sb.append("Got sku details: ");
                                sb.append(strValueOf);
                                C4437a.m10349a("BillingClient", sb.toString());
                                arrayList.add(skuDetails);
                            } catch (JSONException unused) {
                                C4437a.m10350b("BillingClient", "Got a JSON exception trying to decode SkuDetails.");
                                c0540v = new C0540v(6, "Error trying to decode SkuDetails.", null);
                            }
                        }
                        i = i2;
                    } else {
                        C4437a.m10350b("BillingClient", "querySkuDetailsAsync got null response list");
                        c0540v = new C0540v(4, "Item is unavailable for purchase.", null);
                    }
                } else {
                    int iM10352d = C4437a.m10352d(bundleMo10359k3, "BillingClient");
                    String strM10353e = C4437a.m10353e(bundleMo10359k3, "BillingClient");
                    if (iM10352d != 0) {
                        StringBuilder sb2 = new StringBuilder(50);
                        sb2.append("getSkuDetails() failed. Response code: ");
                        sb2.append(iM10352d);
                        C4437a.m10350b("BillingClient", sb2.toString());
                        c0540v = new C0540v(iM10352d, strM10353e, arrayList);
                    } else {
                        C4437a.m10350b("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                        c0540v = new C0540v(6, strM10353e, arrayList);
                    }
                }
            } catch (Exception e) {
                String strValueOf2 = String.valueOf(e);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 63);
                sb3.append("querySkuDetailsAsync got a remote exception (try to reconnect).");
                sb3.append(strValueOf2);
                C4437a.m10350b("BillingClient", sb3.toString());
                c0540v = new C0540v(-1, "Service connection is disconnected.", null);
            }
            this.f2750d.m1535j(new RunnableC0533o(this, c0540v));
            return null;
        }
        c0540v = new C0540v(0, "", arrayList);
        this.f2750d.m1535j(new RunnableC0533o(this, c0540v));
        return null;
    }
}
