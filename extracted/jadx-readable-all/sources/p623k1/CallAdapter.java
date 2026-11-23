package p623k1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: k1.e, reason: use source file name */
/* JADX INFO: compiled from: CallAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public interface CallAdapter<R, T> {

    /* JADX INFO: renamed from: k1.e$a */
    /* JADX INFO: compiled from: CallAdapter.java */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract CallAdapter<?, ?> mo14280a(Type type, Annotation[] annotationArr, Retrofit retrofit);
    }

    /* JADX INFO: renamed from: a */
    Type mo14278a();

    /* JADX INFO: renamed from: b */
    T mo14279b(Call2<R> call2);
}
