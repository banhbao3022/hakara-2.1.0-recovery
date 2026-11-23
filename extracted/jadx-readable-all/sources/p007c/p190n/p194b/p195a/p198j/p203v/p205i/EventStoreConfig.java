package p007c.p190n.p194b.p195a.p198j.p203v.p205i;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.a.j.v.i.d, reason: use source file name */
/* JADX INFO: compiled from: EventStoreConfig.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class EventStoreConfig {

    /* JADX INFO: renamed from: a */
    public static final EventStoreConfig f5883a;

    static {
        Long l = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l2 = 604800000L;
        Integer num3 = 81920;
        String strM1599u = l == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            strM1599u = outline.m1599u(strM1599u, " loadBatchSize");
        }
        if (num2 == null) {
            strM1599u = outline.m1599u(strM1599u, " criticalSectionEnterTimeoutMs");
        }
        if (l2 == null) {
            strM1599u = outline.m1599u(strM1599u, " eventCleanUpAge");
        }
        if (num3 == null) {
            strM1599u = outline.m1599u(strM1599u, " maxBlobByteSizePerRow");
        }
        if (!strM1599u.isEmpty()) {
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
        f5883a = new AutoValue_EventStoreConfig(l.longValue(), num.intValue(), num2.intValue(), l2.longValue(), num3.intValue(), null);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo2851a();

    /* JADX INFO: renamed from: b */
    public abstract long mo2852b();

    /* JADX INFO: renamed from: c */
    public abstract int mo2853c();

    /* JADX INFO: renamed from: d */
    public abstract int mo2854d();

    /* JADX INFO: renamed from: e */
    public abstract long mo2855e();
}
