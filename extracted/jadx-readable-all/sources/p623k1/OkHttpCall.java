package p623k1;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Call;
import p509g1.Callback;
import p509g1.FormBody;
import p509g1.HttpUrl;
import p509g1.MediaType2;
import p509g1.MultipartBody;
import p509g1.Request3;
import p509g1.RequestBody;
import p509g1.Response3;
import p509g1.ResponseBody;
import p524h1.Buffer3;
import p524h1.BufferedSource;
import p524h1.ForwardingSource;
import p524h1.RealBufferedSource;
import p524h1.Source;

/* JADX INFO: renamed from: k1.q, reason: use source file name */
/* JADX INFO: compiled from: OkHttpCall.java */
/* JADX INFO: loaded from: classes2.dex */
public final class OkHttpCall<T> implements Call2<T> {

    /* JADX INFO: renamed from: f */
    public final RequestFactory f33178f;

    /* JADX INFO: renamed from: g */
    public final Object[] f33179g;

    /* JADX INFO: renamed from: h */
    public final Call.a f33180h;

    /* JADX INFO: renamed from: i */
    public final Converter<ResponseBody, T> f33181i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f33182j;

    /* JADX INFO: renamed from: k */
    public Call f33183k;

    /* JADX INFO: renamed from: l */
    public Throwable f33184l;

    /* JADX INFO: renamed from: m */
    public boolean f33185m;

    /* JADX INFO: renamed from: k1.q$a */
    /* JADX INFO: compiled from: OkHttpCall.java */
    public class a implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callback2 f33186a;

        public a(Callback2 callback2) {
            this.f33186a = callback2;
        }

