package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import p007c.p071d.p078c.p079a.outline;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class za2 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f22218a;

    /* JADX INFO: renamed from: b */
    public static final Class<?> f22219b;

    /* JADX INFO: renamed from: c */
    public static final boolean f22220c;

    /* JADX INFO: renamed from: d */
    public static final boolean f22221d;

    /* JADX INFO: renamed from: e */
    public static final ya2 f22222e;

    /* JADX INFO: renamed from: f */
    public static final boolean f22223f;

    /* JADX INFO: renamed from: g */
    public static final boolean f22224g;

    /* JADX INFO: renamed from: h */
    public static final long f22225h;

    /* JADX INFO: renamed from: i */
    public static final boolean f22226i;

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    static {
        Unsafe unsafe;
        boolean z;
        Unsafe unsafe2;
        boolean z2;
        ya2 ya2Var;
        Unsafe unsafeM8869r = m8869r();
        f22218a = unsafeM8869r;
        f22219b = v62.m8538a();
        Class<?> cls = Long.TYPE;
        boolean zM8870s = m8870s(cls);
        f22220c = zM8870s;
        boolean zM8870s2 = m8870s(Integer.TYPE);
        f22221d = zM8870s2;
        ya2 wa2Var = null;
        if (unsafeM8869r != null) {
            if (zM8870s) {
                wa2Var = new xa2(unsafeM8869r);
            } else if (zM8870s2) {
                wa2Var = new wa2(unsafeM8869r);
            }
        }
        f22222e = wa2Var;
        if (wa2Var == null || (unsafe = wa2Var.f21833a) == null) {
            z = false;
        } else {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (m8853b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                m8871t(th);
            }
        }
        f22223f = z;
        ya2 ya2Var2 = f22222e;
        if (ya2Var2 == null || (unsafe2 = ya2Var2.f21833a) == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls3 = unsafe2.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class<?> cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                m8871t(th2);
                z2 = false;
            }
        }
        f22224g = z2;
        f22225h = m8874w(byte[].class);
        m8874w(boolean[].class);
        m8852a(boolean[].class);
        m8874w(int[].class);
        m8852a(int[].class);
        m8874w(long[].class);
        m8852a(long[].class);
        m8874w(float[].class);
        m8852a(float[].class);
        m8874w(double[].class);
        m8852a(double[].class);
        m8874w(Object[].class);
        m8852a(Object[].class);
        Field fieldM8853b = m8853b();
        if (fieldM8853b != null && (ya2Var = f22222e) != null) {
            ya2Var.m8781h(fieldM8853b);
        }
        f22226i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static int m8852a(Class<?> cls) {
        if (f22224g) {
            return f22222e.m8783j(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static Field m8853b() {
        Field declaredField;
        Field declaredField2;
        int i = v62.f20704a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    /* JADX INFO: renamed from: c */
    public static void m8854c(Object obj, long j2, byte b) {
        long j3 = (-4) & j2;
        ya2 ya2Var = f22222e;
        int iM8784k = ya2Var.m8784k(obj, j3);
        int i = ((~((int) j2)) & 3) << 3;
        ya2Var.m8785l(obj, j3, ((255 & b) << i) | (iM8784k & (~(255 << i))));
    }

    /* JADX INFO: renamed from: d */
    public static void m8855d(Object obj, long j2, byte b) {
        long j3 = (-4) & j2;
        ya2 ya2Var = f22222e;
        int i = (((int) j2) & 3) << 3;
        ya2Var.m8785l(obj, j3, ((255 & b) << i) | (ya2Var.m8784k(obj, j3) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m8856e(Class<T> cls) {
        try {
            return (T) f22218a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m8857f(Object obj, long j2) {
        return f22222e.m8784k(obj, j2);
    }

    /* JADX INFO: renamed from: g */
    public static void m8858g(Object obj, long j2, int i) {
        f22222e.m8785l(obj, j2, i);
    }

    /* JADX INFO: renamed from: h */
    public static long m8859h(Object obj, long j2) {
        return f22222e.m8786m(obj, j2);
    }

    /* JADX INFO: renamed from: i */
    public static void m8860i(Object obj, long j2, long j3) {
        f22222e.m8787n(obj, j2, j3);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m8861j(Object obj, long j2) {
        return f22222e.mo8617b(obj, j2);
    }

    /* JADX INFO: renamed from: k */
    public static void m8862k(Object obj, long j2, boolean z) {
        f22222e.mo8618c(obj, j2, z);
    }

    /* JADX INFO: renamed from: l */
    public static float m8863l(Object obj, long j2) {
        return f22222e.mo8619d(obj, j2);
    }

    /* JADX INFO: renamed from: m */
    public static void m8864m(Object obj, long j2, float f) {
        f22222e.mo8620e(obj, j2, f);
    }

    /* JADX INFO: renamed from: n */
    public static double m8865n(Object obj, long j2) {
        return f22222e.mo8621f(obj, j2);
    }

    /* JADX INFO: renamed from: o */
    public static void m8866o(Object obj, long j2, double d) {
        f22222e.mo8622g(obj, j2, d);
    }

    /* JADX INFO: renamed from: p */
    public static Object m8867p(Object obj, long j2) {
        return f22222e.m8788o(obj, j2);
    }

    /* JADX INFO: renamed from: q */
    public static void m8868q(Object obj, long j2, Object obj2) {
        f22222e.m8789p(obj, j2, obj2);
    }

    /* JADX INFO: renamed from: r */
    public static Unsafe m8869r() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ua2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m8870s(Class<?> cls) {
        int i = v62.f20704a;
        try {
            Class<?> cls2 = f22219b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m8871t(Throwable th) {
        Logger logger = Logger.getLogger(za2.class.getName());
        Level level = Level.WARNING;
        String strValueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", outline.m1550A(new StringBuilder(strValueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", strValueOf));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m8872u(Object obj, long j2) {
        return ((byte) ((f22222e.m8784k(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m8873v(Object obj, long j2) {
        return ((byte) ((f22222e.m8784k(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: w */
    public static int m8874w(Class<?> cls) {
        if (f22224g) {
            return f22222e.m8782i(cls);
        }
        return -1;
    }
}
