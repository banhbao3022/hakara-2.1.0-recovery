package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class e31 {

    /* JADX INFO: renamed from: a */
    public final Map<String, h31> f13475a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final Map<String, Map<String, List<h31>>> f13476b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final Executor f13477c;

    /* JADX INFO: renamed from: d */
    public JSONObject f13478d;

    public e31(Executor executor) {
        this.f13477c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m6598a(String str) {
        if (TextUtils.isEmpty(str) || this.f13475a.containsKey(str)) {
            return;
        }
        this.f13475a.put(str, new h31(str, "", new Bundle()));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6599b() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject = ((C2311z0) C2330u.f10884a.f10893h.m6649f()).mo4818p().f12219g;
        if (jSONObject != null) {
            try {
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                this.f13478d = jSONObject.optJSONObject("ad_unit_patterns");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                        String strOptString = jSONObject2.optString("ad_unit_id", "");
                        String strOptString2 = jSONObject2.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config");
                        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i2);
                                ArrayList arrayList2 = new ArrayList();
                                if (jSONObject3 != null) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                                        while (itKeys.hasNext()) {
                                            String next = itKeys.next();
                                            bundle.putString(next, jSONObjectOptJSONObject2.optString(next, ""));
                                        }
                                    }
                                    JSONArray jSONArrayOptJSONArray3 = jSONObject3.optJSONArray("rtb_adapters");
                                    if (jSONArrayOptJSONArray3 != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                                            String strOptString3 = jSONArrayOptJSONArray3.optString(i3, "");
                                            if (!TextUtils.isEmpty(strOptString3)) {
                                                arrayList3.add(strOptString3);
                                            }
                                        }
                                        int size = arrayList3.size();
                                        for (int i4 = 0; i4 < size; i4++) {
                                            String str = (String) arrayList3.get(i4);
                                            m6598a(str);
                                            if (this.f13475a.get(str) != null) {
                                                arrayList2.add(new h31(str, strOptString2, bundle));
                                            }
                                        }
                                    }
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString)) {
                            Map<String, List<h31>> concurrentHashMap = this.f13476b.get(strOptString2);
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap<>();
                            }
                            this.f13476b.put(strOptString2, concurrentHashMap);
                            List<h31> arrayList4 = concurrentHashMap.get(strOptString);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList<>();
                            }
                            arrayList4.addAll(arrayList);
                            concurrentHashMap.put(strOptString, arrayList4);
                        }
                    }
                }
            } catch (JSONException e) {
                C2096e.m4554C("Malformed config loading JSON.", e);
            }
        }
    }
}
