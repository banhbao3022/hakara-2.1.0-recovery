package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p191a.p192d.C1270l;
import p007c.p190n.p194b.p266d.p267a.p279w.InterfaceC2203f;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.m7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3278m7 extends AbstractBinderC3388p6 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3352o7 f16690f;

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3425q6
    /* JADX INFO: renamed from: s6 */
    public final void mo7660s6(InterfaceC3129i6 interfaceC3129i6, String str) {
        C3352o7 c3352o7 = this.f16690f;
        InterfaceC2203f.a aVar = c3352o7.f17547b;
        if (aVar == null) {
            return;
        }
        InterfaceC2203f interfaceC2203fM7965a = C3352o7.m7965a(c3352o7, interfaceC3129i6);
        C3359oe c3359oe = (C3359oe) ((C1270l) aVar).f5511g;
        Objects.requireNonNull(c3359oe);
        if (!(interfaceC2203fM7965a instanceof C3166j6)) {
            C2622l.m5226A3("Unexpected native custom template ad type.");
            return;
        }
        try {
            c3359oe.f17602a.mo6587i5(((C3166j6) interfaceC2203fM7965a).f15491a, str);
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }
}
