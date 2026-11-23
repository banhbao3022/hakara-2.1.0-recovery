package p007c.p154j.p155g;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: c.j.g.b, reason: use source file name */
/* JADX INFO: compiled from: DefaultExecutorSupplier.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultExecutorSupplier implements ExecutorSupplier {

    /* JADX INFO: renamed from: a */
    public static final int f4417a = (Runtime.getRuntime().availableProcessors() * 2) + 1;

    /* JADX INFO: renamed from: b */
    public final DownloadExecutor f4418b = new DownloadExecutor(f4417a, new PriorityThreadFactory(10));

    /* JADX INFO: renamed from: c */
    public final Executor f4419c = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: d */
    public final Executor f4420d = new MainThreadExecutor();
}
