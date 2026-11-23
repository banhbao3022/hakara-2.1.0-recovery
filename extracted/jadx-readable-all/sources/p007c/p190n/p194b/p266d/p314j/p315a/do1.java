package p007c.p190n.p194b.p266d.p314j.p315a;

import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class do1 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ WebView f13338f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f13339g;

    public do1(WebView webView, String str) {
        this.f13338f = webView;
        this.f13339g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13338f.loadUrl(this.f13339g);
    }
}
