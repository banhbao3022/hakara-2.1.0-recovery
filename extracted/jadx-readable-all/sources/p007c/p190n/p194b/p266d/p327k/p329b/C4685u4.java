package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: c.n.b.d.k.b.u4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4685u4<V> extends FutureTask<V> implements Comparable<C4685u4<V>> {

    /* JADX INFO: renamed from: f */
    public final long f24472f;

    /* JADX INFO: renamed from: g */
    public final boolean f24473g;

    /* JADX INFO: renamed from: h */
    public final String f24474h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C4674t4 f24475i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4685u4(C4674t4 c4674t4, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f24475i = c4674t4;
        long andIncrement = C4674t4.f24439c.getAndIncrement();
        this.f24472f = andIncrement;
        this.f24474h = str;
        this.f24473g = z;
        if (andIncrement == Long.MAX_VALUE) {
            c4674t4.mo10684l().f24418f.m10811a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4685u4 c4685u4 = (C4685u4) obj;
        boolean z = this.f24473g;
        if (z != c4685u4.f24473g) {
            return z ? -1 : 1;
        }
        long j2 = this.f24472f;
        long j3 = c4685u4.f24472f;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        this.f24475i.mo10684l().f24419g.m10812b("Two tasks share the same index. index", Long.valueOf(this.f24472f));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f24475i.mo10684l().f24418f.m10812b(this.f24474h, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4685u4(C4674t4 c4674t4, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f24475i = c4674t4;
        long andIncrement = C4674t4.f24439c.getAndIncrement();
        this.f24472f = andIncrement;
        this.f24474h = str;
        this.f24473g = z;
        if (andIncrement == Long.MAX_VALUE) {
            c4674t4.mo10684l().f24418f.m10811a("Tasks index overflow");
        }
    }
}
