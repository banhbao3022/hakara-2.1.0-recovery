package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fo0 implements zc2<bc0<l60>> {

    /* JADX INFO: renamed from: a */
    public final gd2<co0> f14080a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f14081b;

    /* JADX INFO: renamed from: c */
    public final gd2<zu0> f14082c;

    public fo0(gd2<co0> gd2Var, gd2<Executor> gd2Var2, gd2<zu0> gd2Var3) {
        this.f14080a = gd2Var;
        this.f14081b = gd2Var2;
        this.f14082c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        co0 co0VarMo4613a = this.f14080a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14351f5)).booleanValue() ? new bc0(this.f14082c.mo4613a(), lv1Var) : new bc0(co0VarMo4613a, lv1Var);
    }
}
