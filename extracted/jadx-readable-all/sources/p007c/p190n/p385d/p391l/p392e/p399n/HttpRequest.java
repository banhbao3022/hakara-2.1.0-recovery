package p007c.p190n.p385d.p391l.p392e.p399n;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.CacheControl;
import p509g1.HttpUrl;
import p509g1.MediaType2;
import p509g1.MultipartBody;
import p509g1.OkHttpClient;
import p509g1.Request3;
import p509g1.RequestBody;
import p509g1.Response3;
import p509g1.ResponseBody;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p514g.RealCall;

/* JADX INFO: renamed from: c.n.d.l.e.n.b, reason: use source file name */
/* JADX INFO: compiled from: HttpRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class HttpRequest {

    /* JADX INFO: renamed from: a */
    public static final OkHttpClient f26883a;

    /* JADX INFO: renamed from: b */
    public final HttpMethod2 f26884b;

    /* JADX INFO: renamed from: c */
    public final String f26885c;

    /* JADX INFO: renamed from: d */
    public final Map<String, String> f26886d;

    /* JADX INFO: renamed from: f */
    public MultipartBody.a f26888f = null;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f26887e = new HashMap();

    static {
        OkHttpClient.a aVar = new OkHttpClient.a(new OkHttpClient());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics2.m13090f(timeUnit, "unit");
        aVar.f29906x = Util9.m13362b("timeout", 10000L, timeUnit);
        f26883a = new OkHttpClient(aVar);
    }

    public HttpRequest(HttpMethod2 httpMethod2, String str, Map<String, String> map) {
        this.f26884b = httpMethod2;
        this.f26885c = str;
        this.f26886d = map;
    }

    /* JADX INFO: renamed from: a */
    public HttpResponse m11968a() throws IOException {
        HttpUrl httpUrlM13681c;
        Request3.a aVar = new Request3.a();
        CacheControl.a aVar2 = new CacheControl.a();
        aVar2.f29975a = true;
        Request3.a aVarM13315c = aVar.m13315c(aVar2.m13322a());
        String str = this.f26885c;
        HttpUrl.b bVar = HttpUrl.f30642b;
        Objects.requireNonNull(bVar);
        Intrinsics2.m13090f(str, "$this$toHttpUrlOrNull");
        try {
            httpUrlM13681c = bVar.m13681c(str);
        } catch (IllegalArgumentException unused) {
            httpUrlM13681c = null;
        }
        HttpUrl.a aVarM13669f = httpUrlM13681c.m13669f();
        for (Map.Entry<String, String> entry : this.f26886d.entrySet()) {
            aVarM13669f.m13673a(entry.getKey(), entry.getValue());
        }
        aVarM13315c.m13321i(aVarM13669f.m13674b());
        for (Map.Entry<String, String> entry2 : this.f26887e.entrySet()) {
            aVarM13315c.m13316d(entry2.getKey(), entry2.getValue());
        }
        MultipartBody.a aVar3 = this.f26888f;
        aVarM13315c.m13318f(this.f26884b.name(), aVar3 == null ? null : aVar3.m13691b());
        Response3 response3Mo13334h = ((RealCall) f26883a.mo13300a(aVarM13315c.m13314b())).mo13334h();
        ResponseBody responseBody = response3Mo13334h.f29996m;
        return new HttpResponse(response3Mo13334h.f29993j, responseBody != null ? responseBody.string() : null, response3Mo13334h.f29995l);
    }

    /* JADX INFO: renamed from: b */
    public HttpRequest m11969b(String str, String str2) {
        if (this.f26888f == null) {
            MultipartBody.a aVar = new MultipartBody.a();
            aVar.m13692c(MultipartBody.f30669c);
            this.f26888f = aVar;
        }
        MultipartBody.a aVar2 = this.f26888f;
        Objects.requireNonNull(aVar2);
        Intrinsics2.m13090f(str, "name");
        Intrinsics2.m13090f(str2, "value");
        MultipartBody.c.a aVar3 = MultipartBody.c.f30682a;
        Objects.requireNonNull(aVar3);
        Intrinsics2.m13090f(str, "name");
        Intrinsics2.m13090f(str2, "value");
        aVar2.m13690a(aVar3.m13695b(str, null, RequestBody.a.m13329c(RequestBody.f29980a, str2, null, 1)));
        this.f26888f = aVar2;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public HttpRequest m11970c(String str, String str2, String str3, File file) {
        MediaType2 mediaType2M13688b = MediaType2.f30664c.m13688b(str3);
        Objects.requireNonNull(RequestBody.f29980a);
        Intrinsics2.m13090f(file, "file");
        Intrinsics2.m13090f(file, "$this$asRequestBody");
        RequestBody.a.C8543a c8543a = new RequestBody.a.C8543a(file, mediaType2M13688b);
        if (this.f26888f == null) {
            MultipartBody.a aVar = new MultipartBody.a();
            aVar.m13692c(MultipartBody.f30669c);
            this.f26888f = aVar;
        }
        MultipartBody.a aVar2 = this.f26888f;
        Objects.requireNonNull(aVar2);
        Intrinsics2.m13090f(str, "name");
        Intrinsics2.m13090f(c8543a, "body");
        aVar2.m13690a(MultipartBody.c.f30682a.m13695b(str, str2, c8543a));
        this.f26888f = aVar2;
        return this;
    }
}
