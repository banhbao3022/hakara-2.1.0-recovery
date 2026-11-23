package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bh0 implements zc2<ah0> {

    /* JADX INFO: renamed from: a */
    public final gd2<InterfaceC2305w0> f12623a;

    /* JADX INFO: renamed from: b */
    public final gd2<ii1> f12624b;

    /* JADX INFO: renamed from: c */
    public final gd2<hg0> f12625c;

    /* JADX INFO: renamed from: d */
    public final gd2<bg0> f12626d;

    /* JADX INFO: renamed from: e */
    public final gd2<mh0> f12627e;

    /* JADX INFO: renamed from: f */
    public final gd2<uh0> f12628f;

    /* JADX INFO: renamed from: g */
    public final gd2<Executor> f12629g;

    /* JADX INFO: renamed from: h */
    public final gd2<Executor> f12630h;

    /* JADX INFO: renamed from: i */
    public final gd2<yf0> f12631i;

    public bh0(gd2<InterfaceC2305w0> gd2Var, gd2<ii1> gd2Var2, gd2<hg0> gd2Var3, gd2<bg0> gd2Var4, gd2<mh0> gd2Var5, gd2<uh0> gd2Var6, gd2<Executor> gd2Var7, gd2<Executor> gd2Var8, gd2<yf0> gd2Var9) {
        this.f12623a = gd2Var;
        this.f12624b = gd2Var2;
        this.f12625c = gd2Var3;
        this.f12626d = gd2Var4;
        this.f12627e = gd2Var5;
        this.f12628f = gd2Var6;
        this.f12629g = gd2Var7;
        this.f12630h = gd2Var8;
        this.f12631i = gd2Var9;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ah0 mo4613a() {
        InterfaceC2305w0 interfaceC2305w0Mo4613a = ((gj1) this.f12623a).mo4613a();
        ii1 ii1VarM8778b = ((y50) this.f12624b).m8778b();
        hg0 hg0VarMo4613a = this.f12625c.mo4613a();
        bg0 bg0VarM8415b = ((tg0) this.f12626d).m8415b();
        mh0 mh0VarMo4613a = this.f12627e.mo4613a();
        uh0 uh0VarMo4613a = this.f12628f.mo4613a();
        Executor executorMo4613a = this.f12629g.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new ah0(interfaceC2305w0Mo4613a, ii1VarM8778b, hg0VarMo4613a, bg0VarM8415b, mh0VarMo4613a, uh0VarMo4613a, executorMo4613a, lv1Var, this.f12631i.mo4613a());
    }
}
