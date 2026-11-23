package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.util.Log;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2745m;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.f0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2657f0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2602b f11654f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2659g.b f11655g;

    public RunnableC2657f0(C2659g.b bVar, C2602b c2602b) {
        this.f11655g = bVar;
        this.f11654f = c2602b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2745m interfaceC2745m;
        C2659g.b bVar = this.f11655g;
        C2659g.a<?> aVar = C2659g.this.f11668p.get(bVar.f11687b);
        if (aVar == null) {
            return;
        }
        if (!this.f11654f.m5197K()) {
            aVar.mo5517W(this.f11654f);
            return;
        }
        C2659g.b bVar2 = this.f11655g;
        bVar2.f11690e = true;
        if (bVar2.f11686a.mo5480m()) {
            C2659g.b bVar3 = this.f11655g;
            if (!bVar3.f11690e || (interfaceC2745m = bVar3.f11688c) == null) {
                return;
            }
            bVar3.f11686a.m5473b(interfaceC2745m, bVar3.f11689d);
            return;
        }
        try {
            C2628a.f fVar = this.f11655g.f11686a;
            fVar.m5473b(null, fVar.mo5472a());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            aVar.mo5517W(new C2602b(10));
        }
    }
}
