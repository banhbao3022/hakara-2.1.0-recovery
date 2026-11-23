package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: renamed from: c.n.b.d.j.a.ut */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public final class C3596ut extends C3559tt {
    public C3596ut(InterfaceC3410ps interfaceC3410ps, as2 as2Var, boolean z) {
        super(interfaceC3410ps, as2Var, z);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return m8455M(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
