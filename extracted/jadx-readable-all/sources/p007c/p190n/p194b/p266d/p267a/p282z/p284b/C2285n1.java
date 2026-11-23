package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C2998en;
import p007c.p190n.p194b.p266d.p314j.p315a.C3596ut;
import p007c.p190n.p194b.p266d.p314j.p315a.C3670ws;
import p007c.p190n.p194b.p266d.p314j.p315a.C3696xh;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps;
import p007c.p190n.p194b.p266d.p314j.p315a.as2;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.n1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public class C2285n1 extends C2282m1 {
    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: k */
    public final CookieManager mo4722k(Context context) {
        if (!C2253d.m4711r()) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th) {
                C2622l.m5438t3("Failed to obtain CookieManager.", th);
                C2998en c2998en = C2330u.f10884a.f10893h;
                C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(th, "ApiLevelUtil.getCookieManager");
            }
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: l */
    public final C3670ws mo4723l(InterfaceC3410ps interfaceC3410ps, as2 as2Var, boolean z) {
        return new C3596ut(interfaceC3410ps, as2Var, z);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: m */
    public final int mo4724m() {
        return R.style.Theme.Material.Dialog.Alert;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: n */
    public final WebResourceResponse mo4725n(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
