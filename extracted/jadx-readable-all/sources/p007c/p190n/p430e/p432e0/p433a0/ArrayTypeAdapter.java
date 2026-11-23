package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p432e0.C$Gson$Types;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.a, reason: use source file name */
/* JADX INFO: compiled from: ArrayTypeAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter2<Object> {

    /* JADX INFO: renamed from: a */
    public static final TypeAdapterFactory f27330a = new a();

    /* JADX INFO: renamed from: b */
    public final Class<E> f27331b;

    /* JADX INFO: renamed from: c */
    public final TypeAdapter2<E> f27332c;

    /* JADX INFO: renamed from: c.n.e.e0.a0.a$a */
    /* JADX INFO: compiled from: ArrayTypeAdapter.java */
    public class a implements TypeAdapterFactory {
        @Override // p007c.p190n.p430e.TypeAdapterFactory
        /* JADX INFO: renamed from: a */
        public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
            Type type = typeToken.f27514b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(gson6, gson6.m12316c(new TypeToken<>(genericComponentType)), C$Gson$Types.m12224e(genericComponentType));
        }
    }

    public ArrayTypeAdapter(Gson6 gson6, TypeAdapter2<E> typeAdapter2, Class<E> cls) {
        this.f27332c = new TypeAdapterRuntimeTypeWrapper(gson6, typeAdapter2, cls);
        this.f27331b = cls;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    public Object mo12212a(JsonReader2 jsonReader2) throws IOException {
        if (jsonReader2.mo12234H0() == JsonToken.NULL) {
            jsonReader2.mo12249z0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader2.mo12241a();
        while (jsonReader2.mo12236O()) {
            arrayList.add(this.f27332c.mo12212a(jsonReader2));
        }
        jsonReader2.mo12247u();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f27331b, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: b */
    public void mo12213b(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.mo12254O();
            return;
        }
        jsonWriter.mo12255c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f27332c.mo12213b(jsonWriter, (E) Array.get(obj, i));
        }
        jsonWriter.mo12259u();
    }
}
