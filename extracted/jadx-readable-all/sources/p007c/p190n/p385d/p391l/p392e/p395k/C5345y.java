package p007c.p190n.p385d.p391l.p392e.p395k;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4779h;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p402q.ReportUploader;
import p007c.p190n.p385d.p391l.p392e.p402q.p403c.SessionReport;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.AppSettingsData;

/* JADX INFO: renamed from: c.n.d.l.e.k.y */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class C5345y implements InterfaceC4779h<AppSettingsData, Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Executor f26640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CallableC5347z f26641b;

    public C5345y(CallableC5347z callableC5347z, Executor executor) {
        this.f26641b = callableC5347z;
        this.f26640a = executor;
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4779h
    /* JADX INFO: renamed from: a */
    public AbstractC4781i<Void> mo5192a(AppSettingsData appSettingsData) throws Exception {
        AppSettingsData appSettingsData2 = appSettingsData;
        if (appSettingsData2 == null) {
            Logger4.f26421a.m11717f("Received null app settings, cannot send reports at crash time.");
            return C4340s8.m10208e(null);
        }
        C5335t c5335t = this.f26641b.f26646e;
        Context context = c5335t.f26592i;
        ReportUploader reportUploaderM11734a = ((C5303d0) c5335t.f26601r).m11734a(appSettingsData2);
        for (File file : c5335t.m11799q()) {
            C5335t.m11782c(appSettingsData2.f26980e, file);
            SessionReport sessionReport = new SessionReport(file, C5335t.f26585g);
            CrashlyticsBackgroundWorker crashlyticsBackgroundWorker = c5335t.f26596m;
            crashlyticsBackgroundWorker.m11763b(new CrashlyticsBackgroundWorker2(crashlyticsBackgroundWorker, new C5335t.m(context, sessionReport, reportUploaderM11734a, true)));
        }
        return C4340s8.m10209f(Arrays.asList(C5335t.m11781b(this.f26641b.f26646e), this.f26641b.f26646e.f26587A.m11811a(this.f26640a, DataTransportState.m11772f(appSettingsData2))));
    }
}
