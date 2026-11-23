package p007c.p190n.p385d.p391l.p392e.p397m;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.q, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame extends CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b {

    /* JADX INFO: renamed from: a */
    public final long f26834a;

    /* JADX INFO: renamed from: b */
    public final String f26835b;

    /* JADX INFO: renamed from: c */
    public final String f26836c;

    /* JADX INFO: renamed from: d */
    public final long f26837d;

    /* JADX INFO: renamed from: e */
    public final int f26838e;

    /* JADX INFO: renamed from: c.n.d.l.e.m.q$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    public static final class b extends CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b.AbstractC8533a {

        /* JADX INFO: renamed from: a */
        public Long f26839a;

        /* JADX INFO: renamed from: b */
        public String f26840b;

        /* JADX INFO: renamed from: c */
        public String f26841c;

        /* JADX INFO: renamed from: d */
        public Long f26842d;

        /* JADX INFO: renamed from: e */
        public Integer f26843e;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b m11939a() {
            String strM1599u = this.f26839a == null ? " pc" : "";
            if (this.f26840b == null) {
                strM1599u = outline.m1599u(strM1599u, " symbol");
            }
            if (this.f26842d == null) {
                strM1599u = outline.m1599u(strM1599u, " offset");
            }
            if (this.f26843e == null) {
                strM1599u = outline.m1599u(strM1599u, " importance");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(this.f26839a.longValue(), this.f26840b, this.f26841c, this.f26842d.longValue(), this.f26843e.intValue(), null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }

        /* JADX INFO: renamed from: b */
        public CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b.AbstractC8533a m11940b(long j2) {
            this.f26842d = Long.valueOf(j2);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b.AbstractC8533a m11941c(long j2) {
            this.f26839a = Long.valueOf(j2);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b.AbstractC8533a m11942d(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f26840b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(long j2, String str, String str2, long j3, int i, a aVar) {
        this.f26834a = j2;
        this.f26835b = str;
        this.f26836c = str2;
        this.f26837d = j3;
        this.f26838e = i;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b
    /* JADX INFO: renamed from: a */
    public String mo11934a() {
        return this.f26836c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b
    /* JADX INFO: renamed from: b */
    public int mo11935b() {
        return this.f26838e;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b
    /* JADX INFO: renamed from: c */
    public long mo11936c() {
        return this.f26837d;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b
    /* JADX INFO: renamed from: d */
    public long mo11937d() {
        return this.f26834a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b
    /* JADX INFO: renamed from: e */
    public String mo11938e() {
        return this.f26835b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b abstractC8532b = (CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b) obj;
        return this.f26834a == abstractC8532b.mo11937d() && this.f26835b.equals(abstractC8532b.mo11938e()) && ((str = this.f26836c) != null ? str.equals(abstractC8532b.mo11934a()) : abstractC8532b.mo11934a() == null) && this.f26837d == abstractC8532b.mo11936c() && this.f26838e == abstractC8532b.mo11935b();
    }

    public int hashCode() {
        long j2 = this.f26834a;
        int iHashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f26835b.hashCode()) * 1000003;
        String str = this.f26836c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f26837d;
        return this.f26838e ^ ((iHashCode2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Frame{pc=");
        sbM1556G.append(this.f26834a);
        sbM1556G.append(", symbol=");
        sbM1556G.append(this.f26835b);
        sbM1556G.append(", file=");
        sbM1556G.append(this.f26836c);
        sbM1556G.append(", offset=");
        sbM1556G.append(this.f26837d);
        sbM1556G.append(", importance=");
        return outline.m1603y(sbM1556G, this.f26838e, "}");
    }
}
