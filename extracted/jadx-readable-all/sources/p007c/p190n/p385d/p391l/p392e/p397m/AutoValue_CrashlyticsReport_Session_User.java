package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.u, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_User extends CrashlyticsReport.d.f {

    /* JADX INFO: renamed from: a */
    public final String f26866a;

    /* JADX INFO: renamed from: c.n.d.l.e.m.u$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    public static final class b extends CrashlyticsReport.d.f.a {

        /* JADX INFO: renamed from: a */
        public String f26867a;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.f m11958a() {
            String str = this.f26867a == null ? " identifier" : "";
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_User(this.f26867a, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", str));
        }
    }

    public AutoValue_CrashlyticsReport_Session_User(String str, a aVar) {
        this.f26866a = str;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.f
    /* JADX INFO: renamed from: a */
    public String mo11957a() {
        return this.f26866a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.d.f) {
            return this.f26866a.equals(((CrashlyticsReport.d.f) obj).mo11957a());
        }
        return false;
    }

    public int hashCode() {
        return this.f26866a.hashCode() ^ 1000003;
    }

    public String toString() {
        return outline.m1550A(outline.m1556G("User{identifier="), this.f26866a, "}");
    }
}
