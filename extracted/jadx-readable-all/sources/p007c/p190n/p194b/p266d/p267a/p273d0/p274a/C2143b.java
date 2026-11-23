package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p314j.p315a.C2962do;
import p007c.p190n.p194b.p266d.p314j.p315a.gd2;
import p007c.p190n.p194b.p266d.p314j.p315a.lv1;
import p007c.p190n.p194b.p266d.p314j.p315a.ms0;
import p007c.p190n.p194b.p266d.p314j.p315a.ns0;
import p007c.p190n.p194b.p266d.p314j.p315a.zc2;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2143b implements zc2<C2144b0> {

    /* JADX INFO: renamed from: a */
    public final gd2<Executor> f10488a;

    /* JADX INFO: renamed from: b */
    public final gd2<ms0> f10489b;

    public C2143b(gd2<Executor> gd2Var, gd2<ms0> gd2Var2) {
        this.f10488a = gd2Var;
        this.f10489b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new C2144b0(lv1Var, ((ns0) this.f10489b).mo4613a());
    }
}
