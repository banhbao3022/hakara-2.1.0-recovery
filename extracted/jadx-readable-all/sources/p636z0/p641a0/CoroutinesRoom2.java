package p636z0.p641a0;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.ContinuationInterceptor;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Lambda;
import p500e1.p501a.Job;

/* JADX INFO: renamed from: z0.a0.e, reason: use source file name */
/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutinesRoom2 extends Lambda implements InterfaceC6164l<Throwable, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Job f34237g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ContinuationInterceptor f34238h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CancellationSignal f34239i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom2(Job job, ContinuationInterceptor continuationInterceptor, Callable callable, CancellationSignal cancellationSignal) {
        super(1);
        this.f34237g = job;
        this.f34238h = continuationInterceptor;
        this.f34239i = cancellationSignal;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Throwable th) {
        this.f34239i.cancel();
        C5729a.m12453h(this.f34237g, null, 1, null);
        return Unit.f29502a;
    }
}
