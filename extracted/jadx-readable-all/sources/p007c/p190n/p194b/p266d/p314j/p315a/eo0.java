package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class eo0 implements zc2<bc0<z80>> {

    /* JADX INFO: renamed from: a */
    public final gd2<co0> f13627a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f13628b;

    /* JADX INFO: renamed from: c */
    public final gd2<zu0> f13629c;

    public eo0(gd2<co0> gd2Var, gd2<Executor> gd2Var2, gd2<zu0> gd2Var3) {
        this.f13627a = gd2Var;
        this.f13628b = gd2Var2;
        this.f13629c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        co0 co0VarMo4613a = this.f13627a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14351f5)).booleanValue() ? new bc0(this.f13629c.mo4613a(), lv1Var) : new bc0(co0VarMo4613a, lv1Var);
    }
}
