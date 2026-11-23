package p007c.p190n.p385d.p391l.p392e.p406s.p408i;

import android.util.Log;
import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p395k.AbstractSpiCall;
import p007c.p190n.p385d.p391l.p392e.p395k.CommonUtils;
import p007c.p190n.p385d.p391l.p392e.p395k.ResponseParser;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpMethod2;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequest;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequestFactory;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpResponse;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.AppRequestData;

/* JADX INFO: renamed from: c.n.d.l.e.s.i.a, reason: use source file name */
/* JADX INFO: compiled from: AbstractAppSpiCall.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAppSpiCall extends AbstractSpiCall {

    /* JADX INFO: renamed from: f */
    public final String f27000f;

    public AbstractAppSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod2 httpMethod2, String str3) {
        super(str, str2, httpRequestFactory, httpMethod2);
        this.f27000f = str3;
    }

    /* JADX INFO: renamed from: d */
    public boolean m12038d(AppRequestData appRequestData, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        HttpRequest httpRequestM11725b = m11725b();
        httpRequestM11725b.f26887e.put("X-CRASHLYTICS-ORG-ID", appRequestData.f26966a);
        httpRequestM11725b.f26887e.put("X-CRASHLYTICS-GOOGLE-APP-ID", appRequestData.f26967b);
        httpRequestM11725b.f26887e.put("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        httpRequestM11725b.f26887e.put("X-CRASHLYTICS-API-CLIENT-VERSION", this.f27000f);
        httpRequestM11725b.m11969b("org_id", appRequestData.f26966a);
        httpRequestM11725b.m11969b("app[identifier]", appRequestData.f26968c);
        httpRequestM11725b.m11969b("app[name]", appRequestData.f26972g);
        httpRequestM11725b.m11969b("app[display_version]", appRequestData.f26969d);
        httpRequestM11725b.m11969b("app[build_version]", appRequestData.f26970e);
        httpRequestM11725b.m11969b("app[source]", Integer.toString(appRequestData.f26973h));
        httpRequestM11725b.m11969b("app[minimum_sdk_version]", appRequestData.f26974i);
        httpRequestM11725b.m11969b("app[built_sdk_version]", appRequestData.f26975j);
        if (!CommonUtils.m11755r(appRequestData.f26971f)) {
            httpRequestM11725b.m11969b("app[instance_identifier]", appRequestData.f26971f);
        }
        Logger4 logger4 = Logger4.f26421a;
        StringBuilder sbM1556G = outline.m1556G("Sending app info to ");
        sbM1556G.append(this.f26451b);
        logger4.m11713b(sbM1556G.toString());
        try {
            HttpResponse httpResponseM11968a = httpRequestM11725b.m11968a();
            int i = httpResponseM11968a.f26889a;
            logger4.m11713b(("POST".equalsIgnoreCase(httpRequestM11725b.f26884b.name()) ? "Create" : "Update") + " app request ID: " + httpResponseM11968a.f26891c.m13649c("X-REQUEST-ID"));
            StringBuilder sb = new StringBuilder();
            sb.append("Result was ");
            sb.append(i);
            logger4.m11713b(sb.toString());
            return ResponseParser.m11809a(i) == 0;
        } catch (IOException e) {
            Logger4 logger5 = Logger4.f26421a;
            if (logger5.m11712a(6)) {
                Log.e(logger5.f26422b, "HTTP request failed.", e);
            }
            throw new RuntimeException(e);
        }
    }
}
