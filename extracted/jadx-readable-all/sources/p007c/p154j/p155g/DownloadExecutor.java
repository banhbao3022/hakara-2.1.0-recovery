package p007c.p154j.p155g;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p007c.p154j.p159k.DownloadRunnable;

/* JADX INFO: renamed from: c.j.g.c, reason: use source file name */
/* JADX INFO: compiled from: DownloadExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class DownloadExecutor extends ThreadPoolExecutor {
    public DownloadExecutor(int i, ThreadFactory threadFactory) {
        super(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), threadFactory);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        DownloadFutureTask downloadFutureTask = new DownloadFutureTask((DownloadRunnable) runnable);
        execute(downloadFutureTask);
        return downloadFutureTask;
    }
}
