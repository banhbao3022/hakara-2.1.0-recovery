package p007c.p071d.p072a.p073a;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: c.d.a.a.c0 */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0514c0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f2701a = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f2702b = new AtomicInteger(1);

    public ThreadFactoryC0514c0(C0511b c0511b) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f2701a.newThread(runnable);
        int andIncrement = this.f2702b.getAndIncrement();
        StringBuilder sb = new StringBuilder(30);
        sb.append("PlayBillingLibrary-");
        sb.append(andIncrement);
        threadNewThread.setName(sb.toString());
        return threadNewThread;
    }
}
