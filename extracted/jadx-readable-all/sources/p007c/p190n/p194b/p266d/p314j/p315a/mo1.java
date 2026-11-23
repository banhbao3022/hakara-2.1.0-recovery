package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mo1 extends lo1 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public mo1(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.f16431a = new hp1(webView);
    }
}
