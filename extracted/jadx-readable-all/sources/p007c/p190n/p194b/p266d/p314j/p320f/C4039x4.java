package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.x4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4039x4 implements InterfaceC3905j6 {

    /* JADX INFO: renamed from: a */
    public static final C4039x4 f22986a = new C4039x4();

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3905j6
    /* JADX INFO: renamed from: a */
    public final InterfaceC3875g6 mo8959a(Class<?> cls) {
        if (!AbstractC4057z4.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC3875g6) AbstractC4057z4.m9320l(cls.asSubclass(AbstractC4057z4.class)).mo8926h(3, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3905j6
    /* JADX INFO: renamed from: d */
    public final boolean mo8960d(Class<?> cls) {
        return AbstractC4057z4.class.isAssignableFrom(cls);
    }
}
