package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jv1<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final Runnable f15729f = new iv1();

    /* JADX INFO: renamed from: g */
    public static final Runnable f15730g = new iv1();

    /* JADX INFO: renamed from: h */
    public static final Runnable f15731h = new iv1();

    /* JADX INFO: renamed from: a */
    public abstract T mo7401a() throws Exception;

    /* JADX INFO: renamed from: b */
    public abstract String mo7402b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo7403c();

    /* JADX INFO: renamed from: d */
    public abstract void mo7404d(@NullableDecl T t, @NullableDecl Throwable th);

    /* JADX INFO: renamed from: e */
    public final void m7405e() {
        Runnable runnable = get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, f15730g)) {
            try {
                ((Thread) runnable).interrupt();
                if (getAndSet(f15729f) == f15731h) {
                }
            } finally {
                if (getAndSet(f15729f) == f15731h) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        T tMo7401a;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z = !mo7403c();
            if (z) {
                try {
                    tMo7401a = mo7401a();
                } catch (Throwable th) {
                    if (!compareAndSet(threadCurrentThread, f15729f)) {
                        Runnable runnable = get();
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            Runnable runnable2 = f15730g;
                            if (runnable != runnable2 && runnable != f15731h) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                Runnable runnable3 = f15731h;
                                if (runnable == runnable3 || compareAndSet(runnable2, runnable3)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = get();
                        }
                        if (z2) {
                            threadCurrentThread.interrupt();
                        }
                    }
                    mo7404d(null, th);
                    return;
                }
            } else {
                tMo7401a = null;
            }
            if (!compareAndSet(threadCurrentThread, f15729f)) {
                Runnable runnable4 = get();
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    Runnable runnable5 = f15730g;
                    if (runnable4 != runnable5 && runnable4 != f15731h) {
                        break;
                    }
                    i2++;
                    if (i2 > 1000) {
                        Runnable runnable6 = f15731h;
                        if (runnable4 == runnable6 || compareAndSet(runnable5, runnable6)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable4 = get();
                }
                if (z3) {
                    threadCurrentThread.interrupt();
                }
            }
            if (z) {
                mo7404d(tMo7401a, null);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strM1552C;
        Runnable runnable = get();
        if (runnable == f15729f) {
            strM1552C = "running=[DONE]";
        } else if (runnable == f15730g) {
            strM1552C = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strM1552C = outline.m1552C(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            strM1552C = "running=[NOT STARTED YET]";
        }
        String strMo7402b = mo7402b();
        return outline.m1552C(new StringBuilder(String.valueOf(strM1552C).length() + 2 + String.valueOf(strMo7402b).length()), strM1552C, ", ", strMo7402b);
    }
}
