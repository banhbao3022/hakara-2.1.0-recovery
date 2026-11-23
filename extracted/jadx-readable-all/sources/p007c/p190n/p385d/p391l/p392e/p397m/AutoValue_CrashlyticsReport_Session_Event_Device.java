package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.r, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_Event_Device extends CrashlyticsReport.d.AbstractC8523d.c {

    /* JADX INFO: renamed from: a */
    public final Double f26844a;

    /* JADX INFO: renamed from: b */
    public final int f26845b;

    /* JADX INFO: renamed from: c */
    public final boolean f26846c;

    /* JADX INFO: renamed from: d */
    public final int f26847d;

    /* JADX INFO: renamed from: e */
    public final long f26848e;

    /* JADX INFO: renamed from: f */
    public final long f26849f;

    /* JADX INFO: renamed from: c.n.d.l.e.m.r$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    public static final class b extends CrashlyticsReport.d.AbstractC8523d.c.a {

        /* JADX INFO: renamed from: a */
        public Double f26850a;

        /* JADX INFO: renamed from: b */
        public Integer f26851b;

        /* JADX INFO: renamed from: c */
        public Boolean f26852c;

        /* JADX INFO: renamed from: d */
        public Integer f26853d;

        /* JADX INFO: renamed from: e */
        public Long f26854e;

        /* JADX INFO: renamed from: f */
        public Long f26855f;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.AbstractC8523d.c m11949a() {
            String strM1599u = this.f26851b == null ? " batteryVelocity" : "";
            if (this.f26852c == null) {
                strM1599u = outline.m1599u(strM1599u, " proximityOn");
            }
            if (this.f26853d == null) {
                strM1599u = outline.m1599u(strM1599u, " orientation");
            }
            if (this.f26854e == null) {
                strM1599u = outline.m1599u(strM1599u, " ramUsed");
            }
            if (this.f26855f == null) {
                strM1599u = outline.m1599u(strM1599u, " diskUsed");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Device(this.f26850a, this.f26851b.intValue(), this.f26852c.booleanValue(), this.f26853d.intValue(), this.f26854e.longValue(), this.f26855f.longValue(), null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Device(Double d, int i, boolean z, int i2, long j2, long j3, a aVar) {
        this.f26844a = d;
        this.f26845b = i;
        this.f26846c = z;
        this.f26847d = i2;
        this.f26848e = j2;
        this.f26849f = j3;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.c
    /* JADX INFO: renamed from: a */
    public Double mo11943a() {
        return this.f26844a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.c
    /* JADX INFO: renamed from: b */
    public int mo11944b() {
        return this.f26845b;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.c
    /* JADX INFO: renamed from: c */
    public long mo11945c() {
        return this.f26849f;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.c
    /* JADX INFO: renamed from: d */
    public int mo11946d() {
        return this.f26847d;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.c
    /* JADX INFO: renamed from: e */
    public long mo11947e() {
        return this.f26848e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC8523d.c)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC8523d.c cVar = (CrashlyticsReport.d.AbstractC8523d.c) obj;
        Double d = this.f26844a;
        if (d != null ? d.equals(cVar.mo11943a()) : cVar.mo11943a() == null) {
            if (this.f26845b == cVar.mo11944b() && this.f26846c == cVar.mo11948f() && this.f26847d == cVar.mo11946d() && this.f26848e == cVar.mo11947e() && this.f26849f == cVar.mo11945c()) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.c
    /* JADX INFO: renamed from: f */
    public boolean mo11948f() {
        return this.f26846c;
    }

    public int hashCode() {
        Double d = this.f26844a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f26845b) * 1000003) ^ (this.f26846c ? 1231 : 1237)) * 1000003) ^ this.f26847d) * 1000003;
        long j2 = this.f26848e;
        long j3 = this.f26849f;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Device{batteryLevel=");
        sbM1556G.append(this.f26844a);
        sbM1556G.append(", batteryVelocity=");
        sbM1556G.append(this.f26845b);
        sbM1556G.append(", proximityOn=");
        sbM1556G.append(this.f26846c);
        sbM1556G.append(", orientation=");
        sbM1556G.append(this.f26847d);
        sbM1556G.append(", ramUsed=");
        sbM1556G.append(this.f26848e);
        sbM1556G.append(", diskUsed=");
        sbM1556G.append(this.f26849f);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
