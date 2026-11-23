package p477d1.p493x.p495c;

import java.util.Objects;
import p477d1.p479b0.KClass;

/* JADX INFO: renamed from: d1.x.c.s, reason: use source file name */
/* JADX INFO: compiled from: Reflection.java */
/* JADX INFO: loaded from: classes.dex */
public class Reflection {

    /* JADX INFO: renamed from: a */
    public static final ReflectionFactory f29605a;

    /* JADX INFO: renamed from: b */
    public static final KClass[] f29606b;

    static {
        ReflectionFactory reflectionFactory = null;
        try {
            reflectionFactory = (ReflectionFactory) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        f29605a = reflectionFactory;
        f29606b = new KClass[0];
    }

    /* JADX INFO: renamed from: a */
    public static KClass m13097a(Class cls) {
        Objects.requireNonNull(f29605a);
        return new ClassReference(cls);
    }
}
