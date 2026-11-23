package p007c.p190n.p430e;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p007c.p190n.p430e.p432e0.C5611g;
import p007c.p190n.p430e.p432e0.Excluder;
import p007c.p190n.p430e.p432e0.p433a0.ArrayTypeAdapter;
import p007c.p190n.p430e.p432e0.p433a0.CollectionTypeAdapterFactory;
import p007c.p190n.p430e.p432e0.p433a0.DateTypeAdapter;
import p007c.p190n.p430e.p432e0.p433a0.JsonAdapterAnnotationTypeAdapterFactory;
import p007c.p190n.p430e.p432e0.p433a0.MapTypeAdapterFactory;
import p007c.p190n.p430e.p432e0.p433a0.ObjectTypeAdapter;
import p007c.p190n.p430e.p432e0.p433a0.ReflectiveTypeAdapterFactory2;
import p007c.p190n.p430e.p432e0.p433a0.SqlDateTypeAdapter;
import p007c.p190n.p430e.p432e0.p433a0.TimeTypeAdapter;
import p007c.p190n.p430e.p432e0.p433a0.TypeAdapters;
import p007c.p190n.p430e.p432e0.p433a0.TypeAdapters2;
import p007c.p190n.p430e.p432e0.p433a0.TypeAdapters3;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p007c.p190n.p430e.p437g0.JsonWriter;
import p007c.p190n.p430e.p437g0.MalformedJsonException;

/* JADX INFO: renamed from: c.n.e.k, reason: use source file name */
/* JADX INFO: compiled from: Gson.java */
/* JADX INFO: loaded from: classes.dex */
public final class Gson6 {

    /* JADX INFO: renamed from: a */
    public static final TypeToken<?> f27556a = new TypeToken<>(Object.class);

    /* JADX INFO: renamed from: b */
    public final ThreadLocal<Map<TypeToken<?>, a<?>>> f27557b;

    /* JADX INFO: renamed from: c */
    public final Map<TypeToken<?>, TypeAdapter2<?>> f27558c;

    /* JADX INFO: renamed from: d */
    public final C5611g f27559d;

    /* JADX INFO: renamed from: e */
    public final JsonAdapterAnnotationTypeAdapterFactory f27560e;

    /* JADX INFO: renamed from: f */
    public final List<TypeAdapterFactory> f27561f;

    /* JADX INFO: renamed from: g */
    public final Map<Type, InstanceCreator<?>> f27562g;

    /* JADX INFO: renamed from: h */
    public final boolean f27563h;

    /* JADX INFO: renamed from: i */
    public final boolean f27564i;

    /* JADX INFO: renamed from: j */
    public final boolean f27565j;

    /* JADX INFO: renamed from: k */
    public final boolean f27566k;

    /* JADX INFO: renamed from: l */
    public final boolean f27567l;

    /* JADX INFO: renamed from: m */
    public final List<TypeAdapterFactory> f27568m;

    /* JADX INFO: renamed from: n */
    public final List<TypeAdapterFactory> f27569n;

    /* JADX INFO: renamed from: c.n.e.k$a */
    /* JADX INFO: compiled from: Gson.java */
    public static class a<T> extends TypeAdapter2<T> {

        /* JADX INFO: renamed from: a */
        public TypeAdapter2<T> f27570a;

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public T mo12212a(JsonReader2 jsonReader2) throws IOException {
            TypeAdapter2<T> typeAdapter2 = this.f27570a;
            if (typeAdapter2 != null) {
                return typeAdapter2.mo12212a(jsonReader2);
            }
            throw new IllegalStateException();
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, T t) throws IOException {
            TypeAdapter2<T> typeAdapter2 = this.f27570a;
            if (typeAdapter2 == null) {
                throw new IllegalStateException();
            }
            typeAdapter2.mo12213b(jsonWriter, t);
        }
    }

