package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: renamed from: c.n.b.d.j.a.id */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3136id {

    /* JADX INFO: renamed from: a */
    public final List<String> f15142a;

    /* JADX INFO: renamed from: b */
    public final List<String> f15143b;

    /* JADX INFO: renamed from: c */
    public final List<String> f15144c;

    /* JADX INFO: renamed from: d */
    public final List<String> f15145d;

    /* JADX INFO: renamed from: e */
    public final List<String> f15146e;

    /* JADX INFO: renamed from: f */
    public final List<String> f15147f;

    /* JADX INFO: renamed from: g */
    public final String f15148g;

    /* JADX INFO: renamed from: h */
    public final List<String> f15149h;

    /* JADX INFO: renamed from: i */
    public final List<String> f15150i;

    /* JADX INFO: renamed from: j */
    public final List<String> f15151j;

    /* JADX INFO: renamed from: k */
    public final List<String> f15152k;

    /* JADX INFO: renamed from: l */
    public final String f15153l;

    public C3136id(JSONObject jSONObject) throws JSONException {
        List<String> listM7492a;
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f15142a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        C2330u c2330u = C2330u.f10884a;
        C3210kd c3210kd = c2330u.f10906u;
        this.f15143b = C3210kd.m7492a(jSONObject, "clickurl");
        C3210kd c3210kd2 = c2330u.f10906u;
        this.f15144c = C3210kd.m7492a(jSONObject, "imp_urls");
        C3210kd c3210kd3 = c2330u.f10906u;
        this.f15145d = C3210kd.m7492a(jSONObject, "downloaded_imp_urls");
        C3210kd c3210kd4 = c2330u.f10906u;
        this.f15147f = C3210kd.m7492a(jSONObject, "fill_urls");
        C3210kd c3210kd5 = c2330u.f10906u;
        this.f15149h = C3210kd.m7492a(jSONObject, "video_start_urls");
        C3210kd c3210kd6 = c2330u.f10906u;
        this.f15151j = C3210kd.m7492a(jSONObject, "video_complete_urls");
        C3210kd c3210kd7 = c2330u.f10906u;
        this.f15150i = C3210kd.m7492a(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            C3210kd c3210kd8 = c2330u.f10906u;
            listM7492a = C3210kd.m7492a(jSONObjectOptJSONObject, "manual_impression_urls");
        } else {
            listM7492a = null;
        }
        this.f15146e = listM7492a;
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f15148g = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        C3210kd c3210kd9 = c2330u.f10906u;
        this.f15152k = C3210kd.m7492a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.f15153l = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
