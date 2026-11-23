package p636z0.p641a0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.a0.z, reason: use source file name */
/* JADX INFO: compiled from: TransactionExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class TransactionExecutor implements Executor {

    /* JADX INFO: renamed from: f */
    public final Executor f34372f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque<Runnable> f34373g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h */
    public Runnable f34374h;

    /* JADX INFO: renamed from: z0.a0.z$a */
    /* JADX INFO: compiled from: TransactionExecutor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Runnable f34375f;

        public a(Runnable runnable) {
            this.f34375f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f34375f.run();
            } finally {
                TransactionExecutor.this.m14563a();
            }
        }
    }

    public TransactionExecutor(Executor executor) {
        this.f34372f = executor;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m14563a() {
        Runnable runnablePoll = this.f34373g.poll();
        this.f34374h = runnablePoll;
        if (runnablePoll != null) {
            this.f34372f.execute(runnablePoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f34373g.offer(new a(runnable));
        if (this.f34374h == null) {
            m14563a();
        }
    }
}
