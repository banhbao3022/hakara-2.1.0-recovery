package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gm1 implements zc2<fm1> {

    /* JADX INFO: renamed from: a */
    public final gd2<Executor> f14615a;

    /* JADX INFO: renamed from: b */
    public final gd2<C3665wn> f14616b;

    public gm1(gd2<Executor> gd2Var, gd2<C3665wn> gd2Var2) {
        this.f14615a = gd2Var;
        this.f14616b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new fm1(lv1Var, this.f14616b.mo4613a());
    }
}
