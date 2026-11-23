package p007c.p190n.p194b.p195a.p198j.p203v.p204h;

import android.content.Context;
import java.util.concurrent.Executor;
import p005b1.p006a.Provider;
import p007c.p190n.p194b.p195a.p198j.p199s.BackendRegistry;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore;
import p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;

/* JADX INFO: renamed from: c.n.b.a.j.v.h.m, reason: use source file name */
/* JADX INFO: compiled from: Uploader_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class Uploader_Factory implements Provider {

    /* JADX INFO: renamed from: a */
    public final Provider<Context> f5855a;

    /* JADX INFO: renamed from: b */
    public final Provider<BackendRegistry> f5856b;

    /* JADX INFO: renamed from: c */
    public final Provider<EventStore> f5857c;

    /* JADX INFO: renamed from: d */
    public final Provider<WorkScheduler> f5858d;

    /* JADX INFO: renamed from: e */
    public final Provider<Executor> f5859e;

    /* JADX INFO: renamed from: f */
    public final Provider<SynchronizationGuard> f5860f;

    /* JADX INFO: renamed from: g */
    public final Provider<Clock> f5861g;

    public Uploader_Factory(Provider<Context> provider, Provider<BackendRegistry> provider2, Provider<EventStore> provider3, Provider<WorkScheduler> provider4, Provider<Executor> provider5, Provider<SynchronizationGuard> provider6, Provider<Clock> provider7) {
        this.f5855a = provider;
        this.f5856b = provider2;
        this.f5857c = provider3;
        this.f5858d = provider4;
        this.f5859e = provider5;
        this.f5860f = provider6;
        this.f5861g = provider7;
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        return new Uploader6(this.f5855a.get(), this.f5856b.get(), this.f5857c.get(), this.f5858d.get(), this.f5859e.get(), this.f5860f.get(), this.f5861g.get());
    }
}
