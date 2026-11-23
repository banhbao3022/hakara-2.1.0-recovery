package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wh1 {

    /* JADX INFO: renamed from: a */
    public final String f21125a;

    /* JADX INFO: renamed from: b */
    public final String f21126b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f21127c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f21128d;

    public wh1(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectM4775c = C2269i0.m4775c(jsonReader);
        this.f21128d = jSONObjectM4775c;
        this.f21125a = jSONObjectM4775c.optString("ad_html", null);
        this.f21126b = jSONObjectM4775c.optString("ad_base_url", null);
        this.f21127c = jSONObjectM4775c.optJSONObject("ad_json");
    }
}
