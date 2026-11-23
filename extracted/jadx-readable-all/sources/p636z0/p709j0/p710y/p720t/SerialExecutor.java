package p636z0.p709j0.p710y.p720t;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.j0.y.t.j, reason: use source file name */
/* JADX INFO: compiled from: SerialExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class SerialExecutor implements Executor {

    /* JADX INFO: renamed from: g */
    public final Executor f37572g;

    /* JADX INFO: renamed from: i */
    public volatile Runnable f37574i;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<a> f37571f = new ArrayDeque<>();

    /* JADX INFO: renamed from: h */
    public final Object f37573h = new Object();

    /* JADX INFO: renamed from: z0.j0.y.t.j$a */
    /* JADX INFO: compiled from: SerialExecutor.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final SerialExecutor f37575f;

        /* JADX INFO: renamed from: g */
        public final Runnable f37576g;

        public a(SerialExecutor serialExecutor, Runnable runnable) {
            this.f37575f = serialExecutor;
            this.f37576g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f37576g.run();
            } finally {
                this.f37575f.m16010a();
            }
        }
    }

    public SerialExecutor(Executor executor) {
        this.f37572g = executor;
    }

    /* JADX INFO: renamed from: a */
    public void m16010a() {
        synchronized (this.f37573h) {
            a aVarPoll = this.f37571f.poll();
            this.f37574i = aVarPoll;
            if (aVarPoll != null) {
                this.f37572g.execute(this.f37574i);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f37573h) {
            this.f37571f.add(new a(this, runnable));
            if (this.f37574i == null) {
                m16010a();
            }
        }
    }
}
