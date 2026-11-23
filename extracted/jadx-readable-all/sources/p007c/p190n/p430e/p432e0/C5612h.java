package p007c.p190n.p430e.p432e0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: c.n.e.e0.h */
/* JADX INFO: compiled from: ConstructorConstructor.java */
/* JADX INFO: loaded from: classes.dex */
public class C5612h<T> implements ObjectConstructor<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Constructor f27469a;

    public C5612h(C5611g c5611g, Constructor constructor) {
        this.f27469a = constructor;
    }

    @Override // p007c.p190n.p430e.p432e0.ObjectConstructor
    /* JADX INFO: renamed from: a */
    public T mo12272a() {
        try {
            return (T) this.f27469a.newInstance(null);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e2) {
            StringBuilder sbM1556G = outline.m1556G("Failed to invoke ");
            sbM1556G.append(this.f27469a);
            sbM1556G.append(" with no args");
            throw new RuntimeException(sbM1556G.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder sbM1556G2 = outline.m1556G("Failed to invoke ");
            sbM1556G2.append(this.f27469a);
            sbM1556G2.append(" with no args");
            throw new RuntimeException(sbM1556G2.toString(), e3.getTargetException());
        }
    }
}
