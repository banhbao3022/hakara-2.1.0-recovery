package p477d1.p489v;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p498z.PlatformRandom2;
import p477d1.p498z.Random;

/* JADX INFO: renamed from: d1.v.a, reason: use source file name */
/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes.dex */
public class PlatformImplementations {

    /* JADX INFO: renamed from: d1.v.a$a */
    /* JADX INFO: compiled from: PlatformImplementations.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final Method f29558a;

        /* JADX WARN: Code duplicated, block: B:13:0x003f  */
        static {
            Method method;
            boolean z;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics2.m13088d(methods, "throwableMethods");
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                Intrinsics2.m13088d(method2, "it");
                if (Intrinsics2.m13085a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics2.m13088d(parameterTypes, "it.parameterTypes");
                    Intrinsics2.m13089e(parameterTypes, "$this$singleOrNull");
                    z = Intrinsics2.m13085a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class);
                }
                if (z) {
                    method = method2;
                    break;
                }
                i++;
            }
            f29558a = method;
            for (Method method3 : methods) {
                Intrinsics2.m13088d(method3, "it");
                if (Intrinsics2.m13085a(method3.getName(), "getSuppressed")) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo13074a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Intrinsics2.m13089e(th, "cause");
        Intrinsics2.m13089e(th2, "exception");
        Method method = a.f29558a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public Random mo13075b() {
        return new PlatformRandom2();
    }
}
