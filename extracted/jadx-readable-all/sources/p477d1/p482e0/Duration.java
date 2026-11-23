package p477d1.p482e0;

import java.util.concurrent.TimeUnit;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.e0.b, reason: use source file name */
/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Duration implements Comparable<Duration> {

    /* JADX INFO: renamed from: f */
    public static final a f29483f = new a(null);

    /* JADX INFO: renamed from: d1.e0.b$a */
    /* JADX INFO: compiled from: Duration.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static final double m13017f(double d) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics2.m13089e(timeUnit, "unit");
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        Intrinsics2.m13089e(timeUnit2, "sourceUnit");
        Intrinsics2.m13089e(timeUnit, "targetUnit");
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d * jConvert : d / timeUnit2.convert(1L, timeUnit);
    }
}
