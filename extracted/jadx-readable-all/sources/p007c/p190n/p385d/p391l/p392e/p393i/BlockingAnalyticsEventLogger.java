package p007c.p190n.p385d.p391l.p392e.p393i;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p385d.p391l.p392e.Logger4;

/* JADX INFO: renamed from: c.n.d.l.e.i.c, reason: use source file name */
/* JADX INFO: compiled from: BlockingAnalyticsEventLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {

    /* JADX INFO: renamed from: a */
    public final CrashlyticsOriginAnalyticsEventLogger f26443a;

    /* JADX INFO: renamed from: b */
    public final int f26444b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f26445c;

    /* JADX INFO: renamed from: d */
    public final Object f26446d = new Object();

    /* JADX INFO: renamed from: e */
    public CountDownLatch f26447e;

    public BlockingAnalyticsEventLogger(CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger, int i, TimeUnit timeUnit) {
        this.f26443a = crashlyticsOriginAnalyticsEventLogger;
        this.f26444b = i;
        this.f26445c = timeUnit;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p393i.AnalyticsEventLogger
    /* JADX INFO: renamed from: a */
    public void mo11721a(String str, Bundle bundle) {
        synchronized (this.f26446d) {
            Logger4 logger4 = Logger4.f26421a;
            logger4.m11713b("Logging Crashlytics event to Firebase");
            this.f26447e = new CountDownLatch(1);
            this.f26443a.f26449a.mo11676a("clx", str, bundle);
            logger4.m11713b("Awaiting app exception callback from FA...");
            try {
                if (this.f26447e.await(this.f26444b, this.f26445c)) {
                    logger4.m11713b("App exception callback received from FA listener.");
                } else {
                    logger4.m11713b("Timeout exceeded while awaiting app exception callback from FA listener.");
                }
            } catch (InterruptedException unused) {
                Logger4.f26421a.m11713b("Interrupted while awaiting app exception callback from FA listener.");
            }
            this.f26447e = null;
        }
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p393i.AnalyticsEventReceiver
    /* JADX INFO: renamed from: b */
    public void mo11722b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f26447e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
