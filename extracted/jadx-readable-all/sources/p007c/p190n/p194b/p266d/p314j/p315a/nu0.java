package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nu0 implements InterfaceC3209kc<ou0> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3209kc
    /* JADX INFO: renamed from: b */
    public final JSONObject mo7491b(ou0 ou0Var) throws JSONException {
        ou0 ou0Var2 = ou0Var;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", ou0Var2.f17736d.f19834b);
        jSONObject2.put("signals", ou0Var2.f17735c);
        jSONObject3.put("body", ou0Var2.f17734b.f19703c);
        jSONObject3.put("headers", C2330u.f10884a.f10889d.m4767C(ou0Var2.f17734b.f19702b));
        jSONObject3.put("response_code", ou0Var2.f17734b.f19701a);
        jSONObject3.put("latency", ou0Var2.f17734b.f19704d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", ou0Var2.f17736d.f19840h);
        return jSONObject;
    }
}
