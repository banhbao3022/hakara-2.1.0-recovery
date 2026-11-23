package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tq0 implements zc2<bc0<l60>> {

    /* JADX INFO: renamed from: a */
    public final gd2<rq0> f19960a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f19961b;

    public tq0(gd2<rq0> gd2Var, gd2<Executor> gd2Var2) {
        this.f19960a = gd2Var;
        this.f19961b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        rq0 rq0VarMo4613a = this.f19960a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new bc0(rq0VarMo4613a, lv1Var);
    }
}
