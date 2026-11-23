package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yt0 {

    /* JADX INFO: renamed from: a */
    public final lv1 f21991a;

    /* JADX INFO: renamed from: b */
    public final ht0 f21992b;

    /* JADX INFO: renamed from: c */
    public final vc2<pu0> f21993c;

    public yt0(lv1 lv1Var, ht0 ht0Var, vc2<pu0> vc2Var) {
        this.f21991a = lv1Var;
        this.f21992b = ht0Var;
        this.f21993c = vc2Var;
    }

    /* JADX INFO: renamed from: a */
    public final <RetT> kv1<RetT> m8830a(final C3437qi c3437qi, xt0<InputStream> xt0Var, final xt0<InputStream> xt0Var2, final qu1<InputStream, RetT> qu1Var) {
        String str = c3437qi.f18298i;
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        return cw0.m6247q(cw0.m6249s(zu1.m8908s(C2267h1.m4745d(str) ? new gv1(new ot0(1)) : cw0.m6247q(xt0Var.mo8368a(c3437qi), ExecutionException.class, pt0.f18087a, this.f21991a)), qu1Var, this.f21991a), ot0.class, new qu1(this, xt0Var2, c3437qi, qu1Var) { // from class: c.n.b.d.j.a.qt0

            /* JADX INFO: renamed from: a */
            public final yt0 f18434a;

            /* JADX INFO: renamed from: b */
            public final xt0 f18435b;

            /* JADX INFO: renamed from: c */
            public final C3437qi f18436c;

            /* JADX INFO: renamed from: d */
            public final qu1 f18437d;

            {
                this.f18434a = this;
                this.f18435b = xt0Var2;
                this.f18436c = c3437qi;
                this.f18437d = qu1Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                yt0 yt0Var = this.f18434a;
                xt0 xt0Var3 = this.f18435b;
                C3437qi c3437qi2 = this.f18436c;
                qu1 qu1Var2 = this.f18437d;
                Objects.requireNonNull(yt0Var);
                return cw0.m6249s(xt0Var3.mo8368a(c3437qi2), qu1Var2, yt0Var.f21991a);
            }
        }, this.f21991a);
    }
}
