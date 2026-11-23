package p007c.p190n.p194b.p195a.p198j;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;
import p005b1.p006a.Provider;
import p007c.p190n.p194b.p195a.p198j.p199s.CreationContextFactory_Factory;
import p007c.p190n.p194b.p195a.p198j.p199s.MetadataBackendRegistry_Factory;
import p007c.p190n.p194b.p195a.p198j.p200t.p201a.DoubleCheck;
import p007c.p190n.p194b.p195a.p198j.p200t.p201a.InstanceFactory;
import p007c.p190n.p194b.p195a.p198j.p203v.DefaultScheduler3;
import p007c.p190n.p194b.p195a.p198j.p203v.DefaultScheduler_Factory;
import p007c.p190n.p194b.p195a.p198j.p203v.SchedulingConfigModule_ConfigFactory;
import p007c.p190n.p194b.p195a.p198j.p203v.SchedulingModule_WorkSchedulerFactory;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.SchedulerConfig;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.Uploader6;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.Uploader_Factory;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.WorkInitializer3;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.WorkInitializer_Factory;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.WorkScheduler;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.C1380t;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStoreModule_DbNameFactory;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStoreModule_SchemaVersionFactory;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStoreModule_StoreConfigFactory;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.SQLiteEventStore_Factory;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.SchemaManager_Factory;
import p007c.p190n.p194b.p195a.p198j.p207x.TimeModule_EventClockFactory;
import p007c.p190n.p194b.p195a.p198j.p207x.TimeModule_UptimeClockFactory;

/* JADX INFO: renamed from: c.n.b.a.j.d, reason: use source file name */
/* JADX INFO: compiled from: DaggerTransportRuntimeComponent.java */
/* JADX INFO: loaded from: classes.dex */
public final class DaggerTransportRuntimeComponent extends TransportRuntimeComponent {

    /* JADX INFO: renamed from: f */
    public Provider<Executor> f5723f = DoubleCheck.m2834a(ExecutionModule_ExecutorFactory.a.f5737a);

    /* JADX INFO: renamed from: g */
    public Provider<Context> f5724g;

    /* JADX INFO: renamed from: h */
    public Provider f5725h;

    /* JADX INFO: renamed from: i */
    public Provider f5726i;

    /* JADX INFO: renamed from: j */
    public Provider f5727j;

    /* JADX INFO: renamed from: k */
    public Provider<C1380t> f5728k;

    /* JADX INFO: renamed from: l */
    public Provider<SchedulerConfig> f5729l;

    /* JADX INFO: renamed from: m */
    public Provider<WorkScheduler> f5730m;

    /* JADX INFO: renamed from: n */
    public Provider<DefaultScheduler3> f5731n;

    /* JADX INFO: renamed from: o */
    public Provider<Uploader6> f5732o;

    /* JADX INFO: renamed from: p */
    public Provider<WorkInitializer3> f5733p;

    /* JADX INFO: renamed from: q */
    public Provider<TransportRuntime> f5734q;

    public DaggerTransportRuntimeComponent(Context context, a aVar) {
        Objects.requireNonNull(context, "instance cannot be null");
        InstanceFactory instanceFactory = new InstanceFactory(context);
        this.f5724g = instanceFactory;
        TimeModule_EventClockFactory timeModule_EventClockFactory = TimeModule_EventClockFactory.a.f5922a;
        TimeModule_UptimeClockFactory timeModule_UptimeClockFactory = TimeModule_UptimeClockFactory.a.f5923a;
        CreationContextFactory_Factory creationContextFactory_Factory = new CreationContextFactory_Factory(instanceFactory, timeModule_EventClockFactory, timeModule_UptimeClockFactory);
        this.f5725h = creationContextFactory_Factory;
        Provider metadataBackendRegistry_Factory = new MetadataBackendRegistry_Factory(this.f5724g, creationContextFactory_Factory);
        this.f5726i = metadataBackendRegistry_Factory instanceof DoubleCheck ? metadataBackendRegistry_Factory : new DoubleCheck(metadataBackendRegistry_Factory);
        SchemaManager_Factory schemaManager_Factory = new SchemaManager_Factory(this.f5724g, EventStoreModule_DbNameFactory.a.f5884a, EventStoreModule_SchemaVersionFactory.a.f5885a);
        this.f5727j = schemaManager_Factory;
        Provider<C1380t> sQLiteEventStore_Factory = new SQLiteEventStore_Factory(timeModule_EventClockFactory, timeModule_UptimeClockFactory, EventStoreModule_StoreConfigFactory.a.f5886a, schemaManager_Factory);
        this.f5728k = sQLiteEventStore_Factory instanceof DoubleCheck ? sQLiteEventStore_Factory : new DoubleCheck(sQLiteEventStore_Factory);
        SchedulingConfigModule_ConfigFactory schedulingConfigModule_ConfigFactory = new SchedulingConfigModule_ConfigFactory(timeModule_EventClockFactory);
        this.f5729l = schedulingConfigModule_ConfigFactory;
        SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory = new SchedulingModule_WorkSchedulerFactory(this.f5724g, this.f5728k, schedulingConfigModule_ConfigFactory, timeModule_UptimeClockFactory);
        this.f5730m = schedulingModule_WorkSchedulerFactory;
        Provider<Executor> provider = this.f5723f;
        Provider provider2 = this.f5726i;
        Provider<C1380t> provider3 = this.f5728k;
        this.f5731n = new DefaultScheduler_Factory(provider, provider2, schedulingModule_WorkSchedulerFactory, provider3, provider3);
        Provider<Context> provider4 = this.f5724g;
        Provider provider5 = this.f5726i;
        Provider<C1380t> provider6 = this.f5728k;
        this.f5732o = new Uploader_Factory(provider4, provider5, provider6, this.f5730m, this.f5723f, provider6, timeModule_EventClockFactory);
        Provider<Executor> provider7 = this.f5723f;
        Provider<C1380t> provider8 = this.f5728k;
        WorkInitializer_Factory workInitializer_Factory = new WorkInitializer_Factory(provider7, provider8, this.f5730m, provider8);
        this.f5733p = workInitializer_Factory;
        Provider<TransportRuntime> transportRuntime_Factory = new TransportRuntime_Factory(timeModule_EventClockFactory, timeModule_UptimeClockFactory, this.f5731n, this.f5732o, workInitializer_Factory);
        this.f5734q = transportRuntime_Factory instanceof DoubleCheck ? transportRuntime_Factory : new DoubleCheck(transportRuntime_Factory);
    }
}
