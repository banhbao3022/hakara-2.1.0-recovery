package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import p007c.p190n.p194b.p266d.p290d.C2395i;
import p007c.p190n.p194b.p266d.p298f.p301p.C2708a;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2448c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2496x f11211a = new a(null);

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.c$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public class a extends InterfaceC2496x.a {
        public a(C2449c0 c2449c0) {
        }

        @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.InterfaceC2496x
        /* JADX INFO: renamed from: r0 */
        public final InterfaceC2799a mo5040r0() {
            return new BinderC2800b(C2448c.this);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public C2708a m5039a(C2395i c2395i) {
        if (c2395i == null || !c2395i.m4964L()) {
            return null;
        }
        return c2395i.f11047h.get(0);
    }
}
