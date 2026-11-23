package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rv1 extends nv1 implements ScheduledExecutorService, lv1 {

    /* JADX INFO: renamed from: g */
    public final ScheduledExecutorService f19232g;

    public rv1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f19232g = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        yv1 yv1Var = new yv1(Executors.callable(runnable, null));
        return new pv1(yv1Var, this.f19232g.schedule(yv1Var, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        qv1 qv1Var = new qv1(runnable);
        return new pv1(qv1Var, this.f19232g.scheduleAtFixedRate(qv1Var, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        qv1 qv1Var = new qv1(runnable);
        return new pv1(qv1Var, this.f19232g.scheduleWithFixedDelay(qv1Var, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        yv1 yv1Var = new yv1(callable);
        return new pv1(yv1Var, this.f19232g.schedule(yv1Var, j2, timeUnit));
    }
}
