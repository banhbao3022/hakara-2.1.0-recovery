package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ih1 extends ip1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3716y0 f15184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kh1 f15185b;

    public ih1(kh1 kh1Var, InterfaceC3716y0 interfaceC3716y0) {
        this.f15185b = kh1Var;
        this.f15184a = interfaceC3716y0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ip1
    /* JADX INFO: renamed from: n */
    public final void mo6977n() {
        if (this.f15185b.f15948l != null) {
            try {
                this.f15184a.mo8602c();
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
    }
}
