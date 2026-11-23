package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.f, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.d {

    /* JADX INFO: renamed from: a */
    public final String f26725a;

    /* JADX INFO: renamed from: b */
    public final String f26726b;

    /* JADX INFO: renamed from: c */
    public final long f26727c;

    /* JADX INFO: renamed from: d */
    public final Long f26728d;

    /* JADX INFO: renamed from: e */
    public final boolean f26729e;

    /* JADX INFO: renamed from: f */
    public final CrashlyticsReport.d.a f26730f;

    /* JADX INFO: renamed from: g */
    public final CrashlyticsReport.d.f f26731g;

    /* JADX INFO: renamed from: h */
    public final CrashlyticsReport.d.e f26732h;

    /* JADX INFO: renamed from: i */
    public final CrashlyticsReport.d.c f26733i;

    /* JADX INFO: renamed from: j */
    public final ImmutableList3<CrashlyticsReport.d.AbstractC8523d> f26734j;

    /* JADX INFO: renamed from: k */
    public final int f26735k;

    /* JADX INFO: renamed from: c.n.d.l.e.m.f$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session.java */
    public static final class b extends CrashlyticsReport.d.b {

        /* JADX INFO: renamed from: a */
        public String f26736a;

        /* JADX INFO: renamed from: b */
        public String f26737b;

        /* JADX INFO: renamed from: c */
        public Long f26738c;

        /* JADX INFO: renamed from: d */
        public Long f26739d;

        /* JADX INFO: renamed from: e */
        public Boolean f26740e;

        /* JADX INFO: renamed from: f */
        public CrashlyticsReport.d.a f26741f;

        /* JADX INFO: renamed from: g */
        public CrashlyticsReport.d.f f26742g;

        /* JADX INFO: renamed from: h */
        public CrashlyticsReport.d.e f26743h;

        /* JADX INFO: renamed from: i */
        public CrashlyticsReport.d.c f26744i;

        /* JADX INFO: renamed from: j */
        public ImmutableList3<CrashlyticsReport.d.AbstractC8523d> f26745j;

        /* JADX INFO: renamed from: k */
        public Integer f26746k;

        public b() {
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.b
        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d mo11870a() {
            String strM1599u = this.f26736a == null ? " generator" : "";
            if (this.f26737b == null) {
                strM1599u = outline.m1599u(strM1599u, " identifier");
            }
            if (this.f26738c == null) {
                strM1599u = outline.m1599u(strM1599u, " startedAt");
            }
            if (this.f26740e == null) {
                strM1599u = outline.m1599u(strM1599u, " crashed");
            }
            if (this.f26741f == null) {
                strM1599u = outline.m1599u(strM1599u, " app");
            }
            if (this.f26746k == null) {
                strM1599u = outline.m1599u(strM1599u, " generatorType");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session(this.f26736a, this.f26737b, this.f26738c.longValue(), this.f26739d, this.f26740e.booleanValue(), this.f26741f, this.f26742g, this.f26743h, this.f26744i, this.f26745j, this.f26746k.intValue(), null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.b
        /* JADX INFO: renamed from: b */
        public CrashlyticsReport.d.b mo11871b(boolean z) {
            this.f26740e = Boolean.valueOf(z);
            return this;
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.b
        /* JADX INFO: renamed from: c */
        public CrashlyticsReport.d.b mo11872c(Long l) {
            this.f26739d = l;
            return this;
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.b
        /* JADX INFO: renamed from: d */
        public CrashlyticsReport.d.b mo11873d(ImmutableList3<CrashlyticsReport.d.AbstractC8523d> immutableList3) {
            this.f26745j = immutableList3;
            return this;
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.b
        /* JADX INFO: renamed from: e */
        public CrashlyticsReport.d.b mo11874e(CrashlyticsReport.d.f fVar) {
            this.f26742g = fVar;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public CrashlyticsReport.d.b m11875f(String str) {
            this.f26737b = str;
            return this;
        }

        public b(CrashlyticsReport.d dVar, a aVar) {
            AutoValue_CrashlyticsReport_Session autoValue_CrashlyticsReport_Session = (AutoValue_CrashlyticsReport_Session) dVar;
            this.f26736a = autoValue_CrashlyticsReport_Session.f26725a;
            this.f26737b = autoValue_CrashlyticsReport_Session.f26726b;
            this.f26738c = Long.valueOf(autoValue_CrashlyticsReport_Session.f26727c);
            this.f26739d = autoValue_CrashlyticsReport_Session.f26728d;
            this.f26740e = Boolean.valueOf(autoValue_CrashlyticsReport_Session.f26729e);
            this.f26741f = autoValue_CrashlyticsReport_Session.f26730f;
            this.f26742g = autoValue_CrashlyticsReport_Session.f26731g;
            this.f26743h = autoValue_CrashlyticsReport_Session.f26732h;
            this.f26744i = autoValue_CrashlyticsReport_Session.f26733i;
            this.f26745j = autoValue_CrashlyticsReport_Session.f26734j;
            this.f26746k = Integer.valueOf(autoValue_CrashlyticsReport_Session.f26735k);
        }
    }

    public AutoValue_CrashlyticsReport_Session(String str, String str2, long j2, Long l, boolean z, CrashlyticsReport.d.a aVar, CrashlyticsReport.d.f fVar, CrashlyticsReport.d.e eVar, CrashlyticsReport.d.c cVar, ImmutableList3 immutableList3, int i, a aVar2) {
        this.f26725a = str;
        this.f26726b = str2;
        this.f26727c = j2;
        this.f26728d = l;
        this.f26729e = z;
        this.f26730f = aVar;
        this.f26731g = fVar;
        this.f26732h = eVar;
        this.f26733i = cVar;
        this.f26734j = immutableList3;
        this.f26735k = i;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d
    /* JADX INFO: renamed from: a */
    public CrashlyticsReport.d.a mo11858a() {
        return this.f26730f;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d
    /* JADX INFO: renamed from: b */
    public CrashlyticsReport.d.c mo11859b() {
        return this.f26733i;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d
    /* JADX INFO: renamed from: c */
    public Long mo11860c() {
        return this.f26728d;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d
    /* JADX INFO: renamed from: d */
    public ImmutableList3<CrashlyticsReport.d.AbstractC8523d> mo11861d() {
        return this.f26734j;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d
    /* JADX INFO: renamed from: e */
    public String mo11862e() {
        return this.f26725a;
    }

    public boolean equals(Object obj) {
        Long l;
        CrashlyticsReport.d.f fVar;
        CrashlyticsReport.d.e eVar;
        CrashlyticsReport.d.c cVar;
        ImmutableList3<CrashlyticsReport.d.AbstractC8523d> immutableList3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d)) {
            return false;
        }
        CrashlyticsReport.d dVar = (CrashlyticsReport.d) obj;
        return this.f26725a.equals(dVar.mo11862e()) && this.f26726b.equals(dVar.mo11864g()) && this.f26727c == dVar.mo11866i() && ((l = this.f26728d) != null ? l.equals(dVar.mo11860c()) : dVar.mo11860c() == null) && this.f26729e == dVar.mo11868k() && this.f26730f.equals(dVar.mo11858a()) && ((fVar = this.f26731g) != null ? fVar.equals(dVar.mo11867j()) : dVar.mo11867j() == null) && ((eVar = this.f26732h) != null ? eVar.equals(dVar.mo11865h()) : dVar.mo11865h() == null) && ((cVar = this.f26733i) != null ? cVar.equals(dVar.mo11859b()) : dVar.mo11859b() == null) && ((immutableList3 = this.f26734j) != null ? immutableList3.equals(dVar.mo11861d()) : dVar.mo11861d() == null) && this.f26735k == dVar.mo11863f();
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d
    /* JADX INFO: renamed from: f */
    public int mo11863f() {
        return this.f26735k;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d
    /* JADX INFO: renamed from: g */
    public String mo11864g() {
        return this.f26726b;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d
    /* JADX INFO: renamed from: h */
    public CrashlyticsReport.d.e mo11865h() {
        return this.f26732h;
    }

    public int hashCode() {
        int iHashCode = (((this.f26725a.hashCode() ^ 1000003) * 1000003) ^ this.f26726b.hashCode()) * 1000003;
        long j2 = this.f26727c;
        int i = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.f26728d;
        int iHashCode2 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f26729e ? 1231 : 1237)) * 1000003) ^ this.f26730f.hashCode()) * 1000003;
        CrashlyticsReport.d.f fVar = this.f26731g;
        int iHashCode3 = (iHashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        CrashlyticsReport.d.e eVar = this.f26732h;
        int iHashCode4 = (iHashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        CrashlyticsReport.d.c cVar = this.f26733i;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        ImmutableList3<CrashlyticsReport.d.AbstractC8523d> immutableList3 = this.f26734j;
        return ((iHashCode5 ^ (immutableList3 != null ? immutableList3.hashCode() : 0)) * 1000003) ^ this.f26735k;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d
    /* JADX INFO: renamed from: i */
    public long mo11866i() {
        return this.f26727c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d
    /* JADX INFO: renamed from: j */
    public CrashlyticsReport.d.f mo11867j() {
        return this.f26731g;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d
    /* JADX INFO: renamed from: k */
    public boolean mo11868k() {
        return this.f26729e;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d
    /* JADX INFO: renamed from: l */
    public CrashlyticsReport.d.b mo11869l() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Session{generator=");
        sbM1556G.append(this.f26725a);
        sbM1556G.append(", identifier=");
        sbM1556G.append(this.f26726b);
        sbM1556G.append(", startedAt=");
        sbM1556G.append(this.f26727c);
        sbM1556G.append(", endedAt=");
        sbM1556G.append(this.f26728d);
        sbM1556G.append(", crashed=");
        sbM1556G.append(this.f26729e);
        sbM1556G.append(", app=");
        sbM1556G.append(this.f26730f);
        sbM1556G.append(", user=");
        sbM1556G.append(this.f26731g);
        sbM1556G.append(", os=");
        sbM1556G.append(this.f26732h);
        sbM1556G.append(", device=");
        sbM1556G.append(this.f26733i);
        sbM1556G.append(", events=");
        sbM1556G.append(this.f26734j);
        sbM1556G.append(", generatorType=");
        return outline.m1603y(sbM1556G, this.f26735k, "}");
    }
}
