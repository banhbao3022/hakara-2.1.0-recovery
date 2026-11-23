package p007c.p190n.p194b.p266d.p314j.p315a;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gq2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final ValueCallback<String> f14642f = new fq2(this);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ xp2 f14643g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ WebView f14644h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f14645i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ iq2 f14646j;

    public gq2(iq2 iq2Var, xp2 xp2Var, WebView webView, boolean z) {
        this.f14646j = iq2Var;
        this.f14643g = xp2Var;
        this.f14644h = webView;
        this.f14645i = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14644h.getSettings().getJavaScriptEnabled()) {
            try {
                this.f14644h.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f14642f);
            } catch (Throwable unused) {
                ((fq2) this.f14642f).onReceiveValue("");
            }
        }
    }
}
