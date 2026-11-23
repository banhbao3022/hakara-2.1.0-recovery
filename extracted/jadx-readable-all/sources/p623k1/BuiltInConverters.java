package p623k1;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p477d1.Unit;
import p509g1.RequestBody;
import p509g1.ResponseBody;
import p623k1.p626g0.Streaming;

/* JADX INFO: renamed from: k1.c, reason: use source file name */
/* JADX INFO: compiled from: BuiltInConverters.java */
/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInConverters extends Converter.a {

    /* JADX INFO: renamed from: a */
    public boolean f33129a = true;

    /* JADX INFO: renamed from: k1.c$a */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class a implements Converter<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a */
        public static final a f33130a = new a();

        @Override // p623k1.Converter
        /* JADX INFO: renamed from: a */
        public ResponseBody mo14273a(ResponseBody responseBody) throws IOException {
            ResponseBody responseBody2 = responseBody;
            try {
                return Utils8.m14281a(responseBody2);
            } finally {
                responseBody2.close();
            }
        }
    }

    /* JADX INFO: renamed from: k1.c$b */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class b implements Converter<RequestBody, RequestBody> {

        /* JADX INFO: renamed from: a */
        public static final b f33131a = new b();

        @Override // p623k1.Converter
        /* JADX INFO: renamed from: a */
        public RequestBody mo14273a(RequestBody requestBody) throws IOException {
            return requestBody;
        }
    }

    /* JADX INFO: renamed from: k1.c$c */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class c implements Converter<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a */
        public static final c f33132a = new c();

        @Override // p623k1.Converter
        /* JADX INFO: renamed from: a */
        public ResponseBody mo14273a(ResponseBody responseBody) throws IOException {
            return responseBody;
        }
    }

    /* JADX INFO: renamed from: k1.c$d */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class d implements Converter<Object, String> {

        /* JADX INFO: renamed from: a */
        public static final d f33133a = new d();

        @Override // p623k1.Converter
        /* JADX INFO: renamed from: a */
        public String mo14273a(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* JADX INFO: renamed from: k1.c$e */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class e implements Converter<ResponseBody, Unit> {

        /* JADX INFO: renamed from: a */
        public static final e f33134a = new e();

        @Override // p623k1.Converter
        /* JADX INFO: renamed from: a */
        public Unit mo14273a(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: k1.c$f */
    /* JADX INFO: compiled from: BuiltInConverters.java */
    public static final class f implements Converter<ResponseBody, Void> {

        /* JADX INFO: renamed from: a */
        public static final f f33135a = new f();

        @Override // p623k1.Converter
        /* JADX INFO: renamed from: a */
        public Void mo14273a(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return null;
        }
    }

    @Override // p623k1.Converter.a
    /* JADX INFO: renamed from: a */
    public Converter<?, RequestBody> mo14271a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(Utils8.m14286f(type))) {
            return b.f33131a;
        }
        return null;
    }

    @Override // p623k1.Converter.a
    /* JADX INFO: renamed from: b */
    public Converter<ResponseBody, ?> mo14272b(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            return Utils8.m14289i(annotationArr, Streaming.class) ? c.f33132a : a.f33130a;
        }
        if (type == Void.class) {
            return f.f33135a;
        }
        if (!this.f33129a || type != Unit.class) {
            return null;
        }
        try {
            return e.f33134a;
        } catch (NoClassDefFoundError unused) {
            this.f33129a = false;
            return null;
        }
    }
}
