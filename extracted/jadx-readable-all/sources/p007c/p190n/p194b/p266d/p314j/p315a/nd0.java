package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nd0 implements zc2<bc0<i60>> {

    /* JADX INFO: renamed from: a */
    public final gd2<ie0> f17069a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f17070b;

    public nd0(cd0 cd0Var, gd2<ie0> gd2Var, gd2<Executor> gd2Var2) {
        this.f17069a = gd2Var;
        this.f17070b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        ie0 ie0VarMo4613a = this.f17069a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new bc0(ie0VarMo4613a, lv1Var);
    }
}
