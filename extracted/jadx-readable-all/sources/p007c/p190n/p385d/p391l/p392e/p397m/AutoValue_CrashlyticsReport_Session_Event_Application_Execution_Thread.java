package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.p, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread extends CrashlyticsReport.d.AbstractC8523d.a.b.e {

    /* JADX INFO: renamed from: a */
    public final String f26828a;

    /* JADX INFO: renamed from: b */
    public final int f26829b;

    /* JADX INFO: renamed from: c */
    public final ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b> f26830c;

    /* JADX INFO: renamed from: c.n.d.l.e.m.p$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    public static final class b extends CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8531a {

        /* JADX INFO: renamed from: a */
        public String f26831a;

        /* JADX INFO: renamed from: b */
        public Integer f26832b;

        /* JADX INFO: renamed from: c */
        public ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b> f26833c;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.AbstractC8523d.a.b.e m11933a() {
            String strM1599u = this.f26831a == null ? " name" : "";
            if (this.f26832b == null) {
                strM1599u = outline.m1599u(strM1599u, " importance");
            }
            if (this.f26833c == null) {
                strM1599u = outline.m1599u(strM1599u, " frames");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(this.f26831a, this.f26832b.intValue(), this.f26833c, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(String str, int i, ImmutableList3 immutableList3, a aVar) {
        this.f26828a = str;
        this.f26829b = i;
        this.f26830c = immutableList3;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.e
    /* JADX INFO: renamed from: a */
    public ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b> mo11930a() {
        return this.f26830c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.e
    /* JADX INFO: renamed from: b */
    public int mo11931b() {
        return this.f26829b;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.b.e
    /* JADX INFO: renamed from: c */
    public String mo11932c() {
        return this.f26828a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC8523d.a.b.e)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC8523d.a.b.e eVar = (CrashlyticsReport.d.AbstractC8523d.a.b.e) obj;
        return this.f26828a.equals(eVar.mo11932c()) && this.f26829b == eVar.mo11931b() && this.f26830c.equals(eVar.mo11930a());
    }

    public int hashCode() {
        return ((((this.f26828a.hashCode() ^ 1000003) * 1000003) ^ this.f26829b) * 1000003) ^ this.f26830c.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Thread{name=");
        sbM1556G.append(this.f26828a);
        sbM1556G.append(", importance=");
        sbM1556G.append(this.f26829b);
        sbM1556G.append(", frames=");
        sbM1556G.append(this.f26830c);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
