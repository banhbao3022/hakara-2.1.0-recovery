package p007c.p190n.p194b.p195a.p198j.p203v;

import java.util.concurrent.Executor;
import p005b1.p006a.Provider;
import p007c.p190n.p194b.p195a.p198j.p199s.BackendRegistry;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.WorkScheduler;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore;
import p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard;

/* JADX INFO: renamed from: c.n.b.a.j.v.d, reason: use source file name */
/* JADX INFO: compiled from: DefaultScheduler_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultScheduler_Factory implements Provider {

    /* JADX INFO: renamed from: a */
    public final Provider<Executor> f5803a;

    /* JADX INFO: renamed from: b */
    public final Provider<BackendRegistry> f5804b;

    /* JADX INFO: renamed from: c */
    public final Provider<WorkScheduler> f5805c;

    /* JADX INFO: renamed from: d */
    public final Provider<EventStore> f5806d;

    /* JADX INFO: renamed from: e */
    public final Provider<SynchronizationGuard> f5807e;

    public DefaultScheduler_Factory(Provider<Executor> provider, Provider<BackendRegistry> provider2, Provider<WorkScheduler> provider3, Provider<EventStore> provider4, Provider<SynchronizationGuard> provider5) {
        this.f5803a = provider;
        this.f5804b = provider2;
        this.f5805c = provider3;
        this.f5806d = provider4;
        this.f5807e = provider5;
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        return new DefaultScheduler3(this.f5803a.get(), this.f5804b.get(), this.f5805c.get(), this.f5806d.get(), this.f5807e.get());
    }
}
