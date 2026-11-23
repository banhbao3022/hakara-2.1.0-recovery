package p636z0.p759s;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: z0.s.r, reason: use source file name */
/* JADX INFO: compiled from: Lifecycling.java */
/* JADX INFO: loaded from: classes.dex */
public class Lifecycling {

    /* JADX INFO: renamed from: a */
    public static Map<Class<?>, Integer> f38715a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> f38716b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static GeneratedAdapter m16739a(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m16740b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:71:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:76:0x011c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0117 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static int m16741c(Class<?> cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int i;
        boolean z;
        Integer num = f38715a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String strM16740b = m16740b(canonicalName);
                if (!name.isEmpty()) {
                    strM16740b = name + "." + strM16740b;
                }
                declaredConstructor = Class.forName(strM16740b).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (declaredConstructor != null) {
                f38716b.put(cls, Collections.singletonList(declaredConstructor));
            } else {
                ClassesInfoCache classesInfoCache = ClassesInfoCache.f38681a;
                Boolean bool = classesInfoCache.f38683c.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                classesInfoCache.f38683c.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((OnLifecycleEvent) declaredMethods[i3].getAnnotation(OnLifecycleEvent.class)) != null) {
                                classesInfoCache.m16718a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!zBooleanValue) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (!(superclass != null && LifecycleObserver.class.isAssignableFrom(superclass))) {
                        for (Class<?> cls2 : cls.getInterfaces()) {
                            if (cls2 == null && LifecycleObserver.class.isAssignableFrom(cls2)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (m16741c(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll(f38716b.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            f38716b.put(cls, arrayList);
                        }
                    } else if (m16741c(superclass) != 1) {
                        arrayList = new ArrayList(f38716b.get(superclass));
                        while (i < r6) {
                            if (cls2 == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (m16741c(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll(f38716b.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            f38716b.put(cls, arrayList);
                        }
                    }
                }
            }
            i2 = 2;
        }
        f38715a.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
