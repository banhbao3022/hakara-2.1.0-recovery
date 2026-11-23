package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2313d;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2223f;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2240w;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2266h0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3040fs;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3300mt;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3485rt;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3577ua;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3634vt;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3708xt;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3782zt;
import p007c.p190n.p194b.p266d.p314j.p315a.uv2;
import p636z0.p725k.p726c.NotificationManagerCompat;

/* JADX INFO: renamed from: c.n.b.d.j.a.c9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2910c9<T extends uv2 & InterfaceC3040fs & InterfaceC3410ps & InterfaceC3577ua & InterfaceC3300mt & InterfaceC3485rt & InterfaceC3634vt & InterfaceC3708xt & InterfaceC3782zt> implements InterfaceC3464r8<T> {

    /* JADX INFO: renamed from: a */
    public final C2313d f12958a;

    /* JADX INFO: renamed from: b */
    public final po0 f12959b;

    /* JADX INFO: renamed from: c */
    public final im1 f12960c;

    /* JADX INFO: renamed from: e */
    public final C3065gg f12962e;

    /* JADX INFO: renamed from: f */
    public final pw0 f12963f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2240w f12964g = null;

    /* JADX INFO: renamed from: d */
    public final C3665wn f12961d = new C3665wn(null);

    public C2910c9(C2313d c2313d, C3065gg c3065gg, pw0 pw0Var, po0 po0Var, im1 im1Var) {
        this.f12958a = c2313d;
        this.f12962e = c3065gg;
        this.f12963f = pw0Var;
        this.f12959b = po0Var;
        this.f12960c = im1Var;
    }

    /* JADX INFO: renamed from: b */
    public static int m6151b(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("c".equalsIgnoreCase(str)) {
            return C2330u.f10884a.f10891f.mo4719h();
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static Uri m6152c(Context context, rd2 rd2Var, Uri uri, View view, Activity activity) {
        if (rd2Var == null) {
            return uri;
        }
        try {
            boolean z = false;
            if (rd2Var.m8271a(uri)) {
                String[] strArr = rd2.f18747a;
                for (int i = 0; i < 3; i++) {
                    if (uri.getPath().endsWith(strArr[i])) {
                        z = true;
                        break;
                    }
                }
            }
            return z ? rd2Var.m8272b(uri, context, view, activity) : uri;
        } catch (sd2 unused) {
            return uri;
        } catch (Exception e) {
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Uri m6153d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String strValueOf = String.valueOf(uri.toString());
            C2622l.m5438t3(strValueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(strValueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:107:0x0304  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:158:0x040a  */
    /* JADX WARN: Code duplicated, block: B:160:0x041c  */
    /* JADX WARN: Code duplicated, block: B:161:0x0424  */
    /* JADX WARN: Code duplicated, block: B:169:0x044b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0453  */
    /* JADX WARN: Code duplicated, block: B:175:0x045e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0498  */
    /* JADX WARN: Code duplicated, block: B:185:0x049e  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ba  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map map) {
        String str;
        boolean z;
        Intent uri;
        boolean z2;
        HashMap map2;
        String str2;
        Uri data;
        Uri uriM6153d;
        Uri uriBuild;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoM5392k2;
        uv2 uv2Var = (uv2) obj;
        InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) uv2Var;
        boolean z3 = true;
        String strM5283M0 = C2622l.m5283M0((String) map.get("u"), interfaceC3410ps.getContext(), true);
        String str3 = (String) map.get("a");
        if (str3 == null) {
            C2622l.m5226A3("Action missing from an open GMSG.");
            return;
        }
        C2313d c2313d = this.f12958a;
        if (c2313d != null && !c2313d.m4842a()) {
            this.f12958a.m4843b(strM5283M0);
            return;
        }
        rh1 rh1VarMo6499q = interfaceC3410ps.mo6499q();
        uh1 uh1VarMo6512x = interfaceC3410ps.mo6512x();
        if (rh1VarMo6499q == null || uh1VarMo6512x == null) {
            str = "";
            z = false;
        } else {
            z = rh1VarMo6499q.f18810d0;
            str = uh1VarMo6512x.f20318b;
        }
        if ("expand".equalsIgnoreCase(str3)) {
            if (interfaceC3410ps.mo6432B()) {
                C2622l.m5226A3("Cannot expand WebView that is already expanded.");
                return;
            } else {
                m6155f(false);
                ((InterfaceC3634vt) uv2Var).mo6504t("1".equals(map.get("custom_close")), m6151b(map));
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str3)) {
            m6155f(false);
            if (strM5283M0 != null) {
                ((InterfaceC3634vt) uv2Var).mo6488k0("1".equals(map.get("custom_close")), m6151b(map), strM5283M0);
                return;
            } else {
                ((InterfaceC3634vt) uv2Var).mo6492m0("1".equals(map.get("custom_close")), m6151b(map), (String) map.get("html"), (String) map.get("baseurl"));
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str3)) {
            Context context = interfaceC3410ps.getContext();
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14439s2;
            C2862b c2862b = C2862b.f12493a;
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                if (!((Boolean) c2862b.f12496d.m6596a(C3052g3.f14481y2)).booleanValue()) {
                    if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14467w2)).booleanValue()) {
                        String str4 = (String) c2862b.f12496d.m6596a(C3052g3.f14474x2);
                        if (!str4.isEmpty() && context != null) {
                            String packageName = context.getPackageName();
                            Iterator<String> it = ((is1) ks1.m7543a(new as1(';')).m7544b(str4)).iterator();
                            while (true) {
                                js1 js1Var = (js1) it;
                                if (js1Var.hasNext()) {
                                    if (((String) js1Var.next()).equals(packageName)) {
                                    }
                                }
                            }
                        }
                    }
                    m6155f(true);
                    if (TextUtils.isEmpty(strM5283M0)) {
                        C2622l.m5226A3("Cannot open browser with null or empty url");
                        m6156g(7);
                        return;
                    }
                    Uri uriM6153d2 = m6153d(m6152c(interfaceC3410ps.getContext(), interfaceC3410ps.mo6502s(), Uri.parse(strM5283M0), interfaceC3410ps.mo6468X(), interfaceC3410ps.mo6482h()));
                    if (z && this.f12963f != null && m6154e(uv2Var, interfaceC3410ps.getContext(), uriM6153d2.toString(), str)) {
                        return;
                    }
                    this.f12964g = new C3761z8(this);
                    ((InterfaceC3634vt) uv2Var).mo6471a(new C2223f(null, uriM6153d2.toString(), null, null, null, null, null, null, new BinderC2800b(this.f12964g), true));
                    return;
                }
                C2096e.m4590z("User opt out chrome custom tab.");
            }
        }
        Intent intentM5275K2 = null;
        if ("app".equalsIgnoreCase(str3) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m6155f(true);
            Context context2 = interfaceC3410ps.getContext();
            rd2 rd2VarMo6502s = interfaceC3410ps.mo6502s();
            View viewMo6468X = interfaceC3410ps.mo6468X();
            ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
            String str5 = (String) map.get("u");
            if (!TextUtils.isEmpty(str5)) {
                Uri uriM6153d3 = m6153d(m6152c(context2, rd2VarMo6502s, Uri.parse(str5), viewMo6468X, null));
                boolean z4 = Boolean.parseBoolean((String) map.get("use_first_package"));
                boolean z5 = Boolean.parseBoolean((String) map.get("use_running_process"));
                if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                    if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14425q2)).booleanValue()) {
                        z3 = false;
                    }
                }
                if ("http".equalsIgnoreCase(uriM6153d3.getScheme())) {
                    uriBuild = uriM6153d3.buildUpon().scheme("https").build();
                } else {
                    uriBuild = "https".equalsIgnoreCase(uriM6153d3.getScheme()) ? uriM6153d3.buildUpon().scheme("http").build() : null;
                }
                ArrayList arrayList = new ArrayList();
                Intent intentM5410o0 = C2622l.m5410o0(uriM6153d3, context2);
                Intent intentM5410o1 = C2622l.m5410o0(uriBuild, context2);
                if (z3) {
                    C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                    C2267h1.m4737G(context2, intentM5410o0);
                    C2267h1.m4737G(context2, intentM5410o1);
                }
                ResolveInfo resolveInfoM5392k3 = C2622l.m5392k2(intentM5410o0, arrayList, context2, rd2VarMo6502s, viewMo6468X);
                if (resolveInfoM5392k3 != null) {
                    intentM5275K2 = C2622l.m5275K2(intentM5410o0, resolveInfoM5392k3, context2);
                } else if (intentM5410o1 != null && (resolveInfoM5392k2 = C2622l.m5392k2(intentM5410o1, new ArrayList(), context2, rd2VarMo6502s, viewMo6468X)) != null) {
                    intentM5275K2 = C2622l.m5275K2(intentM5410o0, resolveInfoM5392k2, context2);
                    if (C2622l.m5392k2(intentM5275K2, new ArrayList(), context2, rd2VarMo6502s, viewMo6468X) == null) {
                        if (arrayList.size() != 0) {
                            intentM5275K2 = intentM5410o0;
                        } else if (!z5) {
                            if (z4) {
                                intentM5275K2 = C2622l.m5275K2(intentM5410o0, (ResolveInfo) arrayList.get(0), context2);
                            } else {
                                intentM5275K2 = intentM5410o0;
                            }
                        } else if (z4) {
                            intentM5275K2 = C2622l.m5275K2(intentM5410o0, (ResolveInfo) arrayList.get(0), context2);
                        } else {
                            intentM5275K2 = intentM5410o0;
                        }
                    }
                } else if (arrayList.size() != 0) {
                    intentM5275K2 = intentM5410o0;
                } else if (!z5 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                            Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
                            while (true) {
                                int i2 = i + 1;
                                if (!it2.hasNext()) {
                                    i = i2;
                                } else if (it2.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                    intentM5275K2 = C2622l.m5275K2(intentM5410o0, resolveInfo, context2);
                                }
                            }
                        } else if (z4) {
                            intentM5275K2 = C2622l.m5275K2(intentM5410o0, (ResolveInfo) arrayList.get(0), context2);
                        } else {
                            intentM5275K2 = intentM5410o0;
                        }
                    }
                } else if (z4) {
                    intentM5275K2 = C2622l.m5275K2(intentM5410o0, (ResolveInfo) arrayList.get(0), context2);
                } else {
                    intentM5275K2 = intentM5410o0;
                }
            }
            if (!z || this.f12963f == null || intentM5275K2 == null || !m6154e(uv2Var, interfaceC3410ps.getContext(), intentM5275K2.getData().toString(), str)) {
                try {
                    ((InterfaceC3634vt) uv2Var).mo6471a(new C2223f(intentM5275K2, this.f12964g));
                    return;
                } catch (ActivityNotFoundException e) {
                    C2622l.m5226A3(e.getMessage());
                    return;
                }
            }
            return;
        }
        if ("open_app".equalsIgnoreCase(str3)) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14249P4)).booleanValue()) {
                m6155f(true);
                String str6 = (String) map.get("p");
                if (str6 == null) {
                    C2622l.m5226A3("Package name missing from open app action.");
                    return;
                }
                if (z && this.f12963f != null && m6154e(uv2Var, interfaceC3410ps.getContext(), str6, str)) {
                    return;
                }
                PackageManager packageManager = interfaceC3410ps.getContext().getPackageManager();
                if (packageManager == null) {
                    C2622l.m5226A3("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                if (launchIntentForPackage != null) {
                    ((InterfaceC3634vt) uv2Var).mo6471a(new C2223f(launchIntentForPackage, this.f12964g));
                    return;
                }
                return;
            }
            return;
        }
        m6155f(true);
        String str7 = (String) map.get("intent_url");
        if (!TextUtils.isEmpty(str7)) {
            try {
                uri = Intent.parseUri(str7, 0);
            } catch (URISyntaxException e2) {
                String strValueOf = String.valueOf(str7);
                C2622l.m5438t3(strValueOf.length() != 0 ? "Error parsing the url: ".concat(strValueOf) : new String("Error parsing the url: "), e2);
                uri = null;
            }
            if (uri != null && uri.getData() != null) {
                data = uri.getData();
                if (!Uri.EMPTY.equals(data)) {
                    uriM6153d = m6153d(m6152c(interfaceC3410ps.getContext(), interfaceC3410ps.mo6502s(), data, interfaceC3410ps.mo6468X(), interfaceC3410ps.mo6482h()));
                    if (!TextUtils.isEmpty(uri.getType())) {
                        uri.setData(uriM6153d);
                    } else if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14255Q4)).booleanValue()) {
                        uri.setDataAndType(uriM6153d, uri.getType());
                    } else {
                        uri.setData(uriM6153d);
                    }
                }
            }
            if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14323b5)).booleanValue() && "intent_async".equalsIgnoreCase(str3) && map.containsKey("event_id")) {
                z2 = true;
            } else {
                z2 = false;
            }
            map2 = new HashMap();
            if (z2) {
                this.f12964g = new C2835a9(map2, map, uv2Var);
            }
            if (uri != null) {
                if (z || this.f12963f == null || !m6154e(uv2Var, interfaceC3410ps.getContext(), uri.getData().toString(), str)) {
                    ((InterfaceC3634vt) uv2Var).mo6471a(new C2223f(uri, this.f12964g));
                    return;
                } else {
                    if (z2) {
                        map2.put((String) map.get("event_id"), Boolean.TRUE);
                        ((InterfaceC3577ua) uv2Var).mo6501r0("openIntentAsync", map2);
                        return;
                    }
                    return;
                }
            }
            if (!TextUtils.isEmpty(strM5283M0)) {
                strM5283M0 = m6153d(m6152c(interfaceC3410ps.getContext(), interfaceC3410ps.mo6502s(), Uri.parse(strM5283M0), interfaceC3410ps.mo6468X(), interfaceC3410ps.mo6482h())).toString();
            }
            str2 = strM5283M0;
            if (z || this.f12963f == null || !m6154e(uv2Var, interfaceC3410ps.getContext(), str2, str)) {
                ((InterfaceC3634vt) uv2Var).mo6471a(new C2223f((String) map.get("i"), str2, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.f12964g));
            } else {
                if (z2) {
                    map2.put((String) map.get("event_id"), Boolean.TRUE);
                    ((InterfaceC3577ua) uv2Var).mo6501r0("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        uri = null;
        if (uri != null) {
            data = uri.getData();
            if (!Uri.EMPTY.equals(data)) {
                uriM6153d = m6153d(m6152c(interfaceC3410ps.getContext(), interfaceC3410ps.mo6502s(), data, interfaceC3410ps.mo6468X(), interfaceC3410ps.mo6482h()));
                if (!TextUtils.isEmpty(uri.getType())) {
                    uri.setData(uriM6153d);
                } else if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14255Q4)).booleanValue()) {
                    uri.setDataAndType(uriM6153d, uri.getType());
                } else {
                    uri.setData(uriM6153d);
                }
            }
        }
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14323b5)).booleanValue()) {
            z2 = false;
        } else {
            z2 = false;
        }
        map2 = new HashMap();
        if (z2) {
            this.f12964g = new C2835a9(map2, map, uv2Var);
        }
        if (uri != null) {
            if (z) {
            }
            ((InterfaceC3634vt) uv2Var).mo6471a(new C2223f(uri, this.f12964g));
            return;
        }
        if (!TextUtils.isEmpty(strM5283M0)) {
            strM5283M0 = m6153d(m6152c(interfaceC3410ps.getContext(), interfaceC3410ps.mo6502s(), Uri.parse(strM5283M0), interfaceC3410ps.mo6468X(), interfaceC3410ps.mo6482h())).toString();
        }
        str2 = strM5283M0;
        if (z) {
        }
        ((InterfaceC3634vt) uv2Var).mo6471a(new C2223f((String) map.get("i"), str2, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.f12964g));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6154e(T t, Context context, String str, final String str2) {
        C2330u c2330u = C2330u.f10884a;
        C2267h1 c2267h1 = c2330u.f10889d;
        boolean zM4747f = C2267h1.m4747f(context);
        InterfaceC2266h0 interfaceC2266h0M4743b = C2267h1.m4743b(context);
        po0 po0Var = this.f12959b;
        if (po0Var != null) {
            xw0.m8761G6(context, po0Var, this.f12960c, this.f12963f, str2, "offline_open");
        }
        T t2 = t;
        boolean z = t2.mo6500r().m6689d() && t2.mo6482h() == null;
        if (zM4747f) {
            final pw0 pw0Var = this.f12963f;
            final C3665wn c3665wn = this.f12961d;
            pw0Var.m8169a(new dl1(pw0Var, c3665wn, str2) { // from class: c.n.b.d.j.a.lw0

                /* JADX INFO: renamed from: a */
                public final pw0 f16625a;

                /* JADX INFO: renamed from: b */
                public final C3665wn f16626b;

                /* JADX INFO: renamed from: c */
                public final String f16627c;

                {
                    this.f16625a = pw0Var;
                    this.f16626b = c3665wn;
                    this.f16627c = str2;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.dl1
                /* JADX INFO: renamed from: a */
                public final Object mo5679a(Object obj) {
                    pw0 pw0Var2 = this.f16625a;
                    C3665wn c3665wn2 = this.f16626b;
                    pw0Var2.f18111g.execute(new kw0((SQLiteDatabase) obj, this.f16627c, c3665wn2));
                    return null;
                }
            });
            return false;
        }
        if (new NotificationManagerCompat(context).m16128a() && interfaceC2266h0M4743b != null && !z) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14297X4)).booleanValue()) {
                if (t2.mo6500r().m6689d()) {
                    xw0.m8760F6(t2.mo6482h(), null, interfaceC2266h0M4743b, this.f12963f, this.f12959b, this.f12960c, str2, str);
                } else {
                    t.mo6435C0(interfaceC2266h0M4743b, this.f12963f, this.f12959b, this.f12960c, str2, str, c2330u.f10891f.mo4719h());
                }
                po0 po0Var2 = this.f12959b;
                if (po0Var2 != null) {
                    xw0.m8761G6(context, po0Var2, this.f12960c, this.f12963f, str2, "dialog_impression");
                }
                t.mo2739i0();
                return true;
            }
        }
        pw0 pw0Var2 = this.f12963f;
        pw0Var2.m8169a(new mw0(pw0Var2, str2));
        if (this.f12959b != null) {
            HashMap map = new HashMap();
            if (!new NotificationManagerCompat(context).m16128a()) {
                map.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (interfaceC2266h0M4743b == null) {
                map.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14297X4)).booleanValue()) {
                    map.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    map.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            xw0.m8762H6(context, this.f12959b, this.f12960c, this.f12963f, str2, "dialog_not_shown", map);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m6155f(boolean z) {
        C3065gg c3065gg = this.f12962e;
        if (c3065gg != null) {
            c3065gg.m6996f(z);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6156g(int i) {
        if (this.f12959b == null) {
            return;
        }
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14351f5)).booleanValue()) {
            im1 im1Var = this.f12960c;
            hm1 hm1VarM7144a = hm1.m7144a("cct_action");
            hm1VarM7144a.f14911a.put("cct_open_status", C2622l.m5258H0(i));
            im1Var.mo7280b(hm1VarM7144a);
            return;
        }
        oo0 oo0VarM8131a = this.f12959b.m8131a();
        oo0VarM8131a.f17700a.put("action", "cct_action");
        oo0VarM8131a.f17700a.put("cct_open_status", C2622l.m5258H0(i));
        oo0VarM8131a.m8047b();
    }
}
