package p007c.p190n.p194b.p266d.p327k.p329b;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p267a.p280x.C2211a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.C4118ca;
import p007c.p190n.p194b.p266d.p314j.p325k.C4145e9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4327r9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4369u9;

/* JADX INFO: renamed from: c.n.b.d.k.b.e6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4500e6 extends AbstractC4475c5 {

    /* JADX INFO: renamed from: c */
    public C4453a7 f23851c;

    /* JADX INFO: renamed from: d */
    public InterfaceC4730y5 f23852d;

    /* JADX INFO: renamed from: e */
    public final Set<InterfaceC4464b6> f23853e;

    /* JADX INFO: renamed from: f */
    public boolean f23854f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference<String> f23855g;

    /* JADX INFO: renamed from: h */
    public final Object f23856h;

    /* JADX INFO: renamed from: i */
    public C4481d f23857i;

    /* JADX INFO: renamed from: j */
    public int f23858j;

    /* JADX INFO: renamed from: k */
    public final AtomicLong f23859k;

    /* JADX INFO: renamed from: l */
    public long f23860l;

    /* JADX INFO: renamed from: m */
    public int f23861m;

    /* JADX INFO: renamed from: n */
    public final C4492da f23862n;

    /* JADX INFO: renamed from: o */
    public boolean f23863o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC4745z9 f23864p;

    public C4500e6(C4707w4 c4707w4) {
        super(c4707w4);
        this.f23853e = new CopyOnWriteArraySet();
        this.f23856h = new Object();
        this.f23863o = true;
        this.f23864p = new C4665s6(this);
        this.f23855g = new AtomicReference<>();
        this.f23857i = new C4481d(null, null);
        this.f23858j = 100;
        this.f23860l = -1L;
        this.f23861m = 100;
        this.f23859k = new AtomicLong(0L);
        this.f23862n = new C4492da(c4707w4);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005f  */
    /* JADX INFO: renamed from: C */
    public static void m10510C(C4500e6 c4500e6, C4481d c4481d, int i, long j2, boolean z, boolean z2) {
        boolean z3;
        c4500e6.mo10381b();
        c4500e6.m10479t();
        if (j2 <= c4500e6.f23860l && C4481d.m10486e(c4500e6.f23861m, i)) {
            c4500e6.mo10684l().f24424l.m10812b("Dropped out-of-date consent setting, proposed settings", c4481d);
            return;
        }
        C4510f4 c4510f4M10818g = c4500e6.m10818g();
        Objects.requireNonNull(c4510f4M10818g);
        if (C4145e9.m9566a() && c4510f4M10818g.f24476a.f24534h.m10417k(C4647r.f24311H0)) {
            c4510f4M10818g.mo10381b();
            if (c4510f4M10818g.m10535t(i)) {
                SharedPreferences.Editor editorEdit = c4510f4M10818g.m10538w().edit();
                editorEdit.putString("consent_settings", c4481d.m10489d());
                editorEdit.putInt("consent_source", i);
                editorEdit.apply();
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (!z3) {
            c4500e6.mo10684l().f24424l.m10812b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        c4500e6.f23860l = j2;
        c4500e6.f23861m = i;
        C4677t7 c4677t7M10385p = c4500e6.m10385p();
        Objects.requireNonNull(c4677t7M10385p);
        if (C4145e9.m9566a() && c4677t7M10385p.f24476a.f24534h.m10417k(C4647r.f24311H0)) {
            c4677t7M10385p.mo10381b();
            c4677t7M10385p.m10479t();
            if (z) {
                c4677t7M10385p.m10387r().m10709y();
            }
            if (c4677t7M10385p.m10771E()) {
                c4677t7M10385p.m10778z(new RunnableC4538h8(c4677t7M10385p, c4677t7M10385p.m10775I(false)));
            }
        }
        if (z2) {
            c4500e6.m10385p().m10767A(new AtomicReference<>());
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m10511A(C4481d c4481d, int i, long j2) {
        boolean z;
        C4481d c4481d2;
        boolean z2;
        boolean zM10490f;
        if (C4145e9.m9566a() && this.f24476a.f24534h.m10417k(C4647r.f24311H0)) {
            m10479t();
            if (!(this.f24476a.f24534h.m10417k(C4647r.f24313I0) && i == 20) && c4481d.f23820b == null && c4481d.f23821c == null) {
                mo10684l().f24423k.m10811a("Discarding empty consent settings");
                return;
            }
            synchronized (this.f23856h) {
                z = false;
                if (C4481d.m10486e(i, this.f23858j)) {
                    zM10490f = c4481d.m10490f(this.f23857i);
                    if (c4481d.m10493k() && !this.f23857i.m10493k()) {
                        z = true;
                    }
                    C4481d c4481d3 = this.f23857i;
                    Boolean bool = c4481d.f23820b;
                    if (bool == null) {
                        bool = c4481d3.f23820b;
                    }
                    Boolean bool2 = c4481d.f23821c;
                    if (bool2 == null) {
                        bool2 = c4481d3.f23821c;
                    }
                    C4481d c4481d4 = new C4481d(bool, bool2);
                    this.f23857i = c4481d4;
                    this.f23858j = i;
                    z2 = z;
                    c4481d2 = c4481d4;
                    z = true;
                } else {
                    c4481d2 = c4481d;
                    z2 = false;
                    zM10490f = false;
                }
            }
            if (!z) {
                mo10684l().f24424l.m10812b("Ignoring lower-priority consent settings, proposed settings", c4481d2);
                return;
            }
            long andIncrement = this.f23859k.getAndIncrement();
            if (zM10490f) {
                this.f23855g.set(null);
                mo10686n().m10759w(new RunnableC4742z6(this, c4481d2, j2, i, andIncrement, z2));
            } else if (this.f24476a.f24534h.m10417k(C4647r.f24313I0) && (i == 40 || i == 20)) {
                mo10686n().m10759w(new RunnableC4731y6(this, c4481d2, i, andIncrement, z2));
            } else {
                mo10686n().m10758v(new RunnableC4465b7(this, c4481d2, i, andIncrement, z2));
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m10512B(InterfaceC4730y5 interfaceC4730y5) {
        InterfaceC4730y5 interfaceC4730y6;
        mo10381b();
        m10479t();
        if (interfaceC4730y5 != null && interfaceC4730y5 != (interfaceC4730y6 = this.f23852d)) {
            C2622l.m5389k(interfaceC4730y6 == null, "EventInterceptor already set.");
        }
        this.f23852d = interfaceC4730y5;
    }

    /* JADX INFO: renamed from: D */
    public final void m10513D(Boolean bool, boolean z) {
        mo10381b();
        m10479t();
        mo10684l().f24425m.m10812b("Setting app measurement enabled (FE)", bool);
        m10818g().m10534s(bool);
        if (C4145e9.m9566a() && this.f24476a.f24534h.m10417k(C4647r.f24311H0) && z) {
            C4510f4 c4510f4M10818g = m10818g();
            Objects.requireNonNull(c4510f4M10818g);
            if (C4145e9.m9566a() && c4510f4M10818g.f24476a.f24534h.m10417k(C4647r.f24311H0)) {
                c4510f4M10818g.mo10381b();
                SharedPreferences.Editor editorEdit = c4510f4M10818g.m10538w().edit();
                if (bool != null) {
                    editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
                } else {
                    editorEdit.remove("measurement_enabled_from_api");
                }
                editorEdit.apply();
            }
        }
        if (C4145e9.m9566a() && this.f24476a.f24534h.m10417k(C4647r.f24311H0) && !this.f24476a.m10830f() && bool.booleanValue()) {
            return;
        }
        m10525P();
    }

    /* JADX INFO: renamed from: E */
    public final void m10514E(String str, String str2, long j2, Bundle bundle) {
        mo10381b();
        m10515F(str, str2, j2, bundle, true, this.f23852d == null || C4723x9.m10865r0(str2), false, null);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0152  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0148, code lost:
    
        r5 = 13;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10515F(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            Method dump skipped, instruction units count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p327k.p329b.C4500e6.m10515F(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* JADX INFO: renamed from: G */
    public final void m10516G(String str, String str2, long j2, Object obj) {
        mo10686n().m10758v(new RunnableC4584l6(this, str, str2, obj, j2));
    }

    /* JADX INFO: renamed from: H */
    public final void m10517H(String str, String str2, Bundle bundle) {
        m10518I(str, str2, bundle, true, true, this.f24476a.f24541o.mo5623c());
    }

    /* JADX INFO: renamed from: I */
    public final void m10518I(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        String strM10623x;
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (this.f24476a.f24534h.m10417k(C4647r.f24380v0) && C4723x9.m10864q0(str2, "screen_view")) {
            C4573k7 c4573k7M10386q = m10386q();
            if (!c4573k7M10386q.f24476a.f24534h.m10417k(C4647r.f24380v0)) {
                c4573k7M10386q.mo10684l().f24423k.m10811a("Manual screen reporting is disabled.");
                return;
            }
            synchronized (c4573k7M10386q.f24074l) {
                if (!c4573k7M10386q.f24073k) {
                    c4573k7M10386q.mo10684l().f24423k.m10811a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > 100)) {
                    c4573k7M10386q.mo10684l().f24423k.m10812b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > 100)) {
                    c4573k7M10386q.mo10684l().f24423k.m10812b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    Activity activity = c4573k7M10386q.f24069g;
                    strM10623x = activity != null ? C4573k7.m10623x(activity.getClass().getCanonicalName()) : "Activity";
                } else {
                    strM10623x = string2;
                }
                if (c4573k7M10386q.f24070h && c4573k7M10386q.f24065c != null) {
                    c4573k7M10386q.f24070h = false;
                    boolean zM10864q0 = C4723x9.m10864q0(c4573k7M10386q.f24065c.f24122b, strM10623x);
                    boolean zM10864q1 = C4723x9.m10864q0(c4573k7M10386q.f24065c.f24121a, string);
                    if (zM10864q0 && zM10864q1) {
                        c4573k7M10386q.mo10684l().f24423k.m10811a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                c4573k7M10386q.mo10684l().f24426n.m10813c("Logging screen view with name, class", string == null ? "null" : string, strM10623x == null ? "null" : strM10623x);
                C4585l7 c4585l7 = c4573k7M10386q.f24065c == null ? c4573k7M10386q.f24066d : c4573k7M10386q.f24065c;
                C4585l7 c4585l8 = new C4585l7(string, strM10623x, c4573k7M10386q.m10817f().m10902t0(), true, j2);
                c4573k7M10386q.f24065c = c4585l8;
                c4573k7M10386q.f24066d = c4585l7;
                c4573k7M10386q.f24071i = c4585l8;
                c4573k7M10386q.mo10686n().m10758v(new RunnableC4609n7(c4573k7M10386q, bundle2, c4585l8, c4585l7, c4573k7M10386q.f24476a.f24541o.mo5621a()));
                return;
            }
        }
        m10526Q(str3, str2, j2, bundle2, z2, !z2 || this.f23852d == null || C4723x9.m10865r0(str2), !z, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m10519J(String str, String str2, Object obj) {
        m10521L(str, str2, obj, true, this.f24476a.f24541o.mo5623c());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX INFO: renamed from: K */
    public final void m10520K(String str, String str2, Object obj, long j2) {
        String str3;
        Object obj2;
        C2622l.m5359e(str);
        C2622l.m5359e(str2);
        mo10381b();
        m10479t();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    Long lValueOf = Long.valueOf("false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                    m10818g().f23905t.m10640b(lValueOf.longValue() == 1 ? "true" : "false");
                    obj2 = lValueOf;
                } else if (obj == null) {
                    m10818g().f23905t.m10640b("unset");
                    obj2 = obj;
                } else {
                    str3 = str2;
                    obj2 = obj;
                }
            } else if (obj == null) {
                m10818g().f23905t.m10640b("unset");
                obj2 = obj;
            } else {
                str3 = str2;
                obj2 = obj;
            }
            str3 = "_npa";
        } else {
            str3 = str2;
            obj2 = obj;
        }
        if (!this.f24476a.m10828d()) {
            mo10684l().f24426n.m10811a("User property not set since app measurement is disabled");
            return;
        }
        if (this.f24476a.m10832h()) {
            C4712w9 c4712w9 = new C4712w9(str3, j2, obj2, str);
            C4677t7 c4677t7M10385p = m10385p();
            c4677t7M10385p.mo10381b();
            c4677t7M10385p.m10479t();
            C4617o3 c4617o3M10387r = c4677t7M10385p.m10387r();
            Objects.requireNonNull(c4617o3M10387r);
            Parcel parcelObtain = Parcel.obtain();
            boolean zM10708x = false;
            c4712w9.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                c4617o3M10387r.mo10684l().f24419g.m10811a("User property too long for local database. Sending directly to service");
            } else {
                zM10708x = c4617o3M10387r.m10708x(1, bArrMarshall);
            }
            c4677t7M10385p.m10778z(new RunnableC4688u7(c4677t7M10385p, zM10708x, c4712w9, c4677t7M10385p.m10775I(true)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    /* JADX INFO: renamed from: L */
    public final void m10521L(String str, String str2, Object obj, boolean z, long j2) {
        int iM10893h0;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z) {
            iM10893h0 = m10817f().m10893h0(str2);
        } else {
            C4723x9 c4723x9M10817f = m10817f();
            if (!c4723x9M10817f.m10889a0("user property", str2)) {
                iM10893h0 = 6;
            } else if (!c4723x9M10817f.m10892f0("user property", C4741z5.f24622a, null, str2)) {
                iM10893h0 = 15;
            } else if (c4723x9M10817f.m10888Z("user property", 24, str2)) {
                iM10893h0 = 0;
            } else {
                iM10893h0 = 6;
            }
        }
        if (iM10893h0 != 0) {
            m10817f();
            this.f24476a.m10837t().m10884R(this.f23864p, iM10893h0, "_ev", C4723x9.m10852E(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (obj == null) {
            m10516G(str3, str2, j2, null);
            return;
        }
        int iM10894i0 = m10817f().m10894i0(str2, obj);
        if (iM10894i0 != 0) {
            m10817f();
            this.f24476a.m10837t().m10884R(this.f23864p, iM10894i0, "_ev", C4723x9.m10852E(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0);
        } else {
            Object objM10896n0 = m10817f().m10896n0(str2, obj);
            if (objM10896n0 != null) {
                m10516G(str3, str2, j2, objM10896n0);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m10522M() {
        if (this.f24476a.f24528b.getApplicationContext() instanceof Application) {
            ((Application) this.f24476a.f24528b.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f23851c);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m10523N() {
        mo10381b();
        m10479t();
        if (this.f24476a.m10832h()) {
            if (this.f24476a.f24534h.m10417k(C4647r.f24344d0)) {
                Boolean boolM10425w = this.f24476a.f24534h.m10425w("google_analytics_deferred_deep_link_enabled");
                if (boolM10425w != null && boolM10425w.booleanValue()) {
                    mo10684l().f24425m.m10811a("Deferred Deep Link feature enabled.");
                    mo10686n().m10758v(new Runnable(this) { // from class: c.n.b.d.k.b.g6

                        /* JADX INFO: renamed from: f */
                        public final C4500e6 f23943f;

                        {
                            this.f23943f = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Pair pair;
                            NetworkInfo activeNetworkInfo;
                            URL url;
                            C4500e6 c4500e6 = this.f23943f;
                            c4500e6.mo10381b();
                            if (c4500e6.m10818g().f23910y.m10594b()) {
                                c4500e6.mo10684l().f24425m.m10811a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jM10610a = c4500e6.m10818g().f23911z.m10610a();
                            c4500e6.m10818g().f23911z.m10611b(jM10610a + 1);
                            if (jM10610a >= 5) {
                                c4500e6.mo10684l().f24421i.m10811a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                c4500e6.m10818g().f23910y.m10593a(true);
                                return;
                            }
                            C4707w4 c4707w4 = c4500e6.f24476a;
                            c4707w4.mo10686n().mo10381b();
                            C4707w4.m10824q(c4707w4.m10833i());
                            C4629p3 c4629p3M10843z = c4707w4.m10843z();
                            c4629p3M10843z.m10479t();
                            String str = c4629p3M10843z.f24256c;
                            C4510f4 c4510f4M10834k = c4707w4.m10834k();
                            c4510f4M10834k.mo10381b();
                            long jMo5621a = c4510f4M10834k.f24476a.f24541o.mo5621a();
                            if (c4510f4M10834k.f23899n == null || jMo5621a >= c4510f4M10834k.f23901p) {
                                C4469c c4469c = c4510f4M10834k.f24476a.f24534h;
                                Objects.requireNonNull(c4469c);
                                c4510f4M10834k.f23901p = c4469c.m10416i(str, C4647r.f24339b) + jMo5621a;
                                try {
                                    C2211a.a aVarM4656b = C2211a.m4656b(c4510f4M10834k.f24476a.f24528b);
                                    String str2 = aVarM4656b.f10624a;
                                    c4510f4M10834k.f23899n = str2;
                                    c4510f4M10834k.f23900o = aVarM4656b.f10625b;
                                    if (str2 == null) {
                                        c4510f4M10834k.f23899n = "";
                                    }
                                } catch (Exception e) {
                                    c4510f4M10834k.mo10684l().f24425m.m10812b("Unable to get advertising id", e);
                                    c4510f4M10834k.f23899n = "";
                                }
                                pair = new Pair(c4510f4M10834k.f23899n, Boolean.valueOf(c4510f4M10834k.f23900o));
                            } else {
                                pair = new Pair(c4510f4M10834k.f23899n, Boolean.valueOf(c4510f4M10834k.f23900o));
                            }
                            if (!c4707w4.f24534h.m10427y().booleanValue() || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                                c4707w4.mo10684l().f24425m.m10811a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                                return;
                            }
                            C4525g7 c4525g7M10833i = c4707w4.m10833i();
                            c4525g7M10833i.m10763k();
                            try {
                                activeNetworkInfo = ((ConnectivityManager) c4525g7M10833i.f24476a.f24528b.getSystemService("connectivity")).getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                            if (!(activeNetworkInfo != null && activeNetworkInfo.isConnected())) {
                                c4707w4.mo10684l().f24421i.m10811a("Network is not available for Deferred Deep Link request. Skipping");
                                return;
                            }
                            C4723x9 c4723x9M10837t = c4707w4.m10837t();
                            c4707w4.m10843z();
                            String str3 = (String) pair.first;
                            long jM10610a2 = c4707w4.m10834k().f23911z.m10610a() - 1;
                            Objects.requireNonNull(c4723x9M10837t);
                            try {
                                C2622l.m5359e(str3);
                                C2622l.m5359e(str);
                                String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 33025L, Integer.valueOf(c4723x9M10837t.m10908y0())), str3, str, Long.valueOf(jM10610a2));
                                if (str.equals(c4723x9M10837t.f24476a.f24534h.m10414d("debug.deferred.deeplink", ""))) {
                                    strConcat = strConcat.concat("&ddl_test=1");
                                }
                                url = new URL(strConcat);
                            } catch (IllegalArgumentException | MalformedURLException e2) {
                                c4723x9M10837t.mo10684l().f24418f.m10812b("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
                                url = null;
                            }
                            C4525g7 c4525g7M10833i2 = c4707w4.m10833i();
                            C4740z4 c4740z4 = new C4740z4(c4707w4);
                            c4525g7M10833i2.mo10381b();
                            c4525g7M10833i2.m10763k();
                            Objects.requireNonNull(url, "null reference");
                            c4525g7M10833i2.mo10686n().m10760x(new RunnableC4549i7(c4525g7M10833i2, str, url, null, null, c4740z4));
                        }
                    });
                }
            }
            C4677t7 c4677t7M10385p = m10385p();
            c4677t7M10385p.mo10381b();
            c4677t7M10385p.m10479t();
            C4480ca c4480caM10775I = c4677t7M10385p.m10775I(true);
            c4677t7M10385p.m10387r().m10708x(3, new byte[0]);
            c4677t7M10385p.m10778z(new RunnableC4454a8(c4677t7M10385p, c4480caM10775I));
            this.f23863o = false;
            C4510f4 c4510f4M10818g = m10818g();
            c4510f4M10818g.mo10381b();
            String string = c4510f4M10818g.m10538w().getString("previous_os_version", null);
            c4510f4M10818g.m10815c().m10763k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c4510f4M10818g.m10538w().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            m10815c().m10763k();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m10517H("auto", "_ou", bundle);
        }
    }

    /* JADX INFO: renamed from: O */
    public final String m10524O() {
        C4707w4 c4707w4 = this.f24476a;
        String str = c4707w4.f24529c;
        if (str != null) {
            return str;
        }
        try {
            return C4340s8.m10211h(c4707w4.f24528b, "google_app_id");
        } catch (IllegalStateException e) {
            this.f24476a.mo10684l().f24418f.m10812b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m10525P() {
        mo10381b();
        String strM10639a = m10818g().f23905t.m10639a();
        if (strM10639a != null) {
            if ("unset".equals(strM10639a)) {
                m10520K("app", "_npa", null, this.f24476a.f24541o.mo5623c());
            } else {
                m10520K("app", "_npa", Long.valueOf("true".equals(strM10639a) ? 1L : 0L), this.f24476a.f24541o.mo5623c());
            }
        }
        if (!this.f24476a.m10828d() || !this.f23863o) {
            mo10684l().f24425m.m10811a("Updating Scion state (FE)");
            C4677t7 c4677t7M10385p = m10385p();
            c4677t7M10385p.mo10381b();
            c4677t7M10385p.m10479t();
            c4677t7M10385p.m10778z(new RunnableC4502e8(c4677t7M10385p, c4677t7M10385p.m10775I(true)));
            return;
        }
        mo10684l().f24425m.m10811a("Recording app launch after enabling measurement for the first time (FE)");
        m10523N();
        if (C4118ca.m9505a() && this.f24476a.f24534h.m10417k(C4647r.f24370q0)) {
            m10388s().f24633d.m10600a();
        }
        if (((InterfaceC4369u9) C4327r9.f23436f.zza()).zza() && this.f24476a.f24534h.m10417k(C4647r.f24376t0)) {
            if (!(this.f24476a.f24550x.f24227a.m10834k().f23897l.m10610a() > 0)) {
                C4618o4 c4618o4 = this.f24476a.f24550x;
                c4618o4.m10711a(c4618o4.f24227a.f24528b.getPackageName());
            }
        }
        if (this.f24476a.f24534h.m10417k(C4647r.f24303D0)) {
            mo10686n().m10758v(new RunnableC4536h6(this));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m10526Q(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        mo10686n().m10758v(new RunnableC4596m6(this, str, str2, j2, bundle2, z, z2, z3, null));
    }

    /* JADX INFO: renamed from: R */
    public final void m10527R(String str, String str2, Bundle bundle) {
        long jMo5623c = this.f24476a.f24541o.mo5623c();
        C2622l.m5359e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jMo5623c);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        mo10686n().m10758v(new RunnableC4654r6(this, bundle2));
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4475c5
    /* JADX INFO: renamed from: v */
    public final boolean mo10481v() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final void m10528w(long j2, boolean z) {
        mo10381b();
        m10479t();
        mo10684l().f24425m.m10811a("Resetting analytics data (FE)");
        C4744z8 c4744z8M10388s = m10388s();
        c4744z8M10388s.mo10381b();
        C4527g9 c4527g9 = c4744z8M10388s.f24634e;
        c4527g9.f23951c.m10597c();
        c4527g9.f23949a = 0L;
        c4527g9.f23950b = 0L;
        boolean zM10828d = this.f24476a.m10828d();
        C4510f4 c4510f4M10818g = m10818g();
        c4510f4M10818g.f23896k.m10611b(j2);
        if (!TextUtils.isEmpty(c4510f4M10818g.m10818g().f23885A.m10639a())) {
            c4510f4M10818g.f23885A.m10640b(null);
        }
        if (C4118ca.m9505a() && c4510f4M10818g.f24476a.f24534h.m10417k(C4647r.f24370q0)) {
            c4510f4M10818g.f23907v.m10611b(0L);
        }
        if (!c4510f4M10818g.f24476a.f24534h.m10426x()) {
            c4510f4M10818g.m10537v(!zM10828d);
        }
        c4510f4M10818g.f23886B.m10640b(null);
        c4510f4M10818g.f23887C.m10611b(0L);
        c4510f4M10818g.f23888D.m10621b(null);
        if (z) {
            C4677t7 c4677t7M10385p = m10385p();
            c4677t7M10385p.mo10381b();
            c4677t7M10385p.m10479t();
            C4480ca c4480caM10775I = c4677t7M10385p.m10775I(false);
            c4677t7M10385p.m10387r().m10709y();
            c4677t7M10385p.m10778z(new RunnableC4710w7(c4677t7M10385p, c4480caM10775I));
        }
        if (C4118ca.m9505a() && this.f24476a.f24534h.m10417k(C4647r.f24370q0)) {
            m10388s().f24633d.m10600a();
        }
        this.f23863o = !zM10828d;
    }

    /* JADX INFO: renamed from: x */
    public final void m10529x(Bundle bundle, int i, long j2) {
        if (C4145e9.m9566a() && this.f24476a.f24534h.m10417k(C4647r.f24311H0)) {
            m10479t();
            C4481d c4481d = C4481d.f23819a;
            String string = bundle.getString("ad_storage");
            if ((string == null || C4481d.m10488i(string) != null) && ((string = bundle.getString("analytics_storage")) == null || C4481d.m10488i(string) != null)) {
                string = null;
            }
            if (string != null) {
                mo10684l().f24423k.m10812b("Ignoring invalid consent setting", string);
                mo10684l().f24423k.m10811a("Valid consent values are 'granted', 'denied'");
            }
            m10511A(C4481d.m10487g(bundle), i, j2);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m10530y(Bundle bundle, long j2) {
        Objects.requireNonNull(bundle, "null reference");
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            mo10684l().f24421i.m10811a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C4340s8.m10210g(bundle2, "app_id", String.class, null);
        C4340s8.m10210g(bundle2, "origin", String.class, null);
        C4340s8.m10210g(bundle2, "name", String.class, null);
        C4340s8.m10210g(bundle2, "value", Object.class, null);
        C4340s8.m10210g(bundle2, "trigger_event_name", String.class, null);
        C4340s8.m10210g(bundle2, "trigger_timeout", Long.class, 0L);
        C4340s8.m10210g(bundle2, "timed_out_event_name", String.class, null);
        C4340s8.m10210g(bundle2, "timed_out_event_params", Bundle.class, null);
        C4340s8.m10210g(bundle2, "triggered_event_name", String.class, null);
        C4340s8.m10210g(bundle2, "triggered_event_params", Bundle.class, null);
        C4340s8.m10210g(bundle2, "time_to_live", Long.class, 0L);
        C4340s8.m10210g(bundle2, "expired_event_name", String.class, null);
        C4340s8.m10210g(bundle2, "expired_event_params", Bundle.class, null);
        C2622l.m5359e(bundle2.getString("name"));
        C2622l.m5359e(bundle2.getString("origin"));
        Objects.requireNonNull(bundle2.get("value"), "null reference");
        bundle2.putLong("creation_timestamp", j2);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (m10817f().m10893h0(string) != 0) {
            mo10684l().f24418f.m10812b("Invalid conditional user property name", m10816e().m10721y(string));
            return;
        }
        if (m10817f().m10894i0(string, obj) != 0) {
            mo10684l().f24418f.m10813c("Invalid conditional user property value", m10816e().m10721y(string), obj);
            return;
        }
        Object objM10896n0 = m10817f().m10896n0(string, obj);
        if (objM10896n0 == null) {
            mo10684l().f24418f.m10813c("Unable to normalize conditional user property value", m10816e().m10721y(string), obj);
            return;
        }
        C4340s8.m10214k(bundle2, objM10896n0);
        long j3 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j3 > 15552000000L || j3 < 1)) {
            mo10684l().f24418f.m10813c("Invalid conditional user property timeout", m10816e().m10721y(string), Long.valueOf(j3));
            return;
        }
        long j4 = bundle2.getLong("time_to_live");
        if (j4 > 15552000000L || j4 < 1) {
            mo10684l().f24418f.m10813c("Invalid conditional user property time to live", m10816e().m10721y(string), Long.valueOf(j4));
        } else {
            mo10686n().m10758v(new RunnableC4632p6(this, bundle2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX INFO: renamed from: z */
    public final void m10531z(C4481d c4481d) {
        Boolean boolValueOf;
        mo10381b();
        boolean z = (c4481d.m10493k() && c4481d.m10492j()) || m10385p().m10771E();
        if (z != this.f24476a.m10830f()) {
            C4707w4 c4707w4 = this.f24476a;
            c4707w4.mo10686n().mo10381b();
            c4707w4.f24524E = z;
            C4510f4 c4510f4M10818g = m10818g();
            Objects.requireNonNull(c4510f4M10818g);
            if (C4145e9.m9566a() && c4510f4M10818g.f24476a.f24534h.m10417k(C4647r.f24311H0)) {
                c4510f4M10818g.mo10381b();
                if (c4510f4M10818g.m10538w().contains("measurement_enabled_from_api")) {
                    boolValueOf = Boolean.valueOf(c4510f4M10818g.m10538w().getBoolean("measurement_enabled_from_api", true));
                } else {
                    boolValueOf = null;
                }
            } else {
                boolValueOf = null;
            }
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                m10513D(Boolean.valueOf(z), false);
            }
        }
    }
}
