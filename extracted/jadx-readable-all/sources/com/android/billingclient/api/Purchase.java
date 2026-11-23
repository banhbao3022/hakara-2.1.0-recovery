package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p072a.p073a.C0519f;

/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a */
    public final String f28128a;

    /* JADX INFO: renamed from: b */
    public final String f28129b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f28130c;

    /* JADX INFO: renamed from: com.android.billingclient.api.Purchase$a */
    /* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
    public static class C5777a {

        /* JADX INFO: renamed from: a */
        public final List<Purchase> f28131a;

        public C5777a(C0519f c0519f, List<Purchase> list) {
            this.f28131a = list;
        }
    }

    public Purchase(String str, String str2) throws JSONException {
        this.f28128a = str;
        this.f28129b = str2;
        this.f28130c = new JSONObject(str);
    }

    /* JADX INFO: renamed from: a */
    public String m12554a() {
        return this.f28130c.optString("productId");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f28128a, purchase.f28128a) && TextUtils.equals(this.f28129b, purchase.f28129b);
    }

    public int hashCode() {
        return this.f28128a.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f28128a);
        return strValueOf.length() != 0 ? "Purchase. Json: ".concat(strValueOf) : new String("Purchase. Json: ");
    }
}
