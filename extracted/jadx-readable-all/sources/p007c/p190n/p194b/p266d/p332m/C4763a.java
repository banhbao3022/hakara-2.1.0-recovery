package p007c.p190n.p194b.p266d.p332m;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p305s.C2777b;
import p007c.p190n.p194b.p266d.p298f.p305s.InterfaceC2776a;
import p007c.p190n.p194b.p266d.p298f.p306t.C2779b;
import p007c.p190n.p194b.p266d.p298f.p306t.C2780c;
import p007c.p190n.p194b.p266d.p298f.p307u.C2788h;
import p007c.p190n.p194b.p266d.p298f.p307u.C2789i;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.m.a */
/* JADX INFO: loaded from: classes.dex */
public class C4763a {

    /* JADX INFO: renamed from: a */
    public static ScheduledExecutorService f24655a;

    /* JADX INFO: renamed from: b */
    public final Object f24656b;

    /* JADX INFO: renamed from: c */
    public final PowerManager.WakeLock f24657c;

    /* JADX INFO: renamed from: d */
    public WorkSource f24658d;

    /* JADX INFO: renamed from: e */
    public final int f24659e;

    /* JADX INFO: renamed from: f */
    public final String f24660f;

    /* JADX INFO: renamed from: g */
    public final Context f24661g;

    /* JADX INFO: renamed from: h */
    public boolean f24662h;

    /* JADX INFO: renamed from: i */
    public final Map<String, Integer[]> f24663i;

    /* JADX INFO: renamed from: j */
    public int f24664j;

    /* JADX INFO: renamed from: k */
    public AtomicInteger f24665k;

