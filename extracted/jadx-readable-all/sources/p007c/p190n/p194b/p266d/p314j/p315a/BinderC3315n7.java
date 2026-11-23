package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p191a.p192d.C1270l;
import p007c.p190n.p194b.p266d.p267a.p279w.InterfaceC2203f;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.n7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3315n7 extends AbstractBinderC3499s6 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3352o7 f17033f;

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3536t6
    /* JADX INFO: renamed from: W5 */
    public final void mo7779W5(InterfaceC3129i6 interfaceC3129i6) {
        String strMo6366g;
        C3352o7 c3352o7 = this.f17033f;
        InterfaceC2203f.b bVar = c3352o7.f17546a;
        InterfaceC2203f interfaceC2203fM7965a = C3352o7.m7965a(c3352o7, interfaceC3129i6);
        C3359oe c3359oe = (C3359oe) ((C1270l) bVar).f5511g;
        Objects.requireNonNull(c3359oe);
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        try {
            strMo6366g = ((C3166j6) interfaceC2203fM7965a).f15491a.mo6366g();
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
            strMo6366g = null;
        }
        String strValueOf = String.valueOf(strMo6366g);
        C2622l.m5318U2(strValueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(strValueOf) : new String("Adapter called onAdLoaded with template id "));
        c3359oe.f17604c = interfaceC2203fM7965a;
        try {
            c3359oe.f17602a.mo6585h();
        } catch (RemoteException e2) {
            C2622l.m5271J3("#007 Could not call remote method.", e2);
        }
    }
}
