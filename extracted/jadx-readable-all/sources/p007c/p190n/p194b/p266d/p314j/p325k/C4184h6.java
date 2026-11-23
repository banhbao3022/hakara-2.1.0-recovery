package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.k.h6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4184h6 implements InterfaceC4142e6 {
    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4142e6
    /* JADX INFO: renamed from: a */
    public final Map<?, ?> mo9558a(Object obj) {
        return (C4156f6) obj;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4142e6
    /* JADX INFO: renamed from: b */
    public final Map<?, ?> mo9559b(Object obj) {
        return (C4156f6) obj;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4142e6
    /* JADX INFO: renamed from: c */
    public final Object mo9560c(Object obj) {
        C4156f6 c4156f6 = C4156f6.f23158f;
        return c4156f6.isEmpty() ? new C4156f6() : new C4156f6(c4156f6);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4142e6
    /* JADX INFO: renamed from: d */
    public final Object mo9561d(Object obj) {
        ((C4156f6) obj).f23159g = false;
        return obj;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4142e6
    /* JADX INFO: renamed from: e */
    public final boolean mo9562e(Object obj) {
        return !((C4156f6) obj).f23159g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4142e6
    /* JADX INFO: renamed from: f */
    public final Object mo9563f(Object obj, Object obj2) {
        C4156f6 c4156f6 = (C4156f6) obj;
        C4156f6 c4156f7 = (C4156f6) obj2;
        if (!c4156f7.isEmpty()) {
            if (!c4156f6.f23159g) {
                c4156f6 = c4156f6.isEmpty() ? new C4156f6() : new C4156f6(c4156f6);
            }
            c4156f6.m9624b();
            if (!c4156f7.isEmpty()) {
                c4156f6.putAll(c4156f7);
            }
        }
        return c4156f6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4142e6
    /* JADX INFO: renamed from: g */
    public final C4114c6<?, ?> mo9564g(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4142e6
    /* JADX INFO: renamed from: h */
    public final int mo9565h(int i, Object obj, Object obj2) {
        C4156f6 c4156f6 = (C4156f6) obj;
        if (c4156f6.isEmpty()) {
            return 0;
        }
        Iterator it = c4156f6.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
