package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.UUID;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: renamed from: c.n.b.d.j.a.dz */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2973dz implements zc2<ep2> {

    /* JADX INFO: renamed from: a */
    public final gd2<rh1> f13434a;

    /* JADX INFO: renamed from: b */
    public final gd2<C3702xn> f13435b;

    /* JADX INFO: renamed from: c */
    public final gd2<JSONObject> f13436c;

    /* JADX INFO: renamed from: d */
    public final gd2<String> f13437d;

    public C2973dz(gd2<rh1> gd2Var, gd2<C3702xn> gd2Var2, gd2<JSONObject> gd2Var3, gd2<String> gd2Var4) {
        this.f13434a = gd2Var;
        this.f13435b = gd2Var2;
        this.f13436c = gd2Var3;
        this.f13437d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        ((d30) this.f13434a).m6282b();
        C3702xn c3702xnM8831b = ((C3746yu) this.f13435b).m8831b();
        JSONObject jSONObjectMo4613a = this.f13436c.mo4613a();
        String strMo4613a = this.f13437d.mo4613a();
        boolean zEquals = "native".equals(strMo4613a);
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        return new ep2(UUID.randomUUID().toString(), c3702xnM8831b, strMo4613a, jSONObjectMo4613a, false, zEquals);
    }
}
