package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class n81 implements zc2<l81> {

    /* JADX INFO: renamed from: a */
    public final gd2<lv1> f17039a;

    /* JADX INFO: renamed from: b */
    public final gd2<qh1> f17040b;

    public n81(gd2<lv1> gd2Var, gd2<qh1> gd2Var2) {
        this.f17039a = gd2Var;
        this.f17040b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new l81(lv1Var, this.f17040b.mo4613a());
    }
}
