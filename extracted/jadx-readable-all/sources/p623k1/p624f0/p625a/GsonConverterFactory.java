package p623k1.p624f0.p625a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.p436f0.TypeToken;
import p509g1.RequestBody;
import p509g1.ResponseBody;
import p623k1.Converter;
import p623k1.Retrofit;

/* JADX INFO: renamed from: k1.f0.a.a, reason: use source file name */
/* JADX INFO: compiled from: GsonConverterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class GsonConverterFactory extends Converter.a {

    /* JADX INFO: renamed from: a */
    public final Gson6 f33144a;

    public GsonConverterFactory(Gson6 gson6) {
        this.f33144a = gson6;
    }

    @Override // p623k1.Converter.a
    /* JADX INFO: renamed from: a */
    public Converter<?, RequestBody> mo14271a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.f33144a, this.f33144a.m12316c(new TypeToken(type)));
    }

    @Override // p623k1.Converter.a
    /* JADX INFO: renamed from: b */
    public Converter<ResponseBody, ?> mo14272b(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.f33144a, this.f33144a.m12316c(new TypeToken(type)));
    }
}
