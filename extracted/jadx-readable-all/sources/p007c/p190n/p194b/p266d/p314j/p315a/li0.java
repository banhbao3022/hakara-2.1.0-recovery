package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2257e0;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class li0 implements zc2<ki0> {

    /* JADX INFO: renamed from: a */
    public final gd2<C2257e0> f16365a;

    /* JADX INFO: renamed from: b */
    public final gd2<InterfaceC2782b> f16366b;

    /* JADX INFO: renamed from: c */
    public final gd2<Executor> f16367c;

    public li0(gd2<C2257e0> gd2Var, gd2<InterfaceC2782b> gd2Var2, gd2<Executor> gd2Var3) {
        this.f16365a = gd2Var;
        this.f16366b = gd2Var2;
        this.f16367c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        C2257e0 c2257e0Mo4613a = this.f16365a.mo4613a();
        InterfaceC2782b interfaceC2782bMo4613a = this.f16366b.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new ki0(c2257e0Mo4613a, interfaceC2782bMo4613a, lv1Var);
    }
}
