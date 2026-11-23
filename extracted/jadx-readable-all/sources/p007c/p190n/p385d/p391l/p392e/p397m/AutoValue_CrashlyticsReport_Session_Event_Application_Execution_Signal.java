package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.o, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal extends CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d {

    /* JADX INFO: renamed from: a */
    public final String f26822a;

    /* JADX INFO: renamed from: b */
    public final String f26823b;

    /* JADX INFO: renamed from: c */
    public final long f26824c;

    /* JADX INFO: renamed from: c.n.d.l.e.m.o$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    public static final class b extends CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d.AbstractC8530a {

        /* JADX INFO: renamed from: a */
        public String f26825a;

        /* JADX INFO: renamed from: b */
        public String f26826b;

        /* JADX INFO: renamed from: c */
        public Long f26827c;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d m11929a() {
            String strM1599u = this.f26825a == null ? " name" : "";
            if (this.f26826b == null) {
                strM1599u = outline.m1599u(strM1599u, " code");
            }
            if (this.f26827c == null) {
                strM1599u = outline.m1599u(strM1599u, " address");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(this.f26825a, this.f26826b, this.f26827c.longValue(), null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(String str, String str2, long j2, a aVar) {
        this.f26822a = str;
        this.f26823b = str2;
        this.f26824c = j2;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d
    /* JADX INFO: renamed from: a */
    public long mo11926a() {
        return this.f26824c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d
    /* JADX INFO: renamed from: b */
    public String mo11927b() {
        return this.f26823b;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d
    /* JADX INFO: renamed from: c */
    public String mo11928c() {
        return this.f26822a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d abstractC8529d = (CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d) obj;
        return this.f26822a.equals(abstractC8529d.mo11928c()) && this.f26823b.equals(abstractC8529d.mo11927b()) && this.f26824c == abstractC8529d.mo11926a();
    }

    public int hashCode() {
        int iHashCode = (((this.f26822a.hashCode() ^ 1000003) * 1000003) ^ this.f26823b.hashCode()) * 1000003;
        long j2 = this.f26824c;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Signal{name=");
        sbM1556G.append(this.f26822a);
        sbM1556G.append(", code=");
        sbM1556G.append(this.f26823b);
        sbM1556G.append(", address=");
        sbM1556G.append(this.f26824c);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
