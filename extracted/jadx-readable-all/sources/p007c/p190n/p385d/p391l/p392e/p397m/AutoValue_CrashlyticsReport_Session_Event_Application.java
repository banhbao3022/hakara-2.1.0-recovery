package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.k, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.d.AbstractC8523d.a {

    /* JADX INFO: renamed from: a */
    public final CrashlyticsReport.d.AbstractC8523d.a.b f26788a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList3<CrashlyticsReport.b> f26789b;

    /* JADX INFO: renamed from: c */
    public final Boolean f26790c;

    /* JADX INFO: renamed from: d */
    public final int f26791d;

    /* JADX INFO: renamed from: c.n.d.l.e.m.k$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    public static final class b extends CrashlyticsReport.d.AbstractC8523d.a.AbstractC8524a {

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.AbstractC8523d.a.b f26792a;

        /* JADX INFO: renamed from: b */
        public ImmutableList3<CrashlyticsReport.b> f26793b;

        /* JADX INFO: renamed from: c */
        public Boolean f26794c;

        /* JADX INFO: renamed from: d */
        public Integer f26795d;

        public b() {
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.AbstractC8524a
        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.AbstractC8523d.a mo11908a() {
            String strM1599u = this.f26792a == null ? " execution" : "";
            if (this.f26795d == null) {
                strM1599u = outline.m1599u(strM1599u, " uiOrientation");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(this.f26792a, this.f26793b, this.f26794c, this.f26795d.intValue(), null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a.AbstractC8524a
        /* JADX INFO: renamed from: b */
        public CrashlyticsReport.d.AbstractC8523d.a.AbstractC8524a mo11909b(ImmutableList3<CrashlyticsReport.b> immutableList3) {
            this.f26793b = immutableList3;
            return this;
        }

        public b(CrashlyticsReport.d.AbstractC8523d.a aVar, a aVar2) {
            AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application = (AutoValue_CrashlyticsReport_Session_Event_Application) aVar;
            this.f26792a = autoValue_CrashlyticsReport_Session_Event_Application.f26788a;
            this.f26793b = autoValue_CrashlyticsReport_Session_Event_Application.f26789b;
            this.f26794c = autoValue_CrashlyticsReport_Session_Event_Application.f26790c;
            this.f26795d = Integer.valueOf(autoValue_CrashlyticsReport_Session_Event_Application.f26791d);
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.d.AbstractC8523d.a.b bVar, ImmutableList3 immutableList3, Boolean bool, int i, a aVar) {
        this.f26788a = bVar;
        this.f26789b = immutableList3;
        this.f26790c = bool;
        this.f26791d = i;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a
    /* JADX INFO: renamed from: a */
    public Boolean mo11903a() {
        return this.f26790c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a
    /* JADX INFO: renamed from: b */
    public ImmutableList3<CrashlyticsReport.b> mo11904b() {
        return this.f26789b;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a
    /* JADX INFO: renamed from: c */
    public CrashlyticsReport.d.AbstractC8523d.a.b mo11905c() {
        return this.f26788a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a
    /* JADX INFO: renamed from: d */
    public int mo11906d() {
        return this.f26791d;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d.a
    /* JADX INFO: renamed from: e */
    public CrashlyticsReport.d.AbstractC8523d.a.AbstractC8524a mo11907e() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        ImmutableList3<CrashlyticsReport.b> immutableList3;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC8523d.a)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC8523d.a aVar = (CrashlyticsReport.d.AbstractC8523d.a) obj;
        return this.f26788a.equals(aVar.mo11905c()) && ((immutableList3 = this.f26789b) != null ? immutableList3.equals(aVar.mo11904b()) : aVar.mo11904b() == null) && ((bool = this.f26790c) != null ? bool.equals(aVar.mo11903a()) : aVar.mo11903a() == null) && this.f26791d == aVar.mo11906d();
    }

    public int hashCode() {
        int iHashCode = (this.f26788a.hashCode() ^ 1000003) * 1000003;
        ImmutableList3<CrashlyticsReport.b> immutableList3 = this.f26789b;
        int iHashCode2 = (iHashCode ^ (immutableList3 == null ? 0 : immutableList3.hashCode())) * 1000003;
        Boolean bool = this.f26790c;
        return ((iHashCode2 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f26791d;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Application{execution=");
        sbM1556G.append(this.f26788a);
        sbM1556G.append(", customAttributes=");
        sbM1556G.append(this.f26789b);
        sbM1556G.append(", background=");
        sbM1556G.append(this.f26790c);
        sbM1556G.append(", uiOrientation=");
        return outline.m1603y(sbM1556G, this.f26791d, "}");
    }
}
