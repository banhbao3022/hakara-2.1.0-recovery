package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpMethod2;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequest;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequestFactory;

/* JADX INFO: renamed from: c.n.d.l.e.k.a, reason: use source file name */
/* JADX INFO: compiled from: AbstractSpiCall.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSpiCall {

    /* JADX INFO: renamed from: a */
    public static final Pattern f26450a = Pattern.compile("http(s?)://[^\\/]+", 2);

    /* JADX INFO: renamed from: b */
    public final String f26451b;

    /* JADX INFO: renamed from: c */
    public final HttpRequestFactory f26452c;

    /* JADX INFO: renamed from: d */
    public final HttpMethod2 f26453d;

    /* JADX INFO: renamed from: e */
    public final String f26454e;

    public AbstractSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod2 httpMethod2) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        if (httpRequestFactory == null) {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
        this.f26454e = str;
        this.f26451b = CommonUtils.m11755r(str) ? str2 : f26450a.matcher(str2).replaceFirst(str);
        this.f26452c = httpRequestFactory;
        this.f26453d = httpMethod2;
    }

    /* JADX INFO: renamed from: b */
    public HttpRequest m11725b() {
        return m11726c(Collections.emptyMap());
    }

    /* JADX INFO: renamed from: c */
    public HttpRequest m11726c(Map<String, String> map) {
        HttpRequestFactory httpRequestFactory = this.f26452c;
        HttpMethod2 httpMethod2 = this.f26453d;
        String str = this.f26451b;
        Objects.requireNonNull(httpRequestFactory);
        HttpRequest httpRequest = new HttpRequest(httpMethod2, str, map);
        httpRequest.f26887e.put("User-Agent", "Crashlytics Android SDK/17.3.0");
        httpRequest.f26887e.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return httpRequest;
    }
}
