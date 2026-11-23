package p623k1;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p509g1.RequestBody;
import p509g1.ResponseBody;

/* JADX INFO: renamed from: k1.h, reason: use source file name */
/* JADX INFO: compiled from: Converter.java */
/* JADX INFO: loaded from: classes2.dex */
public interface Converter<F, T> {

    /* JADX INFO: renamed from: k1.h$a */
    /* JADX INFO: compiled from: Converter.java */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public Converter<?, RequestBody> mo14271a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
            return null;
        }

        /* JADX INFO: renamed from: b */
        public Converter<ResponseBody, ?> mo14272b(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    T mo14273a(F f) throws IOException;
}
