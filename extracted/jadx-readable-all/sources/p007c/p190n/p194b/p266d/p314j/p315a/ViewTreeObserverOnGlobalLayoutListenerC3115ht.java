package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2312c;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2323n;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2232o;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2223f;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2242y;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2299t0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2266h0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ht */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3115ht extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC3410ps {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f14956f = 0;

    /* JADX INFO: renamed from: A */
    public boolean f14957A;

    /* JADX INFO: renamed from: B */
    public Boolean f14958B;

    /* JADX INFO: renamed from: C */
    public boolean f14959C;

    /* JADX INFO: renamed from: D */
    public final String f14960D;

    /* JADX INFO: renamed from: E */
    public BinderC3263lt f14961E;

    /* JADX INFO: renamed from: F */
    public boolean f14962F;

    /* JADX INFO: renamed from: G */
    public boolean f14963G;

    /* JADX INFO: renamed from: H */
    public InterfaceC3128i5 f14964H;

    /* JADX INFO: renamed from: I */
    public InterfaceC3054g5 f14965I;

    /* JADX INFO: renamed from: J */
    public uq2 f14966J;

    /* JADX INFO: renamed from: K */
    public int f14967K;

    /* JADX INFO: renamed from: L */
    public int f14968L;

    /* JADX INFO: renamed from: M */
    public C3422q3 f14969M;

    /* JADX INFO: renamed from: N */
    public final C3422q3 f14970N;

    /* JADX INFO: renamed from: O */
    public C3422q3 f14971O;

    /* JADX INFO: renamed from: P */
    public final C3459r3 f14972P;

    /* JADX INFO: renamed from: Q */
    public int f14973Q;

    /* JADX INFO: renamed from: R */
    public int f14974R;

    /* JADX INFO: renamed from: S */
    public int f14975S;

    /* JADX INFO: renamed from: T */
    public BinderC2232o f14976T;

    /* JADX INFO: renamed from: U */
    public boolean f14977U;

    /* JADX INFO: renamed from: V */
    public final C2299t0 f14978V;

    /* JADX INFO: renamed from: W */
    public int f14979W;

    /* JADX INFO: renamed from: a0 */
    public int f14980a0;

    /* JADX INFO: renamed from: b0 */
    public int f14981b0;

    /* JADX INFO: renamed from: c0 */
    public int f14982c0;

    /* JADX INFO: renamed from: d0 */
    public Map<String, AbstractC3669wr> f14983d0;

    /* JADX INFO: renamed from: e0 */
    public final WindowManager f14984e0;

    /* JADX INFO: renamed from: f0 */
    public final as2 f14985f0;

    /* JADX INFO: renamed from: g */
    public final C2968du f14986g;

    /* JADX INFO: renamed from: h */
    public final rd2 f14987h;

    /* JADX INFO: renamed from: i */
    public final C2867b4 f14988i;

    /* JADX INFO: renamed from: j */
    public final C3702xn f14989j;

    /* JADX INFO: renamed from: k */
    public InterfaceC2323n f14990k;

    /* JADX INFO: renamed from: l */
    public final C2312c f14991l;

    /* JADX INFO: renamed from: m */
    public final DisplayMetrics f14992m;

    /* JADX INFO: renamed from: n */
    public final float f14993n;

    /* JADX INFO: renamed from: o */
    public rh1 f14994o;

    /* JADX INFO: renamed from: p */
    public uh1 f14995p;

    /* JADX INFO: renamed from: q */
    public boolean f14996q;

    /* JADX INFO: renamed from: r */
    public boolean f14997r;

    /* JADX INFO: renamed from: s */
    public C3670ws f14998s;

    /* JADX INFO: renamed from: t */
    public BinderC2232o f14999t;

    /* JADX INFO: renamed from: u */
    public InterfaceC2799a f15000u;

    /* JADX INFO: renamed from: v */
    public C3005eu f15001v;

    /* JADX INFO: renamed from: w */
    public final String f15002w;

    /* JADX INFO: renamed from: x */
    public boolean f15003x;

    /* JADX INFO: renamed from: y */
    public boolean f15004y;

    /* JADX INFO: renamed from: z */
    public boolean f15005z;

    public ViewTreeObserverOnGlobalLayoutListenerC3115ht(C2968du c2968du, C3005eu c3005eu, String str, boolean z, rd2 rd2Var, C2867b4 c2867b4, C3702xn c3702xn, InterfaceC2323n interfaceC2323n, C2312c c2312c, as2 as2Var, rh1 rh1Var, uh1 uh1Var) {
        uh1 uh1Var2;
        String str2;
        super(c2968du);
        this.f14996q = false;
        this.f14997r = false;
        this.f14959C = true;
        this.f14960D = "";
        this.f14979W = -1;
        this.f14980a0 = -1;
        this.f14981b0 = -1;
        this.f14982c0 = -1;
        this.f14986g = c2968du;
        this.f15001v = c3005eu;
        this.f15002w = str;
        this.f15005z = z;
        this.f14987h = rd2Var;
        this.f14988i = c2867b4;
        this.f14989j = c3702xn;
        this.f14990k = interfaceC2323n;
        this.f14991l = c2312c;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f14984e0 = windowManager;
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        DisplayMetrics displayMetricsM4741K = C2267h1.m4741K(windowManager);
        this.f14992m = displayMetricsM4741K;
        this.f14993n = displayMetricsM4741K.density;
        this.f14985f0 = as2Var;
        this.f14994o = rh1Var;
        this.f14995p = uh1Var;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            C2622l.m5438t3("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMixedContentMode(2);
        C2330u c2330u = C2330u.f10884a;
        settings.setUserAgentString(c2330u.f10889d.m4766B(c2968du, c3702xn.f21615f));
        c2330u.f10891f.mo4712a(getContext(), settings);
        setDownloadListener(this);
        m7168V0();
        addJavascriptInterface(new C3448qt(this, new C3337nt(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f14978V = new C2299t0(this.f14986g.f13385a, this, this, null);
        m7172Z0();
        C3459r3 c3459r3 = new C3459r3(new C3533t3(true, "make_wv", this.f15002w));
        this.f14972P = c3459r3;
        synchronized (c3459r3.f18702b.f19757c) {
        }
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14333d1)).booleanValue() && (uh1Var2 = this.f14995p) != null && (str2 = uh1Var2.f20318b) != null) {
            c3459r3.f18702b.m8398c("gqi", str2);
        }
        C3422q3 c3422q3M8395d = C3533t3.m8395d();
        this.f14970N = c3422q3M8395d;
        c3459r3.f18701a.put("native:view_create", c3422q3M8395d);
        this.f14971O = null;
        this.f14969M = null;
        c2330u.f10891f.mo4714c(c2968du);
        c2330u.f10893h.f13620i.incrementAndGet();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: A */
    public final void mo6431A(int i) {
        this.f14974R = i;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2323n
    /* JADX INFO: renamed from: A0 */
    public final synchronized void mo4862A0() {
        InterfaceC2323n interfaceC2323n = this.f14990k;
        if (interfaceC2323n != null) {
            interfaceC2323n.mo4862A0();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: B */
    public final synchronized boolean mo6432B() {
        return this.f15005z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3577ua
    /* JADX INFO: renamed from: B0 */
    public final void mo6433B0(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        String strValueOf = String.valueOf(sb.toString());
        C2622l.m5318U2(strValueOf.length() != 0 ? "Dispatching AFMA event: ".concat(strValueOf) : new String("Dispatching AFMA event: "));
        m7165R0(sb.toString());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: C */
    public final kv1<String> mo6434C() {
        return this.f14988i.m5925a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3634vt
    /* JADX INFO: renamed from: C0 */
    public final void mo6435C0(InterfaceC2266h0 interfaceC2266h0, pw0 pw0Var, po0 po0Var, im1 im1Var, String str, String str2, int i) {
        C3670ws c3670ws = this.f14998s;
        Objects.requireNonNull(c3670ws);
        InterfaceC3410ps interfaceC3410ps = c3670ws.f21325g;
        c3670ws.m8686v(new AdOverlayInfoParcel(interfaceC3410ps, interfaceC3410ps.mo6495o(), interfaceC2266h0, pw0Var, po0Var, im1Var, str, str2, i));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: D */
    public final synchronized BinderC2232o mo6436D() {
        return this.f14999t;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: D0 */
    public final synchronized void mo6437D0(C3005eu c3005eu) {
        this.f15001v = c3005eu;
        requestLayout();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: E */
    public final synchronized void mo6438E(int i) {
        BinderC2232o binderC2232o = this.f14999t;
        if (binderC2232o != null) {
            binderC2232o.m4679L6(i);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: E0 */
    public final synchronized void mo6439E0(int i) {
        this.f14973Q = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: F */
    public final synchronized AbstractC3669wr mo6440F(String str) {
        Map<String, AbstractC3669wr> map = this.f14983d0;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: F0 */
    public final void mo6441F0(boolean z, long j2) {
        HashMap map = new HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put(CainMediaMetadataRetriever.METADATA_KEY_DURATION, Long.toString(j2));
        mo6501r0("onCacheAccessComplete", map);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: G */
    public final int mo6442G() {
        return getMeasuredHeight();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: G0 */
    public final synchronized void mo6443G0(boolean z) {
        this.f14959C = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: H */
    public final void mo6444H(boolean z) {
        this.f14998s.f21322D = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: H0 */
    public final void mo6445H0() {
        C2622l.m5391k1(this.f14972P.f18702b, this.f14970N, "aeh2");
        HashMap map = new HashMap(1);
        map.put("version", this.f14989j.f21615f);
        mo6501r0("onhide", map);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: I */
    public final synchronized BinderC2232o mo6446I() {
        return this.f14976T;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: I0 */
    public final synchronized void mo6447I0() {
        C2096e.m4590z("Destroying WebView!");
        m7170X0();
        C2267h1.f10713a.post(new RunnableC3078gt(this));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: J */
    public final void mo6448J(String str, C2912cb<InterfaceC3464r8<? super InterfaceC3410ps>> c2912cb) {
        C3670ws c3670ws = this.f14998s;
        if (c3670ws != null) {
            synchronized (c3670ws.f21328j) {
                List<InterfaceC3464r8<? super InterfaceC3410ps>> list = c3670ws.f21327i.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (InterfaceC3464r8<? super InterfaceC3410ps> interfaceC3464r8 : list) {
                    if ((interfaceC3464r8 instanceof C2986eb) && ((C2986eb) interfaceC3464r8).f13537a.equals(c2912cb.f12970a)) {
                        arrayList.add(interfaceC3464r8);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: J0 */
    public final synchronized String mo6449J0() {
        return this.f15002w;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: K */
    public final synchronized InterfaceC3128i5 mo6450K() {
        return this.f14964H;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: K0 */
    public final synchronized void mo6451K0(boolean z) {
        boolean z2 = this.f15005z;
        this.f15005z = z;
        m7168V0();
        if (z != z2) {
            if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14202I)).booleanValue() || !this.f15001v.m6689d()) {
                new C3287mg(this, "").m7695d(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: L */
    public final synchronized void mo6452L(InterfaceC3054g5 interfaceC3054g5) {
        this.f14965I = interfaceC3054g5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: L0 */
    public final synchronized boolean mo6453L0() {
        return this.f14959C;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: M */
    public final int mo6454M() {
        return this.f14975S;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: M0 */
    public final synchronized void mo6455M0(String str, String str2, String str3) {
        String str4;
        if (mo6458O()) {
            C2622l.m5226A3("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14196H);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e) {
            C2622l.m5241D3("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, C3671wt.m8693a(str2, strArr), "text/html", Utf8Charset.NAME, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: N */
    public final WebView mo6456N() {
        return this;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: N0 */
    public final void mo6457N0() {
        setBackgroundColor(0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: O */
    public final synchronized boolean mo6458O() {
        return this.f15004y;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: O0 */
    public final /* bridge */ /* synthetic */ InterfaceC2931cu mo6459O0() {
        return this.f14998s;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: P */
    public final synchronized uq2 mo6460P() {
        return this.f14966J;
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m7163P0() {
        int i;
        int iM7891i;
        if (!this.f14998s.m8681j() && !this.f14998s.m8682m()) {
            return false;
        }
        gx2 gx2Var = gx2.f14692a;
        C3331nn c3331nn = gx2Var.f14693b;
        DisplayMetrics displayMetrics = this.f14992m;
        int iRound = Math.round(displayMetrics.widthPixels / displayMetrics.density);
        C3331nn c3331nn2 = gx2Var.f14693b;
        DisplayMetrics displayMetrics2 = this.f14992m;
        int iRound2 = Math.round(displayMetrics2.heightPixels / displayMetrics2.density);
        Activity activity = this.f14986g.f13385a;
        if (activity == null || activity.getWindow() == null) {
            i = iRound;
            iM7891i = iRound2;
        } else {
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            int[] iArrM4756o = C2267h1.m4756o(activity);
            C3331nn c3331nn3 = gx2Var.f14693b;
            int iM7891i2 = C3331nn.m7891i(this.f14992m, iArrM4756o[0]);
            C3331nn c3331nn4 = gx2Var.f14693b;
            iM7891i = C3331nn.m7891i(this.f14992m, iArrM4756o[1]);
            i = iM7891i2;
        }
        int i2 = this.f14980a0;
        if (i2 == iRound && this.f14979W == iRound2 && this.f14981b0 == i && this.f14982c0 == iM7891i) {
            return false;
        }
        boolean z = (i2 == iRound && this.f14979W == iRound2) ? false : true;
        this.f14980a0 = iRound;
        this.f14979W = iRound2;
        this.f14981b0 = i;
        this.f14982c0 = iM7891i;
        new C3287mg(this, "").m7696e(iRound, iRound2, i, iM7891i, this.f14992m.density, this.f14984e0.getDefaultDisplay().getRotation());
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: Q */
    public final void mo6461Q(int i) {
    }

    /* JADX INFO: renamed from: Q0 */
    public final synchronized void m7164Q0(String str) {
        if (mo6458O()) {
            C2622l.m5226A3("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: R */
    public final synchronized void mo6462R(BinderC2232o binderC2232o) {
        this.f14976T = binderC2232o;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x003a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #3 {, blocks: (B:33:0x003b, B:35:0x0041, B:38:0x0046), top: B:62:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0046 A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:33:0x003b, B:35:0x0041, B:38:0x0046), top: B:62:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0050  */
    /* JADX WARN: Code duplicated, block: B:46:0x005c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0061  */
    /* JADX WARN: Code duplicated, block: B:62:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: R0 */
    public final void m7165R0(String str) {
        Boolean bool;
        Boolean bool2;
        String strValueOf;
        String str2;
        Boolean bool3;
        synchronized (this) {
            bool = this.f14958B;
        }
        if (bool == null) {
            synchronized (this) {
                C2998en c2998en = C2330u.f10884a.f10893h;
                synchronized (c2998en.f13612a) {
                    bool3 = c2998en.f13619h;
                }
                this.f14958B = bool3;
                if (bool3 == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        m7166S0(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        m7166S0(Boolean.FALSE);
                    }
                }
            }
            if (bool2.booleanValue()) {
                synchronized (this) {
                    if (mo6458O()) {
                        C2622l.m5226A3("#004 The webview is destroyed. Ignoring action.");
                        return;
                    } else {
                        evaluateJavascript(str, null);
                        return;
                    }
                }
            }
            strValueOf = String.valueOf(str);
            if (strValueOf.length() != 0) {
                str2 = "javascript:".concat(strValueOf);
            } else {
                str2 = new String("javascript:");
            }
            m7164Q0(str2);
        }
        synchronized (this) {
            bool2 = this.f14958B;
            if (bool2.booleanValue()) {
                synchronized (this) {
                    if (mo6458O()) {
                        evaluateJavascript(str, null);
                        return;
                    } else {
                        C2622l.m5226A3("#004 The webview is destroyed. Ignoring action.");
                        return;
                    }
                }
            }
            strValueOf = String.valueOf(str);
            if (strValueOf.length() != 0) {
                str2 = "javascript:".concat(strValueOf);
            } else {
                str2 = new String("javascript:");
            }
            m7164Q0(str2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: S */
    public final synchronized void mo6463S(boolean z) {
        BinderC2232o binderC2232o = this.f14999t;
        if (binderC2232o != null) {
            binderC2232o.m4678K6(this.f14998s.m8681j(), z);
        } else {
            this.f15003x = z;
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m7166S0(Boolean bool) {
        synchronized (this) {
            this.f14958B = bool;
        }
        C2998en c2998en = C2330u.f10884a.f10893h;
        synchronized (c2998en.f13612a) {
            c2998en.f13619h = bool;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: T */
    public final void mo6464T() {
        if (this.f14969M == null) {
            C2622l.m5391k1(this.f14972P.f18702b, this.f14970N, "aes2");
            C3533t3 c3533t3 = this.f14972P.f18702b;
            C3422q3 c3422q3M8395d = C3533t3.m8395d();
            this.f14969M = c3422q3M8395d;
            this.f14972P.f18701a.put("native:view_show", c3422q3M8395d);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f14989j.f21615f);
        mo6501r0("onshow", map);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: U */
    public final void mo6465U() {
        throw null;
    }

    /* JADX INFO: renamed from: U0 */
    public final synchronized void m7167U0(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "AdWebViewImpl.loadUrlUnsafe");
            C2622l.m5241D3("Could not call loadUrl. ", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: V */
    public final void mo6466V(String str, InterfaceC3464r8<? super InterfaceC3410ps> interfaceC3464r8) {
        C3670ws c3670ws = this.f14998s;
        if (c3670ws != null) {
            synchronized (c3670ws.f21328j) {
                List<InterfaceC3464r8<? super InterfaceC3410ps>> list = c3670ws.f21327i.get(str);
                if (list == null) {
                    return;
                }
                list.remove(interfaceC3464r8);
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final synchronized void m7168V0() {
        if (!this.f15005z && !this.f15001v.m6689d()) {
            C2622l.m5318U2("Enabling hardware acceleration on an AdView.");
            m7169W0();
            return;
        }
        C2622l.m5318U2("Enabling hardware acceleration on an overlay.");
        m7169W0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: W */
    public final synchronized void mo6467W(BinderC2232o binderC2232o) {
        this.f14999t = binderC2232o;
    }

    /* JADX INFO: renamed from: W0 */
    public final synchronized void m7169W0() {
        if (this.f14957A) {
            setLayerType(0, null);
        }
        this.f14957A = false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3782zt
    /* JADX INFO: renamed from: X */
    public final View mo6468X() {
        return this;
    }

    /* JADX INFO: renamed from: X0 */
    public final synchronized void m7170X0() {
        if (this.f14977U) {
            return;
        }
        this.f14977U = true;
        C2330u.f10884a.f10893h.f13620i.decrementAndGet();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: Y */
    public final synchronized void mo6469Y(boolean z) {
        BinderC2232o binderC2232o;
        int i = this.f14967K + (true != z ? -1 : 1);
        this.f14967K = i;
        if (i > 0 || (binderC2232o = this.f14999t) == null) {
            return;
        }
        binderC2232o.m4675H6();
    }

    /* JADX INFO: renamed from: Y0 */
    public final synchronized void m7171Y0() {
        Map<String, AbstractC3669wr> map = this.f14983d0;
        if (map != null) {
            Iterator<AbstractC3669wr> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().release();
            }
        }
        this.f14983d0 = null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3060gb
    /* JADX INFO: renamed from: Z */
    public final void mo6470Z(String str, String str2) {
        m7165R0(outline.m1553D(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, "(", str2, ");"));
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m7172Z0() {
        C3459r3 c3459r3 = this.f14972P;
        if (c3459r3 == null) {
            return;
        }
        C3533t3 c3533t3 = c3459r3.f18702b;
        C2330u c2330u = C2330u.f10884a;
        if (c2330u.f10893h.m6644a() != null) {
            c2330u.f10893h.m6644a().f15450a.offer(c3533t3);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3634vt
    /* JADX INFO: renamed from: a */
    public final void mo6471a(C2223f c2223f) {
        this.f14998s.m8685t(c2223f);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: a0 */
    public final void mo6472a0(boolean z) {
        this.f14998s.f21335q = false;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m7173a1(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : "1");
        mo6501r0("onAdVisibilityChanged", map);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2323n
    /* JADX INFO: renamed from: b */
    public final synchronized void mo4863b() {
        InterfaceC2323n interfaceC2323n = this.f14990k;
        if (interfaceC2323n != null) {
            interfaceC2323n.mo4863b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: b0 */
    public final synchronized void mo6473b0() {
        InterfaceC3054g5 interfaceC3054g5 = this.f14965I;
        if (interfaceC3054g5 != null) {
            final wj0 wj0Var = (wj0) interfaceC3054g5;
            C2267h1.f10713a.post(new Runnable(wj0Var) { // from class: c.n.b.d.j.a.uj0

                /* JADX INFO: renamed from: f */
                public final wj0 f20360f;

                {
                    this.f20360f = wj0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.f20360f.m8655b();
                    } catch (RemoteException e) {
                        C2622l.m5271J3("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: c0 */
    public final void mo6474c0(int i) {
        this.f14975S = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: d */
    public final C3370op mo6475d() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: d0 */
    public final void mo6476d0(Context context) {
        this.f14986g.setBaseContext(context);
        this.f14978V.f10778b = this.f14986g.f13385a;
    }

    @Override // android.webkit.WebView, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final synchronized void destroy() {
        m7172Z0();
        C2299t0 c2299t0 = this.f14978V;
        c2299t0.f10781e = false;
        c2299t0.m4805b();
        BinderC2232o binderC2232o = this.f14999t;
        if (binderC2232o != null) {
            binderC2232o.m4683a();
            this.f14999t.mo4694l();
            this.f14999t = null;
        }
        this.f15000u = null;
        this.f14998s.m8673F();
        this.f14966J = null;
        this.f14990k = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.f15004y) {
            return;
        }
        C3409pr c3409pr = C2330u.f10884a.f10885A;
        C3409pr.m8152f(this);
        m7171Y0();
        this.f15004y = true;
        C2096e.m4590z("Initiating WebView self destruct sequence in 3...");
        C2096e.m4590z("Loading blank page in WebView, 2...");
        m7167U0("about:blank");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: e0 */
    public final boolean mo6477e0(final boolean z, final int i) {
        destroy();
        this.f14985f0.m5846b(new zr2(z, i) { // from class: c.n.b.d.j.a.et

            /* JADX INFO: renamed from: a */
            public final boolean f13686a;

            /* JADX INFO: renamed from: b */
            public final int f13687b;

            {
                this.f13686a = z;
                this.f13687b = i;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.zr2
            /* JADX INFO: renamed from: a */
            public final void mo6684a(mt2 mt2Var) {
                boolean z2 = this.f13686a;
                int i2 = this.f13687b;
                int i3 = ViewTreeObserverOnGlobalLayoutListenerC3115ht.f14956f;
                sv2 sv2VarM8459x = tv2.m8459x();
                if (((tv2) sv2VarM8459x.f13190g).m8462v() != z2) {
                    if (sv2VarM8459x.f13191h) {
                        sv2VarM8459x.m6298m();
                        sv2VarM8459x.f13191h = false;
                    }
                    tv2.m8461z((tv2) sv2VarM8459x.f13190g, z2);
                }
                if (sv2VarM8459x.f13191h) {
                    sv2VarM8459x.m6298m();
                    sv2VarM8459x.f13191h = false;
                }
                tv2.m8458A((tv2) sv2VarM8459x.f13190g, i2);
                tv2 tv2VarM6300o = sv2VarM8459x.m6300o();
                if (mt2Var.f13191h) {
                    mt2Var.m6298m();
                    mt2Var.f13191h = false;
                }
                ot2.m8062H((ot2) mt2Var.f13190g, tv2VarM6300o);
            }
        });
        this.f14985f0.m5845a(bs2.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!mo6458O()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        C2622l.m5271J3("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3060gb
    /* JADX INFO: renamed from: f */
    public final void mo6478f(String str) {
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: f0 */
    public final void mo6479f0(String str, InterfaceC3464r8<? super InterfaceC3410ps> interfaceC3464r8) {
        C3670ws c3670ws = this.f14998s;
        if (c3670ws != null) {
            c3670ws.m8672A(str, interfaceC3464r8);
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f15004y) {
                        this.f14998s.m8673F();
                        C3409pr c3409pr = C2330u.f10884a.f10885A;
                        C3409pr.m8152f(this);
                        m7171Y0();
                        m7170X0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: g */
    public final synchronized BinderC3263lt mo6480g() {
        return this.f14961E;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: g0 */
    public final synchronized InterfaceC2799a mo6481g0() {
        return this.f15000u;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3485rt, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: h */
    public final Activity mo6482h() {
        return this.f14986g.f13385a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: h0 */
    public final void mo6483h0(int i) {
        if (i == 0) {
            C2622l.m5391k1(this.f14972P.f18702b, this.f14970N, "aebb2");
        }
        C2622l.m5391k1(this.f14972P.f18702b, this.f14970N, "aeh2");
        this.f14972P.f18702b.m8398c("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.f14989j.f21615f);
        mo6501r0("onhide", map);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: i */
    public final C3422q3 mo6484i() {
        return this.f14970N;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uv2
    /* JADX INFO: renamed from: i0 */
    public final void mo2739i0() {
        C3670ws c3670ws = this.f14998s;
        if (c3670ws != null) {
            c3670ws.mo2739i0();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: j */
    public final void mo6485j() {
        BinderC2232o binderC2232oMo6436D = mo6436D();
        if (binderC2232oMo6436D != null) {
            binderC2232oMo6436D.f10668r.f10646g = true;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: j0 */
    public final void mo6486j0() {
        C2299t0 c2299t0 = this.f14978V;
        c2299t0.f10781e = true;
        if (c2299t0.f10780d) {
            c2299t0.m4804a();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: k */
    public final C2312c mo6487k() {
        return this.f14991l;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3634vt
    /* JADX INFO: renamed from: k0 */
    public final void mo6488k0(boolean z, int i, String str) {
        C3670ws c3670ws = this.f14998s;
        boolean zMo6432B = c3670ws.f21325g.mo6432B();
        uv2 uv2Var = (!zMo6432B || c3670ws.f21325g.mo6500r().m6689d()) ? c3670ws.f21329k : null;
        C3633vs c3633vs = zMo6432B ? null : new C3633vs(c3670ws.f21325g, c3670ws.f21330l);
        InterfaceC3463r7 interfaceC3463r7 = c3670ws.f21333o;
        InterfaceC3537t7 interfaceC3537t7 = c3670ws.f21334p;
        InterfaceC2242y interfaceC2242y = c3670ws.f21340v;
        InterfaceC3410ps interfaceC3410ps = c3670ws.f21325g;
        c3670ws.m8686v(new AdOverlayInfoParcel(uv2Var, c3633vs, interfaceC3463r7, interfaceC3537t7, interfaceC2242y, interfaceC3410ps, z, i, str, interfaceC3410ps.mo6495o()));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: l */
    public final C3459r3 mo6489l() {
        return this.f14972P;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: l0 */
    public final synchronized void mo6490l0(InterfaceC2799a interfaceC2799a) {
        this.f15000u = interfaceC2799a;
    }

    @Override // android.webkit.WebView, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final synchronized void loadData(String str, String str2, String str3) {
        if (mo6458O()) {
            C2622l.m5226A3("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (mo6458O()) {
            C2622l.m5226A3("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final synchronized void loadUrl(String str) {
        if (mo6458O()) {
            C2622l.m5226A3("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "AdWebViewImpl.loadUrl");
            C2622l.m5241D3("Could not call loadUrl. ", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: m */
    public final synchronized String mo6491m() {
        return this.f14960D;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3634vt
    /* JADX INFO: renamed from: m0 */
    public final void mo6492m0(boolean z, int i, String str, String str2) {
        C3670ws c3670ws = this.f14998s;
        boolean zMo6432B = c3670ws.f21325g.mo6432B();
        uv2 uv2Var = (!zMo6432B || c3670ws.f21325g.mo6500r().m6689d()) ? c3670ws.f21329k : null;
        C3633vs c3633vs = zMo6432B ? null : new C3633vs(c3670ws.f21325g, c3670ws.f21330l);
        InterfaceC3463r7 interfaceC3463r7 = c3670ws.f21333o;
        InterfaceC3537t7 interfaceC3537t7 = c3670ws.f21334p;
        InterfaceC2242y interfaceC2242y = c3670ws.f21340v;
        InterfaceC3410ps interfaceC3410ps = c3670ws.f21325g;
        c3670ws.m8686v(new AdOverlayInfoParcel(uv2Var, c3633vs, interfaceC3463r7, interfaceC3537t7, interfaceC2242y, interfaceC3410ps, z, i, str, str2, interfaceC3410ps.mo6495o()));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: n */
    public final synchronized int mo6493n() {
        return this.f14973Q;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: n0 */
    public final boolean mo6494n0() {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3745yt, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: o */
    public final C3702xn mo6495o() {
        return this.f14989j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: o0 */
    public final int mo6496o0() {
        return this.f14974R;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = true;
        if (!mo6458O()) {
            C2299t0 c2299t0 = this.f14978V;
            c2299t0.f10780d = true;
            if (c2299t0.f10781e) {
                c2299t0.m4804a();
            }
        }
        boolean z2 = this.f14962F;
        C3670ws c3670ws = this.f14998s;
        if (c3670ws == null || !c3670ws.m8682m()) {
            z = z2;
        } else {
            if (!this.f14963G) {
                synchronized (this.f14998s.f21328j) {
                }
                synchronized (this.f14998s.f21328j) {
                }
                this.f14963G = true;
            }
            m7163P0();
        }
        m7173a1(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C3670ws c3670ws;
        synchronized (this) {
            if (!mo6458O()) {
                C2299t0 c2299t0 = this.f14978V;
                c2299t0.f10780d = false;
                c2299t0.m4805b();
            }
            super.onDetachedFromWindow();
            if (this.f14963G && (c3670ws = this.f14998s) != null && c3670ws.m8682m() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                synchronized (this.f14998s.f21328j) {
                }
                synchronized (this.f14998s.f21328j) {
                }
                this.f14963G = false;
            }
        }
        m7173a1(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            C2267h1.m4752k(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            C2622l.m5318U2(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (mo6458O()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zM7163P0 = m7163P0();
        BinderC2232o binderC2232oMo6436D = mo6436D();
        if (binderC2232oMo6436D != null && zM7163P0 && binderC2232oMo6436D.f10669s) {
            binderC2232oMo6436D.f10669s = false;
            binderC2232oMo6436D.f10660j.mo6464T();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0086 A[Catch: all -> 0x01ea, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:23:0x002d, B:31:0x003a, B:33:0x004c, B:36:0x0051, B:38:0x0058, B:42:0x0062, B:45:0x0067, B:48:0x007a, B:54:0x008c, B:52:0x0086, B:62:0x00a1, B:64:0x00b3, B:66:0x00be, B:67:0x00c1, B:69:0x00d3, B:71:0x00dc, B:70:0x00d8, B:74:0x00e1, B:77:0x00e6, B:79:0x00ec, B:82:0x00f7, B:91:0x011d, B:93:0x0123, B:98:0x012b, B:100:0x013d, B:102:0x014b, B:111:0x0160, B:113:0x01ad, B:114:0x01b0, B:116:0x01b7, B:121:0x01c4, B:123:0x01ca, B:124:0x01cd, B:126:0x01d1, B:127:0x01da, B:130:0x01e5), top: B:136:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    public final synchronized void onMeasure(int i, int i2) {
        int i3 = 0;
        if (mo6458O()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.f15005z) {
            C3005eu c3005eu = this.f15001v;
            int i4 = c3005eu.f13691a;
            if (!(i4 == 0)) {
                if (i4 == 5) {
                    super.onMeasure(i, i2);
                    return;
                }
                if (i4 == 4) {
                    if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14270T1)).booleanValue()) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    BinderC3263lt binderC3263ltMo6480g = mo6480g();
                    float fMo5780m = binderC3263ltMo6480g != null ? binderC3263ltMo6480g.mo5780m() : 0.0f;
                    if (fMo5780m == 0.0f) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    int i5 = (int) (size2 * fMo5780m);
                    int i6 = (int) (size / fMo5780m);
                    if (size2 != 0) {
                        if (size == 0) {
                            i3 = size;
                        } else if (i5 != 0) {
                            i6 = (int) (i5 / fMo5780m);
                            i3 = i5;
                        }
                    } else if (i6 != 0) {
                        i5 = (int) (i6 * fMo5780m);
                        i3 = size;
                        size2 = i6;
                    } else {
                        size2 = 0;
                        if (size == 0) {
                            i3 = size;
                        } else if (i5 != 0) {
                            i6 = (int) (i5 / fMo5780m);
                            i3 = i5;
                        }
                    }
                    setMeasuredDimension(Math.min(i5, i3), Math.min(i6, size2));
                    return;
                }
                if (i4 == 2) {
                    if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14288W1)).booleanValue()) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    C3041ft c3041ft = new C3041ft(this);
                    C3670ws c3670ws = this.f14998s;
                    if (c3670ws != null) {
                        c3670ws.m8672A("/contentHeight", c3041ft);
                    }
                    m7165R0("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    float f = this.f14992m.density;
                    int size3 = View.MeasureSpec.getSize(i);
                    int i7 = this.f14968L;
                    setMeasuredDimension(size3, i7 != -1 ? (int) (i7 * f) : View.MeasureSpec.getSize(i2));
                    return;
                }
                if (c3005eu.m6689d()) {
                    DisplayMetrics displayMetrics = this.f14992m;
                    setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                    return;
                }
                int mode = View.MeasureSpec.getMode(i);
                int size4 = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size5 = View.MeasureSpec.getSize(i2);
                int i8 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
                int i9 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
                C3005eu c3005eu2 = this.f15001v;
                boolean z = c3005eu2.f13693c > i8 || c3005eu2.f13692b > i9;
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14342e3)).booleanValue()) {
                    C3005eu c3005eu3 = this.f15001v;
                    int i10 = c3005eu3.f13693c;
                    float f2 = this.f14993n;
                    boolean z2 = ((float) i10) / f2 <= ((float) i8) / f2 && ((float) c3005eu3.f13692b) / f2 <= ((float) i9) / f2;
                    if (true == z) {
                        z = z2;
                    }
                }
                if (!z) {
                    if (getVisibility() != 8) {
                        setVisibility(0);
                    }
                    if (!this.f14997r) {
                        this.f14985f0.m5845a(bs2.BANNER_SIZE_VALID);
                        this.f14997r = true;
                    }
                    C3005eu c3005eu4 = this.f15001v;
                    setMeasuredDimension(c3005eu4.f13693c, c3005eu4.f13692b);
                    return;
                }
                C3005eu c3005eu5 = this.f15001v;
                int i11 = c3005eu5.f13693c;
                float f3 = this.f14993n;
                int i12 = c3005eu5.f13692b;
                StringBuilder sb = new StringBuilder(103);
                sb.append("Not enough space to show ad. Needs ");
                sb.append((int) (i11 / f3));
                sb.append("x");
                sb.append((int) (i12 / f3));
                sb.append(" dp, but only has ");
                sb.append((int) (size4 / f3));
                sb.append("x");
                sb.append((int) (size5 / f3));
                sb.append(" dp.");
                C2622l.m5226A3(sb.toString());
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                if (this.f14996q) {
                    return;
                }
                this.f14985f0.m5845a(bs2.BANNER_SIZE_INVALID);
                this.f14996q = true;
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void onPause() {
        if (mo6458O()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            C2622l.m5438t3("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void onResume() {
        if (mo6458O()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            C2622l.m5438t3("Could not resume webview.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0022  */
    /* JADX WARN: Code duplicated, block: B:23:0x0026  */
    /* JADX WARN: Code duplicated, block: B:26:0x002f  */
    /* JADX WARN: Code duplicated, block: B:32:0x004c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0052  */
    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rd2 rd2Var;
        C2867b4 c2867b4;
        boolean z;
        if (this.f14998s.m8682m()) {
            C3670ws c3670ws = this.f14998s;
            synchronized (c3670ws.f21328j) {
                z = c3670ws.f21339u;
            }
            if (z) {
                rd2Var = this.f14987h;
                if (rd2Var != null) {
                    rd2Var.f18750d.mo4852a(motionEvent);
                }
                c2867b4 = this.f14988i;
                if (c2867b4 != null) {
                    if (motionEvent.getAction() != 1 && motionEvent.getEventTime() > c2867b4.f12512a.getEventTime()) {
                        c2867b4.f12512a = MotionEvent.obtain(motionEvent);
                    } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > c2867b4.f12513b.getEventTime()) {
                        c2867b4.f12513b = MotionEvent.obtain(motionEvent);
                    }
                }
            } else {
                synchronized (this) {
                    InterfaceC3128i5 interfaceC3128i5 = this.f14964H;
                    if (interfaceC3128i5 != null) {
                        interfaceC3128i5.mo6198a(motionEvent);
                    }
                }
            }
        } else {
            rd2Var = this.f14987h;
            if (rd2Var != null) {
                rd2Var.f18750d.mo4852a(motionEvent);
            }
            c2867b4 = this.f14988i;
            if (c2867b4 != null) {
                if (motionEvent.getAction() != 1) {
                    if (motionEvent.getAction() == 0) {
                        c2867b4.f12513b = MotionEvent.obtain(motionEvent);
                    }
                } else if (motionEvent.getAction() == 0) {
                    c2867b4.f12513b = MotionEvent.obtain(motionEvent);
                }
            }
        }
        if (mo6458O()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: p */
    public final synchronized String mo6497p() {
        uh1 uh1Var = this.f14995p;
        if (uh1Var == null) {
            return null;
        }
        return uh1Var.f20318b;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: p0 */
    public final Context mo6498p0() {
        return this.f14986g.f13387c;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3040fs
    /* JADX INFO: renamed from: q */
    public final rh1 mo6499q() {
        return this.f14994o;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ip2
    /* JADX INFO: renamed from: q0 */
    public final void mo6352q0(hp2 hp2Var) {
        boolean z;
        synchronized (this) {
            z = hp2Var.f14934j;
            this.f14962F = z;
        }
        m7173a1(z);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: r */
    public final synchronized C3005eu mo6500r() {
        return this.f15001v;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3577ua
    /* JADX INFO: renamed from: r0 */
    public final void mo6501r0(String str, Map<String, ?> map) {
        try {
            mo6433B0(str, C2330u.f10884a.f10889d.m4767C(map));
        } catch (JSONException unused) {
            C2622l.m5226A3("Could not convert parameters to JSON.");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3708xt
    /* JADX INFO: renamed from: s */
    public final rd2 mo6502s() {
        return this.f14987h;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: s0 */
    public final WebViewClient mo6503s0() {
        return this.f14998s;
    }

    @Override // android.view.View, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // android.webkit.WebView, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C3670ws) {
            this.f14998s = (C3670ws) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (mo6458O()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            C2622l.m5438t3("Could not stop loading webview.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3634vt
    /* JADX INFO: renamed from: t */
    public final void mo6504t(boolean z, int i) {
        C3670ws c3670ws = this.f14998s;
        uv2 uv2Var = (!c3670ws.f21325g.mo6432B() || c3670ws.f21325g.mo6500r().m6689d()) ? c3670ws.f21329k : null;
        InterfaceC2235r interfaceC2235r = c3670ws.f21330l;
        InterfaceC2242y interfaceC2242y = c3670ws.f21340v;
        InterfaceC3410ps interfaceC3410ps = c3670ws.f21325g;
        c3670ws.m8686v(new AdOverlayInfoParcel(uv2Var, interfaceC2235r, interfaceC2242y, interfaceC3410ps, z, i, interfaceC3410ps.mo6495o()));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: t0 */
    public final void mo6505t0(rh1 rh1Var, uh1 uh1Var) {
        this.f14994o = rh1Var;
        this.f14995p = uh1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: u */
    public final synchronized void mo6506u(BinderC3263lt binderC3263lt) {
        if (this.f14961E != null) {
            C2622l.m5408n3("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f14961E = binderC3263lt;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3060gb
    /* JADX INFO: renamed from: u0 */
    public final void mo6507u0(String str, JSONObject jSONObject) {
        mo6470Z(str, jSONObject.toString());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: v */
    public final int mo6508v() {
        return getMeasuredWidth();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: v0 */
    public final void mo6509v0() {
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: w */
    public final void mo6510w() {
        if (this.f14971O == null) {
            C3533t3 c3533t3 = this.f14972P.f18702b;
            C3422q3 c3422q3M8395d = C3533t3.m8395d();
            this.f14971O = c3422q3M8395d;
            this.f14972P.f18701a.put("native:view_load", c3422q3M8395d);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: w0 */
    public final synchronized void mo6511w0(InterfaceC3128i5 interfaceC3128i5) {
        this.f14964H = interfaceC3128i5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3300mt
    /* JADX INFO: renamed from: x */
    public final uh1 mo6512x() {
        return this.f14995p;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: x0 */
    public final synchronized boolean mo6513x0() {
        return this.f15003x;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: y */
    public final synchronized boolean mo6514y() {
        return this.f14967K > 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: y0 */
    public final synchronized void mo6515y0(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        BinderC2232o binderC2232o = this.f14999t;
        if (binderC2232o != null) {
            if (z) {
                binderC2232o.f10668r.setBackgroundColor(0);
            } else {
                binderC2232o.f10668r.setBackgroundColor(-16777216);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: z */
    public final synchronized void mo6516z(String str, AbstractC3669wr abstractC3669wr) {
        if (this.f14983d0 == null) {
            this.f14983d0 = new HashMap();
        }
        this.f14983d0.put(str, abstractC3669wr);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: z0 */
    public final synchronized void mo6517z0(uq2 uq2Var) {
        this.f14966J = uq2Var;
    }
}
