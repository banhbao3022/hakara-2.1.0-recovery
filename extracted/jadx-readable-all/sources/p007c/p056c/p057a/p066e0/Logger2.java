package p007c.p056c.p057a.p066e0;

import android.util.Log;
import java.util.Objects;
import java.util.Set;
import p007c.p056c.p057a.LottieLogger;

/* JADX INFO: renamed from: c.c.a.e0.d, reason: use source file name */
/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes.dex */
public class Logger2 {

    /* JADX INFO: renamed from: a */
    public static LottieLogger f2324a = new LogcatLogger();

    /* JADX INFO: renamed from: a */
    public static void m1419a(String str) {
        Objects.requireNonNull((LogcatLogger) f2324a);
    }

    /* JADX INFO: renamed from: b */
    public static void m1420b(String str) {
        Objects.requireNonNull((LogcatLogger) f2324a);
        Set<String> set = LogcatLogger.f2323a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        set.add(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m1421c(String str, Throwable th) {
        Objects.requireNonNull((LogcatLogger) f2324a);
        Set<String> set = LogcatLogger.f2323a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }
}
