package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.C2783c;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p311h.C2803a;
import p007c.p190n.p194b.p266d.p311h.C2804b;
import p007c.p190n.p194b.p266d.p311h.C2805c;
import p007c.p190n.p194b.p266d.p311h.C2806d;
import p007c.p190n.p194b.p266d.p311h.C2807e;
import p007c.p190n.p194b.p266d.p311h.C2808f;
import p007c.p190n.p194b.p266d.p311h.C2809g;
import p007c.p190n.p194b.p266d.p311h.C2810h;
import p007c.p190n.p194b.p266d.p311h.C2811i;
import p007c.p190n.p194b.p266d.p311h.C2813k;
import p007c.p190n.p194b.p266d.p311h.C2814l;
import p007c.p190n.p194b.p266d.p311h.C2815m;
import p007c.p190n.p194b.p266d.p311h.InterfaceC2812j;
import p007c.p190n.p194b.p266d.p314j.p322h.C4064c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: e */
    public static Boolean f28678e = null;

    /* JADX INFO: renamed from: f */
    public static String f28679f = null;

    /* JADX INFO: renamed from: g */
    public static int f28680g = -1;

    /* JADX INFO: renamed from: k */
    public static C2814l f28684k;

    /* JADX INFO: renamed from: l */
    public static C2815m f28685l;

    /* JADX INFO: renamed from: m */
    public final Context f28686m;

    /* JADX INFO: renamed from: h */
    public static final ThreadLocal<C2810h> f28681h = new ThreadLocal<>();

    /* JADX INFO: renamed from: i */
    public static final ThreadLocal<Long> f28682i = new C2804b();

    /* JADX INFO: renamed from: j */
    public static final InterfaceC2812j f28683j = new C2805c();

    /* JADX INFO: renamed from: a */
    @RecentlyNonNull
    public static final InterfaceC5900b f28674a = new C2806d();

    /* JADX INFO: renamed from: b */
    @RecentlyNonNull
    public static final InterfaceC5900b f28675b = new C2807e();

    /* JADX INFO: renamed from: c */
    @RecentlyNonNull
    public static final InterfaceC5900b f28676c = new C2808f();

    /* JADX INFO: renamed from: d */
    @RecentlyNonNull
    public static final InterfaceC5900b f28677d = new C2809g();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @RecentlyNullable
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class C5899a extends Exception {
        public /* synthetic */ C5899a(String str) {
            super(str);
        }

        public /* synthetic */ C5899a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface InterfaceC5900b {
        /* JADX INFO: renamed from: a */
        C2813k mo5644a(Context context, String str, InterfaceC2812j interfaceC2812j) throws C5899a;
    }

    public DynamiteModule(Context context) {
        Objects.requireNonNull(context, "null reference");
        this.f28686m = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m12664a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (C2622l.m5459y(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            outline.m1573X(new StringBuilder(String.valueOf(str).length() + 45), "Local module descriptor class for ", str, " not found.", "DynamiteModule");
            return 0;
        } catch (Exception e) {
            String strValueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", strValueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(strValueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m12665b(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return m12667e(context, str, false);
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: d */
    public static DynamiteModule m12666d(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC5900b interfaceC5900b, @RecentlyNonNull String str) throws C5899a {
        Boolean bool;
        InterfaceC2799a interfaceC2799aM5647T1;
        DynamiteModule dynamiteModule;
        C2815m c2815m;
        Boolean boolValueOf;
        InterfaceC2799a interfaceC2799aM5650T1;
        ThreadLocal<C2810h> threadLocal = f28681h;
        C2810h c2810h = threadLocal.get();
        C2810h c2810h2 = new C2810h(null);
        threadLocal.set(c2810h2);
        ThreadLocal<Long> threadLocal2 = f28682i;
        long jLongValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C2813k c2813kMo5644a = interfaceC5900b.mo5644a(context, str, f28683j);
            int i = c2813kMo5644a.f11969a;
            int i2 = c2813kMo5644a.f11970b;
            StringBuilder sb = new StringBuilder(str.length() + 68 + str.length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            Log.i("DynamiteModule", sb.toString());
            int i3 = c2813kMo5644a.f11971c;
            if (i3 == 0 || ((i3 == -1 && c2813kMo5644a.f11969a == 0) || (i3 == 1 && c2813kMo5644a.f11970b == 0))) {
                int i4 = c2813kMo5644a.f11969a;
                int i5 = c2813kMo5644a.f11970b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i4);
                sb2.append(" and remote version is ");
                sb2.append(i5);
                sb2.append(".");
                throw new C5899a(sb2.toString());
            }
            if (i3 == -1) {
                DynamiteModule dynamiteModuleM12670h = m12670h(context, str);
                if (jLongValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(jLongValue));
                }
                Cursor cursor = c2810h2.f11967a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(c2810h);
                return dynamiteModuleM12670h;
            }
            if (i3 != 1) {
                throw new C5899a("VersionPolicy returned invalid code:0");
            }
            try {
                int i6 = c2813kMo5644a.f11970b;
                try {
                    synchronized (DynamiteModule.class) {
                        bool = f28678e;
                    }
                    if (bool == null) {
                        throw new C5899a("Failed to determine which loading route to use.");
                    }
                    if (bool.booleanValue()) {
                        StringBuilder sb3 = new StringBuilder(str.length() + 51);
                        sb3.append("Selected remote version of ");
                        sb3.append(str);
                        sb3.append(", version >= ");
                        sb3.append(i6);
                        Log.i("DynamiteModule", sb3.toString());
                        synchronized (DynamiteModule.class) {
                            c2815m = f28685l;
                        }
                        if (c2815m == null) {
                            throw new C5899a("DynamiteLoaderV2 was not cached.");
                        }
                        C2810h c2810h3 = threadLocal.get();
                        if (c2810h3 == null || c2810h3.f11967a == null) {
                            throw new C5899a("No result cursor");
                        }
                        Context applicationContext = context.getApplicationContext();
                        Cursor cursor2 = c2810h3.f11967a;
                        new BinderC2800b(null);
                        synchronized (DynamiteModule.class) {
                            boolValueOf = Boolean.valueOf(f28680g >= 2);
                        }
                        if (boolValueOf.booleanValue()) {
                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                            interfaceC2799aM5650T1 = c2815m.m5649K2(new BinderC2800b(applicationContext), str, i6, new BinderC2800b(cursor2));
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                            interfaceC2799aM5650T1 = c2815m.m5650T1(new BinderC2800b(applicationContext), str, i6, new BinderC2800b(cursor2));
                        }
                        Context context2 = (Context) BinderC2800b.m5639T1(interfaceC2799aM5650T1);
                        if (context2 == null) {
                            throw new C5899a("Failed to get module context");
                        }
                        dynamiteModule = new DynamiteModule(context2);
                    } else {
                        StringBuilder sb4 = new StringBuilder(str.length() + 51);
                        sb4.append("Selected remote version of ");
                        sb4.append(str);
                        sb4.append(", version >= ");
                        sb4.append(i6);
                        Log.i("DynamiteModule", sb4.toString());
                        C2814l c2814lM12672j = m12672j(context);
                        if (c2814lM12672j == null) {
                            throw new C5899a("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelM9327E0 = c2814lM12672j.m9327E0(6, c2814lM12672j.m9328i1());
                        int i7 = parcelM9327E0.readInt();
                        parcelM9327E0.recycle();
                        if (i7 >= 3) {
                            C2810h c2810h4 = threadLocal.get();
                            if (c2810h4 == null) {
                                throw new C5899a("No cached result cursor holder");
                            }
                            interfaceC2799aM5647T1 = c2814lM12672j.m5645F3(new BinderC2800b(context), str, i6, new BinderC2800b(c2810h4.f11967a));
                        } else if (i7 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            interfaceC2799aM5647T1 = c2814lM12672j.m5646K2(new BinderC2800b(context), str, i6);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            interfaceC2799aM5647T1 = c2814lM12672j.m5647T1(new BinderC2800b(context), str, i6);
                        }
                        if (BinderC2800b.m5639T1(interfaceC2799aM5647T1) == null) {
                            throw new C5899a("Failed to load remote module.");
                        }
                        dynamiteModule = new DynamiteModule((Context) BinderC2800b.m5639T1(interfaceC2799aM5647T1));
                    }
                    if (jLongValue == 0) {
                        threadLocal2.remove();
                    } else {
                        threadLocal2.set(Long.valueOf(jLongValue));
                    }
                    Cursor cursor3 = c2810h2.f11967a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    threadLocal.set(c2810h);
                    return dynamiteModule;
                } catch (RemoteException e) {
                    throw new C5899a("Failed to load remote module.", e);
                } catch (C5899a e2) {
                    throw e2;
                } catch (Throwable th) {
                    C2783c.m5625a(context, th);
                    throw new C5899a("Failed to load remote module.", th);
                }
            } catch (C5899a e3) {
                String strValueOf = String.valueOf(e3.getMessage());
                Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to load remote module: ".concat(strValueOf) : new String("Failed to load remote module: "));
                int i8 = c2813kMo5644a.f11969a;
                if (i8 == 0 || interfaceC5900b.mo5644a(context, str, new C2811i(i8, 0)).f11971c != -1) {
                    throw new C5899a("Remote load failed. No local fallback found.", e3);
                }
                DynamiteModule dynamiteModuleM12670h2 = m12670h(context, str);
                if (jLongValue == 0) {
                    f28682i.remove();
                } else {
                    f28682i.set(Long.valueOf(jLongValue));
                }
                Cursor cursor4 = c2810h2.f11967a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                f28681h.set(c2810h);
                return dynamiteModuleM12670h2;
            }
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                f28682i.remove();
            } else {
                f28682i.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = c2810h2.f11967a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f28681h.set(c2810h);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m12667e(@RecentlyNonNull Context context, @RecentlyNonNull String str, boolean z) {
        ClassLoader c2803a;
        Throwable th;
        Cursor cursor;
        RemoteException e;
        int i;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f28678e;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader != null) {
                                    if (classLoader == ClassLoader.getSystemClassLoader()) {
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            m12671i(classLoader);
                                        } catch (C5899a unused) {
                                        }
                                        bool = Boolean.TRUE;
                                    }
                                } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        int iM12668f = m12668f(context, str, z);
                                        String str2 = f28679f;
                                        if (str2 != null && !str2.isEmpty()) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                String str3 = f28679f;
                                                Objects.requireNonNull(str3, "null reference");
                                                c2803a = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            } else {
                                                String str4 = f28679f;
                                                Objects.requireNonNull(str4, "null reference");
                                                c2803a = new C2803a(str4, ClassLoader.getSystemClassLoader());
                                            }
                                            m12671i(c2803a);
                                            declaredField.set(null, c2803a);
                                            f28678e = Boolean.TRUE;
                                            return iM12668f;
                                        }
                                        return iM12668f;
                                    } catch (C5899a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                                f28678e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String strValueOf = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(strValueOf);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m12668f(context, str, z);
                    } catch (C5899a e3) {
                        String strValueOf2 = String.valueOf(e3.getMessage());
                        Log.w("DynamiteModule", strValueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf2) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                C2814l c2814lM12672j = m12672j(context);
                try {
                    if (c2814lM12672j == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelM9327E0 = c2814lM12672j.m9327E0(6, c2814lM12672j.m9328i1());
                        int i2 = parcelM9327E0.readInt();
                        parcelM9327E0.recycle();
                        if (i2 >= 3) {
                            cursor = (Cursor) BinderC2800b.m5639T1(c2814lM12672j.m5648q3(new BinderC2800b(context), str, z, f28682i.get().longValue()));
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        i = cursor.getInt(0);
                                        cursor2 = (i <= 0 || !m12669g(cursor)) ? cursor : null;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e4) {
                                    e = e4;
                                    cursor2 = cursor;
                                    String strValueOf3 = String.valueOf(e.getMessage());
                                    Log.w("DynamiteModule", strValueOf3.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf3) : new String("Failed to retrieve remote module version: "));
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor == null) {
                                return 0;
                            }
                            cursor.close();
                            return 0;
                        }
                        if (i2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            BinderC2800b binderC2800b = new BinderC2800b(context);
                            Parcel parcelM9328i1 = c2814lM12672j.m9328i1();
                            C4064c.m9330b(parcelM9328i1, binderC2800b);
                            parcelM9328i1.writeString(str);
                            parcelM9328i1.writeInt(z ? 1 : 0);
                            Parcel parcelM9327E1 = c2814lM12672j.m9327E0(5, parcelM9328i1);
                            i = parcelM9327E1.readInt();
                            parcelM9327E1.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            BinderC2800b binderC2800b2 = new BinderC2800b(context);
                            Parcel parcelM9328i2 = c2814lM12672j.m9328i1();
                            C4064c.m9330b(parcelM9328i2, binderC2800b2);
                            parcelM9328i2.writeString(str);
                            parcelM9328i2.writeInt(z ? 1 : 0);
                            Parcel parcelM9327E2 = c2814lM12672j.m9327E0(3, parcelM9328i2);
                            i = parcelM9327E2.readInt();
                            parcelM9327E2.recycle();
                        }
                        return i;
                    } catch (RemoteException e5) {
                        e = e5;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor = null;
                }
            }
        } catch (Throwable th5) {
            C2783c.m5625a(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX INFO: renamed from: f */
    public static int m12668f(Context context, String str, boolean z) throws Throwable {
        Exception e;
        Throwable th;
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(f28682i.get().longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int i = cursorQuery.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    f28679f = cursorQuery.getString(2);
                                    int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        f28680g = cursorQuery.getInt(columnIndex);
                                    }
                                }
                                cursor = m12669g(cursorQuery) ? null : cursorQuery;
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof C5899a) {
                            throw e;
                        }
                        throw new C5899a("V2 version check failed", e);
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new C5899a("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12669g(Cursor cursor) {
        C2810h c2810h = f28681h.get();
        if (c2810h == null || c2810h.f11967a != null) {
            return false;
        }
        c2810h.f11967a = cursor;
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static DynamiteModule m12670h(Context context, String str) {
        String strValueOf = String.valueOf(str);
        Log.i("DynamiteModule", strValueOf.length() != 0 ? "Selected local version of ".concat(strValueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: i */
    public static void m12671i(ClassLoader classLoader) throws C5899a {
        C2815m c2815m;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c2815m = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c2815m = iInterfaceQueryLocalInterface instanceof C2815m ? (C2815m) iInterfaceQueryLocalInterface : new C2815m(iBinder);
            }
            f28685l = c2815m;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C5899a("Failed to instantiate dynamite loader", e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static C2814l m12672j(Context context) {
        C2814l c2814l;
        synchronized (DynamiteModule.class) {
            C2814l c2814l2 = f28684k;
            if (c2814l2 != null) {
                return c2814l2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c2814l = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c2814l = iInterfaceQueryLocalInterface instanceof C2814l ? (C2814l) iInterfaceQueryLocalInterface : new C2814l(iBinder);
                }
                if (c2814l != null) {
                    f28684k = c2814l;
                    return c2814l;
                }
            } catch (Exception e) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(strValueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: c */
    public IBinder m12673c(@RecentlyNonNull String str) throws C5899a {
        try {
            return (IBinder) this.f28686m.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String strValueOf = String.valueOf(str);
            throw new C5899a(strValueOf.length() != 0 ? "Failed to instantiate module class: ".concat(strValueOf) : new String("Failed to instantiate module class: "), e);
        }
    }
}
