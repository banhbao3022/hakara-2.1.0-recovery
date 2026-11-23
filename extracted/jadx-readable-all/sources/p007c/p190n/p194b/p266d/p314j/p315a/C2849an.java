package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.an */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2849an {

    /* JADX INFO: renamed from: d */
    public String f12216d;

    /* JADX INFO: renamed from: e */
    public String f12217e;

    /* JADX INFO: renamed from: f */
    public long f12218f;

    /* JADX INFO: renamed from: g */
    public JSONObject f12219g;

    /* JADX INFO: renamed from: h */
    public boolean f12220h;

    /* JADX INFO: renamed from: j */
    public boolean f12222j;

    /* JADX INFO: renamed from: a */
    public final List<String> f12213a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<String> f12214b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Map<String, C3173jd> f12215c = new HashMap();

    /* JADX INFO: renamed from: i */
    public final List<String> f12221i = new ArrayList();

    public C2849an(String str, long j2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f12220h = false;
        this.f12222j = false;
        this.f12217e = str;
        this.f12218f = j2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f12219g = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.f12220h = false;
                C2622l.m5226A3("App settings could not be fetched successfully.");
                return;
            }
            this.f12220h = true;
            this.f12216d = this.f12219g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.f12219g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                    String strOptString = jSONObject2.optString("format");
                    String strOptString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f12214b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.f12215c.put(strOptString2, new C3173jd(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f12219g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                    this.f12213a.add(jSONArrayOptJSONArray3.optString(i2));
                }
            }
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14441s4)).booleanValue() && (jSONObjectOptJSONObject2 = this.f12219g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    this.f12221i.add(jSONArrayOptJSONArray.get(i3).toString());
                }
            }
            if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14266S3)).booleanValue() || (jSONObjectOptJSONObject = this.f12219g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f12222j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            C2622l.m5241D3("Exception occurred while processing app setting json", e);
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "AppSettings.parseAppSettingsJson");
        }
    }
}
