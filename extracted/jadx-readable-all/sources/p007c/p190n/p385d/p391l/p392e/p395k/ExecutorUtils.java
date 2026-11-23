package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: c.n.d.l.e.k.o0, reason: use source file name */
/* JADX INFO: compiled from: ExecutorUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorUtils implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f26553a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicLong f26554b;

    /* JADX INFO: renamed from: c.n.d.l.e.k.o0$a */
    /* JADX INFO: compiled from: ExecutorUtils.java */
    public class a extends BackgroundPriorityRunnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Runnable f26555f;

        public a(ExecutorUtils executorUtils, Runnable runnable) {
            this.f26555f = runnable;
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p395k.BackgroundPriorityRunnable
        /* JADX INFO: renamed from: a */
        public void mo11733a() {
            this.f26555f.run();
        }
    }

    public ExecutorUtils(String str, AtomicLong atomicLong) {
        this.f26553a = str;
        this.f26554b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new a(this, runnable));
        threadNewThread.setName(this.f26553a + this.f26554b.getAndIncrement());
        return threadNewThread;
    }
}
