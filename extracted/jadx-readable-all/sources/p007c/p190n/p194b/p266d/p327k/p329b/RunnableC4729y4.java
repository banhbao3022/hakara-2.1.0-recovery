package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p007c.p190n.p194b.p266d.p314j.p325k.C4145e9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4149f;
import p007c.p190n.p194b.p266d.p314j.p325k.C4243l9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4300pa;

/* JADX INFO: renamed from: c.n.b.d.k.b.y4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4729y4 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4452a6 f24598f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4707w4 f24599g;

    public RunnableC4729y4(C4707w4 c4707w4, C4452a6 c4452a6) {
        this.f24599g = c4707w4;
        this.f24598f = c4452a6;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0314  */
    /* JADX WARN: Code duplicated, block: B:111:0x0351  */
    /* JADX WARN: Code duplicated, block: B:113:0x0377  */
    /* JADX WARN: Code duplicated, block: B:139:0x0482  */
    /* JADX WARN: Code duplicated, block: B:145:0x04a7  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String string;
        String str2;
        C4510f4 c4510f4M10834k;
        C4510f4 c4510f4M10834k2;
        Boolean boolM10539x;
        boolean zM10828d;
        C4481d c4481dM10487g;
        String strConcat;
        C4684u3 c4684u3;
        C4707w4 c4707w4 = this.f24599g;
        C4452a6 c4452a6 = this.f24598f;
        c4707w4.mo10686n().mo10381b();
        C4553j c4553j = new C4553j(c4707w4);
        c4553j.m10764p();
        c4707w4.f24548v = c4553j;
        C4629p3 c4629p3 = new C4629p3(c4707w4, c4452a6.f23711f);
        c4629p3.m10480u();
        c4707w4.f24549w = c4629p3;
        C4617o3 c4617o3 = new C4617o3(c4707w4);
        c4617o3.m10480u();
        c4707w4.f24546t = c4617o3;
        C4677t7 c4677t7 = new C4677t7(c4707w4);
        c4677t7.m10480u();
        c4707w4.f24547u = c4677t7;
        c4707w4.f24539m.m10765q();
        c4707w4.f24535i.m10765q();
        c4707w4.f24550x = new C4618o4(c4707w4);
        C4629p3 c4629p4 = c4707w4.f24549w;
        if (c4629p4.f23783b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        c4629p4.m10713w();
        c4629p4.f24476a.f24526G.incrementAndGet();
        boolean z = true;
        c4629p4.f23783b = true;
        c4707w4.mo10684l().f24424l.m10812b("App measurement initialized, version", 33025L);
        c4707w4.mo10684l().f24424l.m10811a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        c4629p3.m10479t();
        String str3 = c4629p3.f24256c;
        if (TextUtils.isEmpty(c4707w4.f24529c)) {
            if (c4707w4.m10837t().m10900s0(str3)) {
                c4684u3 = c4707w4.mo10684l().f24424l;
                strConcat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                C4684u3 c4684u4 = c4707w4.mo10684l().f24424l;
                String strValueOf = String.valueOf(str3);
                strConcat = strValueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(strValueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                c4684u3 = c4684u4;
            }
            c4684u3.m10811a(strConcat);
        }
        c4707w4.mo10684l().f24425m.m10811a("Debug-level message logging enabled");
        if (c4707w4.f24525F != c4707w4.f24526G.get()) {
            c4707w4.mo10684l().f24418f.m10813c("Not all components initialized", Integer.valueOf(c4707w4.f24525F), Integer.valueOf(c4707w4.f24526G.get()));
        }
        c4707w4.f24551y = true;
        C4707w4 c4707w5 = this.f24599g;
        C4149f c4149f = this.f24598f.f23712g;
        c4707w5.mo10686n().mo10381b();
        if (C4145e9.m9566a() && c4707w5.f24534h.m10417k(C4647r.f24311H0)) {
            C4481d c4481dM10540y = c4707w5.m10834k().m10540y();
            C4510f4 c4510f4M10834k3 = c4707w5.m10834k();
            c4510f4M10834k3.mo10381b();
            int i = c4510f4M10834k3.m10538w().getInt("consent_source", 100);
            int i2 = 40;
            if (c4707w5.f24534h.m10417k(C4647r.f24313I0)) {
                C4469c c4469c = c4707w5.f24534h;
                Objects.requireNonNull(c4469c);
                Boolean boolM10425w = (C4145e9.m9566a() && c4469c.m10417k(C4647r.f24313I0)) ? c4469c.m10425w("google_analytics_default_allow_ad_storage") : null;
                C4469c c4469c2 = c4707w5.f24534h;
                Objects.requireNonNull(c4469c2);
                Boolean boolM10425w2 = (C4145e9.m9566a() && c4469c2.m10417k(C4647r.f24313I0)) ? c4469c2.m10425w("google_analytics_default_allow_analytics_storage") : null;
                if (!(boolM10425w == null && boolM10425w2 == null) && c4707w5.m10834k().m10535t(20)) {
                    c4481dM10487g = new C4481d(boolM10425w, boolM10425w2);
                    i2 = 20;
                } else {
                    C4629p3 c4629p3M10843z = c4707w5.m10843z();
                    c4629p3M10843z.m10479t();
                    if (!TextUtils.isEmpty(c4629p3M10843z.f24264k) && (i == 30 || i == 40)) {
                        c4707w5.m10836s().m10511A(C4481d.f23819a, 20, c4707w5.f24527H);
                    } else if (c4149f != null && c4149f.f23143l != null && c4707w5.m10834k().m10535t(40)) {
                        c4481dM10487g = C4481d.m10487g(c4149f.f23143l);
                        if (c4481dM10487g.equals(C4481d.f23819a)) {
                        }
                    }
                    c4481dM10487g = null;
                    i2 = 0;
                }
                if (c4481dM10487g != null) {
                    c4707w5.m10836s().m10511A(c4481dM10487g, i2, c4707w5.f24527H);
                    c4481dM10540y = c4481dM10487g;
                }
            } else if (c4149f != null && c4149f.f23143l != null && c4707w5.m10834k().m10535t(40)) {
                c4481dM10487g = C4481d.m10487g(c4149f.f23143l);
                if (!c4481dM10487g.equals(C4481d.f23819a)) {
                    c4707w5.m10836s().m10511A(c4481dM10487g, 40, c4707w5.f24527H);
                    c4481dM10540y = c4481dM10487g;
                }
            }
            c4707w5.m10836s().m10531z(c4481dM10540y);
        }
        if (c4707w5.m10834k().f23891f.m10610a() == 0) {
            c4707w5.m10834k().f23891f.m10611b(c4707w5.f24541o.mo5623c());
        }
        if (Long.valueOf(c4707w5.m10834k().f23896k.m10610a()).longValue() == 0) {
            c4707w5.mo10684l().f24426n.m10812b("Persisting first open", Long.valueOf(c4707w5.f24527H));
            c4707w5.m10834k().f23896k.m10611b(c4707w5.f24527H);
        }
        if (c4707w5.f24534h.m10417k(C4647r.f24303D0)) {
            C4492da c4492da = c4707w5.m10836s().f23862n;
            if (c4492da.m10509c() && c4492da.m10508b()) {
                c4492da.f23838a.m10834k().f23886B.m10640b(null);
            }
        }
        if (c4707w5.m10832h()) {
            C4629p3 c4629p3M10843z2 = c4707w5.m10843z();
            c4629p3M10843z2.m10479t();
            if (TextUtils.isEmpty(c4629p3M10843z2.f24264k)) {
                C4629p3 c4629p3M10843z3 = c4707w5.m10843z();
                c4629p3M10843z3.m10479t();
                if (!TextUtils.isEmpty(c4629p3M10843z3.f24265l)) {
                    c4707w5.m10837t();
                    C4629p3 c4629p3M10843z4 = c4707w5.m10843z();
                    c4629p3M10843z4.m10479t();
                    str = c4629p3M10843z4.f24264k;
                    C4510f4 c4510f4M10834k4 = c4707w5.m10834k();
                    c4510f4M10834k4.mo10381b();
                    string = c4510f4M10834k4.m10538w().getString("gmp_app_id", null);
                    C4629p3 c4629p3M10843z5 = c4707w5.m10843z();
                    c4629p3M10843z5.m10479t();
                    str2 = c4629p3M10843z5.f24265l;
                    c4510f4M10834k = c4707w5.m10834k();
                    c4510f4M10834k.mo10381b();
                    if (C4723x9.m10858d0(str, string, str2, c4510f4M10834k.m10538w().getString("admob_app_id", null))) {
                        c4707w5.mo10684l().f24424l.m10811a("Rechecking which service to use due to a GMP App Id change");
                        c4510f4M10834k2 = c4707w5.m10834k();
                        c4510f4M10834k2.mo10381b();
                        boolM10539x = c4510f4M10834k2.m10539x();
                        SharedPreferences.Editor editorEdit = c4510f4M10834k2.m10538w().edit();
                        editorEdit.clear();
                        editorEdit.apply();
                        if (boolM10539x != null) {
                            c4510f4M10834k2.m10534s(boolM10539x);
                        }
                        C4707w4.m10823p(c4707w5.f24546t);
                        c4707w5.f24546t.m10709y();
                        c4707w5.f24547u.m10770D();
                        c4707w5.f24547u.m10769C();
                        c4707w5.m10834k().f23896k.m10611b(c4707w5.f24527H);
                        c4707w5.m10834k().f23898m.m10640b(null);
                    }
                    C4510f4 c4510f4M10834k5 = c4707w5.m10834k();
                    C4629p3 c4629p3M10843z6 = c4707w5.m10843z();
                    c4629p3M10843z6.m10479t();
                    String str4 = c4629p3M10843z6.f24264k;
                    c4510f4M10834k5.mo10381b();
                    SharedPreferences.Editor editorEdit2 = c4510f4M10834k5.m10538w().edit();
                    editorEdit2.putString("gmp_app_id", str4);
                    editorEdit2.apply();
                    C4510f4 c4510f4M10834k6 = c4707w5.m10834k();
                    C4629p3 c4629p3M10843z7 = c4707w5.m10843z();
                    c4629p3M10843z7.m10479t();
                    String str5 = c4629p3M10843z7.f24265l;
                    c4510f4M10834k6.mo10381b();
                    SharedPreferences.Editor editorEdit3 = c4510f4M10834k6.m10538w().edit();
                    editorEdit3.putString("admob_app_id", str5);
                    editorEdit3.apply();
                }
            } else {
                c4707w5.m10837t();
                C4629p3 c4629p3M10843z8 = c4707w5.m10843z();
                c4629p3M10843z8.m10479t();
                str = c4629p3M10843z8.f24264k;
                C4510f4 c4510f4M10834k7 = c4707w5.m10834k();
                c4510f4M10834k7.mo10381b();
                string = c4510f4M10834k7.m10538w().getString("gmp_app_id", null);
                C4629p3 c4629p3M10843z9 = c4707w5.m10843z();
                c4629p3M10843z9.m10479t();
                str2 = c4629p3M10843z9.f24265l;
                c4510f4M10834k = c4707w5.m10834k();
                c4510f4M10834k.mo10381b();
                if (C4723x9.m10858d0(str, string, str2, c4510f4M10834k.m10538w().getString("admob_app_id", null))) {
                    c4707w5.mo10684l().f24424l.m10811a("Rechecking which service to use due to a GMP App Id change");
                    c4510f4M10834k2 = c4707w5.m10834k();
                    c4510f4M10834k2.mo10381b();
                    boolM10539x = c4510f4M10834k2.m10539x();
                    SharedPreferences.Editor editorEdit4 = c4510f4M10834k2.m10538w().edit();
                    editorEdit4.clear();
                    editorEdit4.apply();
                    if (boolM10539x != null) {
                        c4510f4M10834k2.m10534s(boolM10539x);
                    }
                    C4707w4.m10823p(c4707w5.f24546t);
                    c4707w5.f24546t.m10709y();
                    c4707w5.f24547u.m10770D();
                    c4707w5.f24547u.m10769C();
                    c4707w5.m10834k().f23896k.m10611b(c4707w5.f24527H);
                    c4707w5.m10834k().f23898m.m10640b(null);
                }
                C4510f4 c4510f4M10834k8 = c4707w5.m10834k();
                C4629p3 c4629p3M10843z10 = c4707w5.m10843z();
                c4629p3M10843z10.m10479t();
                String str6 = c4629p3M10843z10.f24264k;
                c4510f4M10834k8.mo10381b();
                SharedPreferences.Editor editorEdit5 = c4510f4M10834k8.m10538w().edit();
                editorEdit5.putString("gmp_app_id", str6);
                editorEdit5.apply();
                C4510f4 c4510f4M10834k9 = c4707w5.m10834k();
                C4629p3 c4629p3M10843z11 = c4707w5.m10843z();
                c4629p3M10843z11.m10479t();
                String str7 = c4629p3M10843z11.f24265l;
                c4510f4M10834k9.mo10381b();
                SharedPreferences.Editor editorEdit6 = c4510f4M10834k9.m10538w().edit();
                editorEdit6.putString("admob_app_id", str7);
                editorEdit6.apply();
            }
            if (C4145e9.m9566a() && c4707w5.f24534h.m10417k(C4647r.f24311H0) && !c4707w5.m10834k().m10540y().m10493k()) {
                c4707w5.m10834k().f23898m.m10640b(null);
            }
            c4707w5.m10836s().f23855g.set(c4707w5.m10834k().f23898m.m10639a());
            if (C4243l9.m10004a() && c4707w5.f24534h.m10417k(C4647r.f24368p0)) {
                C4723x9 c4723x9M10837t = c4707w5.m10837t();
                Objects.requireNonNull(c4723x9M10837t);
                try {
                    c4723x9M10837t.f24476a.f24528b.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (!z && !TextUtils.isEmpty(c4707w5.m10834k().f23885A.m10639a())) {
                    c4707w5.mo10684l().f24421i.m10811a("Remote config removed with active feature rollouts");
                    c4707w5.m10834k().f23885A.m10640b(null);
                }
            }
            C4629p3 c4629p3M10843z12 = c4707w5.m10843z();
            c4629p3M10843z12.m10479t();
            if (TextUtils.isEmpty(c4629p3M10843z12.f24264k)) {
                C4629p3 c4629p3M10843z13 = c4707w5.m10843z();
                c4629p3M10843z13.m10479t();
                if (!TextUtils.isEmpty(c4629p3M10843z13.f24265l)) {
                    zM10828d = c4707w5.m10828d();
                    if (!c4707w5.m10834k().f23889d.contains("deferred_analytics_collection") && !c4707w5.f24534h.m10426x()) {
                        c4707w5.m10834k().m10537v(!zM10828d);
                    }
                    if (zM10828d) {
                        c4707w5.m10836s().m10523N();
                    }
                    c4707w5.m10835r().f24633d.m10600a();
                    c4707w5.m10841x().m10767A(new AtomicReference<>());
                    if (C4300pa.m10143a() && c4707w5.f24534h.m10417k(C4647r.f24388z0)) {
                        C4677t7 c4677t7M10841x = c4707w5.m10841x();
                        Bundle bundleM10620a = c4707w5.m10834k().f23888D.m10620a();
                        c4677t7M10841x.mo10381b();
                        c4677t7M10841x.m10479t();
                        c4677t7M10841x.m10778z(new RunnableC4490d8(c4677t7M10841x, bundleM10620a, c4677t7M10841x.m10775I(false)));
                    }
                }
            } else {
                zM10828d = c4707w5.m10828d();
                if (!c4707w5.m10834k().f23889d.contains("deferred_analytics_collection")) {
                    c4707w5.m10834k().m10537v(!zM10828d);
                }
                if (zM10828d) {
                    c4707w5.m10836s().m10523N();
                }
                c4707w5.m10835r().f24633d.m10600a();
                c4707w5.m10841x().m10767A(new AtomicReference<>());
                if (C4300pa.m10143a()) {
                    C4677t7 c4677t7M10841x2 = c4707w5.m10841x();
                    Bundle bundleM10620a2 = c4707w5.m10834k().f23888D.m10620a();
                    c4677t7M10841x2.mo10381b();
                    c4677t7M10841x2.m10479t();
                    c4677t7M10841x2.m10778z(new RunnableC4490d8(c4677t7M10841x2, bundleM10620a2, c4677t7M10841x2.m10775I(false)));
                }
            }
        } else if (c4707w5.m10828d()) {
            if (!c4707w5.m10837t().m10898p0("android.permission.INTERNET")) {
                c4707w5.mo10684l().f24418f.m10811a("App is missing INTERNET permission");
            }
            if (!c4707w5.m10837t().m10898p0("android.permission.ACCESS_NETWORK_STATE")) {
                c4707w5.mo10684l().f24418f.m10811a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C2794c.m5637a(c4707w5.f24528b).m5636d() && !c4707w5.f24534h.m10412C()) {
                if (!C4630p4.m10714a(c4707w5.f24528b)) {
                    c4707w5.mo10684l().f24418f.m10811a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C4723x9.m10854U(c4707w5.f24528b)) {
                    c4707w5.mo10684l().f24418f.m10811a("AppMeasurementService not registered/enabled");
                }
            }
            c4707w5.mo10684l().f24418f.m10811a("Uploading is not possible. App measurement disabled");
        }
        c4707w5.m10834k().f23906u.m10593a(c4707w5.f24534h.m10417k(C4647r.f24335Y));
    }
}
