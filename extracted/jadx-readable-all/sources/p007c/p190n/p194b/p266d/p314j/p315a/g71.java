package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class g71 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final JSONObject f14511a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f14512b;

    public g71(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f14511a = jSONObject;
        this.f14512b = jSONObject2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        JSONObject jSONObject = this.f14511a;
        if (jSONObject != null) {
            bundle2.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f14512b;
        if (jSONObject2 != null) {
            bundle2.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
