package p007c.p190n.p194b.p195a.p198j.p203v.p204h;

import java.util.Objects;
import java.util.Set;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.j.v.h.c, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.b {

    /* JADX INFO: renamed from: a */
    public final long f5816a;

    /* JADX INFO: renamed from: b */
    public final long f5817b;

    /* JADX INFO: renamed from: c */
    public final Set<SchedulerConfig.c> f5818c;

    /* JADX INFO: renamed from: c.n.b.a.j.v.h.c$b */
    /* JADX INFO: compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    public static final class b extends SchedulerConfig.b.a {

        /* JADX INFO: renamed from: a */
        public Long f5819a;

        /* JADX INFO: renamed from: b */
        public Long f5820b;

        /* JADX INFO: renamed from: c */
        public Set<SchedulerConfig.c> f5821c;

        @Override // p007c.p190n.p194b.p195a.p198j.p203v.p204h.SchedulerConfig.b.a
        /* JADX INFO: renamed from: a */
        public SchedulerConfig.b mo2843a() {
            String strM1599u = this.f5819a == null ? " delta" : "";
            if (this.f5820b == null) {
                strM1599u = outline.m1599u(strM1599u, " maxAllowedDelay");
            }
            if (this.f5821c == null) {
                strM1599u = outline.m1599u(strM1599u, " flags");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.f5819a.longValue(), this.f5820b.longValue(), this.f5821c, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }

        @Override // p007c.p190n.p194b.p195a.p198j.p203v.p204h.SchedulerConfig.b.a
        /* JADX INFO: renamed from: b */
        public SchedulerConfig.b.a mo2844b(long j2) {
            this.f5819a = Long.valueOf(j2);
            return this;
        }

        @Override // p007c.p190n.p194b.p195a.p198j.p203v.p204h.SchedulerConfig.b.a
        /* JADX INFO: renamed from: c */
        public SchedulerConfig.b.a mo2845c(Set<SchedulerConfig.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f5821c = set;
            return this;
        }

        @Override // p007c.p190n.p194b.p195a.p198j.p203v.p204h.SchedulerConfig.b.a
        /* JADX INFO: renamed from: d */
        public SchedulerConfig.b.a mo2846d(long j2) {
            this.f5820b = Long.valueOf(j2);
            return this;
        }
    }

    public AutoValue_SchedulerConfig_ConfigValue(long j2, long j3, Set set, a aVar) {
        this.f5816a = j2;
        this.f5817b = j3;
        this.f5818c = set;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p204h.SchedulerConfig.b
    /* JADX INFO: renamed from: b */
    public long mo2840b() {
        return this.f5816a;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p204h.SchedulerConfig.b
    /* JADX INFO: renamed from: c */
    public Set<SchedulerConfig.c> mo2841c() {
        return this.f5818c;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p204h.SchedulerConfig.b
    /* JADX INFO: renamed from: d */
    public long mo2842d() {
        return this.f5817b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.b)) {
            return false;
        }
        SchedulerConfig.b bVar = (SchedulerConfig.b) obj;
        return this.f5816a == bVar.mo2840b() && this.f5817b == bVar.mo2842d() && this.f5818c.equals(bVar.mo2841c());
    }

    public int hashCode() {
        long j2 = this.f5816a;
        int i = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        long j3 = this.f5817b;
        return this.f5818c.hashCode() ^ ((i ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ConfigValue{delta=");
        sbM1556G.append(this.f5816a);
        sbM1556G.append(", maxAllowedDelay=");
        sbM1556G.append(this.f5817b);
        sbM1556G.append(", flags=");
        sbM1556G.append(this.f5818c);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
