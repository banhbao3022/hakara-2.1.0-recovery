package p007c.p190n.p194b.p266d.p314j.p320f;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: c.n.b.d.j.f.u7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4015u7 {

    /* JADX INFO: renamed from: a */
    public static final Logger f22892a = Logger.getLogger(C4015u7.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Unsafe f22893b;

    /* JADX INFO: renamed from: c */
    public static final Class<?> f22894c;

    /* JADX INFO: renamed from: d */
    public static final boolean f22895d;

    /* JADX INFO: renamed from: e */
    public static final boolean f22896e;

    /* JADX INFO: renamed from: f */
    public static final c f22897f;

    /* JADX INFO: renamed from: g */
    public static final boolean f22898g;

    /* JADX INFO: renamed from: h */
    public static final boolean f22899h;

    /* JADX INFO: renamed from: i */
    public static final long f22900i;

    /* JADX INFO: renamed from: j */
    public static final boolean f22901j;

    /* JADX INFO: renamed from: c.n.b.d.j.f.u7$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class a extends c {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: a */
        public final void mo9255a(Object obj, long j2, double d) {
            m9264d(obj, j2, Double.doubleToLongBits(d));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: b */
        public final void mo9256b(Object obj, long j2, float f) {
            m9263c(obj, j2, Float.floatToIntBits(f));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: e */
        public final void mo9257e(Object obj, long j2, boolean z) {
            if (C4015u7.f22901j) {
                C4015u7.m9236b(obj, j2, z ? (byte) 1 : (byte) 0);
            } else {
                C4015u7.m9240f(obj, j2, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: f */
        public final void mo9258f(Object obj, long j2, byte b) {
            if (C4015u7.f22901j) {
                C4015u7.m9236b(obj, j2, b);
            } else {
                C4015u7.m9240f(obj, j2, b);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: i */
        public final boolean mo9259i(Object obj, long j2) {
            if (C4015u7.f22901j) {
                return C4015u7.m9253s(obj, j2) != 0;
            }
            return C4015u7.m9254t(obj, j2) != 0;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: j */
        public final float mo9260j(Object obj, long j2) {
            return Float.intBitsToFloat(m9265g(obj, j2));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: k */
        public final double mo9261k(Object obj, long j2) {
            return Double.longBitsToDouble(m9266h(obj, j2));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: l */
        public final byte mo9262l(Object obj, long j2) {
            return C4015u7.f22901j ? C4015u7.m9253s(obj, j2) : C4015u7.m9254t(obj, j2);
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.f.u7$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class b extends c {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: a */
        public final void mo9255a(Object obj, long j2, double d) {
            m9264d(obj, j2, Double.doubleToLongBits(d));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: b */
        public final void mo9256b(Object obj, long j2, float f) {
            m9263c(obj, j2, Float.floatToIntBits(f));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: e */
        public final void mo9257e(Object obj, long j2, boolean z) {
            if (C4015u7.f22901j) {
                C4015u7.m9236b(obj, j2, z ? (byte) 1 : (byte) 0);
            } else {
                C4015u7.m9240f(obj, j2, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: f */
        public final void mo9258f(Object obj, long j2, byte b) {
            if (C4015u7.f22901j) {
                C4015u7.m9236b(obj, j2, b);
            } else {
                C4015u7.m9240f(obj, j2, b);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: i */
        public final boolean mo9259i(Object obj, long j2) {
            if (C4015u7.f22901j) {
                return C4015u7.m9253s(obj, j2) != 0;
            }
            return C4015u7.m9254t(obj, j2) != 0;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: j */
        public final float mo9260j(Object obj, long j2) {
            return Float.intBitsToFloat(m9265g(obj, j2));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: k */
        public final double mo9261k(Object obj, long j2) {
            return Double.longBitsToDouble(m9266h(obj, j2));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: l */
        public final byte mo9262l(Object obj, long j2) {
            return C4015u7.f22901j ? C4015u7.m9253s(obj, j2) : C4015u7.m9254t(obj, j2);
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.f.u7$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public Unsafe f22902a;

        public c(Unsafe unsafe) {
            this.f22902a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo9255a(Object obj, long j2, double d);

        /* JADX INFO: renamed from: b */
        public abstract void mo9256b(Object obj, long j2, float f);

        /* JADX INFO: renamed from: c */
        public final void m9263c(Object obj, long j2, int i) {
            this.f22902a.putInt(obj, j2, i);
        }

        /* JADX INFO: renamed from: d */
        public final void m9264d(Object obj, long j2, long j3) {
            this.f22902a.putLong(obj, j2, j3);
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo9257e(Object obj, long j2, boolean z);

        /* JADX INFO: renamed from: f */
        public abstract void mo9258f(Object obj, long j2, byte b);

        /* JADX INFO: renamed from: g */
        public final int m9265g(Object obj, long j2) {
            return this.f22902a.getInt(obj, j2);
        }

        /* JADX INFO: renamed from: h */
        public final long m9266h(Object obj, long j2) {
            return this.f22902a.getLong(obj, j2);
        }

        /* JADX INFO: renamed from: i */
        public abstract boolean mo9259i(Object obj, long j2);

        /* JADX INFO: renamed from: j */
        public abstract float mo9260j(Object obj, long j2);

        /* JADX INFO: renamed from: k */
        public abstract double mo9261k(Object obj, long j2);

        /* JADX INFO: renamed from: l */
        public abstract byte mo9262l(Object obj, long j2);
    }

    /* JADX INFO: renamed from: c.n.b.d.j.f.u7$d */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class d extends c {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: a */
        public final void mo9255a(Object obj, long j2, double d) {
            this.f22902a.putDouble(obj, j2, d);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: b */
        public final void mo9256b(Object obj, long j2, float f) {
            this.f22902a.putFloat(obj, j2, f);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: e */
        public final void mo9257e(Object obj, long j2, boolean z) {
            this.f22902a.putBoolean(obj, j2, z);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: f */
        public final void mo9258f(Object obj, long j2, byte b) {
            this.f22902a.putByte(obj, j2, b);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: i */
        public final boolean mo9259i(Object obj, long j2) {
            return this.f22902a.getBoolean(obj, j2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: j */
        public final float mo9260j(Object obj, long j2) {
            return this.f22902a.getFloat(obj, j2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: k */
        public final double mo9261k(Object obj, long j2) {
            return this.f22902a.getDouble(obj, j2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.C4015u7.c
        /* JADX INFO: renamed from: l */
        public final byte mo9262l(Object obj, long j2) {
            return this.f22902a.getByte(obj, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x013b  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bd A[Catch: all -> 0x0232, TRY_LEAVE, TryCatch #1 {all -> 0x0232, blocks: (B:42:0x0140, B:45:0x0178, B:49:0x0192, B:53:0x01bd, B:56:0x020a), top: B:79:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x028d  */
    /* JADX WARN: Code duplicated, block: B:73:0x029f  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:79:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class cls;
        String str;
        boolean z;
        Unsafe unsafe;
        Class<?> cls2;
        Class<?> cls3;
        boolean z2;
        Field fieldM9249o;
        boolean z3;
        c cVar;
        Unsafe unsafeM9248n = m9248n();
        f22893b = unsafeM9248n;
        f22894c = C4056z3.f22999a;
        Class<?> cls4 = Long.TYPE;
        boolean zM9245k = m9245k(cls4);
        f22895d = zM9245k;
        Class<?> cls5 = Integer.TYPE;
        boolean zM9245k2 = m9245k(cls5);
        f22896e = zM9245k2;
        c dVar = null;
        if (unsafeM9248n != null) {
            if (!C4056z3.m9317a()) {
                dVar = new d(unsafeM9248n);
            } else if (zM9245k) {
                dVar = new a(unsafeM9248n);
            } else if (zM9245k2) {
                dVar = new b(unsafeM9248n);
            }
        }
        f22897f = dVar;
        if (unsafeM9248n != null) {
            try {
                Class<?> cls6 = unsafeM9248n.getClass();
                cls = boolean[].class;
                try {
                    cls6.getMethod("objectFieldOffset", Field.class);
                    cls6.getMethod("getLong", Object.class, cls4);
                    if (m9249o() != null) {
                        if (C4056z3.m9317a()) {
                            str = "getByte";
                        } else {
                            cls6.getMethod("getByte", cls4);
                            Class<?>[] clsArr = new Class[2];
                            clsArr[0] = cls4;
                            str = "getByte";
                            try {
                                clsArr[1] = Byte.TYPE;
                                cls6.getMethod("putByte", clsArr);
                                cls6.getMethod("getInt", cls4);
                                cls6.getMethod("putInt", cls4, cls5);
                                cls6.getMethod("getLong", cls4);
                                cls6.getMethod("putLong", cls4, cls4);
                                cls6.getMethod("copyMemory", cls4, cls4, cls4);
                                cls6.getMethod("copyMemory", Object.class, cls4, Object.class, cls4, cls4);
                            } catch (Throwable th) {
                                th = th;
                                Logger logger = f22892a;
                                Level level = Level.WARNING;
                                String strValueOf = String.valueOf(th);
                                StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
                                sb.append("platform method missing - proto runtime falling back to safer methods: ");
                                sb.append(strValueOf);
                                logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
                                z = false;
                            }
                        }
                        z = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = "getByte";
                    Logger logger2 = f22892a;
                    Level level2 = Level.WARNING;
                    String strValueOf2 = String.valueOf(th);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 71);
                    sb2.append("platform method missing - proto runtime falling back to safer methods: ");
                    sb2.append(strValueOf2);
                    logger2.logp(level2, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb2.toString());
                    z = false;
                    f22898g = z;
                    unsafe = f22893b;
                    if (unsafe != null) {
                        try {
                            cls2 = unsafe.getClass();
                            cls2.getMethod("objectFieldOffset", Field.class);
                            cls2.getMethod("arrayBaseOffset", Class.class);
                            cls2.getMethod("arrayIndexScale", Class.class);
                            Class<?>[] clsArr2 = new Class[2];
                            clsArr2[0] = Object.class;
                            cls3 = Long.TYPE;
                            try {
                                clsArr2[1] = cls3;
                                cls2.getMethod("getInt", clsArr2);
                                Class<?>[] clsArr3 = new Class[3];
                                clsArr3[0] = Object.class;
                                clsArr3[1] = cls3;
                                clsArr3[2] = Integer.TYPE;
                                cls2.getMethod("putInt", clsArr3);
                                Class<?>[] clsArr4 = new Class[2];
                                clsArr4[0] = Object.class;
                                clsArr4[1] = cls3;
                                cls2.getMethod("getLong", clsArr4);
                                Class<?>[] clsArr5 = new Class[3];
                                clsArr5[0] = Object.class;
                                clsArr5[1] = cls3;
                                clsArr5[2] = cls3;
                                cls2.getMethod("putLong", clsArr5);
                                cls2.getMethod("getObject", Object.class, cls3);
                                cls2.getMethod("putObject", Object.class, cls3, Object.class);
                                if (!C4056z3.m9317a()) {
                                    cls2.getMethod(str, Object.class, cls3);
                                    cls2.getMethod("putByte", Object.class, cls3, Byte.TYPE);
                                    cls2.getMethod("getBoolean", Object.class, cls3);
                                    cls2.getMethod("putBoolean", Object.class, cls3, Boolean.TYPE);
                                    Class<?>[] clsArr6 = new Class[2];
                                    clsArr6[0] = Object.class;
                                    clsArr6[1] = cls3;
                                    cls2.getMethod("getFloat", clsArr6);
                                    Class<?>[] clsArr7 = new Class[3];
                                    clsArr7[0] = Object.class;
                                    clsArr7[1] = cls3;
                                    clsArr7[2] = Float.TYPE;
                                    cls2.getMethod("putFloat", clsArr7);
                                    Class<?>[] clsArr8 = new Class[2];
                                    clsArr8[0] = Object.class;
                                    clsArr8[1] = cls3;
                                    cls2.getMethod("getDouble", clsArr8);
                                    cls2.getMethod("putDouble", Object.class, cls3, Double.TYPE);
                                }
                                z2 = true;
                            } catch (Throwable th3) {
                                th = th3;
                                Logger logger3 = f22892a;
                                Level level3 = Level.WARNING;
                                String strValueOf3 = String.valueOf(th);
                                StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 71);
                                sb3.append("platform method missing - proto runtime falling back to safer methods: ");
                                sb3.append(strValueOf3);
                                logger3.logp(level3, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb3.toString());
                                z2 = false;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        f22899h = z2;
                        f22900i = m9242h(byte[].class);
                        m9242h(cls);
                        m9243i(cls);
                        m9242h(int[].class);
                        m9243i(int[].class);
                        m9242h(long[].class);
                        m9243i(long[].class);
                        m9242h(float[].class);
                        m9243i(float[].class);
                        m9242h(double[].class);
                        m9243i(double[].class);
                        m9242h(Object[].class);
                        m9243i(Object[].class);
                        fieldM9249o = m9249o();
                        if (fieldM9249o != null) {
                            cVar.f22902a.objectFieldOffset(fieldM9249o);
                        }
                        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        f22901j = z3;
                    }
                    z2 = false;
                    f22899h = z2;
                    f22900i = m9242h(byte[].class);
                    m9242h(cls);
                    m9243i(cls);
                    m9242h(int[].class);
                    m9243i(int[].class);
                    m9242h(long[].class);
                    m9243i(long[].class);
                    m9242h(float[].class);
                    m9243i(float[].class);
                    m9242h(double[].class);
                    m9243i(double[].class);
                    m9242h(Object[].class);
                    m9243i(Object[].class);
                    fieldM9249o = m9249o();
                    if (fieldM9249o != null) {
                        cVar.f22902a.objectFieldOffset(fieldM9249o);
                    }
                    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    f22901j = z3;
                }
            } catch (Throwable th5) {
                th = th5;
                cls = boolean[].class;
            }
            f22898g = z;
            unsafe = f22893b;
            if (unsafe != null) {
                cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("arrayBaseOffset", Class.class);
                cls2.getMethod("arrayIndexScale", Class.class);
                Class<?>[] clsArr9 = new Class[2];
                clsArr9[0] = Object.class;
                cls3 = Long.TYPE;
                clsArr9[1] = cls3;
                cls2.getMethod("getInt", clsArr9);
                Class<?>[] clsArr10 = new Class[3];
                clsArr10[0] = Object.class;
                clsArr10[1] = cls3;
                clsArr10[2] = Integer.TYPE;
                cls2.getMethod("putInt", clsArr10);
                Class<?>[] clsArr11 = new Class[2];
                clsArr11[0] = Object.class;
                clsArr11[1] = cls3;
                cls2.getMethod("getLong", clsArr11);
                Class<?>[] clsArr12 = new Class[3];
                clsArr12[0] = Object.class;
                clsArr12[1] = cls3;
                clsArr12[2] = cls3;
                cls2.getMethod("putLong", clsArr12);
                cls2.getMethod("getObject", Object.class, cls3);
                cls2.getMethod("putObject", Object.class, cls3, Object.class);
                if (!C4056z3.m9317a()) {
                    cls2.getMethod(str, Object.class, cls3);
                    cls2.getMethod("putByte", Object.class, cls3, Byte.TYPE);
                    cls2.getMethod("getBoolean", Object.class, cls3);
                    cls2.getMethod("putBoolean", Object.class, cls3, Boolean.TYPE);
                    Class<?>[] clsArr13 = new Class[2];
                    clsArr13[0] = Object.class;
                    clsArr13[1] = cls3;
                    cls2.getMethod("getFloat", clsArr13);
                    Class<?>[] clsArr14 = new Class[3];
                    clsArr14[0] = Object.class;
                    clsArr14[1] = cls3;
                    clsArr14[2] = Float.TYPE;
                    cls2.getMethod("putFloat", clsArr14);
                    Class<?>[] clsArr15 = new Class[2];
                    clsArr15[0] = Object.class;
                    clsArr15[1] = cls3;
                    cls2.getMethod("getDouble", clsArr15);
                    cls2.getMethod("putDouble", Object.class, cls3, Double.TYPE);
                }
                z2 = true;
                f22899h = z2;
                f22900i = m9242h(byte[].class);
                m9242h(cls);
                m9243i(cls);
                m9242h(int[].class);
                m9243i(int[].class);
                m9242h(long[].class);
                m9243i(long[].class);
                m9242h(float[].class);
                m9243i(float[].class);
                m9242h(double[].class);
                m9243i(double[].class);
                m9242h(Object[].class);
                m9243i(Object[].class);
                fieldM9249o = m9249o();
                if (fieldM9249o != null && (cVar = f22897f) != null) {
                    cVar.f22902a.objectFieldOffset(fieldM9249o);
                }
                if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                f22901j = z3;
            }
            z2 = false;
            f22899h = z2;
            f22900i = m9242h(byte[].class);
            m9242h(cls);
            m9243i(cls);
            m9242h(int[].class);
            m9243i(int[].class);
            m9242h(long[].class);
            m9243i(long[].class);
            m9242h(float[].class);
            m9243i(float[].class);
            m9242h(double[].class);
            m9243i(double[].class);
            m9242h(Object[].class);
            m9243i(Object[].class);
            fieldM9249o = m9249o();
            if (fieldM9249o != null) {
                cVar.f22902a.objectFieldOffset(fieldM9249o);
            }
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                z3 = true;
            } else {
                z3 = false;
            }
            f22901j = z3;
        }
        cls = boolean[].class;
        str = "getByte";
        z = false;
        f22898g = z;
        unsafe = f22893b;
        if (unsafe != null) {
            cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", Field.class);
            cls2.getMethod("arrayBaseOffset", Class.class);
            cls2.getMethod("arrayIndexScale", Class.class);
            Class<?>[] clsArr16 = new Class[2];
            clsArr16[0] = Object.class;
            cls3 = Long.TYPE;
            clsArr16[1] = cls3;
            cls2.getMethod("getInt", clsArr16);
            Class<?>[] clsArr17 = new Class[3];
            clsArr17[0] = Object.class;
            clsArr17[1] = cls3;
            clsArr17[2] = Integer.TYPE;
            cls2.getMethod("putInt", clsArr17);
            Class<?>[] clsArr18 = new Class[2];
            clsArr18[0] = Object.class;
            clsArr18[1] = cls3;
            cls2.getMethod("getLong", clsArr18);
            Class<?>[] clsArr19 = new Class[3];
            clsArr19[0] = Object.class;
            clsArr19[1] = cls3;
            clsArr19[2] = cls3;
            cls2.getMethod("putLong", clsArr19);
            cls2.getMethod("getObject", Object.class, cls3);
            cls2.getMethod("putObject", Object.class, cls3, Object.class);
            if (!C4056z3.m9317a()) {
                cls2.getMethod(str, Object.class, cls3);
                cls2.getMethod("putByte", Object.class, cls3, Byte.TYPE);
                cls2.getMethod("getBoolean", Object.class, cls3);
                cls2.getMethod("putBoolean", Object.class, cls3, Boolean.TYPE);
                Class<?>[] clsArr110 = new Class[2];
                clsArr110[0] = Object.class;
                clsArr110[1] = cls3;
                cls2.getMethod("getFloat", clsArr110);
                Class<?>[] clsArr111 = new Class[3];
                clsArr111[0] = Object.class;
                clsArr111[1] = cls3;
                clsArr111[2] = Float.TYPE;
                cls2.getMethod("putFloat", clsArr111);
                Class<?>[] clsArr112 = new Class[2];
                clsArr112[0] = Object.class;
                clsArr112[1] = cls3;
                cls2.getMethod("getDouble", clsArr112);
                cls2.getMethod("putDouble", Object.class, cls3, Double.TYPE);
            }
            z2 = true;
            f22899h = z2;
            f22900i = m9242h(byte[].class);
            m9242h(cls);
            m9243i(cls);
            m9242h(int[].class);
            m9243i(int[].class);
            m9242h(long[].class);
            m9243i(long[].class);
            m9242h(float[].class);
            m9243i(float[].class);
            m9242h(double[].class);
            m9243i(double[].class);
            m9242h(Object[].class);
            m9243i(Object[].class);
            fieldM9249o = m9249o();
            if (fieldM9249o != null) {
                cVar.f22902a.objectFieldOffset(fieldM9249o);
            }
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                z3 = true;
            } else {
                z3 = false;
            }
            f22901j = z3;
        }
        z2 = false;
        f22899h = z2;
        f22900i = m9242h(byte[].class);
        m9242h(cls);
        m9243i(cls);
        m9242h(int[].class);
        m9243i(int[].class);
        m9242h(long[].class);
        m9243i(long[].class);
        m9242h(float[].class);
        m9243i(float[].class);
        m9242h(double[].class);
        m9243i(double[].class);
        m9242h(Object[].class);
        m9243i(Object[].class);
        fieldM9249o = m9249o();
        if (fieldM9249o != null) {
            cVar.f22902a.objectFieldOffset(fieldM9249o);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z3 = true;
        } else {
            z3 = false;
        }
        f22901j = z3;
    }

    /* JADX INFO: renamed from: a */
    public static byte m9235a(byte[] bArr, long j2) {
        return f22897f.mo9262l(bArr, f22900i + j2);
    }

    /* JADX INFO: renamed from: b */
    public static void m9236b(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iM9244j = m9244j(obj, j3);
        int i = ((~((int) j2)) & 3) << 3;
        f22897f.m9263c(obj, j3, ((255 & b2) << i) | (iM9244j & (~(255 << i))));
    }

    /* JADX INFO: renamed from: c */
    public static void m9237c(Object obj, long j2, long j3) {
        f22897f.m9264d(obj, j2, j3);
    }

    /* JADX INFO: renamed from: d */
    public static void m9238d(Object obj, long j2, Object obj2) {
        f22897f.f22902a.putObject(obj, j2, obj2);
    }

    /* JADX INFO: renamed from: e */
    public static void m9239e(byte[] bArr, long j2, byte b2) {
        f22897f.mo9258f(bArr, f22900i + j2, b2);
    }

    /* JADX INFO: renamed from: f */
    public static void m9240f(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i = (((int) j2) & 3) << 3;
        f22897f.m9263c(obj, j3, ((255 & b2) << i) | (m9244j(obj, j3) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m9241g(Class<T> cls) {
        try {
            return (T) f22893b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m9242h(Class<?> cls) {
        if (f22899h) {
            return f22897f.f22902a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static int m9243i(Class<?> cls) {
        if (f22899h) {
            return f22897f.f22902a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public static int m9244j(Object obj, long j2) {
        return f22897f.m9265g(obj, j2);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m9245k(Class<?> cls) {
        if (!C4056z3.m9317a()) {
            return false;
        }
        try {
            Class<?> cls2 = f22894c;
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

    /* JADX INFO: renamed from: l */
    public static long m9246l(Object obj, long j2) {
        return f22897f.m9266h(obj, j2);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m9247m(Object obj, long j2) {
        return f22897f.mo9259i(obj, j2);
    }

    /* JADX INFO: renamed from: n */
    public static Unsafe m9248n() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C3996s7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static Field m9249o() {
        Field declaredField;
        Field declaredField2;
        if (C4056z3.m9317a()) {
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

    /* JADX INFO: renamed from: p */
    public static float m9250p(Object obj, long j2) {
        return f22897f.mo9260j(obj, j2);
    }

    /* JADX INFO: renamed from: q */
    public static double m9251q(Object obj, long j2) {
        return f22897f.mo9261k(obj, j2);
    }

    /* JADX INFO: renamed from: r */
    public static Object m9252r(Object obj, long j2) {
        return f22897f.f22902a.getObject(obj, j2);
    }

    /* JADX INFO: renamed from: s */
    public static byte m9253s(Object obj, long j2) {
        return (byte) (m9244j(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* JADX INFO: renamed from: t */
    public static byte m9254t(Object obj, long j2) {
        return (byte) (m9244j(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }
}
