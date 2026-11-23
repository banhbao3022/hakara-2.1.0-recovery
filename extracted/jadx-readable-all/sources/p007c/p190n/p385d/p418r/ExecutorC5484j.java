package p007c.p190n.p385d.p418r;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.d.r.j */
/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC5484j implements Executor {

    /* JADX INFO: renamed from: f */
    public static final Executor f27070f = new ExecutorC5484j();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
