package p007c.p190n.p385d.p391l.p392e.p405r;

import p007c.p190n.p194b.p195a.TransportScheduleCallback;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p385d.p391l.p392e.p395k.CrashlyticsReportWithSessionId;
import p007c.p190n.p385d.p391l.p392e.p397m.p398x.CrashlyticsReportJsonTransform8;

/* JADX INFO: renamed from: c.n.d.l.e.r.a, reason: use source file name */
/* JADX INFO: compiled from: DataTransportCrashlyticsReportSender.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DataTransportCrashlyticsReportSender implements TransportScheduleCallback {

    /* JADX INFO: renamed from: a */
    public final C4782j f26946a;

    /* JADX INFO: renamed from: b */
    public final CrashlyticsReportWithSessionId f26947b;

    public DataTransportCrashlyticsReportSender(C4782j c4782j, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        this.f26946a = c4782j;
        this.f26947b = crashlyticsReportWithSessionId;
    }

    @Override // p007c.p190n.p194b.p195a.TransportScheduleCallback
    /* JADX INFO: renamed from: a */
    public void mo2751a(Exception exc) {
        C4782j c4782j = this.f26946a;
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = this.f26947b;
        CrashlyticsReportJsonTransform8 crashlyticsReportJsonTransform8 = DataTransportCrashlyticsReportSender3.f26949a;
        if (exc != null) {
            c4782j.m10947a(exc);
        } else {
            c4782j.m10948b(crashlyticsReportWithSessionId);
        }
    }
}
