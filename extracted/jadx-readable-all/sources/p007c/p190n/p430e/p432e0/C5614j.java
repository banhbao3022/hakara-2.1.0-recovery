package p007c.p190n.p430e.p432e0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.JsonIOException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: c.n.e.e0.j */
/* JADX INFO: compiled from: ConstructorConstructor.java */
/* JADX INFO: loaded from: classes.dex */
public class C5614j<T> implements ObjectConstructor<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Type f27470a;

    public C5614j(C5611g c5611g, Type type) {
        this.f27470a = type;
    }

    @Override // p007c.p190n.p430e.p432e0.ObjectConstructor
    /* JADX INFO: renamed from: a */
    public T mo12272a() {
        Type type = this.f27470a;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder sbM1556G = outline.m1556G("Invalid EnumSet type: ");
            sbM1556G.append(this.f27470a.toString());
            throw new JsonIOException(sbM1556G.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return (T) EnumSet.noneOf((Class) type2);
        }
        StringBuilder sbM1556G2 = outline.m1556G("Invalid EnumSet type: ");
        sbM1556G2.append(this.f27470a.toString());
        throw new JsonIOException(sbM1556G2.toString());
    }
}
