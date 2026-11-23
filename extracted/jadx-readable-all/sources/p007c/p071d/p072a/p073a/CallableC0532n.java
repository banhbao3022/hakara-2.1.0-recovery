package p007c.p071d.p072a.p073a;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;

/* JADX INFO: renamed from: c.d.a.a.n */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0532n implements Callable<Purchase.C5777a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f2743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0511b f2744b;

    public CallableC0532n(C0511b c0511b, String str) {
        this.f2744b = c0511b;
        this.f2743a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Purchase.C5777a call() throws Exception {
        C0511b c0511b = this.f2744b;
        String str = this.f2743a;
        String strValueOf = String.valueOf(str);
        C4437a.m10349a("BillingClient", strValueOf.length() != 0 ? "Querying owned items, item type: ".concat(strValueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        boolean z = c0511b.f2690m;
        boolean z2 = c0511b.f2696s;
        Bundle bundleM1575Z = outline.m1575Z("playBillingLibraryVersion", c0511b.f2679b);
        if (z && z2) {
            bundleM1575Z.putBoolean("enablePendingPurchases", true);
        }
        String string = null;
        int i = 1;
        do {
            try {
                Bundle bundleMo10366x3 = c0511b.f2690m ? c0511b.f2683f.mo10366x3(9, c0511b.f2682e.getPackageName(), str, string, bundleM1575Z) : c0511b.f2683f.mo10363l5(3, c0511b.f2682e.getPackageName(), str, string);
                C0519f c0519f = C0539u.f2766h;
                if (bundleMo10366x3 == null) {
                    Object[] objArr = new Object[i];
                    objArr[0] = "getPurchase()";
                    C4437a.m10350b("BillingClient", String.format("%s got null owned items list", objArr));
                } else {
                    int iM10352d = C4437a.m10352d(bundleMo10366x3, "BillingClient");
                    String strM10353e = C4437a.m10353e(bundleMo10366x3, "BillingClient");
                    C0519f c0519f2 = new C0519f();
                    c0519f2.f2715a = iM10352d;
                    c0519f2.f2716b = strM10353e;
                    if (iM10352d != 0) {
                        C4437a.m10350b("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", Integer.valueOf(iM10352d)));
                        c0519f = c0519f2;
                        i = 1;
                    } else if (bundleMo10366x3.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleMo10366x3.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleMo10366x3.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = bundleMo10366x3.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = bundleMo10366x3.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = bundleMo10366x3.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            i = 1;
                            C4437a.m10350b("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()"));
                        } else {
                            i = 1;
                            if (stringArrayList2 == null) {
                                C4437a.m10350b("BillingClient", String.format("Bundle returned from %s contains null purchases list.", "getPurchase()"));
                            } else if (stringArrayList3 == null) {
                                C4437a.m10350b("BillingClient", String.format("Bundle returned from %s contains null signatures list.", "getPurchase()"));
                            } else {
                                c0519f = C0539u.f2767i;
                            }
                        }
                    } else {
                        i = 1;
                        C4437a.m10350b("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()"));
                    }
                }
                if (c0519f != C0539u.f2767i) {
                    return new Purchase.C5777a(c0519f, null);
                }
                ArrayList<String> stringArrayList4 = bundleMo10366x3.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList5 = bundleMo10366x3.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList6 = bundleMo10366x3.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i2 = 0; i2 < stringArrayList5.size(); i2++) {
                    String str2 = stringArrayList5.get(i2);
                    String str3 = stringArrayList6.get(i2);
                    String strValueOf2 = String.valueOf(stringArrayList4.get(i2));
                    C4437a.m10349a("BillingClient", strValueOf2.length() != 0 ? "Sku is owned: ".concat(strValueOf2) : new String("Sku is owned: "));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        JSONObject jSONObject = purchase.f28130c;
                        if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                            C4437a.m10350b("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        String strValueOf3 = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(strValueOf3.length() + 48);
                        sb.append("Got an exception trying to decode the purchase: ");
                        sb.append(strValueOf3);
                        C4437a.m10350b("BillingClient", sb.toString());
                        return new Purchase.C5777a(C0539u.f2766h, null);
                    }
                }
                string = bundleMo10366x3.getString("INAPP_CONTINUATION_TOKEN");
                String strValueOf4 = String.valueOf(string);
                C4437a.m10349a("BillingClient", strValueOf4.length() != 0 ? "Continuation token: ".concat(strValueOf4) : new String("Continuation token: "));
            } catch (Exception e2) {
                String strValueOf5 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(strValueOf5.length() + 57);
                sb2.append("Got exception trying to get purchases: ");
                sb2.append(strValueOf5);
                sb2.append("; try to reconnect");
                C4437a.m10350b("BillingClient", sb2.toString());
                return new Purchase.C5777a(C0539u.f2768j, null);
            }
        } while (!TextUtils.isEmpty(string));
        return new Purchase.C5777a(C0539u.f2767i, arrayList);
    }
}
