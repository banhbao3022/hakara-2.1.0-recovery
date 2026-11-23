package p623k1;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Headers2;
import p509g1.MultipartBody;
import p509g1.RequestBody;
import p524h1.Buffer3;

/* JADX INFO: renamed from: k1.u, reason: use source file name */
/* JADX INFO: compiled from: ParameterHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ParameterHandler3<T> {

    /* JADX INFO: renamed from: k1.u$a */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class a<T> extends ParameterHandler3<T> {

        /* JADX INFO: renamed from: a */
        public final Method f33198a;

        /* JADX INFO: renamed from: b */
        public final int f33199b;

        /* JADX INFO: renamed from: c */
        public final Converter<T, RequestBody> f33200c;

        public a(Method method, int i, Converter<T, RequestBody> converter) {
            this.f33198a = method;
            this.f33199b = i;
            this.f33200c = converter;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, T t) {
            if (t == null) {
                throw Utils8.m14292l(this.f33198a, this.f33199b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                requestBuilder2.f33253m = this.f33200c.mo14273a(t);
            } catch (IOException e) {
                throw Utils8.m14293m(this.f33198a, e, this.f33199b, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: k1.u$b */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class b<T> extends ParameterHandler3<T> {

        /* JADX INFO: renamed from: a */
        public final String f33201a;

        /* JADX INFO: renamed from: b */
        public final Converter<T, String> f33202b;

        /* JADX INFO: renamed from: c */
        public final boolean f33203c;

        public b(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f33201a = str;
            this.f33202b = converter;
            this.f33203c = z;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, T t) throws IOException {
            String strMo14273a;
            if (t == null || (strMo14273a = this.f33202b.mo14273a(t)) == null) {
                return;
            }
            requestBuilder2.m14308a(this.f33201a, strMo14273a, this.f33203c);
        }
    }

    /* JADX INFO: renamed from: k1.u$c */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class c<T> extends ParameterHandler3<Map<String, T>> {

        /* JADX INFO: renamed from: a */
        public final Method f33204a;

        /* JADX INFO: renamed from: b */
        public final int f33205b;

        /* JADX INFO: renamed from: c */
        public final boolean f33206c;

        public c(Method method, int i, Converter<T, String> converter, boolean z) {
            this.f33204a = method;
            this.f33205b = i;
            this.f33206c = z;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw Utils8.m14292l(this.f33204a, this.f33205b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Utils8.m14292l(this.f33204a, this.f33205b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Utils8.m14292l(this.f33204a, this.f33205b, outline.m1600v("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw Utils8.m14292l(this.f33204a, this.f33205b, "Field map value '" + value + "' converted to null by " + BuiltInConverters.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                requestBuilder2.m14308a(str, string, this.f33206c);
            }
        }
    }

    /* JADX INFO: renamed from: k1.u$d */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class d<T> extends ParameterHandler3<T> {

        /* JADX INFO: renamed from: a */
        public final String f33207a;

        /* JADX INFO: renamed from: b */
        public final Converter<T, String> f33208b;

        public d(String str, Converter<T, String> converter) {
            Objects.requireNonNull(str, "name == null");
            this.f33207a = str;
            this.f33208b = converter;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, T t) throws IOException {
            String strMo14273a;
            if (t == null || (strMo14273a = this.f33208b.mo14273a(t)) == null) {
                return;
            }
            requestBuilder2.m14309b(this.f33207a, strMo14273a);
        }
    }

    /* JADX INFO: renamed from: k1.u$e */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class e<T> extends ParameterHandler3<Map<String, T>> {

        /* JADX INFO: renamed from: a */
        public final Method f33209a;

        /* JADX INFO: renamed from: b */
        public final int f33210b;

        public e(Method method, int i, Converter<T, String> converter) {
            this.f33209a = method;
            this.f33210b = i;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw Utils8.m14292l(this.f33209a, this.f33210b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Utils8.m14292l(this.f33209a, this.f33210b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Utils8.m14292l(this.f33209a, this.f33210b, outline.m1600v("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                requestBuilder2.m14309b(str, value.toString());
            }
        }
    }

    /* JADX INFO: renamed from: k1.u$f */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class f extends ParameterHandler3<Headers2> {

        /* JADX INFO: renamed from: a */
        public final Method f33211a;

        /* JADX INFO: renamed from: b */
        public final int f33212b;

        public f(Method method, int i) {
            this.f33211a = method;
            this.f33212b = i;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, Headers2 headers2) throws IOException {
            Headers2 headers3 = headers2;
            if (headers3 == null) {
                throw Utils8.m14292l(this.f33211a, this.f33212b, "Headers parameter must not be null.", new Object[0]);
            }
            Headers2.a aVar = requestBuilder2.f33248h;
            Objects.requireNonNull(aVar);
            Intrinsics2.m13090f(headers3, "headers");
            int size = headers3.size();
            for (int i = 0; i < size; i++) {
                aVar.m13657c(headers3.m13650f(i), headers3.m13653m(i));
            }
        }
    }

    /* JADX INFO: renamed from: k1.u$g */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class g<T> extends ParameterHandler3<T> {

        /* JADX INFO: renamed from: a */
        public final Method f33213a;

        /* JADX INFO: renamed from: b */
        public final int f33214b;

        /* JADX INFO: renamed from: c */
        public final Headers2 f33215c;

        /* JADX INFO: renamed from: d */
        public final Converter<T, RequestBody> f33216d;

        public g(Method method, int i, Headers2 headers2, Converter<T, RequestBody> converter) {
            this.f33213a = method;
            this.f33214b = i;
            this.f33215c = headers2;
            this.f33216d = converter;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, T t) {
            if (t == null) {
                return;
            }
            try {
                RequestBody requestBodyMo14273a = this.f33216d.mo14273a(t);
                Headers2 headers2 = this.f33215c;
                MultipartBody.a aVar = requestBuilder2.f33251k;
                Objects.requireNonNull(aVar);
                Intrinsics2.m13090f(requestBodyMo14273a, "body");
                aVar.m13690a(MultipartBody.c.f30682a.m13694a(headers2, requestBodyMo14273a));
            } catch (IOException e) {
                throw Utils8.m14292l(this.f33213a, this.f33214b, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* JADX INFO: renamed from: k1.u$h */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class h<T> extends ParameterHandler3<Map<String, T>> {

        /* JADX INFO: renamed from: a */
        public final Method f33217a;

        /* JADX INFO: renamed from: b */
        public final int f33218b;

        /* JADX INFO: renamed from: c */
        public final Converter<T, RequestBody> f33219c;

        /* JADX INFO: renamed from: d */
        public final String f33220d;

        public h(Method method, int i, Converter<T, RequestBody> converter, String str) {
            this.f33217a = method;
            this.f33218b = i;
            this.f33219c = converter;
            this.f33220d = str;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw Utils8.m14292l(this.f33217a, this.f33218b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Utils8.m14292l(this.f33217a, this.f33218b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Utils8.m14292l(this.f33217a, this.f33218b, outline.m1600v("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                Headers2 headers2M13663c = Headers2.f30638f.m13663c("Content-Disposition", outline.m1600v("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f33220d);
                RequestBody requestBodyMo14273a = this.f33219c.mo14273a((T) value);
                MultipartBody.a aVar = requestBuilder2.f33251k;
                Objects.requireNonNull(aVar);
                Intrinsics2.m13090f(requestBodyMo14273a, "body");
                aVar.m13690a(MultipartBody.c.f30682a.m13694a(headers2M13663c, requestBodyMo14273a));
            }
        }
    }

    /* JADX INFO: renamed from: k1.u$i */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class i<T> extends ParameterHandler3<T> {

        /* JADX INFO: renamed from: a */
        public final Method f33221a;

        /* JADX INFO: renamed from: b */
        public final int f33222b;

        /* JADX INFO: renamed from: c */
        public final String f33223c;

        /* JADX INFO: renamed from: d */
        public final Converter<T, String> f33224d;

        /* JADX INFO: renamed from: e */
        public final boolean f33225e;

        public i(Method method, int i, String str, Converter<T, String> converter, boolean z) {
            this.f33221a = method;
            this.f33222b = i;
            Objects.requireNonNull(str, "name == null");
            this.f33223c = str;
            this.f33224d = converter;
            this.f33225e = z;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, T t) throws IOException {
            String strM13755u0;
            if (t == null) {
                throw Utils8.m14292l(this.f33221a, this.f33222b, outline.m1550A(outline.m1556G("Path parameter \""), this.f33223c, "\" value must not be null."), new Object[0]);
            }
            String str = this.f33223c;
            String strMo14273a = this.f33224d.mo14273a(t);
            boolean z = this.f33225e;
            if (requestBuilder2.f33245e == null) {
                throw new AssertionError();
            }
            int length = strMo14273a.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    strM13755u0 = strMo14273a;
                    break;
                }
                int iCodePointAt = strMo14273a.codePointAt(iCharCount);
                int i = 47;
                int i2 = -1;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    Buffer3 buffer3 = new Buffer3();
                    buffer3.m13730Q0(strMo14273a, 0, iCharCount);
                    Buffer3 buffer4 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = strMo14273a.codePointAt(iCharCount);
                        if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                                if (buffer4 == null) {
                                    buffer4 = new Buffer3();
                                }
                                buffer4.m13732R0(iCodePointAt2);
                                while (!buffer4.mo13759y()) {
                                    int i3 = buffer4.readByte() & 255;
                                    buffer3.m13721J0(37);
                                    char[] cArr = RequestBuilder2.f33241a;
                                    buffer3.m13721J0(cArr[(i3 >> 4) & 15]);
                                    buffer3.m13721J0(cArr[i3 & 15]);
                                }
                            } else {
                                buffer3.m13732R0(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i = 47;
                        i2 = -1;
                    }
                    strM13755u0 = buffer3.m13755u0();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strReplace = requestBuilder2.f33245e.replace("{" + str + "}", strM13755u0);
            if (RequestBuilder2.f33242b.matcher(strReplace).matches()) {
                throw new IllegalArgumentException(outline.m1599u("@Path parameters shouldn't perform path traversal ('.' or '..'): ", strMo14273a));
            }
            requestBuilder2.f33245e = strReplace;
        }
    }

    /* JADX INFO: renamed from: k1.u$j */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class j<T> extends ParameterHandler3<T> {

        /* JADX INFO: renamed from: a */
        public final String f33226a;

        /* JADX INFO: renamed from: b */
        public final Converter<T, String> f33227b;

        /* JADX INFO: renamed from: c */
        public final boolean f33228c;

        public j(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f33226a = str;
            this.f33227b = converter;
            this.f33228c = z;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, T t) throws IOException {
            String strMo14273a;
            if (t == null || (strMo14273a = this.f33227b.mo14273a(t)) == null) {
                return;
            }
            requestBuilder2.m14310c(this.f33226a, strMo14273a, this.f33228c);
        }
    }

    /* JADX INFO: renamed from: k1.u$k */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class k<T> extends ParameterHandler3<Map<String, T>> {

        /* JADX INFO: renamed from: a */
        public final Method f33229a;

        /* JADX INFO: renamed from: b */
        public final int f33230b;

        /* JADX INFO: renamed from: c */
        public final boolean f33231c;

        public k(Method method, int i, Converter<T, String> converter, boolean z) {
            this.f33229a = method;
            this.f33230b = i;
            this.f33231c = z;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw Utils8.m14292l(this.f33229a, this.f33230b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw Utils8.m14292l(this.f33229a, this.f33230b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw Utils8.m14292l(this.f33229a, this.f33230b, outline.m1600v("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw Utils8.m14292l(this.f33229a, this.f33230b, "Query map value '" + value + "' converted to null by " + BuiltInConverters.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                requestBuilder2.m14310c(str, string, this.f33231c);
            }
        }
    }

    /* JADX INFO: renamed from: k1.u$l */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class l<T> extends ParameterHandler3<T> {

        /* JADX INFO: renamed from: a */
        public final boolean f33232a;

        public l(Converter<T, String> converter, boolean z) {
            this.f33232a = z;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, T t) throws IOException {
            if (t == null) {
                return;
            }
            requestBuilder2.m14310c(t.toString(), null, this.f33232a);
        }
    }

    /* JADX INFO: renamed from: k1.u$m */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class m extends ParameterHandler3<MultipartBody.c> {

        /* JADX INFO: renamed from: a */
        public static final m f33233a = new m();

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, MultipartBody.c cVar) throws IOException {
            MultipartBody.c cVar2 = cVar;
            if (cVar2 != null) {
                requestBuilder2.f33251k.m13690a(cVar2);
            }
        }
    }

    /* JADX INFO: renamed from: k1.u$n */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class n extends ParameterHandler3<Object> {

        /* JADX INFO: renamed from: a */
        public final Method f33234a;

        /* JADX INFO: renamed from: b */
        public final int f33235b;

        public n(Method method, int i) {
            this.f33234a = method;
            this.f33235b = i;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, Object obj) {
            if (obj == null) {
                throw Utils8.m14292l(this.f33234a, this.f33235b, "@Url parameter is null.", new Object[0]);
            }
            Objects.requireNonNull(requestBuilder2);
            requestBuilder2.f33245e = obj.toString();
        }
    }

    /* JADX INFO: renamed from: k1.u$o */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class o<T> extends ParameterHandler3<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f33236a;

        public o(Class<T> cls) {
            this.f33236a = cls;
        }

        @Override // p623k1.ParameterHandler3
        /* JADX INFO: renamed from: a */
        public void mo14305a(RequestBuilder2 requestBuilder2, T t) {
            requestBuilder2.f33247g.m13320h(this.f33236a, t);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo14305a(RequestBuilder2 requestBuilder2, T t) throws IOException;
}
