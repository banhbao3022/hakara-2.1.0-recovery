package p007c.p190n.p194b.p195a.p198j;

import java.util.concurrent.Executor;
import p007c.p165l.p175i0.C1095a;

/* JADX INFO: renamed from: c.n.b.a.j.i, reason: use source file name */
/* JADX INFO: compiled from: SafeLoggingExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class SafeLoggingExecutor implements Executor {

    /* JADX INFO: renamed from: f */
    public final Executor f5738f;

    /* JADX INFO: renamed from: c.n.b.a.j.i$a */
    /* JADX INFO: compiled from: SafeLoggingExecutor.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final Runnable f5739f;

        public a(Runnable runnable) {
            this.f5739f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5739f.run();
            } catch (Exception e) {
                C1095a.m2399o("Executor", "Background execution failure.", e);
            }
        }
    }

    public SafeLoggingExecutor(Executor executor) {
        this.f5738f = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5738f.execute(new a(runnable));
    }
}
