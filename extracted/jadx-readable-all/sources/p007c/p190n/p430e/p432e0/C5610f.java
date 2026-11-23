package p007c.p190n.p430e.p432e0;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: c.n.e.e0.f */
/* JADX INFO: compiled from: ConstructorConstructor.java */
/* JADX INFO: loaded from: classes.dex */
public class C5610f<T> implements ObjectConstructor<T> {

    /* JADX INFO: renamed from: a */
    public final UnsafeAllocator5 f27460a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f27461b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Type f27462c;

    public C5610f(C5611g c5611g, Class cls, Type type) {
        UnsafeAllocator5 unsafeAllocator4;
        this.f27461b = cls;
        this.f27462c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafeAllocator4 = new UnsafeAllocator(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    unsafeAllocator4 = new UnsafeAllocator2(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    unsafeAllocator4 = new UnsafeAllocator3(declaredMethod3);
                }
            } catch (Exception unused3) {
                unsafeAllocator4 = new UnsafeAllocator4();
            }
        }
        this.f27460a = unsafeAllocator4;
    }

    @Override // p007c.p190n.p430e.p432e0.ObjectConstructor
    /* JADX INFO: renamed from: a */
    public T mo12272a() {
        try {
            return (T) this.f27460a.mo12291b(this.f27461b);
        } catch (Exception e) {
            StringBuilder sbM1556G = outline.m1556G("Unable to invoke no-args constructor for ");
            sbM1556G.append(this.f27462c);
            sbM1556G.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(sbM1556G.toString(), e);
        }
    }
}
