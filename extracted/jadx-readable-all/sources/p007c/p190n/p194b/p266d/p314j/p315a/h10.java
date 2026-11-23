package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class h10 implements zc2<bc0<ip2>> {

    /* JADX INFO: renamed from: a */
    public final gd2<i20> f14717a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f14718b;

    public h10(u00 u00Var, gd2<i20> gd2Var, gd2<Executor> gd2Var2) {
        this.f14717a = gd2Var;
        this.f14718b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        i20 i20VarMo4613a = this.f14717a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new bc0(i20VarMo4613a, lv1Var);
    }
}
