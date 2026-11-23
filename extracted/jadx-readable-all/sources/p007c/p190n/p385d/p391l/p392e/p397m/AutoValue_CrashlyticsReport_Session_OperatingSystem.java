package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.t, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends CrashlyticsReport.d.e {

    /* JADX INFO: renamed from: a */
    public final int f26858a;

    /* JADX INFO: renamed from: b */
    public final String f26859b;

    /* JADX INFO: renamed from: c */
    public final String f26860c;

    /* JADX INFO: renamed from: d */
    public final boolean f26861d;

    /* JADX INFO: renamed from: c.n.d.l.e.m.t$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    public static final class b extends CrashlyticsReport.d.e.a {

        /* JADX INFO: renamed from: a */
        public Integer f26862a;

        /* JADX INFO: renamed from: b */
        public String f26863b;

        /* JADX INFO: renamed from: c */
        public String f26864c;

        /* JADX INFO: renamed from: d */
        public Boolean f26865d;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.e m11956a() {
            String strM1599u = this.f26862a == null ? " platform" : "";
            if (this.f26863b == null) {
                strM1599u = outline.m1599u(strM1599u, " version");
            }
            if (this.f26864c == null) {
                strM1599u = outline.m1599u(strM1599u, " buildVersion");
            }
            if (this.f26865d == null) {
                strM1599u = outline.m1599u(strM1599u, " jailbroken");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem(this.f26862a.intValue(), this.f26863b, this.f26864c, this.f26865d.booleanValue(), null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
    }

    public AutoValue_CrashlyticsReport_Session_OperatingSystem(int i, String str, String str2, boolean z, a aVar) {
        this.f26858a = i;
        this.f26859b = str;
        this.f26860c = str2;
        this.f26861d = z;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.e
    /* JADX INFO: renamed from: a */
    public String mo11952a() {
        return this.f26860c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.e
    /* JADX INFO: renamed from: b */
    public int mo11953b() {
        return this.f26858a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.e
    /* JADX INFO: renamed from: c */
    public String mo11954c() {
        return this.f26859b;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.e
    /* JADX INFO: renamed from: d */
    public boolean mo11955d() {
        return this.f26861d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.e)) {
            return false;
        }
        CrashlyticsReport.d.e eVar = (CrashlyticsReport.d.e) obj;
        return this.f26858a == eVar.mo11953b() && this.f26859b.equals(eVar.mo11954c()) && this.f26860c.equals(eVar.mo11952a()) && this.f26861d == eVar.mo11955d();
    }

    public int hashCode() {
        return ((((((this.f26858a ^ 1000003) * 1000003) ^ this.f26859b.hashCode()) * 1000003) ^ this.f26860c.hashCode()) * 1000003) ^ (this.f26861d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("OperatingSystem{platform=");
        sbM1556G.append(this.f26858a);
        sbM1556G.append(", version=");
        sbM1556G.append(this.f26859b);
        sbM1556G.append(", buildVersion=");
        sbM1556G.append(this.f26860c);
        sbM1556G.append(", jailbroken=");
        sbM1556G.append(this.f26861d);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
