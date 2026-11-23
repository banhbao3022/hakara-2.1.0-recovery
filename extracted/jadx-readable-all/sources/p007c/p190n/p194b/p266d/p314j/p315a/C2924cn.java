package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.AbstractC2245a0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.cn */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2924cn extends AbstractC2245a0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2998en f13060b;

    public C2924cn(C2998en c2998en) {
        this.f13060b = c2998en;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.AbstractC2245a0
    /* JADX INFO: renamed from: a */
    public final void mo4671a() {
        C2998en c2998en = this.f13060b;
        C3089h3 c3089h3 = new C3089h3(c2998en.f13616e, c2998en.f13617f.f21615f);
        synchronized (this.f13060b.f13612a) {
            try {
                C3200k3 c3200k3 = C2330u.f10884a.f10898m;
                C3200k3.m7431a(this.f13060b.f13618g, c3089h3);
            } catch (IllegalArgumentException e) {
                C2622l.m5241D3("Cannot config CSI reporter.", e);
            }
        }
    }
}
