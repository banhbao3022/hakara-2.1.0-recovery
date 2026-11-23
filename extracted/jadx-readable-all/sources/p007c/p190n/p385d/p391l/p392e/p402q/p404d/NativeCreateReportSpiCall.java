package p007c.p190n.p385d.p391l.p392e.p402q.p404d;

import java.io.File;
import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p395k.AbstractSpiCall;
import p007c.p190n.p385d.p391l.p392e.p395k.ResponseParser;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpMethod2;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequest;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequestFactory;
import p007c.p190n.p385d.p391l.p392e.p402q.p403c.CreateReportRequest;
import p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report;

/* JADX INFO: renamed from: c.n.d.l.e.q.d.d, reason: use source file name */
/* JADX INFO: compiled from: NativeCreateReportSpiCall.java */
/* JADX INFO: loaded from: classes.dex */
public class NativeCreateReportSpiCall extends AbstractSpiCall implements CreateReportSpiCall {

    /* JADX INFO: renamed from: f */
    public final String f26945f;

    public NativeCreateReportSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, String str3) {
        super(str, str2, httpRequestFactory, HttpMethod2.POST);
        this.f26945f = str3;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p404d.CreateReportSpiCall
    /* JADX INFO: renamed from: a */
    public boolean mo12025a(CreateReportRequest createReportRequest, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        HttpRequest httpRequestM11725b = m11725b();
        String str = createReportRequest.f26936b;
        httpRequestM11725b.f26887e.put("User-Agent", "Crashlytics Android SDK/17.3.0");
        httpRequestM11725b.f26887e.put("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        httpRequestM11725b.f26887e.put("X-CRASHLYTICS-API-CLIENT-VERSION", this.f26945f);
        httpRequestM11725b.f26887e.put("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        String str2 = createReportRequest.f26935a;
        Report report = createReportRequest.f26937c;
        if (str2 != null) {
            httpRequestM11725b.m11969b("org_id", str2);
        }
        httpRequestM11725b.m11969b("report_id", report.mo12020b());
        for (File file : report.mo12023e()) {
            if (file.getName().equals("minidump")) {
                httpRequestM11725b.m11970c("minidump_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("metadata")) {
                httpRequestM11725b.m11970c("crash_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("binaryImages")) {
                httpRequestM11725b.m11970c("binary_images_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("session")) {
                httpRequestM11725b.m11970c("session_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("app")) {
                httpRequestM11725b.m11970c("app_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("device")) {
                httpRequestM11725b.m11970c("device_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("os")) {
                httpRequestM11725b.m11970c("os_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("user")) {
                httpRequestM11725b.m11970c("user_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("logs")) {
                httpRequestM11725b.m11970c("logs_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("keys")) {
                httpRequestM11725b.m11970c("keys_file", file.getName(), "application/octet-stream", file);
            }
        }
        Logger4 logger4 = Logger4.f26421a;
        StringBuilder sbM1556G = outline.m1556G("Sending report to: ");
        sbM1556G.append(this.f26451b);
        logger4.m11713b(sbM1556G.toString());
        try {
            int i = httpRequestM11725b.m11968a().f26889a;
            logger4.m11713b("Result was: " + i);
            return ResponseParser.m11809a(i) == 0;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
