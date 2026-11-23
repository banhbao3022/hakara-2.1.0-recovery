package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p191a.EnumC1252a;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.se */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3507se implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ EnumC1252a f19532f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3581ue f19533g;

    public RunnableC3507se(C3581ue c3581ue, EnumC1252a enumC1252a) {
        this.f19533g = c3581ue;
        this.f19532f = enumC1252a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f19533g.f20293a.mo6580Y(C2622l.m5355d0(this.f19532f));
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }
}
