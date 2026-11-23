package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p273d0.p274a.BinderC2161s;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2258e1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2261f1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2264g1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.lu */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3264lu implements InterfaceC3638vx {

    /* JADX INFO: renamed from: a */
    public static AbstractC3264lu f16509a;

    /* JADX INFO: renamed from: c */
    public static AbstractC3264lu m7618c(Context context, InterfaceC3395pd interfaceC3395pd, int i) {
        AbstractC3264lu abstractC3264luM7619d = m7619d(context, i);
        abstractC3264luM7619d.mo7628j().f16797b.compareAndSet(null, interfaceC3395pd);
        return abstractC3264luM7619d;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC3264lu m7619d(Context context, int i) {
        AbstractC3264lu abstractC3264lu;
        synchronized (AbstractC3264lu.class) {
            AbstractC3264lu abstractC3264lu2 = f16509a;
            if (abstractC3264lu2 != null) {
                return abstractC3264lu2;
            }
            C3702xn c3702xn = new C3702xn(210890000, i, true, false);
            C3191jv c3191jv = new C3191jv();
            synchronized (AbstractC3264lu.class) {
                if (f16509a == null) {
                    C3301mu c3301mu = new C3301mu();
                    c3301mu.f16848a = c3702xn;
                    c3301mu.f16850c = new WeakReference<>(context);
                    c3301mu.f16849b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                    C3338nu c3338nu = new C3338nu(c3301mu);
                    C3674ww c3674ww = new C3674ww(c3191jv);
                    C2622l.m5467z2(c3338nu, C3338nu.class);
                    C2622l.m5467z2(c3674ww, C3674ww.class);
                    f16509a = new C3600uw(c3338nu, c3674ww, new cm1(), new C3045fx(), new zi1());
                    C3052g3.m6922a(context);
                    C2330u c2330u = C2330u.f10884a;
                    c2330u.f10893h.m6645b(context, c3702xn);
                    c2330u.f10895j.m7159a(context);
                    C2267h1 c2267h1 = c2330u.f10889d;
                    if (!c2267h1.f10720h) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.intent.action.USER_PRESENT");
                        intentFilter.addAction("android.intent.action.SCREEN_OFF");
                        context.getApplicationContext().registerReceiver(new C2264g1(c2267h1), intentFilter);
                        c2267h1.f10720h = true;
                    }
                    C2267h1 c2267h2 = c2330u.f10889d;
                    if (!c2267h2.f10721i) {
                        IntentFilter intentFilter2 = new IntentFilter();
                        intentFilter2.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
                        context.getApplicationContext().registerReceiver(new C2261f1(), intentFilter2);
                        c2267h2.f10721i = true;
                    }
                    Objects.requireNonNull(c2330u.f10889d);
                    if (C2622l.m5464z()) {
                        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14303Y4)).booleanValue()) {
                            ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new C2258e1());
                        }
                    }
                    C2096e.m4589y(context);
                    c2330u.f10892g.m6421a(context);
                    if (C2622l.m5464z() && !Arrays.asList(context.databaseList()).contains("AdMobOfflineBufferedPings.db")) {
                        ((NotificationManager) context.getSystemService("notification")).deleteNotificationChannel("offline_notification_channel");
                    }
                    c2330u.f10911z.m4799a(context);
                    AbstractC2923cm.m6200d(context);
                    AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14236N3;
                    C2862b c2862b = C2862b.f12493a;
                    if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                        if (!((Boolean) c2862b.f12496d.m6596a(C3052g3.f14388l0)).booleanValue()) {
                            final hw0 hw0Var = new hw0(context, c3702xn, new as2(new ds2(context)), new pv0(new lv0(context), f16509a.mo7626h()), UUID.randomUUID().toString(), f16509a.mo7623e());
                            final boolean zMo4811O = ((C2311z0) c2330u.f10893h.m6649f()).mo4811O();
                            try {
                                hw0Var.f15037c.m8164a(new dl1(hw0Var, zMo4811O) { // from class: c.n.b.d.j.a.dw0

                                    /* JADX INFO: renamed from: a */
                                    public final hw0 f13406a;

                                    /* JADX INFO: renamed from: b */
                                    public final boolean f13407b;

                                    {
                                        this.f13406a = hw0Var;
                                        this.f13407b = zMo4811O;
                                    }

                                    /* JADX WARN: Type inference failed for: r7v1 */
                                    /* JADX WARN: Type inference failed for: r7v11 */
                                    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
                                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dl1
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo5679a(Object obj) {
                                        ?? r7;
                                        boolean z;
                                        boolean z2;
                                        hw0 hw0Var2 = this.f13406a;
                                        boolean z3 = this.f13407b;
                                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                                        Objects.requireNonNull(hw0Var2);
                                        if (z3) {
                                            hw0Var2.f15036b.deleteDatabase("OfflineUpload.db");
                                            return null;
                                        }
                                        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14351f5)).booleanValue()) {
                                            hm1 hm1VarM7144a = hm1.m7144a("oa_upload");
                                            hm1VarM7144a.f14911a.put("oa_failed_reqs", String.valueOf(cw0.m6236f(sQLiteDatabase, 0)));
                                            hm1VarM7144a.f14911a.put("oa_total_reqs", String.valueOf(cw0.m6236f(sQLiteDatabase, 1)));
                                            hm1VarM7144a.f14911a.put("oa_upload_time", String.valueOf(C2330u.f10884a.f10896k.mo5623c()));
                                            hm1VarM7144a.f14911a.put("oa_last_successful_time", String.valueOf(cw0.m6240j(sQLiteDatabase)));
                                            hm1VarM7144a.f14911a.put("oa_session_id", hw0Var2.f15041g.mo4811O() ? "" : hw0Var2.f15039e);
                                            hw0Var2.f15040f.mo7280b(hm1VarM7144a);
                                            ArrayList<fu2> arrayListM6232b = cw0.m6232b(sQLiteDatabase);
                                            hw0.m7178a(sQLiteDatabase, arrayListM6232b);
                                            int size = arrayListM6232b.size();
                                            for (int i2 = 0; i2 < size; i2++) {
                                                fu2 fu2Var = arrayListM6232b.get(i2);
                                                hm1 hm1VarM7144a2 = hm1.m7144a("oa_signals");
                                                hm1VarM7144a2.f14911a.put("oa_session_id", hw0Var2.f15041g.mo4811O() ? "" : hw0Var2.f15039e);
                                                au2 au2VarM6880D = fu2Var.m6880D();
                                                String strValueOf = au2VarM6880D.m5857v() ? String.valueOf(au2VarM6880D.m5858x().f22403j) : "-1";
                                                String string = new at1(fu2Var.m6879C(), gw0.f14688a).toString();
                                                hm1VarM7144a2.f14911a.put("oa_sig_ts", String.valueOf(fu2Var.m6887y()));
                                                hm1VarM7144a2.f14911a.put("oa_sig_status", String.valueOf(fu2Var.m6888z().f16508j));
                                                hm1VarM7144a2.f14911a.put("oa_sig_resp_lat", String.valueOf(fu2Var.m6877A()));
                                                hm1VarM7144a2.f14911a.put("oa_sig_render_lat", String.valueOf(fu2Var.m6878B()));
                                                hm1VarM7144a2.f14911a.put("oa_sig_formats", string);
                                                hm1VarM7144a2.f14911a.put("oa_sig_nw_type", strValueOf);
                                                hm1VarM7144a2.f14911a.put("oa_sig_wifi", String.valueOf(fu2Var.m6881E().f16508j));
                                                hm1VarM7144a2.f14911a.put("oa_sig_airplane", String.valueOf(fu2Var.m6882F().f16508j));
                                                hm1VarM7144a2.f14911a.put("oa_sig_data", String.valueOf(fu2Var.m6883G().f16508j));
                                                hm1VarM7144a2.f14911a.put("oa_sig_nw_resp", String.valueOf(fu2Var.m6884H()));
                                                hm1VarM7144a2.f14911a.put("oa_sig_offline", String.valueOf(fu2Var.m6885I().f16508j));
                                                hm1VarM7144a2.f14911a.put("oa_sig_nw_state", String.valueOf(fu2Var.m6886J().f15399m));
                                                if (au2VarM6880D.m5859y() && au2VarM6880D.m5857v() && au2VarM6880D.m5858x().equals(zt2.CELL)) {
                                                    hm1VarM7144a2.f14911a.put("oa_sig_cell_type", String.valueOf(au2VarM6880D.m5860z().f21679k));
                                                }
                                                hw0Var2.f15040f.mo7280b(hm1VarM7144a2);
                                            }
                                        } else {
                                            ArrayList<fu2> arrayListM6232b2 = cw0.m6232b(sQLiteDatabase);
                                            gu2 gu2VarM7397v = ju2.m7397v();
                                            String packageName = hw0Var2.f15036b.getPackageName();
                                            if (gu2VarM7397v.f13191h) {
                                                gu2VarM7397v.m6298m();
                                                r7 = 0;
                                                gu2VarM7397v.f13191h = false;
                                            } else {
                                                r7 = 0;
                                            }
                                            ju2.m7394C((ju2) gu2VarM7397v.f13190g, packageName);
                                            String str = Build.MODEL;
                                            if (gu2VarM7397v.f13191h) {
                                                gu2VarM7397v.m6298m();
                                                gu2VarM7397v.f13191h = r7;
                                            }
                                            ju2.m7395D((ju2) gu2VarM7397v.f13190g, str);
                                            int iM6236f = cw0.m6236f(sQLiteDatabase, r7);
                                            if (gu2VarM7397v.f13191h) {
                                                gu2VarM7397v.m6298m();
                                                gu2VarM7397v.f13191h = r7;
                                            }
                                            ju2.m7400z((ju2) gu2VarM7397v.f13190g, iM6236f);
                                            if (gu2VarM7397v.f13191h) {
                                                gu2VarM7397v.m6298m();
                                                gu2VarM7397v.f13191h = r7;
                                            }
                                            ju2.m7399y((ju2) gu2VarM7397v.f13190g, arrayListM6232b2);
                                            int iM6236f2 = cw0.m6236f(sQLiteDatabase, 1);
                                            if (gu2VarM7397v.f13191h) {
                                                gu2VarM7397v.m6298m();
                                                gu2VarM7397v.f13191h = r7;
                                            }
                                            ju2.m7392A((ju2) gu2VarM7397v.f13190g, iM6236f2);
                                            long jMo5623c = C2330u.f10884a.f10896k.mo5623c();
                                            if (gu2VarM7397v.f13191h) {
                                                gu2VarM7397v.m6298m();
                                                z = false;
                                                gu2VarM7397v.f13191h = false;
                                            } else {
                                                z = false;
                                            }
                                            ju2.m7393B((ju2) gu2VarM7397v.f13190g, jMo5623c);
                                            long jM6240j = cw0.m6240j(sQLiteDatabase);
                                            if (gu2VarM7397v.f13191h) {
                                                gu2VarM7397v.m6298m();
                                                gu2VarM7397v.f13191h = z;
                                            }
                                            ju2.m7396E((ju2) gu2VarM7397v.f13190g, jM6240j);
                                            final ju2 ju2VarM6300o = gu2VarM7397v.m6300o();
                                            hw0.m7178a(sQLiteDatabase, arrayListM6232b2);
                                            hw0Var2.f15035a.m5846b(new zr2(ju2VarM6300o) { // from class: c.n.b.d.j.a.ew0

                                                /* JADX INFO: renamed from: a */
                                                public final ju2 f13710a;

                                                {
                                                    this.f13710a = ju2VarM6300o;
                                                }

                                                @Override // p007c.p190n.p194b.p266d.p314j.p315a.zr2
                                                /* JADX INFO: renamed from: a */
                                                public final void mo6684a(mt2 mt2Var) {
                                                    ju2 ju2Var = this.f13710a;
                                                    if (mt2Var.f13191h) {
                                                        mt2Var.m6298m();
                                                        mt2Var.f13191h = false;
                                                    }
                                                    ot2.m8061G((ot2) mt2Var.f13190g, ju2Var);
                                                }
                                            });
                                            vu2 vu2VarM8695v = wu2.m8695v();
                                            int i3 = hw0Var2.f15038d.f21616g;
                                            if (vu2VarM8695v.f13191h) {
                                                vu2VarM8695v.m6298m();
                                                z2 = false;
                                                vu2VarM8695v.f13191h = false;
                                            } else {
                                                z2 = false;
                                            }
                                            wu2.m8697y((wu2) vu2VarM8695v.f13190g, i3);
                                            int i4 = hw0Var2.f15038d.f21617h;
                                            if (vu2VarM8695v.f13191h) {
                                                vu2VarM8695v.m6298m();
                                                vu2VarM8695v.f13191h = z2;
                                            }
                                            wu2.m8698z((wu2) vu2VarM8695v.f13190g, i4);
                                            int i5 = true != hw0Var2.f15038d.f21618i ? 2 : 0;
                                            if (vu2VarM8695v.f13191h) {
                                                vu2VarM8695v.m6298m();
                                                vu2VarM8695v.f13191h = false;
                                            }
                                            wu2.m8694A((wu2) vu2VarM8695v.f13190g, i5);
                                            final wu2 wu2VarM6300o = vu2VarM8695v.m6300o();
                                            hw0Var2.f15035a.m5846b(new zr2(wu2VarM6300o) { // from class: c.n.b.d.j.a.fw0

                                                /* JADX INFO: renamed from: a */
                                                public final wu2 f14121a;

                                                {
                                                    this.f14121a = wu2VarM6300o;
                                                }

                                                @Override // p007c.p190n.p194b.p266d.p314j.p315a.zr2
                                                /* JADX INFO: renamed from: a */
                                                public final void mo6684a(mt2 mt2Var) {
                                                    wu2 wu2Var = this.f14121a;
                                                    et2 et2VarM6965q = ((ot2) mt2Var.f13190g).m8066x().m6965q();
                                                    if (et2VarM6965q.f13191h) {
                                                        et2VarM6965q.m6298m();
                                                        et2VarM6965q.f13191h = false;
                                                    }
                                                    ft2.m6858z((ft2) et2VarM6965q.f13190g, wu2Var);
                                                    mt2Var.m7731r(et2VarM6965q);
                                                }
                                            });
                                            hw0Var2.f15035a.m5845a(bs2.OFFLINE_UPLOAD);
                                        }
                                        sQLiteDatabase.delete("offline_signal_contents", null, null);
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("value", (Integer) 0);
                                        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("value", (Integer) 0);
                                        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
                                        return null;
                                    }
                                });
                            } catch (Exception e) {
                                String strValueOf = String.valueOf(e.getMessage());
                                C2622l.m5408n3(strValueOf.length() != 0 ? "Error in offline signals database startup: ".concat(strValueOf) : new String("Error in offline signals database startup: "));
                            }
                        }
                    }
                }
                abstractC3264lu = f16509a;
            }
            return abstractC3264lu;
        }
    }

    /* JADX INFO: renamed from: A */
    public final bb1 m7620A(C3437qi c3437qi, int i) {
        return mo7621a(new ic1(c3437qi, i));
    }

    /* JADX INFO: renamed from: a */
    public abstract bb1 mo7621a(ic1 ic1Var);

    /* JADX INFO: renamed from: b */
    public abstract C2970dw mo7622b();

    /* JADX INFO: renamed from: e */
    public abstract im1 mo7623e();

    /* JADX INFO: renamed from: f */
    public abstract Executor mo7624f();

    /* JADX INFO: renamed from: g */
    public abstract ScheduledExecutorService mo7625g();

    /* JADX INFO: renamed from: h */
    public abstract lv1 mo7626h();

    /* JADX INFO: renamed from: i */
    public abstract u80 mo7627i();

    /* JADX INFO: renamed from: j */
    public abstract mm0 mo7628j();

    /* JADX INFO: renamed from: k */
    public abstract BinderC2971dx mo7629k();

    /* JADX INFO: renamed from: l */
    public abstract C3710xv mo7630l();

    /* JADX INFO: renamed from: m */
    public abstract C2896bw mo7631m();

    /* JADX INFO: renamed from: n */
    public abstract C3524sv mo7632n();

    /* JADX INFO: renamed from: o */
    public abstract C3413pv mo7633o();

    /* JADX INFO: renamed from: p */
    public abstract C3636vv mo7634p();

    /* JADX INFO: renamed from: q */
    public abstract C3155iw mo7635q();

    /* JADX INFO: renamed from: r */
    public abstract C3266lw mo7636r();

    /* JADX INFO: renamed from: s */
    public abstract C3228kv mo7637s();

    /* JADX INFO: renamed from: t */
    public abstract C3414pw mo7638t();

    /* JADX INFO: renamed from: u */
    public abstract C3340nw mo7639u();

    /* JADX INFO: renamed from: v */
    public abstract C3525sw mo7640v();

    /* JADX INFO: renamed from: w */
    public abstract BinderC2161s mo7641w();

    /* JADX INFO: renamed from: x */
    public abstract xw0 mo7642x();

    /* JADX INFO: renamed from: y */
    public abstract wi1<vk0> mo7643y();

    /* JADX INFO: renamed from: z */
    public abstract br0 mo7644z();
}
