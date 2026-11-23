package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.a.hw */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3118hw implements tp0 {

    /* JADX INFO: renamed from: a */
    public final Context f15028a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3169j9 f15029b;

    /* JADX INFO: renamed from: c */
    public final gd2<tp0> f15030c;

    /* JADX INFO: renamed from: d */
    public final gd2<InterfaceC3169j9> f15031d;

    /* JADX INFO: renamed from: e */
    public final gd2<pp0> f15032e;

    /* JADX INFO: renamed from: f */
    public final gd2<rp0> f15033f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3600uw f15034g;

    public C3118hw(C3600uw c3600uw, Context context, InterfaceC3169j9 interfaceC3169j9) {
        this.f15034g = c3600uw;
        this.f15028a = context;
        this.f15029b = interfaceC3169j9;
        ad2 ad2Var = new ad2(this);
        this.f15030c = ad2Var;
        Objects.requireNonNull(interfaceC3169j9, "instance cannot be null");
        ad2 ad2Var2 = new ad2(interfaceC3169j9);
        this.f15031d = ad2Var2;
        qp0 qp0Var = new qp0(ad2Var2);
        this.f15032e = qp0Var;
        gd2<rp0> sp0Var = new sp0(ad2Var, qp0Var);
        Object obj = yc2.f21852a;
        this.f15033f = sp0Var instanceof yc2 ? sp0Var : new yc2(sp0Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tp0
    /* JADX INFO: renamed from: a */
    public final C3007ew mo7177a() {
        return new C3007ew(this);
    }
}
