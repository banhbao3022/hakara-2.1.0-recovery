package p007c.p085g.p086a.p112s;

import android.os.SystemClock;

/* JADX INFO: renamed from: c.g.a.s.f, reason: use source file name */
/* JADX INFO: compiled from: LogTime.java */
/* JADX INFO: loaded from: classes.dex */
public final class LogTime {

    /* JADX INFO: renamed from: a */
    public static final double f3819a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f3820b = 0;

    /* JADX INFO: renamed from: a */
    public static double m2040a(long j2) {
        return (SystemClock.elapsedRealtimeNanos() - j2) * f3819a;
    }
}
