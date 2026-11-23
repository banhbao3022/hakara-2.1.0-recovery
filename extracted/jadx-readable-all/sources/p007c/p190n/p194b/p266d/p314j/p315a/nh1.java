package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nh1 extends ip1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3715y f17105a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oh1 f17106b;

    public nh1(oh1 oh1Var, InterfaceC3715y interfaceC3715y) {
        this.f17106b = oh1Var;
        this.f17105a = interfaceC3715y;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ip1
    /* JADX INFO: renamed from: n */
    public final void mo6977n() {
        if (this.f17106b.f17621i != null) {
            try {
                this.f17105a.mo8701c();
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
    }
}
