package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class j30 implements zc2<bc0<a70>> {

    /* JADX INFO: renamed from: a */
    public final gd2<p80> f15459a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f15460b;

    public j30(gd2<p80> gd2Var, gd2<Executor> gd2Var2) {
        this.f15459a = gd2Var;
        this.f15460b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        p80 p80VarMo4613a = this.f15459a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new bc0(p80VarMo4613a, lv1Var);
    }
}
