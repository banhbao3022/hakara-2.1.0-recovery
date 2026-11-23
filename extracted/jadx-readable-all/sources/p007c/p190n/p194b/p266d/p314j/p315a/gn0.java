package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gn0 implements zc2<Set<bc0<zl1>>> {

    /* JADX INFO: renamed from: a */
    public final gd2<Executor> f14626a;

    /* JADX INFO: renamed from: b */
    public final gd2<yn0> f14627b;

    public gn0(gd2<Executor> gd2Var, gd2<yn0> gd2Var2) {
        this.f14626a = gd2Var;
        this.f14627b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        Set setSingleton = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14223L2)).booleanValue() ? Collections.singleton(new bc0(((zn0) this.f14627b).mo4613a(), lv1Var)) : Collections.emptySet();
        Objects.requireNonNull(setSingleton, "Cannot return null from a non-@Nullable @Provides method");
        return setSingleton;
    }
}
