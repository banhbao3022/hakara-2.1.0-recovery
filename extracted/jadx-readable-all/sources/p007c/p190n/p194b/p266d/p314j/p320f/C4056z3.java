package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.z3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4056z3 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f22999a;

    /* JADX INFO: renamed from: b */
    public static final boolean f23000b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f22999a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f23000b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9317a() {
        return (f22999a == null || f23000b) ? false : true;
    }
}
