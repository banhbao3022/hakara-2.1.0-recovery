package p636z0.p725k.p729e;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: z0.k.e.h, reason: use source file name */
/* JADX INFO: compiled from: TypefaceCompatApi28Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatApi28Impl extends TypefaceCompatApi26Impl {
    @Override // p636z0.p725k.p729e.TypefaceCompatApi26Impl
    /* JADX INFO: renamed from: j */
    public Typeface mo16186j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f37869g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f37875m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p636z0.p725k.p729e.TypefaceCompatApi26Impl
    /* JADX INFO: renamed from: p */
    public Method mo16191p(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
