package p500e1.p501a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p477d1.Unit;
import p477d1.p485u.CoroutineContext;

/* JADX INFO: renamed from: e1.a.t0, reason: use source file name */
/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class Executors5 extends Executors4 implements Delay {

    /* JADX INFO: renamed from: g */
    public boolean f29802g;

    @Override // p500e1.p501a.CoroutineDispatcher
    /* JADX INFO: renamed from: F0 */
    public void mo13118F0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            mo13291H0().execute(runnable);
        } catch (RejectedExecutionException e) {
            m13292I0(coroutineContext, e);
            Dispatchers.f29770b.mo13118F0(coroutineContext, runnable);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m13292I0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        CancellationException cancellationException = new CancellationException("The task was rejected");
        cancellationException.initCause(rejectedExecutionException);
        Job job = (Job) coroutineContext.get(Job.f29633e);
        if (job != null) {
            job.mo13129t0(cancellationException);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorMo13291H0 = mo13291H0();
        if (!(executorMo13291H0 instanceof ExecutorService)) {
            executorMo13291H0 = null;
        }
        ExecutorService executorService = (ExecutorService) executorMo13291H0;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof Executors5) && ((Executors5) obj).mo13291H0() == mo13291H0();
    }

    @Override // p500e1.p501a.Delay
    /* JADX INFO: renamed from: h */
    public void mo13123h(long j2, CancellableContinuation<? super Unit> cancellableContinuation) {
        ScheduledFuture<?> scheduledFutureSchedule = null;
        if (this.f29802g) {
            Executors3 executors3 = new Executors3(this, cancellableContinuation);
            CoroutineContext coroutineContext = ((CancellableContinuationImpl4) cancellableContinuation).f29764k;
            try {
                Executor executorMo13291H0 = mo13291H0();
                if (!(executorMo13291H0 instanceof ScheduledExecutorService)) {
                    executorMo13291H0 = null;
                }
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) executorMo13291H0;
                if (scheduledExecutorService != null) {
                    scheduledFutureSchedule = scheduledExecutorService.schedule(executors3, j2, TimeUnit.MILLISECONDS);
                }
            } catch (RejectedExecutionException e) {
                m13292I0(coroutineContext, e);
            }
        }
        if (scheduledFutureSchedule == null) {
            DefaultExecutor.f29739n.mo13123h(j2, cancellableContinuation);
        } else {
            ((CancellableContinuationImpl4) cancellableContinuation).mo13254i(new Future(scheduledFutureSchedule));
        }
    }

    public int hashCode() {
        return System.identityHashCode(mo13291H0());
    }

    @Override // p500e1.p501a.CoroutineDispatcher
    public String toString() {
        return mo13291H0().toString();
    }
}
