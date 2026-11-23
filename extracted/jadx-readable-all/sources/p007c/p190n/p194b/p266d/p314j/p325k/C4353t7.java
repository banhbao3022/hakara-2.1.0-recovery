package p007c.p190n.p194b.p266d.p314j.p325k;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: c.n.b.d.j.k.t7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4353t7 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f23475a;

    /* JADX INFO: renamed from: b */
    public static final Class<?> f23476b;

    /* JADX INFO: renamed from: c */
    public static final boolean f23477c;

    /* JADX INFO: renamed from: d */
    public static final boolean f23478d;

    /* JADX INFO: renamed from: e */
    public static final c f23479e;

    /* JADX INFO: renamed from: f */
    public static final boolean f23480f;

    /* JADX INFO: renamed from: g */
    public static final boolean f23481g;

    /* JADX INFO: renamed from: h */
    public static final long f23482h;

    /* JADX INFO: renamed from: i */
    public static final boolean f23483i;

    /* JADX INFO: renamed from: c.n.b.d.j.k.t7$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static final class a extends c {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: a */
        public final byte mo10245a(Object obj, long j2) {
            return C4353t7.f23483i ? C4353t7.m10243v(obj, j2) : C4353t7.m10244w(obj, j2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: b */
        public final void mo10246b(Object obj, long j2, byte b) {
            if (C4353t7.f23483i) {
                C4353t7.m10235n(obj, j2, b);
            } else {
                C4353t7.m10238q(obj, j2, b);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: c */
        public final void mo10247c(Object obj, long j2, double d) {
            m10254f(obj, j2, Double.doubleToLongBits(d));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: d */
        public final void mo10248d(Object obj, long j2, float f) {
            m10253e(obj, j2, Float.floatToIntBits(f));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: g */
        public final void mo10249g(Object obj, long j2, boolean z) {
            if (C4353t7.f23483i) {
                C4353t7.m10235n(obj, j2, z ? (byte) 1 : (byte) 0);
            } else {
                C4353t7.m10238q(obj, j2, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: h */
        public final boolean mo10250h(Object obj, long j2) {
            if (C4353t7.f23483i) {
                return C4353t7.m10243v(obj, j2) != 0;
            }
            return C4353t7.m10244w(obj, j2) != 0;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: i */
        public final float mo10251i(Object obj, long j2) {
            return Float.intBitsToFloat(m10255k(obj, j2));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: j */
        public final double mo10252j(Object obj, long j2) {
            return Double.longBitsToDouble(m10256l(obj, j2));
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.t7$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static final class b extends c {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: a */
        public final byte mo10245a(Object obj, long j2) {
            return C4353t7.f23483i ? C4353t7.m10243v(obj, j2) : C4353t7.m10244w(obj, j2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: b */
        public final void mo10246b(Object obj, long j2, byte b) {
            if (C4353t7.f23483i) {
                C4353t7.m10235n(obj, j2, b);
            } else {
                C4353t7.m10238q(obj, j2, b);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: c */
        public final void mo10247c(Object obj, long j2, double d) {
            m10254f(obj, j2, Double.doubleToLongBits(d));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: d */
        public final void mo10248d(Object obj, long j2, float f) {
            m10253e(obj, j2, Float.floatToIntBits(f));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: g */
        public final void mo10249g(Object obj, long j2, boolean z) {
            if (C4353t7.f23483i) {
                C4353t7.m10235n(obj, j2, z ? (byte) 1 : (byte) 0);
            } else {
                C4353t7.m10238q(obj, j2, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: h */
        public final boolean mo10250h(Object obj, long j2) {
            if (C4353t7.f23483i) {
                return C4353t7.m10243v(obj, j2) != 0;
            }
            return C4353t7.m10244w(obj, j2) != 0;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: i */
        public final float mo10251i(Object obj, long j2) {
            return Float.intBitsToFloat(m10255k(obj, j2));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: j */
        public final double mo10252j(Object obj, long j2) {
            return Double.longBitsToDouble(m10256l(obj, j2));
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.t7$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public Unsafe f23484a;

        public c(Unsafe unsafe) {
            this.f23484a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public abstract byte mo10245a(Object obj, long j2);

        /* JADX INFO: renamed from: b */
        public abstract void mo10246b(Object obj, long j2, byte b);

        /* JADX INFO: renamed from: c */
        public abstract void mo10247c(Object obj, long j2, double d);

        /* JADX INFO: renamed from: d */
        public abstract void mo10248d(Object obj, long j2, float f);

        /* JADX INFO: renamed from: e */
        public final void m10253e(Object obj, long j2, int i) {
            this.f23484a.putInt(obj, j2, i);
        }

        /* JADX INFO: renamed from: f */
        public final void m10254f(Object obj, long j2, long j3) {
            this.f23484a.putLong(obj, j2, j3);
        }

        /* JADX INFO: renamed from: g */
        public abstract void mo10249g(Object obj, long j2, boolean z);

        /* JADX INFO: renamed from: h */
        public abstract boolean mo10250h(Object obj, long j2);

        /* JADX INFO: renamed from: i */
        public abstract float mo10251i(Object obj, long j2);

        /* JADX INFO: renamed from: j */
        public abstract double mo10252j(Object obj, long j2);

        /* JADX INFO: renamed from: k */
        public final int m10255k(Object obj, long j2) {
            return this.f23484a.getInt(obj, j2);
        }

        /* JADX INFO: renamed from: l */
        public final long m10256l(Object obj, long j2) {
            return this.f23484a.getLong(obj, j2);
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.t7$d */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static final class d extends c {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: a */
        public final byte mo10245a(Object obj, long j2) {
            return this.f23484a.getByte(obj, j2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: b */
        public final void mo10246b(Object obj, long j2, byte b) {
            this.f23484a.putByte(obj, j2, b);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: c */
        public final void mo10247c(Object obj, long j2, double d) {
            this.f23484a.putDouble(obj, j2, d);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: d */
        public final void mo10248d(Object obj, long j2, float f) {
            this.f23484a.putFloat(obj, j2, f);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: g */
        public final void mo10249g(Object obj, long j2, boolean z) {
            this.f23484a.putBoolean(obj, j2, z);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: h */
        public final boolean mo10250h(Object obj, long j2) {
            return this.f23484a.getBoolean(obj, j2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: i */
        public final float mo10251i(Object obj, long j2) {
            return this.f23484a.getFloat(obj, j2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4353t7.c
        /* JADX INFO: renamed from: j */
        public final double mo10252j(Object obj, long j2) {
            return this.f23484a.getDouble(obj, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x013c  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ba A[Catch: all -> 0x0230, TRY_LEAVE, TryCatch #0 {all -> 0x0230, blocks: (B:41:0x0140, B:44:0x0178, B:48:0x0192, B:51:0x01ba, B:54:0x0207), top: B:75:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0294  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        String str;
        String str2;
        String str3;
        boolean z;
        Unsafe unsafe;
        boolean z2;
        boolean z3;
        Class<?> cls;
        Class<?> cls2;
        Field fieldM10242u;
        c cVar;
        Unsafe unsafeM10234m = m10234m();
        f23475a = unsafeM10234m;
        f23476b = C4363u3.f23497a;
        Class<?> cls3 = Long.TYPE;
        boolean zM10239r = m10239r(cls3);
        f23477c = zM10239r;
        Class<?> cls4 = Integer.TYPE;
        boolean zM10239r2 = m10239r(cls4);
        f23478d = zM10239r2;
        c dVar = null;
        if (unsafeM10234m != null) {
            if (!C4363u3.m10264a()) {
                dVar = new d(unsafeM10234m);
            } else if (zM10239r) {
                dVar = new a(unsafeM10234m);
            } else if (zM10239r2) {
                dVar = new b(unsafeM10234m);
            }
        }
        f23479e = dVar;
        if (unsafeM10234m != null) {
            try {
                Class<?> cls5 = unsafeM10234m.getClass();
                str = "com.google.protobuf.UnsafeUtil";
                try {
                    cls5.getMethod("objectFieldOffset", Field.class);
                    cls5.getMethod("getLong", Object.class, cls3);
                    if (m10242u() == null) {
                        str2 = "getByte";
                        str3 = str;
                    } else {
                        if (C4363u3.m10264a()) {
                            str2 = "getByte";
                        } else {
                            cls5.getMethod("getByte", cls3);
                            Class<?>[] clsArr = new Class[2];
                            clsArr[0] = cls3;
                            str2 = "getByte";
                            try {
                                clsArr[1] = Byte.TYPE;
                                cls5.getMethod("putByte", clsArr);
                                cls5.getMethod("getInt", cls3);
                                cls5.getMethod("putInt", cls3, cls4);
                                cls5.getMethod("getLong", cls3);
                                cls5.getMethod("putLong", cls3, cls3);
                                cls5.getMethod("copyMemory", cls3, cls3, cls3);
                                cls5.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                            } catch (Throwable th) {
                                th = th;
                                Logger logger = Logger.getLogger(C4353t7.class.getName());
                                Level level = Level.WARNING;
                                String strValueOf = String.valueOf(th);
                                StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
                                sb.append("platform method missing - proto runtime falling back to safer methods: ");
                                sb.append(strValueOf);
                                String string = sb.toString();
                                str3 = str;
                                logger.logp(level, str3, "supportsUnsafeByteBufferOperations", string);
                                z = false;
                            }
                        }
                        str3 = str;
                        z = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str2 = "getByte";
                    Logger logger2 = Logger.getLogger(C4353t7.class.getName());
                    Level level2 = Level.WARNING;
                    String strValueOf2 = String.valueOf(th);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 71);
                    sb2.append("platform method missing - proto runtime falling back to safer methods: ");
                    sb2.append(strValueOf2);
                    String string2 = sb2.toString();
                    str3 = str;
                    logger2.logp(level2, str3, "supportsUnsafeByteBufferOperations", string2);
                    z = false;
                    f23480f = z;
                    unsafe = f23475a;
                    if (unsafe != null) {
                        try {
                            cls = unsafe.getClass();
                            cls.getMethod("objectFieldOffset", Field.class);
                            cls.getMethod("arrayBaseOffset", Class.class);
                            cls.getMethod("arrayIndexScale", Class.class);
                            Class<?>[] clsArr2 = new Class[2];
                            clsArr2[0] = Object.class;
                            cls2 = Long.TYPE;
                            z2 = true;
                            try {
                                clsArr2[1] = cls2;
                                cls.getMethod("getInt", clsArr2);
                                Class<?>[] clsArr3 = new Class[3];
                                clsArr3[0] = Object.class;
                                clsArr3[1] = cls2;
                                clsArr3[2] = Integer.TYPE;
                                cls.getMethod("putInt", clsArr3);
                                Class<?>[] clsArr4 = new Class[2];
                                clsArr4[0] = Object.class;
                                clsArr4[1] = cls2;
                                cls.getMethod("getLong", clsArr4);
                                Class<?>[] clsArr5 = new Class[3];
                                clsArr5[0] = Object.class;
                                clsArr5[1] = cls2;
                                clsArr5[2] = cls2;
                                cls.getMethod("putLong", clsArr5);
                                cls.getMethod("getObject", Object.class, cls2);
                                cls.getMethod("putObject", Object.class, cls2, Object.class);
                                if (C4363u3.m10264a()) {
                                    z3 = true;
                                } else {
                                    cls.getMethod(str2, Object.class, cls2);
                                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                                    cls.getMethod("getBoolean", Object.class, cls2);
                                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                                    Class<?>[] clsArr6 = new Class[2];
                                    clsArr6[0] = Object.class;
                                    clsArr6[1] = cls2;
                                    cls.getMethod("getFloat", clsArr6);
                                    Class<?>[] clsArr7 = new Class[3];
                                    clsArr7[0] = Object.class;
                                    clsArr7[1] = cls2;
                                    clsArr7[2] = Float.TYPE;
                                    cls.getMethod("putFloat", clsArr7);
                                    Class<?>[] clsArr8 = new Class[2];
                                    clsArr8[0] = Object.class;
                                    z2 = true;
                                    clsArr8[1] = cls2;
                                    cls.getMethod("getDouble", clsArr8);
                                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                                    z3 = true;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                Logger logger3 = Logger.getLogger(C4353t7.class.getName());
                                Level level3 = Level.WARNING;
                                String strValueOf3 = String.valueOf(th);
                                StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 71);
                                sb3.append("platform method missing - proto runtime falling back to safer methods: ");
                                sb3.append(strValueOf3);
                                logger3.logp(level3, str3, "supportsUnsafeArrayOperations", sb3.toString());
                                z3 = false;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z2 = true;
                        }
                        f23481g = z3;
                        f23482h = m10231j(byte[].class);
                        m10231j(boolean[].class);
                        m10233l(boolean[].class);
                        m10231j(int[].class);
                        m10233l(int[].class);
                        m10231j(long[].class);
                        m10233l(long[].class);
                        m10231j(float[].class);
                        m10233l(float[].class);
                        m10231j(double[].class);
                        m10233l(double[].class);
                        m10231j(Object[].class);
                        m10233l(Object[].class);
                        fieldM10242u = m10242u();
                        if (fieldM10242u != null) {
                            cVar.f23484a.objectFieldOffset(fieldM10242u);
                        }
                        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                            z2 = false;
                        }
                        f23483i = z2;
                    }
                    z3 = false;
                    z2 = true;
                    f23481g = z3;
                    f23482h = m10231j(byte[].class);
                    m10231j(boolean[].class);
                    m10233l(boolean[].class);
                    m10231j(int[].class);
                    m10233l(int[].class);
                    m10231j(long[].class);
                    m10233l(long[].class);
                    m10231j(float[].class);
                    m10233l(float[].class);
                    m10231j(double[].class);
                    m10233l(double[].class);
                    m10231j(Object[].class);
                    m10233l(Object[].class);
                    fieldM10242u = m10242u();
                    if (fieldM10242u != null) {
                        cVar.f23484a.objectFieldOffset(fieldM10242u);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z2 = false;
                    }
                    f23483i = z2;
                }
            } catch (Throwable th5) {
                th = th5;
                str = "com.google.protobuf.UnsafeUtil";
            }
            f23480f = z;
            unsafe = f23475a;
            if (unsafe != null) {
                cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?>[] clsArr9 = new Class[2];
                clsArr9[0] = Object.class;
                cls2 = Long.TYPE;
                z2 = true;
                clsArr9[1] = cls2;
                cls.getMethod("getInt", clsArr9);
                Class<?>[] clsArr10 = new Class[3];
                clsArr10[0] = Object.class;
                clsArr10[1] = cls2;
                clsArr10[2] = Integer.TYPE;
                cls.getMethod("putInt", clsArr10);
                Class<?>[] clsArr11 = new Class[2];
                clsArr11[0] = Object.class;
                clsArr11[1] = cls2;
                cls.getMethod("getLong", clsArr11);
                Class<?>[] clsArr12 = new Class[3];
                clsArr12[0] = Object.class;
                clsArr12[1] = cls2;
                clsArr12[2] = cls2;
                cls.getMethod("putLong", clsArr12);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                if (C4363u3.m10264a()) {
                    z3 = true;
                } else {
                    cls.getMethod(str2, Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    Class<?>[] clsArr13 = new Class[2];
                    clsArr13[0] = Object.class;
                    clsArr13[1] = cls2;
                    cls.getMethod("getFloat", clsArr13);
                    Class<?>[] clsArr14 = new Class[3];
                    clsArr14[0] = Object.class;
                    clsArr14[1] = cls2;
                    clsArr14[2] = Float.TYPE;
                    cls.getMethod("putFloat", clsArr14);
                    Class<?>[] clsArr15 = new Class[2];
                    clsArr15[0] = Object.class;
                    z2 = true;
                    clsArr15[1] = cls2;
                    cls.getMethod("getDouble", clsArr15);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    z3 = true;
                }
                f23481g = z3;
                f23482h = m10231j(byte[].class);
                m10231j(boolean[].class);
                m10233l(boolean[].class);
                m10231j(int[].class);
                m10233l(int[].class);
                m10231j(long[].class);
                m10233l(long[].class);
                m10231j(float[].class);
                m10233l(float[].class);
                m10231j(double[].class);
                m10233l(double[].class);
                m10231j(Object[].class);
                m10233l(Object[].class);
                fieldM10242u = m10242u();
                if (fieldM10242u != null && (cVar = f23479e) != null) {
                    cVar.f23484a.objectFieldOffset(fieldM10242u);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                    z2 = false;
                }
                f23483i = z2;
            }
            z3 = false;
            z2 = true;
            f23481g = z3;
            f23482h = m10231j(byte[].class);
            m10231j(boolean[].class);
            m10233l(boolean[].class);
            m10231j(int[].class);
            m10233l(int[].class);
            m10231j(long[].class);
            m10233l(long[].class);
            m10231j(float[].class);
            m10233l(float[].class);
            m10231j(double[].class);
            m10233l(double[].class);
            m10231j(Object[].class);
            m10233l(Object[].class);
            fieldM10242u = m10242u();
            if (fieldM10242u != null) {
                cVar.f23484a.objectFieldOffset(fieldM10242u);
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                z2 = false;
            }
            f23483i = z2;
        }
        str3 = "com.google.protobuf.UnsafeUtil";
        str2 = "getByte";
        z = false;
        f23480f = z;
        unsafe = f23475a;
        if (unsafe != null) {
            cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?>[] clsArr16 = new Class[2];
            clsArr16[0] = Object.class;
            cls2 = Long.TYPE;
            z2 = true;
            clsArr16[1] = cls2;
            cls.getMethod("getInt", clsArr16);
            Class<?>[] clsArr17 = new Class[3];
            clsArr17[0] = Object.class;
            clsArr17[1] = cls2;
            clsArr17[2] = Integer.TYPE;
            cls.getMethod("putInt", clsArr17);
            Class<?>[] clsArr18 = new Class[2];
            clsArr18[0] = Object.class;
            clsArr18[1] = cls2;
            cls.getMethod("getLong", clsArr18);
            Class<?>[] clsArr19 = new Class[3];
            clsArr19[0] = Object.class;
            clsArr19[1] = cls2;
            clsArr19[2] = cls2;
            cls.getMethod("putLong", clsArr19);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (C4363u3.m10264a()) {
                z3 = true;
            } else {
                cls.getMethod(str2, Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                Class<?>[] clsArr110 = new Class[2];
                clsArr110[0] = Object.class;
                clsArr110[1] = cls2;
                cls.getMethod("getFloat", clsArr110);
                Class<?>[] clsArr111 = new Class[3];
                clsArr111[0] = Object.class;
                clsArr111[1] = cls2;
                clsArr111[2] = Float.TYPE;
                cls.getMethod("putFloat", clsArr111);
                Class<?>[] clsArr112 = new Class[2];
                clsArr112[0] = Object.class;
                z2 = true;
                clsArr112[1] = cls2;
                cls.getMethod("getDouble", clsArr112);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                z3 = true;
            }
            f23481g = z3;
            f23482h = m10231j(byte[].class);
            m10231j(boolean[].class);
            m10233l(boolean[].class);
            m10231j(int[].class);
            m10233l(int[].class);
            m10231j(long[].class);
            m10233l(long[].class);
            m10231j(float[].class);
            m10233l(float[].class);
            m10231j(double[].class);
            m10233l(double[].class);
            m10231j(Object[].class);
            m10233l(Object[].class);
            fieldM10242u = m10242u();
            if (fieldM10242u != null) {
                cVar.f23484a.objectFieldOffset(fieldM10242u);
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                z2 = false;
            }
            f23483i = z2;
        }
        z3 = false;
        z2 = true;
        f23481g = z3;
        f23482h = m10231j(byte[].class);
        m10231j(boolean[].class);
        m10233l(boolean[].class);
        m10231j(int[].class);
        m10233l(int[].class);
        m10231j(long[].class);
        m10233l(long[].class);
        m10231j(float[].class);
        m10233l(float[].class);
        m10231j(double[].class);
        m10233l(double[].class);
        m10231j(Object[].class);
        m10233l(Object[].class);
        fieldM10242u = m10242u();
        if (fieldM10242u != null) {
            cVar.f23484a.objectFieldOffset(fieldM10242u);
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z2 = false;
        }
        f23483i = z2;
    }

    /* JADX INFO: renamed from: a */
    public static byte m10222a(byte[] bArr, long j2) {
        return f23479e.mo10245a(bArr, f23482h + j2);
    }

    /* JADX INFO: renamed from: b */
    public static int m10223b(Object obj, long j2) {
        return f23479e.m10255k(obj, j2);
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m10224c(Class<T> cls) {
        try {
            return (T) f23475a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m10225d(Object obj, long j2, double d2) {
        f23479e.mo10247c(obj, j2, d2);
    }

    /* JADX INFO: renamed from: e */
    public static void m10226e(Object obj, long j2, int i) {
        f23479e.m10253e(obj, j2, i);
    }

    /* JADX INFO: renamed from: f */
    public static void m10227f(Object obj, long j2, long j3) {
        f23479e.m10254f(obj, j2, j3);
    }

    /* JADX INFO: renamed from: g */
    public static void m10228g(Object obj, long j2, Object obj2) {
        f23479e.f23484a.putObject(obj, j2, obj2);
    }

    /* JADX INFO: renamed from: h */
    public static void m10229h(Object obj, long j2, boolean z) {
        f23479e.mo10249g(obj, j2, z);
    }

    /* JADX INFO: renamed from: i */
    public static void m10230i(byte[] bArr, long j2, byte b2) {
        f23479e.mo10246b(bArr, f23482h + j2, b2);
    }

    /* JADX INFO: renamed from: j */
    public static int m10231j(Class<?> cls) {
        if (f23481g) {
            return f23479e.f23484a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public static long m10232k(Object obj, long j2) {
        return f23479e.m10256l(obj, j2);
    }

    /* JADX INFO: renamed from: l */
    public static int m10233l(Class<?> cls) {
        if (f23481g) {
            return f23479e.f23484a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public static Unsafe m10234m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C4339s7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m10235n(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iM10223b = m10223b(obj, j3);
        int i = ((~((int) j2)) & 3) << 3;
        f23479e.m10253e(obj, j3, ((255 & b2) << i) | (iM10223b & (~(255 << i))));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m10236o(Object obj, long j2) {
        return f23479e.mo10250h(obj, j2);
    }

    /* JADX INFO: renamed from: p */
    public static float m10237p(Object obj, long j2) {
        return f23479e.mo10251i(obj, j2);
    }

    /* JADX INFO: renamed from: q */
    public static void m10238q(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i = (((int) j2) & 3) << 3;
        f23479e.m10253e(obj, j3, ((255 & b2) << i) | (m10223b(obj, j3) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: r */
    public static boolean m10239r(Class<?> cls) {
        if (!C4363u3.m10264a()) {
            return false;
        }
        try {
            Class<?> cls2 = f23476b;
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

    /* JADX INFO: renamed from: s */
    public static double m10240s(Object obj, long j2) {
        return f23479e.mo10252j(obj, j2);
    }

    /* JADX INFO: renamed from: t */
    public static Object m10241t(Object obj, long j2) {
        return f23479e.f23484a.getObject(obj, j2);
    }

    /* JADX INFO: renamed from: u */
    public static Field m10242u() {
        Field declaredField;
        Field declaredField2;
        if (C4363u3.m10264a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: v */
    public static byte m10243v(Object obj, long j2) {
        return (byte) (m10223b(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* JADX INFO: renamed from: w */
    public static byte m10244w(Object obj, long j2) {
        return (byte) (m10223b(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }
}
