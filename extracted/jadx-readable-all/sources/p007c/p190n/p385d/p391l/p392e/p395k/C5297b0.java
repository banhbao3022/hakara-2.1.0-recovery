package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.List;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4779h;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p402q.ReportUploader;
import p007c.p190n.p385d.p391l.p392e.p402q.ReportUploader.d;
import p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.AppSettingsData;

/* JADX INFO: renamed from: c.n.d.l.e.k.b0 */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class C5297b0 implements InterfaceC4779h<AppSettingsData, Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f26463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f26464b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Executor f26465c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CallableC5300c0 f26466d;

    public C5297b0(CallableC5300c0 callableC5300c0, List list, boolean z, Executor executor) {
        this.f26466d = callableC5300c0;
        this.f26463a = list;
        this.f26464b = z;
        this.f26465c = executor;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4779h
    /* JADX INFO: renamed from: a */
    public AbstractC4781i<Void> mo5192a(AppSettingsData appSettingsData) throws Exception {
        AppSettingsData appSettingsData2 = appSettingsData;
        if (appSettingsData2 == null) {
            Logger4.f26421a.m11717f("Received null app settings, cannot send reports during app startup.");
            return C4340s8.m10208e(null);
        }
        for (Report report : this.f26463a) {
            if (report.mo12022d() == 1) {
                C5335t.m11782c(appSettingsData2.f26980e, report.mo12021c());
            }
        }
        C5335t.m11781b(C5335t.this);
        ReportUploader reportUploaderM11734a = ((C5303d0) C5335t.this.f26601r).m11734a(appSettingsData2);
        List list = this.f26463a;
        boolean z = this.f26464b;
        float f = this.f26466d.f26472b.f26611b;
        synchronized (reportUploaderM11734a) {
            if (reportUploaderM11734a.f26930h != null) {
                Logger4.f26421a.m11713b("Report upload has already been started.");
            } else {
                Thread thread = new Thread(reportUploaderM11734a.new d(list, z, f), "Crashlytics Report Uploader");
                reportUploaderM11734a.f26930h = thread;
                thread.start();
            }
        }
        C5335t.this.f26587A.m11811a(this.f26465c, DataTransportState.m11772f(appSettingsData2));
        C5335t.this.f26591E.m10948b(null);
        return C4340s8.m10208e(null);
    }
}
