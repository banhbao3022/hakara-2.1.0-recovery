package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qu0 implements zc2<pu0> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f18439a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f18440b;

    /* JADX INFO: renamed from: c */
    public final gd2<C2920cj> f18441c;

    /* JADX INFO: renamed from: d */
    public final gd2<InterfaceC3638vx> f18442d;

    /* JADX INFO: renamed from: e */
    public final gd2<AbstractC2882bj> f18443e;

    /* JADX INFO: renamed from: f */
    public final gd2<HashMap<String, mu0>> f18444f;

    /* JADX INFO: renamed from: g */
    public final gd2<uu0> f18445g;

    public qu0(gd2<Context> gd2Var, gd2<Executor> gd2Var2, gd2<C2920cj> gd2Var3, gd2<InterfaceC3638vx> gd2Var4, gd2<AbstractC2882bj> gd2Var5, gd2<HashMap<String, mu0>> gd2Var6, gd2<uu0> gd2Var7) {
        this.f18439a = gd2Var;
        this.f18440b = gd2Var2;
        this.f18441c = gd2Var3;
        this.f18442d = gd2Var4;
        this.f18443e = gd2Var5;
        this.f18444f = gd2Var6;
        this.f18445g = gd2Var7;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Context contextM8156b = ((C3412pu) this.f18439a).m8156b();
        Executor executorMo4613a = this.f18440b.mo4613a();
        C2920cj c2920cj = new C2920cj();
        AbstractC3264lu abstractC3264luMo4613a = ((C3635vu) this.f18442d).f20944a.mo4613a();
        Objects.requireNonNull(abstractC3264luMo4613a, "Cannot return null from a non-@Nullable @Provides method");
        return new pu0(contextM8156b, executorMo4613a, c2920cj, abstractC3264luMo4613a, ((C3080gv) this.f18443e).mo4613a(), this.f18444f.mo4613a(), new uu0(), null);
    }
}
