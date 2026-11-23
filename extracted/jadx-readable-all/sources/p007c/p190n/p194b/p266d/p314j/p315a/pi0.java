package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pi0 implements zc2<oi0> {

    /* JADX INFO: renamed from: a */
    public final gd2<lv1> f17978a;

    /* JADX INFO: renamed from: b */
    public final gd2<yi0> f17979b;

    /* JADX INFO: renamed from: c */
    public final gd2<dj0> f17980c;

    public pi0(gd2<lv1> gd2Var, gd2<yi0> gd2Var2, gd2<dj0> gd2Var3) {
        this.f17978a = gd2Var;
        this.f17979b = gd2Var2;
        this.f17980c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final oi0 mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        yi0 yi0VarMo4613a = ((zi0) this.f17979b).mo4613a();
        ej0 ej0Var = (ej0) this.f17980c;
        Objects.requireNonNull(ej0Var);
        return new oi0(lv1Var, yi0VarMo4613a, new dj0(lv1Var, ((zi0) ej0Var.f13591b).mo4613a()));
    }
}
