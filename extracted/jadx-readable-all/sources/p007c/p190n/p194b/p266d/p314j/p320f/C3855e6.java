package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.f.e6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3855e6 implements InterfaceC3865f6 {
    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3865f6
    /* JADX INFO: renamed from: a */
    public final Object mo9016a(Object obj, Object obj2) {
        C3835c6 c3835c6 = (C3835c6) obj;
        C3835c6 c3835c7 = (C3835c6) obj2;
        if (!c3835c7.isEmpty()) {
            if (!c3835c6.f22533f) {
                c3835c6 = c3835c6.isEmpty() ? new C3835c6() : new C3835c6(c3835c6);
            }
            c3835c6.m9009b();
            if (!c3835c7.isEmpty()) {
                c3835c6.putAll(c3835c7);
            }
        }
        return c3835c6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3865f6
    /* JADX INFO: renamed from: b */
    public final int mo9017b(int i, Object obj, Object obj2) {
        C3835c6 c3835c6 = (C3835c6) obj;
        if (c3835c6.isEmpty()) {
            return 0;
        }
        Iterator it = c3835c6.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3865f6
    /* JADX INFO: renamed from: c */
    public final C3845d6<?, ?> mo9018c(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3865f6
    /* JADX INFO: renamed from: g */
    public final Object mo9019g(Object obj) {
        ((C3835c6) obj).f22533f = false;
        return obj;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3865f6
    /* JADX INFO: renamed from: h */
    public final Map<?, ?> mo9020h(Object obj) {
        return (C3835c6) obj;
    }
}
