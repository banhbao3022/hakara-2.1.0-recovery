package p007c.p190n.p194b.p195a.p198j.p203v;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import p005b1.p006a.Provider;
import p007c.p190n.p194b.p195a.Priority2;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.AutoValue_SchedulerConfig;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.SchedulerConfig;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;

/* JADX INFO: renamed from: c.n.b.a.j.v.f, reason: use source file name */
/* JADX INFO: compiled from: SchedulingConfigModule_ConfigFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class SchedulingConfigModule_ConfigFactory implements Provider {

    /* JADX INFO: renamed from: a */
    public final Provider<Clock> f5808a;

    public SchedulingConfigModule_ConfigFactory(Provider<Clock> provider) {
        this.f5808a = provider;
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        Clock clock = this.f5808a.get();
        SchedulerConfig.a aVar = new SchedulerConfig.a();
        Priority2 priority2 = Priority2.DEFAULT;
        SchedulerConfig.b.a aVarM2849a = SchedulerConfig.b.m2849a();
        aVarM2849a.mo2844b(30000L);
        aVarM2849a.mo2846d(86400000L);
        aVar.f5828b.put(priority2, aVarM2849a.mo2843a());
        Priority2 priority3 = Priority2.HIGHEST;
        SchedulerConfig.b.a aVarM2849a2 = SchedulerConfig.b.m2849a();
        aVarM2849a2.mo2844b(1000L);
        aVarM2849a2.mo2846d(86400000L);
        aVar.f5828b.put(priority3, aVarM2849a2.mo2843a());
        Priority2 priority4 = Priority2.VERY_LOW;
        SchedulerConfig.b.a aVarM2849a3 = SchedulerConfig.b.m2849a();
        aVarM2849a3.mo2844b(86400000L);
        aVarM2849a3.mo2846d(86400000L);
        aVarM2849a3.mo2845c(Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.c.NETWORK_UNMETERED, SchedulerConfig.c.DEVICE_IDLE))));
        aVar.f5828b.put(priority4, aVarM2849a3.mo2843a());
        aVar.f5827a = clock;
        Objects.requireNonNull(clock, "missing required property: clock");
        int size = aVar.f5828b.keySet().size();
        Priority2.values();
        if (size < 3) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        Map<Priority2, SchedulerConfig.b> map = aVar.f5828b;
        aVar.f5828b = new HashMap();
        return new AutoValue_SchedulerConfig(aVar.f5827a, map);
    }
}
