package p007c.p043b.p044a.p045a.p051b.p055j;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;

/* JADX INFO: renamed from: c.b.a.a.b.j.d, reason: use source file name */
/* JADX INFO: compiled from: WebViewYouTubePlayer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WebViewYouTubePlayer2 extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        return defaultVideoPoster != null ? defaultVideoPoster : Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
    }
}
