package p007c.p190n.p194b.p266d.p314j.p315a;

import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class no1 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final WebView f17186f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ oo1 f17187g;

    public no1(oo1 oo1Var) {
        this.f17187g = oo1Var;
        this.f17186f = oo1Var.f17702d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17186f.destroy();
    }
}
