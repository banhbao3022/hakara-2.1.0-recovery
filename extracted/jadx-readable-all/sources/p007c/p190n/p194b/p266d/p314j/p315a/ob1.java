package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ob1 implements ha1<JSONObject> {

    /* JADX INFO: renamed from: a */
    public final String f17591a;

    public ob1(String str) {
        this.f17591a = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectM4779g = C2269i0.m4779g(jSONObject, "pii");
            if (TextUtils.isEmpty(this.f17591a)) {
                return;
            }
            jSONObjectM4779g.put("attok", this.f17591a);
        } catch (JSONException e) {
            C2096e.m4554C("Failed putting attestation token.", e);
        }
    }
}
