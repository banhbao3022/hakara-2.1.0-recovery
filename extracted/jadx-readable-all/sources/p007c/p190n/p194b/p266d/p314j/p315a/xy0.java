package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xy0 implements zc2<wy0> {

    /* JADX INFO: renamed from: a */
    public final gd2<k10> f21716a;

    /* JADX INFO: renamed from: b */
    public final gd2<dy0> f21717b;

    /* JADX INFO: renamed from: c */
    public final gd2<k60> f21718c;

    /* JADX INFO: renamed from: d */
    public final gd2<ScheduledExecutorService> f21719d;

    /* JADX INFO: renamed from: e */
    public final gd2<lv1> f21720e;

    public xy0(gd2<k10> gd2Var, gd2<dy0> gd2Var2, gd2<k60> gd2Var3, gd2<ScheduledExecutorService> gd2Var4, gd2<lv1> gd2Var5) {
        this.f21716a = gd2Var;
        this.f21717b = gd2Var2;
        this.f21718c = gd2Var3;
        this.f21719d = gd2Var4;
        this.f21720e = gd2Var5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wy0 mo4613a() {
        k10 k10VarMo4613a = this.f21716a.mo4613a();
        dy0 dy0VarMo4613a = ((ey0) this.f21717b).mo4613a();
        k60 k60VarMo4613a = this.f21718c.mo4613a();
        ScheduledExecutorService scheduledExecutorServiceMo4613a = this.f21719d.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new wy0(k10VarMo4613a, dy0VarMo4613a, k60VarMo4613a, scheduledExecutorServiceMo4613a, lv1Var);
    }
}
