package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class j71 implements zc2<d71<x61>> {

    /* JADX INFO: renamed from: a */
    public final gd2<w61> f15503a;

    /* JADX INFO: renamed from: b */
    public final gd2<InterfaceC2782b> f15504b;

    public j71(gd2<w61> gd2Var, gd2<InterfaceC2782b> gd2Var2) {
        this.f15503a = gd2Var;
        this.f15504b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        y61 y61Var = (y61) this.f15503a;
        Objects.requireNonNull(y61Var);
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new d71(new w61(lv1Var, ((C3412pu) y61Var.f21748b).m8156b()), 10000L, this.f15504b.mo4613a());
    }
}
