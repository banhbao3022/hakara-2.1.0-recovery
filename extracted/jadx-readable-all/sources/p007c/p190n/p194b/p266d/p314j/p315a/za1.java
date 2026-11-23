package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p280x.C2211a;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class za1 implements ha1<JSONObject> {

    /* JADX INFO: renamed from: a */
    public final C2211a.a f22216a;

    /* JADX INFO: renamed from: b */
    public final String f22217b;

    public za1(C2211a.a aVar, String str) {
        this.f22216a = aVar;
        this.f22217b = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectM4779g = C2269i0.m4779g(jSONObject, "pii");
            C2211a.a aVar = this.f22216a;
            if (aVar == null || TextUtils.isEmpty(aVar.f10624a)) {
                jSONObjectM4779g.put("pdid", this.f22217b);
                jSONObjectM4779g.put("pdidtype", "ssaid");
            } else {
                jSONObjectM4779g.put("rdid", this.f22216a.f10624a);
                jSONObjectM4779g.put("is_lat", this.f22216a.f10625b);
                jSONObjectM4779g.put("idtype", "adid");
            }
        } catch (JSONException e) {
            C2096e.m4554C("Failed putting Ad ID.", e);
        }
    }
}
