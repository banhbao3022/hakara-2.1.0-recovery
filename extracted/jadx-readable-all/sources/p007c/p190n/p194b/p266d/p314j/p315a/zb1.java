package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zb1 implements ha1<JSONObject> {

    /* JADX INFO: renamed from: a */
    public final String f22228a;

    /* JADX INFO: renamed from: b */
    public final String f22229b;

    public zb1(String str, String str2) {
        this.f22228a = str;
        this.f22229b = str2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectM4779g = C2269i0.m4779g(jSONObject, "pii");
            jSONObjectM4779g.put("doritos", this.f22228a);
            jSONObjectM4779g.put("doritos_v2", this.f22229b);
        } catch (JSONException unused) {
            C2096e.m4590z("Failed putting doritos string.");
        }
    }
}
