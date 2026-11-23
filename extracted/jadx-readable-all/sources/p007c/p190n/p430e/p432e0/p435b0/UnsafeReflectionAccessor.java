package p007c.p190n.p430e.p432e0.p435b0;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import p007c.p190n.p430e.JsonIOException;

/* JADX INFO: renamed from: c.n.e.e0.b0.c, reason: use source file name */
/* JADX INFO: compiled from: UnsafeReflectionAccessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class UnsafeReflectionAccessor extends ReflectionAccessor {

    /* JADX INFO: renamed from: b */
    public static Class f27457b;

    /* JADX INFO: renamed from: c */
    public final Object f27458c;

    /* JADX INFO: renamed from: d */
    public final Field f27459d;

    public UnsafeReflectionAccessor() {
        Object obj;
        Field declaredField = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f27457b = cls;
            Field declaredField2 = cls.getDeclaredField("theUnsafe");
            declaredField2.setAccessible(true);
            obj = declaredField2.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f27458c = obj;
        try {
            declaredField = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f27459d = declaredField;
    }

    @Override // p007c.p190n.p430e.p432e0.p435b0.ReflectionAccessor
    /* JADX INFO: renamed from: a */
    public void mo12273a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (this.f27458c != null && this.f27459d != null) {
            try {
                f27457b.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f27458c, accessibleObject, Long.valueOf(((Long) f27457b.getMethod("objectFieldOffset", Field.class).invoke(this.f27458c, this.f27459d)).longValue()), Boolean.TRUE);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
        }
    }
}
