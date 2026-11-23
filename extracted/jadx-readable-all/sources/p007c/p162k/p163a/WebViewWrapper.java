package p007c.p162k.p163a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import p007c.p162k.p163a.p164f.CallJavaResultInterface;
import p007c.p162k.p163a.p164f.WebViewWrapperInterface;

/* JADX INFO: renamed from: c.k.a.e, reason: use source file name */
/* JADX INFO: compiled from: WebViewWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public class WebViewWrapper implements WebViewWrapperInterface {

    /* JADX INFO: renamed from: a */
    public WebView f4490a;

    public WebViewWrapper(Context context, CallJavaResultInterface callJavaResultInterface) {
        WebView webView = new WebView(context);
        this.f4490a = webView;
        webView.setWillNotDraw(true);
        WebSettings settings = this.f4490a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        this.f4490a.addJavascriptInterface(new JavaScriptInterface(callJavaResultInterface), "evgeniiJsEvaluator");
    }
}
