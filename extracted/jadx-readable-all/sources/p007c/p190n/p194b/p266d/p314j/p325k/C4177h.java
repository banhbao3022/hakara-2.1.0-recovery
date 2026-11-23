package p007c.p190n.p194b.p266d.p314j.p325k;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.C2784d;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p007c.p190n.p194b.p266d.p327k.p328a.C4444a;
import p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4464b6;

/* JADX INFO: renamed from: c.n.b.d.j.k.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4177h {

    /* JADX INFO: renamed from: a */
    public static volatile C4177h f23194a;

    /* JADX INFO: renamed from: b */
    public static Boolean f23195b;

    /* JADX INFO: renamed from: c */
    public final String f23196c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2782b f23197d;

    /* JADX INFO: renamed from: e */
    public final ExecutorService f23198e;

    /* JADX INFO: renamed from: f */
    public final C4444a f23199f;

    /* JADX INFO: renamed from: g */
    public final List<Pair<InterfaceC4464b6, c>> f23200g;

    /* JADX INFO: renamed from: h */
    public int f23201h;

    /* JADX INFO: renamed from: i */
    public boolean f23202i;

    /* JADX INFO: renamed from: j */
    public String f23203j;

    /* JADX INFO: renamed from: k */
    public volatile InterfaceC4302pc f23204k;

    /* JADX INFO: renamed from: c.n.b.d.j.k.h$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
    public abstract class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final long f23205f;

        /* JADX INFO: renamed from: g */
        public final long f23206g;

        /* JADX INFO: renamed from: h */
        public final boolean f23207h;

        public a(boolean z) {
            this.f23205f = C4177h.this.f23197d.mo5623c();
            this.f23206g = C4177h.this.f23197d.mo5621a();
            this.f23207h = z;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo9336a() throws RemoteException;

        /* JADX INFO: renamed from: b */
        public void mo9389b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4177h.this.f23202i) {
                mo9389b();
                return;
            }
            try {
                mo9336a();
            } catch (Exception e) {
                C4177h.this.m9638d(e, false, this.f23207h);
                mo9389b();
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.h$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
    public class b implements Application.ActivityLifecycleCallbacks {
        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C4177h c4177h = C4177h.this;
            c4177h.f23198e.execute(new C4178h0(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C4177h c4177h = C4177h.this;
            c4177h.f23198e.execute(new C4248m0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C4177h c4177h = C4177h.this;
            c4177h.f23198e.execute(new C4192i0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C4177h c4177h = C4177h.this;
            c4177h.f23198e.execute(new C4206j0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            BinderC4274nc binderC4274nc = new BinderC4274nc();
            C4177h c4177h = C4177h.this;
            c4177h.f23198e.execute(new C4220k0(this, activity, binderC4274nc));
            Bundle bundleM10098K2 = binderC4274nc.m10098K2(50L);
            if (bundleM10098K2 != null) {
                bundle.putAll(bundleM10098K2);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C4177h c4177h = C4177h.this;
            c4177h.f23198e.execute(new C4164g0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C4177h c4177h = C4177h.this;
            c4177h.f23198e.execute(new C4234l0(this, activity));
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.h$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
    public static class c extends AbstractBinderC4093b {

        /* JADX INFO: renamed from: f */
        public final InterfaceC4464b6 f23210f;

        public c(InterfaceC4464b6 interfaceC4464b6) {
            this.f23210f = interfaceC4464b6;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4107c
        /* JADX INFO: renamed from: V3 */
        public final void mo9492V3(String str, String str2, Bundle bundle, long j2) {
            this.f23210f.mo10409a(str, str2, bundle, j2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4107c
        public final int zza() {
            return System.identityHashCode(this.f23210f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    public C4177h(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        if (str == null || !m9635h(str2, str3)) {
            this.f23196c = "FA";
        } else {
            this.f23196c = str;
        }
        this.f23197d = C2784d.f11944a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4289p());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f23198e = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f23199f = new C4444a(this);
        this.f23200g = new ArrayList();
        try {
            z = C4340s8.m10211h(context, "google_app_id") != null;
        } catch (IllegalStateException unused) {
        }
        if (z) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                z2 = true;
            } catch (ClassNotFoundException unused2) {
                z2 = false;
            }
            if (z2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = true;
        }
        if (!z3) {
            this.f23203j = null;
            this.f23202i = true;
            Log.w(this.f23196c, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (m9635h(str2, str3)) {
            this.f23203j = str2;
        } else {
            this.f23203j = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f23196c, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f23196c, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        this.f23198e.execute(new C4219k(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f23196c, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    /* JADX INFO: renamed from: b */
    public static C4177h m9633b(Context context, String str, String str2, String str3, Bundle bundle) {
        Objects.requireNonNull(context, "null reference");
        if (f23194a == null) {
            synchronized (C4177h.class) {
                if (f23194a == null) {
                    f23194a = new C4177h(context, str, str2, str3, bundle);
                }
            }
        }
        return f23194a;
    }

    /* JADX INFO: renamed from: g */
    public static void m9634g(Context context) {
        boolean z;
        Bundle bundle;
        synchronized (C4177h.class) {
            try {
                if (f23195b != null) {
                    return;
                }
                C2622l.m5359e("app_measurement_internal_disable_startup_flags");
                try {
                    ApplicationInfo applicationInfoM5633a = C2794c.m5637a(context).m5633a(context.getPackageName(), 128);
                    z = (applicationInfoM5633a == null || (bundle = applicationInfoM5633a.metaData) == null) ? false : bundle.getBoolean("app_measurement_internal_disable_startup_flags");
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (z) {
                    f23195b = Boolean.TRUE;
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                f23195b = Boolean.valueOf(sharedPreferences.getBoolean("allow_remote_dynamite", true));
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.remove("allow_remote_dynamite");
                editorEdit.apply();
            } catch (Exception e) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e);
                f23195b = Boolean.TRUE;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m9635h(String str, String str2) {
        boolean z;
        if (str2 != null && str != null) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m9636a(Bundle bundle, boolean z) {
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        this.f23198e.execute(new C4424z(this, bundle, binderC4274nc));
        if (z) {
            return binderC4274nc.m10098K2(5000L);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, Object> m9637c(String str, String str2, boolean z) {
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        this.f23198e.execute(new C4398x(this, str, str2, z, binderC4274nc));
        Bundle bundleM10098K2 = binderC4274nc.m10098K2(5000L);
        if (bundleM10098K2 == null || bundleM10098K2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleM10098K2.size());
        for (String str3 : bundleM10098K2.keySet()) {
            Object obj = bundleM10098K2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public final void m9638d(Exception exc, boolean z, boolean z2) {
        this.f23202i |= z;
        if (z) {
            Log.w(this.f23196c, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            this.f23198e.execute(new C4080a0(this, "Error with data collection. Data lost.", exc));
        }
        Log.w(this.f23196c, "Error with data collection. Data lost.", exc);
    }

    /* JADX INFO: renamed from: e */
    public final void m9639e(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        this.f23198e.execute(new C4150f0(this, null, str, str2, bundle, z, z2));
    }

    /* JADX INFO: renamed from: f */
    public final List<Bundle> m9640f(String str, String str2) {
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        this.f23198e.execute(new C4233l(this, str, str2, binderC4274nc));
        List<Bundle> list = (List) BinderC4274nc.m10097i1(binderC4274nc.m10098K2(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: i */
    public final int m9641i(String str) {
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        this.f23198e.execute(new C4094b0(this, str, binderC4274nc));
        Integer num = (Integer) BinderC4274nc.m10097i1(binderC4274nc.m10098K2(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: j */
    public final long m9642j() {
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        this.f23198e.execute(new C4372v(this, binderC4274nc));
        Long l = (Long) BinderC4274nc.m10097i1(binderC4274nc.m10098K2(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f23197d.mo5623c()).nextLong();
        int i = this.f23201h + 1;
        this.f23201h = i;
        return jNextLong + ((long) i);
    }
}
