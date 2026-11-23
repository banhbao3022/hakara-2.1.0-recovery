package p007c.p190n.p385d.p418r;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.d.r.a */
/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC5470a implements Executor {

    /* JADX INFO: renamed from: f */
    public static final Executor f27043f = new ExecutorC5470a();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
