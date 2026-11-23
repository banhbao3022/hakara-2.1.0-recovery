package p007c.p190n.p194b.p266d.p314j.p315a;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p267a.p282z.C2313d;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2232o;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.os */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(11)
public final class C3373os extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3410ps f17728a;

    public C3373os(InterfaceC3410ps interfaceC3410ps) {
        this.f17728a = interfaceC3410ps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final Context m8053b(WebView webView) {
        if (!(webView instanceof InterfaceC3410ps)) {
            return webView.getContext();
        }
        InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) webView;
        Activity activityMo6482h = interfaceC3410ps.mo6482h();
        return activityMo6482h != null ? activityMo6482h : interfaceC3410ps.getContext();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8054a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        C2313d c2313d;
        try {
            InterfaceC3410ps interfaceC3410ps = this.f17728a;
            if (interfaceC3410ps != null && interfaceC3410ps.mo6459O0() != null && ((C3670ws) this.f17728a.mo6459O0()).f21342x != null && (c2313d = ((C3670ws) this.f17728a.mo6459O0()).f21342x) != null && !c2313d.m4842a()) {
                StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str3).length());
                sb.append("window.");
                sb.append(str);
                sb.append("('");
                sb.append(str3);
                sb.append("')");
                c2313d.m4843b(sb.toString());
                return false;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(str2);
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builder.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC3299ms(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC3262ls(jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC3225ks(jsPromptResult)).create().show();
            } else {
                builder.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC3151is(jsResult)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC3114hs(jsResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC3077gs(jsResult)).create().show();
            }
            return true;
        } catch (WindowManager.BadTokenException e) {
            C2622l.m5241D3("Fail to display Dialog.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof InterfaceC3410ps)) {
            C2622l.m5226A3("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        BinderC2232o binderC2232oMo6436D = ((InterfaceC3410ps) webView).mo6436D();
        if (binderC2232oMo6436D == null) {
            C2622l.m5226A3("Tried to close an AdWebView not associated with an overlay.");
        } else {
            binderC2232oMo6436D.m4683a();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(strMessage).length() + 19 + String.valueOf(strSourceId).length());
        outline.m1572W(sb, "JS: ", strMessage, " (", strSourceId);
        sb.append(":");
        sb.append(iLineNumber);
        sb.append(")");
        String string = sb.toString();
        if (string.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = C3336ns.f17256a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            C2622l.m5408n3(string);
        } else if (i == 2) {
            C2622l.m5226A3(string);
        } else if (i == 3 || i == 4 || i != 5) {
            C2622l.m5458x3(string);
        } else {
            C2622l.m5318U2(string);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f17728a.mo6503s0() != null) {
            webView2.setWebViewClient(this.f17728a.mo6503s0());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        long j5 = 5242880 - j4;
        if (j5 <= 0) {
            quotaUpdater.updateQuota(j2);
            return;
        }
        if (j2 == 0) {
            if (j3 > j5 || j3 > 1048576) {
                j3 = 0;
            }
        } else if (j3 == 0) {
            j3 = Math.min(Math.min(131072L, j5) + j2, 1048576L);
        } else {
            if (j3 <= Math.min(1048576 - j2, j5)) {
                j2 += j3;
            }
            j3 = j2;
        }
        quotaUpdater.updateQuota(j3);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            C2330u c2330u = C2330u.f10884a;
            C2267h1 c2267h1 = c2330u.f10889d;
            if (C2267h1.m4744c(this.f17728a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                z = true;
            } else {
                C2267h1 c2267h2 = c2330u.f10889d;
                if (C2267h1.m4744c(this.f17728a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = true;
                } else {
                    z = false;
                }
            }
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        BinderC2232o binderC2232oMo6436D = this.f17728a.mo6436D();
        if (binderC2232oMo6436D == null) {
            C2622l.m5226A3("Could not get ad overlay when hiding custom view.");
        } else {
            binderC2232oMo6436D.m4684b();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m8054a(m8053b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m8054a(m8053b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m8054a(m8053b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m8054a(m8053b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = j2 + 131072;
        if (5242880 - j3 < j4) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j4);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        BinderC2232o binderC2232oMo6436D = this.f17728a.mo6436D();
        if (binderC2232oMo6436D == null) {
            C2622l.m5226A3("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(binderC2232oMo6436D.f10658h);
        binderC2232oMo6436D.f10664n = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        binderC2232oMo6436D.f10664n.addView(view, -1, -1);
        binderC2232oMo6436D.f10658h.setContentView(binderC2232oMo6436D.f10664n);
        binderC2232oMo6436D.f10675y = true;
        binderC2232oMo6436D.f10665o = customViewCallback;
        binderC2232oMo6436D.f10663m = true;
        binderC2232oMo6436D.m4679L6(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
