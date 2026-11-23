package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class al1 implements zc2<ScheduledExecutorService> {

    /* JADX INFO: renamed from: a */
    public final gd2<ThreadFactory> f12199a;

    public al1(gd2<ThreadFactory> gd2Var) {
        this.f12199a = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, this.f12199a.mo4613a()));
        Objects.requireNonNull(scheduledExecutorServiceUnconfigurableScheduledExecutorService, "Cannot return null from a non-@Nullable @Provides method");
        return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
