package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.m, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage extends CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a {

    /* JADX INFO: renamed from: a */
    public final long f26804a;

    /* JADX INFO: renamed from: b */
    public final long f26805b;

    /* JADX INFO: renamed from: c */
    public final String f26806c;

    /* JADX INFO: renamed from: d */
    public final String f26807d;

    /* JADX INFO: renamed from: c.n.d.l.e.m.m$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    public static final class b extends CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a.AbstractC8526a {

        /* JADX INFO: renamed from: a */
        public Long f26808a;

        /* JADX INFO: renamed from: b */
        public Long f26809b;

        /* JADX INFO: renamed from: c */
        public String f26810c;

        /* JADX INFO: renamed from: d */
        public String f26811d;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a m11919a() {
            String strM1599u = this.f26808a == null ? " baseAddress" : "";
            if (this.f26809b == null) {
                strM1599u = outline.m1599u(strM1599u, " size");
            }
            if (this.f26810c == null) {
                strM1599u = outline.m1599u(strM1599u, " name");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(this.f26808a.longValue(), this.f26809b.longValue(), this.f26810c, this.f26811d, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(long j2, long j3, String str, String str2, a aVar) {
        this.f26804a = j2;
        this.f26805b = j3;
        this.f26806c = str;
        this.f26807d = str2;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a
    /* JADX INFO: renamed from: a */
    public long mo11915a() {
        return this.f26804a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a
    /* JADX INFO: renamed from: b */
    public String mo11916b() {
        return this.f26806c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a
    /* JADX INFO: renamed from: c */
    public long mo11917c() {
        return this.f26805b;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a
    /* JADX INFO: renamed from: d */
    public String mo11918d() {
        return this.f26807d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a abstractC8525a = (CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a) obj;
        if (this.f26804a == abstractC8525a.mo11915a() && this.f26805b == abstractC8525a.mo11917c() && this.f26806c.equals(abstractC8525a.mo11916b())) {
            String str = this.f26807d;
            if (str == null) {
                if (abstractC8525a.mo11918d() == null) {
                    return true;
                }
            } else if (str.equals(abstractC8525a.mo11918d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f26804a;
        long j3 = this.f26805b;
        int iHashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f26806c.hashCode()) * 1000003;
        String str = this.f26807d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("BinaryImage{baseAddress=");
        sbM1556G.append(this.f26804a);
        sbM1556G.append(", size=");
        sbM1556G.append(this.f26805b);
        sbM1556G.append(", name=");
        sbM1556G.append(this.f26806c);
        sbM1556G.append(", uuid=");
        return outline.m1550A(sbM1556G, this.f26807d, "}");
    }
}
