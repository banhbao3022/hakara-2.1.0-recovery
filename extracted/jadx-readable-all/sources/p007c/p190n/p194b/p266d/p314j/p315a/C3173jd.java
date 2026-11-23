package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.jd */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3173jd {

    /* JADX INFO: renamed from: a */
    public final List<C3136id> f15562a;

    /* JADX INFO: renamed from: b */
    public final List<String> f15563b;

    /* JADX INFO: renamed from: c */
    public final List<String> f15564c;

    /* JADX INFO: renamed from: d */
    public final List<String> f15565d;

    /* JADX INFO: renamed from: e */
    public final List<String> f15566e;

    /* JADX INFO: renamed from: f */
    public final List<String> f15567f;

    public C3173jd(JSONObject jSONObject) throws JSONException {
        if (C2622l.m5281L3(2)) {
            String strValueOf = String.valueOf(jSONObject.toString(2));
            C2096e.m4590z(strValueOf.length() != 0 ? "Mediation Response JSON: ".concat(strValueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                C3136id c3136id = new C3136id(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(c3136id.f15153l);
                arrayList.add(c3136id);
                if (i < 0) {
                    Iterator<String> it = c3136id.f15142a.iterator();
                    while (it.hasNext()) {
                        if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            i = i2;
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f15562a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            C2330u c2330u = C2330u.f10884a;
            C3210kd c3210kd = c2330u.f10906u;
            this.f15563b = C3210kd.m7492a(jSONObjectOptJSONObject, "click_urls");
            C3210kd c3210kd2 = c2330u.f10906u;
            this.f15564c = C3210kd.m7492a(jSONObjectOptJSONObject, "imp_urls");
            C3210kd c3210kd3 = c2330u.f10906u;
            this.f15565d = C3210kd.m7492a(jSONObjectOptJSONObject, "downloaded_imp_urls");
            C3210kd c3210kd4 = c2330u.f10906u;
            this.f15566e = C3210kd.m7492a(jSONObjectOptJSONObject, "nofill_urls");
            C3210kd c3210kd5 = c2330u.f10906u;
            this.f15567f = C3210kd.m7492a(jSONObjectOptJSONObject, "remote_ping_urls");
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong("refresh", -1L);
            C3475rj.m8279H(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
