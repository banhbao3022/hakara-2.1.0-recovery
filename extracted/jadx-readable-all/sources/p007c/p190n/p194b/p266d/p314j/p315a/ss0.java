package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ss0 implements zc2<rs0> {

    /* JADX INFO: renamed from: a */
    public final gd2<ii1> f19690a;

    /* JADX INFO: renamed from: b */
    public final gd2<sr0> f19691b;

    /* JADX INFO: renamed from: c */
    public final gd2<lv1> f19692c;

    /* JADX INFO: renamed from: d */
    public final gd2<ScheduledExecutorService> f19693d;

    /* JADX INFO: renamed from: e */
    public final gd2<tv0> f19694e;

    public ss0(gd2<ii1> gd2Var, gd2<sr0> gd2Var2, gd2<lv1> gd2Var3, gd2<ScheduledExecutorService> gd2Var4, gd2<tv0> gd2Var5) {
        this.f19690a = gd2Var;
        this.f19691b = gd2Var2;
        this.f19692c = gd2Var3;
        this.f19693d = gd2Var4;
        this.f19694e = gd2Var5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        ii1 ii1VarM8778b = ((y50) this.f19690a).m8778b();
        sr0 sr0VarMo4613a = ((tr0) this.f19691b).mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new rs0(ii1VarM8778b, sr0VarMo4613a, lv1Var, this.f19693d.mo4613a(), this.f19694e.mo4613a());
    }
}
