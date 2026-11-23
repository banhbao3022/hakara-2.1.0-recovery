package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.a.yl */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC3737yl implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f21908a = new AtomicInteger(1);

    public ThreadFactoryC3737yl(C2885bm c2885bm) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, outline.m1585g(42, "AdWorker(SCION_TASK_EXECUTOR) #", this.f21908a.getAndIncrement()));
    }
}
