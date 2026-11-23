package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.g, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.d.a {

    /* JADX INFO: renamed from: a */
    public final String f26747a;

    /* JADX INFO: renamed from: b */
    public final String f26748b;

    /* JADX INFO: renamed from: c */
    public final String f26749c;

    /* JADX INFO: renamed from: d */
    public final CrashlyticsReport.d.a.b f26750d = null;

    /* JADX INFO: renamed from: e */
    public final String f26751e;

    /* JADX INFO: renamed from: f */
    public final String f26752f;

    /* JADX INFO: renamed from: g */
    public final String f26753g;

    /* JADX INFO: renamed from: c.n.d.l.e.m.g$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    public static final class b extends CrashlyticsReport.d.a.AbstractC8522a {

        /* JADX INFO: renamed from: a */
        public String f26754a;

        /* JADX INFO: renamed from: b */
        public String f26755b;

        /* JADX INFO: renamed from: c */
        public String f26756c;

        /* JADX INFO: renamed from: d */
        public String f26757d;

        /* JADX INFO: renamed from: e */
        public String f26758e;

        /* JADX INFO: renamed from: f */
        public String f26759f;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.a m11883a() {
            String strM1599u = this.f26754a == null ? " identifier" : "";
            if (this.f26755b == null) {
                strM1599u = outline.m1599u(strM1599u, " version");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Application(this.f26754a, this.f26755b, this.f26756c, null, this.f26757d, this.f26758e, this.f26759f, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
    }

    public AutoValue_CrashlyticsReport_Session_Application(String str, String str2, String str3, CrashlyticsReport.d.a.b bVar, String str4, String str5, String str6, a aVar) {
        this.f26747a = str;
        this.f26748b = str2;
        this.f26749c = str3;
        this.f26751e = str4;
        this.f26752f = str5;
        this.f26753g = str6;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.a
    /* JADX INFO: renamed from: a */
    public String mo11876a() {
        return this.f26752f;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.a
    /* JADX INFO: renamed from: b */
    public String mo11877b() {
        return this.f26753g;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.a
    /* JADX INFO: renamed from: c */
    public String mo11878c() {
        return this.f26749c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.a
    /* JADX INFO: renamed from: d */
    public String mo11879d() {
        return this.f26747a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.a
    /* JADX INFO: renamed from: e */
    public String mo11880e() {
        return this.f26751e;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.d.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.a)) {
            return false;
        }
        CrashlyticsReport.d.a aVar = (CrashlyticsReport.d.a) obj;
        if (this.f26747a.equals(aVar.mo11879d()) && this.f26748b.equals(aVar.mo11882g()) && ((str = this.f26749c) != null ? str.equals(aVar.mo11878c()) : aVar.mo11878c() == null) && ((bVar = this.f26750d) != null ? bVar.equals(aVar.mo11881f()) : aVar.mo11881f() == null) && ((str2 = this.f26751e) != null ? str2.equals(aVar.mo11880e()) : aVar.mo11880e() == null) && ((str3 = this.f26752f) != null ? str3.equals(aVar.mo11876a()) : aVar.mo11876a() == null)) {
            String str4 = this.f26753g;
            if (str4 == null) {
                if (aVar.mo11877b() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.mo11877b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.a
    /* JADX INFO: renamed from: f */
    public CrashlyticsReport.d.a.b mo11881f() {
        return this.f26750d;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.a
    /* JADX INFO: renamed from: g */
    public String mo11882g() {
        return this.f26748b;
    }

    public int hashCode() {
        int iHashCode = (((this.f26747a.hashCode() ^ 1000003) * 1000003) ^ this.f26748b.hashCode()) * 1000003;
        String str = this.f26749c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.d.a.b bVar = this.f26750d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f26751e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f26752f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f26753g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Application{identifier=");
        sbM1556G.append(this.f26747a);
        sbM1556G.append(", version=");
        sbM1556G.append(this.f26748b);
        sbM1556G.append(", displayVersion=");
        sbM1556G.append(this.f26749c);
        sbM1556G.append(", organization=");
        sbM1556G.append(this.f26750d);
        sbM1556G.append(", installationUuid=");
        sbM1556G.append(this.f26751e);
        sbM1556G.append(", developmentPlatform=");
        sbM1556G.append(this.f26752f);
        sbM1556G.append(", developmentPlatformVersion=");
        return outline.m1550A(sbM1556G, this.f26753g, "}");
    }
}
