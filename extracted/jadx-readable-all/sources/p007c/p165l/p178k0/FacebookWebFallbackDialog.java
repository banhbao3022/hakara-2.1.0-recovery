package p007c.p165l.p178k0;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;

/* JADX INFO: renamed from: c.l.k0.o, reason: use source file name */
/* JADX INFO: compiled from: FacebookWebFallbackDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class FacebookWebFallbackDialog extends WebDialog {

    /* JADX INFO: renamed from: s */
    public static final String f4988s = FacebookWebFallbackDialog.class.getName();

    /* JADX INFO: renamed from: t */
    public boolean f4989t;

    /* JADX INFO: renamed from: c.l.k0.o$a */
    /* JADX INFO: compiled from: FacebookWebFallbackDialog.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FacebookWebFallbackDialog.super.cancel();
        }
    }

    public FacebookWebFallbackDialog(Context context, String str, String str2) {
        super(context, str);
        this.f4925h = str2;
    }

    @Override // p007c.p165l.p178k0.WebDialog
    /* JADX INFO: renamed from: c */
    public Bundle mo2489c(String str) {
        Bundle bundleM2432E = Utility.m2432E(Uri.parse(str).getQuery());
        String string = bundleM2432E.getString("bridge_args");
        bundleM2432E.remove("bridge_args");
        if (!Utility.m2466y(string)) {
            try {
                bundleM2432E.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", BundleJSONConverter.m2423a(new JSONObject(string)));
            } catch (JSONException unused) {
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            }
        }
        String string2 = bundleM2432E.getString("method_results");
        bundleM2432E.remove("method_results");
        if (!Utility.m2466y(string2)) {
            if (Utility.m2466y(string2)) {
                string2 = "{}";
            }
            try {
                bundleM2432E.putBundle("com.facebook.platform.protocol.RESULT_ARGS", BundleJSONConverter.m2423a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
            }
        }
        bundleM2432E.remove("version");
        bundleM2432E.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", NativeProtocol.m2545i());
        return bundleM2432E;
    }

    @Override // p007c.p165l.p178k0.WebDialog, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView webView = this.f4927j;
        if (!this.f4934q || this.f4932o || webView == null || !webView.isShown()) {
            super.cancel();
            return;
        }
        if (this.f4989t) {
            return;
        }
        this.f4989t = true;
        webView.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
        new Handler(Looper.getMainLooper()).postDelayed(new a(), 1500L);
    }
}
