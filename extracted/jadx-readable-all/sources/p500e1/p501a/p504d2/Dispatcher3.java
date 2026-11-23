package p500e1.p501a.p504d2;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p477d1.p485u.CoroutineContext;
import p500e1.p501a.DefaultExecutor;
import p500e1.p501a.Executors4;

/* JADX INFO: renamed from: e1.a.d2.e, reason: use source file name */
/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Dispatcher3 extends Executors4 implements Tasks6, Executor {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29716g = AtomicIntegerFieldUpdater.newUpdater(Dispatcher3.class, "inFlightTasks");

    /* JADX INFO: renamed from: i */
    public final Dispatcher2 f29718i;

    /* JADX INFO: renamed from: j */
    public final int f29719j;

    /* JADX INFO: renamed from: k */
    public final String f29720k;

    /* JADX INFO: renamed from: l */
    public final int f29721l;

    /* JADX INFO: renamed from: h */
    public final ConcurrentLinkedQueue<Runnable> f29717h = new ConcurrentLinkedQueue<>();
    private volatile /* synthetic */ int inFlightTasks = 0;

    public Dispatcher3(Dispatcher2 dispatcher2, int i, String str, int i2) {
        this.f29718i = dispatcher2;
        this.f29719j = i;
        this.f29720k = str;
        this.f29721l = i2;
    }

    @Override // p500e1.p501a.p504d2.Tasks6
    /* JADX INFO: renamed from: B */
    public void mo13198B() {
        Runnable runnablePoll = this.f29717h.poll();
        if (runnablePoll != null) {
            Dispatcher2 dispatcher2 = this.f29718i;
            Objects.requireNonNull(dispatcher2);
            try {
                dispatcher2.f29711g.m13187h(runnablePoll, this, true);
                return;
            } catch (RejectedExecutionException unused) {
                DefaultExecutor.f29739n.m13284P0(dispatcher2.f29711g.m13185c(runnablePoll, this));
                return;
            }
        }
        f29716g.decrementAndGet(this);
        Runnable runnablePoll2 = this.f29717h.poll();
        if (runnablePoll2 != null) {
            m13199I0(runnablePoll2, true);
        }
    }

    @Override // p500e1.p501a.CoroutineDispatcher
    /* JADX INFO: renamed from: F0 */
    public void mo13118F0(CoroutineContext coroutineContext, Runnable runnable) {
        m13199I0(runnable, false);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m13199I0(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29716g;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f29719j) {
                Dispatcher2 dispatcher2 = this.f29718i;
                Objects.requireNonNull(dispatcher2);
                try {
                    dispatcher2.f29711g.m13187h(runnable, this, z);
                    return;
                } catch (RejectedExecutionException unused) {
                    DefaultExecutor.f29739n.m13284P0(dispatcher2.f29711g.m13185c(runnable, this));
                    return;
                }
            }
            this.f29717h.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f29719j) {
                return;
            } else {
                runnable = this.f29717h.poll();
            }
        } while (runnable != null);
    }

    @Override // p500e1.p501a.p504d2.Tasks6
    /* JADX INFO: renamed from: R */
    public int mo13200R() {
        return this.f29721l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m13199I0(runnable, false);
    }

    @Override // p500e1.p501a.CoroutineDispatcher
    public String toString() {
        String str = this.f29720k;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f29718i + ']';
    }
}
