package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.c1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2252c1 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f10695f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2267h1 f10696g;

    public RunnableC2252c1(C2267h1 c2267h1, Context context) {
        this.f10696g = c2267h1;
        this.f10695f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM4739I;
        synchronized (this.f10696g.f10718f) {
            C2267h1 c2267h1 = this.f10696g;
            try {
                strM4739I = new WebView(this.f10695f).getSettings().getUserAgentString();
            } catch (Throwable unused) {
                strM4739I = C2267h1.m4739I();
            }
            c2267h1.f10719g = strM4739I;
            this.f10696g.f10718f.notifyAll();
        }
    }
}
