package p007c.p190n.p194b.p195a.p198j.p203v.p204h;

import java.util.concurrent.Executor;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore;
import p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard;

/* JADX INFO: renamed from: c.n.b.a.j.v.h.p, reason: use source file name */
/* JADX INFO: compiled from: WorkInitializer.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkInitializer3 {

    /* JADX INFO: renamed from: a */
    public final Executor f5864a;

    /* JADX INFO: renamed from: b */
    public final EventStore f5865b;

    /* JADX INFO: renamed from: c */
    public final WorkScheduler f5866c;

    /* JADX INFO: renamed from: d */
    public final SynchronizationGuard f5867d;

    public WorkInitializer3(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.f5864a = executor;
        this.f5865b = eventStore;
        this.f5866c = workScheduler;
        this.f5867d = synchronizationGuard;
    }
}
