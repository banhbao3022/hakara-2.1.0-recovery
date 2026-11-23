package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: c.n.b.d.j.a.ao */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2850ao implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f12227a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f12228b;

    public ThreadFactoryC2850ao(String str) {
        this.f12228b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f12228b;
        int andIncrement = this.f12227a.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
