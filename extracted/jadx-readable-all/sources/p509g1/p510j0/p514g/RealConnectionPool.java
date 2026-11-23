package p509g1.p510j0.p514g;

import java.lang.ref.Reference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Address;
import p509g1.Route;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p513f.Task2;
import p509g1.p510j0.p513f.TaskQueue2;
import p509g1.p510j0.p513f.TaskRunner;
import p509g1.p510j0.p519l.Platform;

/* JADX INFO: renamed from: g1.j0.g.j, reason: use source file name */
/* JADX INFO: compiled from: RealConnectionPool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RealConnectionPool {

    /* JADX INFO: renamed from: a */
    public final long f30257a;

    /* JADX INFO: renamed from: b */
    public final TaskQueue2 f30258b;

    /* JADX INFO: renamed from: c */
    public final b f30259c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentLinkedQueue<RealConnection> f30260d;

    /* JADX INFO: renamed from: e */
    public final int f30261e;

    /* JADX INFO: renamed from: g1.j0.g.j$a */
    /* JADX INFO: compiled from: RealConnectionPool.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.j0.g.j$b */
    /* JADX INFO: compiled from: RealConnectionPool.kt */
    public static final class b extends Task2 {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // p509g1.p510j0.p513f.Task2
        /* JADX INFO: renamed from: a */
        public long mo13414a() {
            RealConnectionPool realConnectionPool = RealConnectionPool.this;
            long jNanoTime = System.nanoTime();
            long j2 = Long.MIN_VALUE;
            int i = 0;
            RealConnection realConnection = null;
            int i2 = 0;
            for (RealConnection realConnection2 : realConnectionPool.f30260d) {
                Intrinsics2.m13086b(realConnection2, "connection");
                synchronized (realConnection2) {
                    if (realConnectionPool.m13470b(realConnection2, jNanoTime) > 0) {
                        i2++;
                    } else {
                        i++;
                        long j3 = jNanoTime - realConnection2.f30250p;
                        if (j3 > j2) {
                            realConnection = realConnection2;
                            j2 = j3;
                        }
                    }
                }
            }
            long j4 = realConnectionPool.f30257a;
            if (j2 < j4 && i <= realConnectionPool.f30261e) {
                if (i > 0) {
                    return j4 - j2;
                }
                if (i2 > 0) {
                    return j4;
                }
                return -1L;
            }
            if (realConnection == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            synchronized (realConnection) {
                if (!realConnection.f30249o.isEmpty()) {
                    return 0L;
                }
                if (realConnection.f30250p + j2 != jNanoTime) {
                    return 0L;
                }
                realConnection.f30243i = true;
                realConnectionPool.f30260d.remove(realConnection);
                Util9.m13365e(realConnection.m13467n());
                if (!realConnectionPool.f30260d.isEmpty()) {
                    return 0L;
                }
                realConnectionPool.f30258b.m13417a();
                return 0L;
            }
        }
    }

    static {
        new a(null);
    }

    public RealConnectionPool(TaskRunner taskRunner, int i, long j2, TimeUnit timeUnit) {
        Intrinsics2.m13090f(taskRunner, "taskRunner");
        Intrinsics2.m13090f(timeUnit, "timeUnit");
        this.f30261e = i;
        this.f30257a = timeUnit.toNanos(j2);
        this.f30258b = taskRunner.m13427f();
        this.f30259c = new b(outline.m1550A(new StringBuilder(), Util9.f30076g, " ConnectionPool"));
        this.f30260d = new ConcurrentLinkedQueue<>();
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(outline.m1594p("keepAliveDuration <= 0: ", j2).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13469a(Address address, RealCall realCall, List<Route> list, boolean z) {
        Intrinsics2.m13090f(address, "address");
        Intrinsics2.m13090f(realCall, "call");
        for (RealConnection realConnection : this.f30260d) {
            Intrinsics2.m13086b(realConnection, "connection");
            synchronized (realConnection) {
                if (z) {
                    if (!realConnection.m13463j()) {
                    }
                }
                if (realConnection.m13461h(address, list)) {
                    realCall.m13444b(realConnection);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final int m13470b(RealConnection realConnection, long j2) {
        byte[] bArr = Util9.f30070a;
        List<Reference<RealCall>> list = realConnection.f30249o;
        int i = 0;
        while (i < list.size()) {
            Reference<RealCall> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder sbM1556G = outline.m1556G("A connection to ");
                sbM1556G.append(realConnection.f30251q.f30034a.f29835a);
                sbM1556G.append(" was leaked. ");
                sbM1556G.append("Did you forget to close a response body?");
                String string = sbM1556G.toString();
                Objects.requireNonNull(Platform.f30547c);
                Platform.f30545a.mo13597k(string, ((RealCall.b) reference).f30234a);
                list.remove(i);
                realConnection.f30243i = true;
                if (list.isEmpty()) {
                    realConnection.f30250p = j2 - this.f30257a;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
