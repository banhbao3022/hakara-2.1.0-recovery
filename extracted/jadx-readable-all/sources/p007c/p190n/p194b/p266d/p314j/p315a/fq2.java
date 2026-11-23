package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fq2 implements ValueCallback<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gq2 f14099a;

    public fq2(gq2 gq2Var) {
        this.f14099a = gq2Var;
    }

    @Override // android.webkit.ValueCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onReceiveValue(String str) {
        gq2 gq2Var = this.f14099a;
        iq2 iq2Var = gq2Var.f14646j;
        xp2 xp2Var = gq2Var.f14643g;
        WebView webView = gq2Var.f14644h;
        boolean z = gq2Var.f14645i;
        Objects.requireNonNull(iq2Var);
        synchronized (xp2Var.f21642g) {
            xp2Var.f21648m--;
        }
        try {
            boolean z2 = true;
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (iq2Var.f15353s || TextUtils.isEmpty(webView.getTitle())) {
                    xp2Var.m8745a(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    xp2Var.m8745a(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (xp2Var.f21642g) {
                if (xp2Var.f21648m != 0) {
                    z2 = false;
                }
            }
            if (z2) {
                iq2Var.f15343i.m8823a(xp2Var);
            }
        } catch (JSONException unused) {
            C2622l.m5318U2("Json string may be malformed.");
        } catch (Throwable th) {
            C2622l.m5358d3("Failed to get webview content.", th);
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(th, "ContentFetchTask.processWebViewContent");
        }
    }
}
