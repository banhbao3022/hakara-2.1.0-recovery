package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import java.io.InputStream;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C2998en;
import p007c.p190n.p194b.p266d.p314j.p315a.C3522st;
import p007c.p190n.p194b.p266d.p314j.p315a.C3670ws;
import p007c.p190n.p194b.p266d.p314j.p315a.C3696xh;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps;
import p007c.p190n.p194b.p266d.p314j.p315a.as2;
import p007c.p190n.p194b.p266d.p314j.p315a.lt2;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public class C2253d {
    public /* synthetic */ C2253d(C2273j1 c2273j1) {
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m4711r() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo4712a(Context context, WebSettings webSettings) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public String mo4713b(Context context) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public void mo4714c(Context context) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public Drawable mo4715d(Context context, Bitmap bitmap, boolean z, float f) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public int mo4716e(ContentResolver contentResolver) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public int mo4717f(ContentResolver contentResolver) {
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo4718g(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public int mo4719h() {
        return 5;
    }

    /* JADX INFO: renamed from: i */
    public long mo4720i() {
        return -1L;
    }

    /* JADX INFO: renamed from: j */
    public ViewGroup.LayoutParams mo4721j() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    /* JADX INFO: renamed from: k */
    public CookieManager mo4722k(Context context) {
        if (!m4711r()) {
            try {
                CookieSyncManager.createInstance(context);
                return CookieManager.getInstance();
            } catch (Throwable th) {
                C2622l.m5438t3("Failed to obtain CookieManager.", th);
                C2998en c2998en = C2330u.f10884a.f10893h;
                C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(th, "ApiLevelUtil.getCookieManager");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public C3670ws mo4723l(InterfaceC3410ps interfaceC3410ps, as2 as2Var, boolean z) {
        return new C3522st(interfaceC3410ps, as2Var, z);
    }

    /* JADX INFO: renamed from: m */
    public int mo4724m() {
        return 1;
    }

    /* JADX INFO: renamed from: n */
    public WebResourceResponse mo4725n(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    /* JADX INFO: renamed from: o */
    public boolean mo4726o(Activity activity, Configuration configuration) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public lt2 mo4727p(Context context, TelephonyManager telephonyManager) {
        return lt2.ENUM_UNKNOWN;
    }

    /* JADX INFO: renamed from: q */
    public void mo4709q(Activity activity) {
    }
}
