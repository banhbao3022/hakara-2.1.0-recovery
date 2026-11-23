package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2313d;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2223f;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2233p;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2242y;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.xr1;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.d.j.a.ws */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C3670ws extends WebViewClient implements InterfaceC2931cu {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f21318f = 0;

    /* JADX INFO: renamed from: A */
    public boolean f21319A;

    /* JADX INFO: renamed from: B */
    public boolean f21320B;

    /* JADX INFO: renamed from: C */
    public int f21321C;

    /* JADX INFO: renamed from: D */
    public boolean f21322D;

    /* JADX INFO: renamed from: E */
    public final HashSet<String> f21323E;

    /* JADX INFO: renamed from: F */
    public View.OnAttachStateChangeListener f21324F;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3410ps f21325g;

    /* JADX INFO: renamed from: h */
    public final as2 f21326h;

    /* JADX INFO: renamed from: i */
    public final HashMap<String, List<InterfaceC3464r8<? super InterfaceC3410ps>>> f21327i;

    /* JADX INFO: renamed from: j */
    public final Object f21328j;

    /* JADX INFO: renamed from: k */
    public uv2 f21329k;

    /* JADX INFO: renamed from: l */
    public InterfaceC2235r f21330l;

    /* JADX INFO: renamed from: m */
    public InterfaceC2856au f21331m;

    /* JADX INFO: renamed from: n */
    public InterfaceC2893bu f21332n;

    /* JADX INFO: renamed from: o */
    public InterfaceC3463r7 f21333o;

    /* JADX INFO: renamed from: p */
    public InterfaceC3537t7 f21334p;

    /* JADX INFO: renamed from: q */
    public boolean f21335q;

    /* JADX INFO: renamed from: r */
    public boolean f21336r;

    /* JADX INFO: renamed from: s */
    public boolean f21337s;

    /* JADX INFO: renamed from: t */
    public boolean f21338t;

    /* JADX INFO: renamed from: u */
    public boolean f21339u;

    /* JADX INFO: renamed from: v */
    public InterfaceC2242y f21340v;

    /* JADX INFO: renamed from: w */
    public C3250lg f21341w;

    /* JADX INFO: renamed from: x */
    public C2313d f21342x;

    /* JADX INFO: renamed from: y */
    public C3065gg f21343y;

    /* JADX INFO: renamed from: z */
    public InterfaceC2884bl f21344z;

    public C3670ws(InterfaceC3410ps interfaceC3410ps, as2 as2Var, boolean z) {
        C3250lg c3250lg = new C3250lg(interfaceC3410ps, interfaceC3410ps.mo6498p0(), new C3458r2(interfaceC3410ps.getContext()));
        this.f21327i = new HashMap<>();
        this.f21328j = new Object();
        this.f21326h = as2Var;
        this.f21325g = interfaceC3410ps;
        this.f21337s = z;
        this.f21341w = c3250lg;
        this.f21343y = null;
        this.f21323E = new HashSet<>(Arrays.asList(((String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14412o3)).split(",")));
    }

    /* JADX INFO: renamed from: d */
    public static WebResourceResponse m8671d() {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14430r0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final void m8672A(String str, InterfaceC3464r8<? super InterfaceC3410ps> interfaceC3464r8) {
        synchronized (this.f21328j) {
            List<InterfaceC3464r8<? super InterfaceC3410ps>> copyOnWriteArrayList = this.f21327i.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f21327i.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(interfaceC3464r8);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m8673F() {
        InterfaceC2884bl interfaceC2884bl = this.f21344z;
        if (interfaceC2884bl != null) {
            interfaceC2884bl.mo6037d();
            this.f21344z = null;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f21324F;
        if (onAttachStateChangeListener != null) {
            ((View) this.f21325g).removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        synchronized (this.f21328j) {
            this.f21327i.clear();
            this.f21329k = null;
            this.f21330l = null;
            this.f21331m = null;
            this.f21332n = null;
            this.f21333o = null;
            this.f21334p = null;
            this.f21335q = false;
            this.f21337s = false;
            this.f21338t = false;
            this.f21340v = null;
            this.f21342x = null;
            this.f21341w = null;
            C3065gg c3065gg = this.f21343y;
            if (c3065gg != null) {
                c3065gg.m6996f(true);
                this.f21343y = null;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final WebResourceResponse m8674G(String str, Map<String, String> map) {
        ir2 ir2VarM7160b;
        try {
            String strM5283M0 = C2622l.m5283M0(str, this.f21325g.getContext(), this.f21322D);
            if (!strM5283M0.equals(str)) {
                return m8678e(strM5283M0, map);
            }
            lr2 lr2VarM7611H = lr2.m7611H(Uri.parse(str));
            if (lr2VarM7611H != null && (ir2VarM7160b = C2330u.f10884a.f10895j.m7160b(lr2VarM7611H)) != null && ir2VarM7160b.zza()) {
                return new WebResourceResponse("", "", ir2VarM7160b.m7293H());
            }
            if (C3553tn.m8431d() && C3312n4.f17021b.m6603d().booleanValue()) {
                return m8678e(str, map);
            }
            return null;
        } catch (Exception e) {
            e = e;
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "AdWebViewClient.interceptRequest");
            return m8671d();
        } catch (NoClassDefFoundError e2) {
            e = e2;
            C2998en c2998en2 = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en2.f13616e, c2998en2.f13617f).mo8736b(e, "AdWebViewClient.interceptRequest");
            return m8671d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8675a(final Uri uri) {
        String path = uri.getPath();
        List<InterfaceC3464r8<? super InterfaceC3410ps>> list = this.f21327i.get(path);
        if (path == null || list == null) {
            String strValueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 32);
            sb.append("No GMSG handler found for GMSG: ");
            sb.append(strValueOf);
            C2096e.m4590z(sb.toString());
            if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14406n4)).booleanValue() || C2330u.f10884a.f10893h.m6644a() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            C2962do.f13330a.execute(new Runnable(strSubstring) { // from class: c.n.b.d.j.a.ss

                /* JADX INFO: renamed from: f */
                public final String f19689f;

                {
                    this.f19689f = strSubstring;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    String str = this.f19689f;
                    int i = C3670ws.f21318f;
                    C3163j3 c3163j3M6644a = C2330u.f10884a.f10893h.m6644a();
                    if (c3163j3M6644a.f15456g.contains(str)) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("sdkVersion", c3163j3M6644a.f15455f);
                    linkedHashMap.put("ue", str);
                    c3163j3M6644a.m7317b(c3163j3M6644a.m7316a(c3163j3M6644a.f15451b, linkedHashMap), null);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14405n3;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && this.f21323E.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) c2862b.f12496d.m6596a(C3052g3.f14419p3)).intValue()) {
                C2096e.m4590z(path.length() != 0 ? "Parsing gmsg query params on BG thread: ".concat(path) : new String("Parsing gmsg query params on BG thread: "));
                C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                Callable callable = new Callable(uri) { // from class: c.n.b.d.a.z.b.a1

                    /* JADX INFO: renamed from: a */
                    public final Uri f10689a;

                    {
                        this.f10689a = uri;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Uri uri2 = this.f10689a;
                        xr1 xr1Var = C2267h1.f10713a;
                        C2267h1 c2267h2 = C2330u.f10884a.f10889d;
                        return C2267h1.m4754m(uri2);
                    }
                };
                Executor executor = c2267h1.f10722j;
                yv1 yv1Var = new yv1(callable);
                executor.execute(yv1Var);
                yv1Var.mo6230f(new ev1(yv1Var, new C3595us(this, list, path, uri)), C2962do.f13334e);
                return;
            }
        }
        C2267h1 c2267h2 = C2330u.f10884a.f10889d;
        m8679f(C2267h1.m4754m(uri), list, path);
    }

    /* JADX INFO: renamed from: b */
    public final void m8676b(uv2 uv2Var, InterfaceC3463r7 interfaceC3463r7, InterfaceC2235r interfaceC2235r, InterfaceC3537t7 interfaceC3537t7, InterfaceC2242y interfaceC2242y, boolean z, C3575u8 c3575u8, C2313d c2313d, InterfaceC3324ng interfaceC3324ng, InterfaceC2884bl interfaceC2884bl, final pw0 pw0Var, final bn1 bn1Var, po0 po0Var, im1 im1Var, C3501s8 c3501s8) {
        C2313d c2313d2 = c2313d == null ? new C2313d(this.f21325g.getContext(), interfaceC2884bl, null) : c2313d;
        this.f21343y = new C3065gg(this.f21325g, interfaceC3324ng);
        this.f21344z = interfaceC2884bl;
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14472x0;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            m8672A("/adMetadata", new C3426q7(interfaceC3463r7));
        }
        if (interfaceC3537t7 != null) {
            m8672A("/appEvent", new C3500s7(interfaceC3537t7));
        }
        m8672A("/backButton", C3427q8.f18222k);
        m8672A("/refresh", C3427q8.f18223l);
        InterfaceC3464r8<InterfaceC3410ps> interfaceC3464r8 = C3427q8.f18212a;
        m8672A("/canOpenApp", C3649w7.f21013a);
        m8672A("/canOpenURLs", C3612v7.f20705a);
        m8672A("/canOpenIntents", C3686x7.f21444a);
        m8672A("/close", C3427q8.f18216e);
        m8672A("/customClose", C3427q8.f18217f);
        m8672A("/instrument", C3427q8.f18226o);
        m8672A("/delayPageLoaded", C3427q8.f18228q);
        m8672A("/delayPageClosed", C3427q8.f18229r);
        m8672A("/getLocationInfo", C3427q8.f18230s);
        m8672A("/log", C3427q8.f18219h);
        m8672A("/mraid", new C3724y8(c2313d2, this.f21343y, interfaceC3324ng));
        C3250lg c3250lg = this.f21341w;
        if (c3250lg != null) {
            m8672A("/mraidLoaded", c3250lg);
        }
        m8672A("/open", new C2910c9(c2313d2, this.f21343y, pw0Var, po0Var, im1Var));
        m8672A("/precache", new C3706xr());
        m8672A("/touch", C2983e8.f13528a);
        m8672A("/video", C3427q8.f18224m);
        m8672A("/videoMeta", C3427q8.f18225n);
        if (pw0Var == null || bn1Var == null) {
            m8672A("/click", C2909c8.f12954a);
            m8672A("/httpTrack", C2946d8.f13186a);
        } else {
            m8672A("/click", new InterfaceC3464r8(bn1Var, pw0Var) { // from class: c.n.b.d.j.a.ni1

                /* JADX INFO: renamed from: a */
                public final bn1 f17119a;

                /* JADX INFO: renamed from: b */
                public final pw0 f17120b;

                {
                    this.f17119a = bn1Var;
                    this.f17120b = pw0Var;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
                /* JADX INFO: renamed from: a */
                public final void mo6148a(Object obj, Map map) {
                    bn1 bn1Var2 = this.f17119a;
                    pw0 pw0Var2 = this.f17120b;
                    InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        C2622l.m5226A3("URL missing from click GMSG.");
                        return;
                    }
                    kv1<String> kv1VarM8196a = C3427q8.m8196a(interfaceC3410ps, str);
                    pi1 pi1Var = new pi1(interfaceC3410ps, bn1Var2, pw0Var2);
                    kv1VarM8196a.mo6230f(new ev1(kv1VarM8196a, pi1Var), C2962do.f13330a);
                }
            });
            m8672A("/httpTrack", new InterfaceC3464r8(bn1Var, pw0Var) { // from class: c.n.b.d.j.a.oi1

                /* JADX INFO: renamed from: a */
                public final bn1 f17632a;

                /* JADX INFO: renamed from: b */
                public final pw0 f17633b;

                {
                    this.f17632a = bn1Var;
                    this.f17633b = pw0Var;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
                /* JADX INFO: renamed from: a */
                public final void mo6148a(Object obj, Map map) {
                    bn1 bn1Var2 = this.f17632a;
                    pw0 pw0Var2 = this.f17633b;
                    InterfaceC3040fs interfaceC3040fs = (InterfaceC3040fs) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        C2622l.m5226A3("URL missing from httpTrack GMSG.");
                    } else if (interfaceC3040fs.mo6499q().f18810d0) {
                        pw0Var2.m8169a(new nw0(pw0Var2, new rw0(C2330u.f10884a.f10896k.mo5623c(), ((InterfaceC3300mt) interfaceC3040fs).mo6512x().f20318b, str, 2)));
                    } else {
                        bn1Var2.f12748a.execute(new an1(bn1Var2, str));
                    }
                }
            });
        }
        if (C2330u.f10884a.f10910y.m6048f(this.f21325g.getContext())) {
            m8672A("/logScionEvent", new C3687x8(this.f21325g.getContext()));
        }
        if (c3575u8 != null) {
            m8672A("/setInterstitialProperties", new C3538t8(c3575u8, null));
        }
        if (c3501s8 != null) {
            if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14400m5)).booleanValue()) {
                m8672A("/inspectorNetworkExtras", c3501s8);
            }
        }
        this.f21329k = uv2Var;
        this.f21330l = interfaceC2235r;
        this.f21333o = interfaceC3463r7;
        this.f21334p = interfaceC3537t7;
        this.f21340v = interfaceC2242y;
        this.f21342x = c2313d2;
        this.f21335q = z;
    }

    /* JADX INFO: renamed from: c */
    public final void m8677c(final View view, final InterfaceC2884bl interfaceC2884bl, final int i) {
        if (!interfaceC2884bl.mo6035b() || i <= 0) {
            return;
        }
        interfaceC2884bl.mo6034a(view);
        if (interfaceC2884bl.mo6035b()) {
            C2267h1.f10713a.postDelayed(new Runnable(this, view, interfaceC2884bl, i) { // from class: c.n.b.d.j.a.qs

                /* JADX INFO: renamed from: f */
                public final C3670ws f18426f;

                /* JADX INFO: renamed from: g */
                public final View f18427g;

                /* JADX INFO: renamed from: h */
                public final InterfaceC2884bl f18428h;

                /* JADX INFO: renamed from: i */
                public final int f18429i;

                {
                    this.f18426f = this;
                    this.f18427g = view;
                    this.f18428h = interfaceC2884bl;
                    this.f18429i = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f18426f.m8677c(this.f18427g, this.f18428h, this.f18429i - 1);
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: e */
    public final WebResourceResponse m8678e(String str, Map<String, String> map) throws IOException {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                C2330u c2330u = C2330u.f10884a;
                c2330u.f10889d.m4765A(this.f21325g.getContext(), this.f21325g.mo6495o().f21615f, false, httpURLConnection, false, 60000);
                C3553tn c3553tn = new C3553tn(null);
                c3553tn.m8433a(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                c3553tn.m8434b(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    C2267h1 c2267h1 = c2330u.f10889d;
                    WebResourceResponse webResourceResponseM4755n = C2267h1.m4755n(httpURLConnection);
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseM4755n;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    TrafficStats.clearThreadStatsTag();
                    return null;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    C2622l.m5226A3("Protocol is null");
                    WebResourceResponse webResourceResponseM8671d = m8671d();
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseM8671d;
                }
                if (!protocol.equals("http") && !protocol.equals("https")) {
                    C2622l.m5226A3(protocol.length() != 0 ? "Unsupported scheme: ".concat(protocol) : new String("Unsupported scheme: "));
                    WebResourceResponse webResourceResponseM8671d2 = m8671d();
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseM8671d2;
                }
                C2622l.m5318U2(headerField.length() != 0 ? "Redirecting to ".concat(headerField) : new String("Redirecting to "));
                httpURLConnection.disconnect();
                url = url2;
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8679f(Map<String, String> map, List<InterfaceC3464r8<? super InterfaceC3410ps>> list, String str) {
        if (C2096e.m4556E()) {
            C2096e.m4590z(str.length() != 0 ? "Received GMSG: ".concat(str) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                C2096e.m4590z(sb.toString());
            }
        }
        Iterator<InterfaceC3464r8<? super InterfaceC3410ps>> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo6148a(this.f21325g, map);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8680i(int i, int i2, boolean z) {
        C3250lg c3250lg = this.f21341w;
        if (c3250lg != null) {
            c3250lg.m7587f(i, i2);
        }
        C3065gg c3065gg = this.f21343y;
        if (c3065gg != null) {
            synchronized (c3065gg.f14561k) {
                c3065gg.f14555e = i;
                c3065gg.f14556f = i2;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uv2
    /* JADX INFO: renamed from: i0 */
    public final void mo2739i0() {
        uv2 uv2Var = this.f21329k;
        if (uv2Var != null) {
            uv2Var.mo2739i0();
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8681j() {
        boolean z;
        synchronized (this.f21328j) {
            z = this.f21337s;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m8682m() {
        boolean z;
        synchronized (this.f21328j) {
            z = this.f21338t;
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public final void m8683n() {
        InterfaceC2884bl interfaceC2884bl = this.f21344z;
        if (interfaceC2884bl != null) {
            WebView webViewMo6456N = this.f21325g.mo6456N();
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (webViewMo6456N.isAttachedToWindow()) {
                m8677c(webViewMo6456N, interfaceC2884bl, 10);
                return;
            }
            View.OnAttachStateChangeListener onAttachStateChangeListener = this.f21324F;
            if (onAttachStateChangeListener != null) {
                ((View) this.f21325g).removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
            ViewOnAttachStateChangeListenerC3558ts viewOnAttachStateChangeListenerC3558ts = new ViewOnAttachStateChangeListenerC3558ts(this, interfaceC2884bl);
            this.f21324F = viewOnAttachStateChangeListenerC3558ts;
            ((View) this.f21325g).addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3558ts);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String strValueOf = String.valueOf(str);
        C2096e.m4590z(strValueOf.length() != 0 ? "Loading resource: ".concat(strValueOf) : new String("Loading resource: "));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            m8675a(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f21328j) {
            if (this.f21325g.mo6458O()) {
                C2096e.m4590z("Blank page loaded, 1...");
                this.f21325g.mo6447I0();
                return;
            }
            this.f21319A = true;
            InterfaceC2893bu interfaceC2893bu = this.f21332n;
            if (interfaceC2893bu != null) {
                interfaceC2893bu.mo6099a();
                this.f21332n = null;
            }
            m8684p();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f21336r = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f21325g.mo6477e0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    /* JADX INFO: renamed from: p */
    public final void m8684p() {
        if (this.f21331m != null && ((this.f21319A && this.f21321C <= 0) || this.f21320B || this.f21336r)) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14333d1)).booleanValue() && this.f21325g.mo6489l() != null) {
                C2622l.m5391k1(this.f21325g.mo6489l().f18702b, this.f21325g.mo6484i(), "awfllc");
            }
            InterfaceC2856au interfaceC2856au = this.f21331m;
            boolean z = false;
            if (!this.f21320B && !this.f21336r) {
                z = true;
            }
            interfaceC2856au.mo4670B(z);
            this.f21331m = null;
        }
        this.f21325g.mo6510w();
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m8674G(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String strValueOf = String.valueOf(str);
        C2096e.m4590z(strValueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(strValueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uriM8272b = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriM8272b.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriM8272b.getHost())) {
            m8675a(uriM8272b);
            return true;
        }
        if (this.f21335q && webView == this.f21325g.mo6456N()) {
            String scheme = uriM8272b.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                uv2 uv2Var = this.f21329k;
                if (uv2Var != null) {
                    uv2Var.mo2739i0();
                    InterfaceC2884bl interfaceC2884bl = this.f21344z;
                    if (interfaceC2884bl != null) {
                        interfaceC2884bl.mo6038t(str);
                    }
                    this.f21329k = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        if (this.f21325g.mo6456N().willNotDraw()) {
            String strValueOf2 = String.valueOf(str);
            C2622l.m5226A3(strValueOf2.length() != 0 ? "AdWebView unable to handle URL: ".concat(strValueOf2) : new String("AdWebView unable to handle URL: "));
            return true;
        }
        try {
            rd2 rd2VarMo6502s = this.f21325g.mo6502s();
            if (rd2VarMo6502s != null && rd2VarMo6502s.m8271a(uriM8272b)) {
                Context context = this.f21325g.getContext();
                InterfaceC3410ps interfaceC3410ps = this.f21325g;
                uriM8272b = rd2VarMo6502s.m8272b(uriM8272b, context, (View) interfaceC3410ps, interfaceC3410ps.mo6482h());
            }
        } catch (sd2 unused) {
            String strValueOf3 = String.valueOf(str);
            C2622l.m5226A3(strValueOf3.length() != 0 ? "Unable to append parameter to URL: ".concat(strValueOf3) : new String("Unable to append parameter to URL: "));
        }
        C2313d c2313d = this.f21342x;
        if (c2313d == null || c2313d.m4842a()) {
            m8685t(new C2223f("android.intent.action.VIEW", uriM8272b.toString(), null, null, null, null, null, null));
            return true;
        }
        this.f21342x.m4843b(str);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final void m8685t(C2223f c2223f) {
        boolean zMo6432B = this.f21325g.mo6432B();
        m8686v(new AdOverlayInfoParcel(c2223f, (!zMo6432B || this.f21325g.mo6500r().m6689d()) ? this.f21329k : null, zMo6432B ? null : this.f21330l, this.f21340v, this.f21325g.mo6495o(), this.f21325g));
    }

    /* JADX INFO: renamed from: v */
    public final void m8686v(AdOverlayInfoParcel adOverlayInfoParcel) {
        C2223f c2223f;
        C3065gg c3065gg = this.f21343y;
        boolean z = false;
        if (c3065gg != null) {
            synchronized (c3065gg.f14561k) {
                z = c3065gg.f14568r != null;
            }
        }
        C2233p c2233p = C2330u.f10884a.f10888c;
        C2233p.m4697a(this.f21325g.getContext(), adOverlayInfoParcel, true ^ z);
        InterfaceC2884bl interfaceC2884bl = this.f21344z;
        if (interfaceC2884bl != null) {
            String str = adOverlayInfoParcel.f28478q;
            if (str == null && (c2223f = adOverlayInfoParcel.f28467f) != null) {
                str = c2223f.f10633g;
            }
            interfaceC2884bl.mo6038t(str);
        }
    }
}
