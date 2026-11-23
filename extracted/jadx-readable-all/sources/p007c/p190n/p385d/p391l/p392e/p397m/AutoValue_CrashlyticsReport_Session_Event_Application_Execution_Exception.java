package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.n, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception extends CrashlyticsReport.d.AbstractC8523d.a.b.c {

    /* JADX INFO: renamed from: a */
    public final String f26812a;

    /* JADX INFO: renamed from: b */
    public final String f26813b;

    /* JADX INFO: renamed from: c */
    public final ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b> f26814c;

    /* JADX INFO: renamed from: d */
    public final CrashlyticsReport.d.AbstractC8523d.a.b.c f26815d;

    /* JADX INFO: renamed from: e */
    public final int f26816e;

    /* JADX INFO: renamed from: c.n.d.l.e.m.n$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    public static final class b extends CrashlyticsReport.d.AbstractC8523d.a.b.c.AbstractC8528a {

        /* JADX INFO: renamed from: a */
        public String f26817a;

        /* JADX INFO: renamed from: b */
        public String f26818b;

        /* JADX INFO: renamed from: c */
        public ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b> f26819c;

        /* JADX INFO: renamed from: d */
        public CrashlyticsReport.d.AbstractC8523d.a.b.c f26820d;

        /* JADX INFO: renamed from: e */
        public Integer f26821e;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.AbstractC8523d.a.b.c m11925a() {
            String strM1599u = this.f26817a == null ? " type" : "";
            if (this.f26819c == null) {
                strM1599u = outline.m1599u(strM1599u, " frames");
            }
            if (this.f26821e == null) {
                strM1599u = outline.m1599u(strM1599u, " overflowCount");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(this.f26817a, this.f26818b, this.f26819c, this.f26820d, this.f26821e.intValue(), null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(String str, String str2, ImmutableList3 immutableList3, CrashlyticsReport.d.AbstractC8523d.a.b.c cVar, int i, a aVar) {
        this.f26812a = str;
        this.f26813b = str2;
        this.f26814c = immutableList3;
        this.f26815d = cVar;
        this.f26816e = i;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.c
    /* JADX INFO: renamed from: a */
    public CrashlyticsReport.d.AbstractC8523d.a.b.c mo11920a() {
        return this.f26815d;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.c
    /* JADX INFO: renamed from: b */
    public ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b> mo11921b() {
        return this.f26814c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.c
    /* JADX INFO: renamed from: c */
    public int mo11922c() {
        return this.f26816e;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.c
    /* JADX INFO: renamed from: d */
    public String mo11923d() {
        return this.f26813b;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.c
    /* JADX INFO: renamed from: e */
    public String mo11924e() {
        return this.f26812a;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.d.AbstractC8523d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC8523d.a.b.c)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC8523d.a.b.c cVar2 = (CrashlyticsReport.d.AbstractC8523d.a.b.c) obj;
        return this.f26812a.equals(cVar2.mo11924e()) && ((str = this.f26813b) != null ? str.equals(cVar2.mo11923d()) : cVar2.mo11923d() == null) && this.f26814c.equals(cVar2.mo11921b()) && ((cVar = this.f26815d) != null ? cVar.equals(cVar2.mo11920a()) : cVar2.mo11920a() == null) && this.f26816e == cVar2.mo11922c();
    }

    public int hashCode() {
        int iHashCode = (this.f26812a.hashCode() ^ 1000003) * 1000003;
        String str = this.f26813b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f26814c.hashCode()) * 1000003;
        CrashlyticsReport.d.AbstractC8523d.a.b.c cVar = this.f26815d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f26816e;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Exception{type=");
        sbM1556G.append(this.f26812a);
        sbM1556G.append(", reason=");
        sbM1556G.append(this.f26813b);
        sbM1556G.append(", frames=");
        sbM1556G.append(this.f26814c);
        sbM1556G.append(", causedBy=");
        sbM1556G.append(this.f26815d);
        sbM1556G.append(", overflowCount=");
        return outline.m1603y(sbM1556G, this.f26816e, "}");
    }
}
