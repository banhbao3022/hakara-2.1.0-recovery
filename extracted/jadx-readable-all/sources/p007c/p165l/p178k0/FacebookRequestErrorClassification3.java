package p007c.p165l.p178k0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.l.k0.m, reason: use source file name */
/* JADX INFO: compiled from: FacebookRequestErrorClassification.java */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookRequestErrorClassification3 {

    /* JADX INFO: renamed from: a */
    public static FacebookRequestErrorClassification3 f4980a;

    /* JADX INFO: renamed from: b */
    public final Map<Integer, Set<Integer>> f4981b;

    /* JADX INFO: renamed from: c */
    public final Map<Integer, Set<Integer>> f4982c;

    /* JADX INFO: renamed from: d */
    public final Map<Integer, Set<Integer>> f4983d;

    /* JADX INFO: renamed from: e */
    public final String f4984e;

    /* JADX INFO: renamed from: f */
    public final String f4985f;

    /* JADX INFO: renamed from: g */
    public final String f4986g;

    public FacebookRequestErrorClassification3(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f4981b = map;
        this.f4982c = map2;
        this.f4983d = map3;
        this.f4984e = str;
        this.f4985f = str2;
        this.f4986g = str3;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized FacebookRequestErrorClassification3 m2510a() {
        if (f4980a == null) {
            f4980a = new FacebookRequestErrorClassification3(null, new FacebookRequestErrorClassification(), new FacebookRequestErrorClassification2(), null, null, null);
        }
        return f4980a;
    }

    /* JADX INFO: renamed from: b */
    public static Map<Integer, Set<Integer>> m2511b(JSONObject jSONObject) {
        int iOptInt;
        HashSet hashSet;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        int iOptInt2 = jSONArrayOptJSONArray2.optInt(i2);
                        if (iOptInt2 != 0) {
                            hashSet.add(Integer.valueOf(iOptInt2));
                        }
                    }
                }
                map.put(Integer.valueOf(iOptInt), hashSet);
            }
        }
        return map;
    }
}
