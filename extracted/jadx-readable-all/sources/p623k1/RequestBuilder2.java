package p623k1;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.FormBody;
import p509g1.Headers2;
import p509g1.HttpUrl;
import p509g1.MediaType2;
import p509g1.MultipartBody;
import p509g1.Request3;
import p509g1.RequestBody;
import p524h1.BufferedSink;

/* JADX INFO: renamed from: k1.w, reason: use source file name */
/* JADX INFO: compiled from: RequestBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class RequestBuilder2 {

    /* JADX INFO: renamed from: a */
    public static final char[] f33241a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b */
    public static final Pattern f33242b = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: c */
    public final String f33243c;

    /* JADX INFO: renamed from: d */
    public final HttpUrl f33244d;

    /* JADX INFO: renamed from: e */
    public String f33245e;

    /* JADX INFO: renamed from: f */
    public HttpUrl.a f33246f;

    /* JADX INFO: renamed from: g */
    public final Request3.a f33247g = new Request3.a();

    /* JADX INFO: renamed from: h */
    public final Headers2.a f33248h;

    /* JADX INFO: renamed from: i */
    public MediaType2 f33249i;

    /* JADX INFO: renamed from: j */
    public final boolean f33250j;

    /* JADX INFO: renamed from: k */
    public MultipartBody.a f33251k;

    /* JADX INFO: renamed from: l */
    public FormBody.a f33252l;

    /* JADX INFO: renamed from: m */
    public RequestBody f33253m;

    /* JADX INFO: renamed from: k1.w$a */
    /* JADX INFO: compiled from: RequestBuilder.java */
    public static class a extends RequestBody {

        /* JADX INFO: renamed from: b */
        public final RequestBody f33254b;

        /* JADX INFO: renamed from: c */
        public final MediaType2 f33255c;

        public a(RequestBody requestBody, MediaType2 mediaType2) {
            this.f33254b = requestBody;
            this.f33255c = mediaType2;
        }

        @Override // p509g1.RequestBody
        /* JADX INFO: renamed from: a */
        public long mo13326a() throws IOException {
            return this.f33254b.mo13326a();
        }

        @Override // p509g1.RequestBody
        /* JADX INFO: renamed from: b */
        public MediaType2 mo13327b() {
            return this.f33255c;
        }

        @Override // p509g1.RequestBody
        /* JADX INFO: renamed from: d */
        public void mo13328d(BufferedSink bufferedSink) throws IOException {
            this.f33254b.mo13328d(bufferedSink);
        }
    }

    public RequestBuilder2(String str, HttpUrl httpUrl, String str2, Headers2 headers2, MediaType2 mediaType2, boolean z, boolean z2, boolean z3) {
        this.f33243c = str;
        this.f33244d = httpUrl;
        this.f33245e = str2;
        this.f33249i = mediaType2;
        this.f33250j = z;
        if (headers2 != null) {
            this.f33248h = headers2.m13651h();
        } else {
            this.f33248h = new Headers2.a();
        }
        if (z2) {
            this.f33252l = new FormBody.a();
        } else if (z3) {
            MultipartBody.a aVar = new MultipartBody.a();
            this.f33251k = aVar;
            aVar.m13692c(MultipartBody.f30669c);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14308a(String str, String str2, boolean z) {
        if (z) {
            FormBody.a aVar = this.f33252l;
            Objects.requireNonNull(aVar);
            Intrinsics2.m13090f(str, "name");
            Intrinsics2.m13090f(str2, "value");
            List<String> list = aVar.f30627a;
            HttpUrl.b bVar = HttpUrl.f30642b;
            list.add(HttpUrl.b.m13678a(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f30629c, 83));
            aVar.f30628b.add(HttpUrl.b.m13678a(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f30629c, 83));
            return;
        }
        FormBody.a aVar2 = this.f33252l;
        Objects.requireNonNull(aVar2);
        Intrinsics2.m13090f(str, "name");
        Intrinsics2.m13090f(str2, "value");
        List<String> list2 = aVar2.f30627a;
        HttpUrl.b bVar2 = HttpUrl.f30642b;
        list2.add(HttpUrl.b.m13678a(bVar2, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar2.f30629c, 91));
        aVar2.f30628b.add(HttpUrl.b.m13678a(bVar2, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar2.f30629c, 91));
    }

    /* JADX INFO: renamed from: b */
    public void m14309b(String str, String str2) {
        if (!HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            this.f33248h.m13655a(str, str2);
            return;
        }
        try {
            this.f33249i = MediaType2.f30664c.m13687a(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(outline.m1599u("Malformed content type: ", str2), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m14310c(String str, String str2, boolean z) {
        String str3 = this.f33245e;
        if (str3 != null) {
            HttpUrl.a aVarM13670g = this.f33244d.m13670g(str3);
            this.f33246f = aVarM13670g;
            if (aVarM13670g == null) {
                StringBuilder sbM1556G = outline.m1556G("Malformed URL. Base: ");
                sbM1556G.append(this.f33244d);
                sbM1556G.append(", Relative: ");
                sbM1556G.append(this.f33245e);
                throw new IllegalArgumentException(sbM1556G.toString());
            }
            this.f33245e = null;
        }
        if (z) {
            this.f33246f.m13673a(str, str2);
            return;
        }
        HttpUrl.a aVar = this.f33246f;
        Objects.requireNonNull(aVar);
        Intrinsics2.m13090f(str, "name");
        if (aVar.f30660h == null) {
            aVar.f30660h = new ArrayList();
        }
        List<String> list = aVar.f30660h;
        if (list == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        HttpUrl.b bVar = HttpUrl.f30642b;
        list.add(HttpUrl.b.m13678a(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
        List<String> list2 = aVar.f30660h;
        if (list2 != null) {
            list2.add(str2 != null ? HttpUrl.b.m13678a(bVar, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219) : null);
        } else {
            Intrinsics2.m13095k();
            throw null;
        }
    }
}
