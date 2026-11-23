package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yr0 implements zc2<kv1<String>> {

    /* JADX INFO: renamed from: a */
    public final gd2<yl1> f21979a;

    /* JADX INFO: renamed from: b */
    public final gd2<Context> f21980b;

    public yr0(gd2<yl1> gd2Var, gd2<Context> gd2Var2) {
        this.f21979a = gd2Var;
        this.f21980b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        yl1 yl1VarMo4613a = this.f21979a.mo4613a();
        final CookieManager cookieManagerMo4722k = C2330u.f10884a.f10891f.mo4722k(this.f21980b.mo4613a());
        ol1 ol1VarM8041e = C2622l.m5412o2(new Callable(cookieManagerMo4722k) { // from class: c.n.b.d.j.a.ur0

            /* JADX INFO: renamed from: a */
            public final CookieManager f20411a;

            {
                this.f20411a = cookieManagerMo4722k;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = this.f20411a;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14458v0));
            }
        }, yl1VarMo4613a.f18025b, rl1.WEBVIEW_COOKIE, yl1VarMo4613a).m8041e(1L, TimeUnit.SECONDS);
        final dl1 dl1Var = vr0.f20917a;
        return ol1VarM8041e.m8040d(Exception.class, new qu1(dl1Var) { // from class: c.n.b.d.j.a.ll1
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                return cw0.m6231a("");
            }
        }).m8042f();
    }
}
