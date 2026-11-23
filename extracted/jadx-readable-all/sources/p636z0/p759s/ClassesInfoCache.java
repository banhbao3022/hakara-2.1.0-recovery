package p636z0.p759s;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.s.c, reason: use source file name */
/* JADX INFO: compiled from: ClassesInfoCache.java */
/* JADX INFO: loaded from: classes.dex */
public final class ClassesInfoCache {

    /* JADX INFO: renamed from: a */
    public static ClassesInfoCache f38681a = new ClassesInfoCache();

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, a> f38682b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<Class<?>, Boolean> f38683c = new HashMap();

    /* JADX INFO: renamed from: z0.s.c$a */
    /* JADX INFO: compiled from: ClassesInfoCache.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Map<Lifecycle3.a, List<b>> f38684a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Map<b, Lifecycle3.a> f38685b;

        public a(Map<b, Lifecycle3.a> map) {
            this.f38685b = map;
            for (Map.Entry<b, Lifecycle3.a> entry : map.entrySet()) {
                Lifecycle3.a value = entry.getValue();
                List<b> arrayList = this.f38684a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f38684a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m16721a(List<b> list, LifecycleOwner lifecycleOwner, Lifecycle3.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    Objects.requireNonNull(bVar);
                    try {
                        int i = bVar.f38686a;
                        if (i == 0) {
                            bVar.f38687b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar.f38687b.invoke(obj, lifecycleOwner);
                        } else if (i == 2) {
                            bVar.f38687b.invoke(obj, lifecycleOwner, aVar);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0.s.c$b */
    /* JADX INFO: compiled from: ClassesInfoCache.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f38686a;

        /* JADX INFO: renamed from: b */
        public final Method f38687b;

        public b(int i, Method method) {
            this.f38686a = i;
            this.f38687b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f38686a == bVar.f38686a && this.f38687b.getName().equals(bVar.f38687b.getName());
        }

        public int hashCode() {
            return this.f38687b.getName().hashCode() + (this.f38686a * 31);
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m16718a(Class<?> cls, Method[] methodArr) {
        int i;
        a aVarM16719b;
        Class<?> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarM16719b = m16719b(superclass)) != null) {
            map.putAll(aVarM16719b.f38685b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, Lifecycle3.a> entry : m16719b(cls2).f38685b.entrySet()) {
                m16720c(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                Lifecycle3.a aVarValue = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle3.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != Lifecycle3.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m16720c(map, new b(i, method), aVarValue, cls);
                z = true;
            }
        }
        a aVar = new a(map);
        this.f38682b.put(cls, aVar);
        this.f38683c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public a m16719b(Class<?> cls) {
        a aVar = this.f38682b.get(cls);
        return aVar != null ? aVar : m16718a(cls, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m16720c(Map<b, Lifecycle3.a> map, b bVar, Lifecycle3.a aVar, Class<?> cls) {
        Lifecycle3.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        Method method = bVar.f38687b;
        StringBuilder sbM1556G = outline.m1556G("Method ");
        sbM1556G.append(method.getName());
        sbM1556G.append(" in ");
        sbM1556G.append(cls.getName());
        sbM1556G.append(" already declared with different @OnLifecycleEvent value: previous value ");
        sbM1556G.append(aVar2);
        sbM1556G.append(", new value ");
        sbM1556G.append(aVar);
        throw new IllegalArgumentException(sbM1556G.toString());
    }
}
