package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bu1 extends st1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f12865a;

    /* JADX INFO: renamed from: b */
    public static final long f12866b;

    /* JADX INFO: renamed from: c */
    public static final long f12867c;

    /* JADX INFO: renamed from: d */
    public static final long f12868d;

    /* JADX INFO: renamed from: e */
    public static final long f12869e;

    /* JADX INFO: renamed from: f */
    public static final long f12870f;

    /* JADX INFO: renamed from: c.n.b.d.j.a.bu1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
    public class C2894a implements PrivilegedExceptionAction<Unsafe> {
        /* JADX INFO: renamed from: a */
        public static final Unsafe m6105a() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return m6105a();
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C2894a());
        }
        try {
            f12867c = unsafe.objectFieldOffset(du1.class.getDeclaredField("l"));
            f12866b = unsafe.objectFieldOffset(du1.class.getDeclaredField("k"));
            f12868d = unsafe.objectFieldOffset(du1.class.getDeclaredField("j"));
            f12869e = unsafe.objectFieldOffset(cu1.class.getDeclaredField("b"));
            f12870f = unsafe.objectFieldOffset(cu1.class.getDeclaredField("c"));
            f12865a = unsafe;
        } catch (Exception e2) {
            Object obj = ms1.f16843a;
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            }
            if (!(e2 instanceof Error)) {
                throw new RuntimeException(e2);
            }
            throw ((Error) e2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: a */
    public final void mo6100a(cu1 cu1Var, Thread thread) {
        f12865a.putObject(cu1Var, f12869e, thread);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: b */
    public final void mo6101b(cu1 cu1Var, cu1 cu1Var2) {
        f12865a.putObject(cu1Var, f12870f, cu1Var2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: c */
    public final boolean mo6102c(du1<?> du1Var, cu1 cu1Var, cu1 cu1Var2) {
        return f12865a.compareAndSwapObject(du1Var, f12867c, cu1Var, cu1Var2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: d */
    public final boolean mo6103d(du1<?> du1Var, vt1 vt1Var, vt1 vt1Var2) {
        return f12865a.compareAndSwapObject(du1Var, f12866b, vt1Var, vt1Var2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: e */
    public final boolean mo6104e(du1<?> du1Var, Object obj, Object obj2) {
        return f12865a.compareAndSwapObject(du1Var, f12868d, obj, obj2);
    }
}
