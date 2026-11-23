package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.b, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport extends CrashlyticsReport {

    /* JADX INFO: renamed from: b */
    public final String f26697b;

    /* JADX INFO: renamed from: c */
    public final String f26698c;

    /* JADX INFO: renamed from: d */
    public final int f26699d;

    /* JADX INFO: renamed from: e */
    public final String f26700e;

    /* JADX INFO: renamed from: f */
    public final String f26701f;

    /* JADX INFO: renamed from: g */
    public final String f26702g;

    /* JADX INFO: renamed from: h */
    public final CrashlyticsReport.d f26703h;

    /* JADX INFO: renamed from: i */
    public final CrashlyticsReport.c f26704i;

    /* JADX INFO: renamed from: c.n.d.l.e.m.b$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport.java */
    public static final class b extends CrashlyticsReport.a {

        /* JADX INFO: renamed from: a */
        public String f26705a;

        /* JADX INFO: renamed from: b */
        public String f26706b;

        /* JADX INFO: renamed from: c */
        public Integer f26707c;

        /* JADX INFO: renamed from: d */
        public String f26708d;

        /* JADX INFO: renamed from: e */
        public String f26709e;

        /* JADX INFO: renamed from: f */
        public String f26710f;

        /* JADX INFO: renamed from: g */
        public CrashlyticsReport.d f26711g;

        /* JADX INFO: renamed from: h */
        public CrashlyticsReport.c f26712h;

        public b() {
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.a
        /* JADX INFO: renamed from: a */
        public CrashlyticsReport mo11845a() {
            String strM1599u = this.f26705a == null ? " sdkVersion" : "";
            if (this.f26706b == null) {
                strM1599u = outline.m1599u(strM1599u, " gmpAppId");
            }
            if (this.f26707c == null) {
                strM1599u = outline.m1599u(strM1599u, " platform");
            }
            if (this.f26708d == null) {
                strM1599u = outline.m1599u(strM1599u, " installationUuid");
            }
            if (this.f26709e == null) {
                strM1599u = outline.m1599u(strM1599u, " buildVersion");
            }
            if (this.f26710f == null) {
                strM1599u = outline.m1599u(strM1599u, " displayVersion");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport(this.f26705a, this.f26706b, this.f26707c.intValue(), this.f26708d, this.f26709e, this.f26710f, this.f26711g, this.f26712h, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.a
        /* JADX INFO: renamed from: b */
        public CrashlyticsReport.a mo11846b(CrashlyticsReport.d dVar) {
            this.f26711g = dVar;
            return this;
        }

        public b(CrashlyticsReport crashlyticsReport, a aVar) {
            AutoValue_CrashlyticsReport autoValue_CrashlyticsReport = (AutoValue_CrashlyticsReport) crashlyticsReport;
            this.f26705a = autoValue_CrashlyticsReport.f26697b;
            this.f26706b = autoValue_CrashlyticsReport.f26698c;
            this.f26707c = Integer.valueOf(autoValue_CrashlyticsReport.f26699d);
            this.f26708d = autoValue_CrashlyticsReport.f26700e;
            this.f26709e = autoValue_CrashlyticsReport.f26701f;
            this.f26710f = autoValue_CrashlyticsReport.f26702g;
            this.f26711g = autoValue_CrashlyticsReport.f26703h;
            this.f26712h = autoValue_CrashlyticsReport.f26704i;
        }
    }

    public AutoValue_CrashlyticsReport(String str, String str2, int i, String str3, String str4, String str5, CrashlyticsReport.d dVar, CrashlyticsReport.c cVar, a aVar) {
        this.f26697b = str;
        this.f26698c = str2;
        this.f26699d = i;
        this.f26700e = str3;
        this.f26701f = str4;
        this.f26702g = str5;
        this.f26703h = dVar;
        this.f26704i = cVar;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport
    /* JADX INFO: renamed from: a */
    public String mo11836a() {
        return this.f26701f;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport
    /* JADX INFO: renamed from: b */
    public String mo11837b() {
        return this.f26702g;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport
    /* JADX INFO: renamed from: c */
    public String mo11838c() {
        return this.f26698c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport
    /* JADX INFO: renamed from: d */
    public String mo11839d() {
        return this.f26700e;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport
    /* JADX INFO: renamed from: e */
    public CrashlyticsReport.c mo11840e() {
        return this.f26704i;
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f26697b.equals(crashlyticsReport.mo11842g()) && this.f26698c.equals(crashlyticsReport.mo11838c()) && this.f26699d == crashlyticsReport.mo11841f() && this.f26700e.equals(crashlyticsReport.mo11839d()) && this.f26701f.equals(crashlyticsReport.mo11836a()) && this.f26702g.equals(crashlyticsReport.mo11837b()) && ((dVar = this.f26703h) != null ? dVar.equals(crashlyticsReport.mo11843h()) : crashlyticsReport.mo11843h() == null)) {
            CrashlyticsReport.c cVar = this.f26704i;
            if (cVar == null) {
                if (crashlyticsReport.mo11840e() == null) {
                    return true;
                }
            } else if (cVar.equals(crashlyticsReport.mo11840e())) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport
    /* JADX INFO: renamed from: f */
    public int mo11841f() {
        return this.f26699d;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport
    /* JADX INFO: renamed from: g */
    public String mo11842g() {
        return this.f26697b;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport
    /* JADX INFO: renamed from: h */
    public CrashlyticsReport.d mo11843h() {
        return this.f26703h;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.f26697b.hashCode() ^ 1000003) * 1000003) ^ this.f26698c.hashCode()) * 1000003) ^ this.f26699d) * 1000003) ^ this.f26700e.hashCode()) * 1000003) ^ this.f26701f.hashCode()) * 1000003) ^ this.f26702g.hashCode()) * 1000003;
        CrashlyticsReport.d dVar = this.f26703h;
        int iHashCode2 = (iHashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        CrashlyticsReport.c cVar = this.f26704i;
        return iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0);
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport
    /* JADX INFO: renamed from: i */
    public CrashlyticsReport.a mo11844i() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("CrashlyticsReport{sdkVersion=");
        sbM1556G.append(this.f26697b);
        sbM1556G.append(", gmpAppId=");
        sbM1556G.append(this.f26698c);
        sbM1556G.append(", platform=");
        sbM1556G.append(this.f26699d);
        sbM1556G.append(", installationUuid=");
        sbM1556G.append(this.f26700e);
        sbM1556G.append(", buildVersion=");
        sbM1556G.append(this.f26701f);
        sbM1556G.append(", displayVersion=");
        sbM1556G.append(this.f26702g);
        sbM1556G.append(", session=");
        sbM1556G.append(this.f26703h);
        sbM1556G.append(", ndkPayload=");
        sbM1556G.append(this.f26704i);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
