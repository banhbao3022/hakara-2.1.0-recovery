package p007c.p056c.p057a;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: c.c.a.t, reason: use source file name */
/* JADX INFO: compiled from: LottieTask.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieTask2<T> {

    /* JADX INFO: renamed from: a */
    public static Executor f2482a = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: b */
    public final Set<LottieListener<T>> f2483b;

    /* JADX INFO: renamed from: c */
    public final Set<LottieListener<Throwable>> f2484c;

    /* JADX INFO: renamed from: d */
    public final Handler f2485d;

    /* JADX INFO: renamed from: e */
    public volatile LottieResult<T> f2486e;

    /* JADX INFO: renamed from: c.c.a.t$a */
    /* JADX INFO: compiled from: LottieTask.java */
    public class a extends FutureTask<LottieResult<T>> {
        public a(Callable<LottieResult<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                LottieTask2.this.m1489c(get());
            } catch (InterruptedException | ExecutionException e) {
                LottieTask2.this.m1489c(new LottieResult<>(e));
            }
        }
    }

    public LottieTask2(Callable<LottieResult<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: renamed from: a */
    public synchronized LottieTask2<T> m1487a(LottieListener<Throwable> lottieListener) {
        if (this.f2486e != null && this.f2486e.f2480b != null) {
            lottieListener.mo1461a(this.f2486e.f2480b);
        }
        this.f2484c.add(lottieListener);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public synchronized LottieTask2<T> m1488b(LottieListener<T> lottieListener) {
        if (this.f2486e != null && this.f2486e.f2479a != null) {
            lottieListener.mo1461a(this.f2486e.f2479a);
        }
        this.f2483b.add(lottieListener);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final void m1489c(LottieResult<T> lottieResult) {
        if (this.f2486e != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f2486e = lottieResult;
        this.f2485d.post(new LottieTask(this));
    }

    public LottieTask2(Callable<LottieResult<T>> callable, boolean z) {
        this.f2483b = new LinkedHashSet(1);
        this.f2484c = new LinkedHashSet(1);
        this.f2485d = new Handler(Looper.getMainLooper());
        this.f2486e = null;
        if (!z) {
            f2482a.execute(new a(callable));
            return;
        }
        try {
            m1489c(callable.call());
        } catch (Throwable th) {
            m1489c(new LottieResult<>(th));
        }
    }
}
