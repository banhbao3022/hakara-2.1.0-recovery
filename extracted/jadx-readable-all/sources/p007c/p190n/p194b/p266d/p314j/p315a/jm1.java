package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jm1 implements zc2<im1> {

    /* JADX INFO: renamed from: a */
    public final gd2<om1> f15657a;

    /* JADX INFO: renamed from: b */
    public final gd2<wm1> f15658b;

    /* JADX INFO: renamed from: c */
    public final gd2<ScheduledExecutorService> f15659c;

    public jm1(gd2<om1> gd2Var, gd2<wm1> gd2Var2, gd2<ScheduledExecutorService> gd2Var3) {
        this.f15657a = gd2Var;
        this.f15658b = gd2Var2;
        this.f15659c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        vc2 vc2VarM8792c = yc2.m8792c(this.f15657a);
        vc2 vc2VarM8792c2 = yc2.m8792c(this.f15658b);
        Object lm1Var = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14358g5)).booleanValue() ? new lm1((im1) vc2VarM8792c.m8545a(), this.f15659c.mo4613a()) : (im1) vc2VarM8792c2.m8545a();
        Objects.requireNonNull(lm1Var, "Cannot return null from a non-@Nullable @Provides method");
        return lm1Var;
    }
}
