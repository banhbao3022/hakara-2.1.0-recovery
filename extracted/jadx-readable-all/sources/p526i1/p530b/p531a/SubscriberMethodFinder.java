package p526i1.p530b.p531a;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p007c.p071d.p078c.p079a.outline;
import p526i1.p530b.p531a.p533s.SubscriberInfo;

/* JADX INFO: renamed from: i1.b.a.p, reason: use source file name */
/* JADX INFO: compiled from: SubscriberMethodFinder.java */
/* JADX INFO: loaded from: classes2.dex */
public class SubscriberMethodFinder {

    /* JADX INFO: renamed from: a */
    public static final Map<Class<?>, List<SubscriberMethod>> f30844a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final a[] f30845b = new a[4];

    /* JADX INFO: renamed from: i1.b.a.p$a */
    /* JADX INFO: compiled from: SubscriberMethodFinder.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final List<SubscriberMethod> f30846a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Map<Class, Object> f30847b = new HashMap();

        /* JADX INFO: renamed from: c */
        public final Map<String, Class> f30848c = new HashMap();

        /* JADX INFO: renamed from: d */
        public final StringBuilder f30849d = new StringBuilder(128);

        /* JADX INFO: renamed from: e */
        public Class<?> f30850e;

        /* JADX INFO: renamed from: f */
        public boolean f30851f;

        /* JADX INFO: renamed from: g */
        public SubscriberInfo f30852g;

        /* JADX INFO: renamed from: a */
        public boolean m13831a(Method method, Class<?> cls) {
            Object objPut = this.f30847b.put(cls, method);
            if (objPut == null) {
                return true;
            }
            if (objPut instanceof Method) {
                if (!m13832b((Method) objPut, cls)) {
                    throw new IllegalStateException();
                }
                this.f30847b.put(cls, this);
            }
            return m13832b(method, cls);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m13832b(Method method, Class<?> cls) {
            this.f30849d.setLength(0);
            this.f30849d.append(method.getName());
            StringBuilder sb = this.f30849d;
            sb.append('>');
            sb.append(cls.getName());
            String string = this.f30849d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class clsPut = this.f30848c.put(string, declaringClass);
            if (clsPut == null || clsPut.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f30848c.put(string, clsPut);
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m13833c() {
            if (this.f30851f) {
                this.f30850e = null;
                return;
            }
            Class<? super Object> superclass = this.f30850e.getSuperclass();
            this.f30850e = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f30850e = null;
            }
        }
    }

    public SubscriberMethodFinder(List<?> list, boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: a */
    public final void m13828a(a aVar) {
        Method[] methods;
        Subscribe subscribe;
        try {
            try {
                methods = aVar.f30850e.getDeclaredMethods();
            } catch (LinkageError e) {
                StringBuilder sbM1556G = outline.m1556G("Could not inspect methods of ");
                sbM1556G.append(aVar.f30850e.getName());
                throw new EventBusException(outline.m1599u(sbM1556G.toString(), ". Please make this class visible to EventBus annotation processor to avoid reflection."), e);
            }
        } catch (Throwable unused) {
            methods = aVar.f30850e.getMethods();
            aVar.f30851f = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && (subscribe = (Subscribe) method.getAnnotation(Subscribe.class)) != null) {
                    Class<?> cls = parameterTypes[0];
                    if (aVar.m13831a(method, cls)) {
                        aVar.f30846a.add(new SubscriberMethod(method, cls, subscribe.threadMode(), subscribe.priority(), subscribe.sticky()));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<SubscriberMethod> m13829b(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f30846a);
        aVar.f30846a.clear();
        aVar.f30847b.clear();
        aVar.f30848c.clear();
        aVar.f30849d.setLength(0);
        aVar.f30850e = null;
        aVar.f30851f = false;
        aVar.f30852g = null;
        synchronized (f30845b) {
            for (int i = 0; i < 4; i++) {
                a[] aVarArr = f30845b;
                if (aVarArr[i] == null) {
                    aVarArr[i] = aVar;
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final a m13830c() {
        synchronized (f30845b) {
            for (int i = 0; i < 4; i++) {
                a[] aVarArr = f30845b;
                a aVar = aVarArr[i];
                if (aVar != null) {
                    aVarArr[i] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }
}
