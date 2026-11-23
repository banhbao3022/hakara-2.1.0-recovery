package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.bz */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2899bz implements zc2<C3602uy> {

    /* JADX INFO: renamed from: a */
    public final gd2<ep2> f12896a;

    /* JADX INFO: renamed from: b */
    public final gd2<C2839ad> f12897b;

    /* JADX INFO: renamed from: c */
    public final gd2<Executor> f12898c;

    public C2899bz(gd2<ep2> gd2Var, gd2<C2839ad> gd2Var2, gd2<Executor> gd2Var3) {
        this.f12896a = gd2Var;
        this.f12897b = gd2Var2;
        this.f12898c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        ep2 ep2VarMo4613a = this.f12896a.mo4613a();
        C2839ad c2839adMo4613a = this.f12897b.mo4613a();
        lv1 lv1VarM5445v0 = C2622l.m5445v0();
        Objects.requireNonNull(lv1VarM5445v0, "Cannot return null from a non-@Nullable @Provides method");
        return new C3602uy(ep2VarMo4613a.f13638c, c2839adMo4613a, lv1VarM5445v0);
    }
}
