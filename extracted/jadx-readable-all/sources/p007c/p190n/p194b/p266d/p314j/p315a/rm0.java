package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rm0 {

    /* JADX INFO: renamed from: a */
    public final Map<String, Map<String, JSONObject>> f18950a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public JSONObject f18951b;

    /* JADX INFO: renamed from: c */
    public final Executor f18952c;

    /* JADX INFO: renamed from: d */
    public boolean f18953d;

    /* JADX INFO: renamed from: e */
    public JSONObject f18954e;

    public rm0(Executor executor) {
        this.f18952c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8296a() {
        Map<String, JSONObject> map;
        this.f18953d = true;
        C2849an c2849anMo4818p = ((C2311z0) C2330u.f10884a.f10893h.m6649f()).mo4818p();
        if (c2849anMo4818p == null) {
            return;
        }
        JSONObject jSONObject = c2849anMo4818p.f12219g;
        if (jSONObject == null) {
            return;
        }
        this.f18951b = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14306Z1)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
        this.f18954e = jSONObject.optJSONObject("ad_unit_patterns");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                    String strOptString2 = jSONObjectOptJSONObject.optString("format");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                    if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                        if (this.f18950a.containsKey(strOptString2)) {
                            map = this.f18950a.get(strOptString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.f18950a.put(strOptString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(strOptString, jSONObjectOptJSONObject2);
                    }
                }
            }
        }
    }
}
