package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kv0 implements zc2<bc0<zl1>> {

    /* JADX INFO: renamed from: a */
    public final gd2<wv0> f16051a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f16052b;

    public kv0(gd2<wv0> gd2Var, gd2<Executor> gd2Var2) {
        this.f16051a = gd2Var;
        this.f16052b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        wv0 wv0Var = new wv0(((xv0) this.f16051a).f21700a.mo4613a());
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new bc0(wv0Var, lv1Var);
    }
}
