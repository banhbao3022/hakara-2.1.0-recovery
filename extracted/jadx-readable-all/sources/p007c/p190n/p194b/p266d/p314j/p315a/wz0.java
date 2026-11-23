package p007c.p190n.p194b.p266d.p314j.p315a;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2242y;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wz0 implements qz0<wf0> {

    /* JADX INFO: renamed from: a */
    public final qe0 f21399a;

    /* JADX INFO: renamed from: b */
    public final lv1 f21400b;

    /* JADX INFO: renamed from: c */
    public final oi0 f21401c;

    /* JADX INFO: renamed from: d */
    public final wi1<vk0> f21402d;

    public wz0(qe0 qe0Var, lv1 lv1Var, oi0 oi0Var, wi1<vk0> wi1Var) {
        this.f21399a = qe0Var;
        this.f21400b = lv1Var;
        this.f21401c = oi0Var;
        this.f21402d = wi1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: a */
    public final kv1<List<kv1<wf0>>> mo6115a(final di1 di1Var, final rh1 rh1Var) {
        return cw0.m6249s(cw0.m6249s(this.f21402d.m8652b(), new qu1(this, rh1Var) { // from class: c.n.b.d.j.a.rz0

            /* JADX INFO: renamed from: a */
            public final wz0 f19426a;

            /* JADX INFO: renamed from: b */
            public final rh1 f19427b;

            {
                this.f19426a = this;
                this.f19427b = rh1Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) throws JSONException {
                final wz0 wz0Var = this.f19426a;
                rh1 rh1Var2 = this.f19427b;
                final vk0 vk0Var = (vk0) obj;
                Objects.requireNonNull(wz0Var);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isNonagon", true);
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14330c5)).booleanValue() && C2622l.m5222A()) {
                    jSONObject.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("response", rh1Var2.f18827r.f21127c);
                jSONObject2.put("sdk_params", jSONObject);
                return cw0.m6249s(vk0Var.m8561a("google.afma.nativeAds.preProcessJson", jSONObject2), new qu1(wz0Var, vk0Var) { // from class: c.n.b.d.j.a.tz0

                    /* JADX INFO: renamed from: a */
                    public final wz0 f20182a;

                    /* JADX INFO: renamed from: b */
                    public final vk0 f20183b;

                    {
                        this.f20182a = wz0Var;
                        this.f20183b = vk0Var;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                    /* JADX INFO: renamed from: a */
                    public final kv1 mo4612a(Object obj2) throws C3061gc {
                        wz0 wz0Var2 = this.f20182a;
                        vk0 vk0Var2 = this.f20183b;
                        JSONObject jSONObject3 = (JSONObject) obj2;
                        wi1<vk0> wi1Var = wz0Var2.f21402d;
                        kv1<vk0> kv1VarM6231a = cw0.m6231a(vk0Var2);
                        synchronized (wi1Var) {
                            wi1Var.f21133a.addFirst(kv1VarM6231a);
                        }
                        if (jSONObject3.optBoolean("success")) {
                            return cw0.m6231a(jSONObject3.getJSONObject("json").getJSONArray("ads"));
                        }
                        throw new C3061gc("process json failed");
                    }
                }, wz0Var.f21400b);
            }
        }, this.f21400b), new qu1(this, di1Var, rh1Var) { // from class: c.n.b.d.j.a.sz0

            /* JADX INFO: renamed from: a */
            public final wz0 f19741a;

            /* JADX INFO: renamed from: b */
            public final di1 f19742b;

            /* JADX INFO: renamed from: c */
            public final rh1 f19743c;

            {
                this.f19741a = this;
                this.f19742b = di1Var;
                this.f19743c = rh1Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                wz0 wz0Var = this.f19741a;
                di1 di1Var2 = this.f19742b;
                rh1 rh1Var2 = this.f19743c;
                JSONArray jSONArray = (JSONArray) obj;
                Objects.requireNonNull(wz0Var);
                if (jSONArray.length() == 0) {
                    return new gv1(new or0(3));
                }
                if (di1Var2.f13280a.f22289a.f15198k <= 1) {
                    return cw0.m6250t(wz0Var.m8700c(di1Var2, rh1Var2, jSONArray.getJSONObject(0)), uz0.f20681a, wz0Var.f21400b);
                }
                int length = jSONArray.length();
                wz0Var.f21402d.m8651a(Math.min(length, di1Var2.f13280a.f22289a.f15198k));
                ArrayList arrayList = new ArrayList(di1Var2.f13280a.f22289a.f15198k);
                for (int i = 0; i < di1Var2.f13280a.f22289a.f15198k; i++) {
                    if (i < length) {
                        arrayList.add(wz0Var.m8700c(di1Var2, rh1Var2, jSONArray.getJSONObject(i)));
                    } else {
                        arrayList.add(new gv1(new or0(3)));
                    }
                }
                return cw0.m6231a(arrayList);
            }
        }, this.f21400b);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: b */
    public final boolean mo6116b(di1 di1Var, rh1 rh1Var) {
        wh1 wh1Var = rh1Var.f18827r;
        return (wh1Var == null || wh1Var.f21127c == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final kv1<wf0> m8700c(final di1 di1Var, final rh1 rh1Var, final JSONObject jSONObject) {
        kv1 kv1VarM8797d;
        kv1 kv1VarM6249s;
        JSONObject jSONObjectOptJSONObject;
        kv1 kv1VarM6231a;
        kv1<vk0> kv1Var;
        kv1 kv1VarM6250t;
        JSONArray jSONArray;
        kv1<vk0> kv1Var2;
        kv1 kv1VarM6231a2;
        kv1 kv1VarM6250t2;
        kv1<vk0> kv1VarM8652b = this.f21402d.m8652b();
        final oi0 oi0Var = this.f21401c;
        final kv1 kv1VarMo6691u0 = oi0Var.f17629a.mo6691u0(new Callable(oi0Var, di1Var, rh1Var, jSONObject) { // from class: c.n.b.d.j.a.mi0

            /* JADX INFO: renamed from: a */
            public final di1 f16764a;

            /* JADX INFO: renamed from: b */
            public final rh1 f16765b;

            /* JADX INFO: renamed from: c */
            public final JSONObject f16766c;

            {
                this.f16764a = di1Var;
                this.f16765b = rh1Var;
                this.f16766c = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws s01 {
                di1 di1Var2 = this.f16764a;
                rh1 rh1Var2 = this.f16765b;
                JSONObject jSONObject2 = this.f16766c;
                bg0 bg0Var = new bg0();
                int iOptInt = jSONObject2.optInt("template_id", -1);
                synchronized (bg0Var) {
                    bg0Var.f12601a = iOptInt;
                }
                String strOptString = jSONObject2.optString("custom_template_id");
                synchronized (bg0Var) {
                    bg0Var.f12617q = strOptString;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                synchronized (bg0Var) {
                    bg0Var.f12621u = strOptString2;
                }
                ii1 ii1Var = di1Var2.f13280a.f22289a;
                if (!ii1Var.f15194g.contains(Integer.toString(bg0Var.m6008r()))) {
                    throw new s01(1, outline.m1585g(32, "Invalid template ID: ", bg0Var.m6008r()));
                }
                if (bg0Var.m6008r() == 3) {
                    if (bg0Var.m6002h() == null) {
                        throw new s01(1, "No custom template id for custom template ad response.");
                    }
                    if (!ii1Var.f15195h.contains(bg0Var.m6002h())) {
                        throw new s01(1, "Unexpected custom template id in the response.");
                    }
                }
                double dOptDouble = jSONObject2.optDouble("rating", -1.0d);
                synchronized (bg0Var) {
                    bg0Var.f12614n = dOptDouble;
                }
                String strOptString3 = jSONObject2.optString("headline", null);
                if (rh1Var2.f18784H) {
                    C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                    String strM4742a = C2267h1.m4742a();
                    strOptString3 = outline.m1552C(new StringBuilder(String.valueOf(strM4742a).length() + 3 + String.valueOf(strOptString3).length()), strM4742a, " : ", strOptString3);
                }
                bg0Var.m6006p("headline", strOptString3);
                bg0Var.m6006p("body", jSONObject2.optString("body", null));
                bg0Var.m6006p("call_to_action", jSONObject2.optString("call_to_action", null));
                bg0Var.m6006p("store", jSONObject2.optString("store", null));
                bg0Var.m6006p("price", jSONObject2.optString("price", null));
                bg0Var.m6006p("advertiser", jSONObject2.optString("advertiser", null));
                return bg0Var;
            }
        });
        yi0 yi0Var = oi0Var.f17630b;
        Objects.requireNonNull(yi0Var);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        C3165j5 c3165j5 = yi0Var.f21896h;
        final kv1<List<BinderC3091h5>> kv1VarM8799a = yi0Var.m8799a(jSONArrayOptJSONArray, c3165j5.f15476g, c3165j5.f15478i);
        yi0 yi0Var2 = oi0Var.f17630b;
        Objects.requireNonNull(yi0Var2);
        final kv1<BinderC3091h5> kv1VarM8800b = yi0Var2.m8800b(jSONObject.optJSONObject("secondary_image"), yi0Var2.f21896h.f15476g);
        yi0 yi0Var3 = oi0Var.f17630b;
        Objects.requireNonNull(yi0Var3);
        final kv1<BinderC3091h5> kv1VarM8800b2 = yi0Var3.m8800b(jSONObject.optJSONObject("app_icon"), yi0Var3.f21896h.f15476g);
        final yi0 yi0Var4 = oi0Var.f17630b;
        Objects.requireNonNull(yi0Var4);
        final JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject2 == null) {
            kv1VarM8797d = cw0.m6231a(null);
        } else {
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("images");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("image");
            if (jSONArrayOptJSONArray2 == null && jSONObjectOptJSONObject3 != null) {
                jSONArrayOptJSONArray2 = new JSONArray();
                jSONArrayOptJSONArray2.put(jSONObjectOptJSONObject3);
            }
            kv1VarM8797d = yi0.m8797d(jSONObjectOptJSONObject2.optBoolean("require"), cw0.m6250t(yi0Var4.m8799a(jSONArrayOptJSONArray2, false, true), new cs1(yi0Var4, jSONObjectOptJSONObject2) { // from class: c.n.b.d.j.a.si0

                /* JADX INFO: renamed from: a */
                public final yi0 f19566a;

                /* JADX INFO: renamed from: b */
                public final JSONObject f19567b;

                {
                    this.f19566a = yi0Var4;
                    this.f19567b = jSONObjectOptJSONObject2;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                public final Object apply(Object obj) {
                    yi0 yi0Var5 = this.f19566a;
                    JSONObject jSONObject2 = this.f19567b;
                    List list = (List) obj;
                    Objects.requireNonNull(yi0Var5);
                    if (list == null || list.isEmpty()) {
                        return null;
                    }
                    String strOptString = jSONObject2.optString("text");
                    Integer numM8796c = yi0.m8796c(jSONObject2, "bg_color");
                    Integer numM8796c2 = yi0.m8796c(jSONObject2, "text_color");
                    int iOptInt = jSONObject2.optInt("text_size", -1);
                    boolean zOptBoolean = jSONObject2.optBoolean("allow_pub_rendering");
                    int iOptInt2 = jSONObject2.optInt("animation_ms", CloseCodes.NORMAL_CLOSURE);
                    return new BinderC2980e5(strOptString, list, numM8796c, numM8796c2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject2.optInt("presentation_ms", 4000) + iOptInt2, yi0Var5.f21896h.f15479j, zOptBoolean);
                }
            }, yi0Var4.f21895g));
        }
        yi0 yi0Var5 = oi0Var.f17630b;
        Objects.requireNonNull(yi0Var5);
        JSONObject jSONObjectM4780h = C2269i0.m4780h(jSONObject, "html_containers", "instream");
        if (jSONObjectM4780h == null) {
            final JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("video");
            if (jSONObjectOptJSONObject4 == null) {
                kv1VarM6249s = cw0.m6231a(null);
            } else if (TextUtils.isEmpty(jSONObjectOptJSONObject4.optString("vast_xml"))) {
                C2622l.m5226A3("Required field 'vast_xml' is missing");
                kv1VarM6249s = cw0.m6231a(null);
            } else {
                final rj0 rj0Var = yi0Var5.f21897i;
                Objects.requireNonNull(rj0Var);
                kv1VarM6249s = cw0.m6247q(cw0.m6248r(cw0.m6249s(cw0.m6249s(cw0.m6231a(null), new qu1(rj0Var) { // from class: c.n.b.d.j.a.ij0

                    /* JADX INFO: renamed from: a */
                    public final rj0 f15252a;

                    {
                        this.f15252a = rj0Var;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                    /* JADX INFO: renamed from: a */
                    public final kv1 mo4612a(Object obj) throws C3781zs {
                        rj0 rj0Var2 = this.f15252a;
                        InterfaceC3410ps interfaceC3410psM8802a = rj0Var2.f18851c.m8802a(jw2.m7416H(), null, null);
                        final C3110ho c3110ho = new C3110ho(interfaceC3410psM8802a);
                        rj0Var2.m8280a(interfaceC3410psM8802a);
                        C2967dt c2967dt = (C2967dt) interfaceC3410psM8802a;
                        ((C3670ws) c2967dt.mo6459O0()).f21332n = new InterfaceC2893bu(c3110ho) { // from class: c.n.b.d.j.a.jj0

                            /* JADX INFO: renamed from: a */
                            public final C3110ho f15602a;

                            {
                                this.f15602a = c3110ho;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2893bu
                            /* JADX INFO: renamed from: a */
                            public final void mo6099a() {
                                C3110ho c3110ho2 = this.f15602a;
                                c3110ho2.m7286a(c3110ho2.f14919g);
                            }
                        };
                        c2967dt.f13378f.loadUrl((String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14234N1));
                        return c3110ho;
                    }
                }, rj0Var.f18850b), new qu1(rj0Var, jSONObjectOptJSONObject4) { // from class: c.n.b.d.j.a.gj0

                    /* JADX INFO: renamed from: a */
                    public final rj0 f14595a;

                    /* JADX INFO: renamed from: b */
                    public final JSONObject f14596b;

                    {
                        this.f14595a = rj0Var;
                        this.f14596b = jSONObjectOptJSONObject4;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                    /* JADX INFO: renamed from: a */
                    public final kv1 mo4612a(Object obj) {
                        final rj0 rj0Var2 = this.f14595a;
                        JSONObject jSONObject2 = this.f14596b;
                        final InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) obj;
                        Objects.requireNonNull(rj0Var2);
                        final C3110ho c3110ho = new C3110ho(interfaceC3410ps);
                        if (rj0Var2.f18849a.f15189b != null) {
                            interfaceC3410ps.mo6437D0(new C3005eu(5, 0, 0));
                        } else {
                            interfaceC3410ps.mo6437D0(new C3005eu(4, 0, 0));
                        }
                        ((C3670ws) interfaceC3410ps.mo6459O0()).f21331m = new InterfaceC2856au(rj0Var2, interfaceC3410ps, c3110ho) { // from class: c.n.b.d.j.a.lj0

                            /* JADX INFO: renamed from: f */
                            public final rj0 f16372f;

                            /* JADX INFO: renamed from: g */
                            public final InterfaceC3410ps f16373g;

                            /* JADX INFO: renamed from: h */
                            public final C3110ho f16374h;

                            {
                                this.f16372f = rj0Var2;
                                this.f16373g = interfaceC3410ps;
                                this.f16374h = c3110ho;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2856au
                            /* JADX INFO: renamed from: B */
                            public final void mo4670B(boolean z) {
                                rj0 rj0Var3 = this.f16372f;
                                InterfaceC3410ps interfaceC3410ps2 = this.f16373g;
                                C3110ho c3110ho2 = this.f16374h;
                                if (rj0Var3.f18849a.f15188a != null && interfaceC3410ps2.mo6480g() != null) {
                                    interfaceC3410ps2.mo6480g().m7613G6(rj0Var3.f18849a.f15188a);
                                }
                                c3110ho2.m7286a(c3110ho2.f14919g);
                            }
                        };
                        interfaceC3410ps.mo6507u0("google.afma.nativeAds.renderVideo", jSONObject2);
                        return c3110ho;
                    }
                }, rj0Var.f18850b), ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14246P1)).intValue(), TimeUnit.SECONDS, yi0Var5.f21898j), Exception.class, new vi0(), C2962do.f13335f);
            }
        } else {
            final rj0 rj0Var2 = yi0Var5.f21897i;
            final String strOptString = jSONObjectM4780h.optString("base_url");
            final String strOptString2 = jSONObjectM4780h.optString("html");
            Objects.requireNonNull(rj0Var2);
            final kv1 kv1VarM6249s2 = cw0.m6249s(cw0.m6231a(null), new qu1(rj0Var2, strOptString, strOptString2) { // from class: c.n.b.d.j.a.hj0

                /* JADX INFO: renamed from: a */
                public final rj0 f14873a;

                /* JADX INFO: renamed from: b */
                public final String f14874b;

                /* JADX INFO: renamed from: c */
                public final String f14875c;

                {
                    this.f14873a = rj0Var2;
                    this.f14874b = strOptString;
                    this.f14875c = strOptString2;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                /* JADX INFO: renamed from: a */
                public final kv1 mo4612a(Object obj) throws C3781zs {
                    final rj0 rj0Var3 = this.f14873a;
                    String str = this.f14874b;
                    String str2 = this.f14875c;
                    final InterfaceC3410ps interfaceC3410psM8802a = rj0Var3.f18851c.m8802a(jw2.m7416H(), null, null);
                    final C3110ho c3110ho = new C3110ho(interfaceC3410psM8802a);
                    rj0Var3.m8280a(interfaceC3410psM8802a);
                    if (rj0Var3.f18849a.f15189b != null) {
                        ((C2967dt) interfaceC3410psM8802a).f13378f.mo6437D0(new C3005eu(5, 0, 0));
                    } else {
                        ((C2967dt) interfaceC3410psM8802a).f13378f.mo6437D0(new C3005eu(4, 0, 0));
                    }
                    C2967dt c2967dt = (C2967dt) interfaceC3410psM8802a;
                    ((C3670ws) c2967dt.mo6459O0()).f21331m = new InterfaceC2856au(rj0Var3, interfaceC3410psM8802a, c3110ho) { // from class: c.n.b.d.j.a.kj0

                        /* JADX INFO: renamed from: f */
                        public final rj0 f15961f;

                        /* JADX INFO: renamed from: g */
                        public final InterfaceC3410ps f15962g;

                        /* JADX INFO: renamed from: h */
                        public final C3110ho f15963h;

                        {
                            this.f15961f = rj0Var3;
                            this.f15962g = interfaceC3410psM8802a;
                            this.f15963h = c3110ho;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2856au
                        /* JADX INFO: renamed from: B */
                        public final void mo4670B(boolean z) {
                            rj0 rj0Var4 = this.f15961f;
                            InterfaceC3410ps interfaceC3410ps = this.f15962g;
                            C3110ho c3110ho2 = this.f15963h;
                            Objects.requireNonNull(rj0Var4);
                            if (!z) {
                                c3110ho2.m7287b(new s01(1, "Instream video Web View failed to load."));
                                return;
                            }
                            if (rj0Var4.f18849a.f15188a != null && interfaceC3410ps.mo6480g() != null) {
                                interfaceC3410ps.mo6480g().m7613G6(rj0Var4.f18849a.f15188a);
                            }
                            c3110ho2.m7286a(c3110ho2.f14919g);
                        }
                    };
                    c2967dt.f13378f.mo6455M0(str, str2, null);
                    return c3110ho;
                }
            }, rj0Var2.f18850b);
            kv1VarM6249s = cw0.m6249s(kv1VarM6249s2, new qu1(kv1VarM6249s2) { // from class: c.n.b.d.j.a.ui0

                /* JADX INFO: renamed from: a */
                public final kv1 f20356a;

                {
                    this.f20356a = kv1VarM6249s2;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                /* JADX INFO: renamed from: a */
                public final kv1 mo4612a(Object obj) throws s01 {
                    kv1 kv1Var3 = this.f20356a;
                    InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) obj;
                    if (interfaceC3410ps == null || interfaceC3410ps.mo6480g() == null) {
                        throw new s01(1, "Retrieve video view in instream ad response failed.");
                    }
                    return kv1Var3;
                }
            }, C2962do.f13335f);
        }
        final yi0 yi0Var6 = oi0Var.f17630b;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString3 = jSONObjectOptJSONObject.optString("omid_html");
            kv1VarM6231a = TextUtils.isEmpty(strOptString3) ? cw0.m6231a(null) : cw0.m6249s(cw0.m6231a(null), new qu1(yi0Var6, strOptString3) { // from class: c.n.b.d.j.a.ti0

                /* JADX INFO: renamed from: a */
                public final yi0 f19842a;

                /* JADX INFO: renamed from: b */
                public final String f19843b;

                {
                    this.f19842a = yi0Var6;
                    this.f19843b = strOptString3;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                /* JADX INFO: renamed from: a */
                public final kv1 mo4612a(Object obj) throws C3781zs {
                    yi0 yi0Var7 = this.f19842a;
                    String str = this.f19843b;
                    Objects.requireNonNull(yi0Var7);
                    C2855at c2855at = C2330u.f10884a.f10890e;
                    InterfaceC3410ps interfaceC3410psM5850a = C2855at.m5850a(yi0Var7.f21889a, C3005eu.m6687b(), "native-omid", false, false, yi0Var7.f21891c, null, yi0Var7.f21892d, null, null, yi0Var7.f21893e, yi0Var7.f21894f, null, null);
                    final C3110ho c3110ho = new C3110ho(interfaceC3410psM5850a);
                    C2967dt c2967dt = (C2967dt) interfaceC3410psM5850a;
                    ((C3670ws) c2967dt.mo6459O0()).f21331m = new InterfaceC2856au(c3110ho) { // from class: c.n.b.d.j.a.xi0

                        /* JADX INFO: renamed from: f */
                        public final C3110ho f21549f;

                        {
                            this.f21549f = c3110ho;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2856au
                        /* JADX INFO: renamed from: B */
                        public final void mo4670B(boolean z) {
                            C3110ho c3110ho2 = this.f21549f;
                            c3110ho2.m7286a(c3110ho2.f14919g);
                        }
                    };
                    c2967dt.f13378f.loadData(str, "text/html", Utf8Charset.NAME);
                    return c3110ho;
                }
            }, C2962do.f13334e);
        } else {
            kv1VarM6231a = cw0.m6231a(null);
        }
        dj0 dj0Var = oi0Var.f17631c;
        Objects.requireNonNull(dj0Var);
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray3 == null) {
            kv1Var = kv1VarM8652b;
            kv1VarM6250t = cw0.m6231a(Collections.emptyList());
        } else {
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray3.length();
            int i = 0;
            while (i < length) {
                int i2 = length;
                JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray3.optJSONObject(i);
                if (jSONObjectOptJSONObject5 == null) {
                    kv1VarM6231a2 = cw0.m6231a(null);
                    kv1Var2 = kv1VarM8652b;
                    jSONArray = jSONArrayOptJSONArray3;
                } else {
                    jSONArray = jSONArrayOptJSONArray3;
                    final String strOptString4 = jSONObjectOptJSONObject5.optString("name");
                    if (strOptString4 == null) {
                        kv1Var2 = kv1VarM8652b;
                        kv1VarM6231a2 = cw0.m6231a(null);
                    } else {
                        String strOptString5 = jSONObjectOptJSONObject5.optString("type");
                        kv1Var2 = kv1VarM8652b;
                        if ("string".equals(strOptString5)) {
                            kv1VarM6250t2 = cw0.m6231a(new cj0(strOptString4, jSONObjectOptJSONObject5.optString("string_value")));
                        } else if ("image".equals(strOptString5)) {
                            yi0 yi0Var7 = dj0Var.f13285b;
                            Objects.requireNonNull(yi0Var7);
                            kv1VarM6250t2 = cw0.m6250t(yi0Var7.m8800b(jSONObjectOptJSONObject5.optJSONObject("image_value"), yi0Var7.f21896h.f15476g), new cs1(strOptString4) { // from class: c.n.b.d.j.a.bj0

                                /* JADX INFO: renamed from: a */
                                public final String f12706a;

                                {
                                    this.f12706a = strOptString4;
                                }

                                @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                                public final Object apply(Object obj) {
                                    return new cj0(this.f12706a, (BinderC3091h5) obj);
                                }
                            }, dj0Var.f13284a);
                        } else {
                            kv1VarM6231a2 = cw0.m6231a(null);
                        }
                        kv1VarM6231a2 = kv1VarM6250t2;
                    }
                }
                arrayList.add(kv1VarM6231a2);
                i++;
                length = i2;
                jSONArrayOptJSONArray3 = jSONArray;
                kv1VarM8652b = kv1Var2;
            }
            kv1Var = kv1VarM8652b;
            ns1<Object> ns1Var = ts1.f19979g;
            kv1VarM6250t = cw0.m6250t(new ru1(ts1.m8449u(arrayList)), aj0.f12184a, dj0Var.f13284a);
        }
        ns1<Object> ns1Var2 = ts1.f19979g;
        Object[] objArr = (Object[]) new kv1[]{kv1VarMo6691u0, kv1VarM8799a, kv1VarM8800b, kv1VarM8800b2, kv1VarM8797d, kv1VarM6249s, kv1VarM6231a, kv1VarM6250t}.clone();
        int length2 = objArr.length;
        C2622l.m5421q1(objArr, length2);
        final kv1 kv1Var3 = kv1VarM8797d;
        final kv1 kv1Var4 = kv1VarM6249s;
        final kv1 kv1Var5 = kv1VarM6231a;
        final kv1 kv1Var6 = kv1VarM6250t;
        final vu1 vu1Var = new vu1(ts1.m8450v(objArr, length2), false, oi0Var.f17629a, new Callable(oi0Var, kv1VarMo6691u0, kv1VarM8799a, kv1VarM8800b2, kv1VarM8800b, kv1Var3, jSONObject, kv1Var4, kv1Var5, kv1Var6) { // from class: c.n.b.d.j.a.ni0

            /* JADX INFO: renamed from: a */
            public final kv1 f17110a;

            /* JADX INFO: renamed from: b */
            public final kv1 f17111b;

            /* JADX INFO: renamed from: c */
            public final kv1 f17112c;

            /* JADX INFO: renamed from: d */
            public final kv1 f17113d;

            /* JADX INFO: renamed from: e */
            public final kv1 f17114e;

            /* JADX INFO: renamed from: f */
            public final JSONObject f17115f;

            /* JADX INFO: renamed from: g */
            public final kv1 f17116g;

            /* JADX INFO: renamed from: h */
            public final kv1 f17117h;

            /* JADX INFO: renamed from: i */
            public final kv1 f17118i;

            {
                this.f17110a = kv1VarMo6691u0;
                this.f17111b = kv1VarM8799a;
                this.f17112c = kv1VarM8800b2;
                this.f17113d = kv1VarM8800b;
                this.f17114e = kv1Var3;
                this.f17115f = jSONObject;
                this.f17116g = kv1Var4;
                this.f17117h = kv1Var5;
                this.f17118i = kv1Var6;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArrayOptJSONArray4;
                ts1<Object> ts1VarM8449u;
                JSONObject jSONObjectOptJSONObject6;
                kv1 kv1Var7 = this.f17110a;
                kv1 kv1Var8 = this.f17111b;
                kv1 kv1Var9 = this.f17112c;
                kv1 kv1Var10 = this.f17113d;
                kv1 kv1Var11 = this.f17114e;
                JSONObject jSONObject2 = this.f17115f;
                kv1 kv1Var12 = this.f17116g;
                kv1 kv1Var13 = this.f17117h;
                kv1 kv1Var14 = this.f17118i;
                bg0 bg0Var = (bg0) kv1Var7.get();
                List<?> list = (List) kv1Var8.get();
                synchronized (bg0Var) {
                    bg0Var.f12605e = list;
                }
                InterfaceC3610v5 interfaceC3610v5 = (InterfaceC3610v5) kv1Var9.get();
                synchronized (bg0Var) {
                    bg0Var.f12615o = interfaceC3610v5;
                }
                InterfaceC3610v5 interfaceC3610v6 = (InterfaceC3610v5) kv1Var10.get();
                synchronized (bg0Var) {
                    bg0Var.f12616p = interfaceC3610v6;
                }
                InterfaceC3350o5 interfaceC3350o5 = (InterfaceC3350o5) kv1Var11.get();
                synchronized (bg0Var) {
                    bg0Var.f12603c = interfaceC3350o5;
                }
                JSONObject jSONObjectOptJSONObject7 = jSONObject2.optJSONObject("mute");
                if (jSONObjectOptJSONObject7 == null || (jSONArrayOptJSONArray4 = jSONObjectOptJSONObject7.optJSONArray("reasons")) == null || jSONArrayOptJSONArray4.length() <= 0) {
                    ns1<Object> ns1Var3 = ts1.f19979g;
                    ts1VarM8449u = bt1.f12860h;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray4.length(); i3++) {
                        BinderC3606v1 binderC3606v1M8798e = yi0.m8798e(jSONArrayOptJSONArray4.optJSONObject(i3));
                        if (binderC3606v1M8798e != null) {
                            arrayList2.add(binderC3606v1M8798e);
                        }
                    }
                    ts1VarM8449u = ts1.m8449u(arrayList2);
                }
                synchronized (bg0Var) {
                    bg0Var.f12606f = ts1VarM8449u;
                }
                JSONObject jSONObjectOptJSONObject8 = jSONObject2.optJSONObject("mute");
                BinderC3606v1 binderC3606v1M8798e2 = null;
                if (jSONObjectOptJSONObject8 != null && (jSONObjectOptJSONObject6 = jSONObjectOptJSONObject8.optJSONObject("default_reason")) != null) {
                    binderC3606v1M8798e2 = yi0.m8798e(jSONObjectOptJSONObject6);
                }
                synchronized (bg0Var) {
                    bg0Var.f12607g = binderC3606v1M8798e2;
                }
                InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) kv1Var12.get();
                if (interfaceC3410ps != null) {
                    synchronized (bg0Var) {
                        bg0Var.f12609i = interfaceC3410ps;
                    }
                    View viewMo6468X = interfaceC3410ps.mo6468X();
                    synchronized (bg0Var) {
                        bg0Var.f12612l = viewMo6468X;
                    }
                    BinderC3263lt binderC3263ltMo6480g = interfaceC3410ps.mo6480g();
                    synchronized (bg0Var) {
                        bg0Var.f12602b = binderC3263ltMo6480g;
                    }
                }
                InterfaceC3410ps interfaceC3410ps2 = (InterfaceC3410ps) kv1Var13.get();
                if (interfaceC3410ps2 != null) {
                    synchronized (bg0Var) {
                        bg0Var.f12610j = interfaceC3410ps2;
                    }
                }
                for (cj0 cj0Var : (List) kv1Var14.get()) {
                    if (cj0Var.f13037a != 1) {
                        String str = cj0Var.f13038b;
                        BinderC3091h5 binderC3091h5 = cj0Var.f13040d;
                        synchronized (bg0Var) {
                            if (binderC3091h5 == null) {
                                bg0Var.f12618r.remove(str);
                            } else {
                                bg0Var.f12618r.put(str, binderC3091h5);
                            }
                        }
                    } else {
                        bg0Var.m6006p(cj0Var.f13038b, cj0Var.f13039c);
                    }
                }
                return bg0Var;
            }
        });
        final kv1<vk0> kv1Var7 = kv1Var;
        return cw0.m6251u(kv1Var, vu1Var).m6889a(new Callable(this, vu1Var, kv1Var7, di1Var, rh1Var, jSONObject) { // from class: c.n.b.d.j.a.vz0

            /* JADX INFO: renamed from: a */
            public final wz0 f20965a;

            /* JADX INFO: renamed from: b */
            public final kv1 f20966b;

            /* JADX INFO: renamed from: c */
            public final kv1 f20967c;

            /* JADX INFO: renamed from: d */
            public final di1 f20968d;

            /* JADX INFO: renamed from: e */
            public final rh1 f20969e;

            /* JADX INFO: renamed from: f */
            public final JSONObject f20970f;

            {
                this.f20965a = this;
                this.f20966b = vu1Var;
                this.f20967c = kv1Var7;
                this.f20968d = di1Var;
                this.f20969e = rh1Var;
                this.f20970f = jSONObject;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                wz0 wz0Var = this.f20965a;
                kv1 kv1Var8 = this.f20966b;
                kv1 kv1Var9 = this.f20967c;
                di1 di1Var2 = this.f20968d;
                rh1 rh1Var2 = this.f20969e;
                JSONObject jSONObject2 = this.f20970f;
                Objects.requireNonNull(wz0Var);
                bg0 bg0Var = (bg0) kv1Var8.get();
                vk0 vk0Var = (vk0) kv1Var9.get();
                cg0 cg0VarMo7939c = wz0Var.f21399a.mo7939c(new c30(di1Var2, rh1Var2, null), new ng0(bg0Var), new cf0(jSONObject2, vk0Var));
                ik0 ik0VarMo6173i = cg0VarMo7939c.mo6173i();
                if (ik0VarMo6173i.f15256a != null) {
                    ik0VarMo6173i.f15257b.m8562b("/nativeAdCustomClick", ik0VarMo6173i);
                }
                sk0 sk0VarMo6174j = cg0VarMo7939c.mo6174j();
                Objects.requireNonNull(sk0VarMo6174j);
                qk0 qk0Var = vk0Var.f20811a;
                g60 g60Var = sk0VarMo6174j.f19596a;
                a80 a80Var = sk0VarMo6174j.f19598c;
                m80 m80Var = sk0VarMo6174j.f19599d;
                t90 t90Var = sk0VarMo6174j.f19600e;
                o70 o70Var = sk0VarMo6174j.f19597b;
                o70Var.getClass();
                InterfaceC2242y interfaceC2242y = new InterfaceC2242y(o70Var) { // from class: c.n.b.d.j.a.rk0

                    /* JADX INFO: renamed from: f */
                    public final o70 f18912f;

                    {
                        this.f18912f = o70Var;
                    }

                    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2242y
                    /* JADX INFO: renamed from: d */
                    public final void mo4706d() {
                        this.f18912f.m7108A0(j70.f15502a);
                    }
                };
                synchronized (qk0Var) {
                    qk0Var.f18364f = g60Var;
                    qk0Var.f18365g = a80Var;
                    qk0Var.f18366h = m80Var;
                    qk0Var.f18367i = t90Var;
                    qk0Var.f18368j = interfaceC2242y;
                }
                rh1 rh1Var3 = sk0VarMo6174j.f19601f;
                uh1 uh1Var = sk0VarMo6174j.f19602g;
                synchronized (vk0Var) {
                    kv1<InterfaceC3410ps> kv1Var10 = vk0Var.f20822l;
                    if (kv1Var10 != null) {
                        pk0 pk0Var = new pk0(rh1Var3, uh1Var);
                        kv1Var10.mo6230f(new ev1(kv1Var10, pk0Var), vk0Var.f20816f);
                    }
                }
                qj0 qj0VarMo6175k = cg0VarMo7939c.mo6175k();
                InterfaceC3410ps interfaceC3410psM6003i = bg0Var.m6003i();
                Objects.requireNonNull(qj0VarMo6175k);
                if (interfaceC3410psM6003i != null) {
                    qj0VarMo6175k.f18313c.m6351B0(interfaceC3410psM6003i.mo6468X());
                    qj0VarMo6175k.f18313c.m7109u0(new ip2(interfaceC3410psM6003i) { // from class: c.n.b.d.j.a.mj0

                        /* JADX INFO: renamed from: f */
                        public final InterfaceC3410ps f16774f;

                        {
                            this.f16774f = interfaceC3410psM6003i;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.ip2
                        /* JADX INFO: renamed from: q0 */
                        public final void mo6352q0(hp2 hp2Var) {
                            InterfaceC2931cu interfaceC2931cuMo6459O0 = this.f16774f.mo6459O0();
                            Rect rect = hp2Var.f14928d;
                            ((C3670ws) interfaceC2931cuMo6459O0).m8680i(rect.left, rect.top, false);
                        }
                    }, qj0VarMo6175k.f18311a);
                    qj0VarMo6175k.f18313c.m7109u0(new ip2(interfaceC3410psM6003i) { // from class: c.n.b.d.j.a.nj0

                        /* JADX INFO: renamed from: f */
                        public final InterfaceC3410ps f17127f;

                        {
                            this.f17127f = interfaceC3410psM6003i;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.ip2
                        /* JADX INFO: renamed from: q0 */
                        public final void mo6352q0(hp2 hp2Var) {
                            InterfaceC3410ps interfaceC3410ps = this.f17127f;
                            HashMap map = new HashMap();
                            map.put("isVisible", true != hp2Var.f14934j ? "0" : "1");
                            interfaceC3410ps.mo6501r0("onAdVisibilityChanged", map);
                        }
                    }, qj0VarMo6175k.f18311a);
                    qj0VarMo6175k.f18313c.m7109u0(qj0VarMo6175k.f18312b, qj0VarMo6175k.f18311a);
                    qj0VarMo6175k.f18312b.f16234f = interfaceC3410psM6003i;
                    interfaceC3410psM6003i.mo6479f0("/trackActiveViewUnit", new InterfaceC3464r8(qj0VarMo6175k) { // from class: c.n.b.d.j.a.oj0

                        /* JADX INFO: renamed from: a */
                        public final qj0 f17658a;

                        {
                            this.f17658a = qj0VarMo6175k;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
                        /* JADX INFO: renamed from: a */
                        public final void mo6148a(Object obj, Map map) {
                            C3232kz c3232kz = this.f17658a.f18312b;
                            c3232kz.f16238j = true;
                            c3232kz.m7566a();
                        }
                    });
                    interfaceC3410psM6003i.mo6479f0("/untrackActiveViewUnit", new InterfaceC3464r8(qj0VarMo6175k) { // from class: c.n.b.d.j.a.pj0

                        /* JADX INFO: renamed from: a */
                        public final qj0 f17995a;

                        {
                            this.f17995a = qj0VarMo6175k;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
                        /* JADX INFO: renamed from: a */
                        public final void mo6148a(Object obj, Map map) {
                            this.f17995a.f18312b.f16238j = false;
                        }
                    });
                }
                return cg0VarMo7939c.mo6798h();
            }
        }, this.f21400b);
    }
}
