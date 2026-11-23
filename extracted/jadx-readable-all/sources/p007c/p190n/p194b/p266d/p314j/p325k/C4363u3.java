package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.u3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4363u3 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f23497a;

    /* JADX INFO: renamed from: b */
    public static final boolean f23498b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f23497a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f23498b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10264a() {
        return (f23497a == null || f23498b) ? false : true;
    }
}
