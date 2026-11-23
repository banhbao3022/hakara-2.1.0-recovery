package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xo0 implements zc2<uo0> {

    /* JADX INFO: renamed from: a */
    public final gd2<Executor> f21627a;

    /* JADX INFO: renamed from: b */
    public final gd2<C3665wn> f21628b;

    /* JADX INFO: renamed from: c */
    public final gd2<qm1> f21629c;

    /* JADX INFO: renamed from: d */
    public final gd2<sm1> f21630d;

    public xo0(gd2<Executor> gd2Var, gd2<C3665wn> gd2Var2, gd2<qm1> gd2Var3, gd2<sm1> gd2Var4) {
        this.f21627a = gd2Var;
        this.f21628b = gd2Var2;
        this.f21629c = gd2Var3;
        this.f21630d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new uo0(lv1Var, this.f21628b.mo4613a(), ((rm1) this.f21629c).mo4613a(), new sm1());
    }
}
