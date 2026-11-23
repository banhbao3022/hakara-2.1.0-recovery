package p636z0.p667e.p676b.p677v1.p678r1.p679b;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: z0.e.b.v1.r1.b.c, reason: use source file name */
/* JADX INFO: compiled from: HighPriorityExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public final class HighPriorityExecutor implements Executor {

    /* JADX INFO: renamed from: f */
    public static volatile Executor f36255f;

    /* JADX INFO: renamed from: g */
    public final ExecutorService f36256g = Executors.newSingleThreadExecutor(new a(this));

    /* JADX INFO: renamed from: z0.e.b.v1.r1.b.c$a */
    /* JADX INFO: compiled from: HighPriorityExecutor.java */
    public class a implements ThreadFactory {
        public a(HighPriorityExecutor highPriorityExecutor) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f36256g.execute(runnable);
    }
}
