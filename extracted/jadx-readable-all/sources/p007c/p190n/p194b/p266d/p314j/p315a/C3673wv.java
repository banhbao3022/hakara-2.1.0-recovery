package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.j.a.wv */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3673wv {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f21366a;

    /* JADX INFO: renamed from: b */
    public final gd2<String> f21367b;

    /* JADX INFO: renamed from: c */
    public final gd2<lf1<AbstractC3565tz, C3788zz>> f21368c;

    /* JADX INFO: renamed from: d */
    public final gd2<ud1> f21369d;

    /* JADX INFO: renamed from: e */
    public final gd2<tc1> f21370e;

    /* JADX INFO: renamed from: f */
    public final gd2<zc1> f21371f;

    /* JADX INFO: renamed from: g */
    public final gd2<lf1<c00, h00>> f21372g;

    /* JADX INFO: renamed from: h */
    public final gd2<wd1> f21373h;

    /* JADX INFO: renamed from: i */
    public final gd2<ce1> f21374i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3600uw f21375j;

    public C3673wv(C3600uw c3600uw, Context context, String str) {
        this.f21375j = c3600uw;
        Objects.requireNonNull(context, "instance cannot be null");
        ad2 ad2Var = new ad2(context);
        this.f21366a = ad2Var;
        Objects.requireNonNull(str, "instance cannot be null");
        ad2 ad2Var2 = new ad2(str);
        this.f21367b = ad2Var2;
        of1 of1Var = new of1(ad2Var, c3600uw.f20650r0, c3600uw.f20652s0);
        this.f21368c = of1Var;
        vd1 vd1Var = new vd1(c3600uw.f20650r0);
        Object obj = yc2.f21852a;
        gd2<ud1> yc2Var = vd1Var instanceof yc2 ? vd1Var : new yc2<>(vd1Var);
        this.f21369d = yc2Var;
        gd2<Executor> gd2Var = c3600uw.f20643o;
        gd2<AbstractC3264lu> gd2Var2 = c3600uw.f20602M;
        ki1 ki1Var = ji1.f15601a;
        uc1 uc1Var = new uc1(ad2Var, gd2Var, gd2Var2, of1Var, yc2Var, ki1Var);
        gd2<tc1> yc2Var2 = uc1Var instanceof yc2 ? uc1Var : new yc2(uc1Var);
        this.f21370e = yc2Var2;
        gd2<zc1> ad1Var = new ad1(c3600uw.f20602M, ad2Var, ad2Var2, yc2Var2, yc2Var, c3600uw.f20629h);
        this.f21371f = ad1Var instanceof yc2 ? ad1Var : new yc2(ad1Var);
        nf1 nf1Var = new nf1(ad2Var, c3600uw.f20650r0, c3600uw.f20652s0);
        this.f21372g = nf1Var;
        xd1 xd1Var = new xd1(ad2Var, c3600uw.f20643o, c3600uw.f20602M, nf1Var, yc2Var, ki1Var);
        gd2<wd1> yc2Var3 = xd1Var instanceof yc2 ? xd1Var : new yc2(xd1Var);
        this.f21373h = yc2Var3;
        gd2<ce1> de1Var = new de1(c3600uw.f20602M, ad2Var, ad2Var2, yc2Var3, yc2Var);
        this.f21374i = de1Var instanceof yc2 ? de1Var : new yc2(de1Var);
    }
}
