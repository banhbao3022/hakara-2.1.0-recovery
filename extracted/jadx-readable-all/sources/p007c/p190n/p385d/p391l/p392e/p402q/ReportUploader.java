package p007c.p190n.p385d.p391l.p392e.p402q;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p395k.BackgroundPriorityRunnable;
import p007c.p190n.p385d.p391l.p392e.p395k.C5335t;
import p007c.p190n.p385d.p391l.p392e.p395k.DataTransportState;
import p007c.p190n.p385d.p391l.p392e.p402q.p403c.CreateReportRequest;
import p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report;
import p007c.p190n.p385d.p391l.p392e.p402q.p404d.CreateReportSpiCall;

/* JADX INFO: renamed from: c.n.d.l.e.q.b, reason: use source file name */
/* JADX INFO: compiled from: ReportUploader.java */
/* JADX INFO: loaded from: classes.dex */
public class ReportUploader {

    /* JADX INFO: renamed from: a */
    public static final short[] f26923a = {10, 20, 30, 60, 120, 300};

    /* JADX INFO: renamed from: b */
    public final CreateReportSpiCall f26924b;

    /* JADX INFO: renamed from: c */
    public final String f26925c;

    /* JADX INFO: renamed from: d */
    public final String f26926d;

    /* JADX INFO: renamed from: e */
    public final DataTransportState f26927e;

    /* JADX INFO: renamed from: f */
    public final ReportManager f26928f;

    /* JADX INFO: renamed from: g */
    public final a f26929g;

    /* JADX INFO: renamed from: h */
    public Thread f26930h;

    /* JADX INFO: renamed from: c.n.d.l.e.q.b$a */
    /* JADX INFO: compiled from: ReportUploader.java */
    public interface a {
    }

    /* JADX INFO: renamed from: c.n.d.l.e.q.b$b */
    /* JADX INFO: compiled from: ReportUploader.java */
    public interface b {
    }

    /* JADX INFO: renamed from: c.n.d.l.e.q.b$c */
    /* JADX INFO: compiled from: ReportUploader.java */
    public interface c {
    }

    /* JADX INFO: renamed from: c.n.d.l.e.q.b$d */
    /* JADX INFO: compiled from: ReportUploader.java */
    public class d extends BackgroundPriorityRunnable {

        /* JADX INFO: renamed from: f */
        public final List<Report> f26931f;

        /* JADX INFO: renamed from: g */
        public final boolean f26932g;

        /* JADX INFO: renamed from: h */
        public final float f26933h;

        public d(List<Report> list, boolean z, float f) {
            this.f26931f = list;
            this.f26932g = z;
            this.f26933h = f;
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p395k.BackgroundPriorityRunnable
        /* JADX INFO: renamed from: a */
        public void mo11733a() {
            try {
                m12018b(this.f26931f, this.f26932g);
            } catch (Exception e) {
                Logger4 logger4 = Logger4.f26421a;
                if (logger4.m11712a(6)) {
                    Log.e(logger4.f26422b, "An unexpected error occurred while attempting to upload crash reports.", e);
                }
            }
            ReportUploader.this.f26930h = null;
        }

        /* JADX INFO: renamed from: b */
        public final void m12018b(List<Report> list, boolean z) {
            Logger4 logger4 = Logger4.f26421a;
            StringBuilder sbM1556G = outline.m1556G("Starting report processing in ");
            sbM1556G.append(this.f26933h);
            sbM1556G.append(" second(s)...");
            logger4.m11713b(sbM1556G.toString());
            float f = this.f26933h;
            if (f > 0.0f) {
                try {
                    Thread.sleep((long) (f * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (C5335t.this.m11798p()) {
                return;
            }
            int i = 0;
            while (list.size() > 0 && !C5335t.this.m11798p()) {
                Logger4 logger5 = Logger4.f26421a;
                StringBuilder sbM1556G2 = outline.m1556G("Attempting to send ");
                sbM1556G2.append(list.size());
                sbM1556G2.append(" report(s)");
                logger5.m11713b(sbM1556G2.toString());
                ArrayList arrayList = new ArrayList();
                for (Report report : list) {
                    if (!ReportUploader.this.m12017a(report, z)) {
                        arrayList.add(report);
                    }
                }
                if (arrayList.size() > 0) {
                    short[] sArr = ReportUploader.f26923a;
                    int i2 = i + 1;
                    long j2 = sArr[Math.min(i, sArr.length - 1)];
                    Logger4.f26421a.m11713b("Report submission: scheduling delayed retry in " + j2 + " seconds");
                    try {
                        Thread.sleep(j2 * 1000);
                        i = i2;
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                list = arrayList;
            }
        }
    }

    public ReportUploader(String str, String str2, DataTransportState dataTransportState, ReportManager reportManager, CreateReportSpiCall createReportSpiCall, a aVar) {
        if (createReportSpiCall == null) {
            throw new IllegalArgumentException("createReportCall must not be null.");
        }
        this.f26924b = createReportSpiCall;
        this.f26925c = str;
        this.f26926d = str2;
        this.f26927e = dataTransportState;
        this.f26928f = reportManager;
        this.f26929g = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #0 {Exception -> 0x0068, blocks: (B:3:0x0001, B:6:0x0012, B:21:0x005f, B:7:0x0018, B:9:0x001c, B:11:0x0022, B:13:0x0029, B:17:0x0042, B:19:0x0057), top: B:27:0x0001 }] */
    /* JADX INFO: renamed from: a */
    public boolean m12017a(Report report, boolean z) {
        boolean zMo12025a;
        try {
            CreateReportRequest createReportRequest = new CreateReportRequest(this.f26925c, this.f26926d, report);
            DataTransportState dataTransportState = this.f26927e;
            if (dataTransportState != DataTransportState.ALL) {
                if (dataTransportState == DataTransportState.JAVA_ONLY && report.mo12022d() == 1) {
                    Logger4.f26421a.m11713b("Report configured to be sent via DataTransport.");
                } else {
                    zMo12025a = this.f26924b.mo12025a(createReportRequest, z);
                    Logger4 logger4 = Logger4.f26421a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Crashlytics Reports Endpoint upload ");
                    sb.append(zMo12025a ? "complete: " : "FAILED: ");
                    sb.append(report.mo12020b());
                    String string = sb.toString();
                    if (logger4.m11712a(4)) {
                        Log.i(logger4.f26422b, string, null);
                    }
                }
                if (zMo12025a) {
                    Objects.requireNonNull(this.f26928f);
                    report.remove();
                    return true;
                }
                return false;
            }
            Logger4.f26421a.m11713b("Report configured to be sent via DataTransport.");
            zMo12025a = true;
            if (zMo12025a) {
                Objects.requireNonNull(this.f26928f);
                report.remove();
                return true;
            }
        } catch (Exception e) {
            Logger4.f26421a.m11716e("Error occurred sending report " + report, e);
        }
        return false;
    }
}
