package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ms1 {

    /* JADX INFO: renamed from: a */
    @NullableDecl
    public static final Object f16843a;

    static {
        Object objM7728a = m7728a();
        f16843a = objM7728a;
        if (objM7728a != null) {
            m7729b("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (objM7728a == null) {
            return;
        }
        try {
            Method methodM7729b = m7729b("getStackTraceDepth", Throwable.class);
            if (methodM7729b == null) {
                return;
            }
            methodM7729b.invoke(m7728a(), new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }

    @NullableDecl
    /* JADX INFO: renamed from: a */
    public static Object m7728a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    /* JADX INFO: renamed from: b */
    public static Method m7729b(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }
}
