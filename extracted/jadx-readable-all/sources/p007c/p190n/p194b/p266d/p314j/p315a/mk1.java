package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mk1 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f16785a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, outline.m1585g(25, "AdWorker(NG) #", this.f16785a.getAndIncrement()));
    }
}
