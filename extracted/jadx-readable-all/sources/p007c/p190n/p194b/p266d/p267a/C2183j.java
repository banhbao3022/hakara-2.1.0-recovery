package p007c.p190n.p194b.p266d.p267a;

import androidx.annotation.RecentlyNonNull;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p314j.p315a.ow2;
import p007c.p190n.p194b.p266d.p314j.p315a.yv2;

/* JADX INFO: renamed from: c.n.b.d.a.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2183j {

    /* JADX INFO: renamed from: a */
    public final ow2 f10576a;

    /* JADX INFO: renamed from: b */
    public final C2103a f10577b;

    public C2183j(ow2 ow2Var) {
        this.f10576a = ow2Var;
        yv2 yv2Var = ow2Var.f17776h;
        this.f10577b = yv2Var == null ? null : yv2Var.m8836H();
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    public final JSONObject m4629a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f10576a.f17774f);
        jSONObject.put("Latency", this.f10576a.f17775g);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f10576a.f17777i.keySet()) {
            jSONObject2.put(str, this.f10576a.f17777i.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        C2103a c2103a = this.f10577b;
        if (c2103a == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", c2103a.mo4598b());
        }
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return m4629a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
