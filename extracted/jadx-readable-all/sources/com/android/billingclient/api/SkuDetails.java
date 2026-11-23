package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public class SkuDetails {

    /* JADX INFO: renamed from: a */
    public final String f28132a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f28133b;

    public SkuDetails(String str) throws JSONException {
        this.f28132a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f28133b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    /* JADX INFO: renamed from: a */
    public String m12555a() {
        return this.f28133b.optString("productId");
    }

    /* JADX INFO: renamed from: b */
    public String m12556b() {
        return this.f28133b.optString("type");
    }

    /* JADX INFO: renamed from: c */
    public final String m12557c() {
        return this.f28133b.optString("packageName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f28132a, ((SkuDetails) obj).f28132a);
        }
        return false;
    }

    public int hashCode() {
        return this.f28132a.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f28132a);
        return strValueOf.length() != 0 ? "SkuDetails: ".concat(strValueOf) : new String("SkuDetails: ");
    }
}
