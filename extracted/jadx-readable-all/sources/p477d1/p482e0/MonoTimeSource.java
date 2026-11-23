package p477d1.p482e0;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: d1.e0.c, reason: use source file name */
/* JADX INFO: compiled from: MonoTimeSource.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MonoTimeSource extends TimeSources {

    /* JADX INFO: renamed from: a */
    public static final MonoTimeSource f29484a = new MonoTimeSource();

    public MonoTimeSource() {
        super(TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: a */
    public long m13018a() {
        return System.nanoTime();
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