    public Gson6() {
        this(Excluder.f27471f, FieldNamingPolicy.f27316f, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.f27584f, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* JADX INFO: renamed from: a */
    public static void m12314a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX INFO: renamed from: b */
    public <T> T m12315b(String str, Class<T> cls) throws JsonSyntaxException {
        Class cls2;
        T tMo12212a = null;
        if (str != null) {
            JsonReader2 jsonReader2 = new JsonReader2(new StringReader(str));
            boolean z = this.f27567l;
            jsonReader2.f27518h = z;
            boolean z2 = true;
            jsonReader2.f27518h = true;
            try {
                try {
                    try {
                        jsonReader2.mo12234H0();
                        z2 = false;
                        tMo12212a = m12316c(new TypeToken<>(cls)).mo12212a(jsonReader2);
                    } catch (Throwable th) {
                        jsonReader2.f27518h = z;
                        throw th;
                    }
                } catch (IOException e) {
                    throw new JsonSyntaxException(e);
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } catch (EOFException e3) {
                if (!z2) {
                    throw new JsonSyntaxException(e3);
                }
            } catch (IllegalStateException e4) {
                throw new JsonSyntaxException(e4);
            }
            jsonReader2.f27518h = z;
            if (tMo12212a != null) {
                try {
                    if (jsonReader2.mo12234H0() != JsonToken.END_DOCUMENT) {
                        throw new JsonIOException("JSON document was not fully consumed.");
                    }
                } catch (MalformedJsonException e5) {
                    throw new JsonSyntaxException(e5);
                } catch (IOException e6) {
                    throw new JsonIOException(e6);
                }
            }
        }
        if (cls == Integer.TYPE) {
            cls2 = Integer.class;
        } else if (cls == Float.TYPE) {
            cls2 = Float.class;
        } else if (cls == Byte.TYPE) {
            cls2 = Byte.class;
        } else if (cls == Double.TYPE) {
            cls2 = Double.class;
        } else if (cls == Long.TYPE) {
            cls2 = Long.class;
        } else if (cls == Character.TYPE) {
            cls2 = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls2 = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls2 = Short.class;
        } else {
            if (cls == Void.TYPE) {
                cls = (Class<T>) Void.class;
            }
            cls2 = cls;
        }
        return (T) cls2.cast(tMo12212a);
    }

    /* JADX INFO: renamed from: c */
    public <T> TypeAdapter2<T> m12316c(TypeToken<T> typeToken) {
        TypeAdapter2<T> typeAdapter2 = (TypeAdapter2) this.f27558c.get(typeToken);
        if (typeAdapter2 != null) {
            return typeAdapter2;
        }
        Map<TypeToken<?>, a<?>> map = this.f27557b.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f27557b.set(map);
            z = true;
        }
        a<?> aVar = map.get(typeToken);
        if (aVar != null) {
            return aVar;
        }
        try {
            a<?> aVar2 = new a<>();
            map.put(typeToken, aVar2);
            Iterator<TypeAdapterFactory> it = this.f27561f.iterator();
            while (it.hasNext()) {
                TypeAdapter2<T> typeAdapter2Mo12216a = it.next().mo12216a(this, typeToken);
                if (typeAdapter2Mo12216a != null) {
                    if (aVar2.f27570a != null) {
                        throw new AssertionError();
                    }
                    aVar2.f27570a = typeAdapter2Mo12216a;
                    this.f27558c.put(typeToken, typeAdapter2Mo12216a);
                    map.remove(typeToken);
                    if (z) {
                        this.f27557b.remove();
                    }
                    return typeAdapter2Mo12216a;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + typeToken);
        } catch (Throwable th) {
            map.remove(typeToken);
            if (z) {
                this.f27557b.remove();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public <T> TypeAdapter2<T> m12317d(TypeAdapterFactory typeAdapterFactory, TypeToken<T> typeToken) {
        if (!this.f27561f.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.f27560e;
        }
        boolean z = false;
        for (TypeAdapterFactory typeAdapterFactory2 : this.f27561f) {
            if (z) {
                TypeAdapter2<T> typeAdapter2Mo12216a = typeAdapterFactory2.mo12216a(this, typeToken);
                if (typeAdapter2Mo12216a != null) {
                    return typeAdapter2Mo12216a;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    /* JADX INFO: renamed from: e */
    public JsonWriter m12318e(Writer writer) throws IOException {
        if (this.f27564i) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f27566k) {
            jsonWriter.f27548k = "  ";
            jsonWriter.f27549l = ": ";
        }
        jsonWriter.f27553p = this.f27563h;
        return jsonWriter;
    }

    /* JADX INFO: renamed from: f */
    public String m12319f(Object obj) {
        if (obj == null) {
            JsonElement jsonElement = JsonNull.f27581a;
            StringWriter stringWriter = new StringWriter();
            try {
                m12320g(jsonElement, m12318e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        }
        Type type = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            m12321h(obj, type, m12318e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m12320g(JsonElement jsonElement, JsonWriter jsonWriter) throws JsonIOException {
        boolean z = jsonWriter.f27550m;
        jsonWriter.f27550m = true;
        boolean z2 = jsonWriter.f27551n;
        jsonWriter.f27551n = this.f27565j;
        boolean z3 = jsonWriter.f27553p;
        jsonWriter.f27553p = this.f27563h;
        try {
            try {
                TypeAdapters.f27411X.mo12213b(jsonWriter, jsonElement);
                jsonWriter.f27550m = z;
                jsonWriter.f27551n = z2;
                jsonWriter.f27553p = z3;
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } catch (Throwable th) {
            jsonWriter.f27550m = z;
            jsonWriter.f27551n = z2;
            jsonWriter.f27553p = z3;
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m12321h(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        TypeAdapter2 typeAdapter2M12316c = m12316c(new TypeToken(type));
        boolean z = jsonWriter.f27550m;
        jsonWriter.f27550m = true;
        boolean z2 = jsonWriter.f27551n;
        jsonWriter.f27551n = this.f27565j;
        boolean z3 = jsonWriter.f27553p;
        jsonWriter.f27553p = this.f27563h;
        try {
            try {
                typeAdapter2M12316c.mo12213b(jsonWriter, obj);
                jsonWriter.f27550m = z;
                jsonWriter.f27551n = z2;
                jsonWriter.f27553p = z3;
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } catch (Throwable th) {
            jsonWriter.f27550m = z;
            jsonWriter.f27551n = z2;
            jsonWriter.f27553p = z3;
            throw th;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f27563h + ",factories:" + this.f27561f + ",instanceCreators:" + this.f27559d + "}";
    }

    public Gson6(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, InstanceCreator<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy, String str, int i, int i2, List<TypeAdapterFactory> list, List<TypeAdapterFactory> list2, List<TypeAdapterFactory> list3) {
        TypeAdapter2 gson3;
        TypeAdapter2 gson;
        TypeAdapter2 gson2;
        this.f27557b = new ThreadLocal<>();
        this.f27558c = new ConcurrentHashMap();
        this.f27562g = map;
        this.f27559d = new C5611g(map);
        this.f27563h = z;
        this.f27564i = z3;
        this.f27565j = z4;
        this.f27566k = z5;
        this.f27567l = z6;
        this.f27568m = list;
        this.f27569n = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f27412Y);
        arrayList.add(ObjectTypeAdapter.f27356a);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f27391D);
        arrayList.add(TypeAdapters.f27426m);
        arrayList.add(TypeAdapters.f27420g);
        arrayList.add(TypeAdapters.f27422i);
        arrayList.add(TypeAdapters.f27424k);
        if (longSerializationPolicy == LongSerializationPolicy.f27584f) {
            gson3 = TypeAdapters.f27433t;
        } else {
            gson3 = new Gson3();
        }
        arrayList.add(new TypeAdapters3(Long.TYPE, Long.class, gson3));
        Class cls = Double.TYPE;
        if (z7) {
            gson = TypeAdapters.f27435v;
        } else {
            gson = new Gson(this);
        }
        arrayList.add(new TypeAdapters3(cls, Double.class, gson));
        Class cls2 = Float.TYPE;
        if (z7) {
            gson2 = TypeAdapters.f27434u;
        } else {
            gson2 = new Gson2(this);
        }
        arrayList.add(new TypeAdapters3(cls2, Float.class, gson2));
        arrayList.add(TypeAdapters.f27437x);
        arrayList.add(TypeAdapters.f27428o);
        arrayList.add(TypeAdapters.f27430q);
        arrayList.add(new TypeAdapters2(AtomicLong.class, new TypeAdapter(new Gson4(gson3))));
        arrayList.add(new TypeAdapters2(AtomicLongArray.class, new TypeAdapter(new Gson5(gson3))));
        arrayList.add(TypeAdapters.f27432s);
        arrayList.add(TypeAdapters.f27439z);
        arrayList.add(TypeAdapters.f27393F);
        arrayList.add(TypeAdapters.f27395H);
        arrayList.add(new TypeAdapters2(BigDecimal.class, TypeAdapters.f27389B));
        arrayList.add(new TypeAdapters2(BigInteger.class, TypeAdapters.f27390C));
        arrayList.add(TypeAdapters.f27397J);
        arrayList.add(TypeAdapters.f27399L);
        arrayList.add(TypeAdapters.f27403P);
        arrayList.add(TypeAdapters.f27405R);
        arrayList.add(TypeAdapters.f27410W);
        arrayList.add(TypeAdapters.f27401N);
        arrayList.add(TypeAdapters.f27417d);
        arrayList.add(DateTypeAdapter.f27336a);
        arrayList.add(TypeAdapters.f27408U);
        arrayList.add(TimeTypeAdapter.f27376a);
        arrayList.add(SqlDateTypeAdapter.f27374a);
        arrayList.add(TypeAdapters.f27406S);
        arrayList.add(ArrayTypeAdapter.f27330a);
        arrayList.add(TypeAdapters.f27415b);
        arrayList.add(new CollectionTypeAdapterFactory(this.f27559d));
        arrayList.add(new MapTypeAdapterFactory(this.f27559d, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(this.f27559d);
        this.f27560e = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f27413Z);
        arrayList.add(new ReflectiveTypeAdapterFactory2(this.f27559d, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f27561f = Collections.unmodifiableList(arrayList);
    }
}
