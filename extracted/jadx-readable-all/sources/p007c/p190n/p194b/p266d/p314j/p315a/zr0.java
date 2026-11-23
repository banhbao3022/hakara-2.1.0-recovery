package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zr0 implements zc2<bc0<z80>> {

    /* JADX INFO: renamed from: a */
    public final gd2<it0> f22394a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f22395b;

    public zr0(gd2<it0> gd2Var, gd2<Executor> gd2Var2) {
        this.f22394a = gd2Var;
        this.f22395b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        it0 it0VarMo4613a = ((jt0) this.f22394a).mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new bc0(it0VarMo4613a, lv1Var);
    }
}
