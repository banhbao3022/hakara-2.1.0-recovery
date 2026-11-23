package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class v11 implements dx0<InterfaceC3249lf, yy0> {

    /* JADX INFO: renamed from: a */
    public final z21 f20690a;

    public v11(z21 z21Var) {
        this.f20690a = z21Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dx0
    /* JADX INFO: renamed from: a */
    public final ex0<InterfaceC3249lf, yy0> mo6274a(String str, JSONObject jSONObject) throws mi1 {
        InterfaceC3249lf interfaceC3249lfM8844a = this.f20690a.m8844a(str);
        if (interfaceC3249lfM8844a == null) {
            return null;
        }
        return new ex0<>(interfaceC3249lfM8844a, new yy0(), str);
    }
}
