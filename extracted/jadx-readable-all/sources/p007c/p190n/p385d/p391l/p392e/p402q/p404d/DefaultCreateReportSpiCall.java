package p007c.p190n.p385d.p391l.p392e.p402q.p404d;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p395k.AbstractSpiCall;
import p007c.p190n.p385d.p391l.p392e.p395k.ResponseParser;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpMethod2;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequest;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequestFactory;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpResponse;
import p007c.p190n.p385d.p391l.p392e.p402q.p403c.CreateReportRequest;
import p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report;

/* JADX INFO: renamed from: c.n.d.l.e.q.d.c, reason: use source file name */
/* JADX INFO: compiled from: DefaultCreateReportSpiCall.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultCreateReportSpiCall extends AbstractSpiCall implements CreateReportSpiCall {

    /* JADX INFO: renamed from: f */
    public final String f26944f;

    public DefaultCreateReportSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, String str3) {
        super(str, str2, httpRequestFactory, HttpMethod2.POST);
        this.f26944f = str3;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p404d.CreateReportSpiCall
    /* JADX INFO: renamed from: a */
    public boolean mo12025a(CreateReportRequest createReportRequest, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        HttpRequest httpRequestM11725b = m11725b();
        httpRequestM11725b.f26887e.put("X-CRASHLYTICS-GOOGLE-APP-ID", createReportRequest.f26936b);
        httpRequestM11725b.f26887e.put("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        httpRequestM11725b.f26887e.put("X-CRASHLYTICS-API-CLIENT-VERSION", this.f26944f);
        for (Map.Entry<String, String> entry : createReportRequest.f26937c.mo12019a().entrySet()) {
            httpRequestM11725b.f26887e.put(entry.getKey(), entry.getValue());
        }
        Report report = createReportRequest.f26937c;
        httpRequestM11725b.m11969b("report[identifier]", report.mo12020b());
        if (report.mo12023e().length == 1) {
            Logger4 logger4 = Logger4.f26421a;
            StringBuilder sbM1556G = outline.m1556G("Adding single file ");
            sbM1556G.append(report.mo12024f());
            sbM1556G.append(" to report ");
            sbM1556G.append(report.mo12020b());
            logger4.m11713b(sbM1556G.toString());
            httpRequestM11725b.m11970c("report[file]", report.mo12024f(), "application/octet-stream", report.mo12021c());
        } else {
            int i = 0;
            for (File file : report.mo12023e()) {
                Logger4 logger5 = Logger4.f26421a;
                StringBuilder sbM1556G2 = outline.m1556G("Adding file ");
                sbM1556G2.append(file.getName());
                sbM1556G2.append(" to report ");
                sbM1556G2.append(report.mo12020b());
                logger5.m11713b(sbM1556G2.toString());
                httpRequestM11725b.m11970c("report[file" + i + "]", file.getName(), "application/octet-stream", file);
                i++;
            }
        }
        Logger4 logger6 = Logger4.f26421a;
        StringBuilder sbM1556G3 = outline.m1556G("Sending report to: ");
        sbM1556G3.append(this.f26451b);
        logger6.m11713b(sbM1556G3.toString());
        try {
            HttpResponse httpResponseM11968a = httpRequestM11725b.m11968a();
            int i2 = httpResponseM11968a.f26889a;
            logger6.m11713b("Create report request ID: " + httpResponseM11968a.f26891c.m13649c("X-REQUEST-ID"));
            logger6.m11713b("Result was: " + i2);
            return ResponseParser.m11809a(i2) == 0;
        } catch (IOException e) {
            Logger4 logger7 = Logger4.f26421a;
            if (logger7.m11712a(6)) {
                Log.e(logger7.f26422b, "Create report HTTP request failed.", e);
            }
            throw new RuntimeException(e);
        }
    }
}
