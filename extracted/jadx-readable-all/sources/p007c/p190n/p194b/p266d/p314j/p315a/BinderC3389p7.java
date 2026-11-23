package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Objects;
import p007c.p190n.p191a.p192d.C1266h;
import p007c.p190n.p191a.p192d.C1270l;
import p007c.p190n.p194b.p266d.p267a.C2193t;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2119m;
import p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.p7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3389p7 extends AbstractBinderC3722y6 {

    /* JADX INFO: renamed from: f */
    public final AbstractC2205h.a f17871f;

    public BinderC3389p7(AbstractC2205h.a aVar) {
        this.f17871f = aVar;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3759z6
    /* JADX INFO: renamed from: f6 */
    public final void mo8080f6(InterfaceC3130i7 interfaceC3130i7) {
        AbstractC2205h.a aVar = this.f17871f;
        C3167j7 c3167j7 = new C3167j7(interfaceC3130i7);
        C1270l c1270l = (C1270l) aVar;
        InterfaceC2119m interfaceC2119m = c1270l.f5511g;
        AbstractAdViewAdapter abstractAdViewAdapter = c1270l.f5510f;
        C1266h c1266h = new C1266h(c3167j7);
        C3359oe c3359oe = (C3359oe) interfaceC2119m;
        Objects.requireNonNull(c3359oe);
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        C2622l.m5318U2("Adapter called onAdLoaded.");
        c3359oe.f17603b = c1266h;
        if (!(abstractAdViewAdapter instanceof AdMobAdapter)) {
            new C2193t().m4636b(new BinderC2989ee());
        }
        try {
            c3359oe.f17602a.mo6585h();
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }
}
