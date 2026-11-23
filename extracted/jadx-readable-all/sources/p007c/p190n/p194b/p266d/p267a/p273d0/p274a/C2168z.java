package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C2962do;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.gd2;
import p007c.p190n.p194b.p266d.p314j.p315a.kv1;
import p007c.p190n.p194b.p266d.p314j.p315a.lv1;
import p007c.p190n.p194b.p266d.p314j.p315a.ns0;
import p007c.p190n.p194b.p266d.p314j.p315a.o50;
import p007c.p190n.p194b.p266d.p314j.p315a.ol1;
import p007c.p190n.p194b.p266d.p314j.p315a.p50;
import p007c.p190n.p194b.p266d.p314j.p315a.rl1;
import p007c.p190n.p194b.p266d.p314j.p315a.yl1;
import p007c.p190n.p194b.p266d.p314j.p315a.zc2;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.z */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2168z implements zc2<kv1<C2145c>> {

    /* JADX INFO: renamed from: a */
    public final gd2<yl1> f10545a;

    /* JADX INFO: renamed from: b */
    public final gd2<C2144b0> f10546b;

    /* JADX INFO: renamed from: c */
    public final gd2<o50> f10547c;

    public C2168z(gd2<yl1> gd2Var, gd2<C2144b0> gd2Var2, gd2<o50> gd2Var3) {
        this.f10545a = gd2Var;
        this.f10546b = gd2Var2;
        this.f10547c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        yl1 yl1VarMo4613a = this.f10545a.mo4613a();
        C2143b c2143b = (C2143b) this.f10546b;
        Objects.requireNonNull(c2143b);
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        C2144b0 c2144b0 = new C2144b0(lv1Var, ((ns0) c2143b.f10489b).mo4613a());
        ol1<I> ol1VarM8125a = yl1VarMo4613a.m8125a(rl1.GENERATE_SIGNALS, ((p50) this.f10547c).mo4613a().m7964b());
        return ol1VarM8125a.m8038b(c2144b0, ol1VarM8125a.f17674f.f18025b).m8041e(((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14377j3)).intValue(), TimeUnit.SECONDS).m8042f();
    }
}
