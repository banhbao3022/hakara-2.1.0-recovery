package p007c.p190n.p385d.p391l.p392e.p406s.p408i;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p395k.AbstractSpiCall;
import p007c.p190n.p385d.p391l.p392e.p395k.CommonUtils;
import p007c.p190n.p385d.p391l.p392e.p395k.IdManager;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpMethod2;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequest;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequestFactory;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpResponse;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.SettingsRequest;

/* JADX INFO: renamed from: c.n.d.l.e.s.i.c, reason: use source file name */
/* JADX INFO: compiled from: DefaultSettingsSpiCall.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultSettingsSpiCall extends AbstractSpiCall implements SettingsSpiCall {

    /* JADX INFO: renamed from: f */
    public Logger4 f27001f;

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultSettingsSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory) {
        HttpMethod2 httpMethod2 = HttpMethod2.GET;
        Logger4 logger4 = Logger4.f26421a;
        super(str, str2, httpRequestFactory, httpMethod2);
        this.f27001f = logger4;
    }

    /* JADX INFO: renamed from: d */
    public final HttpRequest m12039d(HttpRequest httpRequest, SettingsRequest settingsRequest) {
        m12040e(httpRequest, "X-CRASHLYTICS-GOOGLE-APP-ID", settingsRequest.f26991a);
        m12040e(httpRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m12040e(httpRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", "17.3.0");
        m12040e(httpRequest, "Accept", "application/json");
        m12040e(httpRequest, "X-CRASHLYTICS-DEVICE-MODEL", settingsRequest.f26992b);
        m12040e(httpRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", settingsRequest.f26993c);
        m12040e(httpRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", settingsRequest.f26994d);
        m12040e(httpRequest, "X-CRASHLYTICS-INSTALLATION-ID", ((IdManager) settingsRequest.f26995e).m11775b());
        return httpRequest;
    }

    /* JADX INFO: renamed from: e */
    public final void m12040e(HttpRequest httpRequest, String str, String str2) {
        if (str2 != null) {
            httpRequest.f26887e.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, String> m12041f(SettingsRequest settingsRequest) {
        HashMap map = new HashMap();
        map.put("build_version", settingsRequest.f26998h);
        map.put("display_version", settingsRequest.f26997g);
        map.put("source", Integer.toString(settingsRequest.f26999i));
        String str = settingsRequest.f26996f;
        if (!CommonUtils.m11755r(str)) {
            map.put("instance", str);
        }
        return map;
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m12042g(HttpResponse httpResponse) {
        int i = httpResponse.f26889a;
        this.f27001f.m11713b("Settings result was: " + i);
        if (!(i == 200 || i == 201 || i == 202 || i == 203)) {
            Logger4 logger4 = this.f27001f;
            StringBuilder sbM1556G = outline.m1556G("Failed to retrieve settings from ");
            sbM1556G.append(this.f26451b);
            logger4.m11715d(sbM1556G.toString());
            return null;
        }
        String str = httpResponse.f26890b;
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            Logger4 logger5 = this.f27001f;
            StringBuilder sbM1556G2 = outline.m1556G("Failed to parse settings JSON from ");
            sbM1556G2.append(this.f26451b);
            logger5.m11714c(sbM1556G2.toString(), e);
            outline.m1566Q("Settings response ", str, this.f27001f);
            return null;
        }
    }
}
