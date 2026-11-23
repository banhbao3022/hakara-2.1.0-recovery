package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3679x0;
import p007c.p190n.p194b.p266d.p314j.p315a.C3092h6;
import p007c.p190n.p194b.p266d.p314j.p315a.C3147io;
import p007c.p190n.p194b.p266d.p314j.p315a.C3368on;
import p007c.p190n.p194b.p266d.p314j.p315a.C3405pn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3442qn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3479rn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3553tn;
import p007c.p190n.p194b.p266d.p314j.p315a.lv2;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.d0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2254d0 extends AbstractC3679x0<lv2> {

    /* JADX INFO: renamed from: r */
    public final C3147io<lv2> f10697r;

    /* JADX INFO: renamed from: s */
    public final C3553tn f10698s;

    public C2254d0(String str, Map<String, String> map, C3147io<lv2> c3147io) {
        super(0, str, new C2251c0(c3147io));
        this.f10697r = c3147io;
        C3553tn c3553tn = new C3553tn(null);
        this.f10698s = c3553tn;
        if (C3553tn.m8431d()) {
            c3553tn.m8436f("onNetworkRequest", new C3368on(str, "GET", null, null));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3679x0
    /* JADX INFO: renamed from: w */
    public final C3092h6<lv2> mo4728w(lv2 lv2Var) {
        return new C3092h6<>(lv2Var, C2622l.m5460y0(lv2Var));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3679x0
    /* JADX INFO: renamed from: x */
    public final void mo4729x(lv2 lv2Var) {
        lv2 lv2Var2 = lv2Var;
        C3553tn c3553tn = this.f10698s;
        Map<String, String> map = lv2Var2.f16618c;
        int i = lv2Var2.f16616a;
        Objects.requireNonNull(c3553tn);
        if (C3553tn.m8431d()) {
            c3553tn.m8436f("onNetworkResponse", new C3405pn(i, map));
            if (i < 200 || i >= 300) {
                c3553tn.m8436f("onNetworkRequestError", new C3479rn(null));
            }
        }
        C3553tn c3553tn2 = this.f10698s;
        byte[] bArr = lv2Var2.f16617b;
        if (C3553tn.m8431d() && bArr != null) {
            c3553tn2.m8436f("onNetworkResponseBody", new C3442qn(bArr));
        }
        this.f10697r.m7286a(lv2Var2);
    }
}
