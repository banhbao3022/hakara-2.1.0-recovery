package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class q30<T> {

    /* JADX INFO: renamed from: a */
    public final ws0 f18176a;

    /* JADX INFO: renamed from: b */
    public final ii1 f18177b;

    /* JADX INFO: renamed from: c */
    public final yl1 f18178c;

    /* JADX INFO: renamed from: d */
    public final C3675wx f18179d;

    /* JADX INFO: renamed from: e */
    public final u01<T> f18180e;

    /* JADX INFO: renamed from: f */
    public final ba0 f18181f;

    /* JADX INFO: renamed from: g */
    public final di1 f18182g;

    /* JADX INFO: renamed from: h */
    public final yt0 f18183h;

    /* JADX INFO: renamed from: i */
    public final o50 f18184i;

    /* JADX INFO: renamed from: j */
    public final Executor f18185j;

    /* JADX INFO: renamed from: k */
    public final mt0 f18186k;

    /* JADX INFO: renamed from: l */
    public final hx0 f18187l;

    public q30(ws0 ws0Var, ii1 ii1Var, yl1 yl1Var, C3675wx c3675wx, u01<T> u01Var, ba0 ba0Var, di1 di1Var, yt0 yt0Var, o50 o50Var, Executor executor, mt0 mt0Var, hx0 hx0Var) {
        this.f18176a = ws0Var;
        this.f18177b = ii1Var;
        this.f18178c = yl1Var;
        this.f18179d = c3675wx;
        this.f18180e = u01Var;
        this.f18181f = ba0Var;
        this.f18182g = di1Var;
        this.f18183h = yt0Var;
        this.f18184i = o50Var;
        this.f18185j = executor;
        this.f18186k = mt0Var;
        this.f18187l = hx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /* JADX INFO: renamed from: a */
    public final kv1<di1> m8188a(kv1<C3437qi> kv1Var) {
        kv1 kv1VarM6249s;
        rl1 rl1Var = rl1.SERVER_TRANSACTION;
        di1 di1Var = this.f18182g;
        if (di1Var != null) {
            return C2622l.m5435t0(cw0.m6231a(di1Var), rl1Var, this.f18178c).m8042f();
        }
        C2330u c2330u = C2330u.f10884a;
        hr2 hr2Var = c2330u.f10895j;
        Objects.requireNonNull(hr2Var);
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14348f2;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            synchronized (hr2Var.f14949b) {
                hr2Var.m7161d();
                xr1 xr1Var = C2267h1.f10713a;
                xr1Var.removeCallbacks(hr2Var.f14948a);
                xr1Var.postDelayed(hr2Var.f14948a, ((Long) c2862b.f12496d.m6596a(C3052g3.f14355g2)).longValue());
            }
        }
        if (this.f18177b.f15191d.f13731x == null) {
            ol1<I> ol1VarM8125a = this.f18178c.m8125a(rl1Var, kv1Var);
            final mt0 mt0Var = this.f18186k;
            return ol1VarM8125a.m8038b(new qu1(mt0Var) { // from class: c.n.b.d.j.a.l30

                /* JADX INFO: renamed from: a */
                public final mt0 f16268a;

                {
                    this.f16268a = mt0Var;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                /* JADX INFO: renamed from: a */
                public final kv1 mo4612a(Object obj) {
                    return this.f16268a.mo7730a((C3437qi) obj);
                }
            }, ol1VarM8125a.f17674f.f18025b).m8042f();
        }
        yl1 yl1Var = this.f18178c;
        final ws0 ws0Var = this.f18176a;
        Objects.requireNonNull(ws0Var);
        C3468rc c3468rcM7228b = c2330u.f10902q.m7228b(ws0Var.f21345a, ws0Var.f21346b);
        C3320nc<JSONObject> c3320nc = C3357oc.f17593b;
        final C3617vc c3617vc = new C3617vc(c3468rcM7228b.f18740c, "google.afma.response.normalize", c3320nc, c3320nc);
        final wv2 wv2Var = ws0Var.f21347c.f15191d.f13731x;
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14448t4)).booleanValue()) {
            if (wv2Var != null) {
                try {
                    JSONObject jSONObject = new JSONObject(wv2Var.f21379f);
                    JSONObject jSONObject2 = new JSONObject(wv2Var.f21380g);
                    String strOptString = jSONObject.optString("request_id", "");
                    String strOptString2 = jSONObject2.optString("request_id", "");
                    if (!TextUtils.isEmpty(strOptString2) && strOptString.equals(strOptString2)) {
                        kv1VarM6249s = cw0.m6249s(cw0.m6249s(cw0.m6249s(cw0.m6231a(""), new qu1(ws0Var, wv2Var) { // from class: c.n.b.d.j.a.ts0

                            /* JADX INFO: renamed from: a */
                            public final wv2 f19978a;

                            {
                                this.f19978a = wv2Var;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                            /* JADX INFO: renamed from: a */
                            public final kv1 mo4612a(Object obj) throws JSONException {
                                wv2 wv2Var2 = this.f19978a;
                                String str = wv2Var2.f21379f;
                                String str2 = wv2Var2.f21380g;
                                JSONObject jSONObject3 = new JSONObject();
                                JSONObject jSONObject4 = new JSONObject();
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("headers", new JSONObject());
                                jSONObject5.put("body", str);
                                jSONObject4.put("base_url", "");
                                jSONObject4.put("signals", new JSONObject(str2));
                                jSONObject3.put("request", jSONObject4);
                                jSONObject3.put("response", jSONObject5);
                                jSONObject3.put("flags", new JSONObject());
                                return cw0.m6231a(jSONObject3);
                            }
                        }, ws0Var.f21348d), new qu1(c3617vc) { // from class: c.n.b.d.j.a.us0

                            /* JADX INFO: renamed from: a */
                            public final InterfaceC3098hc f20423a;

                            {
                                this.f20423a = c3617vc;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                            /* JADX INFO: renamed from: a */
                            public final kv1 mo4612a(Object obj) {
                                return ((C3617vc) this.f20423a).m8544b((JSONObject) obj);
                            }
                        }, ws0Var.f21348d), new qu1(ws0Var) { // from class: c.n.b.d.j.a.vs0

                            /* JADX INFO: renamed from: a */
                            public final ws0 f20922a;

                            {
                                this.f20922a = ws0Var;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                            /* JADX INFO: renamed from: a */
                            public final kv1 mo4612a(Object obj) {
                                return cw0.m6231a(new di1(new zh1(this.f20922a.f21347c), bi1.m6015a(new StringReader(((JSONObject) obj).toString()))));
                            }
                        }, ws0Var.f21348d);
                    }
                } catch (JSONException unused) {
                }
            }
            kv1VarM6249s = new gv1(new s01(14, "Mismatch request IDs."));
        } else {
            kv1VarM6249s = cw0.m6249s(cw0.m6249s(cw0.m6249s(cw0.m6231a(""), new qu1(ws0Var, wv2Var) { // from class: c.n.b.d.j.a.ts0

                /* JADX INFO: renamed from: a */
                public final wv2 f19978a;

                {
                    this.f19978a = wv2Var;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                /* JADX INFO: renamed from: a */
                public final kv1 mo4612a(Object obj) throws JSONException {
                    wv2 wv2Var2 = this.f19978a;
                    String str = wv2Var2.f21379f;
                    String str2 = wv2Var2.f21380g;
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("headers", new JSONObject());
                    jSONObject5.put("body", str);
                    jSONObject4.put("base_url", "");
                    jSONObject4.put("signals", new JSONObject(str2));
                    jSONObject3.put("request", jSONObject4);
                    jSONObject3.put("response", jSONObject5);
                    jSONObject3.put("flags", new JSONObject());
                    return cw0.m6231a(jSONObject3);
                }
            }, ws0Var.f21348d), new qu1(c3617vc) { // from class: c.n.b.d.j.a.us0

                /* JADX INFO: renamed from: a */
                public final InterfaceC3098hc f20423a;

                {
                    this.f20423a = c3617vc;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                /* JADX INFO: renamed from: a */
                public final kv1 mo4612a(Object obj) {
                    return ((C3617vc) this.f20423a).m8544b((JSONObject) obj);
                }
            }, ws0Var.f21348d), new qu1(ws0Var) { // from class: c.n.b.d.j.a.vs0

                /* JADX INFO: renamed from: a */
                public final ws0 f20922a;

                {
                    this.f20922a = ws0Var;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                /* JADX INFO: renamed from: a */
                public final kv1 mo4612a(Object obj) {
                    return cw0.m6231a(new di1(new zh1(this.f20922a.f21347c), bi1.m6015a(new StringReader(((JSONObject) obj).toString()))));
                }
            }, ws0Var.f21348d);
        }
        return C2622l.m5435t0(kv1VarM6249s, rl1Var, yl1Var).m8042f();
    }

    /* JADX INFO: renamed from: b */
    public final kv1<di1> m8189b() {
        return m8188a(this.f18184i.m7964b());
    }

    /* JADX INFO: renamed from: c */
    public final kv1<T> m8190c(kv1<di1> kv1Var) {
        ol1<I> ol1VarM8125a = this.f18178c.m8125a(rl1.RENDERER, kv1Var);
        ol1 ol1VarM8037a = ol1VarM8125a.m8038b(new jl1(new dl1(this) { // from class: c.n.b.d.j.a.m30

            /* JADX INFO: renamed from: a */
            public final q30 f16674a;

            {
                this.f16674a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.dl1
            /* JADX INFO: renamed from: a */
            public final Object mo5679a(Object obj) {
                di1 di1Var = (di1) obj;
                C3675wx c3675wx = this.f16674a.f18179d;
                Objects.requireNonNull(c3675wx);
                for (ai1 ai1Var : di1Var.f13281b.f12696c) {
                    if (c3675wx.f21385a.containsKey(ai1Var.f12176a)) {
                        c3675wx.f21385a.get(ai1Var.f12176a).mo7039u(ai1Var.f12177b);
                    } else if (c3675wx.f21386b.containsKey(ai1Var.f12176a)) {
                        InterfaceC3712xx interfaceC3712xx = c3675wx.f21386b.get(ai1Var.f12176a);
                        JSONObject jSONObject = ai1Var.f12177b;
                        HashMap map = new HashMap();
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            String strOptString = jSONObject.optString(next);
                            if (strOptString != null) {
                                map.put(next, strOptString);
                            }
                        }
                        interfaceC3712xx.mo6122a(map);
                    }
                }
                return di1Var;
            }
        }), ol1VarM8125a.f17674f.f18025b).m8037a(this.f18180e);
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14370i3;
        C2862b c2862b = C2862b.f12493a;
        if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            ol1VarM8037a = ol1VarM8037a.m8041e(((Integer) c2862b.f12496d.m6596a(C3052g3.f14377j3)).intValue(), TimeUnit.SECONDS);
        }
        return ol1VarM8037a.m8042f();
    }
}
