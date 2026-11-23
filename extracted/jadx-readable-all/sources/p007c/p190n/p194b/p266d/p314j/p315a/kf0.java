package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.UUID;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kf0 implements zc2<ep2> {

    /* JADX INFO: renamed from: a */
    public final gd2<C3702xn> f15932a;

    /* JADX INFO: renamed from: b */
    public final gd2<String> f15933b;

    public kf0(gd2<C3702xn> gd2Var, gd2<String> gd2Var2) {
        this.f15932a = gd2Var;
        this.f15933b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        C3702xn c3702xnM8831b = ((C3746yu) this.f15932a).m8831b();
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        return new ep2(UUID.randomUUID().toString(), c3702xnM8831b, "native", new JSONObject(), false, true);
    }
}
