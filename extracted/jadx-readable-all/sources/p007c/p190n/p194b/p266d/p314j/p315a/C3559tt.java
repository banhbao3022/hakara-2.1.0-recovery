package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.facebook.stetho.common.Utf8Charset;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2232o;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2257e0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.tt */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(11)
public class C3559tt extends C3670ws {
    public C3559tt(InterfaceC3410ps interfaceC3410ps, as2 as2Var, boolean z) {
        super(interfaceC3410ps, as2Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final WebResourceResponse m8455M(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof InterfaceC3410ps)) {
            C2622l.m5226A3("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) webView;
        InterfaceC2884bl interfaceC2884bl = this.f21344z;
        if (interfaceC2884bl != null) {
            interfaceC2884bl.mo6036c(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return m8674G(str, map);
        }
        if (interfaceC3410ps.mo6459O0() != null) {
            final C3670ws c3670ws = (C3670ws) interfaceC3410ps.mo6459O0();
            synchronized (c3670ws.f21328j) {
                c3670ws.f21335q = false;
                c3670ws.f21337s = true;
                C2962do.f13334e.execute(new Runnable(c3670ws) { // from class: c.n.b.d.j.a.rs

                    /* JADX INFO: renamed from: f */
                    public final C3670ws f19054f;

                    {
                        this.f19054f = c3670ws;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C3670ws c3670ws2 = this.f19054f;
                        c3670ws2.f21325g.mo6486j0();
                        BinderC2232o binderC2232oMo6436D = c3670ws2.f21325g.mo6436D();
                        if (binderC2232oMo6436D != null) {
                            binderC2232oMo6436D.f10668r.removeView(binderC2232oMo6436D.f10662l);
                            binderC2232oMo6436D.m4677J6(true);
                        }
                    }
                });
            }
        }
        if (interfaceC3410ps.mo6500r().m6689d()) {
            str2 = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14190G);
        } else if (interfaceC3410ps.mo6432B()) {
            str2 = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14184F);
        } else {
            str2 = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14177E);
        }
        C2330u c2330u = C2330u.f10884a;
        C2267h1 c2267h1 = c2330u.f10889d;
        Context context = interfaceC3410ps.getContext();
        String str3 = interfaceC3410ps.mo6495o().f21615f;
        try {
            HashMap map2 = new HashMap();
            map2.put("User-Agent", c2330u.f10889d.m4766B(context, str3));
            map2.put("Cache-Control", "max-stale=3600");
            String str4 = (String) ((C3147io) new C2257e0(context).m4734a(0, str2, map2, null)).get(60L, TimeUnit.SECONDS);
            if (str4 != null) {
                return new WebResourceResponse("application/javascript", Utf8Charset.NAME, new ByteArrayInputStream(str4.getBytes(Utf8Charset.NAME)));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            C2622l.m5241D3("Could not fetch MRAID JS.", e);
            return null;
        }
    }
}
