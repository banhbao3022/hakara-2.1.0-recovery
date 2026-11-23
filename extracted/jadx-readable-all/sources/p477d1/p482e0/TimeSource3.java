package p477d1.p482e0;

import java.util.Objects;

/* JADX INFO: renamed from: d1.e0.e, reason: use source file name */
/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TimeSource3 {

    /* JADX INFO: renamed from: a */
    public static final TimeSource3 f29485a = new TimeSource3();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MonoTimeSource f29486b = MonoTimeSource.f29484a;

    /* JADX INFO: renamed from: a */
    public TimeSource2 m13019a() {
        MonoTimeSource monoTimeSource = this.f29486b;
        long jM13018a = monoTimeSource.m13018a();
        Objects.requireNonNull(Duration.f29483f);
        Duration.a aVar = Duration.f29483f;
        return new TimeSources.a(jM13018a, monoTimeSource, 0.0d, null);
    }

    public String toString() {
        Objects.requireNonNull(MonoTimeSource.f29484a);
        return "TimeSource(System.nanoTime())";
    }
}
