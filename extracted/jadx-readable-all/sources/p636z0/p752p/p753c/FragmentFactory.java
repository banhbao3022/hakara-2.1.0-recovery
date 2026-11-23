package p636z0.p752p.p753c;

import java.lang.reflect.InvocationTargetException;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.SimpleArrayMap;

/* JADX INFO: renamed from: z0.p.c.v, reason: use source file name */
/* JADX INFO: compiled from: FragmentFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentFactory {

    /* JADX INFO: renamed from: a */
    public static final SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> f38558a = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: b */
    public static Class<?> m16612b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> simpleArrayMap = f38558a;
        SimpleArrayMap<String, Class<?>> orDefault = simpleArrayMap.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new SimpleArrayMap<>();
            simpleArrayMap.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 != null) {
            return orDefault2;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        orDefault.put(str, cls);
        return cls;
    }

    /* JADX INFO: renamed from: c */
    public static Class<? extends Fragment> m16613c(ClassLoader classLoader, String str) {
        try {
            return m16612b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.c(outline.m1600v("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.c(outline.m1600v("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public Fragment mo16614a(ClassLoader classLoader, String str) {
        try {
            return m16613c(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new Fragment.c(outline.m1600v("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment.c(outline.m1600v("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.c(outline.m1600v("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.c(outline.m1600v("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
