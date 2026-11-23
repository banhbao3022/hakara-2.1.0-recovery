package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ac1 implements zc2<yb1> {

    /* JADX INFO: renamed from: a */
    public final gd2<C3627vm> f12065a;

    /* JADX INFO: renamed from: b */
    public final gd2<lv1> f12066b;

    /* JADX INFO: renamed from: c */
    public final gd2<String> f12067c;

    public ac1(gd2<C3627vm> gd2Var, gd2<lv1> gd2Var2, gd2<String> gd2Var3) {
        this.f12065a = gd2Var;
        this.f12066b = gd2Var2;
        this.f12067c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        C3627vm c3627vm = new C3627vm();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        String str = ((jc1) this.f12067c).f15553a.f15140a.f18298i;
        Objects.requireNonNull(str, "Cannot return null from a non-@Nullable @Provides method");
        return new yb1(c3627vm, lv1Var, str, null);
    }
}
