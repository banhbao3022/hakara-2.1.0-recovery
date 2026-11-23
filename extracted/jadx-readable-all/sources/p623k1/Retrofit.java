package p623k1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p509g1.Call;
import p509g1.HttpUrl;
import p509g1.RequestBody;
import p509g1.ResponseBody;

/* JADX INFO: renamed from: k1.a0, reason: use source file name */
/* JADX INFO: compiled from: Retrofit.java */
/* JADX INFO: loaded from: classes2.dex */
public final class Retrofit {

    /* JADX INFO: renamed from: a */
    public final Map<Method, ServiceMethod<?>> f33114a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final Call.a f33115b;

    /* JADX INFO: renamed from: c */
    public final HttpUrl f33116c;

    /* JADX INFO: renamed from: d */
    public final List<Converter.a> f33117d;

    /* JADX INFO: renamed from: e */
    public final List<CallAdapter.a> f33118e;

    /* JADX INFO: renamed from: f */
    public final Executor f33119f;

    /* JADX INFO: renamed from: g */
    public final boolean f33120g;

    /* JADX INFO: renamed from: k1.a0$a */
    /* JADX INFO: compiled from: Retrofit.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Platform2 f33121a;

        /* JADX INFO: renamed from: b */
        public Call.a f33122b;

        /* JADX INFO: renamed from: c */
        public HttpUrl f33123c;

        /* JADX INFO: renamed from: d */
        public final List<Converter.a> f33124d;

        /* JADX INFO: renamed from: e */
        public final List<CallAdapter.a> f33125e;

        public a() {
            Platform2 platform2 = Platform2.f33237a;
            this.f33124d = new ArrayList();
            this.f33125e = new ArrayList();
            this.f33121a = platform2;
        }
    }

    public Retrofit(Call.a aVar, HttpUrl httpUrl, List<Converter.a> list, List<CallAdapter.a> list2, Executor executor, boolean z) {
        this.f33115b = aVar;
        this.f33116c = httpUrl;
        this.f33117d = list;
        this.f33118e = list2;
        this.f33119f = executor;
        this.f33120g = z;
    }

    /* JADX INFO: renamed from: a */
    public CallAdapter<?, ?> m14264a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f33118e.indexOf(null) + 1;
        int size = this.f33118e.size();
        for (int i = iIndexOf; i < size; i++) {
            CallAdapter<?, ?> callAdapterMo14280a = this.f33118e.get(i).mo14280a(type, annotationArr, this);
            if (callAdapterMo14280a != null) {
                return callAdapterMo14280a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f33118e.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f33118e.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public ServiceMethod<?> m14265b(Method method) {
        ServiceMethod<?> serviceMethodM14269b;
        ServiceMethod<?> serviceMethod = this.f33114a.get(method);
        if (serviceMethod != null) {
            return serviceMethod;
        }
        synchronized (this.f33114a) {
            serviceMethodM14269b = this.f33114a.get(method);
            if (serviceMethodM14269b == null) {
                serviceMethodM14269b = ServiceMethod.m14269b(this, method);
                this.f33114a.put(method, serviceMethodM14269b);
            }
        }
        return serviceMethodM14269b;
    }

    /* JADX INFO: renamed from: c */
    public <T> Converter<T, RequestBody> m14266c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f33117d.indexOf(null) + 1;
        int size = this.f33117d.size();
        for (int i = iIndexOf; i < size; i++) {
            Converter<T, RequestBody> converter = (Converter<T, RequestBody>) this.f33117d.get(i).mo14271a(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f33117d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f33117d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public <T> Converter<ResponseBody, T> m14267d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f33117d.indexOf(null) + 1;
        int size = this.f33117d.size();
        for (int i = iIndexOf; i < size; i++) {
            Converter<ResponseBody, T> converter = (Converter<ResponseBody, T>) this.f33117d.get(i).mo14272b(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f33117d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f33117d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public <T> Converter<T, String> m14268e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f33117d.size();
        for (int i = 0; i < size; i++) {
            Objects.requireNonNull(this.f33117d.get(i));
        }
        return BuiltInConverters.d.f33133a;
    }
}
