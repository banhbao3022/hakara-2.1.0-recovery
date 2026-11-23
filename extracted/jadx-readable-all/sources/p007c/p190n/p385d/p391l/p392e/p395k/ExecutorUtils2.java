package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p385d.p391l.p392e.Logger4;

/* JADX INFO: renamed from: c.n.d.l.e.k.p0, reason: use source file name */
/* JADX INFO: compiled from: ExecutorUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorUtils2 extends BackgroundPriorityRunnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f26557f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ExecutorService f26558g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f26559h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ TimeUnit f26560i;

    public ExecutorUtils2(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        this.f26557f = str;
        this.f26558g = executorService;
        this.f26559h = j2;
        this.f26560i = timeUnit;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p395k.BackgroundPriorityRunnable
    /* JADX INFO: renamed from: a */
    public void mo11733a() {
        try {
            Logger4 logger4 = Logger4.f26421a;
            logger4.m11713b("Executing shutdown hook for " + this.f26557f);
            this.f26558g.shutdown();
            if (this.f26558g.awaitTermination(this.f26559h, this.f26560i)) {
                return;
            }
            logger4.m11713b(this.f26557f + " did not shut down in the allocated time. Requesting immediate shutdown.");
            this.f26558g.shutdownNow();
        } catch (InterruptedException unused) {
            Logger4.f26421a.m11713b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f26557f));
            this.f26558g.shutdownNow();
        }
    }
}
