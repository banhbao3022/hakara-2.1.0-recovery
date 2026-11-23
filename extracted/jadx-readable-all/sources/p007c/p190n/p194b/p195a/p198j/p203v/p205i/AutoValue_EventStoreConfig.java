package p007c.p190n.p194b.p195a.p198j.p203v.p205i;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.j.v.i.a, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_EventStoreConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_EventStoreConfig extends EventStoreConfig {

    /* JADX INFO: renamed from: b */
    public final long f5872b;

    /* JADX INFO: renamed from: c */
    public final int f5873c;

    /* JADX INFO: renamed from: d */
    public final int f5874d;

    /* JADX INFO: renamed from: e */
    public final long f5875e;

    /* JADX INFO: renamed from: f */
    public final int f5876f;

    public AutoValue_EventStoreConfig(long j2, int i, int i2, long j3, int i3, a aVar) {
        this.f5872b = j2;
        this.f5873c = i;
        this.f5874d = i2;
        this.f5875e = j3;
        this.f5876f = i3;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStoreConfig
    /* JADX INFO: renamed from: a */
    public int mo2851a() {
        return this.f5874d;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStoreConfig
    /* JADX INFO: renamed from: b */
    public long mo2852b() {
        return this.f5875e;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStoreConfig
    /* JADX INFO: renamed from: c */
    public int mo2853c() {
        return this.f5873c;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStoreConfig
    /* JADX INFO: renamed from: d */
    public int mo2854d() {
        return this.f5876f;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStoreConfig
    /* JADX INFO: renamed from: e */
    public long mo2855e() {
        return this.f5872b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventStoreConfig)) {
            return false;
        }
        EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
        return this.f5872b == eventStoreConfig.mo2855e() && this.f5873c == eventStoreConfig.mo2853c() && this.f5874d == eventStoreConfig.mo2851a() && this.f5875e == eventStoreConfig.mo2852b() && this.f5876f == eventStoreConfig.mo2854d();
    }

    public int hashCode() {
        long j2 = this.f5872b;
        int i = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f5873c) * 1000003) ^ this.f5874d) * 1000003;
        long j3 = this.f5875e;
        return this.f5876f ^ ((i ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("EventStoreConfig{maxStorageSizeInBytes=");
        sbM1556G.append(this.f5872b);
        sbM1556G.append(", loadBatchSize=");
        sbM1556G.append(this.f5873c);
        sbM1556G.append(", criticalSectionEnterTimeoutMs=");
        sbM1556G.append(this.f5874d);
        sbM1556G.append(", eventCleanUpAge=");
        sbM1556G.append(this.f5875e);
        sbM1556G.append(", maxBlobByteSizePerRow=");
        return outline.m1603y(sbM1556G, this.f5876f, "}");
    }
}
