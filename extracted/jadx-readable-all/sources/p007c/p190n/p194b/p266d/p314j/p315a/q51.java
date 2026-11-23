package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class q51 implements zc2<p51> {

    /* JADX INFO: renamed from: a */
    public final gd2<kv1<String>> f18199a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f18200b;

    public q51(gd2<kv1<String>> gd2Var, gd2<Executor> gd2Var2) {
        this.f18199a = gd2Var;
        this.f18200b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        kv1<String> kv1VarMo4613a = this.f18199a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new p51(kv1VarMo4613a, lv1Var);
    }
}
