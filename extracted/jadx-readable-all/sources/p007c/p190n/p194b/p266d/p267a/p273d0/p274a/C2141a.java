package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.Objects;
import java.util.UUID;
import p007c.p190n.p194b.p266d.p267a.C2172f;
import p007c.p190n.p194b.p266d.p267a.EnumC2106b;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3247ld;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3399ph;
import p007c.p190n.p194b.p266d.p314j.p315a.C3346o1;
import p007c.p190n.p194b.p266d.p314j.p315a.C3473rh;
import p007c.p190n.p194b.p266d.p314j.p315a.C3552tm;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3404pm;
import p007c.p190n.p194b.p266d.p314j.p315a.ex2;
import p007c.p190n.p194b.p266d.p314j.p315a.fw2;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;
import p007c.p190n.p194b.p266d.p314j.p315a.iw2;
import p007c.p190n.p194b.p266d.p314j.p315a.vw2;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2141a {

    /* JADX INFO: renamed from: a */
    public final Context f10485a;

    /* JADX INFO: renamed from: b */
    public final WebView f10486b;

    public C2141a(WebView webView) {
        this.f10486b = webView;
        this.f10485a = webView.getContext();
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        InterfaceC3404pm interfaceC3404pm;
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        String string = UUID.randomUUID().toString();
        Context context = this.f10485a;
        EnumC2106b enumC2106b = EnumC2106b.BANNER;
        C3346o1 c3346o1 = new C3346o1(new C2172f.a().f10555a, null);
        C2146d c2146d = new C2146d(this, string);
        C3473rh c3473rh = new C3473rh(context, enumC2106b, c3346o1);
        Context context2 = c3473rh.f18773b;
        synchronized (C3473rh.class) {
            if (C3473rh.f18772a == null) {
                ex2 ex2Var = gx2.f14692a.f14694c;
                BinderC3247ld binderC3247ld = new BinderC3247ld();
                Objects.requireNonNull(ex2Var);
                C3473rh.f18772a = new vw2(context2, binderC3247ld).m6891d(context2, false);
            }
            interfaceC3404pm = C3473rh.f18772a;
        }
        if (interfaceC3404pm == null) {
            c2146d.mo4614a("Internal Error, query info generator is null.");
        } else {
            BinderC2800b binderC2800b = new BinderC2800b(c3473rh.f18773b);
            C3346o1 c3346o2 = c3473rh.f18775d;
            try {
                interfaceC3404pm.mo4622x4(binderC2800b, new C3552tm(null, c3473rh.f18774c.name(), null, c3346o2 == null ? new fw2().m6890a() : iw2.f15412a.m7314a(c3473rh.f18773b, c3346o2)), new BinderC3399ph(c2146d));
            } catch (RemoteException unused) {
                c2146d.mo4614a("Internal Error.");
            }
        }
        return string;
    }
}
