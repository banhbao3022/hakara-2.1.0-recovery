package p007c.p190n.p385d.p391l.p392e.p395k;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p195a.AutoValue_Event;
import p007c.p190n.p194b.p195a.Priority2;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4767b;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p396l.LogFileManager;
import p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport;
import p007c.p190n.p385d.p391l.p392e.p400o.CrashlyticsReportPersistence7;
import p007c.p190n.p385d.p391l.p392e.p405r.DataTransportCrashlyticsReportSender;
import p007c.p190n.p385d.p391l.p392e.p405r.DataTransportCrashlyticsReportSender3;

/* JADX INFO: renamed from: c.n.d.l.e.k.x0, reason: use source file name */
/* JADX INFO: compiled from: SessionReportingCoordinator.java */
/* JADX INFO: loaded from: classes.dex */
public class SessionReportingCoordinator3 {

    /* JADX INFO: renamed from: a */
    public final CrashlyticsReportDataCapture f26635a;

    /* JADX INFO: renamed from: b */
    public final CrashlyticsReportPersistence7 f26636b;

    /* JADX INFO: renamed from: c */
    public final DataTransportCrashlyticsReportSender3 f26637c;

    /* JADX INFO: renamed from: d */
    public final LogFileManager f26638d;

    /* JADX INFO: renamed from: e */
    public final UserMetadata f26639e;

    public SessionReportingCoordinator3(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence7 crashlyticsReportPersistence7, DataTransportCrashlyticsReportSender3 dataTransportCrashlyticsReportSender3, LogFileManager logFileManager, UserMetadata userMetadata) {
        this.f26635a = crashlyticsReportDataCapture;
        this.f26636b = crashlyticsReportPersistence7;
        this.f26637c = dataTransportCrashlyticsReportSender3;
        this.f26638d = logFileManager;
        this.f26639e = userMetadata;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: a */
    public AbstractC4781i<Void> m11811a(Executor executor, DataTransportState dataTransportState) {
        if (dataTransportState == DataTransportState.NONE) {
            Logger4.f26421a.m11713b("Send via DataTransport disabled. Removing DataTransport reports.");
            this.f26636b.m11979b();
            return C4340s8.m10208e(null);
        }
        CrashlyticsReportPersistence7 crashlyticsReportPersistence7 = this.f26636b;
        List<File> listM11981e = crashlyticsReportPersistence7.m11981e();
        ArrayList<CrashlyticsReportWithSessionId> arrayList = new ArrayList();
        arrayList.ensureCapacity(((ArrayList) listM11981e).size());
        for (File file : (ArrayList) crashlyticsReportPersistence7.m11981e()) {
            try {
                arrayList.add(new AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReportPersistence7.f26900c.m11966f(CrashlyticsReportPersistence7.m11976j(file)), file.getName()));
            } catch (IOException e) {
                Logger4.f26421a.m11714c("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (CrashlyticsReportWithSessionId crashlyticsReportWithSessionId : arrayList) {
            CrashlyticsReport crashlyticsReportMo11731a = crashlyticsReportWithSessionId.mo11731a();
            if ((crashlyticsReportMo11731a.mo11843h() != null ? (char) 2 : crashlyticsReportMo11731a.mo11840e() != null ? (char) 3 : (char) 1) != 3 || dataTransportState == DataTransportState.ALL) {
                DataTransportCrashlyticsReportSender3 dataTransportCrashlyticsReportSender3 = this.f26637c;
                Objects.requireNonNull(dataTransportCrashlyticsReportSender3);
                CrashlyticsReport crashlyticsReportMo11731a2 = crashlyticsReportWithSessionId.mo11731a();
                C4782j c4782j = new C4782j();
                dataTransportCrashlyticsReportSender3.f26953e.mo2749b(new AutoValue_Event(null, crashlyticsReportMo11731a2, Priority2.HIGHEST), new DataTransportCrashlyticsReportSender(c4782j, crashlyticsReportWithSessionId));
                arrayList2.add(c4782j.f24683a.mo10934g(executor, (InterfaceC4767b<TResult, TContinuationResult>) new InterfaceC4767b(this) { // from class: c.n.d.l.e.k.v0

                    /* JADX INFO: renamed from: a */
                    public final SessionReportingCoordinator3 f26630a;

                    {
                        this.f26630a = this;
                    }

                    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4767b
                    /* JADX INFO: renamed from: a */
                    public Object mo5191a(AbstractC4781i abstractC4781i) {
                        boolean z;
                        SessionReportingCoordinator3 sessionReportingCoordinator3 = this.f26630a;
                        Objects.requireNonNull(sessionReportingCoordinator3);
                        if (abstractC4781i.mo10941n()) {
                            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId2 = (CrashlyticsReportWithSessionId) abstractC4781i.mo10937j();
                            Logger4 logger4 = Logger4.f26421a;
                            StringBuilder sbM1556G = outline.m1556G("Crashlytics report successfully enqueued to DataTransport: ");
                            sbM1556G.append(crashlyticsReportWithSessionId2.mo11732b());
                            logger4.m11713b(sbM1556G.toString());
                            sessionReportingCoordinator3.f26636b.m11980c(crashlyticsReportWithSessionId2.mo11732b());
                            z = true;
                        } else {
                            Logger4 logger5 = Logger4.f26421a;
                            Exception excMo10936i = abstractC4781i.mo10936i();
                            if (logger5.m11712a(3)) {
                                Log.d(logger5.f26422b, "Crashlytics report could not be enqueued to DataTransport", excMo10936i);
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                }));
            } else {
                Logger4.f26421a.m11713b("Send native reports via DataTransport disabled. Removing DataTransport reports.");
                this.f26636b.m11980c(crashlyticsReportWithSessionId.mo11732b());
            }
        }
        return C4340s8.m10209f(arrayList2);
    }
}
