package p007c.p190n.p194b.p266d.p327k.p329b;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2662h;
import p007c.p190n.p194b.p266d.p298f.p307u.C2784d;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4292p2;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4401x2;
import p007c.p190n.p194b.p266d.p314j.p325k.C4096b2;
import p007c.p190n.p194b.p266d.p314j.p325k.C4145e9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4149f;
import p007c.p190n.p194b.p266d.p314j.p325k.C4152f2;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p314j.p325k.C4388w2;
import p007c.p190n.p194b.p266d.p314j.p325k.C4413y1;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4125d3;

/* JADX INFO: renamed from: c.n.b.d.k.b.w4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4707w4 implements InterfaceC4697v5 {

    /* JADX INFO: renamed from: a */
    public static volatile C4707w4 f24519a;

    /* JADX INFO: renamed from: A */
    public long f24520A;

    /* JADX INFO: renamed from: B */
    public volatile Boolean f24521B;

    /* JADX INFO: renamed from: C */
    public Boolean f24522C;

    /* JADX INFO: renamed from: D */
    public Boolean f24523D;

    /* JADX INFO: renamed from: E */
    public volatile boolean f24524E;

    /* JADX INFO: renamed from: F */
    public int f24525F;

    /* JADX INFO: renamed from: H */
    public final long f24527H;

    /* JADX INFO: renamed from: b */
    public final Context f24528b;

    /* JADX INFO: renamed from: c */
    public final String f24529c;

    /* JADX INFO: renamed from: d */
    public final String f24530d;

    /* JADX INFO: renamed from: e */
    public final String f24531e;

    /* JADX INFO: renamed from: f */
    public final boolean f24532f;

    /* JADX INFO: renamed from: g */
    public final C4588la f24533g;

    /* JADX INFO: renamed from: h */
    public final C4469c f24534h;

    /* JADX INFO: renamed from: i */
    public final C4510f4 f24535i;

    /* JADX INFO: renamed from: j */
    public final C4662s3 f24536j;

    /* JADX INFO: renamed from: k */
    public final C4674t4 f24537k;

    /* JADX INFO: renamed from: l */
    public final C4744z8 f24538l;

    /* JADX INFO: renamed from: m */
    public final C4723x9 f24539m;

    /* JADX INFO: renamed from: n */
    public final C4640q3 f24540n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC2782b f24541o;

    /* JADX INFO: renamed from: p */
    public final C4573k7 f24542p;

    /* JADX INFO: renamed from: q */
    public final C4500e6 f24543q;

    /* JADX INFO: renamed from: r */
    public final C4445a f24544r;

    /* JADX INFO: renamed from: s */
    public final C4525g7 f24545s;

    /* JADX INFO: renamed from: t */
    public C4617o3 f24546t;

    /* JADX INFO: renamed from: u */
    public C4677t7 f24547u;

    /* JADX INFO: renamed from: v */
    public C4553j f24548v;

    /* JADX INFO: renamed from: w */
    public C4629p3 f24549w;

    /* JADX INFO: renamed from: x */
    public C4618o4 f24550x;

    /* JADX INFO: renamed from: z */
    public Boolean f24552z;

    /* JADX INFO: renamed from: y */
    public boolean f24551y = false;

    /* JADX INFO: renamed from: G */
    public AtomicInteger f24526G = new AtomicInteger(0);

    public C4707w4(C4452a6 c4452a6) {
        Context context;
        Bundle bundle;
        boolean z = false;
        Context context2 = c4452a6.f23706a;
        C4588la c4588la = new C4588la();
        this.f24533g = c4588la;
        C4340s8.f23453a = c4588la;
        this.f24528b = context2;
        this.f24529c = c4452a6.f23707b;
        this.f24530d = c4452a6.f23708c;
        this.f24531e = c4452a6.f23709d;
        this.f24532f = c4452a6.f23713h;
        this.f24521B = c4452a6.f23710e;
        this.f24524E = true;
        C4149f c4149f = c4452a6.f23712g;
        if (c4149f != null && (bundle = c4149f.f23143l) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f24522C = (Boolean) obj;
            }
            Object obj2 = c4149f.f23143l.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f24523D = (Boolean) obj2;
            }
        }
        synchronized (AbstractC4292p2.f23392a) {
            AbstractC4401x2 abstractC4401x2 = AbstractC4292p2.f23393b;
            final Context applicationContext = context2.getApplicationContext();
            applicationContext = applicationContext == null ? context2 : applicationContext;
            if (abstractC4401x2 == null || abstractC4401x2.mo10329a() != applicationContext) {
                C4096b2.m9405c();
                C4388w2.m10309b();
                synchronized (C4152f2.class) {
                    C4152f2 c4152f2 = C4152f2.f23151a;
                    if (c4152f2 != null && (context = c4152f2.f23152b) != null && c4152f2.f23153c != null) {
                        context.getContentResolver().unregisterContentObserver(C4152f2.f23151a.f23153c);
                    }
                    C4152f2.f23151a = null;
                }
                AbstractC4292p2.f23393b = new C4413y1(applicationContext, C2622l.m5223A0(new InterfaceC4125d3(applicationContext) { // from class: c.n.b.d.j.k.o2

                    /* JADX INFO: renamed from: f */
                    public final Context f23377f;

                    {
                        this.f23377f = applicationContext;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4125d3
                    public final Object zza() {
                        AbstractC4097b3 c4111c3;
                        Context contextCreateDeviceProtectedStorageContext = this.f23377f;
                        new C4222k2();
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if (!((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys")))) {
                            return C4083a3.f23027f;
                        }
                        if (C4426z1.m10339a() && !contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                c4111c3 = file.exists() ? new C4111c3(file) : C4083a3.f23027f;
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                                c4111c3 = C4083a3.f23027f;
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            }
                            if (!c4111c3.mo9337b()) {
                                return C4083a3.f23027f;
                            }
                            File file2 = (File) c4111c3.mo9338c();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                try {
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            String strValueOf = String.valueOf(file2);
                                            StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
                                            sb.append("Parsed ");
                                            sb.append(strValueOf);
                                            Log.i("HermeticFileOverrides", sb.toString());
                                            C4236l2 c4236l2 = new C4236l2(map);
                                            bufferedReader.close();
                                            return new C4111c3(c4236l2);
                                        }
                                        String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            Log.e("HermeticFileOverrides", line.length() != 0 ? "Invalid: ".concat(line) : new String("Invalid: "));
                                        } else {
                                            String str3 = strArrSplit[0];
                                            String strDecode = Uri.decode(strArrSplit[1]);
                                            String strDecode2 = Uri.decode(strArrSplit[2]);
                                            if (!map.containsKey(str3)) {
                                                map.put(str3, new HashMap());
                                            }
                                            ((Map) map.get(str3)).put(strDecode, strDecode2);
                                        }
                                        throw new RuntimeException(e);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        C4223k3.f23269a.mo9860a(th, th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    }
                }));
                AbstractC4292p2.f23395d.incrementAndGet();
            }
        }
        this.f24541o = C2784d.f11944a;
        Long l = c4452a6.f23714i;
        this.f24527H = l != null ? l.longValue() : System.currentTimeMillis();
        this.f24534h = new C4469c(this);
        C4510f4 c4510f4 = new C4510f4(this);
        c4510f4.m10764p();
        this.f24535i = c4510f4;
        C4662s3 c4662s3 = new C4662s3(this);
        c4662s3.m10764p();
        this.f24536j = c4662s3;
        C4723x9 c4723x9 = new C4723x9(this);
        c4723x9.m10764p();
        this.f24539m = c4723x9;
        C4640q3 c4640q3 = new C4640q3(this);
        c4640q3.m10764p();
        this.f24540n = c4640q3;
        this.f24544r = new C4445a(this);
        C4573k7 c4573k7 = new C4573k7(this);
        c4573k7.m10480u();
        this.f24542p = c4573k7;
        C4500e6 c4500e6 = new C4500e6(this);
        c4500e6.m10480u();
        this.f24543q = c4500e6;
        C4744z8 c4744z8 = new C4744z8(this);
        c4744z8.m10480u();
        this.f24538l = c4744z8;
        C4525g7 c4525g7 = new C4525g7(this);
        c4525g7.m10764p();
        this.f24545s = c4525g7;
        C4674t4 c4674t4 = new C4674t4(this);
        c4674t4.m10764p();
        this.f24537k = c4674t4;
        C4149f c4149f2 = c4452a6.f23712g;
        if (c4149f2 != null && c4149f2.f23138g != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context2.getApplicationContext() instanceof Application) {
            C4500e6 c4500e6M10836s = m10836s();
            if (c4500e6M10836s.f24476a.f24528b.getApplicationContext() instanceof Application) {
                Application application = (Application) c4500e6M10836s.f24476a.f24528b.getApplicationContext();
                if (c4500e6M10836s.f23851c == null) {
                    c4500e6M10836s.f23851c = new C4453a7(c4500e6M10836s, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(c4500e6M10836s.f23851c);
                    application.registerActivityLifecycleCallbacks(c4500e6M10836s.f23851c);
                    c4500e6M10836s.mo10684l().f24426n.m10811a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo10684l().f24421i.m10811a("Application context is not an Application");
        }
        c4674t4.m10758v(new RunnableC4729y4(this, c4452a6));
    }

    /* JADX INFO: renamed from: b */
    public static C4707w4 m10821b(Context context, C4149f c4149f, Long l) {
        Bundle bundle;
        if (c4149f != null && (c4149f.f23141j == null || c4149f.f23142k == null)) {
            c4149f = new C4149f(c4149f.f23137f, c4149f.f23138g, c4149f.f23139h, c4149f.f23140i, null, null, c4149f.f23143l);
        }
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (f24519a == null) {
            synchronized (C4707w4.class) {
                if (f24519a == null) {
                    f24519a = new C4707w4(new C4452a6(context, c4149f, l));
                }
            }
        } else if (c4149f != null && (bundle = c4149f.f23143l) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            f24519a.f24521B = Boolean.valueOf(c4149f.f23143l.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f24519a;
    }

    /* JADX INFO: renamed from: c */
    public static void m10822c(C4686u5 c4686u5) {
        if (c4686u5 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m10823p(AbstractC4475c5 abstractC4475c5) {
        if (abstractC4475c5 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC4475c5.f23783b) {
            return;
        }
        String strValueOf = String.valueOf(abstractC4475c5.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: q */
    public static void m10824q(AbstractC4675t5 abstractC4675t5) {
        if (abstractC4675t5 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC4675t5.m10762i()) {
            return;
        }
        String strValueOf = String.valueOf(abstractC4675t5.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: A */
    public final C4445a m10825A() {
        C4445a c4445a = this.f24544r;
        if (c4445a != null) {
            return c4445a;
        }
        throw new IllegalStateException("Component not created");
    }

    /* JADX INFO: renamed from: B */
    public final boolean m10826B() {
        return this.f24521B != null && this.f24521B.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public final C4469c m10827a() {
        return this.f24534h;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10828d() {
        return m10829e() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m10829e() {
        mo10686n().mo10381b();
        if (this.f24534h.m10426x()) {
            return 1;
        }
        Boolean bool = this.f24523D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (C4145e9.m9566a() && this.f24534h.m10417k(C4647r.f24311H0) && !m10830f()) {
            return 8;
        }
        Boolean boolM10539x = m10834k().m10539x();
        if (boolM10539x != null) {
            return boolM10539x.booleanValue() ? 0 : 3;
        }
        Boolean boolM10425w = this.f24534h.m10425w("firebase_analytics_collection_enabled");
        if (boolM10425w != null) {
            return boolM10425w.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f24522C;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        if (C2662h.m5537a("isMeasurementExplicitlyDisabled").f11698e) {
            return 6;
        }
        return (!this.f24534h.m10417k(C4647r.f24329S) || this.f24521B == null || this.f24521B.booleanValue()) ? 0 : 7;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10830f() {
        mo10686n().mo10381b();
        return this.f24524E;
    }

    /* JADX INFO: renamed from: g */
    public final void m10831g() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX INFO: renamed from: h */
    public final boolean m10832h() {
        boolean z;
        if (!this.f24551y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        mo10686n().mo10381b();
        Boolean bool = this.f24552z;
        if (bool == null || this.f24520A == 0 || (!bool.booleanValue() && Math.abs(this.f24541o.mo5621a() - this.f24520A) > 1000)) {
            this.f24520A = this.f24541o.mo5621a();
            Boolean boolValueOf = Boolean.valueOf(m10837t().m10898p0("android.permission.INTERNET") && m10837t().m10898p0("android.permission.ACCESS_NETWORK_STATE") && (C2794c.m5637a(this.f24528b).m5636d() || this.f24534h.m10412C() || (C4630p4.m10714a(this.f24528b) && C4723x9.m10854U(this.f24528b))));
            this.f24552z = boolValueOf;
            if (boolValueOf.booleanValue()) {
                C4723x9 c4723x9M10837t = m10837t();
                C4629p3 c4629p3M10843z = m10843z();
                c4629p3M10843z.m10479t();
                String str = c4629p3M10843z.f24264k;
                C4629p3 c4629p3M10843z2 = m10843z();
                c4629p3M10843z2.m10479t();
                String str2 = c4629p3M10843z2.f24265l;
                C4629p3 c4629p3M10843z3 = m10843z();
                c4629p3M10843z3.m10479t();
                if (!c4723x9M10837t.m10891c0(str, str2, c4629p3M10843z3.f24266m)) {
                    C4629p3 c4629p3M10843z4 = m10843z();
                    c4629p3M10843z4.m10479t();
                    z = TextUtils.isEmpty(c4629p3M10843z4.f24265l) ? false : true;
                }
                this.f24552z = Boolean.valueOf(z);
            }
        }
        return this.f24552z.booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final C4525g7 m10833i() {
        m10824q(this.f24545s);
        return this.f24545s;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4697v5
    /* JADX INFO: renamed from: j */
    public final InterfaceC2782b mo10682j() {
        return this.f24541o;
    }

    /* JADX INFO: renamed from: k */
    public final C4510f4 m10834k() {
        m10822c(this.f24535i);
        return this.f24535i;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4697v5
    /* JADX INFO: renamed from: l */
    public final C4662s3 mo10684l() {
        m10824q(this.f24536j);
        return this.f24536j;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4697v5
    /* JADX INFO: renamed from: m */
    public final Context mo10685m() {
        return this.f24528b;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4697v5
    /* JADX INFO: renamed from: n */
    public final C4674t4 mo10686n() {
        m10824q(this.f24537k);
        return this.f24537k;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4697v5
    /* JADX INFO: renamed from: o */
    public final C4588la mo10687o() {
        return this.f24533g;
    }

    /* JADX INFO: renamed from: r */
    public final C4744z8 m10835r() {
        m10823p(this.f24538l);
        return this.f24538l;
    }

    /* JADX INFO: renamed from: s */
    public final C4500e6 m10836s() {
        m10823p(this.f24543q);
        return this.f24543q;
    }

    /* JADX INFO: renamed from: t */
    public final C4723x9 m10837t() {
        m10822c(this.f24539m);
        return this.f24539m;
    }

    /* JADX INFO: renamed from: u */
    public final C4640q3 m10838u() {
        m10822c(this.f24540n);
        return this.f24540n;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10839v() {
        return TextUtils.isEmpty(this.f24529c);
    }

    /* JADX INFO: renamed from: w */
    public final C4573k7 m10840w() {
        m10823p(this.f24542p);
        return this.f24542p;
    }

    /* JADX INFO: renamed from: x */
    public final C4677t7 m10841x() {
        m10823p(this.f24547u);
        return this.f24547u;
    }

    /* JADX INFO: renamed from: y */
    public final C4553j m10842y() {
        m10824q(this.f24548v);
        return this.f24548v;
    }

    /* JADX INFO: renamed from: z */
    public final C4629p3 m10843z() {
        m10823p(this.f24549w);
        return this.f24549w;
    }
}
