package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.c5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4113c5 implements InterfaceC4198i6 {

    /* JADX INFO: renamed from: a */
    public static final C4113c5 f23103a = new C4113c5();

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4198i6
    /* JADX INFO: renamed from: a */
    public final InterfaceC4212j6 mo9344a(Class<?> cls) {
        if (!AbstractC4099b5.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC4212j6) AbstractC4099b5.m9409k(cls.asSubclass(AbstractC4099b5.class)).mo9399n(3, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4198i6
    /* JADX INFO: renamed from: d */
    public final boolean mo9345d(Class<?> cls) {
        return AbstractC4099b5.class.isAssignableFrom(cls);
    }
}
