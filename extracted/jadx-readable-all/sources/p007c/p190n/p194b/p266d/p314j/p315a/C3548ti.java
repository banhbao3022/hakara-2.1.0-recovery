package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.ti */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3548ti {

    /* JADX INFO: renamed from: a */
    public final List<String> f19833a;

    /* JADX INFO: renamed from: b */
    public final String f19834b;

    /* JADX INFO: renamed from: c */
    public final String f19835c;

    /* JADX INFO: renamed from: d */
    public final boolean f19836d;

    /* JADX INFO: renamed from: e */
    public final boolean f19837e;

    /* JADX INFO: renamed from: f */
    public final String f19838f;

    /* JADX INFO: renamed from: g */
    public final int f19839g;

    /* JADX INFO: renamed from: h */
    public final JSONObject f19840h;

    /* JADX INFO: renamed from: i */
    public final String f19841i;

    public C3548ti(JSONObject jSONObject) {
        this.f19838f = jSONObject.optString("url");
        this.f19834b = jSONObject.optString("base_uri");
        this.f19835c = jSONObject.optString("post_parameters");
        this.f19836d = m8416a(jSONObject.optString("drt_include"));
        this.f19837e = m8416a(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.f19833a = strOptString == null ? null : Arrays.asList(strOptString.split(","));
        this.f19839g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f19840h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f19841i = jSONObject.optString("pool_key");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8416a(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }
}
