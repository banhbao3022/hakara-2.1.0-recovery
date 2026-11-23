package p477d1.p482e0;

import java.util.concurrent.TimeUnit;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.e0.a, reason: use source file name */
/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class TimeSources {

    /* JADX INFO: renamed from: d1.e0.a$a */
    /* JADX INFO: compiled from: TimeSources.kt */
    public static final class a extends TimeSource2 {
        public a(long j2, TimeSources timeSources, double d, DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public TimeSources(TimeUnit timeUnit) {
        Intrinsics2.m13089e(timeUnit, "unit");
    }
}
