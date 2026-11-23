package p007c.p190n.p385d.p391l.p392e.p395k;

import android.content.Context;
import p007c.p190n.p385d.p391l.p392e.p402q.ReportUploader;
import p007c.p190n.p385d.p391l.p392e.p402q.p404d.CompositeCreateReportSpiCall;
import p007c.p190n.p385d.p391l.p392e.p402q.p404d.DefaultCreateReportSpiCall;
import p007c.p190n.p385d.p391l.p392e.p402q.p404d.NativeCreateReportSpiCall;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.AppSettingsData;

/* JADX INFO: renamed from: c.n.d.l.e.k.d0 */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class C5303d0 implements ReportUploader.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5335t f26474a;

    public C5303d0(C5335t c5335t) {
        this.f26474a = c5335t;
    }

    /* JADX INFO: renamed from: a */
    public ReportUploader m11734a(AppSettingsData appSettingsData) {
        String str = appSettingsData.f26978c;
        String str2 = appSettingsData.f26979d;
        String str3 = appSettingsData.f26980e;
        C5335t c5335t = this.f26474a;
        Context context = c5335t.f26592i;
        int iM11750m = CommonUtils.m11750m(context, "com.crashlytics.ApiEndpoint", "string");
        String string = iM11750m > 0 ? context.getString(iM11750m) : "";
        CompositeCreateReportSpiCall compositeCreateReportSpiCall = new CompositeCreateReportSpiCall(new DefaultCreateReportSpiCall(string, str, c5335t.f26597n, "17.3.0"), new NativeCreateReportSpiCall(string, str2, c5335t.f26597n, "17.3.0"));
        String str4 = this.f26474a.f26600q.f26456a;
        DataTransportState dataTransportStateM11772f = DataTransportState.m11772f(appSettingsData);
        C5335t c5335t2 = this.f26474a;
        return new ReportUploader(str3, str4, dataTransportStateM11772f, c5335t2.f26604u, compositeCreateReportSpiCall, c5335t2.f26605v);
    }
}
