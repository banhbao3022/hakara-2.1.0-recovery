package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class d11 implements dx0<vi1, zy0> {

    /* JADX INFO: renamed from: a */
    public final Map<String, ex0<vi1, zy0>> f13158a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final mm0 f13159b;

    public d11(mm0 mm0Var) {
        this.f13159b = mm0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dx0
    /* JADX INFO: renamed from: a */
    public final ex0<vi1, zy0> mo6274a(String str, JSONObject jSONObject) throws mi1 {
        ex0<vi1, zy0> ex0Var;
        synchronized (this) {
            ex0Var = this.f13158a.get(str);
            if (ex0Var == null) {
                ex0Var = new ex0<>(this.f13159b.m7719a(str, jSONObject), new zy0(), str);
                this.f13158a.put(str, ex0Var);
            }
        }
        return ex0Var;
    }
}
