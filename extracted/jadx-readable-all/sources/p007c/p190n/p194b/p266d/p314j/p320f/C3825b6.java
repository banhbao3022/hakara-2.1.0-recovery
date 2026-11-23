package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.b6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3825b6 implements InterfaceC3905j6 {

    /* JADX INFO: renamed from: a */
    public InterfaceC3905j6[] f22525a;

    public C3825b6(InterfaceC3905j6... interfaceC3905j6Arr) {
        this.f22525a = interfaceC3905j6Arr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3905j6
    /* JADX INFO: renamed from: a */
    public final InterfaceC3875g6 mo8959a(Class<?> cls) {
        for (InterfaceC3905j6 interfaceC3905j6 : this.f22525a) {
            if (interfaceC3905j6.mo8960d(cls)) {
                return interfaceC3905j6.mo8959a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3905j6
    /* JADX INFO: renamed from: d */
    public final boolean mo8960d(Class<?> cls) {
        for (InterfaceC3905j6 interfaceC3905j6 : this.f22525a) {
            if (interfaceC3905j6.mo8960d(cls)) {
                return true;
            }
        }
        return false;
    }
}
