package p007c.p190n.p430e.p432e0.p433a0;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p436f0.TypeToken;

/* JADX INFO: renamed from: c.n.e.e0.a0.p, reason: use source file name */
/* JADX INFO: compiled from: TypeAdapters.java */
/* JADX INFO: loaded from: classes.dex */
public class TypeAdapters2 implements TypeAdapterFactory {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Class f27443f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TypeAdapter2 f27444g;

    public TypeAdapters2(Class cls, TypeAdapter2 typeAdapter2) {
        this.f27443f = cls;
        this.f27444g = typeAdapter2;
    }

    @Override // p007c.p190n.p430e.TypeAdapterFactory
    /* JADX INFO: renamed from: a */
    public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
        if (typeToken.f27513a == this.f27443f) {
            return this.f27444g;
        }
        return null;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Factory[type=");
        sbM1556G.append(this.f27443f.getName());
        sbM1556G.append(",adapter=");
        sbM1556G.append(this.f27444g);
        sbM1556G.append("]");
        return sbM1556G.toString();
    }
}
