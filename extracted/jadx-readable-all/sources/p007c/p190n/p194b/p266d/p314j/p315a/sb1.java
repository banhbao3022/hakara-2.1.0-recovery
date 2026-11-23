package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sb1 implements ha1<JSONObject> {

    /* JADX INFO: renamed from: a */
    public final JSONObject f19519a;

    public sb1(JSONObject jSONObject) {
        this.f19519a = jSONObject;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(JSONObject jSONObject) {
        try {
            jSONObject.put("cache_state", this.f19519a);
        } catch (JSONException unused) {
            C2096e.m4590z("Unable to get cache_state");
        }
    }
}
