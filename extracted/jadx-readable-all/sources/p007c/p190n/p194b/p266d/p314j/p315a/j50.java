package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class j50 implements zc2<i50> {

    /* JADX INFO: renamed from: a */
    public final gd2<y60> f15483a;

    /* JADX INFO: renamed from: b */
    public final gd2<rh1> f15484b;

    /* JADX INFO: renamed from: c */
    public final gd2<ScheduledExecutorService> f15485c;

    /* JADX INFO: renamed from: d */
    public final gd2<Executor> f15486d;

    public j50(gd2<y60> gd2Var, gd2<rh1> gd2Var2, gd2<ScheduledExecutorService> gd2Var3, gd2<Executor> gd2Var4) {
        this.f15483a = gd2Var;
        this.f15484b = gd2Var2;
        this.f15485c = gd2Var3;
        this.f15486d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        y60 y60VarMo4613a = this.f15483a.mo4613a();
        rh1 rh1VarM6282b = ((d30) this.f15484b).m6282b();
        ScheduledExecutorService scheduledExecutorServiceMo4613a = this.f15485c.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new i50(y60VarMo4613a, rh1VarM6282b, scheduledExecutorServiceMo4613a, lv1Var);
    }
}
