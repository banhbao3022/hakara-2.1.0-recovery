package p007c.p190n.p194b.p195a.p198j;

import p005b1.p006a.Provider;
import p007c.p190n.p194b.p195a.p198j.p203v.Scheduler;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.Uploader6;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.WorkInitializer3;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;

/* JADX INFO: renamed from: c.n.b.a.j.r, reason: use source file name */
/* JADX INFO: compiled from: TransportRuntime_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class TransportRuntime_Factory implements Provider {

    /* JADX INFO: renamed from: a */
    public final Provider<Clock> f5754a;

    /* JADX INFO: renamed from: b */
    public final Provider<Clock> f5755b;

    /* JADX INFO: renamed from: c */
    public final Provider<Scheduler> f5756c;

    /* JADX INFO: renamed from: d */
    public final Provider<Uploader6> f5757d;

    /* JADX INFO: renamed from: e */
    public final Provider<WorkInitializer3> f5758e;

    public TransportRuntime_Factory(Provider<Clock> provider, Provider<Clock> provider2, Provider<Scheduler> provider3, Provider<Uploader6> provider4, Provider<WorkInitializer3> provider5) {
        this.f5754a = provider;
        this.f5755b = provider2;
        this.f5756c = provider3;
        this.f5757d = provider4;
        this.f5758e = provider5;
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        return new TransportRuntime(this.f5754a.get(), this.f5755b.get(), this.f5756c.get(), this.f5757d.get(), this.f5758e.get());
    }
}
