package p007c.p190n.p194b.p195a.p198j.p203v;

import android.content.Context;
import p005b1.p006a.Provider;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.JobInfoScheduler;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.SchedulerConfig;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;

/* JADX INFO: renamed from: c.n.b.a.j.v.g, reason: use source file name */
/* JADX INFO: compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Provider {

    /* JADX INFO: renamed from: a */
    public final Provider<Context> f5809a;

    /* JADX INFO: renamed from: b */
    public final Provider<EventStore> f5810b;

    /* JADX INFO: renamed from: c */
    public final Provider<SchedulerConfig> f5811c;

    /* JADX INFO: renamed from: d */
    public final Provider<Clock> f5812d;

    public SchedulingModule_WorkSchedulerFactory(Provider<Context> provider, Provider<EventStore> provider2, Provider<SchedulerConfig> provider3, Provider<Clock> provider4) {
        this.f5809a = provider;
        this.f5810b = provider2;
        this.f5811c = provider3;
        this.f5812d = provider4;
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        Context context = this.f5809a.get();
        EventStore eventStore = this.f5810b.get();
        SchedulerConfig schedulerConfig = this.f5811c.get();
        this.f5812d.get();
        return new JobInfoScheduler(context, eventStore, schedulerConfig);
    }
}
