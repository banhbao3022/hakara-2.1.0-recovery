package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.x5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4040x5 extends AbstractC3984r5 {
    public C4040x5(C4013u5 c4013u5) {
        super(null);
    }

    /* JADX INFO: renamed from: c */
    public static <E> InterfaceC3894i5<E> m9299c(Object obj, long j2) {
        return (InterfaceC3894i5) C4015u7.m9252r(obj, j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3984r5
    /* JADX INFO: renamed from: a */
    public final void mo9207a(Object obj, long j2) {
        m9299c(obj, j2).mo8929w();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3984r5
    /* JADX INFO: renamed from: b */
    public final <E> void mo9208b(Object obj, Object obj2, long j2) {
        InterfaceC3894i5 interfaceC3894i5M9299c = m9299c(obj, j2);
        InterfaceC3894i5 interfaceC3894i5M9299c2 = m9299c(obj2, j2);
        int size = interfaceC3894i5M9299c.size();
        int size2 = interfaceC3894i5M9299c2.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC3894i5M9299c.mo8927I()) {
                interfaceC3894i5M9299c = interfaceC3894i5M9299c.mo8958r(size2 + size);
            }
            interfaceC3894i5M9299c.addAll(interfaceC3894i5M9299c2);
        }
        if (size > 0) {
            interfaceC3894i5M9299c2 = interfaceC3894i5M9299c;
        }
        C4015u7.m9238d(obj, j2, interfaceC3894i5M9299c2);
    }
}
