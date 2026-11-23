package p500e1.p501a.p504d2;

import java.util.concurrent.TimeUnit;
import p007c.p451o.p452a.C5729a;
import p477d1.p478a0._Ranges;
import p500e1.p501a.p503c2.SystemProps;

/* JADX INFO: renamed from: e1.a.d2.l, reason: use source file name */
/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Tasks8 {

    /* JADX INFO: renamed from: a */
    public static final long f29727a = C5729a.m12441N("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: b */
    public static final int f29728b;

    /* JADX INFO: renamed from: c */
    public static final int f29729c;

    /* JADX INFO: renamed from: d */
    public static final long f29730d;

    /* JADX INFO: renamed from: e */
    public static Tasks4 f29731e;

    static {
        C5729a.m12440M("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        int i = SystemProps.f29670a;
        int iM12440M = C5729a.m12440M("kotlinx.coroutines.scheduler.core.pool.size", i < 2 ? 2 : i, 1, 0, 8, null);
        f29728b = iM12440M;
        f29729c = C5729a.m12440M("kotlinx.coroutines.scheduler.max.pool.size", _Ranges.m12967b(i * 128, iM12440M, 2097150), 0, 2097150, 4, null);
        f29730d = TimeUnit.SECONDS.toNanos(C5729a.m12441N("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        f29731e = Tasks2.f29722a;
    }
}
