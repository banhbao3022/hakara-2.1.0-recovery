package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.i, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_Device extends CrashlyticsReport.d.c {

    /* JADX INFO: renamed from: a */
    public final int f26760a;

    /* JADX INFO: renamed from: b */
    public final String f26761b;

    /* JADX INFO: renamed from: c */
    public final int f26762c;

    /* JADX INFO: renamed from: d */
    public final long f26763d;

    /* JADX INFO: renamed from: e */
    public final long f26764e;

    /* JADX INFO: renamed from: f */
    public final boolean f26765f;

    /* JADX INFO: renamed from: g */
    public final int f26766g;

    /* JADX INFO: renamed from: h */
    public final String f26767h;

    /* JADX INFO: renamed from: i */
    public final String f26768i;

    /* JADX INFO: renamed from: c.n.d.l.e.m.i$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    public static final class b extends CrashlyticsReport.d.c.a {

        /* JADX INFO: renamed from: a */
        public Integer f26769a;

        /* JADX INFO: renamed from: b */
        public String f26770b;

        /* JADX INFO: renamed from: c */
        public Integer f26771c;

        /* JADX INFO: renamed from: d */
        public Long f26772d;

        /* JADX INFO: renamed from: e */
        public Long f26773e;

        /* JADX INFO: renamed from: f */
        public Boolean f26774f;

        /* JADX INFO: renamed from: g */
        public Integer f26775g;

        /* JADX INFO: renamed from: h */
        public String f26776h;

        /* JADX INFO: renamed from: i */
        public String f26777i;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.c m11894a() {
            String strM1599u = this.f26769a == null ? " arch" : "";
            if (this.f26770b == null) {
                strM1599u = outline.m1599u(strM1599u, " model");
            }
            if (this.f26771c == null) {
                strM1599u = outline.m1599u(strM1599u, " cores");
            }
            if (this.f26772d == null) {
                strM1599u = outline.m1599u(strM1599u, " ram");
            }
            if (this.f26773e == null) {
                strM1599u = outline.m1599u(strM1599u, " diskSpace");
            }
            if (this.f26774f == null) {
                strM1599u = outline.m1599u(strM1599u, " simulator");
            }
            if (this.f26775g == null) {
                strM1599u = outline.m1599u(strM1599u, " state");
            }
            if (this.f26776h == null) {
                strM1599u = outline.m1599u(strM1599u, " manufacturer");
            }
            if (this.f26777i == null) {
                strM1599u = outline.m1599u(strM1599u, " modelClass");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Device(this.f26769a.intValue(), this.f26770b, this.f26771c.intValue(), this.f26772d.longValue(), this.f26773e.longValue(), this.f26774f.booleanValue(), this.f26775g.intValue(), this.f26776h, this.f26777i, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
    }

    public AutoValue_CrashlyticsReport_Session_Device(int i, String str, int i2, long j2, long j3, boolean z, int i3, String str2, String str3, a aVar) {
        this.f26760a = i;
        this.f26761b = str;
        this.f26762c = i2;
        this.f26763d = j2;
        this.f26764e = j3;
        this.f26765f = z;
        this.f26766g = i3;
        this.f26767h = str2;
        this.f26768i = str3;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.c
    /* JADX INFO: renamed from: a */
    public int mo11885a() {
        return this.f26760a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.c
    /* JADX INFO: renamed from: b */
    public int mo11886b() {
        return this.f26762c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.c
    /* JADX INFO: renamed from: c */
    public long mo11887c() {
        return this.f26764e;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.c
    /* JADX INFO: renamed from: d */
    public String mo11888d() {
        return this.f26767h;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.c
    /* JADX INFO: renamed from: e */
    public String mo11889e() {
        return this.f26761b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.c)) {
            return false;
        }
        CrashlyticsReport.d.c cVar = (CrashlyticsReport.d.c) obj;
        return this.f26760a == cVar.mo11885a() && this.f26761b.equals(cVar.mo11889e()) && this.f26762c == cVar.mo11886b() && this.f26763d == cVar.mo11891g() && this.f26764e == cVar.mo11887c() && this.f26765f == cVar.mo11893i() && this.f26766g == cVar.mo11892h() && this.f26767h.equals(cVar.mo11888d()) && this.f26768i.equals(cVar.mo11890f());
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.c
    /* JADX INFO: renamed from: f */
    public String mo11890f() {
        return this.f26768i;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.c
    /* JADX INFO: renamed from: g */
    public long mo11891g() {
        return this.f26763d;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.c
    /* JADX INFO: renamed from: h */
    public int mo11892h() {
        return this.f26766g;
    }

    public int hashCode() {
        int iHashCode = (((((this.f26760a ^ 1000003) * 1000003) ^ this.f26761b.hashCode()) * 1000003) ^ this.f26762c) * 1000003;
        long j2 = this.f26763d;
        int i = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f26764e;
        return ((((((((i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f26765f ? 1231 : 1237)) * 1000003) ^ this.f26766g) * 1000003) ^ this.f26767h.hashCode()) * 1000003) ^ this.f26768i.hashCode();
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.c
    /* JADX INFO: renamed from: i */
    public boolean mo11893i() {
        return this.f26765f;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Device{arch=");
        sbM1556G.append(this.f26760a);
        sbM1556G.append(", model=");
        sbM1556G.append(this.f26761b);
        sbM1556G.append(", cores=");
        sbM1556G.append(this.f26762c);
        sbM1556G.append(", ram=");
        sbM1556G.append(this.f26763d);
        sbM1556G.append(", diskSpace=");
        sbM1556G.append(this.f26764e);
        sbM1556G.append(", simulator=");
        sbM1556G.append(this.f26765f);
        sbM1556G.append(", state=");
        sbM1556G.append(this.f26766g);
        sbM1556G.append(", manufacturer=");
        sbM1556G.append(this.f26767h);
        sbM1556G.append(", modelClass=");
        return outline.m1550A(sbM1556G, this.f26768i, "}");
    }
}
