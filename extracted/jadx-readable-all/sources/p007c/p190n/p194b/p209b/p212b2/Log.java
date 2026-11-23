package p007c.p190n.p194b.p209b.p212b2;

import android.text.TextUtils;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.b.b2.p, reason: use source file name */
/* JADX INFO: compiled from: Log.java */
/* JADX INFO: loaded from: classes.dex */
public final class Log {
    @Pure
    /* JADX INFO: renamed from: a */
    public static String m3153a(String str, Throwable th) {
        String strM3155c = m3155c(th);
        if (TextUtils.isEmpty(strM3155c)) {
            return str;
        }
        StringBuilder sbM1561L = outline.m1561L(str, "\n  ");
        sbM1561L.append(strM3155c.replace("\n", "\n  "));
        sbM1561L.append('\n');
        return sbM1561L.toString();
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public static void m3154b(String str, String str2, Throwable th) {
        android.util.Log.e(str, m3153a(str2, th));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0015 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0018  */
    @Pure
    /* JADX INFO: renamed from: c */
    public static String m3155c(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                z = true;
                if (z) {
                    return "UnknownHostException (no network)";
                }
                return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
        }
        z = false;
        if (z) {
            return "UnknownHostException (no network)";
        }
        return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    @Pure
    /* JADX INFO: renamed from: d */
    public static void m3156d(String str, String str2, Throwable th) {
        android.util.Log.w(str, m3153a(str2, th));
    }
}
