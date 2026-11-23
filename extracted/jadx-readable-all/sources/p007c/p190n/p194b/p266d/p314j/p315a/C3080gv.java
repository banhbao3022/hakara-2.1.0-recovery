package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: renamed from: c.n.b.d.j.a.gv */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3080gv implements zc2<AbstractC2882bj> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f14681a;

    public C3080gv(gd2<Context> gd2Var) {
        this.f14681a = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC2882bj mo4613a() {
        Context contextM8156b = ((C3412pu) this.f14681a).m8156b();
        C2330u c2330u = C2330u.f10884a;
        C3468rc c3468rcM7227a = c2330u.f10902q.m7227a(contextM8156b, C3702xn.m8742H());
        C3320nc<JSONObject> c3320nc = C3357oc.f17593b;
        C2950dc c2950dc = c3468rcM7227a.f18740c;
        return new C2845aj(contextM8156b, new C3617vc(c2330u.f10902q.m7227a(contextM8156b, C3702xn.m8742H()).f18740c, "google.afma.sdkConstants.getSdkConstants", c3320nc, c3320nc));
    }
}
