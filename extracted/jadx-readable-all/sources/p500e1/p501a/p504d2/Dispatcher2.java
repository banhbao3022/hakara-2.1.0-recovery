package p500e1.p501a.p504d2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p500e1.p501a.DefaultExecutor;
import p500e1.p501a.Executors4;

/* JADX INFO: renamed from: e1.a.d2.c, reason: use source file name */
/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public class Dispatcher2 extends Executors4 {

    /* JADX INFO: renamed from: g */
    public CoroutineScheduler f29711g;

    /* JADX INFO: renamed from: h */
    public final int f29712h;

    /* JADX INFO: renamed from: i */
    public final int f29713i;

    /* JADX INFO: renamed from: j */
    public final long f29714j;

    /* JADX INFO: renamed from: k */
    public final String f29715k;

    public /* synthetic */ Dispatcher2(int i, int i2, long j2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j2, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    @Override // p500e1.p501a.CoroutineDispatcher
    /* JADX INFO: renamed from: F0 */
    public void mo13118F0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            CoroutineScheduler coroutineScheduler = this.f29711g;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f29690f;
            coroutineScheduler.m13187h(runnable, Tasks3.f29723f, false);
        } catch (RejectedExecutionException unused) {
            DefaultExecutor.f29739n.m13284P0(runnable);
        }
    }

    public void close() {
        this.f29711g.close();
    }

    @Override // p500e1.p501a.CoroutineDispatcher
    public String toString() {
        return super.toString() + "[scheduler = " + this.f29711g + ']';
    }

    public Dispatcher2(int i, int i2, long j2, String str) {
        this.f29712h = i;
        this.f29713i = i2;
        this.f29714j = j2;
        this.f29715k = str;
        this.f29711g = new CoroutineScheduler(i, i2, j2, str);
    }

    public /* synthetic */ Dispatcher2(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Tasks8.f29728b : i, (i3 & 2) != 0 ? Tasks8.f29729c : i2, (i3 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    public Dispatcher2(int i, int i2, String str) {
        this(i, i2, Tasks8.f29730d, str);
    }

    public /* synthetic */ Dispatcher2(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Tasks8.f29728b : i, (i3 & 2) != 0 ? Tasks8.f29729c : i2);
    }

    public /* synthetic */ Dispatcher2(int i, int i2) {
        this(i, i2, Tasks8.f29730d, null, 8, null);
    }
}
