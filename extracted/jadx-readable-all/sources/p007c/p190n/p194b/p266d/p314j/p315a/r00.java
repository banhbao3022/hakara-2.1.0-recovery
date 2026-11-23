package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class r00 implements zc2<q00> {

    /* JADX INFO: renamed from: a */
    public final gd2<l20> f18668a;

    /* JADX INFO: renamed from: b */
    public final gd2<Context> f18669b;

    /* JADX INFO: renamed from: c */
    public final gd2<sh1> f18670c;

    /* JADX INFO: renamed from: d */
    public final gd2<View> f18671d;

    /* JADX INFO: renamed from: e */
    public final gd2<InterfaceC3410ps> f18672e;

    /* JADX INFO: renamed from: f */
    public final gd2<k20> f18673f;

    /* JADX INFO: renamed from: g */
    public final gd2<mg0> f18674g;

    /* JADX INFO: renamed from: h */
    public final gd2<hc0> f18675h;

    /* JADX INFO: renamed from: i */
    public final gd2<j31> f18676i;

    /* JADX INFO: renamed from: j */
    public final gd2<Executor> f18677j;

    public r00(gd2<l20> gd2Var, gd2<Context> gd2Var2, gd2<sh1> gd2Var3, gd2<View> gd2Var4, gd2<InterfaceC3410ps> gd2Var5, gd2<k20> gd2Var6, gd2<mg0> gd2Var7, gd2<hc0> gd2Var8, gd2<j31> gd2Var9, gd2<Executor> gd2Var10) {
        this.f18668a = gd2Var;
        this.f18669b = gd2Var2;
        this.f18670c = gd2Var3;
        this.f18671d = gd2Var4;
        this.f18672e = gd2Var5;
        this.f18673f = gd2Var6;
        this.f18674g = gd2Var7;
        this.f18675h = gd2Var8;
        this.f18676i = gd2Var9;
        this.f18677j = gd2Var10;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q00 mo4613a() {
        l20 l20VarMo4613a = ((h40) this.f18668a).mo4613a();
        Context contextMo4613a = this.f18669b.mo4613a();
        sh1 sh1Var = ((x00) this.f18670c).f21415a.f20186c;
        Objects.requireNonNull(sh1Var, "Cannot return null from a non-@Nullable @Provides method");
        View view = ((w00) this.f18671d).f20971a.f20185b;
        Objects.requireNonNull(view, "Cannot return null from a non-@Nullable @Provides method");
        InterfaceC3410ps interfaceC3410ps = ((j10) this.f18672e).f15437a.f20187d;
        k20 k20Var = ((y00) this.f18673f).f21725a.f20184a;
        Objects.requireNonNull(k20Var, "Cannot return null from a non-@Nullable @Provides method");
        return new q00(l20VarMo4613a, contextMo4613a, sh1Var, view, interfaceC3410ps, k20Var, ((pe0) this.f18674g).m8106b(), this.f18675h.mo4613a(), yc2.m8792c(this.f18676i), this.f18677j.mo4613a());
    }
}
