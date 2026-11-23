package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class u80 extends ha0<v80> {

    /* JADX INFO: renamed from: g */
    public final ScheduledExecutorService f20232g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2782b f20233h;

    /* JADX INFO: renamed from: i */
    public long f20234i;

    /* JADX INFO: renamed from: j */
    public long f20235j;

    /* JADX INFO: renamed from: k */
    public boolean f20236k;

    /* JADX INFO: renamed from: l */
    public ScheduledFuture<?> f20237l;

    public u80(ScheduledExecutorService scheduledExecutorService, InterfaceC2782b interfaceC2782b) {
        super(Collections.emptySet());
        this.f20234i = -1L;
        this.f20235j = -1L;
        this.f20236k = false;
        this.f20232g = scheduledExecutorService;
        this.f20233h = interfaceC2782b;
    }

    /* JADX INFO: renamed from: B0 */
    public final synchronized void m8475B0(int i) {
        if (i <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i);
        if (this.f20236k) {
            long j2 = this.f20235j;
            if (j2 <= 0 || millis >= j2) {
                millis = j2;
            }
            this.f20235j = millis;
            return;
        }
        long jMo5621a = this.f20233h.mo5621a();
        long j3 = this.f20234i;
        if (jMo5621a > j3 || j3 - this.f20233h.mo5621a() > millis) {
            m8476E0(millis);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final synchronized void m8476E0(long j2) {
        ScheduledFuture<?> scheduledFuture = this.f20237l;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f20237l.cancel(true);
        }
        this.f20234i = this.f20233h.mo5621a() + j2;
        this.f20237l = this.f20232g.schedule(new t80(this), j2, TimeUnit.MILLISECONDS);
    }
}
