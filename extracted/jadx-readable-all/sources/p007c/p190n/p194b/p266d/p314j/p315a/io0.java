package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class io0 implements zc2<bc0<zl1>> {

    /* JADX INFO: renamed from: a */
    public final gd2<so0> f15329a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f15330b;

    /* JADX INFO: renamed from: c */
    public final gd2<gv0> f15331c;

    public io0(gd2<so0> gd2Var, gd2<Executor> gd2Var2, gd2<gv0> gd2Var3) {
        this.f15329a = gd2Var;
        this.f15330b = gd2Var2;
        this.f15331c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        so0 so0VarMo4613a = this.f15329a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14351f5)).booleanValue() ? new bc0(this.f15331c.mo4613a(), lv1Var) : new bc0(so0VarMo4613a, lv1Var);
    }
}
