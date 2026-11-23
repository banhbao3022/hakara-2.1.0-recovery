package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.l, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution extends CrashlyticsReport.d.AbstractC8523d.a.b {

    /* JADX INFO: renamed from: a */
    public final ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.e> f26796a;

    /* JADX INFO: renamed from: b */
    public final CrashlyticsReport.d.AbstractC8523d.a.b.c f26797b;

    /* JADX INFO: renamed from: c */
    public final CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d f26798c;

    /* JADX INFO: renamed from: d */
    public final ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a> f26799d;

    /* JADX INFO: renamed from: c.n.d.l.e.m.l$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    public static final class b extends CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8527b {

        /* JADX INFO: renamed from: a */
        public ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.e> f26800a;

        /* JADX INFO: renamed from: b */
        public CrashlyticsReport.d.AbstractC8523d.a.b.c f26801b;

        /* JADX INFO: renamed from: c */
        public CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d f26802c;

        /* JADX INFO: renamed from: d */
        public ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a> f26803d;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.AbstractC8523d.a.b m11914a() {
            String strM1599u = this.f26800a == null ? " threads" : "";
            if (this.f26801b == null) {
                strM1599u = outline.m1599u(strM1599u, " exception");
            }
            if (this.f26802c == null) {
                strM1599u = outline.m1599u(strM1599u, " signal");
            }
            if (this.f26803d == null) {
                strM1599u = outline.m1599u(strM1599u, " binaries");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(this.f26800a, this.f26801b, this.f26802c, this.f26803d, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution(ImmutableList3 immutableList3, CrashlyticsReport.d.AbstractC8523d.a.b.c cVar, CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d abstractC8529d, ImmutableList3 immutableList4, a aVar) {
        this.f26796a = immutableList3;
        this.f26797b = cVar;
        this.f26798c = abstractC8529d;
        this.f26799d = immutableList4;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b
    /* JADX INFO: renamed from: a */
    public ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a> mo11910a() {
        return this.f26799d;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b
    /* JADX INFO: renamed from: b */
    public CrashlyticsReport.d.AbstractC8523d.a.b.c mo11911b() {
        return this.f26797b;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b
    /* JADX INFO: renamed from: c */
    public CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d mo11912c() {
        return this.f26798c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b
    /* JADX INFO: renamed from: d */
    public ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.e> mo11913d() {
        return this.f26796a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC8523d.a.b)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC8523d.a.b bVar = (CrashlyticsReport.d.AbstractC8523d.a.b) obj;
        return this.f26796a.equals(bVar.mo11913d()) && this.f26797b.equals(bVar.mo11911b()) && this.f26798c.equals(bVar.mo11912c()) && this.f26799d.equals(bVar.mo11910a());
    }

    public int hashCode() {
        return ((((((this.f26796a.hashCode() ^ 1000003) * 1000003) ^ this.f26797b.hashCode()) * 1000003) ^ this.f26798c.hashCode()) * 1000003) ^ this.f26799d.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Execution{threads=");
        sbM1556G.append(this.f26796a);
        sbM1556G.append(", exception=");
        sbM1556G.append(this.f26797b);
        sbM1556G.append(", signal=");
        sbM1556G.append(this.f26798c);
        sbM1556G.append(", binaries=");
        sbM1556G.append(this.f26799d);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
