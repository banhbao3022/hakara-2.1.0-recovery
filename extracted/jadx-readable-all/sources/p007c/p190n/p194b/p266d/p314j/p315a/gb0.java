package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gb0 implements zc2<p01> {

    /* JADX INFO: renamed from: a */
    public final ja0 f14527a;

    /* JADX INFO: renamed from: b */
    public final gd2<InterfaceC2782b> f14528b;

    /* JADX INFO: renamed from: c */
    public final gd2<q01> f14529c;

    /* JADX INFO: renamed from: d */
    public final gd2<hx0> f14530d;

    public gb0(ja0 ja0Var, gd2<InterfaceC2782b> gd2Var, gd2<q01> gd2Var2, gd2<hx0> gd2Var3) {
        this.f14527a = ja0Var;
        this.f14528b = gd2Var;
        this.f14529c = gd2Var2;
        this.f14530d = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        ja0 ja0Var = this.f14527a;
        InterfaceC2782b interfaceC2782bMo4613a = this.f14528b.mo4613a();
        q01 q01VarMo4613a = ((r01) this.f14529c).mo4613a();
        hx0 hx0VarMo4613a = this.f14530d.mo4613a();
        if (ja0Var.f15531p == null) {
            ja0Var.f15531p = new p01(interfaceC2782bMo4613a, q01VarMo4613a, hx0VarMo4613a);
        }
        p01 p01Var = ja0Var.f15531p;
        Objects.requireNonNull(p01Var, "Cannot return null from a non-@Nullable @Provides method");
        return p01Var;
    }
}
