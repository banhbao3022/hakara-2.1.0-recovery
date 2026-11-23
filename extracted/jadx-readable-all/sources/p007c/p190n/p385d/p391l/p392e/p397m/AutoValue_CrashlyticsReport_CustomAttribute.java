package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.c, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_CustomAttribute extends CrashlyticsReport.b {

    /* JADX INFO: renamed from: a */
    public final String f26713a;

    /* JADX INFO: renamed from: b */
    public final String f26714b;

    /* JADX INFO: renamed from: c.n.d.l.e.m.c$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    public static final class b extends CrashlyticsReport.b.a {

        /* JADX INFO: renamed from: a */
        public String f26715a;

        /* JADX INFO: renamed from: b */
        public String f26716b;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.b m11849a() {
            String strM1599u = this.f26715a == null ? " key" : "";
            if (this.f26716b == null) {
                strM1599u = outline.m1599u(strM1599u, " value");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_CustomAttribute(this.f26715a, this.f26716b, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
    }

    public AutoValue_CrashlyticsReport_CustomAttribute(String str, String str2, a aVar) {
        this.f26713a = str;
        this.f26714b = str2;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.b
    /* JADX INFO: renamed from: a */
    public String mo11847a() {
        return this.f26713a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.b
    /* JADX INFO: renamed from: b */
    public String mo11848b() {
        return this.f26714b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.b)) {
            return false;
        }
        CrashlyticsReport.b bVar = (CrashlyticsReport.b) obj;
        return this.f26713a.equals(bVar.mo11847a()) && this.f26714b.equals(bVar.mo11848b());
    }

    public int hashCode() {
        return ((this.f26713a.hashCode() ^ 1000003) * 1000003) ^ this.f26714b.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("CustomAttribute{key=");
        sbM1556G.append(this.f26713a);
        sbM1556G.append(", value=");
        return outline.m1550A(sbM1556G, this.f26714b, "}");
    }
}
