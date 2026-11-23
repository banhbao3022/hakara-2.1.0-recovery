package p007c.p190n.p194b.p195a.p198j.p203v.p204h;

import java.util.concurrent.Executor;
import p005b1.p006a.Provider;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore;
import p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard;

/* JADX INFO: renamed from: c.n.b.a.j.v.h.q, reason: use source file name */
/* JADX INFO: compiled from: WorkInitializer_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class WorkInitializer_Factory implements Provider {

    /* JADX INFO: renamed from: a */
    public final Provider<Executor> f5868a;

    /* JADX INFO: renamed from: b */
    public final Provider<EventStore> f5869b;

    /* JADX INFO: renamed from: c */
    public final Provider<WorkScheduler> f5870c;

    /* JADX INFO: renamed from: d */
    public final Provider<SynchronizationGuard> f5871d;

    public WorkInitializer_Factory(Provider<Executor> provider, Provider<EventStore> provider2, Provider<WorkScheduler> provider3, Provider<SynchronizationGuard> provider4) {
        this.f5868a = provider;
        this.f5869b = provider2;
        this.f5870c = provider3;
        this.f5871d = provider4;
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        return new WorkInitializer3(this.f5868a.get(), this.f5869b.get(), this.f5870c.get(), this.f5871d.get());
    }
}
