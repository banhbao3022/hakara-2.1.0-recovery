package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nb1 implements ia1<ob1> {

    /* JADX INFO: renamed from: a */
    public final C2998en f17064a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f17065b;

    /* JADX INFO: renamed from: c */
    public final Executor f17066c;

    public nb1(C3701xm c3701xm, int i, Context context, C2998en c2998en, ScheduledExecutorService scheduledExecutorService, Executor executor, byte[] bArr) {
        this.f17064a = c2998en;
        this.f17065b = scheduledExecutorService;
        this.f17066c = executor;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<ob1> zza() {
        return cw0.m6246p((zu1) cw0.m6248r(cw0.m6250t(zu1.m8908s(cw0.m6244n(new pu1(this) { // from class: c.n.b.d.j.a.kb1
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.pu1
            public final kv1 zza() {
                return cw0.m6231a(null);
            }
        }, this.f17066c)), lb1.f16313a, this.f17066c), ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14157B0)).longValue(), TimeUnit.MILLISECONDS, this.f17065b), Exception.class, new cs1(this) { // from class: c.n.b.d.j.a.mb1

            /* JADX INFO: renamed from: a */
            public final nb1 f16712a;

            {
                this.f16712a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
            public final Object apply(Object obj) {
                C2998en c2998en = this.f16712a.f17064a;
                C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b((Exception) obj, "AttestationTokenSignal");
                return null;
            }
        }, wu1.INSTANCE);
    }
}
