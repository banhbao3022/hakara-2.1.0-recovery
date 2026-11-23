package p007c.p190n.p430e;

import java.io.IOException;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: c.n.e.a0, reason: use source file name */
/* JADX INFO: compiled from: TypeAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class TypeAdapter<T> extends TypeAdapter2<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TypeAdapter2 f27315a;

    public TypeAdapter(TypeAdapter2 typeAdapter2) {
        this.f27315a = typeAdapter2;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    public T mo12212a(JsonReader2 jsonReader2) throws IOException {
        if (jsonReader2.mo12234H0() != JsonToken.NULL) {
            return (T) this.f27315a.mo12212a(jsonReader2);
        }
        jsonReader2.mo12249z0();
        return null;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: b */
    public void mo12213b(JsonWriter jsonWriter, T t) throws IOException {
        if (t == null) {
            jsonWriter.mo12254O();
        } else {
            this.f27315a.mo12213b(jsonWriter, t);
        }
    }
}
