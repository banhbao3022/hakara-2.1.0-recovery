package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: renamed from: c.n.b.d.j.a.mz */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3306mz implements cq2 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f16964a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2782b f16965b;

    /* JADX INFO: renamed from: c */
    public ScheduledFuture<?> f16966c;

    /* JADX INFO: renamed from: d */
    public long f16967d = -1;

    /* JADX INFO: renamed from: e */
    public long f16968e = -1;

    /* JADX INFO: renamed from: f */
    public Runnable f16969f = null;

    /* JADX INFO: renamed from: g */
    public boolean f16970g = false;

    public C3306mz(ScheduledExecutorService scheduledExecutorService, InterfaceC2782b interfaceC2782b) {
        this.f16964a = scheduledExecutorService;
        this.f16965b = interfaceC2782b;
        C2330u.f10884a.f10892g.m6422b(this);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cq2
    /* JADX INFO: renamed from: B */
    public final void mo6222B(boolean z) {
        ScheduledFuture<?> scheduledFuture;
        if (z) {
            synchronized (this) {
                if (this.f16970g) {
                    if (this.f16968e > 0 && (scheduledFuture = this.f16966c) != null && scheduledFuture.isCancelled()) {
                        this.f16966c = this.f16964a.schedule(this.f16969f, this.f16968e, TimeUnit.MILLISECONDS);
                    }
                    this.f16970g = false;
                }
            }
            return;
        }
        synchronized (this) {
            if (!this.f16970g) {
                ScheduledFuture<?> scheduledFuture2 = this.f16966c;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.f16968e = -1L;
                } else {
                    this.f16966c.cancel(true);
                    this.f16968e = this.f16967d - this.f16965b.mo5621a();
                }
                this.f16970g = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7740a(int i, Runnable runnable) {
        this.f16969f = runnable;
        long j2 = i;
        this.f16967d = this.f16965b.mo5621a() + j2;
        this.f16966c = this.f16964a.schedule(runnable, j2, TimeUnit.MILLISECONDS);
    }
}
