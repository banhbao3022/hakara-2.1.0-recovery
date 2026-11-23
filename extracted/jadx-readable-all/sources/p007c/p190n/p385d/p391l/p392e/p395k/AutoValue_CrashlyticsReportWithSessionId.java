package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport;

/* JADX INFO: renamed from: c.n.d.l.e.k.c, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReportWithSessionId extends CrashlyticsReportWithSessionId {

    /* JADX INFO: renamed from: a */
    public final CrashlyticsReport f26469a;

    /* JADX INFO: renamed from: b */
    public final String f26470b;

    public AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport crashlyticsReport, String str) {
        Objects.requireNonNull(crashlyticsReport, "Null report");
        this.f26469a = crashlyticsReport;
        Objects.requireNonNull(str, "Null sessionId");
        this.f26470b = str;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p395k.CrashlyticsReportWithSessionId
    /* JADX INFO: renamed from: a */
    public CrashlyticsReport mo11731a() {
        return this.f26469a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p395k.CrashlyticsReportWithSessionId
    /* JADX INFO: renamed from: b */
    public String mo11732b() {
        return this.f26470b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        return this.f26469a.equals(crashlyticsReportWithSessionId.mo11731a()) && this.f26470b.equals(crashlyticsReportWithSessionId.mo11732b());
    }

    public int hashCode() {
        return ((this.f26469a.hashCode() ^ 1000003) * 1000003) ^ this.f26470b.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("CrashlyticsReportWithSessionId{report=");
        sbM1556G.append(this.f26469a);
        sbM1556G.append(", sessionId=");
        return outline.m1550A(sbM1556G, this.f26470b, "}");
    }
}
