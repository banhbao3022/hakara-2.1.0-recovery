package p623k1;

import com.facebook.stetho.server.http.HttpHeaders;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p485u.Continuation;
import p509g1.Call;
import p509g1.Headers2;
import p509g1.HttpUrl;
import p509g1.MediaType2;
import p509g1.MultipartBody;
import p509g1.RequestBody;
import p509g1.Response3;
import p509g1.ResponseBody;
import p623k1.p626g0.Body;
import p623k1.p626g0.DELETE;
import p623k1.p626g0.Field;
import p623k1.p626g0.FieldMap;
import p623k1.p626g0.FormUrlEncoded;
import p623k1.p626g0.GET;
import p623k1.p626g0.HEAD;
import p623k1.p626g0.HTTP;
import p623k1.p626g0.Header2;
import p623k1.p626g0.HeaderMap;
import p623k1.p626g0.Headers3;
import p623k1.p626g0.Multipart;
import p623k1.p626g0.OPTIONS;
import p623k1.p626g0.PATCH;
import p623k1.p626g0.POST;
import p623k1.p626g0.PUT;
import p623k1.p626g0.Part;
import p623k1.p626g0.PartMap;
import p623k1.p626g0.Path;
import p623k1.p626g0.Query;
import p623k1.p626g0.QueryMap;
import p623k1.p626g0.QueryName;
import p623k1.p626g0.Tag;
import p623k1.p626g0.Url;

