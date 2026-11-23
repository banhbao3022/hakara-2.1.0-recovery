package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p298f.C2610f;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.C2768b;
import p007c.p190n.p194b.p266d.p298f.p306t.C2778a;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p007c.p190n.p194b.p266d.p314j.p325k.C4145e9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4286oa;
import p007c.p190n.p194b.p266d.p314j.p325k.C4436zb;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4120cc;

/* JADX INFO: renamed from: c.n.b.d.k.b.t7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4677t7 extends AbstractC4475c5 {

    /* JADX INFO: renamed from: c */
    public final ServiceConnectionC4610n8 f24454c;

    /* JADX INFO: renamed from: d */
    public InterfaceC4569k3 f24455d;

    /* JADX INFO: renamed from: e */
    public volatile Boolean f24456e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4541i f24457f;

    /* JADX INFO: renamed from: g */
    public final C4539h9 f24458g;

    /* JADX INFO: renamed from: h */
    public final List<Runnable> f24459h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4541i f24460i;

    public C4677t7(C4707w4 c4707w4) {
        super(c4707w4);
        this.f24459h = new ArrayList();
        this.f24458g = new C4539h9(c4707w4.f24541o);
        this.f24454c = new ServiceConnectionC4610n8(this);
        this.f24457f = new C4666s7(this, c4707w4);
        this.f24460i = new C4478c8(this, c4707w4);
    }

    /* JADX INFO: renamed from: x */
    public static void m10766x(C4677t7 c4677t7, ComponentName componentName) {
        c4677t7.mo10381b();
        if (c4677t7.f24455d != null) {
            c4677t7.f24455d = null;
            c4677t7.mo10684l().f24426n.m10812b("Disconnected from device MeasurementService", componentName);
            c4677t7.mo10381b();
            c4677t7.m10769C();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m10767A(AtomicReference<String> atomicReference) {
        mo10381b();
        m10479t();
        m10778z(new RunnableC4732y7(this, atomicReference, m10775I(false)));
    }

    /* JADX INFO: renamed from: B */
    public final boolean m10768B() {
        mo10381b();
        m10479t();
        return this.f24455d != null;
    }

    /* JADX INFO: renamed from: C */
    public final void m10769C() {
        mo10381b();
        m10479t();
        if (m10768B()) {
            return;
        }
        if (m10773G()) {
            ServiceConnectionC4610n8 serviceConnectionC4610n8 = this.f24454c;
            serviceConnectionC4610n8.f24189c.mo10381b();
            Context context = serviceConnectionC4610n8.f24189c.f24476a.f24528b;
            synchronized (serviceConnectionC4610n8) {
                if (serviceConnectionC4610n8.f24187a) {
                    serviceConnectionC4610n8.f24189c.mo10684l().f24426n.m10811a("Connection attempt already in progress");
                    return;
                }
                if (serviceConnectionC4610n8.f24188b != null && (serviceConnectionC4610n8.f24188b.m5572d() || serviceConnectionC4610n8.f24188b.m5582u0())) {
                    serviceConnectionC4610n8.f24189c.mo10684l().f24426n.m10811a("Already awaiting connection attempt");
                    return;
                }
                serviceConnectionC4610n8.f24188b = new C4673t3(context, Looper.getMainLooper(), serviceConnectionC4610n8, serviceConnectionC4610n8);
                serviceConnectionC4610n8.f24189c.mo10684l().f24426n.m10811a("Connecting to remote service");
                serviceConnectionC4610n8.f24187a = true;
                serviceConnectionC4610n8.f24188b.m5578o();
                return;
            }
        }
        if (this.f24476a.f24534h.m10412C()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = this.f24476a.f24528b.getPackageManager().queryIntentServices(new Intent().setClassName(this.f24476a.f24528b, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (!(listQueryIntentServices != null && listQueryIntentServices.size() > 0)) {
            mo10684l().f24418f.m10811a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(this.f24476a.f24528b, "com.google.android.gms.measurement.AppMeasurementService"));
        ServiceConnectionC4610n8 serviceConnectionC4610n9 = this.f24454c;
        serviceConnectionC4610n9.f24189c.mo10381b();
        Context context2 = serviceConnectionC4610n9.f24189c.f24476a.f24528b;
        C2778a c2778aM5615b = C2778a.m5615b();
        synchronized (serviceConnectionC4610n9) {
            if (serviceConnectionC4610n9.f24187a) {
                serviceConnectionC4610n9.f24189c.mo10684l().f24426n.m10811a("Connection attempt already in progress");
                return;
            }
            serviceConnectionC4610n9.f24189c.mo10684l().f24426n.m10811a("Using local app measurement service");
            serviceConnectionC4610n9.f24187a = true;
            c2778aM5615b.m5616a(context2, intent, serviceConnectionC4610n9.f24189c.f24454c, 129);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m10770D() {
        mo10381b();
        m10479t();
        ServiceConnectionC4610n8 serviceConnectionC4610n8 = this.f24454c;
        if (serviceConnectionC4610n8.f24188b != null && (serviceConnectionC4610n8.f24188b.m5582u0() || serviceConnectionC4610n8.f24188b.m5572d())) {
            serviceConnectionC4610n8.f24188b.mo5133J();
        }
        serviceConnectionC4610n8.f24188b = null;
        try {
            C2778a.m5615b().m5617c(this.f24476a.f24528b, this.f24454c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f24455d = null;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m10771E() {
        mo10381b();
        m10479t();
        if (this.f24476a.f24534h.m10417k(C4647r.f24315J0)) {
            return !m10773G() || m10817f().m10908y0() >= C4647r.f24317K0.m10638a(null).intValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final void m10772F() {
        mo10381b();
        C4539h9 c4539h9 = this.f24458g;
        c4539h9.f23980b = c4539h9.f23979a.mo5621a();
        this.f24457f.m10596b(C4647r.f24314J.m10638a(null).longValue());
    }

    /* JADX INFO: renamed from: G */
    public final boolean m10773G() {
        boolean z;
        mo10381b();
        m10479t();
        if (this.f24456e == null) {
            mo10381b();
            m10479t();
            C4510f4 c4510f4M10818g = m10818g();
            c4510f4M10818g.mo10381b();
            boolean z2 = false;
            Boolean boolValueOf = !c4510f4M10818g.m10538w().contains("use_service") ? null : Boolean.valueOf(c4510f4M10818g.m10538w().getBoolean("use_service", false));
            boolean z3 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                C4629p3 c4629p3M10384k = m10384k();
                c4629p3M10384k.m10479t();
                if (c4629p3M10384k.f24263j == 1) {
                    z = true;
                } else {
                    mo10684l().f24426n.m10811a("Checking service availability");
                    C4723x9 c4723x9M10817f = m10817f();
                    Objects.requireNonNull(c4723x9M10817f);
                    int iMo5207d = C2610f.f11568b.mo5207d(c4723x9M10817f.f24476a.f24528b, 12451000);
                    if (iMo5207d != 0) {
                        if (iMo5207d == 1) {
                            mo10684l().f24426n.m10811a("Service missing");
                        } else if (iMo5207d != 2) {
                            if (iMo5207d == 3) {
                                mo10684l().f24421i.m10811a("Service disabled");
                            } else if (iMo5207d == 9) {
                                mo10684l().f24421i.m10811a("Service invalid");
                            } else if (iMo5207d != 18) {
                                mo10684l().f24421i.m10812b("Unexpected service status", Integer.valueOf(iMo5207d));
                            } else {
                                mo10684l().f24421i.m10811a("Service updating");
                            }
                            z3 = false;
                        } else {
                            mo10684l().f24425m.m10811a("Service container out of date");
                            if (m10817f().m10908y0() >= 17443) {
                                z3 = boolValueOf == null;
                                z = false;
                            }
                        }
                        z = z3;
                        z3 = false;
                    } else {
                        mo10684l().f24426n.m10811a("Service available");
                    }
                    z = true;
                }
                if (z3 || !this.f24476a.f24534h.m10412C()) {
                    z2 = z;
                } else {
                    mo10684l().f24418f.m10811a("No way to upload. Consider using the full version of Analytics");
                }
                if (z2) {
                    C4510f4 c4510f4M10818g2 = m10818g();
                    c4510f4M10818g2.mo10381b();
                    SharedPreferences.Editor editorEdit = c4510f4M10818g2.m10538w().edit();
                    editorEdit.putBoolean("use_service", z3);
                    editorEdit.apply();
                }
            }
            this.f24456e = Boolean.valueOf(z3);
        }
        return this.f24456e.booleanValue();
    }

    /* JADX INFO: renamed from: H */
    public final void m10774H() {
        mo10381b();
        mo10684l().f24426n.m10812b("Processing queued up service tasks", Integer.valueOf(this.f24459h.size()));
        Iterator<Runnable> it = this.f24459h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Exception e) {
                mo10684l().f24418f.m10812b("Task exception while flushing queue", e);
            }
        }
        this.f24459h.clear();
        this.f24460i.m10597c();
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0237  */
    /* JADX INFO: renamed from: I */
    public final C4480ca m10775I(boolean z) {
        boolean z2;
        String str;
        List<String> list;
        long j2;
        String str2;
        String strM10489d;
        long j3;
        C4629p3 c4629p3M10384k = m10384k();
        String strM10746E = z ? mo10684l().m10746E() : null;
        c4629p3M10384k.mo10381b();
        c4629p3M10384k.m10479t();
        String str3 = c4629p3M10384k.f24256c;
        c4629p3M10384k.m10479t();
        String str4 = c4629p3M10384k.f24264k;
        c4629p3M10384k.m10479t();
        String str5 = c4629p3M10384k.f24257d;
        c4629p3M10384k.m10479t();
        long j4 = c4629p3M10384k.f24258e;
        c4629p3M10384k.m10479t();
        String str6 = c4629p3M10384k.f24259f;
        c4629p3M10384k.m10479t();
        c4629p3M10384k.mo10381b();
        if (c4629p3M10384k.f24260g == 0) {
            C4723x9 c4723x9M10837t = c4629p3M10384k.f24476a.m10837t();
            Context context = c4629p3M10384k.f24476a.f24528b;
            String packageName = context.getPackageName();
            c4723x9M10837t.mo10381b();
            C2622l.m5359e(packageName);
            PackageManager packageManager = context.getPackageManager();
            MessageDigest messageDigestM10869x0 = C4723x9.m10869x0();
            long jM10868w = -1;
            if (messageDigestM10869x0 == null) {
                c4723x9M10837t.mo10684l().f24418f.m10811a("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (!c4723x9M10837t.m10897o0(context, packageName)) {
                            Signature[] signatureArr = C2794c.m5637a(context).m5635c(c4723x9M10837t.f24476a.f24528b.getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                c4723x9M10837t.mo10684l().f24421i.m10811a("Could not get signatures");
                            } else {
                                jM10868w = C4723x9.m10868w(messageDigestM10869x0.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        c4723x9M10837t.mo10684l().f24418f.m10812b("Package name not found", e);
                    }
                    c4629p3M10384k.f24260g = j3;
                }
                j3 = 0;
                c4629p3M10384k.f24260g = j3;
            }
            j3 = jM10868w;
            c4629p3M10384k.f24260g = j3;
        }
        long j5 = c4629p3M10384k.f24260g;
        boolean zM10828d = c4629p3M10384k.f24476a.m10828d();
        boolean z3 = !c4629p3M10384k.m10818g().f23908w;
        c4629p3M10384k.mo10381b();
        if (c4629p3M10384k.f24476a.m10828d()) {
            if (((InterfaceC4120cc) C4436zb.f23681f.zza()).zza() && c4629p3M10384k.f24476a.f24534h.m10417k(C4647r.f24360l0)) {
                c4629p3M10384k.mo10684l().f24426n.m10811a("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = c4629p3M10384k.f24476a.f24528b.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Method declaredMethod = clsLoadClass.getDeclaredMethod("getInstance", Context.class);
                            Object[] objArr = new Object[1];
                            z2 = zM10828d;
                            try {
                                objArr[0] = c4629p3M10384k.f24476a.f24528b;
                                Object objInvoke = declaredMethod.invoke(null, objArr);
                                if (objInvoke == null) {
                                    str = null;
                                } else {
                                    try {
                                        str = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                                    } catch (Exception unused) {
                                        c4629p3M10384k.mo10684l().f24423k.m10811a("Failed to retrieve Firebase Instance Id");
                                        str = null;
                                    }
                                }
                            } catch (Exception unused2) {
                                c4629p3M10384k.mo10684l().f24422j.m10811a("Failed to obtain Firebase Analytics instance");
                            }
                        } catch (Exception unused3) {
                            z2 = zM10828d;
                        }
                    }
                } catch (ClassNotFoundException unused4) {
                }
                str = null;
            }
            z2 = zM10828d;
            str = null;
        } else {
            z2 = zM10828d;
            str = null;
        }
        C4707w4 c4707w4 = c4629p3M10384k.f24476a;
        Long lValueOf = Long.valueOf(c4707w4.m10834k().f23896k.m10610a());
        long jMin = lValueOf.longValue() == 0 ? c4707w4.f24527H : Math.min(c4707w4.f24527H, lValueOf.longValue());
        c4629p3M10384k.m10479t();
        int i = c4629p3M10384k.f24263j;
        boolean zBooleanValue = c4629p3M10384k.f24476a.f24534h.m10427y().booleanValue();
        Boolean boolM10425w = c4629p3M10384k.f24476a.f24534h.m10425w("google_analytics_ssaid_collection_enabled");
        boolean zBooleanValue2 = Boolean.valueOf(boolM10425w == null || boolM10425w.booleanValue()).booleanValue();
        C4510f4 c4510f4M10818g = c4629p3M10384k.m10818g();
        c4510f4M10818g.mo10381b();
        boolean z4 = c4510f4M10818g.m10538w().getBoolean("deferred_analytics_collection", false);
        c4629p3M10384k.m10479t();
        String str7 = c4629p3M10384k.f24265l;
        Boolean boolM10425w2 = c4629p3M10384k.f24476a.f24534h.m10425w("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolM10425w2 == null ? null : Boolean.valueOf(!boolM10425w2.booleanValue());
        long j6 = c4629p3M10384k.f24261h;
        List<String> list2 = c4629p3M10384k.f24262i;
        if (C4286oa.m10122a()) {
            list = list2;
            j2 = j6;
            if (c4629p3M10384k.f24476a.f24534h.m10417k(C4647r.f24356j0)) {
                c4629p3M10384k.m10479t();
                str2 = c4629p3M10384k.f24266m;
            }
            if (C4145e9.m9566a() || !c4629p3M10384k.f24476a.f24534h.m10417k(C4647r.f24311H0)) {
                strM10489d = "";
            } else {
                strM10489d = c4629p3M10384k.m10818g().m10540y().m10489d();
            }
            return new C4480ca(str3, str4, str5, j4, str6, 33025L, j5, strM10746E, z2, z3, str, 0L, jMin, i, zBooleanValue, zBooleanValue2, z4, str7, boolValueOf, j2, list, str2, strM10489d);
        }
        list = list2;
        j2 = j6;
        str2 = null;
        if (C4145e9.m9566a()) {
            strM10489d = "";
        } else {
            strM10489d = "";
        }
        return new C4480ca(str3, str4, str5, j4, str6, 33025L, j5, strM10746E, z2, z3, str, 0L, jMin, i, zBooleanValue, zBooleanValue2, z4, str7, boolValueOf, j2, list, str2, strM10489d);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4475c5
    /* JADX INFO: renamed from: v */
    public final boolean mo10481v() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01df  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:130:0x0210  */
    /* JADX WARN: Code duplicated, block: B:132:0x0215  */
    /* JADX WARN: Code duplicated, block: B:135:0x0222  */
    /* JADX WARN: Code duplicated, block: B:137:0x0227  */
    /* JADX WARN: Code duplicated, block: B:205:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0218 A[SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public final void m10776w(InterfaceC4569k3 interfaceC4569k3, AbstractC2767a abstractC2767a, C4480ca c4480ca) throws Throwable {
        ArrayList arrayList;
        int size;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabaseM10707A;
        Cursor cursor;
        Cursor cursorQuery;
        String str;
        String[] strArr;
        C4624oa c4624oaCreateFromParcel;
        C4712w9 c4712w9CreateFromParcel;
        mo10381b();
        m10479t();
        int i = 100;
        int i2 = 0;
        int i3 = 100;
        int i4 = 0;
        while (i4 < 1001 && i3 == i) {
            ArrayList arrayList2 = new ArrayList();
            C4617o3 c4617o3M10387r = m10387r();
            c4617o3M10387r.mo10381b();
            if (c4617o3M10387r.f24226d) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                if (c4617o3M10387r.f24476a.f24528b.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i5 = 5;
                    int i6 = 0;
                    int i7 = 5;
                    while (true) {
                        if (i6 < i5) {
                            try {
                                sQLiteDatabaseM10707A = c4617o3M10387r.m10707A();
                                if (sQLiteDatabaseM10707A == null) {
                                    try {
                                        c4617o3M10387r.f24226d = true;
                                        if (sQLiteDatabaseM10707A != null) {
                                            sQLiteDatabaseM10707A.close();
                                        }
                                        arrayList = null;
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        cursorQuery = null;
                                        SystemClock.sleep(i7);
                                        i7 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM10707A != null) {
                                            sQLiteDatabaseM10707A.close();
                                        }
                                        i6++;
                                        i = 100;
                                        i2 = 0;
                                        i5 = 5;
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        cursorQuery = null;
                                        c4617o3M10387r.mo10684l().f24418f.m10812b("Error reading entries from local database", e);
                                        c4617o3M10387r.f24226d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM10707A != null) {
                                            sQLiteDatabaseM10707A.close();
                                        }
                                        i6++;
                                        i = 100;
                                        i2 = 0;
                                        i5 = 5;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseM10707A != null) {
                                            sQLiteDatabaseM10707A.endTransaction();
                                        }
                                        c4617o3M10387r.mo10684l().f24418f.m10812b("Error reading entries from local database", e);
                                        c4617o3M10387r.f24226d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM10707A != null) {
                                            sQLiteDatabaseM10707A.close();
                                        }
                                        i6++;
                                        i = 100;
                                        i2 = 0;
                                        i5 = 5;
                                    } catch (Throwable th) {
                                        th = th;
                                        sQLiteDatabase = sQLiteDatabaseM10707A;
                                        cursor = null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    sQLiteDatabaseM10707A.beginTransaction();
                                    long jM10706w = C4617o3.m10706w(sQLiteDatabaseM10707A);
                                    long j2 = -1;
                                    if (jM10706w != -1) {
                                        String[] strArr2 = new String[1];
                                        strArr2[i2] = String.valueOf(jM10706w);
                                        str = "rowid<?";
                                        strArr = strArr2;
                                    } else {
                                        str = null;
                                        strArr = null;
                                    }
                                    cursorQuery = sQLiteDatabaseM10707A.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(i));
                                    while (cursorQuery.moveToNext()) {
                                        try {
                                            try {
                                                j2 = cursorQuery.getLong(i2);
                                                int i8 = cursorQuery.getInt(1);
                                                byte[] blob = cursorQuery.getBlob(2);
                                                if (i8 == 0) {
                                                    Parcel parcelObtain = Parcel.obtain();
                                                    try {
                                                        try {
                                                            parcelObtain.unmarshall(blob, i2, blob.length);
                                                            parcelObtain.setDataPosition(i2);
                                                            C4625p c4625pCreateFromParcel = C4625p.CREATOR.createFromParcel(parcelObtain);
                                                            parcelObtain.recycle();
                                                            if (c4625pCreateFromParcel != null) {
                                                                arrayList3.add(c4625pCreateFromParcel);
                                                            }
                                                        } catch (C2768b unused2) {
                                                            c4617o3M10387r.mo10684l().f24418f.m10811a("Failed to load event from local database");
                                                            parcelObtain.recycle();
                                                        }
                                                    } catch (Throwable th2) {
                                                        parcelObtain.recycle();
                                                        throw th2;
                                                    }
                                                } else if (i8 == 1) {
                                                    Parcel parcelObtain2 = Parcel.obtain();
                                                    try {
                                                        try {
                                                            parcelObtain2.unmarshall(blob, i2, blob.length);
                                                            parcelObtain2.setDataPosition(i2);
                                                            c4712w9CreateFromParcel = C4712w9.CREATOR.createFromParcel(parcelObtain2);
                                                            parcelObtain2.recycle();
                                                        } catch (C2768b unused3) {
                                                            c4617o3M10387r.mo10684l().f24418f.m10811a("Failed to load user property from local database");
                                                            parcelObtain2.recycle();
                                                            c4712w9CreateFromParcel = null;
                                                        }
                                                        if (c4712w9CreateFromParcel != null) {
                                                            arrayList3.add(c4712w9CreateFromParcel);
                                                        }
                                                    } catch (Throwable th3) {
                                                        parcelObtain2.recycle();
                                                        throw th3;
                                                    }
                                                } else if (i8 == 2) {
                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                    try {
                                                        try {
                                                            parcelObtain3.unmarshall(blob, i2, blob.length);
                                                            parcelObtain3.setDataPosition(i2);
                                                            c4624oaCreateFromParcel = C4624oa.CREATOR.createFromParcel(parcelObtain3);
                                                            parcelObtain3.recycle();
                                                        } catch (C2768b unused4) {
                                                            c4617o3M10387r.mo10684l().f24418f.m10811a("Failed to load conditional user property from local database");
                                                            parcelObtain3.recycle();
                                                            c4624oaCreateFromParcel = null;
                                                        }
                                                        if (c4624oaCreateFromParcel != null) {
                                                            arrayList3.add(c4624oaCreateFromParcel);
                                                        }
                                                    } catch (Throwable th4) {
                                                        parcelObtain3.recycle();
                                                        throw th4;
                                                    }
                                                } else if (i8 == 3) {
                                                    c4617o3M10387r.mo10684l().f24421i.m10811a("Skipping app launch break");
                                                } else {
                                                    c4617o3M10387r.mo10684l().f24418f.m10811a("Unknown record type in local database");
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                sQLiteDatabase = sQLiteDatabaseM10707A;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused5) {
                                        } catch (SQLiteFullException e3) {
                                            e = e3;
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                        }
                                    }
                                    String[] strArr3 = new String[1];
                                    try {
                                        strArr3[0] = Long.toString(j2);
                                        if (sQLiteDatabaseM10707A.delete("messages", "rowid <= ?", strArr3) < arrayList3.size()) {
                                            c4617o3M10387r.mo10684l().f24418f.m10811a("Fewer entries removed from local database than expected");
                                        }
                                        sQLiteDatabaseM10707A.setTransactionSuccessful();
                                        sQLiteDatabaseM10707A.endTransaction();
                                        cursorQuery.close();
                                        sQLiteDatabaseM10707A.close();
                                        arrayList = arrayList3;
                                    } catch (SQLiteDatabaseLockedException unused6) {
                                        SystemClock.sleep(i7);
                                        i7 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM10707A != null) {
                                            sQLiteDatabaseM10707A.close();
                                        }
                                        i6++;
                                        i = 100;
                                        i2 = 0;
                                        i5 = 5;
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        c4617o3M10387r.mo10684l().f24418f.m10812b("Error reading entries from local database", e);
                                        c4617o3M10387r.f24226d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM10707A != null) {
                                            sQLiteDatabaseM10707A.close();
                                        }
                                        i6++;
                                        i = 100;
                                        i2 = 0;
                                        i5 = 5;
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        if (sQLiteDatabaseM10707A != null && sQLiteDatabaseM10707A.inTransaction()) {
                                            sQLiteDatabaseM10707A.endTransaction();
                                        }
                                        c4617o3M10387r.mo10684l().f24418f.m10812b("Error reading entries from local database", e);
                                        c4617o3M10387r.f24226d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM10707A != null) {
                                            sQLiteDatabaseM10707A.close();
                                        }
                                        i6++;
                                        i = 100;
                                        i2 = 0;
                                        i5 = 5;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused7) {
                                sQLiteDatabaseM10707A = null;
                            } catch (SQLiteFullException e7) {
                                e = e7;
                                sQLiteDatabaseM10707A = null;
                            } catch (SQLiteException e8) {
                                e = e8;
                                sQLiteDatabaseM10707A = null;
                            } catch (Throwable th6) {
                                th = th6;
                                sQLiteDatabase = null;
                            }
                        } else {
                            c4617o3M10387r.mo10684l().f24421i.m10811a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i6++;
                        i = 100;
                        i2 = 0;
                        i5 = 5;
                    }
                } else {
                    arrayList = arrayList3;
                }
            }
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = 0;
            }
            if (abstractC2767a != null && size < 100) {
                arrayList2.add(abstractC2767a);
            }
            int size2 = arrayList2.size();
            int i9 = 0;
            while (i9 < size2) {
                int i10 = i9 + 1;
                AbstractC2767a abstractC2767a2 = (AbstractC2767a) arrayList2.get(i9);
                if (abstractC2767a2 instanceof C4625p) {
                    try {
                        interfaceC4569k3.mo10405r5((C4625p) abstractC2767a2, c4480ca);
                    } catch (RemoteException e9) {
                        mo10684l().f24418f.m10812b("Failed to send event to the service", e9);
                    }
                } else if (abstractC2767a2 instanceof C4712w9) {
                    try {
                        interfaceC4569k3.mo10395X5((C4712w9) abstractC2767a2, c4480ca);
                    } catch (RemoteException e10) {
                        mo10684l().f24418f.m10812b("Failed to send user property to the service", e10);
                    }
                } else if (abstractC2767a2 instanceof C4624oa) {
                    try {
                        interfaceC4569k3.mo10400g6((C4624oa) abstractC2767a2, c4480ca);
                    } catch (RemoteException e11) {
                        mo10684l().f24418f.m10812b("Failed to send conditional user property to the service", e11);
                    }
                } else {
                    mo10684l().f24418f.m10811a("Discarding data. Unrecognized parcel type.");
                }
                i9 = i10;
            }
            i4++;
            i3 = size;
            i = 100;
            i2 = 0;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m10777y(C4624oa c4624oa) {
        boolean zM10708x;
        mo10381b();
        m10479t();
        C4617o3 c4617o3M10387r = m10387r();
        c4617o3M10387r.m10817f();
        byte[] bArrM10860g0 = C4723x9.m10860g0(c4624oa);
        if (bArrM10860g0.length > 131072) {
            c4617o3M10387r.mo10684l().f24419g.m10811a("Conditional user property too long for local database. Sending directly to service");
            zM10708x = false;
        } else {
            zM10708x = c4617o3M10387r.m10708x(2, bArrM10860g0);
        }
        m10778z(new RunnableC4562j8(this, zM10708x, new C4624oa(c4624oa), m10775I(true), c4624oa));
    }

    /* JADX INFO: renamed from: z */
    public final void m10778z(Runnable runnable) throws IllegalStateException {
        mo10381b();
        if (m10768B()) {
            runnable.run();
        } else {
            if (this.f24459h.size() >= 1000) {
                mo10684l().f24418f.m10811a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f24459h.add(runnable);
            this.f24460i.m10596b(60000L);
            m10769C();
        }
    }
}
