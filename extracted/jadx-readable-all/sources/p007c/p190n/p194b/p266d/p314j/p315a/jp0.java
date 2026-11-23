package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jp0 implements zc2<Set<bc0<a70>>> {

    /* JADX INFO: renamed from: a */
    public final gd2<lp0> f15680a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f15681b;

    public jp0(cp0 cp0Var, gd2<lp0> gd2Var, gd2<Executor> gd2Var2) {
        this.f15680a = gd2Var;
        this.f15681b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lp0 lp0VarMo4613a = this.f15680a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        Set setM6218a = cp0.m6218a(lp0VarMo4613a, lv1Var);
        Objects.requireNonNull(setM6218a, "Cannot return null from a non-@Nullable @Provides method");
        return setM6218a;
    }
}
