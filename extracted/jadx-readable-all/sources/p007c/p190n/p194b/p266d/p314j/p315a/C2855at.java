package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import p007c.p190n.p194b.p266d.p267a.p282z.C2312c;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2323n;

/* JADX INFO: renamed from: c.n.b.d.j.a.at */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2855at {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC3410ps m5850a(Context context, C3005eu c3005eu, String str, boolean z, boolean z2, rd2 rd2Var, C2867b4 c2867b4, C3702xn c3702xn, C3533t3 c3533t3, InterfaceC2323n interfaceC2323n, C2312c c2312c, as2 as2Var, rh1 rh1Var, uh1 uh1Var) throws C3781zs {
        C3052g3.m6922a(context);
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                try {
                    TrafficStats.setThreadStatsTag(264);
                    int i = ViewTreeObserverOnGlobalLayoutListenerC3115ht.f14956f;
                    C2967dt c2967dt = new C2967dt(new ViewTreeObserverOnGlobalLayoutListenerC3115ht(new C2968du(context), c3005eu, str, z, rd2Var, c2867b4, c3702xn, interfaceC2323n, c2312c, as2Var, rh1Var, uh1Var));
                    c2967dt.setWebViewClient(C2330u.f10884a.f10891f.mo4723l(c2967dt, as2Var, z2));
                    c2967dt.setWebChromeClient(new C3373os(c2967dt));
                    TrafficStats.clearThreadStatsTag();
                    StrictMode.setThreadPolicy(threadPolicy);
                    return c2967dt;
                } catch (Throwable th) {
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            throw new C3781zs("Webview initialization failed.", th3);
        }
    }
}
