package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.k.w5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4391w5 extends AbstractC4378v5 {
    public C4391w5(C4365u5 c4365u5) {
        super(null);
    }

    /* JADX INFO: renamed from: d */
    public static <E> InterfaceC4197i5<E> m10310d(Object obj, long j2) {
        return (InterfaceC4197i5) C4353t7.m10241t(obj, j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4378v5
    /* JADX INFO: renamed from: a */
    public final <L> List<L> mo10285a(Object obj, long j2) {
        InterfaceC4197i5 interfaceC4197i5M10310d = m10310d(obj, j2);
        if (interfaceC4197i5M10310d.zza()) {
            return interfaceC4197i5M10310d;
        }
        int size = interfaceC4197i5M10310d.size();
        InterfaceC4197i5 interfaceC4197i5Mo9340b = interfaceC4197i5M10310d.mo9340b(size == 0 ? 10 : size << 1);
        C4353t7.m10228g(obj, j2, interfaceC4197i5Mo9340b);
        return interfaceC4197i5Mo9340b;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4378v5
    /* JADX INFO: renamed from: b */
    public final <E> void mo10286b(Object obj, Object obj2, long j2) {
        InterfaceC4197i5 interfaceC4197i5M10310d = m10310d(obj, j2);
        InterfaceC4197i5 interfaceC4197i5M10310d2 = m10310d(obj2, j2);
        int size = interfaceC4197i5M10310d.size();
        int size2 = interfaceC4197i5M10310d2.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC4197i5M10310d.zza()) {
                interfaceC4197i5M10310d = interfaceC4197i5M10310d.mo9340b(size2 + size);
            }
            interfaceC4197i5M10310d.addAll(interfaceC4197i5M10310d2);
        }
        if (size > 0) {
            interfaceC4197i5M10310d2 = interfaceC4197i5M10310d;
        }
        C4353t7.m10228g(obj, j2, interfaceC4197i5M10310d2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4378v5
    /* JADX INFO: renamed from: c */
    public final void mo10287c(Object obj, long j2) {
        m10310d(obj, j2).mo9833E();
    }
}
