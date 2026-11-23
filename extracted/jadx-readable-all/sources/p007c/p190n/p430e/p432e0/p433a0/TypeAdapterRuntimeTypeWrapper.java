package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.n, reason: use source file name */
/* JADX INFO: compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter2<T> {

    /* JADX INFO: renamed from: a */
    public final Gson6 f27385a;

    /* JADX INFO: renamed from: b */
    public final TypeAdapter2<T> f27386b;

    /* JADX INFO: renamed from: c */
    public final Type f27387c;

    public TypeAdapterRuntimeTypeWrapper(Gson6 gson6, TypeAdapter2<T> typeAdapter2, Type type) {
        this.f27385a = gson6;
        this.f27386b = typeAdapter2;
        this.f27387c = type;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    public T mo12212a(JsonReader2 jsonReader2) throws IOException {
        return this.f27386b.mo12212a(jsonReader2);
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: b */
    public void mo12213b(JsonWriter jsonWriter, T t) throws IOException {
        TypeAdapter2<T> typeAdapter2M12316c = this.f27386b;
        Type type = this.f27387c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f27387c) {
            typeAdapter2M12316c = this.f27385a.m12316c(new TypeToken<>(type));
            if (typeAdapter2M12316c instanceof ReflectiveTypeAdapterFactory2.a) {
                TypeAdapter2<T> typeAdapter2 = this.f27386b;
                if (!(typeAdapter2 instanceof ReflectiveTypeAdapterFactory2.a)) {
                    typeAdapter2M12316c = typeAdapter2;
                }
            }
        }
        typeAdapter2M12316c.mo12213b(jsonWriter, t);
    }
}
