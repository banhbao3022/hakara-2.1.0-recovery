package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wm0 implements zc2<bc0<l60>> {

    /* JADX INFO: renamed from: a */
    public final gd2<ln0> f21261a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f21262b;

    public wm0(gd2<ln0> gd2Var, gd2<Executor> gd2Var2) {
        this.f21261a = gd2Var;
        this.f21262b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        ln0 ln0VarMo4613a = this.f21261a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new bc0(ln0VarMo4613a, lv1Var);
    }
}
