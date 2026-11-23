package p007c.p190n.p194b.p195a.p198j.p203v;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p195a.TransportScheduleCallback;
import p007c.p190n.p194b.p195a.p198j.EventInternal;
import p007c.p190n.p194b.p195a.p198j.TransportContext;
import p007c.p190n.p194b.p195a.p198j.TransportRuntime;
import p007c.p190n.p194b.p195a.p198j.p199s.BackendRegistry;
import p007c.p190n.p194b.p195a.p198j.p199s.TransportBackend;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.WorkScheduler;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore;
import p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard;

/* JADX INFO: renamed from: c.n.b.a.j.v.c, reason: use source file name */
/* JADX INFO: compiled from: DefaultScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultScheduler3 implements Scheduler {

    /* JADX INFO: renamed from: a */
    public static final Logger f5797a = Logger.getLogger(TransportRuntime.class.getName());

    /* JADX INFO: renamed from: b */
    public final WorkScheduler f5798b;

    /* JADX INFO: renamed from: c */
    public final Executor f5799c;

    /* JADX INFO: renamed from: d */
    public final BackendRegistry f5800d;

    /* JADX INFO: renamed from: e */
    public final EventStore f5801e;

    /* JADX INFO: renamed from: f */
    public final SynchronizationGuard f5802f;

    public DefaultScheduler3(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.f5799c = executor;
        this.f5800d = backendRegistry;
        this.f5798b = workScheduler;
        this.f5801e = eventStore;
        this.f5802f = synchronizationGuard;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.Scheduler
    /* JADX INFO: renamed from: a */
    public void mo2837a(final TransportContext transportContext, final EventInternal eventInternal, final TransportScheduleCallback transportScheduleCallback) {
        this.f5799c.execute(new Runnable(this, transportContext, transportScheduleCallback, eventInternal) { // from class: c.n.b.a.j.v.a

            /* JADX INFO: renamed from: f */
            public final DefaultScheduler3 f5790f;

            /* JADX INFO: renamed from: g */
            public final TransportContext f5791g;

            /* JADX INFO: renamed from: h */
            public final TransportScheduleCallback f5792h;

            /* JADX INFO: renamed from: i */
            public final EventInternal f5793i;

            {
                this.f5790f = this;
                this.f5791g = transportContext;
                this.f5792h = transportScheduleCallback;
                this.f5793i = eventInternal;
            }

            @Override // java.lang.Runnable
            public void run() {
                final DefaultScheduler3 defaultScheduler3 = this.f5790f;
                final TransportContext transportContext2 = this.f5791g;
                TransportScheduleCallback transportScheduleCallback2 = this.f5792h;
                EventInternal eventInternal2 = this.f5793i;
                Logger logger = DefaultScheduler3.f5797a;
                try {
                    TransportBackend transportBackendMo2831a = defaultScheduler3.f5800d.mo2831a(transportContext2.mo2808b());
                    if (transportBackendMo2831a == null) {
                        String str = String.format("Transport backend '%s' is not registered", transportContext2.mo2808b());
                        DefaultScheduler3.f5797a.warning(str);
                        transportScheduleCallback2.mo2751a(new IllegalArgumentException(str));
                    } else {
                        final EventInternal eventInternalMo2757b = transportBackendMo2831a.mo2757b(eventInternal2);
                        defaultScheduler3.f5802f.mo2871a(new SynchronizationGuard.a(defaultScheduler3, transportContext2, eventInternalMo2757b) { // from class: c.n.b.a.j.v.b

                            /* JADX INFO: renamed from: a */
                            public final DefaultScheduler3 f5794a;

                            /* JADX INFO: renamed from: b */
                            public final TransportContext f5795b;

                            /* JADX INFO: renamed from: c */
                            public final EventInternal f5796c;

                            {
                                this.f5794a = defaultScheduler3;
                                this.f5795b = transportContext2;
                                this.f5796c = eventInternalMo2757b;
                            }

                            @Override // p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard.a
                            /* JADX INFO: renamed from: h */
                            public Object mo2836h() {
                                DefaultScheduler3 defaultScheduler4 = this.f5794a;
                                TransportContext transportContext3 = this.f5795b;
                                defaultScheduler4.f5801e.mo2862k0(transportContext3, this.f5796c);
                                defaultScheduler4.f5798b.mo2847a(transportContext3, 1);
                                return null;
                            }
                        });
                        transportScheduleCallback2.mo2751a(null);
                    }
                } catch (Exception e) {
                    Logger logger2 = DefaultScheduler3.f5797a;
                    StringBuilder sbM1556G = outline.m1556G("Error scheduling event ");
                    sbM1556G.append(e.getMessage());
                    logger2.warning(sbM1556G.toString());
                    transportScheduleCallback2.mo2751a(e);
                }
            }
        });
    }
}