        /* JADX INFO: renamed from: a */
        public void m14303a(Call call, IOException iOException) {
            try {
                this.f33186a.mo14297a(OkHttpCall.this, iOException);
            } catch (Throwable th) {
                Utils8.m14295o(th);
                th.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m14304b(Call call, Response3 response3) {
            try {
                try {
                    this.f33186a.mo14298b(OkHttpCall.this, OkHttpCall.this.m14302d(response3));
                } catch (Throwable th) {
                    Utils8.m14295o(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                Utils8.m14295o(th2);
                try {
                    this.f33186a.mo14297a(OkHttpCall.this, th2);
                } catch (Throwable th3) {
                    Utils8.m14295o(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k1.q$b */
    /* JADX INFO: compiled from: OkHttpCall.java */
    public static final class b extends ResponseBody {

        /* JADX INFO: renamed from: f */
        public final ResponseBody f33188f;

        /* JADX INFO: renamed from: g */
        public final BufferedSource f33189g;

        /* JADX INFO: renamed from: h */
        public IOException f33190h;

        /* JADX INFO: renamed from: k1.q$b$a */
        /* JADX INFO: compiled from: OkHttpCall.java */
        public class a extends ForwardingSource {
            public a(Source source) {
                super(source);
            }

            @Override // p524h1.ForwardingSource, p524h1.Source
            /* JADX INFO: renamed from: p0 */
            public long mo13392p0(Buffer3 buffer3, long j2) throws IOException {
                try {
                    return super.mo13392p0(buffer3, j2);
                } catch (IOException e) {
                    b.this.f33190h = e;
                    throw e;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.f33188f = responseBody;
            a aVar = new a(responseBody.source());
            Intrinsics2.m13090f(aVar, "$this$buffer");
            this.f33189g = new RealBufferedSource(aVar);
        }

        @Override // p509g1.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f33188f.close();
        }

        @Override // p509g1.ResponseBody
        public long contentLength() {
            return this.f33188f.contentLength();
        }

        @Override // p509g1.ResponseBody
        public MediaType2 contentType() {
            return this.f33188f.contentType();
        }

        @Override // p509g1.ResponseBody
        public BufferedSource source() {
            return this.f33189g;
        }
    }

    /* JADX INFO: renamed from: k1.q$c */
    /* JADX INFO: compiled from: OkHttpCall.java */
    public static final class c extends ResponseBody {

        /* JADX INFO: renamed from: f */
        public final MediaType2 f33192f;

        /* JADX INFO: renamed from: g */
        public final long f33193g;

        public c(MediaType2 mediaType2, long j2) {
            this.f33192f = mediaType2;
            this.f33193g = j2;
        }

        @Override // p509g1.ResponseBody
        public long contentLength() {
            return this.f33193g;
        }

        @Override // p509g1.ResponseBody
        public MediaType2 contentType() {
            return this.f33192f;
        }

        @Override // p509g1.ResponseBody
        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(RequestFactory requestFactory, Object[] objArr, Call.a aVar, Converter<ResponseBody, T> converter) {
        this.f33178f = requestFactory;
        this.f33179g = objArr;
        this.f33180h = aVar;
        this.f33181i = converter;
    }

    @Override // p623k1.Call2
    /* JADX INFO: renamed from: B */
    public void mo14274B(Callback2<T> callback2) {
        Call call;
        Throwable th;
        synchronized (this) {
            if (this.f33185m) {
                throw new IllegalStateException("Already executed.");
            }
            this.f33185m = true;
            call = this.f33183k;
            th = this.f33184l;
            if (call == null && th == null) {
                try {
                    Call callM14300a = m14300a();
                    this.f33183k = callM14300a;
                    call = callM14300a;
                } catch (Throwable th2) {
                    th = th2;
                    Utils8.m14295o(th);
                    this.f33184l = th;
                }
            }
        }
        if (th != null) {
            callback2.mo14297a(this, th);
            return;
        }
        if (this.f33182j) {
            call.cancel();
        }
        call.mo13335u(new a(callback2));
    }

    @Override // p623k1.Call2
    /* JADX INFO: renamed from: D */
    public Call2 mo14275D() {
        return new OkHttpCall(this.f33178f, this.f33179g, this.f33180h, this.f33181i);
    }

    /* JADX INFO: renamed from: a */
    public final Call m14300a() throws IOException {
        HttpUrl httpUrlM13674b;
        Call.a aVar = this.f33180h;
        RequestFactory requestFactory = this.f33178f;
        Object[] objArr = this.f33179g;
        ParameterHandler3<?>[] parameterHandler3Arr = requestFactory.f33265j;
        int length = objArr.length;
        if (length != parameterHandler3Arr.length) {
            throw new IllegalArgumentException(outline.m1603y(outline.m1557H("Argument count (", length, ") doesn't match expected count ("), parameterHandler3Arr.length, ")"));
        }
        RequestBuilder2 requestBuilder2 = new RequestBuilder2(requestFactory.f33258c, requestFactory.f33257b, requestFactory.f33259d, requestFactory.f33260e, requestFactory.f33261f, requestFactory.f33262g, requestFactory.f33263h, requestFactory.f33264i);
        if (requestFactory.f33266k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            parameterHandler3Arr[i].mo14305a(requestBuilder2, objArr[i]);
        }
        HttpUrl.a aVar2 = requestBuilder2.f33246f;
        if (aVar2 != null) {
            httpUrlM13674b = aVar2.m13674b();
        } else {
            HttpUrl httpUrl = requestBuilder2.f33244d;
            String str = requestBuilder2.f33245e;
            Objects.requireNonNull(httpUrl);
            Intrinsics2.m13090f(str, "link");
            HttpUrl.a aVarM13670g = httpUrl.m13670g(str);
            httpUrlM13674b = aVarM13670g != null ? aVarM13670g.m13674b() : null;
            if (httpUrlM13674b == null) {
                StringBuilder sbM1556G = outline.m1556G("Malformed URL. Base: ");
                sbM1556G.append(requestBuilder2.f33244d);
                sbM1556G.append(", Relative: ");
                sbM1556G.append(requestBuilder2.f33245e);
                throw new IllegalArgumentException(sbM1556G.toString());
            }
        }
        RequestBody aVar3 = requestBuilder2.f33253m;
        if (aVar3 == null) {
            FormBody.a aVar4 = requestBuilder2.f33252l;
            if (aVar4 != null) {
                aVar3 = new FormBody(aVar4.f30627a, aVar4.f30628b);
            } else {
                MultipartBody.a aVar5 = requestBuilder2.f33251k;
                if (aVar5 != null) {
                    aVar3 = aVar5.m13691b();
                } else if (requestBuilder2.f33250j) {
                    aVar3 = RequestBody.m13325c(null, new byte[0]);
                }
            }
        }
        MediaType2 mediaType2 = requestBuilder2.f33249i;
        if (mediaType2 != null) {
            if (aVar3 != null) {
                aVar3 = new RequestBuilder2.a(aVar3, mediaType2);
            } else {
                requestBuilder2.f33248h.m13655a(HttpHeaders.CONTENT_TYPE, mediaType2.f30665d);
            }
        }
        Request3.a aVar6 = requestBuilder2.f33247g;
        aVar6.m13321i(httpUrlM13674b);
        aVar6.m13317e(requestBuilder2.f33248h.m13658d());
        aVar6.m13318f(requestBuilder2.f33243c, aVar3);
        aVar6.m13320h(Invocation.class, new Invocation(requestFactory.f33256a, arrayList));
        Call callMo13300a = aVar.mo13300a(aVar6.m13314b());
        Objects.requireNonNull(callMo13300a, "Call.Factory returned null.");
        return callMo13300a;
    }

    /* JADX INFO: renamed from: b */
    public final Call m14301b() throws IOException {
        Call call = this.f33183k;
        if (call != null) {
            return call;
        }
        Throwable th = this.f33184l;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            Call callM14300a = m14300a();
            this.f33183k = callM14300a;
            return callM14300a;
        } catch (IOException | Error | RuntimeException e) {
            Utils8.m14295o(e);
            this.f33184l = e;
            throw e;
        }
    }

    @Override // p623k1.Call2
    /* JADX INFO: renamed from: c */
    public synchronized Request3 mo14276c() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m14301b().mo13332c();
    }

    @Override // p623k1.Call2
    public void cancel() {
        Call call;
        this.f33182j = true;
        synchronized (this) {
            call = this.f33183k;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return new OkHttpCall(this.f33178f, this.f33179g, this.f33180h, this.f33181i);
    }

    /* JADX INFO: renamed from: d */
    public Response4<T> m14302d(Response3 response3) throws IOException {
        ResponseBody responseBody = response3.f29996m;
        Response3.a aVar = new Response3.a(response3);
        aVar.f30009g = new c(responseBody.contentType(), responseBody.contentLength());
        Response3 response3M13339a = aVar.m13339a();
        int i = response3M13339a.f29993j;
        if (i < 200 || i >= 300) {
            try {
                ResponseBody responseBodyM14281a = Utils8.m14281a(responseBody);
                Objects.requireNonNull(responseBodyM14281a, "body == null");
                if (response3M13339a.m13338f()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                Response4<T> response4 = new Response4<>(response3M13339a, null, responseBodyM14281a);
                responseBody.close();
                return response4;
            } catch (Throwable th) {
                responseBody.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            responseBody.close();
            return Response4.m14314b(null, response3M13339a);
        }
        b bVar = new b(responseBody);
        try {
            return Response4.m14314b(this.f33181i.mo14273a(bVar), response3M13339a);
        } catch (RuntimeException e) {
            IOException iOException = bVar.f33190h;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // p623k1.Call2
    /* JADX INFO: renamed from: f */
    public boolean mo14277f() {
        boolean z = true;
        if (this.f33182j) {
            return true;
        }
        synchronized (this) {
            Call call = this.f33183k;
            if (call == null || !call.mo13333f()) {
                z = false;
            }
        }
        return z;
    }
}
