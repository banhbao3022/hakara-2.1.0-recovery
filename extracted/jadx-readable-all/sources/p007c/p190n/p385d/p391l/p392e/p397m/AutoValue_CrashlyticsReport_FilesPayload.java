package p007c.p190n.p385d.p391l.p392e.p397m;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.d, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.c {

    /* JADX INFO: renamed from: a */
    public final ImmutableList3<CrashlyticsReport.c.b> f26717a;

    /* JADX INFO: renamed from: b */
    public final String f26718b;

    /* JADX INFO: renamed from: c.n.d.l.e.m.d$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    public static final class b extends CrashlyticsReport.c.a {

        /* JADX INFO: renamed from: a */
        public ImmutableList3<CrashlyticsReport.c.b> f26719a;

        /* JADX INFO: renamed from: b */
        public String f26720b;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.c m11852a() {
            String str = this.f26719a == null ? " files" : "";
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload(this.f26719a, this.f26720b, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", str));
        }
    }

    public AutoValue_CrashlyticsReport_FilesPayload(ImmutableList3 immutableList3, String str, a aVar) {
        this.f26717a = immutableList3;
        this.f26718b = str;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.c
    /* JADX INFO: renamed from: a */
    public ImmutableList3<CrashlyticsReport.c.b> mo11850a() {
        return this.f26717a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.c
    /* JADX INFO: renamed from: b */
    public String mo11851b() {
        return this.f26718b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.c)) {
            return false;
        }
        CrashlyticsReport.c cVar = (CrashlyticsReport.c) obj;
        if (this.f26717a.equals(cVar.mo11850a())) {
            String str = this.f26718b;
            if (str == null) {
                if (cVar.mo11851b() == null) {
                    return true;
                }
            } else if (str.equals(cVar.mo11851b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f26717a.hashCode() ^ 1000003) * 1000003;
        String str = this.f26718b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("FilesPayload{files=");
        sbM1556G.append(this.f26717a);
        sbM1556G.append(", orgId=");
        return outline.m1550A(sbM1556G, this.f26718b, "}");
    }
}
