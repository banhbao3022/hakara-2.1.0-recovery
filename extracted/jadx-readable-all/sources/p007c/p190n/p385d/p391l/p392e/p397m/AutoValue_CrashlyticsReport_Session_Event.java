package p007c.p190n.p385d.p391l.p392e.p397m;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.j, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_Session_Event extends CrashlyticsReport.d.AbstractC8523d {

    /* JADX INFO: renamed from: a */
    public final long f26778a;

    /* JADX INFO: renamed from: b */
    public final String f26779b;

    /* JADX INFO: renamed from: c */
    public final CrashlyticsReport.d.AbstractC8523d.a f26780c;

    /* JADX INFO: renamed from: d */
    public final CrashlyticsReport.d.AbstractC8523d.c f26781d;

    /* JADX INFO: renamed from: e */
    public final CrashlyticsReport.d.AbstractC8523d.AbstractC8534d f26782e;

    /* JADX INFO: renamed from: c.n.d.l.e.m.j$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    public static final class b extends CrashlyticsReport.d.AbstractC8523d.b {

        /* JADX INFO: renamed from: a */
        public Long f26783a;

        /* JADX INFO: renamed from: b */
        public String f26784b;

        /* JADX INFO: renamed from: c */
        public CrashlyticsReport.d.AbstractC8523d.a f26785c;

        /* JADX INFO: renamed from: d */
        public CrashlyticsReport.d.AbstractC8523d.c f26786d;

        /* JADX INFO: renamed from: e */
        public CrashlyticsReport.d.AbstractC8523d.AbstractC8534d f26787e;

        public b() {
        }

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.d.AbstractC8523d m11900a() {
            String strM1599u = this.f26783a == null ? " timestamp" : "";
            if (this.f26784b == null) {
                strM1599u = outline.m1599u(strM1599u, " type");
            }
            if (this.f26785c == null) {
                strM1599u = outline.m1599u(strM1599u, " app");
            }
            if (this.f26786d == null) {
                strM1599u = outline.m1599u(strM1599u, " device");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event(this.f26783a.longValue(), this.f26784b, this.f26785c, this.f26786d, this.f26787e, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }

        /* JADX INFO: renamed from: b */
        public CrashlyticsReport.d.AbstractC8523d.b m11901b(CrashlyticsReport.d.AbstractC8523d.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f26785c = aVar;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public CrashlyticsReport.d.AbstractC8523d.b m11902c(CrashlyticsReport.d.AbstractC8523d.c cVar) {
            this.f26786d = cVar;
            return this;
        }

        public b(CrashlyticsReport.d.AbstractC8523d abstractC8523d, a aVar) {
            AutoValue_CrashlyticsReport_Session_Event autoValue_CrashlyticsReport_Session_Event = (AutoValue_CrashlyticsReport_Session_Event) abstractC8523d;
            this.f26783a = Long.valueOf(autoValue_CrashlyticsReport_Session_Event.f26778a);
            this.f26784b = autoValue_CrashlyticsReport_Session_Event.f26779b;
            this.f26785c = autoValue_CrashlyticsReport_Session_Event.f26780c;
            this.f26786d = autoValue_CrashlyticsReport_Session_Event.f26781d;
            this.f26787e = autoValue_CrashlyticsReport_Session_Event.f26782e;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event(long j2, String str, CrashlyticsReport.d.AbstractC8523d.a aVar, CrashlyticsReport.d.AbstractC8523d.c cVar, CrashlyticsReport.d.AbstractC8523d.AbstractC8534d abstractC8534d, a aVar2) {
        this.f26778a = j2;
        this.f26779b = str;
        this.f26780c = aVar;
        this.f26781d = cVar;
        this.f26782e = abstractC8534d;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d
    /* JADX INFO: renamed from: a */
    public CrashlyticsReport.d.AbstractC8523d.a mo11895a() {
        return this.f26780c;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d
    /* JADX INFO: renamed from: b */
    public CrashlyticsReport.d.AbstractC8523d.c mo11896b() {
        return this.f26781d;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d
    /* JADX INFO: renamed from: c */
    public CrashlyticsReport.d.AbstractC8523d.AbstractC8534d mo11897c() {
        return this.f26782e;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d
    /* JADX INFO: renamed from: d */
    public long mo11898d() {
        return this.f26778a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.d.AbstractC8523d
    /* JADX INFO: renamed from: e */
    public String mo11899e() {
        return this.f26779b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC8523d)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC8523d abstractC8523d = (CrashlyticsReport.d.AbstractC8523d) obj;
        if (this.f26778a == abstractC8523d.mo11898d() && this.f26779b.equals(abstractC8523d.mo11899e()) && this.f26780c.equals(abstractC8523d.mo11895a()) && this.f26781d.equals(abstractC8523d.mo11896b())) {
            CrashlyticsReport.d.AbstractC8523d.AbstractC8534d abstractC8534d = this.f26782e;
            if (abstractC8534d == null) {
                if (abstractC8523d.mo11897c() == null) {
                    return true;
                }
            } else if (abstractC8534d.equals(abstractC8523d.mo11897c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f26778a;
        int iHashCode = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f26779b.hashCode()) * 1000003) ^ this.f26780c.hashCode()) * 1000003) ^ this.f26781d.hashCode()) * 1000003;
        CrashlyticsReport.d.AbstractC8523d.AbstractC8534d abstractC8534d = this.f26782e;
        return (abstractC8534d == null ? 0 : abstractC8534d.hashCode()) ^ iHashCode;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Event{timestamp=");
        sbM1556G.append(this.f26778a);
        sbM1556G.append(", type=");
        sbM1556G.append(this.f26779b);
        sbM1556G.append(", app=");
        sbM1556G.append(this.f26780c);
        sbM1556G.append(", device=");
        sbM1556G.append(this.f26781d);
        sbM1556G.append(", log=");
        sbM1556G.append(this.f26782e);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
