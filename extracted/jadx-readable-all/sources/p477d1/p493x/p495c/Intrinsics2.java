package p477d1.p493x.p495c;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p477d1.KotlinNullPointerException;
import p477d1.UninitializedPropertyAccessException;

/* JADX INFO: renamed from: d1.x.c.j, reason: use source file name */
/* JADX INFO: compiled from: Intrinsics.java */
/* JADX INFO: loaded from: classes.dex */
public class Intrinsics2 {
    /* JADX INFO: renamed from: a */
    public static boolean m13085a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    public static void m13086b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(outline.m1599u(str, " must not be null"));
        m13093i(illegalStateException, Intrinsics2.class.getName());
        throw illegalStateException;
    }

    /* JADX INFO: renamed from: c */
    public static void m13087c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m13093i(nullPointerException, Intrinsics2.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: d */
    public static void m13088d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(outline.m1599u(str, " must not be null"));
        m13093i(nullPointerException, Intrinsics2.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: e */
    public static void m13089e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m13092h(str));
        m13093i(nullPointerException, Intrinsics2.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: f */
    public static void m13090f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m13092h(str));
        m13093i(illegalArgumentException, Intrinsics2.class.getName());
        throw illegalArgumentException;
    }

    /* JADX INFO: renamed from: g */
    public static int m13091g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: h */
    public static String m13092h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* JADX INFO: renamed from: i */
    public static <T extends Throwable> T m13093i(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* JADX INFO: renamed from: j */
    public static String m13094j(String str, Object obj) {
        return outline.m1598t(str, obj);
    }

    /* JADX INFO: renamed from: k */
    public static void m13095k() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        m13093i(kotlinNullPointerException, Intrinsics2.class.getName());
        throw kotlinNullPointerException;
    }

    /* JADX INFO: renamed from: l */
    public static void m13096l(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(outline.m1600v("lateinit property ", str, " has not been initialized"));
        m13093i(uninitializedPropertyAccessException, Intrinsics2.class.getName());
        throw uninitializedPropertyAccessException;
    }
}
