package p509g1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Tuples;
import p477d1.p483s.Collections2;
import p477d1.p483s.Maps7;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p515h.HttpMethod3;

/* JADX INFO: renamed from: g1.c0, reason: use source file name */
/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Request3 {

    /* JADX INFO: renamed from: a */
    public CacheControl f29950a;

    /* JADX INFO: renamed from: b */
    public final HttpUrl f29951b;

    /* JADX INFO: renamed from: c */
    public final String f29952c;

    /* JADX INFO: renamed from: d */
    public final Headers2 f29953d;

    /* JADX INFO: renamed from: e */
    public final RequestBody f29954e;

    /* JADX INFO: renamed from: f */
    public final Map<Class<?>, Object> f29955f;

    public Request3(HttpUrl httpUrl, String str, Headers2 headers2, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        Intrinsics2.m13090f(httpUrl, "url");
        Intrinsics2.m13090f(str, "method");
        Intrinsics2.m13090f(headers2, "headers");
        Intrinsics2.m13090f(map, "tags");
        this.f29951b = httpUrl;
        this.f29952c = str;
        this.f29953d = headers2;
        this.f29954e = requestBody;
        this.f29955f = map;
    }

    /* JADX INFO: renamed from: a */
    public final CacheControl m13311a() {
        CacheControl cacheControl = this.f29950a;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControlM13324b = CacheControl.f29961a.m13324b(this.f29953d);
        this.f29950a = cacheControlM13324b;
        return cacheControlM13324b;
    }

    /* JADX INFO: renamed from: b */
    public final String m13312b(String str) {
        Intrinsics2.m13090f(str, "name");
        return this.f29953d.m13649c(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Request{method=");
        sbM1556G.append(this.f29952c);
        sbM1556G.append(", url=");
        sbM1556G.append(this.f29951b);
        if (this.f29953d.size() != 0) {
            sbM1556G.append(", headers=[");
            int i = 0;
            for (Tuples<? extends String, ? extends String> tuples : this.f29953d) {
                int i2 = i + 1;
                if (i < 0) {
                    Collections2.m13041f();
                    throw null;
                }
                Tuples<? extends String, ? extends String> tuples2 = tuples;
                String str = (String) tuples2.f29491f;
                String str2 = (String) tuples2.f29492g;
                if (i > 0) {
                    sbM1556G.append(", ");
                }
                sbM1556G.append(str);
                sbM1556G.append(':');
                sbM1556G.append(str2);
                i = i2;
            }
            sbM1556G.append(']');
        }
        if (!this.f29955f.isEmpty()) {
            sbM1556G.append(", tags=");
            sbM1556G.append(this.f29955f);
        }
        sbM1556G.append('}');
        String string = sbM1556G.toString();
        Intrinsics2.m13086b(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: g1.c0$a */
    /* JADX INFO: compiled from: Request.kt */
    public static class a {

        /* JADX INFO: renamed from: a */
        public HttpUrl f29956a;

        /* JADX INFO: renamed from: b */
        public String f29957b;

        /* JADX INFO: renamed from: c */
        public Headers2.a f29958c;

        /* JADX INFO: renamed from: d */
        public RequestBody f29959d;

        /* JADX INFO: renamed from: e */
        public Map<Class<?>, Object> f29960e;

        public a() {
            this.f29960e = new LinkedHashMap();
            this.f29957b = "GET";
            this.f29958c = new Headers2.a();
        }

        /* JADX INFO: renamed from: a */
        public a m13313a(String str, String str2) {
            Intrinsics2.m13090f(str, "name");
            Intrinsics2.m13090f(str2, "value");
            this.f29958c.m13655a(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public Request3 m13314b() {
            Map mapUnmodifiableMap;
            HttpUrl httpUrl = this.f29956a;
            if (httpUrl == null) {
                throw new IllegalStateException("url == null".toString());
            }
            String str = this.f29957b;
            Headers2 headers2M13658d = this.f29958c.m13658d();
            RequestBody requestBody = this.f29959d;
            Map<Class<?>, Object> map = this.f29960e;
            byte[] bArr = Util9.f30070a;
            Intrinsics2.m13090f(map, "$this$toImmutableMap");
            if (map.isEmpty()) {
                mapUnmodifiableMap = Maps7.f29520f;
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
                Intrinsics2.m13086b(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
            }
            return new Request3(httpUrl, str, headers2M13658d, requestBody, mapUnmodifiableMap);
        }

        /* JADX INFO: renamed from: c */
        public a m13315c(CacheControl cacheControl) {
            Intrinsics2.m13090f(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            if (string.length() == 0) {
                m13319g("Cache-Control");
            } else {
                m13316d("Cache-Control", string);
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m13316d(String str, String str2) {
            Intrinsics2.m13090f(str, "name");
            Intrinsics2.m13090f(str2, "value");
            Headers2.a aVar = this.f29958c;
            Objects.requireNonNull(aVar);
            Intrinsics2.m13090f(str, "name");
            Intrinsics2.m13090f(str2, "value");
            Headers2.b bVar = Headers2.f30638f;
            bVar.m13661a(str);
            bVar.m13662b(str2, str);
            aVar.m13660f(str);
            aVar.m13657c(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m13317e(Headers2 headers2) {
            Intrinsics2.m13090f(headers2, "headers");
            this.f29958c = headers2.m13651h();
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m13318f(String str, RequestBody requestBody) {
            Intrinsics2.m13090f(str, "method");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (requestBody == null) {
                Intrinsics2.m13090f(str, "method");
                if (!(!(Intrinsics2.m13085a(str, "POST") || Intrinsics2.m13085a(str, "PUT") || Intrinsics2.m13085a(str, "PATCH") || Intrinsics2.m13085a(str, "PROPPATCH") || Intrinsics2.m13085a(str, "REPORT")))) {
                    throw new IllegalArgumentException(outline.m1600v("method ", str, " must have a request body.").toString());
                }
            } else if (!HttpMethod3.m13490a(str)) {
                throw new IllegalArgumentException(outline.m1600v("method ", str, " must not have a request body.").toString());
            }
            this.f29957b = str;
            this.f29959d = requestBody;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m13319g(String str) {
            Intrinsics2.m13090f(str, "name");
            this.f29958c.m13660f(str);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public <T> a m13320h(Class<? super T> cls, T t) {
            Intrinsics2.m13090f(cls, "type");
            if (t == null) {
                this.f29960e.remove(cls);
            } else {
                if (this.f29960e.isEmpty()) {
                    this.f29960e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f29960e;
                T tCast = cls.cast(t);
                if (tCast == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                map.put(cls, tCast);
            }
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m13321i(HttpUrl httpUrl) {
            Intrinsics2.m13090f(httpUrl, "url");
            this.f29956a = httpUrl;
            return this;
        }

        public a(Request3 request3) {
            LinkedHashMap linkedHashMap;
            Intrinsics2.m13090f(request3, "request");
            this.f29960e = new LinkedHashMap();
            this.f29956a = request3.f29951b;
            this.f29957b = request3.f29952c;
            this.f29959d = request3.f29954e;
            if (request3.f29955f.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                Map<Class<?>, Object> map = request3.f29955f;
                Intrinsics2.m13089e(map, "$this$toMutableMap");
                linkedHashMap = new LinkedHashMap(map);
            }
            this.f29960e = linkedHashMap;
            this.f29958c = request3.f29953d.m13651h();
        }
    }
}
