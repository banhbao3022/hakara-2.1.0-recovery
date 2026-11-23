package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ib1 implements ha1<JSONObject> {

    /* JADX INFO: renamed from: a */
    public final JSONObject f15134a;

    public ib1(JSONObject jSONObject) {
        this.f15134a = jSONObject;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectM4779g = C2269i0.m4779g(jSONObject, "content_info");
            JSONObject jSONObject2 = this.f15134a;
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectM4779g.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
            C2096e.m4590z("Failed putting app indexing json.");
        }
    }
}
