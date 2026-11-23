package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class eo1 {
    /* JADX INFO: renamed from: a */
    public static final void m6651a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            if (str.length() != 0) {
                "The WebView is null for ".concat(str);
                return;
            } else {
                new String("The WebView is null for ");
                return;
            }
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        if (objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("\"\"");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb.append(string);
                    } else {
                        sb.append('\"');
                        sb.append(string);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")}");
        String string2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(string2);
        } else {
            handler.post(new do1(webView, string2));
        }
    }
}