/* JADX INFO: renamed from: k1.b0, reason: use source file name */
/* JADX INFO: compiled from: ServiceMethod.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ServiceMethod<T> {
    /* JADX INFO: renamed from: b */
    public static <T> ServiceMethod<T> m14269b(Retrofit retrofit, Method method) {
        Type genericReturnType;
        boolean z;
        int i;
        int i2;
        ParameterHandler3<?> parameterHandler3;
        int i3;
        int i4;
        int i5;
        int i6;
        ParameterHandler3<?> oVar;
        ParameterHandler3<?> gVar;
        ParameterHandler3<?> parameterHandler2;
        ParameterHandler3<?> cVar;
        ParameterHandler3<?> bVar;
        RequestFactory.a aVar = new RequestFactory.a(retrofit, method);
        for (Annotation annotation : aVar.f33271e) {
            if (annotation instanceof DELETE) {
                aVar.m14312b("DELETE", ((DELETE) annotation).value(), false);
            } else if (annotation instanceof GET) {
                aVar.m14312b("GET", ((GET) annotation).value(), false);
            } else if (annotation instanceof HEAD) {
                aVar.m14312b("HEAD", ((HEAD) annotation).value(), false);
            } else if (annotation instanceof PATCH) {
                aVar.m14312b("PATCH", ((PATCH) annotation).value(), true);
            } else if (annotation instanceof POST) {
                aVar.m14312b("POST", ((POST) annotation).value(), true);
            } else if (annotation instanceof PUT) {
                aVar.m14312b("PUT", ((PUT) annotation).value(), true);
            } else if (annotation instanceof OPTIONS) {
                aVar.m14312b("OPTIONS", ((OPTIONS) annotation).value(), false);
            } else if (annotation instanceof HTTP) {
                HTTP http = (HTTP) annotation;
                aVar.m14312b(http.method(), http.path(), http.hasBody());
            } else if (annotation instanceof Headers3) {
                String[] strArrValue = ((Headers3) annotation).value();
                if (strArrValue.length == 0) {
                    throw Utils8.m14290j(aVar.f33270d, "@Headers annotation is empty.", new Object[0]);
                }
                Headers2.a aVar2 = new Headers2.a();
                for (String str : strArrValue) {
                    int iIndexOf = str.indexOf(58);
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                        throw Utils8.m14290j(aVar.f33270d, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                    }
                    String strSubstring = str.substring(0, iIndexOf);
                    String strTrim = str.substring(iIndexOf + 1).trim();
                    if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strSubstring)) {
                        try {
                            aVar.f33288v = MediaType2.m13685b(strTrim);
                        } catch (IllegalArgumentException e) {
                            throw Utils8.m14291k(aVar.f33270d, e, "Malformed content type: %s", strTrim);
                        }
                    } else {
                        aVar2.m13655a(strSubstring, strTrim);
                    }
                }
                aVar.f33287u = aVar2.m13658d();
            } else if (annotation instanceof Multipart) {
                if (aVar.f33284r) {
                    throw Utils8.m14290j(aVar.f33270d, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar.f33285s = true;
            } else if (!(annotation instanceof FormUrlEncoded)) {
                continue;
            } else {
                if (aVar.f33285s) {
                    throw Utils8.m14290j(aVar.f33270d, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar.f33284r = true;
            }
        }
        if (aVar.f33282p == null) {
            throw Utils8.m14290j(aVar.f33270d, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
        if (!aVar.f33283q) {
            if (aVar.f33285s) {
                throw Utils8.m14290j(aVar.f33270d, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
            if (aVar.f33284r) {
                throw Utils8.m14290j(aVar.f33270d, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
        }
        int length = aVar.f33272f.length;
        aVar.f33290x = new ParameterHandler3[length];
        int i7 = length - 1;
        int i8 = 0;
        while (i8 < length) {
            ParameterHandler3<?>[] parameterHandler3Arr = aVar.f33290x;
            Type type = aVar.f33273g[i8];
            Annotation[] annotationArr = aVar.f33272f[i8];
            boolean z2 = i8 == i7;
            if (annotationArr != null) {
                int length2 = annotationArr.length;
                parameterHandler3 = null;
                int i9 = 0;
                while (i9 < length2) {
                    Annotation annotation2 = annotationArr[i9];
                    int i10 = length;
                    if (annotation2 instanceof Url) {
                        aVar.m14313c(i8, type);
                        if (aVar.f33281o) {
                            throw Utils8.m14292l(aVar.f33270d, i8, "Multiple @Url method annotations found.", new Object[0]);
                        }
                        if (aVar.f33277k) {
                            throw Utils8.m14292l(aVar.f33270d, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        if (aVar.f33278l) {
                            throw Utils8.m14292l(aVar.f33270d, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                        }
                        if (aVar.f33279m) {
                            throw Utils8.m14292l(aVar.f33270d, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                        }
                        if (aVar.f33280n) {
                            throw Utils8.m14292l(aVar.f33270d, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                        }
                        if (aVar.f33286t != null) {
                            throw Utils8.m14292l(aVar.f33270d, i8, "@Url cannot be used with @%s URL", aVar.f33282p);
                        }
                        aVar.f33281o = true;
                        if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                            throw Utils8.m14292l(aVar.f33270d, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                        }
                        oVar = new ParameterHandler3.n(aVar.f33270d, i8);
                        i3 = i7;
                        i4 = i9;
                        i6 = length2;
                    } else {
                        i3 = i7;
                        if (annotation2 instanceof Path) {
                            aVar.m14313c(i8, type);
                            if (aVar.f33278l) {
                                throw Utils8.m14292l(aVar.f33270d, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                            }
                            if (aVar.f33279m) {
                                throw Utils8.m14292l(aVar.f33270d, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                            }
                            if (aVar.f33280n) {
                                throw Utils8.m14292l(aVar.f33270d, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            if (aVar.f33281o) {
                                throw Utils8.m14292l(aVar.f33270d, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                            }
                            if (aVar.f33286t == null) {
                                throw Utils8.m14292l(aVar.f33270d, i8, "@Path can only be used with relative url on @%s", aVar.f33282p);
                            }
                            aVar.f33277k = true;
                            Path path = (Path) annotation2;
                            String strValue = path.value();
                            if (!RequestFactory.a.f33268b.matcher(strValue).matches()) {
                                throw Utils8.m14292l(aVar.f33270d, i8, "@Path parameter name must match %s. Found: %s", RequestFactory.a.f33267a.pattern(), strValue);
                            }
                            if (!aVar.f33289w.contains(strValue)) {
                                throw Utils8.m14292l(aVar.f33270d, i8, "URL \"%s\" does not contain \"{%s}\".", aVar.f33286t, strValue);
                            }
                            aVar.f33269c.m14268e(type, annotationArr);
                            i4 = i9;
                            i5 = length2;
                            gVar = new ParameterHandler3.i<>(aVar.f33270d, i8, strValue, BuiltInConverters.d.f33133a, path.encoded());
                        } else {
                            i4 = i9;
                            i5 = length2;
                            if (annotation2 instanceof Query) {
                                aVar.m14313c(i8, type);
                                Query query = (Query) annotation2;
                                String strValue2 = query.value();
                                boolean zEncoded = query.encoded();
                                Class<?> clsM14286f = Utils8.m14286f(type);
                                aVar.f33278l = true;
                                if (Iterable.class.isAssignableFrom(clsM14286f)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        throw Utils8.m14292l(aVar.f33270d, i8, outline.m1589k(clsM14286f, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                    }
                                    aVar.f33269c.m14268e(Utils8.m14285e(0, (ParameterizedType) type), annotationArr);
                                    gVar = new ParameterHandler<>(new ParameterHandler3.j(strValue2, BuiltInConverters.d.f33133a, zEncoded));
                                } else if (clsM14286f.isArray()) {
                                    aVar.f33269c.m14268e(RequestFactory.a.m14311a(clsM14286f.getComponentType()), annotationArr);
                                    gVar = new ParameterHandler2(new ParameterHandler3.j(strValue2, BuiltInConverters.d.f33133a, zEncoded));
                                } else {
                                    aVar.f33269c.m14268e(type, annotationArr);
                                    bVar = new ParameterHandler3.j<>(strValue2, BuiltInConverters.d.f33133a, zEncoded);
                                    i6 = i5;
                                    oVar = bVar;
                                }
                            } else if (annotation2 instanceof QueryName) {
                                aVar.m14313c(i8, type);
                                boolean zEncoded2 = ((QueryName) annotation2).encoded();
                                Class<?> clsM14286f2 = Utils8.m14286f(type);
                                aVar.f33279m = true;
                                if (Iterable.class.isAssignableFrom(clsM14286f2)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        throw Utils8.m14292l(aVar.f33270d, i8, outline.m1589k(clsM14286f2, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                    }
                                    aVar.f33269c.m14268e(Utils8.m14285e(0, (ParameterizedType) type), annotationArr);
                                    gVar = new ParameterHandler<>(new ParameterHandler3.l(BuiltInConverters.d.f33133a, zEncoded2));
                                } else if (clsM14286f2.isArray()) {
                                    aVar.f33269c.m14268e(RequestFactory.a.m14311a(clsM14286f2.getComponentType()), annotationArr);
                                    gVar = new ParameterHandler2(new ParameterHandler3.l(BuiltInConverters.d.f33133a, zEncoded2));
                                } else {
                                    aVar.f33269c.m14268e(type, annotationArr);
                                    cVar = new ParameterHandler3.l<>(BuiltInConverters.d.f33133a, zEncoded2);
                                    i6 = i5;
                                    oVar = cVar;
                                }
                            } else {
                                if (annotation2 instanceof QueryMap) {
                                    aVar.m14313c(i8, type);
                                    Class<?> clsM14286f3 = Utils8.m14286f(type);
                                    aVar.f33280n = true;
                                    if (!Map.class.isAssignableFrom(clsM14286f3)) {
                                        throw Utils8.m14292l(aVar.f33270d, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                    }
                                    Type typeM14287g = Utils8.m14287g(type, clsM14286f3, Map.class);
                                    if (!(typeM14287g instanceof ParameterizedType)) {
                                        throw Utils8.m14292l(aVar.f33270d, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                    }
                                    ParameterizedType parameterizedType = (ParameterizedType) typeM14287g;
                                    Type typeM14285e = Utils8.m14285e(0, parameterizedType);
                                    if (String.class != typeM14285e) {
                                        throw Utils8.m14292l(aVar.f33270d, i8, outline.m1601w("@QueryMap keys must be of type String: ", typeM14285e), new Object[0]);
                                    }
                                    aVar.f33269c.m14268e(Utils8.m14285e(1, parameterizedType), annotationArr);
                                    cVar = new ParameterHandler3.k<>(aVar.f33270d, i8, BuiltInConverters.d.f33133a, ((QueryMap) annotation2).encoded());
                                } else if (annotation2 instanceof Header2) {
                                    aVar.m14313c(i8, type);
                                    String strValue3 = ((Header2) annotation2).value();
                                    Class<?> clsM14286f4 = Utils8.m14286f(type);
                                    if (Iterable.class.isAssignableFrom(clsM14286f4)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw Utils8.m14292l(aVar.f33270d, i8, outline.m1589k(clsM14286f4, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                        }
                                        aVar.f33269c.m14268e(Utils8.m14285e(0, (ParameterizedType) type), annotationArr);
                                        gVar = new ParameterHandler<>(new ParameterHandler3.d(strValue3, BuiltInConverters.d.f33133a));
                                    } else if (clsM14286f4.isArray()) {
                                        aVar.f33269c.m14268e(RequestFactory.a.m14311a(clsM14286f4.getComponentType()), annotationArr);
                                        gVar = new ParameterHandler2(new ParameterHandler3.d(strValue3, BuiltInConverters.d.f33133a));
                                    } else {
                                        aVar.f33269c.m14268e(type, annotationArr);
                                        cVar = new ParameterHandler3.d<>(strValue3, BuiltInConverters.d.f33133a);
                                    }
                                } else if (annotation2 instanceof HeaderMap) {
                                    if (type == Headers2.class) {
                                        gVar = new ParameterHandler3.f(aVar.f33270d, i8);
                                    } else {
                                        aVar.m14313c(i8, type);
                                        Class<?> clsM14286f5 = Utils8.m14286f(type);
                                        if (!Map.class.isAssignableFrom(clsM14286f5)) {
                                            throw Utils8.m14292l(aVar.f33270d, i8, "@HeaderMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type typeM14287g2 = Utils8.m14287g(type, clsM14286f5, Map.class);
                                        if (!(typeM14287g2 instanceof ParameterizedType)) {
                                            throw Utils8.m14292l(aVar.f33270d, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        ParameterizedType parameterizedType2 = (ParameterizedType) typeM14287g2;
                                        Type typeM14285e2 = Utils8.m14285e(0, parameterizedType2);
                                        if (String.class != typeM14285e2) {
                                            throw Utils8.m14292l(aVar.f33270d, i8, outline.m1601w("@HeaderMap keys must be of type String: ", typeM14285e2), new Object[0]);
                                        }
                                        aVar.f33269c.m14268e(Utils8.m14285e(1, parameterizedType2), annotationArr);
                                        parameterHandler2 = new ParameterHandler3.e<>(aVar.f33270d, i8, BuiltInConverters.d.f33133a);
                                        i6 = i5;
                                        oVar = parameterHandler2;
                                    }
                                } else if (annotation2 instanceof Field) {
                                    aVar.m14313c(i8, type);
                                    if (!aVar.f33284r) {
                                        throw Utils8.m14292l(aVar.f33270d, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                    }
                                    Field field = (Field) annotation2;
                                    String strValue4 = field.value();
                                    boolean zEncoded3 = field.encoded();
                                    aVar.f33274h = true;
                                    Class<?> clsM14286f6 = Utils8.m14286f(type);
                                    if (Iterable.class.isAssignableFrom(clsM14286f6)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw Utils8.m14292l(aVar.f33270d, i8, outline.m1589k(clsM14286f6, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                        }
                                        aVar.f33269c.m14268e(Utils8.m14285e(0, (ParameterizedType) type), annotationArr);
                                        gVar = new ParameterHandler<>(new ParameterHandler3.b(strValue4, BuiltInConverters.d.f33133a, zEncoded3));
                                    } else if (clsM14286f6.isArray()) {
                                        aVar.f33269c.m14268e(RequestFactory.a.m14311a(clsM14286f6.getComponentType()), annotationArr);
                                        gVar = new ParameterHandler2(new ParameterHandler3.b(strValue4, BuiltInConverters.d.f33133a, zEncoded3));
                                    } else {
                                        aVar.f33269c.m14268e(type, annotationArr);
                                        bVar = new ParameterHandler3.b<>(strValue4, BuiltInConverters.d.f33133a, zEncoded3);
                                        i6 = i5;
                                        oVar = bVar;
                                    }
                                } else if (annotation2 instanceof FieldMap) {
                                    aVar.m14313c(i8, type);
                                    if (!aVar.f33284r) {
                                        throw Utils8.m14292l(aVar.f33270d, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                    }
                                    Class<?> clsM14286f7 = Utils8.m14286f(type);
                                    if (!Map.class.isAssignableFrom(clsM14286f7)) {
                                        throw Utils8.m14292l(aVar.f33270d, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                    }
                                    Type typeM14287g3 = Utils8.m14287g(type, clsM14286f7, Map.class);
                                    if (!(typeM14287g3 instanceof ParameterizedType)) {
                                        throw Utils8.m14292l(aVar.f33270d, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                    }
                                    ParameterizedType parameterizedType3 = (ParameterizedType) typeM14287g3;
                                    Type typeM14285e3 = Utils8.m14285e(0, parameterizedType3);
                                    if (String.class != typeM14285e3) {
                                        throw Utils8.m14292l(aVar.f33270d, i8, outline.m1601w("@FieldMap keys must be of type String: ", typeM14285e3), new Object[0]);
                                    }
                                    aVar.f33269c.m14268e(Utils8.m14285e(1, parameterizedType3), annotationArr);
                                    BuiltInConverters.d dVar = BuiltInConverters.d.f33133a;
                                    aVar.f33274h = true;
                                    cVar = new ParameterHandler3.c<>(aVar.f33270d, i8, dVar, ((FieldMap) annotation2).encoded());
                                } else if (annotation2 instanceof Part) {
                                    aVar.m14313c(i8, type);
                                    if (!aVar.f33285s) {
                                        throw Utils8.m14292l(aVar.f33270d, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                    }
                                    Part part = (Part) annotation2;
                                    aVar.f33275i = true;
                                    String strValue5 = part.value();
                                    Class<?> clsM14286f8 = Utils8.m14286f(type);
                                    if (strValue5.isEmpty()) {
                                        if (Iterable.class.isAssignableFrom(clsM14286f8)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw Utils8.m14292l(aVar.f33270d, i8, outline.m1589k(clsM14286f8, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            if (!MultipartBody.c.class.isAssignableFrom(Utils8.m14286f(Utils8.m14285e(0, (ParameterizedType) type)))) {
                                                throw Utils8.m14292l(aVar.f33270d, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                            }
                                            parameterHandler2 = new ParameterHandler<>(ParameterHandler3.m.f33233a);
                                        } else if (clsM14286f8.isArray()) {
                                            if (!MultipartBody.c.class.isAssignableFrom(clsM14286f8.getComponentType())) {
                                                throw Utils8.m14292l(aVar.f33270d, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                            }
                                            parameterHandler2 = new ParameterHandler2(ParameterHandler3.m.f33233a);
                                        } else {
                                            if (!MultipartBody.c.class.isAssignableFrom(clsM14286f8)) {
                                                throw Utils8.m14292l(aVar.f33270d, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                            }
                                            gVar = ParameterHandler3.m.f33233a;
                                        }
                                        i6 = i5;
                                        oVar = parameterHandler2;
                                    } else {
                                        i6 = i5;
                                        Headers2 headers2M13663c = Headers2.f30638f.m13663c("Content-Disposition", outline.m1600v("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", part.encoding());
                                        if (Iterable.class.isAssignableFrom(clsM14286f8)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw Utils8.m14292l(aVar.f33270d, i8, outline.m1589k(clsM14286f8, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            Type typeM14285e4 = Utils8.m14285e(0, (ParameterizedType) type);
                                            if (MultipartBody.c.class.isAssignableFrom(Utils8.m14286f(typeM14285e4))) {
                                                throw Utils8.m14292l(aVar.f33270d, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                            }
                                            oVar = new ParameterHandler<>(new ParameterHandler3.g(aVar.f33270d, i8, headers2M13663c, aVar.f33269c.m14266c(typeM14285e4, annotationArr, aVar.f33271e)));
                                        } else if (clsM14286f8.isArray()) {
                                            Class<?> clsM14311a = RequestFactory.a.m14311a(clsM14286f8.getComponentType());
                                            if (MultipartBody.c.class.isAssignableFrom(clsM14311a)) {
                                                throw Utils8.m14292l(aVar.f33270d, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                            }
                                            oVar = new ParameterHandler2(new ParameterHandler3.g(aVar.f33270d, i8, headers2M13663c, aVar.f33269c.m14266c(clsM14311a, annotationArr, aVar.f33271e)));
                                        } else {
                                            if (MultipartBody.c.class.isAssignableFrom(clsM14286f8)) {
                                                throw Utils8.m14292l(aVar.f33270d, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                            }
                                            gVar = new ParameterHandler3.g<>(aVar.f33270d, i8, headers2M13663c, aVar.f33269c.m14266c(type, annotationArr, aVar.f33271e));
                                            oVar = gVar;
                                        }
                                    }
                                } else {
                                    i6 = i5;
                                    if (annotation2 instanceof PartMap) {
                                        aVar.m14313c(i8, type);
                                        if (!aVar.f33285s) {
                                            throw Utils8.m14292l(aVar.f33270d, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                        }
                                        aVar.f33275i = true;
                                        Class<?> clsM14286f9 = Utils8.m14286f(type);
                                        if (!Map.class.isAssignableFrom(clsM14286f9)) {
                                            throw Utils8.m14292l(aVar.f33270d, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type typeM14287g4 = Utils8.m14287g(type, clsM14286f9, Map.class);
                                        if (!(typeM14287g4 instanceof ParameterizedType)) {
                                            throw Utils8.m14292l(aVar.f33270d, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        ParameterizedType parameterizedType4 = (ParameterizedType) typeM14287g4;
                                        Type typeM14285e5 = Utils8.m14285e(0, parameterizedType4);
                                        if (String.class != typeM14285e5) {
                                            throw Utils8.m14292l(aVar.f33270d, i8, outline.m1601w("@PartMap keys must be of type String: ", typeM14285e5), new Object[0]);
                                        }
                                        Type typeM14285e6 = Utils8.m14285e(1, parameterizedType4);
                                        if (MultipartBody.c.class.isAssignableFrom(Utils8.m14286f(typeM14285e6))) {
                                            throw Utils8.m14292l(aVar.f33270d, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                        }
                                        oVar = new ParameterHandler3.h<>(aVar.f33270d, i8, aVar.f33269c.m14266c(typeM14285e6, annotationArr, aVar.f33271e), ((PartMap) annotation2).encoding());
                                    } else if (annotation2 instanceof Body) {
                                        aVar.m14313c(i8, type);
                                        if (aVar.f33284r || aVar.f33285s) {
                                            throw Utils8.m14292l(aVar.f33270d, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                        }
                                        if (aVar.f33276j) {
                                            throw Utils8.m14292l(aVar.f33270d, i8, "Multiple @Body method annotations found.", new Object[0]);
                                        }
                                        try {
                                            Converter<T, RequestBody> converterM14266c = aVar.f33269c.m14266c(type, annotationArr, aVar.f33271e);
                                            aVar.f33276j = true;
                                            oVar = new ParameterHandler3.a<>(aVar.f33270d, i8, converterM14266c);
                                        } catch (RuntimeException e2) {
                                            throw Utils8.m14293m(aVar.f33270d, e2, i8, "Unable to create @Body converter for %s", type);
                                        }
                                    } else if (annotation2 instanceof Tag) {
                                        aVar.m14313c(i8, type);
                                        Class<?> clsM14286f10 = Utils8.m14286f(type);
                                        for (int i11 = i8 - 1; i11 >= 0; i11--) {
                                            ParameterHandler3<?> parameterHandler4 = aVar.f33290x[i11];
                                            if ((parameterHandler4 instanceof ParameterHandler3.o) && ((ParameterHandler3.o) parameterHandler4).f33236a.equals(clsM14286f10)) {
                                                Method method2 = aVar.f33270d;
                                                StringBuilder sbM1556G = outline.m1556G("@Tag type ");
                                                sbM1556G.append(clsM14286f10.getName());
                                                sbM1556G.append(" is duplicate of parameter #");
                                                sbM1556G.append(i11 + 1);
                                                sbM1556G.append(" and would always overwrite its value.");
                                                throw Utils8.m14292l(method2, i8, sbM1556G.toString(), new Object[0]);
                                            }
                                        }
                                        oVar = new ParameterHandler3.o<>(clsM14286f10);
                                    } else {
                                        oVar = null;
                                    }
                                }
                                i6 = i5;
                                oVar = cVar;
                            }
                        }
                        i6 = i5;
                        oVar = gVar;
                    }
                    if (oVar != null) {
                        if (parameterHandler3 != null) {
                            throw Utils8.m14292l(aVar.f33270d, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        parameterHandler3 = oVar;
                    }
                    i9 = i4 + 1;
                    length = i10;
                    i7 = i3;
                    length2 = i6;
                }
                i = length;
                i2 = i7;
            } else {
                i = length;
                i2 = i7;
                parameterHandler3 = null;
            }
            if (parameterHandler3 == null) {
                if (z2) {
                    try {
                        if (Utils8.m14286f(type) == Continuation.class) {
                            aVar.f33291y = true;
                            parameterHandler3 = null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw Utils8.m14292l(aVar.f33270d, i8, "No Retrofit annotation found.", new Object[0]);
            }
            parameterHandler3Arr[i8] = parameterHandler3;
            i8++;
            length = i;
            i7 = i2;
        }
        if (aVar.f33286t == null && !aVar.f33281o) {
            throw Utils8.m14290j(aVar.f33270d, "Missing either @%s URL or @Url parameter.", aVar.f33282p);
        }
        boolean z3 = aVar.f33284r;
        if (!z3 && !aVar.f33285s && !aVar.f33283q && aVar.f33276j) {
            throw Utils8.m14290j(aVar.f33270d, "Non-body HTTP method cannot contain @Body.", new Object[0]);
        }
        if (z3 && !aVar.f33274h) {
            throw Utils8.m14290j(aVar.f33270d, "Form-encoded method must contain at least one @Field.", new Object[0]);
        }
        if (aVar.f33285s && !aVar.f33275i) {
            throw Utils8.m14290j(aVar.f33270d, "Multipart method must contain at least one @Part.", new Object[0]);
        }
        RequestFactory requestFactory = new RequestFactory(aVar);
        Type genericReturnType2 = method.getGenericReturnType();
        if (Utils8.m14288h(genericReturnType2)) {
            throw Utils8.m14290j(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
        }
        if (genericReturnType2 == Void.TYPE) {
            throw Utils8.m14290j(method, "Service methods cannot return void.", new Object[0]);
        }
        boolean z4 = requestFactory.f33266k;
        Annotation[] annotations = method.getAnnotations();
        if (z4) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeM14285e7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
            if (typeM14285e7 instanceof WildcardType) {
                typeM14285e7 = ((WildcardType) typeM14285e7).getLowerBounds()[0];
            }
            if (Utils8.m14286f(typeM14285e7) == Response4.class && (typeM14285e7 instanceof ParameterizedType)) {
                typeM14285e7 = Utils8.m14285e(0, (ParameterizedType) typeM14285e7);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new Utils8.b(null, Call2.class, typeM14285e7);
            if (!Utils8.m14289i(annotations, SkipCallbackExecutor.class)) {
                Annotation[] annotationArr2 = new Annotation[annotations.length + 1];
                annotationArr2[0] = SkipCallbackExecutorImpl.f33136a;
                System.arraycopy(annotations, 0, annotationArr2, 1, annotations.length);
                annotations = annotationArr2;
            }
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        try {
            CallAdapter<?, ?> callAdapterM14264a = retrofit.m14264a(genericReturnType, annotations);
            Type typeMo14278a = callAdapterM14264a.mo14278a();
            if (typeMo14278a == Response3.class) {
                StringBuilder sbM1556G2 = outline.m1556G("'");
                sbM1556G2.append(Utils8.m14286f(typeMo14278a).getName());
                sbM1556G2.append("' is not a valid response body type. Did you mean ResponseBody?");
                throw Utils8.m14290j(method, sbM1556G2.toString(), new Object[0]);
            }
            if (typeMo14278a == Response4.class) {
                throw Utils8.m14290j(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
            }
            if (requestFactory.f33258c.equals("HEAD") && !Void.class.equals(typeMo14278a)) {
                throw Utils8.m14290j(method, "HEAD method must use Void as response type.", new Object[0]);
            }
            try {
                Converter<ResponseBody, T> converterM14267d = retrofit.m14267d(typeMo14278a, method.getAnnotations());
                Call.a aVar3 = retrofit.f33115b;
                if (z4) {
                    return z ? new HttpServiceMethod.c(requestFactory, aVar3, converterM14267d, callAdapterM14264a) : new HttpServiceMethod.b(requestFactory, aVar3, converterM14267d, callAdapterM14264a, false);
                }
                return new HttpServiceMethod.a(requestFactory, aVar3, converterM14267d, callAdapterM14264a);
            } catch (RuntimeException e3) {
                throw Utils8.m14291k(method, e3, "Unable to create converter for %s", typeMo14278a);
            }
        } catch (RuntimeException e4) {
            throw Utils8.m14291k(method, e4, "Unable to create call adapter for %s", genericReturnType);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo14270a(Object[] objArr);
}
