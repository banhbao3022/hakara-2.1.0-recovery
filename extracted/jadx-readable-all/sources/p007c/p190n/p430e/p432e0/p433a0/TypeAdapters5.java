package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.JsonSyntaxException;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.s, reason: use source file name */
/* JADX INFO: compiled from: TypeAdapters.java */
/* JADX INFO: loaded from: classes.dex */
public class TypeAdapters5 implements TypeAdapterFactory {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Class f27451f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TypeAdapter2 f27452g;

    /* JADX INFO: Add missing generic type declarations: [T1] */
    /* JADX INFO: renamed from: c.n.e.e0.a0.s$a */
    /* JADX INFO: compiled from: TypeAdapters.java */
    public class a<T1> extends TypeAdapter2<T1> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Class f27453a;

        public a(Class cls) {
            this.f27453a = cls;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public T1 mo12212a(JsonReader2 jsonReader2) throws IOException {
            T1 t1 = (T1) TypeAdapters5.this.f27452g.mo12212a(jsonReader2);
            if (t1 == null || this.f27453a.isInstance(t1)) {
                return t1;
            }
            StringBuilder sbM1556G = outline.m1556G("Expected a ");
            sbM1556G.append(this.f27453a.getName());
            sbM1556G.append(" but was ");
            sbM1556G.append(t1.getClass().getName());
            throw new JsonSyntaxException(sbM1556G.toString());
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, T1 t1) throws IOException {
            TypeAdapters5.this.f27452g.mo12213b(jsonWriter, t1);
        }
    }

    public TypeAdapters5(Class cls, TypeAdapter2 typeAdapter2) {
        this.f27451f = cls;
        this.f27452g = typeAdapter2;
    }

    @Override // p007c.p190n.p430e.TypeAdapterFactory
    /* JADX INFO: renamed from: a */
    public <T2> TypeAdapter2<T2> mo12216a(Gson6 gson6, TypeToken<T2> typeToken) {
        Class<? super T2> cls = typeToken.f27513a;
        if (this.f27451f.isAssignableFrom(cls)) {
            return new a(cls);
        }
        return null;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Factory[typeHierarchy=");
        sbM1556G.append(this.f27451f.getName());
        sbM1556G.append(",adapter=");
        sbM1556G.append(this.f27452g);
        sbM1556G.append("]");
        return sbM1556G.toString();
    }
}