    public C4763a(Context context, int i, String str) {
        InterfaceC2776a interfaceC2776a;
        WorkSource workSource = null;
        String packageName = context == null ? null : context.getPackageName();
        this.f24656b = this;
        this.f24662h = true;
        this.f24663i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.f24665k = new AtomicInteger(0);
        C2622l.m5379i(context, "WakeLock: context must not be null");
        C2622l.m5364f(str, "WakeLock: wakeLockName must not be empty");
        this.f24659e = i;
        this.f24661g = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f24660f = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f24660f = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        this.f24657c = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (C2789i.m5631a(context)) {
            packageName = C2788h.m5630a(packageName) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = C2794c.m5637a(context).f11958a.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        Log.e("WorkSourceUtil", packageName.length() != 0 ? "Could not get applicationInfo from package: ".concat(packageName) : new String("Could not get applicationInfo from package: "));
                    } else {
                        int i2 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method = C2789i.f11950b;
                        if (method != null) {
                            try {
                                method.invoke(workSource, Integer.valueOf(i2), packageName);
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            Method method2 = C2789i.f11949a;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, Integer.valueOf(i2));
                                } catch (Exception e2) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", packageName.length() != 0 ? "Could not find package: ".concat(packageName) : new String("Could not find package: "));
                }
            }
            this.f24658d = workSource;
            if (workSource != null && C2789i.m5631a(this.f24661g)) {
                WorkSource workSource2 = this.f24658d;
                if (workSource2 != null) {
                    workSource2.add(workSource);
                } else {
                    this.f24658d = workSource;
                }
                try {
                    this.f24657c.setWorkSource(this.f24658d);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
                    Log.wtf("WakeLock", e3.toString());
                }
            }
        }
        if (f24655a == null) {
            synchronized (C2622l.class) {
                if (C2622l.f11593a == null) {
                    C2622l.f11593a = new C2777b();
                }
                interfaceC2776a = C2622l.f11593a;
            }
            Objects.requireNonNull((C2777b) interfaceC2776a);
            f24655a = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[Catch: all -> 0x008c, TryCatch #0 {, blocks: (B:7:0x0010, B:9:0x0019, B:14:0x002c, B:16:0x0031, B:18:0x003b, B:25:0x0061, B:26:0x0073, B:19:0x004a, B:21:0x0059, B:23:0x005d, B:11:0x001d, B:13:0x0025), top: B:34:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[Catch: all -> 0x008c, TryCatch #0 {, blocks: (B:7:0x0010, B:9:0x0019, B:14:0x002c, B:16:0x0031, B:18:0x003b, B:25:0x0061, B:26:0x0073, B:19:0x004a, B:21:0x0059, B:23:0x005d, B:11:0x001d, B:13:0x0025), top: B:34:0x0010 }] */
    /* JADX INFO: renamed from: a */
    public void m10919a(long j2) {
        this.f24665k.incrementAndGet();
        if (this.f24662h) {
            TextUtils.isEmpty(null);
        }
        synchronized (this.f24656b) {
            boolean z = false;
            if ((!this.f24663i.isEmpty() || this.f24664j > 0) && !this.f24657c.isHeld()) {
                this.f24663i.clear();
                this.f24664j = 0;
            }
            if (this.f24662h) {
                Integer[] numArr = this.f24663i.get(null);
                if (numArr == null) {
                    this.f24663i.put(null, new Integer[]{1});
                    z = true;
                } else {
                    numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                }
                if (z) {
                    C2780c c2780c = C2780c.f11943a;
                    C2779b.m5619a(this.f24657c, null);
                    m10921c();
                    Objects.requireNonNull(c2780c);
                    this.f24664j++;
                } else if (!this.f24662h) {
                    C2780c c2780c2 = C2780c.f11943a;
                    C2779b.m5619a(this.f24657c, null);
                    m10921c();
                    Objects.requireNonNull(c2780c2);
                    this.f24664j++;
                }
            } else if (!this.f24662h && this.f24664j == 0) {
                C2780c c2780c3 = C2780c.f11943a;
                C2779b.m5619a(this.f24657c, null);
                m10921c();
                Objects.requireNonNull(c2780c3);
                this.f24664j++;
            }
        }
        this.f24657c.acquire();
        if (j2 > 0) {
            f24655a.schedule(new RunnableC4764b(this), j2, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053 A[Catch: all -> 0x0072, TryCatch #0 {, blocks: (B:10:0x0024, B:12:0x0029, B:24:0x005b, B:25:0x006d, B:15:0x0035, B:17:0x003d, B:18:0x0044, B:20:0x0053, B:22:0x0057), top: B:31:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b A[Catch: all -> 0x0072, TryCatch #0 {, blocks: (B:10:0x0024, B:12:0x0029, B:24:0x005b, B:25:0x006d, B:15:0x0035, B:17:0x003d, B:18:0x0044, B:20:0x0053, B:22:0x0057), top: B:31:0x0024 }] */
    /* JADX INFO: renamed from: b */
    public void m10920b() {
        if (this.f24665k.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f24660f).concat(" release without a matched acquire!"));
        }
        if (this.f24662h) {
            TextUtils.isEmpty(null);
        }
        synchronized (this.f24656b) {
            if (this.f24662h) {
                Integer[] numArr = this.f24663i.get(null);
                boolean z = false;
                if (numArr != null) {
                    if (numArr[0].intValue() == 1) {
                        this.f24663i.remove(null);
                        z = true;
                    } else {
                        numArr[0] = Integer.valueOf(numArr[0].intValue() - 1);
                    }
                }
                if (z) {
                    C2780c c2780c = C2780c.f11943a;
                    C2779b.m5619a(this.f24657c, null);
                    m10921c();
                    Objects.requireNonNull(c2780c);
                    this.f24664j--;
                } else if (!this.f24662h && this.f24664j == 1) {
                    C2780c c2780c2 = C2780c.f11943a;
                    C2779b.m5619a(this.f24657c, null);
                    m10921c();
                    Objects.requireNonNull(c2780c2);
                    this.f24664j--;
                }
            } else if (!this.f24662h) {
                C2780c c2780c3 = C2780c.f11943a;
                C2779b.m5619a(this.f24657c, null);
                m10921c();
                Objects.requireNonNull(c2780c3);
                this.f24664j--;
            }
        }
        m10922d();
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m10921c() {
        int iIntValue;
        Method method;
        WorkSource workSource = this.f24658d;
        Method method2 = C2789i.f11949a;
        ArrayList arrayList = new ArrayList();
        if (workSource == null || (method = C2789i.f11951c) == null) {
            iIntValue = 0;
        } else {
            try {
                Object objInvoke = method.invoke(workSource, new Object[0]);
                Objects.requireNonNull(objInvoke, "null reference");
                iIntValue = ((Integer) objInvoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                iIntValue = 0;
            }
        }
        if (iIntValue != 0) {
            for (int i = 0; i < iIntValue; i++) {
                Method method3 = C2789i.f11952d;
                String str = null;
                if (method3 != null) {
                    try {
                        str = (String) method3.invoke(workSource, Integer.valueOf(i));
                    } catch (Exception e2) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                    }
                }
                if (!C2788h.m5630a(str)) {
                    Objects.requireNonNull(str, "null reference");
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m10922d() {
        if (this.f24657c.isHeld()) {
            try {
                this.f24657c.release();
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
                Log.e("WakeLock", String.valueOf(this.f24660f).concat(" was already released!"), e);
            }
            this.f24657c.isHeld();
        }
    }
}
