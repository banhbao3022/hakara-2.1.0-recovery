package p007c.p190n.p430e.p432e0;

import java.lang.reflect.Modifier;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.e.e0.z, reason: use source file name */
/* JADX INFO: compiled from: UnsafeAllocator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class UnsafeAllocator5 {
    /* JADX INFO: renamed from: a */
    public static void m12292a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sbM1556G = outline.m1556G("Interface can't be instantiated! Interface name: ");
            sbM1556G.append(cls.getName());
            throw new UnsupportedOperationException(sbM1556G.toString());
        }
        if (Modifier.isAbstract(modifiers)) {
            StringBuilder sbM1556G2 = outline.m1556G("Abstract class can't be instantiated! Class name: ");
            sbM1556G2.append(cls.getName());
            throw new UnsupportedOperationException(sbM1556G2.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract <T> T mo12291b(Class<T> cls) throws Exception;
}
