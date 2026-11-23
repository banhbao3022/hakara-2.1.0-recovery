package p007c.p190n.p194b.p195a.p198j.p203v.p204h;

import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p195a.Priority2;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;

/* JADX INFO: renamed from: c.n.b.a.j.v.h.b, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_SchedulerConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_SchedulerConfig extends SchedulerConfig {

    /* JADX INFO: renamed from: a */
    public final Clock f5814a;

    /* JADX INFO: renamed from: b */
    public final Map<Priority2, SchedulerConfig.b> f5815b;

    public AutoValue_SchedulerConfig(Clock clock, Map<Priority2, SchedulerConfig.b> map) {
        Objects.requireNonNull(clock, "Null clock");
        this.f5814a = clock;
        Objects.requireNonNull(map, "Null values");
        this.f5815b = map;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p204h.SchedulerConfig
    /* JADX INFO: renamed from: a */
    public Clock mo2838a() {
        return this.f5814a;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p204h.SchedulerConfig
    /* JADX INFO: renamed from: c */
    public Map<Priority2, SchedulerConfig.b> mo2839c() {
        return this.f5815b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f5814a.equals(schedulerConfig.mo2838a()) && this.f5815b.equals(schedulerConfig.mo2839c());
    }

    public int hashCode() {
        return ((this.f5814a.hashCode() ^ 1000003) * 1000003) ^ this.f5815b.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("SchedulerConfig{clock=");
        sbM1556G.append(this.f5814a);
        sbM1556G.append(", values=");
        sbM1556G.append(this.f5815b);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
