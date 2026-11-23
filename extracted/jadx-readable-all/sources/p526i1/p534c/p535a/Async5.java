package p526i1.p534c.p535a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: i1.c.a.e, reason: use source file name */
/* JADX INFO: compiled from: Async.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Async5 {

    /* JADX INFO: renamed from: a */
    public static ExecutorService f30867a;

    /* JADX INFO: renamed from: b */
    public static final Async5 f30868b = null;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        Intrinsics2.m13086b(scheduledExecutorServiceNewScheduledThreadPool, "Executors.newScheduledTh…().availableProcessors())");
        f30867a = scheduledExecutorServiceNewScheduledThreadPool;
    }
}
