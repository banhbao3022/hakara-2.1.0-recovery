package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p432e0.LinkedTreeMap;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.h, reason: use source file name */
/* JADX INFO: compiled from: ObjectTypeAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectTypeAdapter extends TypeAdapter2<Object> {

    /* JADX INFO: renamed from: a */
    public static final TypeAdapterFactory f27356a = new a();

    /* JADX INFO: renamed from: b */
    public final Gson6 f27357b;

    /* JADX INFO: renamed from: c.n.e.e0.a0.h$a */
    /* JADX INFO: compiled from: ObjectTypeAdapter.java */
    public class a implements TypeAdapterFactory {
        @Override // p007c.p190n.p430e.TypeAdapterFactory
        /* JADX INFO: renamed from: a */
        public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
            if (typeToken.f27513a == Object.class) {
                return new ObjectTypeAdapter(gson6);
            }
            return null;
        }
    }

    public ObjectTypeAdapter(Gson6 gson6) {
        this.f27357b = gson6;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    public Object mo12212a(JsonReader2 jsonReader2) throws IOException {
        int iOrdinal = jsonReader2.mo12234H0().ordinal();
        if (iOrdinal == 0) {
            ArrayList arrayList = new ArrayList();
            jsonReader2.mo12241a();
            while (jsonReader2.mo12236O()) {
                arrayList.add(mo12212a(jsonReader2));
            }
            jsonReader2.mo12247u();
            return arrayList;
        }
        if (iOrdinal == 2) {
            LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
            jsonReader2.mo12242c();
            while (jsonReader2.mo12236O()) {
                linkedTreeMap.put(jsonReader2.mo12248u0(), mo12212a(jsonReader2));
            }
            jsonReader2.mo12231B();
            return linkedTreeMap;
        }
        if (iOrdinal == 5) {
            return jsonReader2.mo12232F0();
        }
        if (iOrdinal == 6) {
            return Double.valueOf(jsonReader2.mo12244g0());
        }
        if (iOrdinal == 7) {
            return Boolean.valueOf(jsonReader2.mo12243f0());
        }
        if (iOrdinal != 8) {
            throw new IllegalStateException();
        }
        jsonReader2.mo12249z0();
        return null;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: b */
    public void mo12213b(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.mo12254O();
            return;
        }
        Gson6 gson6 = this.f27357b;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(gson6);
        TypeAdapter2 typeAdapter2M12316c = gson6.m12316c(new TypeToken(cls));
        if (!(typeAdapter2M12316c instanceof ObjectTypeAdapter)) {
            typeAdapter2M12316c.mo12213b(jsonWriter, obj);
        } else {
            jsonWriter.mo12256f();
            jsonWriter.mo12250B();
        }
    }
}
