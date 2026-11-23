package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3485rt;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3708xt;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3782zt;

/* JADX INFO: renamed from: c.n.b.d.j.a.qt */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public final class C3448qt<WebViewT extends InterfaceC3485rt & InterfaceC3708xt & InterfaceC3782zt> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3411pt f18432a;

    /* JADX INFO: renamed from: b */
    public final WebViewT f18433b;

    public C3448qt(WebViewT webviewt, InterfaceC3411pt interfaceC3411pt) {
        this.f18432a = interfaceC3411pt;
        this.f18433b = webviewt;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            C2096e.m4590z("Click string is empty, not proceeding.");
            return "";
        }
        rd2 rd2VarMo6502s = this.f18433b.mo6502s();
        if (rd2VarMo6502s == null) {
            C2096e.m4590z("Signal utils is empty, ignoring.");
            return "";
        }
        tb2 tb2Var = rd2VarMo6502s.f18750d;
        if (tb2Var == null) {
            C2096e.m4590z("Signals object is empty, ignoring.");
            return "";
        }
        if (this.f18433b.getContext() == null) {
            C2096e.m4590z("Context is null, ignoring.");
            return "";
        }
        Context context = this.f18433b.getContext();
        WebViewT webviewt = this.f18433b;
        return tb2Var.mo4854c(context, str, (View) webviewt, webviewt.mo6482h());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            C2622l.m5226A3("URL is empty, ignoring message");
        } else {
            C2267h1.f10713a.post(new Runnable(this, str) { // from class: c.n.b.d.j.a.ot

                /* JADX INFO: renamed from: f */
                public final C3448qt f17730f;

                /* JADX INFO: renamed from: g */
                public final String f17731g;

                {
                    this.f17730f = this;
                    this.f17731g = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C3448qt c3448qt = this.f17730f;
                    String str2 = this.f17731g;
                    InterfaceC3411pt interfaceC3411pt = c3448qt.f18432a;
                    Uri uri = Uri.parse(str2);
                    C3670ws c3670ws = ((ViewTreeObserverOnGlobalLayoutListenerC3115ht) ((C3337nt) interfaceC3411pt).f17267a).f14998s;
                    if (c3670ws == null) {
                        C2622l.m5408n3("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    } else {
                        c3670ws.m8675a(uri);
                    }
                }
            });
        }
    }
}
