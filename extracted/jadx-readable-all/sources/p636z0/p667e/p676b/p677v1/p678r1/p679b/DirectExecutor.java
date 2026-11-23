package p636z0.p667e.p676b.p677v1.p678r1.p679b;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.e.b.v1.r1.b.a, reason: use source file name */
/* JADX INFO: compiled from: DirectExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public final class DirectExecutor implements Executor {

    /* JADX INFO: renamed from: f */
    public static volatile DirectExecutor f36244f;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
