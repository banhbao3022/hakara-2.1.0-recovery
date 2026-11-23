package p623k1;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p509g1.ResponseBody;

/* JADX INFO: renamed from: k1.r, reason: use source file name */
/* JADX INFO: compiled from: OptionalConverterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
@IgnoreJRERequirement
public final class OptionalConverterFactory extends Converter.a {

    /* JADX INFO: renamed from: a */
    public static final Converter.a f33194a = new OptionalConverterFactory();

    /* JADX INFO: renamed from: k1.r$a */
    /* JADX INFO: compiled from: OptionalConverterFactory.java */
    @IgnoreJRERequirement
    public static final class a<T> implements Converter<ResponseBody, Optional<T>> {

        /* JADX INFO: renamed from: a */
        public final Converter<ResponseBody, T> f33195a;

        public a(Converter<ResponseBody, T> converter) {
            this.f33195a = converter;
        }

        @Override // p623k1.Converter
        /* JADX INFO: renamed from: a */
        public Object mo14273a(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.f33195a.mo14273a(responseBody));
        }
    }

    @Override // p623k1.Converter.a
    /* JADX INFO: renamed from: b */
    public Converter<ResponseBody, ?> mo14272b(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Utils8.m14286f(type) != Optional.class) {
            return null;
        }
        return new a(retrofit.m14267d(Utils8.m14285e(0, (ParameterizedType) type), annotationArr));
    }
}
