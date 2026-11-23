package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.a.zu */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3783zu implements zc2<wi1<vk0>> {

    /* JADX INFO: renamed from: a */
    public final gd2<tk0> f22404a;

    /* JADX INFO: renamed from: b */
    public final gd2<lv1> f22405b;

    public C3783zu(gd2<tk0> gd2Var, gd2<lv1> gd2Var2) {
        this.f22404a = gd2Var;
        this.f22405b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        tk0 tk0VarMo4613a = this.f22404a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new wi1(tk0VarMo4613a, lv1Var);
    }
}
