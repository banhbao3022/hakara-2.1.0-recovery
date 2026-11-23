package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rc1 implements ha1<JSONObject> {

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f18742a;

    public rc1(Map<String, Object> map) {
        this.f18742a = map;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(JSONObject jSONObject) {
        try {
            jSONObject.put("video_decoders", C2330u.f10884a.f10889d.m4767C(this.f18742a));
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e.getMessage());
            C2096e.m4590z(strValueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(strValueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
