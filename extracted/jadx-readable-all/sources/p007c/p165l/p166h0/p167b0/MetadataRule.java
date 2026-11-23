package p007c.p165l.p166h0.p167b0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.p166h0.UserDataStore;
import p007c.p165l.p166h0.UserDataStore2;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.h0.b0.d, reason: use source file name */
/* JADX INFO: compiled from: MetadataRule.java */
/* JADX INFO: loaded from: classes.dex */
public final class MetadataRule {

    /* JADX INFO: renamed from: a */
    public static List<MetadataRule> f4595a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public String f4596b;

    /* JADX INFO: renamed from: c */
    public List<String> f4597c;

    /* JADX INFO: renamed from: d */
    public String f4598d;

    public MetadataRule(String str, List<String> list, String str2) {
        this.f4596b = str;
        this.f4597c = list;
        this.f4598d = str2;
    }

    /* JADX INFO: renamed from: a */
    public static void m2282a(JSONObject jSONObject) {
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObject.get(next) instanceof JSONObject) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2.has("k") && jSONObject2.has("v") && !jSONObject2.getString("k").isEmpty() && !jSONObject2.getString("v").isEmpty()) {
                        f4595a.add(new MetadataRule(next, Arrays.asList(jSONObject2.getString("k").split(",")), jSONObject2.getString("v")));
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2283b() {
        if (!UserDataStore.f4591c.get()) {
            UserDataStore.m2279a();
        }
        HashMap map = new HashMap(UserDataStore.f4593e);
        if (map.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MetadataRule> it = f4595a.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().f4596b);
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (!UserDataStore.f4591c.get()) {
            UserDataStore.m2279a();
        }
        for (String str2 : arrayList) {
            ConcurrentHashMap<String, String> concurrentHashMap = UserDataStore.f4593e;
            if (concurrentHashMap.containsKey(str2)) {
                concurrentHashMap.remove(str2);
            }
        }
        FacebookSdk.m2660b().execute(new UserDataStore2("com.facebook.appevents.UserDataStore.internalUserData", Utility.m2431D(UserDataStore.f4593e)));
    }
}
