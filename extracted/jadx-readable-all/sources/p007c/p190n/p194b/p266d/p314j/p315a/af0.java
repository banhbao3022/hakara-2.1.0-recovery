package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class af0 implements kg0 {

    /* JADX INFO: renamed from: a */
    public final Context f12088a;

    /* JADX INFO: renamed from: b */
    public final mg0 f12089b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f12090c;

    /* JADX INFO: renamed from: d */
    public final vk0 f12091d;

    /* JADX INFO: renamed from: e */
    public final bg0 f12092e;

    /* JADX INFO: renamed from: f */
    public final rd2 f12093f;

    /* JADX INFO: renamed from: g */
    public final y60 f12094g;

    /* JADX INFO: renamed from: h */
    public final g60 f12095h;

    /* JADX INFO: renamed from: i */
    public final rh1 f12096i;

    /* JADX INFO: renamed from: j */
    public final C3702xn f12097j;

    /* JADX INFO: renamed from: k */
    public final ii1 f12098k;

    /* JADX INFO: renamed from: l */
    public final C3787zy f12099l;

    /* JADX INFO: renamed from: m */
    public final dh0 f12100m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC2782b f12101n;

    /* JADX INFO: renamed from: o */
    public final dc0 f12102o;

    /* JADX INFO: renamed from: p */
    public final bn1 f12103p;

    /* JADX INFO: renamed from: r */
    public boolean f12105r;

    /* JADX INFO: renamed from: y */
    public InterfaceC3345o0 f12112y;

    /* JADX INFO: renamed from: q */
    public boolean f12104q = false;

    /* JADX INFO: renamed from: s */
    public boolean f12106s = false;

    /* JADX INFO: renamed from: t */
    public boolean f12107t = false;

    /* JADX INFO: renamed from: u */
    public Point f12108u = new Point();

    /* JADX INFO: renamed from: v */
    public Point f12109v = new Point();

    /* JADX INFO: renamed from: w */
    public long f12110w = 0;

    /* JADX INFO: renamed from: x */
    public long f12111x = 0;

    public af0(Context context, mg0 mg0Var, JSONObject jSONObject, vk0 vk0Var, bg0 bg0Var, rd2 rd2Var, y60 y60Var, g60 g60Var, rh1 rh1Var, C3702xn c3702xn, ii1 ii1Var, C3787zy c3787zy, dh0 dh0Var, InterfaceC2782b interfaceC2782b, dc0 dc0Var, bn1 bn1Var) {
        this.f12088a = context;
        this.f12089b = mg0Var;
        this.f12090c = jSONObject;
        this.f12091d = vk0Var;
        this.f12092e = bg0Var;
        this.f12093f = rd2Var;
        this.f12094g = y60Var;
        this.f12095h = g60Var;
        this.f12096i = rh1Var;
        this.f12097j = c3702xn;
        this.f12098k = ii1Var;
        this.f12099l = c3787zy;
        this.f12100m = dh0Var;
        this.f12101n = interfaceC2782b;
        this.f12102o = dc0Var;
        this.f12103p = bn1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: B */
    public final void mo5741B() {
        vk0 vk0Var = this.f12091d;
        synchronized (vk0Var) {
            kv1<InterfaceC3410ps> kv1Var = vk0Var.f20822l;
            if (kv1Var == null) {
                return;
            }
            lk0 lk0Var = new lk0();
            kv1Var.mo6230f(new ev1(kv1Var, lk0Var), vk0Var.f20816f);
            vk0Var.f20822l = null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: a */
    public final void mo5742a(View view, MotionEvent motionEvent, View view2) {
        this.f12108u = C2096e.m4561J(motionEvent, view2);
        long jMo5623c = this.f12101n.mo5623c();
        this.f12111x = jMo5623c;
        if (motionEvent.getAction() == 0) {
            this.f12110w = jMo5623c;
            this.f12109v = this.f12108u;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f12108u;
        motionEventObtain.setLocation(point.x, point.y);
        this.f12093f.f18750d.mo4852a(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: b */
    public final void mo5743b(InterfaceC3345o0 interfaceC3345o0) {
        this.f12112y = interfaceC3345o0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: c */
    public final void mo5744c(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f12108u = new Point();
        this.f12109v = new Point();
        if (!this.f12105r) {
            this.f12102o.m6351B0(view);
            this.f12105r = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        C3787zy c3787zy = this.f12099l;
        Objects.requireNonNull(c3787zy);
        c3787zy.f22444o = new WeakReference<>(this);
        boolean zM4552A = C2096e.m4552A(this.f12097j.f21617h);
        if (map != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = it.next().getValue().get();
                if (view2 != null) {
                    if (zM4552A) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = it2.next().getValue().get();
                if (view3 != null) {
                    if (zM4552A) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: d */
    public final void mo5745d(View view, Map<String, WeakReference<View>> map) {
        this.f12108u = new Point();
        this.f12109v = new Point();
        dc0 dc0Var = this.f12102o;
        synchronized (dc0Var) {
            if (dc0Var.f13231g.containsKey(view)) {
                dc0Var.f13231g.get(view).f15699s.remove(dc0Var);
                dc0Var.f13231g.remove(view);
            }
        }
        this.f12105r = false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: e */
    public final void mo5746e(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        JSONObject jSONObjectM4558G = C2096e.m4558G(this.f12088a, map, map2, view2);
        JSONObject jSONObjectM4553B = C2096e.m4553B(this.f12088a, view2);
        JSONObject jSONObjectM4555D = C2096e.m4555D(view2);
        JSONObject jSONObjectM4557F = C2096e.m4557F(this.f12088a, view2);
        String strM5763u = m5763u(view, map);
        m5766x(true == ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14216K1)).booleanValue() ? view2 : view, jSONObjectM4553B, jSONObjectM4558G, jSONObjectM4555D, jSONObjectM4557F, strM5763u, C2096e.m4559H(strM5763u, this.f12088a, this.f12109v, this.f12108u), null, z, false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: f */
    public final void mo5747f() {
        this.f12107t = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: g */
    public final boolean mo5748g() {
        return m5764v();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: h */
    public final JSONObject mo5749h(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject jSONObjectM4558G = C2096e.m4558G(this.f12088a, map, map2, view);
        JSONObject jSONObjectM4553B = C2096e.m4553B(this.f12088a, view);
        JSONObject jSONObjectM4555D = C2096e.m4555D(view);
        JSONObject jSONObjectM4557F = C2096e.m4557F(this.f12088a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectM4558G);
            jSONObject.put("ad_view_signal", jSONObjectM4553B);
            jSONObject.put("scroll_view_signal", jSONObjectM4555D);
            jSONObject.put("lock_screen_signal", jSONObjectM4557F);
            return jSONObject;
        } catch (JSONException e) {
            C2622l.m5438t3("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: i */
    public final void mo5750i(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        String strMo4853b;
        JSONObject jSONObjectM4558G = C2096e.m4558G(this.f12088a, map, map2, view);
        JSONObject jSONObjectM4553B = C2096e.m4553B(this.f12088a, view);
        JSONObject jSONObjectM4555D = C2096e.m4555D(view);
        JSONObject jSONObjectM4557F = C2096e.m4557F(this.f12088a, view);
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14210J1)).booleanValue()) {
            try {
                strMo4853b = this.f12093f.f18750d.mo4853b(this.f12088a, view, null);
            } catch (Exception unused) {
                C2622l.m5408n3("Exception getting data.");
                strMo4853b = null;
            }
        } else {
            strMo4853b = null;
        }
        m5765w(jSONObjectM4553B, jSONObjectM4558G, jSONObjectM4555D, jSONObjectM4557F, strMo4853b, null, C2096e.m4562K(this.f12088a, this.f12096i));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: j */
    public final void mo5751j(View view) {
        if (!this.f12090c.optBoolean("custom_one_point_five_click_enabled", false)) {
            C2622l.m5226A3("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        dh0 dh0Var = this.f12100m;
        if (view == null) {
            return;
        }
        view.setOnClickListener(dh0Var);
        view.setClickable(true);
        dh0Var.f13272l = new WeakReference<>(view);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: k */
    public final void mo5752k(final InterfaceC3019f7 interfaceC3019f7) {
        if (!this.f12090c.optBoolean("custom_one_point_five_click_enabled", false)) {
            C2622l.m5226A3("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        final dh0 dh0Var = this.f12100m;
        dh0Var.f13268h = interfaceC3019f7;
        InterfaceC3464r8<Object> interfaceC3464r8 = dh0Var.f13269i;
        if (interfaceC3464r8 != null) {
            dh0Var.f13266f.m8563c("/unconfirmedClick", interfaceC3464r8);
        }
        InterfaceC3464r8<Object> interfaceC3464r9 = new InterfaceC3464r8(dh0Var, interfaceC3019f7) { // from class: c.n.b.d.j.a.ch0

            /* JADX INFO: renamed from: a */
            public final dh0 f13001a;

            /* JADX INFO: renamed from: b */
            public final InterfaceC3019f7 f13002b;

            {
                this.f13001a = dh0Var;
                this.f13002b = interfaceC3019f7;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
            /* JADX INFO: renamed from: a */
            public final void mo6148a(Object obj, Map map) {
                dh0 dh0Var2 = this.f13001a;
                InterfaceC3019f7 interfaceC3019f8 = this.f13002b;
                try {
                    dh0Var2.f13271k = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    C2622l.m5408n3("Failed to call parse unconfirmedClickTimestamp.");
                }
                dh0Var2.f13270j = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (interfaceC3019f8 == null) {
                    C2622l.m5318U2("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    interfaceC3019f8.mo6290A2(str);
                } catch (RemoteException e) {
                    C2622l.m5271J3("#007 Could not call remote method.", e);
                }
            }
        };
        dh0Var.f13269i = interfaceC3464r9;
        dh0Var.f13266f.m8562b("/unconfirmedClick", interfaceC3464r9);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: l */
    public final boolean mo5753l(Bundle bundle) throws JSONException {
        if (!m5767y("impression_reporting")) {
            C2622l.m5408n3("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        Objects.requireNonNull(c2267h1);
        JSONObject jSONObjectM4768D = null;
        if (bundle != null) {
            try {
                jSONObjectM4768D = c2267h1.m4768D(bundle);
            } catch (JSONException e) {
                C2622l.m5438t3("Error converting Bundle to JSON", e);
            }
        }
        return m5765w(null, null, null, null, null, jSONObjectM4768D, false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: m */
    public final void mo5754m() {
        m5765w(null, null, null, null, null, null, false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: n */
    public final void mo5755n() {
        if (this.f12090c.optBoolean("custom_one_point_five_click_enabled", false)) {
            dh0 dh0Var = this.f12100m;
            if (dh0Var.f13268h == null || dh0Var.f13271k == null) {
                return;
            }
            dh0Var.m6358a();
            try {
                dh0Var.f13268h.mo6291d();
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: o */
    public final void mo5756o(Bundle bundle) {
        if (bundle == null) {
            C2622l.m5318U2("Click data is null. No click is reported.");
            return;
        }
        if (!m5767y("click_reporting")) {
            C2622l.m5408n3("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObjectM4768D = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        Objects.requireNonNull(c2267h1);
        try {
            jSONObjectM4768D = c2267h1.m4768D(bundle);
        } catch (JSONException e) {
            C2622l.m5438t3("Error converting Bundle to JSON", e);
        }
        m5766x(null, null, null, null, null, string, null, jSONObjectM4768D, false, false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: o0 */
    public final void mo5757o0(String str) {
        m5766x(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: p */
    public final void mo5758p(Bundle bundle) {
        if (bundle == null) {
            C2622l.m5318U2("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!m5767y("touch_reporting")) {
            C2622l.m5408n3("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        float f = bundle.getFloat("x");
        float f2 = bundle.getFloat("y");
        this.f12093f.f18750d.mo4855d((int) f, (int) f2, bundle.getInt("duration_ms"));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: q */
    public final void mo5759q() {
        try {
            InterfaceC3345o0 interfaceC3345o0 = this.f12112y;
            if (interfaceC3345o0 != null) {
                interfaceC3345o0.mo7742c();
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: r */
    public final void mo5760r() {
        C2622l.m5354d("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f12090c);
            C2622l.m5320V0(this.f12091d.m8561a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            C2622l.m5438t3("", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: s */
    public final void mo5761s(InterfaceC3456r0 interfaceC3456r0) {
        try {
            if (this.f12106s) {
                return;
            }
            if (interfaceC3456r0 == null && this.f12092e.m5996b() != null) {
                this.f12106s = true;
                this.f12103p.m6065b(this.f12092e.m5996b().f20686g);
                mo5759q();
                return;
            }
            this.f12106s = true;
            this.f12103p.m6065b(interfaceC3456r0.mo8075d());
            mo5759q();
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: t */
    public final void mo5762t(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f12107t) {
            C2622l.m5318U2("Custom click reporting failed. enableCustomClickGesture is not set.");
            return;
        }
        if (!m5764v()) {
            C2622l.m5318U2("Custom click reporting failed. Ad unit id not in the allow list.");
            return;
        }
        JSONObject jSONObjectM4558G = C2096e.m4558G(this.f12088a, map, map2, view);
        JSONObject jSONObjectM4553B = C2096e.m4553B(this.f12088a, view);
        JSONObject jSONObjectM4555D = C2096e.m4555D(view);
        JSONObject jSONObjectM4557F = C2096e.m4557F(this.f12088a, view);
        String strM5763u = m5763u(null, map);
        m5766x(view, jSONObjectM4553B, jSONObjectM4558G, jSONObjectM4555D, jSONObjectM4557F, strM5763u, C2096e.m4559H(strM5763u, this.f12088a, this.f12109v, this.f12108u), null, z, true);
    }

    /* JADX INFO: renamed from: u */
    public final String m5763u(View view, Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int iM6008r = this.f12092e.m6008r();
        if (iM6008r == 1) {
            return "1099";
        }
        if (iM6008r == 2) {
            return "2099";
        }
        if (iM6008r != 6) {
            return null;
        }
        return "3099";
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5764v() {
        return this.f12090c.optBoolean("allow_custom_click_gesture", false);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m5765w(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        C2622l.m5354d("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f12090c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14210J1)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.f12088a;
            JSONObject jSONObject7 = new JSONObject();
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            DisplayMetrics displayMetricsM4741K = C2267h1.m4741K((WindowManager) context.getSystemService("window"));
            try {
                int i = displayMetricsM4741K.widthPixels;
                gx2 gx2Var = gx2.f14692a;
                jSONObject7.put("width", gx2Var.f14693b.m7896a(context, i));
                jSONObject7.put("height", gx2Var.f14693b.m7896a(context, displayMetricsM4741K.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14309Z4)).booleanValue()) {
                this.f12091d.m8562b("/clickRecorded", new ye0(this));
            } else {
                this.f12091d.m8562b("/logScionEvent", new xe0(this));
            }
            this.f12091d.m8562b("/nativeImpression", new ze0(this));
            C2622l.m5320V0(this.f12091d.m8561a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f12104q) {
                return true;
            }
            this.f12104q = C2330u.f10884a.f10899n.m4792a(this.f12088a, this.f12097j.f21615f, this.f12096i.f18778B.toString(), this.f12098k.f15193f);
            return true;
        } catch (JSONException e) {
            C2622l.m5438t3("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5766x(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String strMo4856e;
        C2622l.m5354d("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f12090c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f12089b.m7697a(this.f12092e.m6002h()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f12092e.m6008r());
            jSONObject8.put("view_aware_api_used", z);
            C3165j5 c3165j5 = this.f12098k.f15196i;
            jSONObject8.put("custom_mute_requested", c3165j5 != null && c3165j5.f15481l);
            jSONObject8.put("custom_mute_enabled", (this.f12092e.m5995a().isEmpty() || this.f12092e.m5996b() == null) ? false : true);
            if (this.f12100m.f13268h != null && this.f12090c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f12101n.mo5623c());
            if (this.f12107t && m5764v()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f12089b.m7697a(this.f12092e.m6002h()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.f12090c.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strMo4856e = this.f12093f.f18750d.mo4856e(this.f12088a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                C2622l.m5438t3("Exception obtaining click signals", e);
                strMo4856e = null;
            }
            jSONObject8.put("click_signals", strMo4856e);
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14460v2;
            C2862b c2862b = C2862b.f12493a;
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14337d5)).booleanValue() && C2622l.m5222A()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14344e5)).booleanValue() && C2622l.m5222A()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jMo5623c = this.f12101n.mo5623c();
            jSONObject9.put("time_from_last_touch_down", jMo5623c - this.f12110w);
            jSONObject9.put("time_from_last_touch", jMo5623c - this.f12111x);
            jSONObject7.put("touch_signal", jSONObject9);
            C2622l.m5320V0(this.f12091d.m8561a("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            C2622l.m5438t3("Unable to create click JSON.", e2);
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5767y(String str) {
        JSONObject jSONObjectOptJSONObject = this.f12090c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }
}
