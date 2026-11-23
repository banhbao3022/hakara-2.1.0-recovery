package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.s, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_Event_Log extends CrashlyticsReport.d.AbstractC8523d.AbstractC8534d {

    /* JADX INFO: renamed from: a */
    public final String f26856a;

    /* JADX INFO: renamed from: c.n.d.l.e.m.s$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    public static final class b extends CrashlyticsReport.d.AbstractC8523d.AbstractC8534d.a {

        /* JADX INFO: renamed from: a */
        public String f26857a;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.AbstractC8523d.AbstractC8534d m11951a() {
            String str = this.f26857a == null ? " content" : "";
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Log(this.f26857a, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", str));
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Log(String str, a aVar) {
        this.f26856a = str;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.AbstractC8534d
    /* JADX INFO: renamed from: a */
    public String mo11950a() {
        return this.f26856a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.d.AbstractC8523d.AbstractC8534d) {
            return this.f26856a.equals(((CrashlyticsReport.d.AbstractC8523d.AbstractC8534d) obj).mo11950a());
        }
        return false;
    }

    public int hashCode() {
        return this.f26856a.hashCode() ^ 1000003;
    }

    public String toString() {
        return outline.m1550A(outline.m1556G("Log{content="), this.f26856a, "}");
    }
}
