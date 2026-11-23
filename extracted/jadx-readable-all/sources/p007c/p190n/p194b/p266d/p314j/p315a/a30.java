package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class a30 {

    /* JADX INFO: renamed from: a */
    public final Executor f12004a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f12005b;

    /* JADX INFO: renamed from: c */
    public final kv1<t20> f12006c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f12007d = true;

    public a30(Executor executor, ScheduledExecutorService scheduledExecutorService, kv1<t20> kv1Var) {
        this.f12004a = executor;
        this.f12005b = scheduledExecutorService;
        this.f12006c = kv1Var;
    }
}
