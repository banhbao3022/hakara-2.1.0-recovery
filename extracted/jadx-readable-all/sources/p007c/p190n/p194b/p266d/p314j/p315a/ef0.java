package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ef0 implements zc2<JSONObject> {

    /* JADX INFO: renamed from: a */
    public final gd2<hg0> f13575a;

    public ef0(cf0 cf0Var, gd2<hg0> gd2Var) {
        this.f13575a = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        gg0 gg0Var = (gg0) ((gf0) this.f13575a).mo4613a();
        JSONObject jSONObject = gg0Var.f14571b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(gg0Var.f14840a.f18834y);
        } catch (JSONException unused) {
            return null;
        }
    }
}
