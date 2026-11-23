package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jg0 implements zc2<gg0> {

    /* JADX INFO: renamed from: a */
    public final gd2<rh1> f15592a;

    /* JADX INFO: renamed from: b */
    public final gd2<JSONObject> f15593b;

    public jg0(gd2<rh1> gd2Var, gd2<JSONObject> gd2Var2) {
        this.f15592a = gd2Var;
        this.f15593b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        rh1 rh1VarM6282b = ((d30) this.f15592a).m6282b();
        JSONObject jSONObject = ((ff0) this.f15593b).f14029a.f12994a;
        Objects.requireNonNull(jSONObject, "Cannot return null from a non-@Nullable @Provides method");
        return new gg0(rh1VarM6282b, jSONObject);
    }
}
