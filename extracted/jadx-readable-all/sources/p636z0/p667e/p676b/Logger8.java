package p636z0.p667e.p676b;

import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: z0.e.b.j1, reason: use source file name */
/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes.dex */
public final class Logger8 {

    /* JADX INFO: renamed from: a */
    public static int f35916a = 3;

    /* JADX INFO: renamed from: a */
    public static void m15272a(String str, String str2, Throwable th) {
        if (m15274c(str)) {
            Log.d(m15275d(str), str2, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m15273b(String str, String str2, Throwable th) {
        if (f35916a <= 6 || Log.isLoggable(m15275d(str), 6)) {
            Log.e(m15275d(str), str2, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15274c(String str) {
        return f35916a <= 3 || Log.isLoggable(m15275d(str), 3);
    }

    /* JADX INFO: renamed from: d */
    public static String m15275d(String str) {
        return (23 >= str.length() || Build.VERSION.SDK_INT >= 24) ? str : str.substring(0, 23);
    }

    /* JADX INFO: renamed from: e */
    public static void m15276e(String str, String str2, Throwable th) {
        if (f35916a <= 5 || Log.isLoggable(m15275d(str), 5)) {
            Log.w(m15275d(str), str2, th);
        }
    }
}
