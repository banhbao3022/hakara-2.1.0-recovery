package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dr0 implements zc2<bc0<l60>> {

    /* JADX INFO: renamed from: a */
    public final gd2<lr0> f13367a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f13368b;

    public dr0(gd2<lr0> gd2Var, gd2<Executor> gd2Var2) {
        this.f13367a = gd2Var;
        this.f13368b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lr0 lr0VarMo4613a = this.f13367a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new bc0(lr0VarMo4613a, lv1Var);
    }
}
