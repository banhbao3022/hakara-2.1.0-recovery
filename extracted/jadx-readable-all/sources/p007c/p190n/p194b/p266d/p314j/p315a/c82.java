package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class c82 implements k92 {

    /* JADX INFO: renamed from: a */
    public static final c82 f12957a = new c82();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.k92
    /* JADX INFO: renamed from: a */
    public final boolean mo6149a(Class<?> cls) {
        return g82.class.isAssignableFrom(cls);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.k92
    /* JADX INFO: renamed from: b */
    public final j92 mo6150b(Class<?> cls) {
        if (!g82.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (j92) g82.m6956s(cls.asSubclass(g82.class)).mo5663u(3, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }
}
