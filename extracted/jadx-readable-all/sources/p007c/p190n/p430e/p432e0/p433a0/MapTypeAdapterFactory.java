package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.JsonArray;
import p007c.p190n.p430e.JsonElement;
import p007c.p190n.p430e.JsonIOException;
import p007c.p190n.p430e.JsonNull;
import p007c.p190n.p430e.JsonObject;
import p007c.p190n.p430e.JsonPrimitive;
import p007c.p190n.p430e.JsonSyntaxException;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p432e0.C$Gson$Types;
import p007c.p190n.p430e.p432e0.C5611g;
import p007c.p190n.p430e.p432e0.JsonReaderInternalAccess;
import p007c.p190n.p430e.p432e0.ObjectConstructor;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.g, reason: use source file name */
/* JADX INFO: compiled from: MapTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class MapTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: f */
    public final C5611g f27350f;

    /* JADX INFO: renamed from: g */
    public final boolean f27351g;

    /* JADX INFO: renamed from: c.n.e.e0.a0.g$a */
    /* JADX INFO: compiled from: MapTypeAdapterFactory.java */
    public final class a<K, V> extends TypeAdapter2<Map<K, V>> {

        /* JADX INFO: renamed from: a */
        public final TypeAdapter2<K> f27352a;

        /* JADX INFO: renamed from: b */
        public final TypeAdapter2<V> f27353b;

        /* JADX INFO: renamed from: c */
        public final ObjectConstructor<? extends Map<K, V>> f27354c;

        public a(Gson6 gson6, Type type, TypeAdapter2<K> typeAdapter2, Type type2, TypeAdapter2<V> typeAdapter3, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.f27352a = new TypeAdapterRuntimeTypeWrapper(gson6, typeAdapter2, type);
            this.f27353b = new TypeAdapterRuntimeTypeWrapper(gson6, typeAdapter3, type2);
            this.f27354c = objectConstructor;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public Object mo12212a(JsonReader2 jsonReader2) throws IOException {
            JsonToken jsonTokenMo12234H0 = jsonReader2.mo12234H0();
            if (jsonTokenMo12234H0 == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            Map<K, V> mapMo12272a = this.f27354c.mo12272a();
            if (jsonTokenMo12234H0 == JsonToken.BEGIN_ARRAY) {
                jsonReader2.mo12241a();
                while (jsonReader2.mo12236O()) {
                    jsonReader2.mo12241a();
                    K kMo12212a = this.f27352a.mo12212a(jsonReader2);
                    if (mapMo12272a.put(kMo12212a, this.f27353b.mo12212a(jsonReader2)) != null) {
                        throw new JsonSyntaxException(outline.m1598t("duplicate key: ", kMo12212a));
                    }
                    jsonReader2.mo12247u();
                }
                jsonReader2.mo12247u();
            } else {
                jsonReader2.mo12242c();
                while (jsonReader2.mo12236O()) {
                    JsonReaderInternalAccess.f27484a.mo12280a(jsonReader2);
                    K kMo12212a2 = this.f27352a.mo12212a(jsonReader2);
                    if (mapMo12272a.put(kMo12212a2, this.f27353b.mo12212a(jsonReader2)) != null) {
                        throw new JsonSyntaxException(outline.m1598t("duplicate key: ", kMo12212a2));
                    }
                }
                jsonReader2.mo12231B();
            }
            return mapMo12272a;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, Object obj) throws IOException {
            String strM12329j;
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.mo12254O();
                return;
            }
            if (!MapTypeAdapterFactory.this.f27351g) {
                jsonWriter.mo12256f();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.mo12251D(String.valueOf(entry.getKey()));
                    this.f27353b.mo12213b(jsonWriter, entry.getValue());
                }
                jsonWriter.mo12250B();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                TypeAdapter2<K> typeAdapter2 = this.f27352a;
                K key = entry2.getKey();
                Objects.requireNonNull(typeAdapter2);
                try {
                    JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
                    typeAdapter2.mo12213b(jsonTreeWriter, key);
                    if (!jsonTreeWriter.f27347s.isEmpty()) {
                        throw new IllegalStateException("Expected one JSON element but was " + jsonTreeWriter.f27347s);
                    }
                    JsonElement jsonElement = jsonTreeWriter.f27349u;
                    arrayList.add(jsonElement);
                    arrayList2.add(entry2.getValue());
                    Objects.requireNonNull(jsonElement);
                    z |= (jsonElement instanceof JsonArray) || (jsonElement instanceof JsonObject);
                } catch (IOException e) {
                    throw new JsonIOException(e);
                }
            }
            if (z) {
                jsonWriter.mo12255c();
                int size = arrayList.size();
                while (i < size) {
                    jsonWriter.mo12255c();
                    TypeAdapters.f27411X.mo12213b(jsonWriter, (JsonElement) arrayList.get(i));
                    this.f27353b.mo12213b(jsonWriter, (V) arrayList2.get(i));
                    jsonWriter.mo12259u();
                    i++;
                }
                jsonWriter.mo12259u();
                return;
            }
            jsonWriter.mo12256f();
            int size2 = arrayList.size();
            while (i < size2) {
                JsonElement jsonElement2 = (JsonElement) arrayList.get(i);
                Objects.requireNonNull(jsonElement2);
                if (jsonElement2 instanceof JsonPrimitive) {
                    JsonPrimitive jsonPrimitiveM12325c = jsonElement2.m12325c();
                    Object obj2 = jsonPrimitiveM12325c.f27583a;
                    if (obj2 instanceof Number) {
                        strM12329j = String.valueOf(jsonPrimitiveM12325c.m12328h());
                    } else if (obj2 instanceof Boolean) {
                        strM12329j = Boolean.toString(jsonPrimitiveM12325c.m12327f());
                    } else {
                        if (!(obj2 instanceof String)) {
                            throw new AssertionError();
                        }
                        strM12329j = jsonPrimitiveM12325c.m12329j();
                    }
                } else {
                    if (!(jsonElement2 instanceof JsonNull)) {
                        throw new AssertionError();
                    }
                    strM12329j = "null";
                }
                jsonWriter.mo12251D(strM12329j);
                this.f27353b.mo12213b(jsonWriter, (V) arrayList2.get(i));
                i++;
            }
            jsonWriter.mo12250B();
        }
    }

    public MapTypeAdapterFactory(C5611g c5611g, boolean z) {
        this.f27350f = c5611g;
        this.f27351g = z;
    }

    @Override // p007c.p190n.p430e.TypeAdapterFactory
    /* JADX INFO: renamed from: a */
    public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.f27514b;
        if (!Map.class.isAssignableFrom(typeToken.f27513a)) {
            return null;
        }
        Class<?> clsM12224e = C$Gson$Types.m12224e(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type typeM12225f = C$Gson$Types.m12225f(type, clsM12224e, Map.class);
            actualTypeArguments = typeM12225f instanceof ParameterizedType ? ((ParameterizedType) typeM12225f).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new a(gson6, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.f27419f : gson6.m12316c(new TypeToken<>(type2)), actualTypeArguments[1], gson6.m12316c(new TypeToken<>(actualTypeArguments[1])), this.f27350f.m12274a(typeToken));
    }
}
