package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3264lu;
import p007c.p190n.p194b.p266d.p314j.p315a.C2962do;
import p007c.p190n.p194b.p266d.p314j.p315a.C3412pu;
import p007c.p190n.p194b.p266d.p314j.p315a.C3702xn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3746yu;
import p007c.p190n.p194b.p266d.p314j.p315a.gd2;
import p007c.p190n.p194b.p266d.p314j.p315a.lv1;
import p007c.p190n.p194b.p266d.p314j.p315a.rd2;
import p007c.p190n.p194b.p266d.p314j.p315a.vk0;
import p007c.p190n.p194b.p266d.p314j.p315a.wi1;
import p007c.p190n.p194b.p266d.p314j.p315a.zc2;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.t */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2162t implements zc2<BinderC2161s> {

    /* JADX INFO: renamed from: a */
    public final gd2<AbstractC3264lu> f10533a;

    /* JADX INFO: renamed from: b */
    public final gd2<Context> f10534b;

    /* JADX INFO: renamed from: c */
    public final gd2<rd2> f10535c;

    /* JADX INFO: renamed from: d */
    public final gd2<C3702xn> f10536d;

    /* JADX INFO: renamed from: e */
    public final gd2<wi1<vk0>> f10537e;

    /* JADX INFO: renamed from: f */
    public final gd2<lv1> f10538f;

    /* JADX INFO: renamed from: g */
    public final gd2<ScheduledExecutorService> f10539g;

    public C2162t(gd2<AbstractC3264lu> gd2Var, gd2<Context> gd2Var2, gd2<rd2> gd2Var3, gd2<C3702xn> gd2Var4, gd2<wi1<vk0>> gd2Var5, gd2<lv1> gd2Var6, gd2<ScheduledExecutorService> gd2Var7) {
        this.f10533a = gd2Var;
        this.f10534b = gd2Var2;
        this.f10535c = gd2Var3;
        this.f10536d = gd2Var4;
        this.f10537e = gd2Var5;
        this.f10538f = gd2Var6;
        this.f10539g = gd2Var7;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        AbstractC3264lu abstractC3264luMo4613a = this.f10533a.mo4613a();
        Context contextM8156b = ((C3412pu) this.f10534b).m8156b();
        rd2 rd2VarMo4613a = this.f10535c.mo4613a();
        C3702xn c3702xnM8831b = ((C3746yu) this.f10536d).m8831b();
        wi1<vk0> wi1VarMo4613a = this.f10537e.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new BinderC2161s(abstractC3264luMo4613a, contextM8156b, rd2VarMo4613a, c3702xnM8831b, wi1VarMo4613a, lv1Var, this.f10539g.mo4613a());
    }
}
