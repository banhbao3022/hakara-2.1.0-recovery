package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class na1<T> implements zc2<ma1<T>> {

    /* JADX INFO: renamed from: a */
    public final gd2<Executor> f17061a;

    /* JADX INFO: renamed from: b */
    public final gd2<Set<ia1<? extends ha1<T>>>> f17062b;

    public na1(gd2<Executor> gd2Var, gd2<Set<ia1<? extends ha1<T>>>> gd2Var2) {
        this.f17061a = gd2Var;
        this.f17062b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new ma1(lv1Var, ((ed2) this.f17062b).mo4613a());
    }
}
