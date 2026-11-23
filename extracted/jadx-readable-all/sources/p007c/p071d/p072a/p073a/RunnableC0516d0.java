package p007c.p071d.p072a.p073a;

import java.util.concurrent.Future;
import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;

/* JADX INFO: renamed from: c.d.a.a.d0 */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0516d0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Future f2703f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Runnable f2704g;

    public RunnableC0516d0(Future future, Runnable runnable) {
        this.f2703f = future;
        this.f2704g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2703f.isDone() || this.f2703f.isCancelled()) {
            return;
        }
        this.f2703f.cancel(true);
        C4437a.m10350b("BillingClient", "Async task is taking too long, cancel it!");
        Runnable runnable = this.f2704g;
        if (runnable != null) {
            runnable.run();
        }
    }
}
