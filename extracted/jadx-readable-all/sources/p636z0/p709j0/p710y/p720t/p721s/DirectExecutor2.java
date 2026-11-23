package p636z0.p709j0.p710y.p720t.p721s;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.j0.y.t.s.b, reason: use source file name */
/* JADX INFO: compiled from: DirectExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public enum DirectExecutor2 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
