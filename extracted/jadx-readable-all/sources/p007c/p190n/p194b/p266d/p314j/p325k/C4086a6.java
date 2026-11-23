package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.a6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4086a6 implements InterfaceC4198i6 {

    /* JADX INFO: renamed from: a */
    public InterfaceC4198i6[] f23030a;

    public C4086a6(InterfaceC4198i6... interfaceC4198i6Arr) {
        this.f23030a = interfaceC4198i6Arr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4198i6
    /* JADX INFO: renamed from: a */
    public final InterfaceC4212j6 mo9344a(Class<?> cls) {
        for (InterfaceC4198i6 interfaceC4198i6 : this.f23030a) {
            if (interfaceC4198i6.mo9345d(cls)) {
                return interfaceC4198i6.mo9344a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4198i6
    /* JADX INFO: renamed from: d */
    public final boolean mo9345d(Class<?> cls) {
        for (InterfaceC4198i6 interfaceC4198i6 : this.f23030a) {
            if (interfaceC4198i6.mo9345d(cls)) {
                return true;
            }
        }
        return false;
    }
}
