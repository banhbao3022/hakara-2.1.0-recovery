package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pv1<V> extends cv1<V> implements ScheduledFuture<V>, kv1 {

    /* JADX INFO: renamed from: g */
    public final ScheduledFuture<?> f18103g;

    public pv1(kv1<V> kv1Var, ScheduledFuture<?> scheduledFuture) {
        super(kv1Var);
        this.f18103g = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.f13126f.cancel(z);
        if (zCancel) {
            this.f18103g.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f18103g.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f18103g.getDelay(timeUnit);
    }
}
