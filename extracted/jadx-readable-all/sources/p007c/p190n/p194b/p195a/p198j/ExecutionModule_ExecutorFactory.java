package p007c.p190n.p194b.p195a.p198j;

import java.util.concurrent.Executors;
import p005b1.p006a.Provider;

/* JADX INFO: renamed from: c.n.b.a.j.h, reason: use source file name */
/* JADX INFO: compiled from: ExecutionModule_ExecutorFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutionModule_ExecutorFactory implements Provider {

    /* JADX INFO: renamed from: c.n.b.a.j.h$a */
    /* JADX INFO: compiled from: ExecutionModule_ExecutorFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final ExecutionModule_ExecutorFactory f5737a = new ExecutionModule_ExecutorFactory();
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        return new SafeLoggingExecutor(Executors.newSingleThreadExecutor());
    }
}
