package p007c.p190n.p194b.p266d.p298f.p307u;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import java.lang.reflect.Method;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.f.u.i */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2789i {

    /* JADX INFO: renamed from: a */
    public static final Method f11949a;

    /* JADX INFO: renamed from: b */
    public static final Method f11950b;

    /* JADX INFO: renamed from: c */
    public static final Method f11951c;

    /* JADX INFO: renamed from: d */
    public static final Method f11952d;

    static {
        Method method;
        Method method2;
        Method method3;
        Process.myUid();
        Method method4 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f11949a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f11950b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f11951c = method3;
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            method4 = WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        f11952d = method4;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5631a(@RecentlyNonNull Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        return C2794c.m5637a(context).f11958a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
    }
}
