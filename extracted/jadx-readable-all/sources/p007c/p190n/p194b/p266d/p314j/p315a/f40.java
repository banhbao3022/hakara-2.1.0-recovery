package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class f40 implements zc2<bc0<a70>> {

    /* JADX INFO: renamed from: a */
    public final gd2<C3379oy> f13782a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f13783b;

    public f40(gd2<C3379oy> gd2Var, gd2<Executor> gd2Var2) {
        this.f13782a = gd2Var;
        this.f13783b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        C3379oy c3379oyMo4613a = this.f13782a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new bc0(c3379oyMo4613a, lv1Var);
    }
}
