package p636z0.p641a0;

import java.util.concurrent.Executor;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Lambda;
import p500e1.p501a.Job;

/* JADX INFO: renamed from: z0.a0.r, reason: use source file name */
/* JADX INFO: compiled from: RoomDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RoomDatabase2 extends Lambda implements InterfaceC6164l<Throwable, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Executor f34333g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Job f34334h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase2(Executor executor, Job job) {
        super(1);
        this.f34333g = executor;
        this.f34334h = job;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Throwable th) {
        C5729a.m12453h(this.f34334h, null, 1, null);
        return Unit.f29502a;
    }
}
