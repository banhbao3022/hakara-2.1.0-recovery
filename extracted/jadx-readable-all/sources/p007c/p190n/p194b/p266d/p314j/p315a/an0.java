package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class an0 implements zc2<bc0<z80>> {

    /* JADX INFO: renamed from: a */
    public final gd2<ln0> f12223a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f12224b;

    public an0(gd2<ln0> gd2Var, gd2<Executor> gd2Var2) {
        this.f12223a = gd2Var;
        this.f12224b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        ln0 ln0VarMo4613a = this.f12223a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new bc0(ln0VarMo4613a, lv1Var);
    }
}
