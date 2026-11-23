package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.Log;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.a.mb */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3282mb {

    /* JADX INFO: renamed from: a */
    public static final boolean f16709a = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: b */
    public static final String f16710b = C3282mb.class.getName();

    /* JADX INFO: renamed from: a */
    public static void m7680a(String str, Object... objArr) {
        if (f16709a) {
            Log.v("Volley", m7683d(str, objArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7681b(String str, Object... objArr) {
        Log.d("Volley", m7683d(str, objArr));
    }

    /* JADX INFO: renamed from: c */
    public static void m7682c(String str, Object... objArr) {
        Log.e("Volley", m7683d(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public static String m7683d(String str, Object... objArr) {
        String strM1552C;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(f16710b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                strM1552C = outline.m1552C(new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length()), strSubstring2, ".", methodName);
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), strM1552C, str2);
            }
        }
        strM1552C = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), strM1552C, str2);
    }
}
