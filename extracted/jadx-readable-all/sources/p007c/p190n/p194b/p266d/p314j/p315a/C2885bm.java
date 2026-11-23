package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.bm */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2885bm {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<ExecutorService> f12732a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b */
    public final Object f12733b = new Object();

    /* JADX INFO: renamed from: c */
    public String f12734c = null;

    /* JADX INFO: renamed from: d */
    public String f12735d = null;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f12736e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f12737f = new AtomicInteger(-1);

    /* JADX INFO: renamed from: g */
    public final AtomicReference<Object> f12738g = new AtomicReference<>(null);

    /* JADX INFO: renamed from: h */
    public final AtomicReference<Object> f12739h = new AtomicReference<>(null);

    /* JADX INFO: renamed from: i */
    public final ConcurrentMap<String, Method> f12740i = new ConcurrentHashMap(9);

    /* JADX INFO: renamed from: j */
    public final AtomicReference<InterfaceC3079gu> f12741j = new AtomicReference<>(null);

    /* JADX INFO: renamed from: k */
    public final BlockingQueue<FutureTask<?>> f12742k = new ArrayBlockingQueue(20);

    /* JADX INFO: renamed from: l */
    public final Object f12743l = new Object();

    /* JADX INFO: renamed from: m */
    public static final boolean m6042m(Context context) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14304Z;
        C2862b c2862b = C2862b.f12493a;
        if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.m12664a(context, ModuleDescriptor.MODULE_ID) < ((Integer) c2862b.f12496d.m6596a(C3052g3.f14311a0)).intValue()) {
            return false;
        }
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14318b0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m6043a(String str, boolean z) {
        if (this.f12736e.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        C2622l.m5226A3(sb.toString());
        if (z) {
            C2622l.m5226A3("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f12736e.set(true);
        }
    }

    /* JADX INFO: renamed from: b */
    public final ExecutorService m6044b() {
        if (this.f12732a.get() == null) {
            AbstractC3718y2<Integer> abstractC3718y2 = C3052g3.f14298Y;
            C2862b c2862b = C2862b.f12493a;
            this.f12732a.compareAndSet(null, new ThreadPoolExecutor(((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue(), ((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC3737yl(this)));
        }
        return this.f12732a.get();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6045c(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                m6043a("getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m6046d(final String str, final InterfaceC2848am interfaceC2848am) {
        synchronized (this.f12741j) {
            FutureTask<?> futureTask = new FutureTask<>(new Runnable(this, interfaceC2848am, str) { // from class: c.n.b.d.j.a.ol

                /* JADX INFO: renamed from: f */
                public final C2885bm f17665f;

                /* JADX INFO: renamed from: g */
                public final InterfaceC2848am f17666g;

                /* JADX INFO: renamed from: h */
                public final String f17667h;

                {
                    this.f17665f = this;
                    this.f17666g = interfaceC2848am;
                    this.f17667h = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2885bm c2885bm = this.f17665f;
                    InterfaceC2848am interfaceC2848am2 = this.f17666g;
                    String str2 = this.f17667h;
                    if (c2885bm.f12741j.get() != null) {
                        try {
                            interfaceC2848am2.mo5828a(c2885bm.f12741j.get());
                        } catch (Exception unused) {
                            c2885bm.m6043a(str2, false);
                        }
                    }
                }
            }, null);
            if (this.f12741j.get() != null) {
                futureTask.run();
            } else {
                this.f12742k.offer(futureTask);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final <T> T m6047e(String str, T t, InterfaceC3774zl<T> interfaceC3774zl) {
        synchronized (this.f12741j) {
            if (this.f12741j.get() != null) {
                try {
                    return interfaceC3774zl.mo7591a(this.f12741j.get());
                } catch (Exception unused) {
                    m6043a(str, false);
                }
            }
            return t;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX INFO: renamed from: f */
    public final boolean m6048f(Context context) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14262S;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && !this.f12736e.get()) {
            if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14325c0)).booleanValue()) {
                return true;
            }
            if (this.f12737f.get() == -1) {
                gx2 gx2Var = gx2.f14692a;
                C3331nn c3331nn = gx2Var.f14693b;
                if (C3331nn.m7888f(context, 12451000)) {
                    this.f12737f.set(1);
                } else {
                    C3331nn c3331nn2 = gx2Var.f14693b;
                    if (C3331nn.m7889g(context)) {
                        C2622l.m5226A3("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f12737f.set(0);
                    } else {
                        this.f12737f.set(1);
                    }
                }
            }
            if (this.f12737f.get() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final String m6049g(Context context) {
        if (!m6048f(context)) {
            return null;
        }
        synchronized (this.f12733b) {
            String str = this.f12734c;
            if (str != null) {
                return str;
            }
            if (m6042m(context)) {
                this.f12734c = (String) m6047e("getGmpAppId", this.f12734c, C3588ul.f20369a);
            } else {
                this.f12734c = (String) m6058q("getGmpAppId", context);
            }
            return this.f12734c;
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m6050h(final Context context) {
        if (!m6048f(context)) {
            return null;
        }
        long jLongValue = ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14292X)).longValue();
        if (m6042m(context)) {
            try {
                return jLongValue < 0 ? (String) m6047e("getAppInstanceId", null, C3626vl.f20824a) : (String) m6044b().submit(new Callable(this) { // from class: c.n.b.d.j.a.wl

                    /* JADX INFO: renamed from: a */
                    public final C2885bm f21256a;

                    {
                        this.f21256a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return (String) this.f21256a.m6047e("getAppInstanceId", null, C3403pl.f18022a);
                    }
                }).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (jLongValue < 0) {
            return (String) m6058q("getAppInstanceId", context);
        }
        try {
            return (String) m6044b().submit(new Callable(this, context) { // from class: c.n.b.d.j.a.xl

                /* JADX INFO: renamed from: a */
                public final C2885bm f21580a;

                /* JADX INFO: renamed from: b */
                public final Context f21581b;

                {
                    this.f21580a = this;
                    this.f21581b = context;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return (String) this.f21580a.m6058q("getAppInstanceId", this.f21581b);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m6051i(Context context) {
        if (!m6048f(context)) {
            return null;
        }
        if (m6042m(context)) {
            Long l = (Long) m6047e("getAdEventId", null, C3255ll.f16399a);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object objM6058q = m6058q("generateEventId", context);
        if (objM6058q != null) {
            return objM6058q.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m6052j(Context context, String str) {
        m6055n(context, "_ac", str, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m6053k(Context context, String str) {
        m6055n(context, "_ai", str, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m6054l(Context context, String str, String str2, String str3, int i) {
        if (m6048f(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            m6055n(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            C2096e.m4590z(sb.toString());
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6055n(Context context, final String str, String str2, Bundle bundle) {
        if (m6048f(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                String strValueOf = String.valueOf(str2);
                C2622l.m5438t3(strValueOf.length() != 0 ? "Invalid event ID: ".concat(strValueOf) : new String("Invalid event ID: "), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (m6042m(context)) {
                m6046d("logEventInternal", new InterfaceC2848am(str, bundle2) { // from class: c.n.b.d.j.a.nl

                    /* JADX INFO: renamed from: a */
                    public final String f17153a;

                    /* JADX INFO: renamed from: b */
                    public final Bundle f17154b;

                    {
                        this.f17153a = str;
                        this.f17154b = bundle2;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2848am
                    /* JADX INFO: renamed from: a */
                    public final void mo5828a(InterfaceC3079gu interfaceC3079gu) throws RemoteException {
                        interfaceC3079gu.mo6621f0("am", this.f17153a, this.f17154b);
                    }
                });
                return;
            }
            if (m6045c(context, "com.google.android.gms.measurement.AppMeasurement", this.f12738g, true)) {
                Method declaredMethod = this.f12740i.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f12740i.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        m6043a("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f12738g.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    m6043a("logEventInternal", true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final Method m6056o(Context context, String str) {
        Method method = this.f12740i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f12740i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m6043a(str, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m6057p(Context context, String str, String str2) {
        if (m6045c(context, "com.google.android.gms.measurement.AppMeasurement", this.f12738g, true)) {
            Method declaredMethod = this.f12740i.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f12740i.put(str2, declaredMethod);
                } catch (Exception unused) {
                    m6043a(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f12738g.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                C2096e.m4590z(sb.toString());
            } catch (Exception unused2) {
                m6043a(str2, false);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final Object m6058q(String str, Context context) {
        if (!m6045c(context, "com.google.android.gms.measurement.AppMeasurement", this.f12738g, true)) {
            return null;
        }
        try {
            return m6056o(context, str).invoke(this.f12738g.get(), new Object[0]);
        } catch (Exception unused) {
            m6043a(str, true);
            return null;
        }
    }
}
