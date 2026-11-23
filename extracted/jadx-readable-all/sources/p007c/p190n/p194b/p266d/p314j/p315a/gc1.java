package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gc1 implements ha1<JSONObject> {

    /* JADX INFO: renamed from: a */
    public final Bundle f14532a;

    public gc1(Bundle bundle) {
        this.f14532a = bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (this.f14532a != null) {
            try {
                C2269i0.m4779g(C2269i0.m4779g(jSONObject2, "device"), "play_store").put("parental_controls", C2330u.f10884a.f10889d.m4768D(this.f14532a));
            } catch (JSONException unused) {
                C2096e.m4590z("Failed putting parental controls bundle.");
            }
        }
    }
}
