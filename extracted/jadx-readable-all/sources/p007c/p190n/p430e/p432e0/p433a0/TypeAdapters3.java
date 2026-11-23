package p007c.p190n.p430e.p432e0.p433a0;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p436f0.TypeToken;

/* JADX INFO: renamed from: c.n.e.e0.a0.q, reason: use source file name */
/* JADX INFO: compiled from: TypeAdapters.java */
/* JADX INFO: loaded from: classes.dex */
public class TypeAdapters3 implements TypeAdapterFactory {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Class f27445f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Class f27446g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TypeAdapter2 f27447h;

    public TypeAdapters3(Class cls, Class cls2, TypeAdapter2 typeAdapter2) {
        this.f27445f = cls;
        this.f27446g = cls2;
        this.f27447h = typeAdapter2;
    }

    @Override // p007c.p190n.p430e.TypeAdapterFactory
    /* JADX INFO: renamed from: a */
    public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
        Class<? super T> cls = typeToken.f27513a;
        if (cls == this.f27445f || cls == this.f27446g) {
            return this.f27447h;
        }
        return null;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Factory[type=");
        sbM1556G.append(this.f27446g.getName());
        sbM1556G.append("+");
        sbM1556G.append(this.f27445f.getName());
        sbM1556G.append(",adapter=");
        sbM1556G.append(this.f27447h);
        sbM1556G.append("]");
        return sbM1556G.toString();
    }
}
