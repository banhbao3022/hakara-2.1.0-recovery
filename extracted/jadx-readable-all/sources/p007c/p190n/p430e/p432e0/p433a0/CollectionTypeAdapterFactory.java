package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p432e0.C$Gson$Types;
import p007c.p190n.p430e.p432e0.C5611g;
import p007c.p190n.p430e.p432e0.ObjectConstructor;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.b, reason: use source file name */
/* JADX INFO: compiled from: CollectionTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: f */
    public final C5611g f27333f;

    /* JADX INFO: renamed from: c.n.e.e0.a0.b$a */
    /* JADX INFO: compiled from: CollectionTypeAdapterFactory.java */
    public static final class a<E> extends TypeAdapter2<Collection<E>> {

        /* JADX INFO: renamed from: a */
        public final TypeAdapter2<E> f27334a;

        /* JADX INFO: renamed from: b */
        public final ObjectConstructor<? extends Collection<E>> f27335b;

        public a(Gson6 gson6, Type type, TypeAdapter2<E> typeAdapter2, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.f27334a = new TypeAdapterRuntimeTypeWrapper(gson6, typeAdapter2, type);
            this.f27335b = objectConstructor;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Object mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            Collection<E> collectionMo12272a = this.f27335b.mo12272a();
            jsonReader2.mo12241a();
            while (jsonReader2.mo12236O()) {
                collectionMo12272a.add(this.f27334a.mo12212a(jsonReader2));
            }
            jsonReader2.mo12247u();
            return collectionMo12272a;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                jsonWriter.mo12254O();
                return;
            }
            jsonWriter.mo12255c();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f27334a.mo12213b(jsonWriter, it.next());
            }
            jsonWriter.mo12259u();
        }
    }

    public CollectionTypeAdapterFactory(C5611g c5611g) {
        this.f27333f = c5611g;
    }

    @Override // p007c.p190n.p430e.TypeAdapterFactory
    /* JADX INFO: renamed from: a */
    public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
        Type type = typeToken.f27514b;
        Class<? super T> cls = typeToken.f27513a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type typeM12225f = C$Gson$Types.m12225f(type, cls, Collection.class);
        if (typeM12225f instanceof WildcardType) {
            typeM12225f = ((WildcardType) typeM12225f).getUpperBounds()[0];
        }
        Type type2 = typeM12225f instanceof ParameterizedType ? ((ParameterizedType) typeM12225f).getActualTypeArguments()[0] : Object.class;
        return new a(gson6, type2, gson6.m12316c(new TypeToken<>(type2)), this.f27333f.m12274a(typeToken));
    }
}
