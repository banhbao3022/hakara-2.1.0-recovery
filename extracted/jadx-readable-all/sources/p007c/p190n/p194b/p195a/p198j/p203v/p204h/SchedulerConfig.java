package p007c.p190n.p194b.p195a.p198j.p203v.p204h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p195a.Priority2;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;

/* JADX INFO: renamed from: c.n.b.a.j.v.h.f, reason: use source file name */
/* JADX INFO: compiled from: SchedulerConfig.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SchedulerConfig {

    /* JADX INFO: renamed from: c.n.b.a.j.v.h.f$a */
    /* JADX INFO: compiled from: SchedulerConfig.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public Clock f5827a;

        /* JADX INFO: renamed from: b */
        public Map<Priority2, b> f5828b = new HashMap();
    }

    /* JADX INFO: renamed from: c.n.b.a.j.v.h.f$b */
    /* JADX INFO: compiled from: SchedulerConfig.java */
    public static abstract class b {

        /* JADX INFO: renamed from: c.n.b.a.j.v.h.f$b$a */
        /* JADX INFO: compiled from: SchedulerConfig.java */
        public static abstract class a {
            /* JADX INFO: renamed from: a */
            public abstract b mo2843a();

            /* JADX INFO: renamed from: b */
            public abstract a mo2844b(long j2);

            /* JADX INFO: renamed from: c */
            public abstract a mo2845c(Set<c> set);

            /* JADX INFO: renamed from: d */
            public abstract a mo2846d(long j2);
        }

        /* JADX INFO: renamed from: a */
        public static a m2849a() {
            AutoValue_SchedulerConfig_ConfigValue.b bVar = new AutoValue_SchedulerConfig_ConfigValue.b();
            Set<c> setEmptySet = Collections.emptySet();
            Objects.requireNonNull(setEmptySet, "Null flags");
            bVar.f5821c = setEmptySet;
            return bVar;
        }

        /* JADX INFO: renamed from: b */
        public abstract long mo2840b();

        /* JADX INFO: renamed from: c */
        public abstract Set<c> mo2841c();

        /* JADX INFO: renamed from: d */
        public abstract long mo2842d();
    }

    /* JADX INFO: renamed from: c.n.b.a.j.v.h.f$c */
    /* JADX INFO: compiled from: SchedulerConfig.java */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* JADX INFO: renamed from: a */
    public abstract Clock mo2838a();

    /* JADX INFO: renamed from: b */
    public long m2848b(Priority2 priority2, long j2, int i) {
        long jMo2878a = j2 - mo2838a().mo2878a();
        b bVar = mo2839c().get(priority2);
        long jMo2840b = bVar.mo2840b();
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * jMo2840b * Math.max(1.0d, Math.log(10000.0d) / Math.log((jMo2840b > 1 ? jMo2840b : 2L) * ((long) i2)))), jMo2878a), bVar.mo2842d());
    }

    /* JADX INFO: renamed from: c */
    public abstract Map<Priority2, b> mo2839c();
}
