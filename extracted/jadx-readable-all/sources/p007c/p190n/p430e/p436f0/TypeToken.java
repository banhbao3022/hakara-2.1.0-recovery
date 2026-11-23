package p007c.p190n.p430e.p436f0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import p007c.p190n.p430e.p432e0.C$Gson$Types;

/* JADX INFO: renamed from: c.n.e.f0.a, reason: use source file name */
/* JADX INFO: compiled from: TypeToken.java */
/* JADX INFO: loaded from: classes.dex */
public class TypeToken<T> {

    /* JADX INFO: renamed from: a */
    public final Class<? super T> f27513a;

    /* JADX INFO: renamed from: b */
    public final Type f27514b;

    /* JADX INFO: renamed from: c */
    public final int f27515c;

    public TypeToken() {
        Type genericSuperclass = TypeToken.class.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type typeM12220a = C$Gson$Types.m12220a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.f27514b = typeM12220a;
        this.f27513a = (Class<? super T>) C$Gson$Types.m12224e(typeM12220a);
        this.f27515c = typeM12220a.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TypeToken) && C$Gson$Types.m12222c(this.f27514b, ((TypeToken) obj).f27514b);
    }

    public final int hashCode() {
        return this.f27515c;
    }

    public final String toString() {
        return C$Gson$Types.m12228i(this.f27514b);
    }

    public TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type typeM12220a = C$Gson$Types.m12220a(type);
        this.f27514b = typeM12220a;
        this.f27513a = (Class<? super T>) C$Gson$Types.m12224e(typeM12220a);
        this.f27515c = typeM12220a.hashCode();
    }
}
