package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class n40 implements zc2<bc0<m60>> {

    /* JADX INFO: renamed from: a */
    public final gd2<ao0> f17022a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f17023b;

    /* JADX INFO: renamed from: c */
    public final gd2<xu0> f17024c;

    public n40(gd2<ao0> gd2Var, gd2<Executor> gd2Var2, gd2<xu0> gd2Var3) {
        this.f17022a = gd2Var;
        this.f17023b = gd2Var2;
        this.f17024c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        ao0 ao0VarMo4613a = this.f17022a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14351f5)).booleanValue() ? new bc0(this.f17024c.mo4613a(), lv1Var) : new bc0(ao0VarMo4613a, lv1Var);
    }
}
