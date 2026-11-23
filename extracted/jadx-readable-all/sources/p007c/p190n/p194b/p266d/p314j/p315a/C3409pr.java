package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: renamed from: c.n.b.d.j.a.pr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3409pr implements Iterable<C3372or> {

    /* JADX INFO: renamed from: f */
    public final List<C3372or> f18081f = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static final C3372or m8151c(InterfaceC3704xp interfaceC3704xp) {
        for (C3372or c3372or : C2330u.f10884a.f10885A) {
            if (c3372or.f17723b == interfaceC3704xp) {
                return c3372or;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m8152f(InterfaceC3704xp interfaceC3704xp) {
        C3372or c3372orM8151c = m8151c(interfaceC3704xp);
        if (c3372orM8151c == null) {
            return false;
        }
        c3372orM8151c.f17724c.mo5842n();
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<C3372or> iterator() {
        return this.f18081f.iterator();
    }
}
