package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class k71 implements zc2<d71<oa1>> {

    /* JADX INFO: renamed from: a */
    public final gd2<qa1> f15894a;

    /* JADX INFO: renamed from: b */
    public final gd2<InterfaceC2782b> f15895b;

    public k71(gd2<qa1> gd2Var, gd2<InterfaceC2782b> gd2Var2) {
        this.f15894a = gd2Var;
        this.f15895b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        ra1 ra1Var = (ra1) this.f15894a;
        Objects.requireNonNull(ra1Var);
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new d71(new qa1(lv1Var, ((C3412pu) ra1Var.f18729b).m8156b()), C3090h4.f14739a.m6603d().longValue(), this.f15895b.mo4613a());
    }
}
