package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xz0 implements zc2<wz0> {

    /* JADX INFO: renamed from: a */
    public final gd2<qe0> f21721a;

    /* JADX INFO: renamed from: b */
    public final gd2<lv1> f21722b;

    /* JADX INFO: renamed from: c */
    public final gd2<oi0> f21723c;

    /* JADX INFO: renamed from: d */
    public final gd2<wi1<vk0>> f21724d;

    public xz0(gd2<qe0> gd2Var, gd2<lv1> gd2Var2, gd2<oi0> gd2Var3, gd2<wi1<vk0>> gd2Var4) {
        this.f21721a = gd2Var;
        this.f21722b = gd2Var2;
        this.f21723c = gd2Var3;
        this.f21724d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        qe0 qe0VarMo4613a = this.f21721a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new wz0(qe0VarMo4613a, lv1Var, ((pi0) this.f21723c).mo4613a(), this.f21724d.mo4613a());
    }
}
