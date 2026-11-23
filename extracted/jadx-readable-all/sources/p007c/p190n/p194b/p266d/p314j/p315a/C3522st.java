package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: renamed from: c.n.b.d.j.a.st */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(11)
public final class C3522st extends C3559tt {
    public C3522st(InterfaceC3410ps interfaceC3410ps, as2 as2Var, boolean z) {
        super(interfaceC3410ps, as2Var, z);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.C3670ws, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m8455M(webView, str, null);
    }
}
