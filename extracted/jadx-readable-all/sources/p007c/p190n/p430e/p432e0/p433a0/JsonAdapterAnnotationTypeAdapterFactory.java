package p007c.p190n.p430e.p432e0.p433a0;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.JsonDeserializer;
import p007c.p190n.p430e.JsonSerializer;
import p007c.p190n.p430e.TypeAdapter;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p431d0.JsonAdapter;
import p007c.p190n.p430e.p432e0.C5611g;
import p007c.p190n.p430e.p436f0.TypeToken;

/* JADX INFO: renamed from: c.n.e.e0.a0.d, reason: use source file name */
/* JADX INFO: compiled from: JsonAdapterAnnotationTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: f */
    public final C5611g f27338f;

    public JsonAdapterAnnotationTypeAdapterFactory(C5611g c5611g) {
        this.f27338f = c5611g;
    }

    @Override // p007c.p190n.p430e.TypeAdapterFactory
    /* JADX INFO: renamed from: a */
    public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.f27513a.getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return (TypeAdapter2<T>) m12229b(this.f27338f, gson6, typeToken, jsonAdapter);
    }

    /* JADX INFO: renamed from: b */
    public TypeAdapter2<?> m12229b(C5611g c5611g, Gson6 gson6, TypeToken<?> typeToken, JsonAdapter jsonAdapter) {
        TypeAdapter2<?> treeTypeAdapter;
        Object objMo12272a = c5611g.m12274a(new TypeToken(jsonAdapter.value())).mo12272a();
        if (objMo12272a instanceof TypeAdapter2) {
            treeTypeAdapter = (TypeAdapter2) objMo12272a;
        } else if (objMo12272a instanceof TypeAdapterFactory) {
            treeTypeAdapter = ((TypeAdapterFactory) objMo12272a).mo12216a(gson6, typeToken);
        } else {
            boolean z = objMo12272a instanceof JsonSerializer;
            if (!z && !(objMo12272a instanceof JsonDeserializer)) {
                StringBuilder sbM1556G = outline.m1556G("Invalid attempt to bind an instance of ");
                sbM1556G.append(objMo12272a.getClass().getName());
                sbM1556G.append(" as a @JsonAdapter for ");
                sbM1556G.append(typeToken.toString());
                sbM1556G.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(sbM1556G.toString());
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z ? (JsonSerializer) objMo12272a : null, objMo12272a instanceof JsonDeserializer ? (JsonDeserializer) objMo12272a : null, gson6, typeToken, null);
        }
        return (treeTypeAdapter == null || !jsonAdapter.nullSafe()) ? treeTypeAdapter : new TypeAdapter(treeTypeAdapter);
    }
}
