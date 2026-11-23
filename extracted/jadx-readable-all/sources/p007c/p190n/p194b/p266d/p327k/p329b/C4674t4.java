package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.n.b.d.k.b.t4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4674t4 extends AbstractC4675t5 {

    /* JADX INFO: renamed from: c */
    public static final AtomicLong f24439c = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: d */
    public C4718x4 f24440d;

    /* JADX INFO: renamed from: e */
    public C4718x4 f24441e;

    /* JADX INFO: renamed from: f */
    public final PriorityBlockingQueue<C4685u4<?>> f24442f;

    /* JADX INFO: renamed from: g */
    public final BlockingQueue<C4685u4<?>> f24443g;

    /* JADX INFO: renamed from: h */
    public final Thread.UncaughtExceptionHandler f24444h;

    /* JADX INFO: renamed from: i */
    public final Thread.UncaughtExceptionHandler f24445i;

    /* JADX INFO: renamed from: j */
    public final Object f24446j;

    /* JADX INFO: renamed from: k */
    public final Semaphore f24447k;

    public C4674t4(C4707w4 c4707w4) {
        super(c4707w4);
        this.f24446j = new Object();
        this.f24447k = new Semaphore(2);
        this.f24442f = new PriorityBlockingQueue<>();
        this.f24443g = new LinkedBlockingQueue();
        this.f24444h = new C4696v4(this, "Thread death: Uncaught exception on worker thread");
        this.f24445i = new C4696v4(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.C4686u5
    /* JADX INFO: renamed from: a */
    public final void mo10380a() {
        if (Thread.currentThread() != this.f24441e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.C4686u5
    /* JADX INFO: renamed from: b */
    public final void mo10381b() {
        if (Thread.currentThread() != this.f24440d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4675t5
    /* JADX INFO: renamed from: r */
    public final boolean mo10533r() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final <T> T m10755s(AtomicReference<T> atomicReference, long j2, String str, Runnable runnable) {
        synchronized (atomicReference) {
            mo10686n().m10758v(runnable);
            try {
                atomicReference.wait(j2);
            } catch (InterruptedException unused) {
                mo10684l().f24421i.m10811a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            mo10684l().f24421i.m10811a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t;
    }

    /* JADX INFO: renamed from: t */
    public final <V> Future<V> m10756t(Callable<V> callable) throws IllegalStateException {
        m10763k();
        C4685u4<?> c4685u4 = new C4685u4<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f24440d) {
            if (!this.f24442f.isEmpty()) {
                mo10684l().f24421i.m10811a("Callable skipped the worker queue.");
            }
            c4685u4.run();
        } else {
            m10757u(c4685u4);
        }
        return c4685u4;
    }

    /* JADX INFO: renamed from: u */
    public final void m10757u(C4685u4<?> c4685u4) {
        synchronized (this.f24446j) {
            this.f24442f.add(c4685u4);
            C4718x4 c4718x4 = this.f24440d;
            if (c4718x4 == null) {
                C4718x4 c4718x5 = new C4718x4(this, "Measurement Worker", this.f24442f);
                this.f24440d = c4718x5;
                c4718x5.setUncaughtExceptionHandler(this.f24444h);
                this.f24440d.start();
            } else {
                synchronized (c4718x4.f24573f) {
                    c4718x4.f24573f.notifyAll();
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m10758v(Runnable runnable) throws IllegalStateException {
        m10763k();
        Objects.requireNonNull(runnable, "null reference");
        m10757u(new C4685u4<>(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: w */
    public final void m10759w(Runnable runnable) throws IllegalStateException {
        m10763k();
        m10757u(new C4685u4<>(this, runnable, true, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: x */
    public final void m10760x(Runnable runnable) throws IllegalStateException {
        m10763k();
        C4685u4<?> c4685u4 = new C4685u4<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f24446j) {
            this.f24443g.add(c4685u4);
            C4718x4 c4718x4 = this.f24441e;
            if (c4718x4 == null) {
                C4718x4 c4718x5 = new C4718x4(this, "Measurement Network", this.f24443g);
                this.f24441e = c4718x5;
                c4718x5.setUncaughtExceptionHandler(this.f24445i);
                this.f24441e.start();
            } else {
                synchronized (c4718x4.f24573f) {
                    c4718x4.f24573f.notifyAll();
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m10761y() {
        return Thread.currentThread() == this.f24440d;
    }
}
