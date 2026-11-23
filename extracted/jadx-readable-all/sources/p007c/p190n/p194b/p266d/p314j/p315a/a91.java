package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p314j.p315a.ha1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class a91<S extends ha1> implements ia1<S> {

    /* JADX INFO: renamed from: a */
    public final ia1<S> f12042a;

    /* JADX INFO: renamed from: b */
    public final long f12043b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f12044c;

    public a91(ia1<S> ia1Var, long j2, ScheduledExecutorService scheduledExecutorService) {
        this.f12042a = ia1Var;
        this.f12043b = j2;
        this.f12044c = scheduledExecutorService;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<S> zza() {
        kv1 kv1VarZza = this.f12042a.zza();
        long j2 = this.f12043b;
        if (j2 > 0) {
            kv1VarZza = cw0.m6248r(kv1VarZza, j2, TimeUnit.MILLISECONDS, this.f12044c);
        }
        return cw0.m6247q(kv1VarZza, Throwable.class, z81.f22197a, C2962do.f13335f);
    }
}
