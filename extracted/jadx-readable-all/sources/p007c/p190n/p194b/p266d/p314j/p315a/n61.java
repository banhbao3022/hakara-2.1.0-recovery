package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class n61 implements zc2<m61> {

    /* JADX INFO: renamed from: a */
    public final gd2<Executor> f17030a;

    /* JADX INFO: renamed from: b */
    public final gd2<C2998en> f17031b;

    public n61(gd2<Executor> gd2Var, gd2<C2998en> gd2Var2) {
        this.f17030a = gd2Var;
        this.f17031b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new m61(lv1Var, this.f17031b.mo4613a());
    }
}
