package p007c.p190n.p430e.p432e0.p433a0;

import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.JsonDeserializationContext;
import p007c.p190n.p430e.JsonDeserializer;
import p007c.p190n.p430e.JsonElement;
import p007c.p190n.p430e.JsonIOException;
import p007c.p190n.p430e.JsonNull;
import p007c.p190n.p430e.JsonSerializationContext;
import p007c.p190n.p430e.JsonSerializer;
import p007c.p190n.p430e.JsonSyntaxException;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonWriter;
import p007c.p190n.p430e.p437g0.MalformedJsonException;

/* JADX INFO: renamed from: c.n.e.e0.a0.m, reason: use source file name */
/* JADX INFO: compiled from: TreeTypeAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter2<T> {

    /* JADX INFO: renamed from: a */
    public final JsonSerializer<T> f27378a;

    /* JADX INFO: renamed from: b */
    public final JsonDeserializer<T> f27379b;

    /* JADX INFO: renamed from: c */
    public final Gson6 f27380c;

    /* JADX INFO: renamed from: d */
    public final TypeToken<T> f27381d;

    /* JADX INFO: renamed from: e */
    public final TypeAdapterFactory f27382e;

    /* JADX INFO: renamed from: f */
    public final TreeTypeAdapter<T>.b f27383f = new b(this, null);

    /* JADX INFO: renamed from: g */
    public TypeAdapter2<T> f27384g;

    /* JADX INFO: renamed from: c.n.e.e0.a0.m$b */
    /* JADX INFO: compiled from: TreeTypeAdapter.java */
    public final class b implements JsonSerializationContext, JsonDeserializationContext {
        public b(TreeTypeAdapter treeTypeAdapter, a aVar) {
        }
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson6 gson6, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
        this.f27378a = jsonSerializer;
        this.f27379b = jsonDeserializer;
        this.f27380c = gson6;
        this.f27381d = typeToken;
        this.f27382e = typeAdapterFactory;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    public T mo12212a(JsonReader2 jsonReader2) throws IOException {
        boolean z;
        JsonElement jsonElementMo12212a;
        if (this.f27379b == null) {
            TypeAdapter2<T> typeAdapter2M12317d = this.f27384g;
            if (typeAdapter2M12317d == null) {
                typeAdapter2M12317d = this.f27380c.m12317d(this.f27382e, this.f27381d);
                this.f27384g = typeAdapter2M12317d;
            }
            return typeAdapter2M12317d.mo12212a(jsonReader2);
        }
        try {
            try {
                jsonReader2.mo12234H0();
                z = false;
                try {
                    jsonElementMo12212a = TypeAdapters.f27411X.mo12212a(jsonReader2);
                } catch (EOFException e) {
                    e = e;
                    if (!z) {
                        throw new JsonSyntaxException(e);
                    }
                    jsonElementMo12212a = JsonNull.f27581a;
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
            Objects.requireNonNull(jsonElementMo12212a);
            if (jsonElementMo12212a instanceof JsonNull) {
                return null;
            }
            return this.f27379b.m12324a(jsonElementMo12212a, this.f27381d.f27514b, this.f27383f);
        } catch (MalformedJsonException e3) {
            throw new JsonSyntaxException(e3);
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        } catch (NumberFormatException e5) {
            throw new JsonSyntaxException(e5);
        }
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: b */
    public void mo12213b(JsonWriter jsonWriter, T t) throws IOException {
        JsonSerializer<T> jsonSerializer = this.f27378a;
        if (jsonSerializer == null) {
            TypeAdapter2<T> typeAdapter2M12317d = this.f27384g;
            if (typeAdapter2M12317d == null) {
                typeAdapter2M12317d = this.f27380c.m12317d(this.f27382e, this.f27381d);
                this.f27384g = typeAdapter2M12317d;
            }
            typeAdapter2M12317d.mo12213b(jsonWriter, t);
            return;
        }
        if (t == null) {
            jsonWriter.mo12254O();
        } else {
            TypeAdapters.f27411X.mo12213b(jsonWriter, jsonSerializer.m12330a(t, this.f27381d.f27514b, this.f27383f));
        }
    }
}
