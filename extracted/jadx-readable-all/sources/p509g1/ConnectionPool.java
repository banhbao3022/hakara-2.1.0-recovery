package p509g1;

import java.util.concurrent.TimeUnit;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.p513f.TaskRunner;
import p509g1.p510j0.p514g.RealConnectionPool;

/* JADX INFO: renamed from: g1.l, reason: use source file name */
/* JADX INFO: compiled from: ConnectionPool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionPool {

    /* JADX INFO: renamed from: a */
    public final RealConnectionPool f30588a;

    public ConnectionPool(RealConnectionPool realConnectionPool) {
        Intrinsics2.m13090f(realConnectionPool, "delegate");
        this.f30588a = realConnectionPool;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i, long j2, TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.f30169a, i, j2, timeUnit));
        Intrinsics2.m13090f(timeUnit, "timeUnit");
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
